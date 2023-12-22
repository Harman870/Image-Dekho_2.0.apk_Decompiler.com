package j9;

import androidx.activity.f;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class s {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f8959d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f8960e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f8961a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8962b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f8963c;

    public s(String str, String str2, @Nullable String str3) {
        this.f8961a = str;
        this.f8962b = str2;
        this.f8963c = str3;
    }

    public static s a(String str) {
        Matcher matcher = f8959d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f8960e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder g10 = f.g("Parameter is not formatted correctly: \"");
                    g10.append(str.substring(end));
                    g10.append("\" for: \"");
                    g10.append(str);
                    g10.append('\"');
                    throw new IllegalArgumentException(g10.toString());
                }
            }
            return new s(str, lowerCase, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f8961a.equals(this.f8961a);
    }

    public final int hashCode() {
        return this.f8961a.hashCode();
    }

    public final String toString() {
        return this.f8961a;
    }
}

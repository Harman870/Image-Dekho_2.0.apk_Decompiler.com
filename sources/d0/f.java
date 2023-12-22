package d0;

import android.os.LocaleList;
import java.util.Locale;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final f f6031b = new f(new h(b.a(new Locale[0])));

    /* renamed from: a  reason: collision with root package name */
    public final g f6032a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f6033a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z9;
            boolean z10;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f6033a;
            int length = localeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z9 = false;
                    break;
                } else if (localeArr[i10].equals(locale)) {
                    z9 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z9) {
                Locale[] localeArr2 = f6033a;
                int length2 = localeArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        z10 = false;
                        break;
                    } else if (localeArr2[i11].equals(locale2)) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (!z10) {
                    String c10 = f0.b.c(f0.b.a(f0.b.b(locale)));
                    if (!c10.isEmpty()) {
                        return c10.equals(f0.b.c(f0.b.a(f0.b.b(locale2))));
                    }
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public f(h hVar) {
        this.f6032a = hVar;
    }

    public static f a(String str) {
        if (str == null || str.isEmpty()) {
            return f6031b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return new f(new h(b.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && this.f6032a.equals(((f) obj).f6032a);
    }

    public final int hashCode() {
        return this.f6032a.hashCode();
    }

    public final String toString() {
        return this.f6032a.toString();
    }
}

package j9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import k9.e;
import n9.d;

public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f8909j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f8910l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f8911m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f8912a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8913b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8914c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8915d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8916e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8917f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8918g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8919h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8920i;

    public i(String str, String str2, long j10, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f8912a = str;
        this.f8913b = str2;
        this.f8914c = j10;
        this.f8915d = str3;
        this.f8916e = str4;
        this.f8917f = z9;
        this.f8918g = z10;
        this.f8920i = z11;
        this.f8919h = z12;
    }

    public static int a(int i10, int i11, String str, boolean z9) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z9)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static long b(int i10, String str) {
        int a10 = a(0, i10, str, false);
        Matcher matcher = f8911m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (a10 < i10) {
            int a11 = a(a10 + 1, i10, str, true);
            matcher.region(a10, a11);
            if (i12 == -1 && matcher.usePattern(f8911m).matches()) {
                i12 = Integer.parseInt(matcher.group(1));
                i15 = Integer.parseInt(matcher.group(2));
                i16 = Integer.parseInt(matcher.group(3));
            } else if (i13 != -1 || !matcher.usePattern(f8910l).matches()) {
                if (i14 == -1) {
                    Pattern pattern = k;
                    if (matcher.usePattern(pattern).matches()) {
                        i14 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i11 == -1 && matcher.usePattern(f8909j).matches()) {
                    i11 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i13 = Integer.parseInt(matcher.group(1));
            }
            a10 = a(a11 + 1, i10, str, false);
        }
        if (i11 >= 70 && i11 <= 99) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 <= 69) {
            i11 += 2000;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException();
        } else if (i14 == -1) {
            throw new IllegalArgumentException();
        } else if (i13 < 1 || i13 > 31) {
            throw new IllegalArgumentException();
        } else if (i12 < 0 || i12 > 23) {
            throw new IllegalArgumentException();
        } else if (i15 < 0 || i15 > 59) {
            throw new IllegalArgumentException();
        } else if (i16 < 0 || i16 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f9159h);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, i14 - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f8912a.equals(this.f8912a) && iVar.f8913b.equals(this.f8913b) && iVar.f8915d.equals(this.f8915d) && iVar.f8916e.equals(this.f8916e) && iVar.f8914c == this.f8914c && iVar.f8917f == this.f8917f && iVar.f8918g == this.f8918g && iVar.f8919h == this.f8919h && iVar.f8920i == this.f8920i;
    }

    public final int hashCode() {
        int hashCode = this.f8913b.hashCode();
        int hashCode2 = this.f8915d.hashCode();
        int hashCode3 = this.f8916e.hashCode();
        long j10 = this.f8914c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.f8912a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f8917f ^ true ? 1 : 0)) * 31) + (this.f8918g ^ true ? 1 : 0)) * 31) + (this.f8919h ^ true ? 1 : 0)) * 31) + (this.f8920i ^ true ? 1 : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8912a);
        sb.append('=');
        sb.append(this.f8913b);
        if (this.f8919h) {
            if (this.f8914c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = ((DateFormat) d.f10388a.get()).format(new Date(this.f8914c));
            }
            sb.append(str);
        }
        if (!this.f8920i) {
            sb.append("; domain=");
            sb.append(this.f8915d);
        }
        sb.append("; path=");
        sb.append(this.f8916e);
        if (this.f8917f) {
            sb.append("; secure");
        }
        if (this.f8918g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}

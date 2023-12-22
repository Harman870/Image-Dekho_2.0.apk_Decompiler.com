package r3;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f11594a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11595b;

    public h(String str, String str2) {
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f11594a = str;
            if (str2 == null || str2.length() <= 0) {
                this.f11595b = null;
            } else {
                this.f11595b = str2;
            }
        } else {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
    }
}

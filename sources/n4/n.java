package n4;

import r3.o;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f9973a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9974b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9975c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9976d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9977e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9978f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9979g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f9980h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f9981i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f9982j;
    public final Boolean k;

    public n(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l6, Long l10, Long l11, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        o.e(str);
        o.e(str2);
        boolean z9 = true;
        o.b(j15 >= 0);
        o.b(j16 >= 0);
        o.b(j17 >= 0);
        o.b(j18 < 0 ? false : z9);
        this.f9973a = str;
        this.f9974b = str2;
        this.f9975c = j15;
        this.f9976d = j16;
        this.f9977e = j17;
        this.f9978f = j13;
        this.f9979g = j18;
        this.f9980h = l6;
        this.f9981i = l10;
        this.f9982j = l11;
        this.k = bool;
    }

    public final n a(Long l6, Long l10, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new n(this.f9973a, this.f9974b, this.f9975c, this.f9976d, this.f9977e, this.f9978f, this.f9979g, this.f9980h, l6, l10, bool);
    }

    public final n b(long j10, long j11) {
        return new n(this.f9973a, this.f9974b, this.f9975c, this.f9976d, this.f9977e, this.f9978f, j10, Long.valueOf(j11), this.f9981i, this.f9982j, this.k);
    }
}

package androidx.appcompat.widget;

public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public int f691a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f692b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f693c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f694d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f695e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f696f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f697g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f698h = false;

    public final void a(int i10, int i11) {
        this.f693c = i10;
        this.f694d = i11;
        this.f698h = true;
        if (this.f697g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f691a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f692b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f691a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f692b = i11;
        }
    }
}

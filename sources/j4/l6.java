package j4;

import java.util.NoSuchElementException;

public final class l6 extends d6 {

    /* renamed from: b  reason: collision with root package name */
    public int f8313b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int f8314c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q6 f8315d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l6(q6 q6Var) {
        super(1);
        this.f8315d = q6Var;
        this.f8314c = q6Var.g();
    }

    public final byte a() {
        int i10 = this.f8313b;
        if (i10 < this.f8314c) {
            this.f8313b = i10 + 1;
            return this.f8315d.d(i10);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f8313b < this.f8314c;
    }
}

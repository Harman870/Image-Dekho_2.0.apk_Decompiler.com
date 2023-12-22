package a9;

import java.util.NoSuchElementException;
import p8.i;

public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final int f223a;

    /* renamed from: b  reason: collision with root package name */
    public final int f224b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f225c;

    /* renamed from: d  reason: collision with root package name */
    public int f226d;

    public b(int i10, int i11, int i12) {
        this.f223a = i12;
        this.f224b = i11;
        boolean z9 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z9 = false;
        }
        this.f225c = z9;
        this.f226d = !z9 ? i11 : i10;
    }

    public final boolean hasNext() {
        return this.f225c;
    }

    public final int nextInt() {
        int i10 = this.f226d;
        if (i10 != this.f224b) {
            this.f226d = this.f223a + i10;
        } else if (this.f225c) {
            this.f225c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }
}

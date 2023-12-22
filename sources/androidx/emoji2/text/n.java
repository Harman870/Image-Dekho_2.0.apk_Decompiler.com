package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import r0.b;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final b f1392a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1393b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1394c = new a(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f1395d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1396a;

        /* renamed from: b  reason: collision with root package name */
        public i f1397b;

        public a() {
            this(1);
        }

        public a(int i10) {
            this.f1396a = new SparseArray<>(i10);
        }

        public final void a(i iVar, int i10, int i11) {
            a aVar;
            int a10 = iVar.a(i10);
            SparseArray<a> sparseArray = this.f1396a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                this.f1396a.put(iVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(iVar, i10 + 1, i11);
            } else {
                aVar.f1397b = iVar;
            }
        }
    }

    public n(Typeface typeface, b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        this.f1395d = typeface;
        this.f1392a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f11455a;
            i10 = bVar.f11456b.getInt(bVar.f11456b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        this.f1393b = new char[(i10 * 2)];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f11455a;
            i11 = bVar.f11456b.getInt(bVar.f11456b.getInt(i14) + i14);
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            i iVar = new i(this, i15);
            r0.a c10 = iVar.c();
            int a12 = c10.a(4);
            if (a12 != 0) {
                i12 = c10.f11456b.getInt(a12 + c10.f11455a);
            } else {
                i12 = 0;
            }
            Character.toChars(i12, this.f1393b, i15 * 2);
            if (iVar.b() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            c6.b.l("invalid metadata codepoint length", z9);
            this.f1394c.a(iVar, 0, iVar.b() - 1);
        }
    }
}

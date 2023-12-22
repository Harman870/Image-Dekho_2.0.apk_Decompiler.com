package z0;

import a1.a;
import a1.b;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import m.i;
import m3.f;
import m3.u;
import z0.a;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final l f13124a;

    /* renamed from: b  reason: collision with root package name */
    public final c f13125b;

    public static class a<D> extends q<D> implements b.a<D> {

        /* renamed from: l  reason: collision with root package name */
        public final int f13126l = 0;

        /* renamed from: m  reason: collision with root package name */
        public final Bundle f13127m = null;

        /* renamed from: n  reason: collision with root package name */
        public final a1.b<D> f13128n;

        /* renamed from: o  reason: collision with root package name */
        public l f13129o;

        /* renamed from: p  reason: collision with root package name */
        public C0174b<D> f13130p;

        /* renamed from: q  reason: collision with root package name */
        public a1.b<D> f13131q;

        public a(f fVar) {
            this.f13128n = fVar;
            this.f13131q = null;
            if (fVar.f35b == null) {
                fVar.f35b = this;
                fVar.f34a = 0;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        public final void f() {
            a1.b<D> bVar = this.f13128n;
            bVar.f36c = true;
            bVar.f38e = false;
            bVar.f37d = false;
            f fVar = (f) bVar;
            fVar.f9363j.drainPermits();
            fVar.a();
            fVar.f30h = new a.C0000a();
            fVar.c();
        }

        public final void g() {
            this.f13128n.f36c = false;
        }

        public final void h(r<? super D> rVar) {
            super.h(rVar);
            this.f13129o = null;
            this.f13130p = null;
        }

        public final void i(D d10) {
            super.i(d10);
            a1.b<D> bVar = this.f13131q;
            if (bVar != null) {
                bVar.f38e = true;
                bVar.f36c = false;
                bVar.f37d = false;
                bVar.f39f = false;
                this.f13131q = null;
            }
        }

        public final void j() {
            l lVar = this.f13129o;
            C0174b<D> bVar = this.f13130p;
            if (lVar != null && bVar != null) {
                super.h(bVar);
                d(lVar, bVar);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f13126l);
            sb.append(" : ");
            y3.a.e(this.f13128n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: z0.b$b  reason: collision with other inner class name */
    public static class C0174b<D> implements r<D> {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0173a<D> f13132a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13133b = false;

        public C0174b(a1.b bVar, u uVar) {
            this.f13132a = uVar;
        }

        public final void a(D d10) {
            u uVar = (u) this.f13132a;
            uVar.getClass();
            Void voidR = (Void) d10;
            SignInHubActivity signInHubActivity = uVar.f9371a;
            signInHubActivity.setResult(signInHubActivity.f2800z, signInHubActivity.A);
            uVar.f9371a.finish();
            this.f13133b = true;
        }

        public final String toString() {
            return this.f13132a.toString();
        }
    }

    public static class c extends b0 {

        /* renamed from: e  reason: collision with root package name */
        public static final a f13134e = new a();

        /* renamed from: c  reason: collision with root package name */
        public i<a> f13135c = new i<>();

        /* renamed from: d  reason: collision with root package name */
        public boolean f13136d = false;

        public static class a implements d0.a {
            public final <T extends b0> T a(Class<T> cls) {
                return new c();
            }
        }

        public final void a() {
            int g10 = this.f13135c.g();
            int i10 = 0;
            while (i10 < g10) {
                a h10 = this.f13135c.h(i10);
                h10.f13128n.a();
                h10.f13128n.f37d = true;
                C0174b<D> bVar = h10.f13130p;
                if (bVar != null) {
                    h10.h(bVar);
                    if (bVar.f13133b) {
                        bVar.f13132a.getClass();
                    }
                }
                a1.b<D> bVar2 = h10.f13128n;
                b.a<D> aVar = bVar2.f35b;
                if (aVar == null) {
                    throw new IllegalStateException("No listener register");
                } else if (aVar == h10) {
                    bVar2.f35b = null;
                    bVar2.f38e = true;
                    bVar2.f36c = false;
                    bVar2.f37d = false;
                    bVar2.f39f = false;
                    i10++;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            }
            i<a> iVar = this.f13135c;
            int i11 = iVar.f9306d;
            Object[] objArr = iVar.f9305c;
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = null;
            }
            iVar.f9306d = 0;
            iVar.f9303a = false;
        }
    }

    public b(l lVar, e0 e0Var) {
        this.f13124a = lVar;
        this.f13125b = (c) new d0(e0Var, c.f13134e).a(c.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        boolean z9;
        c cVar = this.f13125b;
        if (cVar.f13135c.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < cVar.f13135c.g(); i10++) {
                a h10 = cVar.f13135c.h(i10);
                printWriter.print(str);
                printWriter.print("  #");
                i<a> iVar = cVar.f13135c;
                if (iVar.f9303a) {
                    iVar.d();
                }
                printWriter.print(iVar.f9304b[i10]);
                printWriter.print(": ");
                printWriter.println(h10.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(h10.f13126l);
                printWriter.print(" mArgs=");
                printWriter.println(h10.f13127m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(h10.f13128n);
                a1.b<D> bVar = h10.f13128n;
                String g10 = com.ironsource.adapters.ironsource.a.g(str2, "  ");
                a1.a aVar = (a1.a) bVar;
                aVar.getClass();
                printWriter.print(g10);
                printWriter.print("mId=");
                printWriter.print(aVar.f34a);
                printWriter.print(" mListener=");
                printWriter.println(aVar.f35b);
                if (aVar.f36c || aVar.f39f) {
                    printWriter.print(g10);
                    printWriter.print("mStarted=");
                    printWriter.print(aVar.f36c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aVar.f39f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aVar.f37d || aVar.f38e) {
                    printWriter.print(g10);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aVar.f37d);
                    printWriter.print(" mReset=");
                    printWriter.println(aVar.f38e);
                }
                if (aVar.f30h != null) {
                    printWriter.print(g10);
                    printWriter.print("mTask=");
                    printWriter.print(aVar.f30h);
                    printWriter.print(" waiting=");
                    aVar.f30h.getClass();
                    printWriter.println(false);
                }
                if (aVar.f31i != null) {
                    printWriter.print(g10);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aVar.f31i);
                    printWriter.print(" waiting=");
                    aVar.f31i.getClass();
                    printWriter.println(false);
                }
                if (h10.f13130p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(h10.f13130p);
                    C0174b<D> bVar2 = h10.f13130p;
                    bVar2.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar2.f13133b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                a1.b<D> bVar3 = h10.f13128n;
                Object obj = h10.f1690e;
                if (obj == LiveData.k) {
                    obj = null;
                }
                bVar3.getClass();
                StringBuilder sb = new StringBuilder(64);
                y3.a.e(obj, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (h10.f1688c > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                printWriter.println(z9);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        y3.a.e(this.f13124a, sb);
        sb.append("}}");
        return sb.toString();
    }
}

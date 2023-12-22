package androidx.activity.result;

import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import androidx.activity.f;
import androidx.appcompat.widget.l;
import androidx.lifecycle.c0;
import i4.af;
import i4.fg;
import i4.g;
import i4.h6;
import i4.k;
import i4.ng;
import i4.p;
import i4.ve;
import i4.xe;
import java.lang.reflect.Modifier;
import java.util.List;
import k7.a;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static a.C0110a f290a;

    public /* synthetic */ c() {
    }

    public static void d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder g10 = f.g("Interface can't be instantiated! Interface name: ");
            g10.append(cls.getName());
            throw new UnsupportedOperationException(g10.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder g11 = f.g("Abstract class can't be instantiated! Class name: ");
            g11.append(cls.getName());
            throw new UnsupportedOperationException(g11.toString());
        }
    }

    public abstract List f(String str, List list);

    public abstract Path g(float f10, float f11, float f12, float f13);

    public abstract Object h(Class cls);

    public abstract View i(int i10);

    public abstract com.google.android.material.carousel.a j(z4.a aVar, View view);

    public abstract void k(int i10);

    public abstract void l(Typeface typeface, boolean z9);

    public abstract boolean m();

    public abstract c0 n();

    public abstract void q(byte[] bArr, int i10);

    public abstract boolean s(char c10);

    public abstract void t(ng ngVar, l lVar);

    public abstract void u(h6 h6Var, fg fgVar);

    public abstract void v(af afVar, fg fgVar);

    public abstract void w(g gVar, xe xeVar);

    public abstract void x(k kVar, fg fgVar);

    public abstract void y(c2.c cVar, ve veVar);

    public abstract void z(p pVar, fg fgVar);

    public /* synthetic */ c(int i10) {
    }
}

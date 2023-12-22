package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import d.i;

public abstract class a {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    public static class C0073a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f5858a = 8388627;

        public C0073a() {
            super(-2, -2);
        }

        public C0073a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y3.a.f13025f);
            this.f5858a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0073a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0073a(C0073a aVar) {
            super(aVar);
            this.f5858a = aVar.f5858a;
        }
    }

    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z9);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public void h() {
    }

    public abstract boolean i(int i10, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z9);

    public abstract void m(int i10);

    public abstract void n(f.b bVar);

    public abstract void o(boolean z9);

    public abstract void p(CharSequence charSequence);

    public g.a q(i.e eVar) {
        return null;
    }
}

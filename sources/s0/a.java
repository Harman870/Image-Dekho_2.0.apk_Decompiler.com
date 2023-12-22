package s0;

import android.widget.EditText;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0138a f11800a;

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    public static class C0138a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f11801a;

        /* renamed from: b  reason: collision with root package name */
        public final g f11802b;

        public C0138a(EditText editText) {
            this.f11801a = editText;
            g gVar = new g(editText);
            this.f11802b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.f11804b == null) {
                synchronized (b.f11803a) {
                    if (b.f11804b == null) {
                        b.f11804b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.f11804b);
        }
    }

    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f11800a = new C0138a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}

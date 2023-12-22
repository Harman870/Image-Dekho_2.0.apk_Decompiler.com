package s0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f11803a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f11804b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f11805c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f11805c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f11805c;
        if (cls != null) {
            return new o(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}

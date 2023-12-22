package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.f;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.h;

public class q {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f5946b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f5947c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5948d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f5949e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f5950f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f5951g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final h<String, Constructor<? extends View>> f5952h = new h<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f5953a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f5954a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5955b;

        /* renamed from: c  reason: collision with root package name */
        public Method f5956c;

        /* renamed from: d  reason: collision with root package name */
        public Context f5957d;

        public a(View view, String str) {
            this.f5954a = view;
            this.f5955b = str;
        }

        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f5956c == null) {
                Context context = this.f5954a.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f5955b, new Class[]{View.class})) != null) {
                            this.f5956c = method;
                            this.f5957d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                }
                int id = this.f5954a.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder g10 = f.g(" with id '");
                    g10.append(this.f5954a.getContext().getResources().getResourceEntryName(id));
                    g10.append("'");
                    str = g10.toString();
                }
                StringBuilder g11 = f.g("Could not find method ");
                g11.append(this.f5955b);
                g11.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                g11.append(this.f5954a.getClass());
                g11.append(str);
                throw new IllegalStateException(g11.toString());
            }
            try {
                this.f5956c.invoke(this.f5957d, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public d a(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public androidx.appcompat.widget.f c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public t d(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public i0 e(Context context, AttributeSet attributeSet) {
        return new i0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        h<String, Constructor<? extends View>> hVar = f5952h;
        Constructor<? extends U> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f5946b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f5953a);
    }
}

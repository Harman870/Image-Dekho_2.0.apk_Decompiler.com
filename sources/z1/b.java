package z1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import e.a;
import g.c;
import y.a;
import z.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f13142a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f13142a) {
                if (theme != null) {
                    context3 = new c(context2, theme);
                } else {
                    context3 = context2;
                }
                return a.a(context3, i10);
            }
        } catch (NoClassDefFoundError unused) {
            f13142a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = y.a.f13006a;
                return a.b.b(context2, i10);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f13098a;
        return f.a.a(resources, i10, theme);
    }
}

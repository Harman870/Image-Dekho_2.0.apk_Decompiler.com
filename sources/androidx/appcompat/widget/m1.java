package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

public final class m1 {

    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        o1 o1Var = o1.k;
        if (o1Var != null && o1Var.f879a == view) {
            o1.b((o1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            o1 o1Var2 = o1.f878l;
            if (o1Var2 != null && o1Var2.f879a == view) {
                o1Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new o1(view, charSequence);
    }
}

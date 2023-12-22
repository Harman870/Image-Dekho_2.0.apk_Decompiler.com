package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.imgdkh.app.R;

public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f910a;

    /* renamed from: b  reason: collision with root package name */
    public final View f911b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f912c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f913d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f914e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f915f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f916g = new int[2];

    public p1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f913d = layoutParams;
        this.f910a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f911b = inflate;
        this.f912c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(p1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = com.ironsource.sdk.mediation.R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}

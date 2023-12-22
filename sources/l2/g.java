package l2;

import android.content.Context;
import com.developer.progressx.ProgressWheel;
import com.imgdkh.app.R;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public ProgressWheel f9234a;

    /* renamed from: b  reason: collision with root package name */
    public float f9235b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public int f9236c;

    /* renamed from: d  reason: collision with root package name */
    public int f9237d;

    /* renamed from: e  reason: collision with root package name */
    public int f9238e;

    public g(Context context) {
        this.f9236c = context.getResources().getDimensionPixelSize(R.dimen.common_circle_width) + 1;
        this.f9237d = context.getResources().getColor(R.color.success_stroke_color, context.getTheme());
        this.f9238e = context.getResources().getDimensionPixelOffset(R.dimen.progress_circle_radius);
    }
}

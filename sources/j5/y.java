package j5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class y extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public int f8715a;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8715a = getVisibility();
    }

    public final void b(int i10, boolean z9) {
        super.setVisibility(i10);
        if (z9) {
            this.f8715a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f8715a;
    }

    public void setVisibility(int i10) {
        b(i10, true);
    }
}

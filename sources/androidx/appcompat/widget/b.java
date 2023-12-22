package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f699a;

    public b(ActionBarContainer actionBarContainer) {
        this.f699a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f699a;
        if (actionBarContainer.f527h) {
            Drawable drawable = actionBarContainer.f526g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f524e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f699a;
        Drawable drawable3 = actionBarContainer2.f525f;
        if (drawable3 != null && actionBarContainer2.f528i) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f699a;
        if (!actionBarContainer.f527h) {
            drawable = actionBarContainer.f524e;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f526g != null) {
            drawable = actionBarContainer.f524e;
        } else {
            return;
        }
        drawable.getOutline(outline);
    }

    public final void setAlpha(int i10) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

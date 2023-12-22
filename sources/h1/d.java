package h1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b0.a;
import h1.g;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import z.f;
import z.k;

public final class d extends f implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    public b f6803b;

    /* renamed from: c  reason: collision with root package name */
    public Context f6804c;

    /* renamed from: d  reason: collision with root package name */
    public e f6805d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c> f6806e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6807f;

    public class a implements Drawable.Callback {
        public a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            d.this.scheduleSelf(runnable, j10);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public g f6809a;

        /* renamed from: b  reason: collision with root package name */
        public AnimatorSet f6810b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Animator> f6811c;

        /* renamed from: d  reason: collision with root package name */
        public m.b<Animator, String> f6812d;

        public b(a aVar) {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f6813a;

        public c(Drawable.ConstantState constantState) {
            this.f6813a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f6813a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f6813a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f6813a.newDrawable();
            dVar.f6815a = newDrawable;
            newDrawable.setCallback(dVar.f6807f);
            return dVar;
        }

        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f6813a.newDrawable(resources);
            dVar.f6815a = newDrawable;
            newDrawable.setCallback(dVar.f6807f);
            return dVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f6813a.newDrawable(resources, theme);
            dVar.f6815a = newDrawable;
            newDrawable.setCallback(dVar.f6807f);
            return dVar;
        }
    }

    public d() {
        this((Context) null);
    }

    public d(Context context) {
        this.f6805d = null;
        this.f6806e = null;
        a aVar = new a();
        this.f6807f = aVar;
        this.f6804c = context;
        this.f6803b = new b(aVar);
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6803b.f6809a.draw(canvas);
        if (this.f6803b.f6810b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return a.C0017a.a(drawable);
        }
        return this.f6803b.f6809a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f6803b.getClass();
        return changingConfigurations | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f6803b.f6809a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f6815a != null) {
            return new c(this.f6815a.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6803b.f6809a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6803b.f6809a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.getOpacity() : this.f6803b.f6809a.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            a.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArray = k.e(resources, theme, attributeSet, a.f6799e);
                    int resourceId = typedArray.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVar = new g();
                        ThreadLocal<TypedValue> threadLocal = f.f13098a;
                        gVar.f6815a = f.a.a(resources, resourceId, theme);
                        new g.h(gVar.f6815a.getConstantState());
                        gVar.f6821f = false;
                        gVar.setCallback(this.f6807f);
                        g gVar2 = this.f6803b.f6809a;
                        if (gVar2 != null) {
                            gVar2.setCallback((Drawable.Callback) null);
                        }
                        this.f6803b.f6809a = gVar;
                    }
                } else if ("target".equals(name)) {
                    typedArray = resources.obtainAttributes(attributeSet, a.f6800f);
                    String string = typedArray.getString(0);
                    int resourceId2 = typedArray.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6804c;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(this.f6803b.f6809a.f6817b.f6866b.f6864o.getOrDefault(string, null));
                            b bVar = this.f6803b;
                            if (bVar.f6811c == null) {
                                bVar.f6811c = new ArrayList<>();
                                this.f6803b.f6812d = new m.b<>();
                            }
                            this.f6803b.f6811c.add(loadAnimator);
                            this.f6803b.f6812d.put(loadAnimator, string);
                        } else {
                            typedArray.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                typedArray.recycle();
            }
            eventType = xmlPullParser.next();
        }
        b bVar2 = this.f6803b;
        if (bVar2.f6810b == null) {
            bVar2.f6810b = new AnimatorSet();
        }
        bVar2.f6810b.playTogether(bVar2.f6811c);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return a.C0017a.d(drawable);
        }
        return this.f6803b.f6809a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f6815a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6803b.f6810b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.isStateful() : this.f6803b.f6809a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6803b.f6809a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.setLevel(i10) : this.f6803b.f6809a.setLevel(i10);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.setState(iArr) : this.f6803b.f6809a.setState(iArr);
    }

    public final void setAlpha(int i10) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f6803b.f6809a.setAlpha(i10);
        }
    }

    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            a.C0017a.e(drawable, z9);
        } else {
            this.f6803b.f6809a.setAutoMirrored(z9);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6803b.f6809a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i10) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            b0.a.a(drawable, i10);
        } else {
            this.f6803b.f6809a.setTint(i10);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            b0.a.b(drawable, colorStateList);
        } else {
            this.f6803b.f6809a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            b0.a.c(drawable, mode);
        } else {
            this.f6803b.f6809a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f6803b.f6809a.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    public final void start() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f6803b.f6810b.isStarted()) {
            this.f6803b.f6810b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6803b.f6810b.end();
        }
    }
}

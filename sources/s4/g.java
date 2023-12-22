package s4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.f;
import java.util.ArrayList;
import m.h;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final h<String, h> f11867a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final h<String, PropertyValuesHolder[]> f11868b = new h<>();

    public static g a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            StringBuilder g10 = f.g("Can't load animation resource ID #0x");
            g10.append(Integer.toHexString(i10));
            Log.w("MotionSpec", g10.toString(), e10);
            return null;
        }
    }

    public static g c(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f11868b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f11856b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f11857c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f11858d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f11872d = objectAnimator.getRepeatCount();
                hVar.f11873e = objectAnimator.getRepeatMode();
                gVar.f11867a.put(propertyName, hVar);
                i10++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h d(String str) {
        boolean z9;
        if (this.f11867a.getOrDefault(str, null) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return this.f11867a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f11867a.equals(((g) obj).f11867a);
    }

    public final int hashCode() {
        return this.f11867a.hashCode();
    }

    public final String toString() {
        return 10 + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f11867a + "}\n";
    }
}

package s4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public long f11869a;

    /* renamed from: b  reason: collision with root package name */
    public long f11870b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f11871c;

    /* renamed from: d  reason: collision with root package name */
    public int f11872d;

    /* renamed from: e  reason: collision with root package name */
    public int f11873e;

    public h(long j10) {
        this.f11871c = null;
        this.f11872d = 0;
        this.f11873e = 1;
        this.f11869a = j10;
        this.f11870b = 150;
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f11872d = 0;
        this.f11873e = 1;
        this.f11869a = j10;
        this.f11870b = j11;
        this.f11871c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f11869a);
        animator.setDuration(this.f11870b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f11872d);
            valueAnimator.setRepeatMode(this.f11873e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f11871c;
        return timeInterpolator != null ? timeInterpolator : a.f11856b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f11869a == hVar.f11869a && this.f11870b == hVar.f11870b && this.f11872d == hVar.f11872d && this.f11873e == hVar.f11873e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11869a;
        long j11 = this.f11870b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f11872d) * 31) + this.f11873e;
    }

    public final String toString() {
        return 10 + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f11869a + " duration: " + this.f11870b + " interpolator: " + b().getClass() + " repeatCount: " + this.f11872d + " repeatMode: " + this.f11873e + "}\n";
    }
}

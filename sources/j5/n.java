package j5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f8684a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f8685b = null;

    /* renamed from: c  reason: collision with root package name */
    public final a f8686c = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            n nVar = n.this;
            if (nVar.f8685b == animator) {
                nVar.f8685b = null;
            }
        }
    }

    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f8686c);
        this.f8684a.add(bVar);
    }
}

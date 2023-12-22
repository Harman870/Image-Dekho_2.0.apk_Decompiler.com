package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.activity.f;
import com.imgdkh.app.R;
import h0.s0;
import h0.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public e f6715a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a0.b f6716a;

        /* renamed from: b  reason: collision with root package name */
        public final a0.b f6717b;

        public a(a0.b bVar, a0.b bVar2) {
            this.f6716a = bVar;
            this.f6717b = bVar2;
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f6716a = d.g(bounds);
            this.f6717b = d.f(bounds);
        }

        public final String toString() {
            StringBuilder g10 = f.g("Bounds{lower=");
            g10.append(this.f6716a);
            g10.append(" upper=");
            g10.append(this.f6717b);
            g10.append("}");
            return g10.toString();
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f6718a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6719b = 0;

        public abstract s0 a(s0 s0Var, List<r0> list);
    }

    public static class c extends e {

        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public final b f6720a;

            /* renamed from: b  reason: collision with root package name */
            public s0 f6721b;

            /* renamed from: h0.r0$c$a$a  reason: collision with other inner class name */
            public class C0091a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ r0 f6722a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ s0 f6723b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ s0 f6724c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ int f6725d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ View f6726e;

                public C0091a(r0 r0Var, s0 s0Var, s0 s0Var2, int i10, View view) {
                    this.f6722a = r0Var;
                    this.f6723b = s0Var;
                    this.f6724c = s0Var2;
                    this.f6725d = i10;
                    this.f6726e = view;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    s0.e eVar;
                    s0 s0Var;
                    s0 s0Var2;
                    float f10;
                    a0.b bVar;
                    r0 r0Var = this.f6722a;
                    r0Var.f6715a.d(valueAnimator.getAnimatedFraction());
                    s0 s0Var3 = this.f6723b;
                    s0 s0Var4 = this.f6724c;
                    float b10 = this.f6722a.f6715a.b();
                    int i10 = this.f6725d;
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        eVar = new s0.d(s0Var3);
                    } else if (i11 >= 29) {
                        eVar = new s0.c(s0Var3);
                    } else {
                        eVar = new s0.b(s0Var3);
                    }
                    int i12 = 1;
                    while (i12 <= 256) {
                        if ((i10 & i12) == 0) {
                            bVar = s0Var3.a(i12);
                            s0Var2 = s0Var3;
                            s0Var = s0Var4;
                            f10 = b10;
                        } else {
                            a0.b a10 = s0Var3.a(i12);
                            a0.b a11 = s0Var4.a(i12);
                            float f11 = 1.0f - b10;
                            s0Var2 = s0Var3;
                            s0Var = s0Var4;
                            f10 = b10;
                            bVar = s0.f(a10, (int) (((double) (((float) (a10.f4a - a11.f4a)) * f11)) + 0.5d), (int) (((double) (((float) (a10.f5b - a11.f5b)) * f11)) + 0.5d), (int) (((double) (((float) (a10.f6c - a11.f6c)) * f11)) + 0.5d), (int) (((double) (((float) (a10.f7d - a11.f7d)) * f11)) + 0.5d));
                        }
                        eVar.c(i12, bVar);
                        i12 <<= 1;
                        s0Var4 = s0Var;
                        b10 = f10;
                        s0Var3 = s0Var2;
                    }
                    c.g(this.f6726e, eVar.b(), Collections.singletonList(this.f6722a));
                }
            }

            public class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ r0 f6727a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f6728b;

                public b(r0 r0Var, View view) {
                    this.f6727a = r0Var;
                    this.f6728b = view;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f6727a.f6715a.d(1.0f);
                    c.e(this.f6728b, this.f6727a);
                }
            }

            /* renamed from: h0.r0$c$a$c  reason: collision with other inner class name */
            public class C0092c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ View f6729a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ r0 f6730b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f6731c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f6732d;

                public C0092c(View view, r0 r0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f6729a = view;
                    this.f6730b = r0Var;
                    this.f6731c = aVar;
                    this.f6732d = valueAnimator;
                }

                public final void run() {
                    c.h(this.f6729a, this.f6730b, this.f6731c);
                    this.f6732d.start();
                }
            }

            public a(View view, w4.d dVar) {
                s0 s0Var;
                s0.e eVar;
                this.f6720a = dVar;
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                s0 a10 = y.j.a(view);
                if (a10 != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        eVar = new s0.d(a10);
                    } else if (i10 >= 29) {
                        eVar = new s0.c(a10);
                    } else {
                        eVar = new s0.b(a10);
                    }
                    s0Var = eVar.b();
                } else {
                    s0Var = null;
                }
                this.f6721b = s0Var;
            }

            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f6721b = s0.i(view, windowInsets);
                } else {
                    s0 i10 = s0.i(view, windowInsets);
                    if (this.f6721b == null) {
                        WeakHashMap<View, l0> weakHashMap = y.f6776a;
                        this.f6721b = y.j.a(view);
                    }
                    if (this.f6721b != null) {
                        b j10 = c.j(view);
                        if (j10 != null && Objects.equals(j10.f6718a, windowInsets)) {
                            return c.i(view, windowInsets);
                        }
                        s0 s0Var = this.f6721b;
                        int i11 = 0;
                        for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                            if (!i10.a(i12).equals(s0Var.a(i12))) {
                                i11 |= i12;
                            }
                        }
                        if (i11 == 0) {
                            return c.i(view, windowInsets);
                        }
                        s0 s0Var2 = this.f6721b;
                        r0 r0Var = new r0(i11, new DecelerateInterpolator(), 160);
                        r0Var.f6715a.d(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(r0Var.f6715a.a());
                        a0.b a10 = i10.a(i11);
                        a0.b a11 = s0Var2.a(i11);
                        a aVar = new a(a0.b.b(Math.min(a10.f4a, a11.f4a), Math.min(a10.f5b, a11.f5b), Math.min(a10.f6c, a11.f6c), Math.min(a10.f7d, a11.f7d)), a0.b.b(Math.max(a10.f4a, a11.f4a), Math.max(a10.f5b, a11.f5b), Math.max(a10.f6c, a11.f6c), Math.max(a10.f7d, a11.f7d)));
                        c.f(view, r0Var, windowInsets, false);
                        duration.addUpdateListener(new C0091a(r0Var, i10, s0Var2, i11, view));
                        duration.addListener(new b(r0Var, view));
                        t.a(view, new C0092c(view, r0Var, aVar, duration));
                    }
                    this.f6721b = i10;
                }
                return c.i(view, windowInsets);
            }
        }

        public c(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
            super(i10, decelerateInterpolator, j10);
        }

        public static void e(View view, r0 r0Var) {
            b j10 = j(view);
            if (j10 != null) {
                ((w4.d) j10).f12755c.setTranslationY(0.0f);
                if (j10.f6719b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    e(viewGroup.getChildAt(i10), r0Var);
                }
            }
        }

        public static void f(View view, r0 r0Var, WindowInsets windowInsets, boolean z9) {
            b j10 = j(view);
            if (j10 != null) {
                j10.f6718a = windowInsets;
                if (!z9) {
                    w4.d dVar = (w4.d) j10;
                    dVar.f12755c.getLocationOnScreen(dVar.f12758f);
                    dVar.f12756d = dVar.f12758f[1];
                    if (j10.f6719b == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), r0Var, windowInsets, z9);
                }
            }
        }

        public static void g(View view, s0 s0Var, List<r0> list) {
            b j10 = j(view);
            if (j10 != null) {
                j10.a(s0Var, list);
                if (j10.f6719b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    g(viewGroup.getChildAt(i10), s0Var, list);
                }
            }
        }

        public static void h(View view, r0 r0Var, a aVar) {
            b j10 = j(view);
            if (j10 != null) {
                w4.d dVar = (w4.d) j10;
                dVar.f12755c.getLocationOnScreen(dVar.f12758f);
                int i10 = dVar.f12756d - dVar.f12758f[1];
                dVar.f12757e = i10;
                dVar.f12755c.setTranslationY((float) i10);
                if (j10.f6719b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    h(viewGroup.getChildAt(i11), r0Var, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f6720a;
            }
            return null;
        }
    }

    public static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        public final WindowInsetsAnimation f6733e;

        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final b f6734a;

            /* renamed from: b  reason: collision with root package name */
            public List<r0> f6735b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList<r0> f6736c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, r0> f6737d = new HashMap<>();

            public a(w4.d dVar) {
                super(dVar.f6719b);
                this.f6734a = dVar;
            }

            public final r0 a(WindowInsetsAnimation windowInsetsAnimation) {
                r0 r0Var = this.f6737d.get(windowInsetsAnimation);
                if (r0Var == null) {
                    r0Var = new r0(0, (DecelerateInterpolator) null, 0);
                    if (Build.VERSION.SDK_INT >= 30) {
                        r0Var.f6715a = new d(windowInsetsAnimation);
                    }
                    this.f6737d.put(windowInsetsAnimation, r0Var);
                }
                return r0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f6734a;
                a(windowInsetsAnimation);
                ((w4.d) bVar).f12755c.setTranslationY(0.0f);
                this.f6737d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f6734a;
                a(windowInsetsAnimation);
                w4.d dVar = (w4.d) bVar;
                dVar.f12755c.getLocationOnScreen(dVar.f12758f);
                dVar.f12756d = dVar.f12758f[1];
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<r0> arrayList = this.f6736c;
                if (arrayList == null) {
                    ArrayList<r0> arrayList2 = new ArrayList<>(list.size());
                    this.f6736c = arrayList2;
                    this.f6735b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                        r0 a10 = a(windowInsetsAnimation);
                        a10.f6715a.d(windowInsetsAnimation.getFraction());
                        this.f6736c.add(a10);
                    } else {
                        b bVar = this.f6734a;
                        s0 i10 = s0.i((View) null, windowInsets);
                        bVar.a(i10, this.f6735b);
                        return i10.h();
                    }
                }
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                b bVar = this.f6734a;
                a(windowInsetsAnimation);
                a aVar = new a(bounds);
                w4.d dVar = (w4.d) bVar;
                dVar.f12755c.getLocationOnScreen(dVar.f12758f);
                int i10 = dVar.f12756d - dVar.f12758f[1];
                dVar.f12757e = i10;
                dVar.f12755c.setTranslationY((float) i10);
                return d.e(aVar);
            }
        }

        public d(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
            this(new WindowInsetsAnimation(i10, decelerateInterpolator, j10));
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (DecelerateInterpolator) null, 0);
            this.f6733e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.f6716a.d(), aVar.f6717b.d());
        }

        public static a0.b f(WindowInsetsAnimation.Bounds bounds) {
            return a0.b.c(bounds.getUpperBound());
        }

        public static a0.b g(WindowInsetsAnimation.Bounds bounds) {
            return a0.b.c(bounds.getLowerBound());
        }

        public final long a() {
            return this.f6733e.getDurationMillis();
        }

        public final float b() {
            return this.f6733e.getInterpolatedFraction();
        }

        public final int c() {
            return this.f6733e.getTypeMask();
        }

        public final void d(float f10) {
            this.f6733e.setFraction(f10);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f6738a;

        /* renamed from: b  reason: collision with root package name */
        public float f6739b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f6740c;

        /* renamed from: d  reason: collision with root package name */
        public final long f6741d;

        public e(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
            this.f6738a = i10;
            this.f6740c = decelerateInterpolator;
            this.f6741d = j10;
        }

        public long a() {
            return this.f6741d;
        }

        public float b() {
            Interpolator interpolator = this.f6740c;
            return interpolator != null ? interpolator.getInterpolation(this.f6739b) : this.f6739b;
        }

        public int c() {
            return this.f6738a;
        }

        public void d(float f10) {
            this.f6739b = f10;
        }
    }

    public r0(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
        this.f6715a = Build.VERSION.SDK_INT >= 30 ? new d(i10, decelerateInterpolator, j10) : new c(i10, decelerateInterpolator, j10);
    }
}

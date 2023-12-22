package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.activity.i;
import com.imgdkh.app.R;
import h0.g0;
import h0.l0;
import h0.y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class o1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static o1 k;

    /* renamed from: l  reason: collision with root package name */
    public static o1 f878l;

    /* renamed from: a  reason: collision with root package name */
    public final View f879a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f880b;

    /* renamed from: c  reason: collision with root package name */
    public final int f881c;

    /* renamed from: d  reason: collision with root package name */
    public final n1 f882d = new n1(0, this);

    /* renamed from: e  reason: collision with root package name */
    public final i f883e = new i(2, this);

    /* renamed from: f  reason: collision with root package name */
    public int f884f;

    /* renamed from: g  reason: collision with root package name */
    public int f885g;

    /* renamed from: h  reason: collision with root package name */
    public p1 f886h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f887i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f888j;

    public o1(View view, CharSequence charSequence) {
        int i10;
        this.f879a = view;
        this.f880b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = g0.f6700a;
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = g0.b.a(viewConfiguration);
        } else {
            i10 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f881c = i10;
        this.f888j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(o1 o1Var) {
        o1 o1Var2 = k;
        if (o1Var2 != null) {
            o1Var2.f879a.removeCallbacks(o1Var2.f882d);
        }
        k = o1Var;
        if (o1Var != null) {
            o1Var.f879a.postDelayed(o1Var.f882d, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z9;
        if (f878l == this) {
            f878l = null;
            p1 p1Var = this.f886h;
            if (p1Var != null) {
                if (p1Var.f911b.getParent() != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    ((WindowManager) p1Var.f910a.getSystemService("window")).removeView(p1Var.f911b);
                }
                this.f886h = null;
                this.f888j = true;
                this.f879a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            b((o1) null);
        }
        this.f879a.removeCallbacks(this.f883e);
    }

    public final void c(boolean z9) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j10;
        long j11;
        int i13;
        boolean z11;
        View view = this.f879a;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.g.b(view)) {
            b((o1) null);
            o1 o1Var = f878l;
            if (o1Var != null) {
                o1Var.a();
            }
            f878l = this;
            this.f887i = z9;
            p1 p1Var = new p1(this.f879a.getContext());
            this.f886h = p1Var;
            View view2 = this.f879a;
            int i14 = this.f884f;
            int i15 = this.f885g;
            boolean z12 = this.f887i;
            CharSequence charSequence = this.f880b;
            if (p1Var.f911b.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (p1Var.f911b.getParent() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ((WindowManager) p1Var.f910a.getSystemService("window")).removeView(p1Var.f911b);
                }
            }
            p1Var.f912c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = p1Var.f913d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = p1Var.f910a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i14 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = p1Var.f910a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i10 = i15 + dimensionPixelOffset2;
                i11 = i15 - dimensionPixelOffset2;
            } else {
                i10 = view2.getHeight();
                i11 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = p1Var.f910a.getResources();
            if (z12) {
                i12 = R.dimen.tooltip_y_offset_touch;
            } else {
                i12 = R.dimen.tooltip_y_offset_non_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i12);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(p1Var.f914e);
                Rect rect = p1Var.f914e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources2 = p1Var.f910a.getResources();
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i13 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i13 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    p1Var.f914e.set(0, i13, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(p1Var.f916g);
                view2.getLocationOnScreen(p1Var.f915f);
                int[] iArr = p1Var.f915f;
                int i16 = iArr[0];
                int[] iArr2 = p1Var.f916g;
                int i17 = i16 - iArr2[0];
                iArr[0] = i17;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i17 + i14) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                p1Var.f911b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = p1Var.f911b.getMeasuredHeight();
                int i18 = p1Var.f915f[1];
                int i19 = ((i11 + i18) - dimensionPixelOffset3) - measuredHeight;
                int i20 = i18 + i10 + dimensionPixelOffset3;
                if (!z12 ? measuredHeight + i20 > p1Var.f914e.height() : i19 >= 0) {
                    layoutParams.y = i19;
                } else {
                    layoutParams.y = i20;
                }
            }
            ((WindowManager) p1Var.f910a.getSystemService("window")).addView(p1Var.f911b, p1Var.f913d);
            this.f879a.addOnAttachStateChangeListener(this);
            if (this.f887i) {
                j10 = 2500;
            } else {
                if ((y.d.g(this.f879a) & 1) == 1) {
                    j11 = 3000;
                } else {
                    j11 = 15000;
                }
                j10 = j11 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f879a.removeCallbacks(this.f883e);
            this.f879a.postDelayed(this.f883e, j10);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f886h != null && this.f887i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f879a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action != 7) {
            if (action == 10) {
                this.f888j = true;
                a();
            }
        } else if (this.f879a.isEnabled() && this.f886h == null) {
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (this.f888j || Math.abs(x9 - this.f884f) > this.f881c || Math.abs(y9 - this.f885g) > this.f881c) {
                this.f884f = x9;
                this.f885g = y9;
                this.f888j = false;
            } else {
                z9 = false;
            }
            if (z9) {
                b(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f884f = view.getWidth() / 2;
        this.f885g = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}

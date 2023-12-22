package h0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.imgdkh.app.R;
import h0.a;
import h0.c;
import h0.s0;
import i0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, l0> f6776a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f6777b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f6778c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f6779d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final u f6780e = new u();

    /* renamed from: f  reason: collision with root package name */
    public static final a f6781f = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f6782a = new WeakHashMap<>();

        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f6782a.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    boolean z9 = view.isShown() && view.getWindowVisibility() == 0;
                    if (booleanValue != z9) {
                        y.h(view, z9 ? 16 : 32);
                        this.f6782a.put(view, Boolean.valueOf(z9));
                    }
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f6783a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f6784b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6785c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6786d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f6783a = i10;
            this.f6784b = cls;
            this.f6786d = i11;
            this.f6785c = i12;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public final T d(View view) {
            boolean z9;
            if (Build.VERSION.SDK_INT >= this.f6785c) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return b(view);
            }
            T tag = view.getTag(this.f6783a);
            if (this.f6784b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void e(View view, T t10) {
            boolean z9;
            a aVar;
            if (Build.VERSION.SDK_INT >= this.f6785c) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                c(view, t10);
            } else if (f(d(view), t10)) {
                View.AccessibilityDelegate d10 = y.d(view);
                if (d10 == null) {
                    aVar = null;
                } else if (d10 instanceof a.C0089a) {
                    aVar = ((a.C0089a) d10).f6679a;
                } else {
                    aVar = new a(d10);
                }
                if (aVar == null) {
                    aVar = new a();
                }
                y.n(view, aVar);
                view.setTag(this.f6783a, t10);
                y.h(view, this.f6786d);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z9) {
            view.setHasTransientState(z9);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class i {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public s0 f6787a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f6788b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ q f6789c;

            public a(View view, q qVar) {
                this.f6788b = view;
                this.f6789c = qVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                s0 i10 = s0.i(view, windowInsets);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 30) {
                    i.a(windowInsets, this.f6788b);
                    if (i10.equals(this.f6787a)) {
                        return this.f6789c.a(view, i10).h();
                    }
                }
                this.f6787a = i10;
                s0 a10 = this.f6789c.a(view, i10);
                if (i11 >= 30) {
                    return a10.h();
                }
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                h.c(view);
                return a10.h();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static s0 b(View view, s0 s0Var, Rect rect) {
            WindowInsets h10 = s0Var.h();
            if (h10 != null) {
                return s0.i(view, view.computeSystemWindowInsets(h10, rect));
            }
            rect.setEmpty();
            return s0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z9) {
            return view.dispatchNestedFling(f10, f11, z9);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static s0 j(View view) {
            s0.e eVar;
            if (s0.a.f6747d && view.isAttachedToWindow()) {
                try {
                    Object obj = s0.a.f6744a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) s0.a.f6745b.get(obj);
                        Rect rect2 = (Rect) s0.a.f6746c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                eVar = new s0.d();
                            } else if (i10 >= 29) {
                                eVar = new s0.c();
                            } else {
                                eVar = new s0.b();
                            }
                            eVar.e(a0.b.b(rect.left, rect.top, rect.right, rect.bottom));
                            eVar.g(a0.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            s0 b10 = eVar.b();
                            b10.f6743a.p(b10);
                            b10.f6743a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    StringBuilder g10 = androidx.activity.f.g("Failed to get insets from AttachInfo. ");
                    g10.append(e10.getMessage());
                    Log.w("WindowInsetsCompat", g10.toString(), e10);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z9) {
            view.setNestedScrollingEnabled(z9);
        }

        public static void u(View view, q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, qVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class j {
        public static s0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            s0 i10 = s0.i((View) null, rootWindowInsets);
            i10.f6743a.p(i10);
            i10.f6743a.d(view.getRootView());
            return i10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    public static class k {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z9) {
            view.setFocusedByDefault(z9);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z9) {
            view.setKeyboardNavigationCluster(z9);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class l {
        public static void a(View view, q qVar) {
            m.h hVar = (m.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new m.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(qVar);
            a0 a0Var = new a0(qVar);
            hVar.put(qVar, a0Var);
            view.addOnUnhandledKeyEventListener(a0Var);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, q qVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            m.h hVar = (m.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar != null && (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) hVar.getOrDefault(qVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        public static void g(View view, boolean z9) {
            view.setAccessibilityHeading(z9);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z9) {
            view.setScreenReaderFocusable(z9);
        }
    }

    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class n {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo c10 = cVar.f6682a.c();
            Objects.requireNonNull(c10);
            ContentInfo a10 = view.performReceiveContent(c10);
            if (a10 == null) {
                return null;
            }
            if (a10 == c10) {
                return cVar;
            }
            return new c(new c.d(a10));
        }

        public static void c(View view, String[] strArr, r rVar) {
            if (rVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(rVar));
            }
        }
    }

    public static final class p implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final r f6790a;

        public p(r rVar) {
            this.f6790a = rVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c cVar = new c(new c.d(contentInfo));
            c a10 = this.f6790a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo c10 = a10.f6682a.c();
            Objects.requireNonNull(c10);
            return c10;
        }
    }

    public interface q {
        boolean a();
    }

    public static class r {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f6791d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f6792a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f6793b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f6794c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f6792a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static l0 a(View view) {
        if (f6776a == null) {
            f6776a = new WeakHashMap<>();
        }
        l0 l0Var = f6776a.get(view);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(view);
        f6776a.put(view, l0Var2);
        return l0Var2;
    }

    public static s0 b(View view, s0 s0Var) {
        WindowInsets h10 = s0Var.h();
        if (h10 != null) {
            WindowInsets a10 = h.a(view, h10);
            if (!a10.equals(h10)) {
                return s0.i(view, a10);
            }
        }
        return s0Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = r.f6791d;
        r rVar = (r) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (rVar == null) {
            rVar = new r();
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = rVar.f6792a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = r.f6791d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (rVar.f6792a == null) {
                        rVar.f6792a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = r.f6791d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            rVar.f6792a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                rVar.f6792a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = rVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (rVar.f6793b == null) {
                    rVar.f6793b = new SparseArray<>();
                }
                rVar.f6793b.put(keyCode, new WeakReference(a10));
            }
        }
        if (a10 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(view);
        }
        if (f6778c) {
            return null;
        }
        if (f6777b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6777b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6778c = true;
                return null;
            }
        }
        Object obj = f6777b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence e(View view) {
        boolean z9;
        Object obj;
        Class<CharSequence> cls = CharSequence.class;
        if (Build.VERSION.SDK_INT >= 28) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            obj = l.b(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i10) {
        boolean z9;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (e(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            int i11 = 32;
            if (g.a(view) != 0 || z9) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z9) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                g.g(obtain, i10);
                if (z9) {
                    obtain.getText().add(e(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (d.c((View) parent) == 4) {
                            d.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static s0 i(View view, s0 s0Var) {
        WindowInsets h10 = s0Var.h();
        if (h10 != null) {
            WindowInsets b10 = h.b(view, h10);
            if (!b10.equals(h10)) {
                return s0.i(view, b10);
            }
        }
        return s0Var;
    }

    public static c j(View view, c cVar) {
        s sVar;
        s sVar2;
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, cVar);
        }
        r rVar = (r) view.getTag(R.id.tag_on_receive_content_listener);
        if (rVar != null) {
            c a10 = rVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof s) {
                sVar2 = (s) view;
            } else {
                sVar2 = f6780e;
            }
            return sVar2.a(a10);
        }
        if (view instanceof s) {
            sVar = (s) view;
        } else {
            sVar = f6780e;
        }
        return sVar.a(cVar);
    }

    public static void k(View view, int i10) {
        ArrayList f10 = f(view);
        for (int i11 = 0; i11 < f10.size(); i11++) {
            if (((f.a) f10.get(i11)).a() == i10) {
                f10.remove(i11);
                return;
            }
        }
    }

    public static void l(View view, f.a aVar, i0.j jVar) {
        a aVar2;
        if (jVar == null) {
            k(view, aVar.a());
            h(view, 0);
            return;
        }
        f.a aVar3 = new f.a((Object) null, aVar.f7104b, (String) null, jVar, aVar.f7105c);
        View.AccessibilityDelegate d10 = d(view);
        if (d10 == null) {
            aVar2 = null;
        } else if (d10 instanceof a.C0089a) {
            aVar2 = ((a.C0089a) d10).f6679a;
        } else {
            aVar2 = new a(d10);
        }
        if (aVar2 == null) {
            aVar2 = new a();
        }
        n(view, aVar2);
        k(view, aVar3.a());
        f(view).add(aVar3);
        h(view, 0);
    }

    public static void m(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void n(View view, a aVar) {
        a.C0089a aVar2;
        if (aVar == null && (d(view) instanceof a.C0089a)) {
            aVar = new a();
        }
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = aVar.f6678b;
        }
        view.setAccessibilityDelegate(aVar2);
    }

    public static void o(View view, CharSequence charSequence) {
        boolean z9;
        new w(CharSequence.class).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f6781f;
            WeakHashMap<View, Boolean> weakHashMap = aVar.f6782a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z9));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        a aVar2 = f6781f;
        aVar2.f6782a.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }
}

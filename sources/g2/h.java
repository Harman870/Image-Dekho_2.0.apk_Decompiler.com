package g2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.activity.f;
import com.imgdkh.app.R;
import f2.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
public abstract class h<T extends View, Z> extends a<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final T f6564a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6565b;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f6566d;

        /* renamed from: a  reason: collision with root package name */
        public final View f6567a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f6568b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public C0086a f6569c;

        /* renamed from: g2.h$a$a  reason: collision with other inner class name */
        public static final class C0086a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f6570a;

            public C0086a(a aVar) {
                this.f6570a = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                boolean z9;
                boolean z10;
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f6570a.get();
                if (aVar != null && !aVar.f6568b.isEmpty()) {
                    int c10 = aVar.c();
                    int b10 = aVar.b();
                    boolean z11 = false;
                    if (c10 > 0 || c10 == Integer.MIN_VALUE) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        Iterator it = new ArrayList(aVar.f6568b).iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).b(c10, b10);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f6567a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f6569c);
                        }
                        aVar.f6569c = null;
                        aVar.f6568b.clear();
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f6567a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f6567a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f6567a.getContext();
            if (f6566d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                y3.a.h(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f6566d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f6566d.intValue();
        }

        public final int b() {
            int paddingBottom = this.f6567a.getPaddingBottom() + this.f6567a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f6567a.getLayoutParams();
            return a(this.f6567a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int c() {
            int paddingRight = this.f6567a.getPaddingRight() + this.f6567a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f6567a.getLayoutParams();
            return a(this.f6567a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public h(T t10) {
        y3.a.h(t10);
        this.f6564a = t10;
        this.f6565b = new a(t10);
    }

    public final void b(d dVar) {
        this.f6564a.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public final void e(f fVar) {
        boolean z9;
        boolean z10;
        a aVar = this.f6565b;
        int c10 = aVar.c();
        int b10 = aVar.b();
        boolean z11 = false;
        if (c10 > 0 || c10 == Integer.MIN_VALUE) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (b10 > 0 || b10 == Integer.MIN_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            fVar.b(c10, b10);
            return;
        }
        if (!aVar.f6568b.contains(fVar)) {
            aVar.f6568b.add(fVar);
        }
        if (aVar.f6569c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f6567a.getViewTreeObserver();
            a.C0086a aVar2 = new a.C0086a(aVar);
            aVar.f6569c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public final void f(f fVar) {
        this.f6565b.f6568b.remove(fVar);
    }

    public final d g() {
        Object tag = this.f6564a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof d) {
            return (d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void h(Drawable drawable) {
        a aVar = this.f6565b;
        ViewTreeObserver viewTreeObserver = aVar.f6567a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f6569c);
        }
        aVar.f6569c = null;
        aVar.f6568b.clear();
    }

    public final String toString() {
        StringBuilder g10 = f.g("Target for: ");
        g10.append(this.f6564a);
        return g10.toString();
    }
}

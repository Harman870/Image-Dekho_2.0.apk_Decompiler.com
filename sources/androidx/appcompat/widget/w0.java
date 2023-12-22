package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;

public final class w0 extends u0 implements v0 {
    public static Method D;
    public v0 C;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z9) {
            popupWindow.setTouchModal(z9);
        }
    }

    public static class c extends p0 {

        /* renamed from: m  reason: collision with root package name */
        public final int f987m;

        /* renamed from: n  reason: collision with root package name */
        public final int f988n;

        /* renamed from: o  reason: collision with root package name */
        public v0 f989o;

        /* renamed from: p  reason: collision with root package name */
        public h f990p;

        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z9) {
            super(context, z9);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f987m = 21;
                this.f988n = 22;
                return;
            }
            this.f987m = 22;
            this.f988n = 21;
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            int pointToPosition;
            int i11;
            if (this.f989o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                }
                e eVar = (e) adapter;
                h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < eVar.getCount()) {
                    hVar = eVar.getItem(i11);
                }
                h hVar2 = this.f990p;
                if (hVar2 != hVar) {
                    f fVar = eVar.f432a;
                    if (hVar2 != null) {
                        this.f989o.a(fVar, hVar2);
                    }
                    this.f990p = hVar;
                    if (hVar != null) {
                        this.f989o.d(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f987m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f988n) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((e) adapter).f432a.c(false);
                return true;
            }
        }

        public void setHoverListener(v0 v0Var) {
            this.f989o = v0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public w0(Context context, int i10, int i11) {
        super(context, (AttributeSet) null, i10, i11);
    }

    public final void a(f fVar, MenuItem menuItem) {
        v0 v0Var = this.C;
        if (v0Var != null) {
            v0Var.a(fVar, menuItem);
        }
    }

    public final void d(f fVar, h hVar) {
        v0 v0Var = this.C;
        if (v0Var != null) {
            v0Var.d(fVar, hVar);
        }
    }

    public final p0 p(Context context, boolean z9) {
        c cVar = new c(context, z9);
        cVar.setHoverListener(this);
        return cVar;
    }
}

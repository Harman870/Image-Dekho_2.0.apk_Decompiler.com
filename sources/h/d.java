package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

public abstract class d implements f, j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f6673a;

    public static int n(e eVar, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = eVar.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = eVar.getView(i13, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean v(f fVar) {
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = fVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(h hVar) {
        return false;
    }

    public final void d(Context context, f fVar) {
    }

    public final int getId() {
        return 0;
    }

    public final boolean l(h hVar) {
        return false;
    }

    public abstract void m(f fVar);

    public abstract void o(View view);

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        e eVar;
        int i11;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            eVar = (e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            eVar = (e) listAdapter;
        }
        f fVar = eVar.f432a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i10);
        if (!(this instanceof b)) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        fVar.q(menuItem, this, i11);
    }

    public abstract void p(boolean z9);

    public abstract void q(int i10);

    public abstract void r(int i10);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z9);

    public abstract void u(int i10);
}

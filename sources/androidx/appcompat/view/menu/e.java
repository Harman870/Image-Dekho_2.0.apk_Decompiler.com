package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public final class e extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public f f432a;

    /* renamed from: b  reason: collision with root package name */
    public int f433b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f434c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f435d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f436e;

    /* renamed from: f  reason: collision with root package name */
    public final int f437f;

    public e(f fVar, LayoutInflater layoutInflater, boolean z9, int i10) {
        this.f435d = z9;
        this.f436e = layoutInflater;
        this.f432a = fVar;
        this.f437f = i10;
        b();
    }

    public final void b() {
        f fVar = this.f432a;
        h hVar = fVar.f458v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f448j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == hVar) {
                    this.f433b = i10;
                    return;
                }
            }
        }
        this.f433b = -1;
    }

    /* renamed from: c */
    public final h getItem(int i10) {
        ArrayList<h> arrayList;
        if (this.f435d) {
            f fVar = this.f432a;
            fVar.i();
            arrayList = fVar.f448j;
        } else {
            arrayList = this.f432a.l();
        }
        int i11 = this.f433b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayList.get(i10);
    }

    public final int getCount() {
        ArrayList<h> arrayList;
        if (this.f435d) {
            f fVar = this.f432a;
            fVar.i();
            arrayList = fVar.f448j;
        } else {
            arrayList = this.f432a.l();
        }
        int i10 = this.f433b;
        int size = arrayList.size();
        if (i10 < 0) {
            return size;
        }
        return size - 1;
    }

    public final long getItemId(int i10) {
        return (long) i10;
    }

    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z9 = false;
        if (view == null) {
            view = this.f436e.inflate(this.f437f, viewGroup, false);
        }
        int i12 = getItem(i10).f464b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f464b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f432a.m() && i12 != i11) {
            z9 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z9);
        k.a aVar = (k.a) view;
        if (this.f434c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10));
        return view;
    }

    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}

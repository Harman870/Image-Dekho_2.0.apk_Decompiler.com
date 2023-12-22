package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.imgdkh.app.R;
import java.util.ArrayList;

public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f424a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f425b;

    /* renamed from: c  reason: collision with root package name */
    public f f426c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f427d;

    /* renamed from: e  reason: collision with root package name */
    public j.a f428e;

    /* renamed from: f  reason: collision with root package name */
    public a f429f;

    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f430a = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f426c;
            h hVar = fVar.f458v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f448j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == hVar) {
                        this.f430a = i10;
                        return;
                    }
                }
            }
            this.f430a = -1;
        }

        /* renamed from: c */
        public final h getItem(int i10) {
            f fVar = d.this.f426c;
            fVar.i();
            ArrayList<h> arrayList = fVar.f448j;
            d.this.getClass();
            int i11 = i10 + 0;
            int i12 = this.f430a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        public final int getCount() {
            f fVar = d.this.f426c;
            fVar.i();
            int size = fVar.f448j.size();
            d.this.getClass();
            int i10 = size + 0;
            if (this.f430a < 0) {
                return i10;
            }
            return i10 - 1;
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f425b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10));
            return view;
        }

        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f424a = context;
        this.f425b = LayoutInflater.from(context);
    }

    public final void a(f fVar, boolean z9) {
        j.a aVar = this.f428e;
        if (aVar != null) {
            aVar.a(fVar, z9);
        }
    }

    public final boolean c(h hVar) {
        return false;
    }

    public final void d(Context context, f fVar) {
        if (this.f424a != null) {
            this.f424a = context;
            if (this.f425b == null) {
                this.f425b = LayoutInflater.from(context);
            }
        }
        this.f426c = fVar;
        a aVar = this.f429f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void e(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f427d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final void f() {
        a aVar = this.f429f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final int getId() {
        return 0;
    }

    public final boolean h(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        b.a aVar = new b.a(mVar.f439a);
        d dVar = new d(aVar.f352a.f338a);
        gVar.f462c = dVar;
        dVar.f428e = gVar;
        f fVar = gVar.f460a;
        fVar.b(dVar, fVar.f439a);
        d dVar2 = gVar.f462c;
        if (dVar2.f429f == null) {
            dVar2.f429f = new a();
        }
        a aVar2 = dVar2.f429f;
        AlertController.b bVar = aVar.f352a;
        bVar.f344g = aVar2;
        bVar.f345h = gVar;
        View view = mVar.f452o;
        if (view != null) {
            bVar.f342e = view;
        } else {
            bVar.f340c = mVar.f451n;
            bVar.f341d = mVar.f450m;
        }
        bVar.f343f = gVar;
        b a10 = aVar.a();
        gVar.f461b = a10;
        a10.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f461b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f461b.show();
        j.a aVar3 = this.f428e;
        if (aVar3 == null) {
            return true;
        }
        aVar3.b(mVar);
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final Parcelable j() {
        if (this.f427d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f427d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final void k(j.a aVar) {
        this.f428e = aVar;
    }

    public final boolean l(h hVar) {
        return false;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f426c.q(this.f429f.getItem(i10), this, 0);
    }
}

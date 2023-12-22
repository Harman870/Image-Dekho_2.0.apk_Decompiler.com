package m0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.activity.e;
import m0.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9307a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9308b = true;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f9309c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f9310d = -1;

    /* renamed from: e  reason: collision with root package name */
    public C0112a f9311e = new C0112a();

    /* renamed from: f  reason: collision with root package name */
    public b f9312f = new b();

    /* renamed from: g  reason: collision with root package name */
    public b f9313g;

    /* renamed from: m0.a$a  reason: collision with other inner class name */
    public class C0112a extends ContentObserver {
        public C0112a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z9) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f9308b && (cursor = aVar.f9309c) != null && !cursor.isClosed()) {
                aVar.f9307a = aVar.f9309c.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            a aVar = a.this;
            aVar.f9307a = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f9307a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f9309c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0112a aVar = this.f9311e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f9312f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f9309c = cursor;
            if (cursor != null) {
                C0112a aVar2 = this.f9311e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f9312f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f9310d = cursor.getColumnIndexOrThrow("_id");
                this.f9307a = true;
                notifyDataSetChanged();
            } else {
                this.f9310d = -1;
                this.f9307a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f9307a || (cursor = this.f9309c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9307a) {
            return null;
        }
        this.f9309c.moveToPosition(i10);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f9319j.inflate(cVar.f9318i, viewGroup, false);
        }
        b(view, this.f9309c);
        return view;
    }

    public final Filter getFilter() {
        if (this.f9313g == null) {
            this.f9313g = new b(this);
        }
        return this.f9313g;
    }

    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f9307a || (cursor = this.f9309c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f9309c;
    }

    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f9307a || (cursor = this.f9309c) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f9309c.getLong(this.f9310d);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9307a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f9309c.moveToPosition(i10)) {
            if (view == null) {
                view = e(viewGroup);
            }
            b(view, this.f9309c);
            return view;
        } else {
            throw new IllegalStateException(e.a("couldn't move cursor to position ", i10));
        }
    }
}

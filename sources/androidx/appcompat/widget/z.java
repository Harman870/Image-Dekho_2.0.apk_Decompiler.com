package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class z extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1006i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final e f1007a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1008b;

    /* renamed from: c  reason: collision with root package name */
    public y f1009c;

    /* renamed from: d  reason: collision with root package name */
    public SpinnerAdapter f1010d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1011e;

    /* renamed from: f  reason: collision with root package name */
    public i f1012f;

    /* renamed from: g  reason: collision with root package name */
    public int f1013g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f1014h = new Rect();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (!z.this.getInternalPopup().b()) {
                z zVar = z.this;
                zVar.f1012f.l(c.b(zVar), c.a(zVar));
            }
            ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!g0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.app.b f1016a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f1017b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f1018c;

        public e() {
        }

        public final boolean b() {
            androidx.appcompat.app.b bVar = this.f1016a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public final int c() {
            return 0;
        }

        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f1016a;
            if (bVar != null) {
                bVar.dismiss();
                this.f1016a = null;
            }
        }

        public final Drawable e() {
            return null;
        }

        public final void f(CharSequence charSequence) {
            this.f1018c = charSequence;
        }

        public final void h(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public final void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public final void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public final void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public final void l(int i10, int i11) {
            if (this.f1017b != null) {
                b.a aVar = new b.a(z.this.getPopupContext());
                CharSequence charSequence = this.f1018c;
                if (charSequence != null) {
                    aVar.f352a.f341d = charSequence;
                }
                ListAdapter listAdapter = this.f1017b;
                int selectedItemPosition = z.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.f352a;
                bVar.f344g = listAdapter;
                bVar.f345h = this;
                bVar.f347j = selectedItemPosition;
                bVar.f346i = true;
                androidx.appcompat.app.b a10 = aVar.a();
                this.f1016a = a10;
                AlertController.RecycleListView recycleListView = a10.f351e.f317e;
                c.d(recycleListView, i10);
                c.c(recycleListView, i11);
                this.f1016a.show();
            }
        }

        public final int m() {
            return 0;
        }

        public final CharSequence n() {
            return this.f1018c;
        }

        public final void o(ListAdapter listAdapter) {
            this.f1017b = listAdapter;
        }

        public final void onClick(DialogInterface dialogInterface, int i10) {
            z.this.setSelection(i10);
            if (z.this.getOnItemClickListener() != null) {
                z.this.performItemClick((View) null, i10, this.f1017b.getItemId(i10));
            }
            dismiss();
        }
    }

    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public SpinnerAdapter f1020a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f1021b;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1020a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1021b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof e1) {
                e1 e1Var = (e1) spinnerAdapter;
                if (e1Var.getDropDownViewTheme() == null) {
                    e1Var.a();
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1021b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1020a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1020a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1020a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1020a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public final int getItemViewType(int i10) {
            return 0;
        }

        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1020a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1021b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1020a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1020a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class g extends u0 implements i {
        public CharSequence C;
        public ListAdapter D;
        public final Rect E = new Rect();
        public int F;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                z.this.setSelection(i10);
                if (z.this.getOnItemClickListener() != null) {
                    g gVar = g.this;
                    z.this.performItemClick(view, i10, gVar.D.getItemId(i10));
                }
                g.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public final void onGlobalLayout() {
                boolean z9;
                g gVar = g.this;
                z zVar = z.this;
                gVar.getClass();
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (!y.g.b(zVar) || !zVar.getGlobalVisibleRect(gVar.E)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (!z9) {
                    g.this.dismiss();
                    return;
                }
                g.this.r();
                g.this.show();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1024a;

            public c(b bVar) {
                this.f1024a = bVar;
            }

            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1024a);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            this.f971o = z.this;
            this.f979y = true;
            this.f980z.setFocusable(true);
            this.f972p = new a();
        }

        public final void f(CharSequence charSequence) {
            this.C = charSequence;
        }

        public final void j(int i10) {
            this.F = i10;
        }

        public final void l(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            r();
            this.f980z.setInputMethodMode(2);
            show();
            p0 p0Var = this.f960c;
            p0Var.setChoiceMode(1);
            c.d(p0Var, i10);
            c.c(p0Var, i11);
            int selectedItemPosition = z.this.getSelectedItemPosition();
            p0 p0Var2 = this.f960c;
            if (b() && p0Var2 != null) {
                p0Var2.setListSelectionHidden(false);
                p0Var2.setSelection(selectedItemPosition);
                if (p0Var2.getChoiceMode() != 0) {
                    p0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b10 && (viewTreeObserver = z.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f980z.setOnDismissListener(new c(bVar));
            }
        }

        public final CharSequence n() {
            return this.C;
        }

        public final void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.D = listAdapter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void r() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.e()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.z r1 = androidx.appcompat.widget.z.this
                android.graphics.Rect r1 = r1.f1014h
                r0.getPadding(r1)
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                boolean r0 = androidx.appcompat.widget.r1.a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                android.graphics.Rect r0 = r0.f1014h
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                android.graphics.Rect r0 = r0.f1014h
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                android.graphics.Rect r0 = r0.f1014h
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.z r0 = androidx.appcompat.widget.z.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.z r2 = androidx.appcompat.widget.z.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.z r3 = androidx.appcompat.widget.z.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.z r4 = androidx.appcompat.widget.z.this
                int r5 = r4.f1013g
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.D
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.e()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.z r5 = androidx.appcompat.widget.z.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.z r6 = androidx.appcompat.widget.z.this
                android.graphics.Rect r6 = r6.f1014h
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.q(r4)
                goto L_0x0085
            L_0x0082:
                r8.q(r5)
            L_0x0085:
                androidx.appcompat.widget.z r4 = androidx.appcompat.widget.z.this
                boolean r4 = androidx.appcompat.widget.r1.a(r4)
                if (r4 == 0) goto L_0x0096
                int r3 = r3 - r2
                int r0 = r8.f962e
                int r3 = r3 - r0
                int r0 = r8.F
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L_0x009b
            L_0x0096:
                int r2 = r8.F
                int r0 = r0 + r2
                int r3 = r0 + r1
            L_0x009b:
                r8.f963f = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.g.r():void");
        }
    }

    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f1026a;

        public class a implements Parcelable.Creator<h> {
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            public final Object[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f1026a = parcel.readByte() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1026a ? (byte) 1 : 0);
        }
    }

    public interface i {
        boolean b();

        int c();

        void dismiss();

        Drawable e();

        void f(CharSequence charSequence);

        void h(Drawable drawable);

        void i(int i10);

        void j(int i10);

        void k(int i10);

        void l(int i10, int i11);

        int m();

        CharSequence n();

        void o(ListAdapter listAdapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f1014h = r0
            android.content.Context r0 = r10.getContext()
            androidx.appcompat.widget.d1.a(r0, r10)
            int[] r0 = y3.a.A
            r1 = 0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r10)
            r10.f1007a = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002e
            g.c r3 = new g.c
            r3.<init>((android.content.Context) r11, (int) r2)
            r10.f1008b = r3
            goto L_0x0030
        L_0x002e:
            r10.f1008b = r11
        L_0x0030:
            r2 = 0
            r3 = -1
            int[] r4 = f1006i     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r4, r13, r1)     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0047 }
            if (r5 == 0) goto L_0x0058
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0058
        L_0x0043:
            r11 = move-exception
            r2 = r4
            goto L_0x00cd
        L_0x0047:
            r5 = move-exception
            goto L_0x004f
        L_0x0049:
            r11 = move-exception
            goto L_0x00cd
        L_0x004c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x004f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x005b
        L_0x0058:
            r4.recycle()
        L_0x005b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0095
            if (r3 == r5) goto L_0x0062
            goto L_0x00a2
        L_0x0062:
            androidx.appcompat.widget.z$g r3 = new androidx.appcompat.widget.z$g
            android.content.Context r6 = r10.f1008b
            r3.<init>(r6, r12, r13)
            android.content.Context r6 = r10.f1008b
            int[] r7 = y3.a.A
            androidx.appcompat.widget.i1 r6 = androidx.appcompat.widget.i1.m(r6, r12, r7, r13)
            r7 = 3
            r8 = -2
            android.content.res.TypedArray r9 = r6.f809b
            int r7 = r9.getLayoutDimension(r7, r8)
            r10.f1013g = r7
            android.graphics.drawable.Drawable r7 = r6.e(r5)
            r3.h(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.C = r4
            r6.n()
            r10.f1012f = r3
            androidx.appcompat.widget.y r4 = new androidx.appcompat.widget.y
            r4.<init>(r10, r10, r3)
            r10.f1009c = r4
            goto L_0x00a2
        L_0x0095:
            androidx.appcompat.widget.z$e r3 = new androidx.appcompat.widget.z$e
            r3.<init>()
            r10.f1012f = r3
            java.lang.String r4 = r0.getString(r4)
            r3.f1018c = r4
        L_0x00a2:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00b9
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r11, r4, r1)
            r11 = 2131493000(0x7f0c0088, float:1.8609468E38)
            r3.setDropDownViewResource(r11)
            r10.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00b9:
            r0.recycle()
            r10.f1011e = r5
            android.widget.SpinnerAdapter r11 = r10.f1010d
            if (r11 == 0) goto L_0x00c7
            r10.setAdapter((android.widget.SpinnerAdapter) r11)
            r10.f1010d = r2
        L_0x00c7:
            androidx.appcompat.widget.e r11 = r10.f1007a
            r11.d(r12, r13)
            return
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            r2.recycle()
        L_0x00d2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f1014h);
        Rect rect = this.f1014h;
        return i11 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1007a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        i iVar = this.f1012f;
        return iVar != null ? iVar.c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        i iVar = this.f1012f;
        return iVar != null ? iVar.m() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f1012f != null ? this.f1013g : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f1012f;
    }

    public Drawable getPopupBackground() {
        i iVar = this.f1012f;
        return iVar != null ? iVar.e() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1008b;
    }

    public CharSequence getPrompt() {
        i iVar = this.f1012f;
        return iVar != null ? iVar.n() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1007a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1007a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f1012f;
        if (iVar != null && iVar.b()) {
            this.f1012f.dismiss();
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1012f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (hVar.f1026a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f1012f;
        hVar.f1026a = iVar != null && iVar.b();
        return hVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar = this.f1009c;
        if (yVar == null || !yVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        i iVar = this.f1012f;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.b()) {
            return true;
        }
        this.f1012f.l(c.b(this), c.a(this));
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1011e) {
            this.f1010d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1012f != null) {
            Context context = this.f1008b;
            if (context == null) {
                context = getContext();
            }
            this.f1012f.o(new f(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1007a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1007a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.f1012f;
        if (iVar != null) {
            iVar.j(i10);
            this.f1012f.k(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.f1012f;
        if (iVar != null) {
            iVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f1012f != null) {
            this.f1013g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f1012f;
        if (iVar != null) {
            iVar.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(e.a.a(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f1012f;
        if (iVar != null) {
            iVar.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1007a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1007a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}

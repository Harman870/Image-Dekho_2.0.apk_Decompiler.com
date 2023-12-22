package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.imgdkh.app.R;
import d.p;

public class b extends p {

    /* renamed from: e  reason: collision with root package name */
    public final AlertController f351e = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f352a;

        /* renamed from: b  reason: collision with root package name */
        public final int f353b;

        public a(Context context) {
            int g10 = b.g(context, 0);
            this.f352a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, g10)));
            this.f353b = g10;
        }

        public final b a() {
            int i10;
            b bVar = new b(this.f352a.f338a, this.f353b);
            AlertController.b bVar2 = this.f352a;
            AlertController alertController = bVar.f351e;
            View view = bVar2.f342e;
            if (view != null) {
                alertController.f326o = view;
            } else {
                CharSequence charSequence = bVar2.f341d;
                if (charSequence != null) {
                    alertController.f316d = charSequence;
                    TextView textView = alertController.f324m;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f340c;
                if (drawable != null) {
                    alertController.k = drawable;
                    alertController.f322j = 0;
                    ImageView imageView = alertController.f323l;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f323l.setImageDrawable(drawable);
                    }
                }
            }
            if (bVar2.f344g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f339b.inflate(alertController.f331t, (ViewGroup) null);
                if (bVar2.f346i) {
                    i10 = alertController.u;
                } else {
                    i10 = alertController.f332v;
                }
                ListAdapter listAdapter = bVar2.f344g;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f338a, i10);
                }
                alertController.f327p = listAdapter;
                alertController.f328q = bVar2.f347j;
                if (bVar2.f345h != null) {
                    recycleListView.setOnItemClickListener(new a(bVar2, alertController));
                }
                if (bVar2.f346i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f317e = recycleListView;
            }
            this.f352a.getClass();
            bVar.setCancelable(true);
            this.f352a.getClass();
            bVar.setCanceledOnTouchOutside(true);
            this.f352a.getClass();
            bVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            this.f352a.getClass();
            bVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f352a.f343f;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }
    }

    public b(Context context, int i10) {
        super(context, g(context, i10));
    }

    public static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023a, code lost:
        if (r3 != null) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0244, code lost:
        if (r3 != null) goto L_0x0246;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0277  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            androidx.appcompat.app.AlertController r1 = r0.f351e
            int r2 = r1.f330s
            int r2 = r1.f329r
            d.p r3 = r1.f314b
            r3.setContentView((int) r2)
            android.view.Window r2 = r1.f315c
            r3 = 2131296666(0x7f09019a, float:1.8211255E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2131296866(0x7f090262, float:1.821166E38)
            android.view.View r4 = r2.findViewById(r3)
            r5 = 2131296416(0x7f0900a0, float:1.8210748E38)
            android.view.View r6 = r2.findViewById(r5)
            r7 = 2131296385(0x7f090081, float:1.8210685E38)
            android.view.View r8 = r2.findViewById(r7)
            r9 = 2131296428(0x7f0900ac, float:1.8210772E38)
            android.view.View r2 = r2.findViewById(r9)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.Window r9 = r1.f315c
            r10 = 131072(0x20000, float:1.83671E-40)
            r9.setFlags(r10, r10)
            r9 = 8
            r2.setVisibility(r9)
            android.view.View r3 = r2.findViewById(r3)
            android.view.View r5 = r2.findViewById(r5)
            android.view.View r7 = r2.findViewById(r7)
            android.view.ViewGroup r3 = androidx.appcompat.app.AlertController.b(r3, r4)
            android.view.ViewGroup r4 = androidx.appcompat.app.AlertController.b(r5, r6)
            android.view.ViewGroup r5 = androidx.appcompat.app.AlertController.b(r7, r8)
            android.view.Window r6 = r1.f315c
            r7 = 2131296733(0x7f0901dd, float:1.821139E38)
            android.view.View r6 = r6.findViewById(r7)
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r1.f321i = r6
            r7 = 0
            r6.setFocusable(r7)
            androidx.core.widget.NestedScrollView r6 = r1.f321i
            r6.setNestedScrollingEnabled(r7)
            r6 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f325n = r6
            r8 = -1
            if (r6 != 0) goto L_0x0080
            goto L_0x00ad
        L_0x0080:
            r6.setVisibility(r9)
            androidx.core.widget.NestedScrollView r6 = r1.f321i
            android.widget.TextView r10 = r1.f325n
            r6.removeView(r10)
            androidx.appcompat.app.AlertController$RecycleListView r6 = r1.f317e
            if (r6 == 0) goto L_0x00aa
            androidx.core.widget.NestedScrollView r6 = r1.f321i
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.core.widget.NestedScrollView r10 = r1.f321i
            int r10 = r6.indexOfChild(r10)
            r6.removeViewAt(r10)
            androidx.appcompat.app.AlertController$RecycleListView r11 = r1.f317e
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r12.<init>(r8, r8)
            r6.addView(r11, r10, r12)
            goto L_0x00ad
        L_0x00aa:
            r4.setVisibility(r9)
        L_0x00ad:
            r6 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r1.f318f = r6
            androidx.appcompat.app.AlertController$a r10 = r1.f334y
            r6.setOnClickListener(r10)
            r6 = 0
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            r11 = 1
            if (r10 == 0) goto L_0x00cc
            android.widget.Button r10 = r1.f318f
            r10.setVisibility(r9)
            r10 = r7
            goto L_0x00d7
        L_0x00cc:
            android.widget.Button r10 = r1.f318f
            r10.setText(r6)
            android.widget.Button r10 = r1.f318f
            r10.setVisibility(r7)
            r10 = r11
        L_0x00d7:
            r12 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r12 = r5.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r1.f319g = r12
            androidx.appcompat.app.AlertController$a r13 = r1.f334y
            r12.setOnClickListener(r13)
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x00f3
            android.widget.Button r12 = r1.f319g
            r12.setVisibility(r9)
            goto L_0x00ff
        L_0x00f3:
            android.widget.Button r12 = r1.f319g
            r12.setText(r6)
            android.widget.Button r12 = r1.f319g
            r12.setVisibility(r7)
            r10 = r10 | 2
        L_0x00ff:
            r12 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r12 = r5.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r1.f320h = r12
            androidx.appcompat.app.AlertController$a r13 = r1.f334y
            r12.setOnClickListener(r13)
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x011b
            android.widget.Button r12 = r1.f320h
            r12.setVisibility(r9)
            goto L_0x0127
        L_0x011b:
            android.widget.Button r12 = r1.f320h
            r12.setText(r6)
            android.widget.Button r12 = r1.f320h
            r12.setVisibility(r7)
            r10 = r10 | 4
        L_0x0127:
            android.content.Context r12 = r1.f313a
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            android.content.res.Resources$Theme r12 = r12.getTheme()
            r14 = 2130903087(0x7f03002f, float:1.7412982E38)
            r12.resolveAttribute(r14, r13, r11)
            int r12 = r13.data
            if (r12 == 0) goto L_0x013e
            r12 = r11
            goto L_0x013f
        L_0x013e:
            r12 = r7
        L_0x013f:
            r13 = 2
            if (r12 == 0) goto L_0x0160
            if (r10 != r11) goto L_0x0147
            android.widget.Button r12 = r1.f318f
            goto L_0x0151
        L_0x0147:
            if (r10 != r13) goto L_0x014c
            android.widget.Button r12 = r1.f319g
            goto L_0x0151
        L_0x014c:
            r12 = 4
            if (r10 != r12) goto L_0x0160
            android.widget.Button r12 = r1.f320h
        L_0x0151:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            r14.gravity = r11
            r15 = 1056964608(0x3f000000, float:0.5)
            r14.weight = r15
            r12.setLayoutParams(r14)
        L_0x0160:
            if (r10 == 0) goto L_0x0164
            r10 = r11
            goto L_0x0165
        L_0x0164:
            r10 = r7
        L_0x0165:
            if (r10 != 0) goto L_0x016a
            r5.setVisibility(r9)
        L_0x016a:
            android.view.View r10 = r1.f326o
            r12 = 2131296858(0x7f09025a, float:1.8211645E38)
            if (r10 == 0) goto L_0x0184
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r14 = -2
            r10.<init>(r8, r14)
            android.view.View r14 = r1.f326o
            r3.addView(r14, r7, r10)
            android.view.Window r10 = r1.f315c
            android.view.View r10 = r10.findViewById(r12)
            goto L_0x01f6
        L_0x0184:
            android.view.Window r10 = r1.f315c
            r14 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r10 = r10.findViewById(r14)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r1.f323l = r10
            java.lang.CharSequence r10 = r1.f316d
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r10 = r10 ^ r11
            if (r10 == 0) goto L_0x01e7
            boolean r10 = r1.w
            if (r10 == 0) goto L_0x01e7
            android.view.Window r10 = r1.f315c
            r12 = 2131296344(0x7f090058, float:1.8210602E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1.f324m = r10
            java.lang.CharSequence r12 = r1.f316d
            r10.setText(r12)
            int r10 = r1.f322j
            if (r10 == 0) goto L_0x01ba
            android.widget.ImageView r12 = r1.f323l
            r12.setImageResource(r10)
            goto L_0x01f9
        L_0x01ba:
            android.graphics.drawable.Drawable r10 = r1.k
            if (r10 == 0) goto L_0x01c4
            android.widget.ImageView r12 = r1.f323l
            r12.setImageDrawable(r10)
            goto L_0x01f9
        L_0x01c4:
            android.widget.TextView r10 = r1.f324m
            android.widget.ImageView r12 = r1.f323l
            int r12 = r12.getPaddingLeft()
            android.widget.ImageView r14 = r1.f323l
            int r14 = r14.getPaddingTop()
            android.widget.ImageView r15 = r1.f323l
            int r15 = r15.getPaddingRight()
            android.widget.ImageView r6 = r1.f323l
            int r6 = r6.getPaddingBottom()
            r10.setPadding(r12, r14, r15, r6)
            android.widget.ImageView r6 = r1.f323l
            r6.setVisibility(r9)
            goto L_0x01f9
        L_0x01e7:
            android.view.Window r6 = r1.f315c
            android.view.View r6 = r6.findViewById(r12)
            r6.setVisibility(r9)
            android.widget.ImageView r6 = r1.f323l
            r6.setVisibility(r9)
            r10 = r3
        L_0x01f6:
            r10.setVisibility(r9)
        L_0x01f9:
            int r2 = r2.getVisibility()
            if (r2 == r9) goto L_0x0201
            r2 = r11
            goto L_0x0202
        L_0x0201:
            r2 = r7
        L_0x0202:
            if (r3 == 0) goto L_0x020c
            int r6 = r3.getVisibility()
            if (r6 == r9) goto L_0x020c
            r6 = r11
            goto L_0x020d
        L_0x020c:
            r6 = r7
        L_0x020d:
            int r5 = r5.getVisibility()
            if (r5 == r9) goto L_0x0215
            r5 = r11
            goto L_0x0216
        L_0x0215:
            r5 = r7
        L_0x0216:
            if (r5 != 0) goto L_0x0224
            r9 = 2131296838(0x7f090246, float:1.8211604E38)
            android.view.View r9 = r4.findViewById(r9)
            if (r9 == 0) goto L_0x0224
            r9.setVisibility(r7)
        L_0x0224:
            if (r6 == 0) goto L_0x023d
            androidx.core.widget.NestedScrollView r9 = r1.f321i
            if (r9 == 0) goto L_0x022d
            r9.setClipToPadding(r11)
        L_0x022d:
            androidx.appcompat.app.AlertController$RecycleListView r9 = r1.f317e
            if (r9 == 0) goto L_0x0239
            r9 = 2131296857(0x7f090259, float:1.8211643E38)
            android.view.View r3 = r3.findViewById(r9)
            goto L_0x023a
        L_0x0239:
            r3 = 0
        L_0x023a:
            if (r3 == 0) goto L_0x0249
            goto L_0x0246
        L_0x023d:
            r3 = 2131296839(0x7f090247, float:1.8211606E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r3 == 0) goto L_0x0249
        L_0x0246:
            r3.setVisibility(r7)
        L_0x0249:
            androidx.appcompat.app.AlertController$RecycleListView r3 = r1.f317e
            boolean r9 = r3 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r9 == 0) goto L_0x0275
            if (r5 == 0) goto L_0x0258
            if (r6 != 0) goto L_0x0254
            goto L_0x0258
        L_0x0254:
            r3.getClass()
            goto L_0x0275
        L_0x0258:
            int r9 = r3.getPaddingLeft()
            if (r6 == 0) goto L_0x0263
            int r10 = r3.getPaddingTop()
            goto L_0x0265
        L_0x0263:
            int r10 = r3.f335a
        L_0x0265:
            int r12 = r3.getPaddingRight()
            if (r5 == 0) goto L_0x0270
            int r14 = r3.getPaddingBottom()
            goto L_0x0272
        L_0x0270:
            int r14 = r3.f336b
        L_0x0272:
            r3.setPadding(r9, r10, r12, r14)
        L_0x0275:
            if (r2 != 0) goto L_0x02a7
            androidx.appcompat.app.AlertController$RecycleListView r2 = r1.f317e
            if (r2 == 0) goto L_0x027c
            goto L_0x027e
        L_0x027c:
            androidx.core.widget.NestedScrollView r2 = r1.f321i
        L_0x027e:
            if (r2 == 0) goto L_0x02a7
            if (r5 == 0) goto L_0x0283
            r7 = r13
        L_0x0283:
            r3 = r6 | r7
            r5 = 3
            android.view.Window r6 = r1.f315c
            r7 = 2131296732(0x7f0901dc, float:1.8211389E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.Window r7 = r1.f315c
            r9 = 2131296731(0x7f0901db, float:1.8211387E38)
            android.view.View r7 = r7.findViewById(r9)
            java.util.WeakHashMap<android.view.View, h0.l0> r9 = h0.y.f6776a
            h0.y.j.d(r2, r3, r5)
            if (r6 == 0) goto L_0x02a2
            r4.removeView(r6)
        L_0x02a2:
            if (r7 == 0) goto L_0x02a7
            r4.removeView(r7)
        L_0x02a7:
            androidx.appcompat.app.AlertController$RecycleListView r2 = r1.f317e
            if (r2 == 0) goto L_0x02bc
            android.widget.ListAdapter r3 = r1.f327p
            if (r3 == 0) goto L_0x02bc
            r2.setAdapter(r3)
            int r1 = r1.f328q
            if (r1 <= r8) goto L_0x02bc
            r2.setItemChecked(r1, r11)
            r2.setSelection(r1)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.b.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z9;
        NestedScrollView nestedScrollView = this.f351e.f321i;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z9;
        NestedScrollView nestedScrollView = this.f351e.f321i;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f351e;
        alertController.f316d = charSequence;
        TextView textView = alertController.f324m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

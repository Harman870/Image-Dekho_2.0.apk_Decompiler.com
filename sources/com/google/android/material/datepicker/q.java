package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.n;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.imgdkh.app.R;
import h0.l0;
import h0.o0;
import h0.q0;
import h0.v0;
import h0.w0;
import h0.x0;
import h0.y;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import r5.f;

public final class q<S> extends n {
    public static final /* synthetic */ int X0 = 0;
    public final LinkedHashSet<DialogInterface.OnDismissListener> A0 = new LinkedHashSet<>();
    public int B0;
    public d<S> C0;
    public a0<S> D0;
    public a E0;
    public f F0;
    public i<S> G0;
    public int H0;
    public CharSequence I0;
    public boolean J0;
    public int K0;
    public int L0;
    public CharSequence M0;
    public int N0;
    public CharSequence O0;
    public TextView P0;
    public TextView Q0;
    public CheckableImageButton R0;
    public f S0;
    public Button T0;
    public boolean U0;
    public CharSequence V0;
    public CharSequence W0;

    /* renamed from: x0  reason: collision with root package name */
    public final LinkedHashSet<t<? super S>> f3150x0 = new LinkedHashSet<>();

    /* renamed from: y0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f3151y0 = new LinkedHashSet<>();

    /* renamed from: z0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3152z0 = new LinkedHashSet<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            Iterator<t<? super S>> it = q.this.f3150x0.iterator();
            while (it.hasNext()) {
                q.this.e0().o();
                it.next().a();
            }
            q.this.b0(false, false);
        }
    }

    public class b extends h0.a {
        public b() {
        }

        public final void d(View view, i0.f fVar) {
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            StringBuilder sb = new StringBuilder();
            q qVar = q.this;
            int i10 = q.X0;
            sb.append(qVar.e0().w());
            sb.append(", ");
            sb.append(fVar.e());
            fVar.i(sb.toString());
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = q.this.f3151y0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            q.this.b0(false, false);
        }
    }

    public class d extends z<S> {
        public d() {
        }

        public final void a(S s10) {
            q qVar = q.this;
            d e02 = qVar.e0();
            qVar.l();
            String h10 = e02.h();
            TextView textView = qVar.Q0;
            d e03 = qVar.e0();
            qVar.U();
            textView.setContentDescription(e03.m());
            qVar.Q0.setText(h10);
            q qVar2 = q.this;
            qVar2.T0.setEnabled(qVar2.e0().l());
        }
    }

    public static int f0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d10 = e0.d();
        d10.set(5, 1);
        Calendar c10 = e0.c(d10);
        c10.get(2);
        c10.get(1);
        int maximum = c10.getMaximum(7);
        c10.getActualMaximum(5);
        c10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean g0(Context context) {
        return h0(context, 16843277);
    }

    public static boolean h0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n5.b.c(context, i.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i10});
        boolean z9 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z9;
    }

    public final void D(Bundle bundle) {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.f1568g;
        }
        this.B0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.C0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.E0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.F0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.H0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.K0 = bundle.getInt("INPUT_MODE_KEY");
        this.L0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.N0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.I0;
        if (charSequence == null) {
            charSequence = U().getResources().getText(this.H0);
        }
        this.V0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.W0 = charSequence;
    }

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        View view;
        LinearLayout.LayoutParams layoutParams;
        boolean z9;
        if (this.J0) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        f fVar = this.F0;
        if (fVar != null) {
            fVar.getClass();
        }
        if (this.J0) {
            view = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(f0(context), -2);
        } else {
            view = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(f0(context), -1);
        }
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.Q0 = textView;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.g.f(textView, 1);
        this.R0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.P0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.R0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.R0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, e.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], e.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.R0;
        if (this.K0 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        checkableImageButton2.setChecked(z9);
        y.n(this.R0, (h0.a) null);
        j0(this.R0);
        this.R0.setOnClickListener(new s(this));
        this.T0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (e0().l()) {
            this.T0.setEnabled(true);
        } else {
            this.T0.setEnabled(false);
        }
        this.T0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.M0;
        if (charSequence != null) {
            this.T0.setText(charSequence);
        } else {
            int i11 = this.L0;
            if (i11 != 0) {
                this.T0.setText(i11);
            }
        }
        this.T0.setOnClickListener(new a());
        y.n(this.T0, new b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.O0;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i12 = this.N0;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }

    public final void K(Bundle bundle) {
        v vVar;
        super.K(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.B0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.C0);
        a.b bVar = new a.b(this.E0);
        i<S> iVar = this.G0;
        v vVar2 = null;
        if (iVar == null) {
            vVar = null;
        } else {
            vVar = iVar.Y;
        }
        if (vVar != null) {
            bVar.f3099c = Long.valueOf(vVar.f3167f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f3101e);
        v b10 = v.b(bVar.f3097a);
        v b11 = v.b(bVar.f3098b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l6 = bVar.f3099c;
        if (l6 != null) {
            vVar2 = v.b(l6.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(b10, b11, cVar, vVar2, bVar.f3100d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.F0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.I0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.L0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.M0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.O0);
    }

    public final void L() {
        Integer num;
        boolean z9;
        int i10;
        boolean z10;
        y3.a aVar;
        y3.a aVar2;
        super.L();
        Window window = d0().getWindow();
        if (this.J0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.S0);
            if (!this.U0) {
                View findViewById = V().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean z11 = false;
                if (num == null || num.intValue() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int s10 = c6.b.s(window.getContext(), 16842801, -16777216);
                if (z9) {
                    num = Integer.valueOf(s10);
                }
                Integer valueOf = Integer.valueOf(s10);
                if (i11 >= 30) {
                    q0.a(window, false);
                } else {
                    o0.a(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i11 < 27) {
                    i10 = a0.a.c(c6.b.s(context, 16843858, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                boolean u = c6.b.u(num.intValue());
                if (c6.b.u(0) || u) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                window.getDecorView();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    aVar = new x0(window);
                } else if (i12 >= 26) {
                    aVar = new w0(window);
                } else {
                    aVar = new v0(window);
                }
                aVar.s(z10);
                boolean u10 = c6.b.u(valueOf.intValue());
                if (c6.b.u(i10) || (i10 == 0 && u10)) {
                    z11 = true;
                }
                window.getDecorView();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    aVar2 = new x0(window);
                } else if (i13 >= 26) {
                    aVar2 = new w0(window);
                } else {
                    aVar2 = new v0(window);
                }
                aVar2.r(z11);
                r rVar = new r(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                y.i.u(findViewById, rVar);
                this.U0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = q().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.S0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new e5.a(d0(), rect));
        }
        i0();
    }

    public final void M() {
        this.D0.T.clear();
        super.M();
    }

    public final Dialog c0() {
        Context U = U();
        U();
        int i10 = this.B0;
        if (i10 == 0) {
            i10 = e0().i();
        }
        Dialog dialog = new Dialog(U, i10);
        Context context = dialog.getContext();
        this.J0 = g0(context);
        int i11 = n5.b.c(context, q.class.getCanonicalName(), R.attr.colorSurface).data;
        f fVar = new f(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2132018235);
        this.S0 = fVar;
        fVar.i(context);
        this.S0.k(ColorStateList.valueOf(i11));
        f fVar2 = this.S0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        fVar2.j(y.i.i(decorView));
        return dialog;
    }

    public final d<S> e0() {
        if (this.C0 == null) {
            this.C0 = (d) this.f1568g.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.C0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i0() {
        /*
            r8 = this;
            r8.U()
            int r0 = r8.B0
            if (r0 == 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            com.google.android.material.datepicker.d r0 = r8.e0()
            int r0 = r0.i()
        L_0x0010:
            com.google.android.material.datepicker.d r1 = r8.e0()
            com.google.android.material.datepicker.a r2 = r8.E0
            com.google.android.material.datepicker.f r3 = r8.F0
            com.google.android.material.datepicker.i r4 = new com.google.android.material.datepicker.i
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r1, r2)
            java.lang.String r7 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r7, r3)
            com.google.android.material.datepicker.v r2 = r2.f3091d
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            r5.putParcelable(r3, r2)
            r4.Y(r5)
            r8.G0 = r4
            com.google.android.material.internal.CheckableImageButton r2 = r8.R0
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L_0x0069
            com.google.android.material.datepicker.d r3 = r8.e0()
            com.google.android.material.datepicker.a r4 = r8.E0
            com.google.android.material.datepicker.u r5 = new com.google.android.material.datepicker.u
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r7.putParcelable(r0, r3)
            r7.putParcelable(r1, r4)
            r5.Y(r7)
            goto L_0x006b
        L_0x0069:
            com.google.android.material.datepicker.i<S> r5 = r8.G0
        L_0x006b:
            r8.D0 = r5
            android.widget.TextView r0 = r8.P0
            r1 = 0
            if (r2 == 0) goto L_0x0087
            android.content.res.Resources r2 = r8.q()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            r3 = 2
            if (r2 != r3) goto L_0x0081
            r2 = 1
            goto L_0x0082
        L_0x0081:
            r2 = r1
        L_0x0082:
            if (r2 == 0) goto L_0x0087
            java.lang.CharSequence r2 = r8.W0
            goto L_0x0089
        L_0x0087:
            java.lang.CharSequence r2 = r8.V0
        L_0x0089:
            r0.setText(r2)
            com.google.android.material.datepicker.d r0 = r8.e0()
            r8.l()
            java.lang.String r0 = r0.h()
            android.widget.TextView r2 = r8.Q0
            com.google.android.material.datepicker.d r3 = r8.e0()
            r8.U()
            java.lang.String r3 = r3.m()
            r2.setContentDescription(r3)
            android.widget.TextView r2 = r8.Q0
            r2.setText(r0)
            androidx.fragment.app.y r0 = r8.k()
            r0.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r0)
            r0 = 2131296603(0x7f09015b, float:1.8211127E38)
            com.google.android.material.datepicker.a0<S> r3 = r8.D0
            r2.d(r0, r3)
            boolean r0 = r2.f1496g
            if (r0 != 0) goto L_0x00d4
            androidx.fragment.app.y r0 = r2.f1409p
            r0.z(r2, r1)
            com.google.android.material.datepicker.a0<S> r0 = r8.D0
            com.google.android.material.datepicker.q$d r1 = new com.google.android.material.datepicker.q$d
            r1.<init>()
            r0.b0(r1)
            return
        L_0x00d4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.q.i0():void");
    }

    public final void j0(CheckableImageButton checkableImageButton) {
        this.R0.setContentDescription(checkableImageButton.getContext().getString(this.R0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f3152z0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.A0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.F;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}

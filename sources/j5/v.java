package j5;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h0.q;
import h0.s0;
import j5.x;
import w4.b;

public final class v implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x.a f8710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.b f8711b;

    public v(b bVar, x.b bVar2) {
        this.f8710a = bVar;
        this.f8711b = bVar2;
    }

    public final s0 a(View view, s0 s0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        x.a aVar = this.f8710a;
        x.b bVar = this.f8711b;
        int i14 = bVar.f8712a;
        int i15 = bVar.f8713b;
        int i16 = bVar.f8714c;
        b bVar2 = (b) aVar;
        bVar2.getClass();
        a0.b a10 = s0Var.a(7);
        a0.b a11 = s0Var.a(32);
        bVar2.f12752b.w = a10.f5b;
        boolean a12 = x.a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = bVar2.f12752b;
        if (bottomSheetBehavior.f2951o) {
            bottomSheetBehavior.f2957v = s0Var.b();
            paddingBottom = bVar2.f12752b.f2957v + i16;
        }
        BottomSheetBehavior bottomSheetBehavior2 = bVar2.f12752b;
        if (bottomSheetBehavior2.f2952p) {
            if (a12) {
                i13 = i15;
            } else {
                i13 = i14;
            }
            paddingLeft = i13 + a10.f4a;
        }
        if (bottomSheetBehavior2.f2953q) {
            if (!a12) {
                i14 = i15;
            }
            paddingRight = i14 + a10.f6c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = bVar2.f12752b;
        boolean z9 = false;
        boolean z10 = true;
        if (bottomSheetBehavior3.f2955s && marginLayoutParams.leftMargin != (i12 = a10.f4a)) {
            marginLayoutParams.leftMargin = i12;
            z9 = true;
        }
        if (bottomSheetBehavior3.f2956t && marginLayoutParams.rightMargin != (i11 = a10.f6c)) {
            marginLayoutParams.rightMargin = i11;
            z9 = true;
        }
        if (!bottomSheetBehavior3.u || marginLayoutParams.topMargin == (i10 = a10.f5b)) {
            z10 = z9;
        } else {
            marginLayoutParams.topMargin = i10;
        }
        if (z10) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z11 = bVar2.f12751a;
        if (z11) {
            bVar2.f12752b.f2949m = a11.f7d;
        }
        BottomSheetBehavior bottomSheetBehavior4 = bVar2.f12752b;
        if (bottomSheetBehavior4.f2951o || z11) {
            bottomSheetBehavior4.J();
        }
        return s0Var;
    }
}

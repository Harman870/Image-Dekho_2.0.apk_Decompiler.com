package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.appcompat.widget.y0;
import com.ironsource.sdk.mediation.R;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f811b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static j f812c;

    /* renamed from: a  reason: collision with root package name */
    public y0 f813a;

    public class a implements y0.b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f814a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f815b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, com.imgdkh.app.R.drawable.abc_seekbar_tick_mark_material, com.imgdkh.app.R.drawable.abc_ic_menu_share_mtrl_alpha, com.imgdkh.app.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, com.imgdkh.app.R.drawable.abc_ic_menu_cut_mtrl_alpha, com.imgdkh.app.R.drawable.abc_ic_menu_selectall_mtrl_alpha, com.imgdkh.app.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f816c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, com.imgdkh.app.R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f817d = {R.drawable.abc_popup_background_mtrl_mult, com.imgdkh.app.R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f818e = {com.imgdkh.app.R.drawable.abc_tab_indicator_material, com.imgdkh.app.R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f819f = {com.imgdkh.app.R.drawable.abc_btn_check_material, com.imgdkh.app.R.drawable.abc_btn_radio_material, com.imgdkh.app.R.drawable.abc_btn_check_material_anim, com.imgdkh.app.R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int c10 = d1.c(context, com.imgdkh.app.R.attr.colorControlHighlight);
            int b10 = d1.b(context, com.imgdkh.app.R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{d1.f762b, d1.f764d, d1.f763c, d1.f766f}, new int[]{b10, a0.a.b(c10, i10), a0.a.b(c10, i10), i10});
        }

        public static void d(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = o0.f876a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = j.f811b;
            }
            mutate.setColorFilter(j.c(i10, mode));
        }

        public final ColorStateList c(Context context, int i10) {
            if (i10 == com.imgdkh.app.R.drawable.abc_edit_text_material) {
                return y.a.b(context, com.imgdkh.app.R.color.abc_tint_edittext);
            }
            if (i10 == 2131165312) {
                return y.a.b(context, com.imgdkh.app.R.color.abc_tint_switch_track);
            }
            if (i10 == com.imgdkh.app.R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d10 = d1.d(context, com.imgdkh.app.R.attr.colorSwitchThumbNormal);
                if (d10 == null || !d10.isStateful()) {
                    iArr[0] = d1.f762b;
                    iArr2[0] = d1.b(context, com.imgdkh.app.R.attr.colorSwitchThumbNormal);
                    iArr[1] = d1.f765e;
                    iArr2[1] = d1.c(context, com.imgdkh.app.R.attr.colorControlActivated);
                    iArr[2] = d1.f766f;
                    iArr2[2] = d1.c(context, com.imgdkh.app.R.attr.colorSwitchThumbNormal);
                } else {
                    int[] iArr3 = d1.f762b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = d1.f765e;
                    iArr2[1] = d1.c(context, com.imgdkh.app.R.attr.colorControlActivated);
                    iArr[2] = d1.f766f;
                    iArr2[2] = d10.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == com.imgdkh.app.R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, d1.c(context, com.imgdkh.app.R.attr.colorButtonNormal));
            } else {
                if (i10 == com.imgdkh.app.R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == com.imgdkh.app.R.drawable.abc_btn_colored_material) {
                    return b(context, d1.c(context, com.imgdkh.app.R.attr.colorAccent));
                }
                if (i10 == 2131165307 || i10 == com.imgdkh.app.R.drawable.abc_spinner_textfield_background_material) {
                    return y.a.b(context, com.imgdkh.app.R.color.abc_tint_spinner);
                }
                if (a(this.f815b, i10)) {
                    return d1.d(context, com.imgdkh.app.R.attr.colorControlNormal);
                }
                if (a(this.f818e, i10)) {
                    return y.a.b(context, com.imgdkh.app.R.color.abc_tint_default);
                }
                if (a(this.f819f, i10)) {
                    return y.a.b(context, com.imgdkh.app.R.color.abc_tint_btn_checkable);
                }
                if (i10 == com.imgdkh.app.R.drawable.abc_seekbar_thumb_material) {
                    return y.a.b(context, com.imgdkh.app.R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f812c == null) {
                d();
            }
            jVar = f812c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter g10;
        synchronized (j.class) {
            g10 = y0.g(i10, mode);
        }
        return g10;
    }

    public static synchronized void d() {
        synchronized (j.class) {
            if (f812c == null) {
                j jVar = new j();
                f812c = jVar;
                jVar.f813a = y0.c();
                y0 y0Var = f812c.f813a;
                a aVar = new a();
                synchronized (y0Var) {
                    y0Var.f1005e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, g1 g1Var, int[] iArr) {
        boolean z9;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = y0.f998f;
        int[] state = drawable.getState();
        int[] iArr2 = o0.f876a;
        if (drawable.mutate() == drawable) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = g1Var.f786d;
        if (z10 || g1Var.f785c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z10) {
                colorStateList = g1Var.f783a;
            } else {
                colorStateList = null;
            }
            if (g1Var.f785c) {
                mode = g1Var.f784b;
            } else {
                mode = y0.f998f;
            }
            if (!(colorStateList == null || mode == null)) {
                porterDuffColorFilter = y0.g(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        drawable.clearColorFilter();
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f813a.e(context, i10);
    }
}

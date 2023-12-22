package c;

import android.os.Bundle;
import c2.d;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.imgdkh.app.R;
import e9.a1;
import e9.b1;
import e9.c0;
import e9.y;
import e9.z;
import g7.m;
import h6.b;
import h6.b0;
import h6.s;
import h6.t;
import h9.c;
import h9.p;
import i4.k;
import i4.p2;
import i4.q2;
import j4.b9;
import j4.c9;
import j4.ga;
import j4.i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import n4.e;
import n4.u2;
import n4.w2;
import o8.f;
import o8.h;
import q1.w;
import r3.n;
import r3.o;

public class a implements d, m, SuccessContinuation, e, u2, n {
    public static final int[] A = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] B = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] C = {16842766, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.borderWidth, R.attr.elevation, R.attr.ensureMinTouchTargetSize, R.attr.fabCustomSize, R.attr.fabSize, R.attr.hideMotionSpec, R.attr.hoveredFocusedTranslationZ, R.attr.maxImageSize, R.attr.pressedTranslationZ, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.useCompatPadding};
    public static final int[] D = {R.attr.behavior_autoHide};
    public static final int[] E = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] F = {16843296, 16843916, R.attr.simpleItemLayout, R.attr.simpleItemSelectedColor, R.attr.simpleItemSelectedRippleColor, R.attr.simpleItems};
    public static final int[] G = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth, R.attr.toggleCheckedStateOnClick};
    public static final int[] H = {16842766, R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] I = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] J = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] K = {16843015, R.attr.buttonCompat, R.attr.buttonIcon, R.attr.buttonIconTint, R.attr.buttonIconTintMode, R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.checkedState, R.attr.errorAccessibilityLabel, R.attr.errorShown, R.attr.useMaterialThemeColors};
    public static final int[] L = {R.attr.buttonTint, R.attr.useMaterialThemeColors};
    public static final int[] M = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] N = {16843958, 16844159, R.attr.lineHeight};
    public static final int[] O = {16842804, 16844159, R.attr.lineHeight};
    public static final int[] P = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};
    public static final int[] Q = {16842931, 16842964, 16842973, 16843039, R.attr.bottomInsetScrimEnabled, R.attr.dividerInsetEnd, R.attr.dividerInsetStart, R.attr.drawerLayoutCornerSize, R.attr.elevation, R.attr.headerLayout, R.attr.itemBackground, R.attr.itemHorizontalPadding, R.attr.itemIconPadding, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemMaxLines, R.attr.itemRippleColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemShapeFillColor, R.attr.itemShapeInsetBottom, R.attr.itemShapeInsetEnd, R.attr.itemShapeInsetStart, R.attr.itemShapeInsetTop, R.attr.itemTextAppearance, R.attr.itemTextColor, R.attr.itemVerticalPadding, R.attr.menu, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.subheaderColor, R.attr.subheaderInsetEnd, R.attr.subheaderInsetStart, R.attr.subheaderTextAppearance, R.attr.topInsetScrimEnabled};
    public static final int[] R = {R.attr.materialCircleRadius};
    public static final int[] S = {R.attr.insetForeground};
    public static final int[] T = {R.attr.behavior_overlapTop};
    public static final int[] U = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};
    public static final int[] V = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.coplanarSiblingViewId, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] W = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] X = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] Y = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] Z = {16842766, 16842906, 16843039, 16843071, 16843088, 16843095, 16843098, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMinSize, R.attr.endIconMode, R.attr.endIconScaleType, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorAccessibilityLiveRegion, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconMinSize, R.attr.startIconScaleType, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};

    /* renamed from: a  reason: collision with root package name */
    public static final a f2340a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final z7.e f2341b = new z7.e("COMPLETING_ALREADY", 1);

    /* renamed from: c  reason: collision with root package name */
    public static final z7.e f2342c = new z7.e("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: d  reason: collision with root package name */
    public static final z7.e f2343d = new z7.e("COMPLETING_RETRY", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final z7.e f2344e = new z7.e("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final z7.e f2345f = new z7.e("SEALED", 1);

    /* renamed from: g  reason: collision with root package name */
    public static final c0 f2346g = new c0(true);

    /* renamed from: h  reason: collision with root package name */
    public static final p2 f2347h = new p2();

    /* renamed from: i  reason: collision with root package name */
    public static final q2 f2348i = new q2();

    /* renamed from: j  reason: collision with root package name */
    public static final b9 f2349j = new b9();
    public static final c9 k = new c9();

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f2350l = {R.attr.matProg_barColor, R.attr.matProg_barSpinCycleTime, R.attr.matProg_barWidth, R.attr.matProg_circleRadius, R.attr.matProg_fillRadius, R.attr.matProg_linearProgress, R.attr.matProg_progressIndeterminate, R.attr.matProg_rimColor, R.attr.matProg_rimWidth, R.attr.matProg_spinSpeed};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f2351m = {R.attr.bounceDelay, R.attr.damping, R.attr.disableBounce, R.attr.incrementalDamping, R.attr.nestedScrollingEnabled, R.attr.scrollOrientation, R.attr.triggerOverScrollThreshold};

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ a f2352n = new a();

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ a f2353o = new a();

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f2354o0 = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ a f2355p = new a();
    public static final int[] p0 = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: q  reason: collision with root package name */
    public static final String[] f2356q = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f2357q0 = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f2358r = {"ad_impression"};

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f2359r0 = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f2360s = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* renamed from: s0  reason: collision with root package name */
    public static final int[] f2361s0 = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f2362t = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f2363t0 = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};
    public static final int[] u = {R.attr.elevation};
    public static final int[] u0 = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f2364v = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollColor, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f2365v0 = {16843173, 16844052};
    public static final int[] w = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f2366x = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_significantVelocityThreshold, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.shouldRemoveExpandedCorners};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f2367y = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2368z = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};

    static {
        new c0(false);
    }

    public static final f.a d(Throwable th) {
        x8.f.f(th, "exception");
        return new f.a(th);
    }

    public static boolean e(q2.f... fVarArr) {
        for (q2.f isRunning : fVarArr) {
            if (isRunning.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public static final List f(Object... objArr) {
        x8.f.f(objArr, "elements");
        return objArr.length > 0 ? c9.e.Y(objArr) : p8.f.f10705a;
    }

    public static final void g(z zVar, q8.d dVar, boolean z9) {
        Object obj;
        a1 a1Var;
        Object i10 = zVar.i();
        Throwable f10 = zVar.f(i10);
        if (f10 != null) {
            obj = d(f10);
        } else {
            obj = zVar.g(i10);
        }
        if (z9) {
            c cVar = (c) dVar;
            q8.d<T> dVar2 = cVar.f7044e;
            Object obj2 = cVar.f7046g;
            q8.f b10 = dVar2.b();
            Object c10 = p.c(b10, obj2);
            if (c10 != p.f7069a) {
                a1Var = l(dVar2, b10);
            } else {
                a1Var = null;
            }
            try {
                cVar.f7044e.e(obj);
                h hVar = h.f10610a;
                if (a1Var == null) {
                    p.a(b10, c10);
                    return;
                }
                throw null;
            } catch (Throwable th) {
                if (a1Var != null) {
                    throw null;
                }
                p.a(b10, c10);
                throw th;
            }
        } else {
            dVar.e(obj);
        }
    }

    public static void h(q2.f... fVarArr) {
        for (q2.f start : fVarArr) {
            start.start();
        }
    }

    public static void i(q2.f... fVarArr) {
        for (q2.f stop : fVarArr) {
            stop.stop();
        }
    }

    public static final void k(Object obj) {
        if (obj instanceof f.a) {
            throw ((f.a) obj).f10606a;
        }
    }

    public static final a1 l(q8.d dVar, q8.f fVar) {
        boolean z9;
        a1 a1Var;
        if (!(dVar instanceof s8.d)) {
            return null;
        }
        if (fVar.get(b1.f6221a) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return null;
        }
        s8.d dVar2 = (s8.d) dVar;
        while (true) {
            if (!(dVar2 instanceof y) && (dVar2 = dVar2.d()) != null) {
                if (dVar2 instanceof a1) {
                    a1Var = (a1) dVar2;
                    break;
                }
            }
        }
        a1Var = null;
        if (a1Var == null) {
            return a1Var;
        }
        throw null;
    }

    public static int m(int i10) {
        if (i10 != 1) {
            return i10 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static k n(b bVar, String str) {
        o.h(bVar);
        if (h6.n.class.isAssignableFrom(bVar.getClass())) {
            h6.n nVar = (h6.n) bVar;
            return new k(nVar.f6912a, nVar.f6913b, "google.com", (String) null, (String) null, str, (String) null, (String) null);
        } else if (h6.d.class.isAssignableFrom(bVar.getClass())) {
            return new k((String) null, ((h6.d) bVar).f6907a, "facebook.com", (String) null, (String) null, str, (String) null, (String) null);
        } else {
            if (t.class.isAssignableFrom(bVar.getClass())) {
                t tVar = (t) bVar;
                return new k((String) null, tVar.f6926a, "twitter.com", tVar.f6927b, (String) null, str, (String) null, (String) null);
            } else if (h6.m.class.isAssignableFrom(bVar.getClass())) {
                return new k((String) null, ((h6.m) bVar).f6911a, "github.com", (String) null, (String) null, str, (String) null, (String) null);
            } else {
                if (s.class.isAssignableFrom(bVar.getClass())) {
                    return new k((String) null, (String) null, "playgames.google.com", (String) null, ((s) bVar).f6925a, str, (String) null, (String) null);
                }
                if (b0.class.isAssignableFrom(bVar.getClass())) {
                    b0 b0Var = (b0) bVar;
                    k kVar = b0Var.f6898d;
                    if (kVar != null) {
                        return kVar;
                    }
                    return new k(b0Var.f6896b, b0Var.f6897c, b0Var.f6895a, b0Var.f6900f, (String) null, str, b0Var.f6899e, b0Var.f6901g);
                }
                throw new IllegalArgumentException("Unsupported credential type.");
            }
        }
    }

    public static byte[] o(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long j10 = 67108863;
        long r4 = (r(0, bArr3) >> 0) & 67108863;
        long r10 = (r(3, bArr3) >> 2) & 67108863 & 67108611;
        long r11 = (r(6, bArr3) >> 4) & 67108863 & 67092735;
        long r12 = (r(9, bArr3) >> 6) & 67108863 & 66076671;
        long r13 = (r(12, bArr3) >> 8) & 67108863 & 1048575;
        long j11 = r10 * 5;
        long j12 = r11 * 5;
        long j13 = r12 * 5;
        long j14 = r13 * 5;
        int i10 = 17;
        byte[] bArr5 = new byte[17];
        long j15 = 0;
        int i11 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        while (true) {
            int length = bArr4.length;
            if (i11 < length) {
                int min = Math.min(16, length - i11);
                System.arraycopy(bArr4, i11, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i10, (byte) 0);
                }
                long r14 = j19 + ((r(0, bArr5) >> 0) & j10);
                long r15 = j15 + ((r(3, bArr5) >> 2) & j10);
                long r16 = j16 + ((r(6, bArr5) >> 4) & j10);
                long r17 = j17 + ((r(9, bArr5) >> 6) & j10);
                long r18 = j18 + (((r(12, bArr5) >> 8) & j10) | ((long) (bArr5[16] << 24)));
                long j20 = (r18 * j11) + (r17 * j12) + (r16 * j13) + (r15 * j14) + (r14 * r4);
                long j21 = (r18 * j12) + (r17 * j13) + (r16 * j14) + (r15 * r4) + (r14 * r10) + (j20 >> 26);
                long j22 = (r18 * j13) + (r17 * j14) + (r16 * r4) + (r15 * r10) + (r14 * r11) + (j21 >> 26);
                long j23 = (r18 * j14) + (r17 * r4) + (r16 * r10) + (r15 * r11) + (r14 * r12) + (j22 >> 26);
                long j24 = r17 * r10;
                long j25 = r18 * r4;
                long j26 = j25 + j24 + (r16 * r11) + (r15 * r12) + (r14 * r13) + (j23 >> 26);
                long j27 = ((j26 >> 26) * 5) + (j20 & 67108863);
                j19 = j27 & 67108863;
                long j28 = (j21 & 67108863) + (j27 >> 26);
                i11 += 16;
                j18 = j26 & 67108863;
                j17 = j23 & 67108863;
                j16 = j22 & 67108863;
                i10 = 17;
                j15 = j28;
                j10 = 67108863;
            } else {
                long j29 = j10;
                long j30 = j16 + (j15 >> 26);
                long j31 = j30 & j29;
                long j32 = j17 + (j30 >> 26);
                long j33 = j32 & j29;
                long j34 = j18 + (j32 >> 26);
                long j35 = j34 & j29;
                long j36 = ((j34 >> 26) * 5) + j19;
                long j37 = j36 & j29;
                long j38 = (j15 & j29) + (j36 >> 26);
                long j39 = j37 + 5;
                long j40 = (j39 >> 26) + j38;
                long j41 = j31 + (j40 >> 26);
                long j42 = j33 + (j41 >> 26);
                long j43 = (j35 + (j42 >> 26)) - 67108864;
                long j44 = j43 >> 63;
                long j45 = ~j44;
                long j46 = (j40 & 67108863 & j45) | (j38 & j44);
                long j47 = (j31 & j44) | (j41 & 67108863 & j45);
                long j48 = (j33 & j44) | (j42 & 67108863 & j45);
                long r19 = r(16, bArr3) + (((j37 & j44) | (j39 & 67108863 & j45) | (j46 << 26)) & 4294967295L);
                long r20 = r(20, bArr3) + (((j46 >> 6) | (j47 << 20)) & 4294967295L) + (r19 >> 32);
                long r21 = r(24, bArr3) + (((j48 << 14) | (j47 >> 12)) & 4294967295L) + (r20 >> 32);
                long r22 = r(28, bArr3);
                byte[] bArr6 = new byte[16];
                t(bArr6, r19 & 4294967295L, 0);
                t(bArr6, r20 & 4294967295L, 4);
                t(bArr6, r21 & 4294967295L, 8);
                t(bArr6, ((((j48 >> 18) | (((j35 & j44) | (j43 & j45)) << 8)) & 4294967295L) + r22 + (r21 >> 32)) & 4294967295L, 12);
                return bArr6;
            }
        }
    }

    public static int p(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static j4.f q(j4.f fVar, o.c cVar, j4.o oVar, Boolean bool, Boolean bool2) {
        j4.f fVar2 = new j4.f();
        Iterator o10 = fVar.o();
        while (o10.hasNext()) {
            int intValue = ((Integer) o10.next()).intValue();
            if (fVar.s(intValue)) {
                j4.p c10 = oVar.c(cVar, Arrays.asList(new j4.p[]{fVar.m(intValue), new i(Double.valueOf((double) intValue)), fVar}));
                if (c10.k().equals(bool)) {
                    return fVar2;
                }
                if (bool2 == null || c10.k().equals(bool2)) {
                    fVar2.r(intValue, c10);
                }
            }
        }
        return fVar2;
    }

    public static long r(int i10, byte[] bArr) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j4.p s(j4.f r9, o.c r10, java.util.ArrayList r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            j4.j4.i(r0, r1, r11)
            r2 = 2
            j4.j4.j(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            j4.p r3 = (j4.p) r3
            j4.p r3 = r10.b(r3)
            boolean r4 = r3 instanceof j4.j
            if (r4 == 0) goto L_0x009f
            int r4 = r11.size()
            if (r4 != r2) goto L_0x0036
            java.lang.Object r11 = r11.get(r1)
            j4.p r11 = (j4.p) r11
            j4.p r11 = r10.b(r11)
            boolean r4 = r11 instanceof j4.h
            if (r4 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            int r11 = r9.j()
            if (r11 == 0) goto L_0x0097
            r11 = 0
        L_0x003d:
            j4.j r3 = (j4.j) r3
            int r4 = r9.j()
            if (r12 == 0) goto L_0x0047
            r5 = r0
            goto L_0x0049
        L_0x0047:
            int r5 = r4 + -1
        L_0x0049:
            r6 = -1
            if (r12 == 0) goto L_0x004e
            int r4 = r4 + r6
            goto L_0x004f
        L_0x004e:
            r4 = r0
        L_0x004f:
            if (r1 == r12) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r6 = r1
        L_0x0053:
            if (r11 != 0) goto L_0x005a
            j4.p r11 = r9.m(r5)
            goto L_0x0094
        L_0x005a:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x0096
            boolean r12 = r9.s(r5)
            if (r12 == 0) goto L_0x0094
            r12 = 4
            j4.p[] r12 = new j4.p[r12]
            r12[r0] = r11
            j4.p r11 = r9.m(r5)
            r12[r1] = r11
            double r7 = (double) r5
            j4.i r11 = new j4.i
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            j4.p r11 = r3.c(r10, r11)
            boolean r12 = r11 instanceof j4.h
            if (r12 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0094:
            int r5 = r5 + r6
            goto L_0x005a
        L_0x0096:
            return r11
        L_0x0097:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x009f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.s(j4.f, o.c, java.util.ArrayList, boolean):j4.p");
    }

    public static void t(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) ((int) (255 & j10));
            i11++;
            j10 >>= 8;
        }
    }

    public w a(w wVar, o1.h hVar) {
        return wVar;
    }

    public String b(String str, String str2) {
        return null;
    }

    public /* bridge */ /* synthetic */ void c(p3.h hVar) {
    }

    public Object j() {
        return new TreeMap();
    }

    public Task then(Object obj) {
        boolean z9;
        Bundle bundle = (Bundle) obj;
        int i10 = n3.c.f9525h;
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            bundle = null;
        }
        return Tasks.forResult(bundle);
    }

    public Object zza() {
        List list = w2.f10205a;
        return Long.valueOf(ga.f8203b.zza().t());
    }
}

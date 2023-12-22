package y3;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.s1;
import androidx.cardview.widget.CardView;
import b6.g;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.config.VersionInfo;
import e9.n0;
import e9.q;
import e9.r;
import g7.m;
import h6.q;
import i4.fd;
import i4.m6;
import i4.n6;
import i4.o6;
import i4.p;
import i4.r6;
import i4.tb;
import i4.v6;
import i4.z7;
import j2.a;
import j4.ga;
import j4.j;
import j4.j4;
import j4.l;
import j4.m5;
import j4.n5;
import j4.o5;
import j4.q6;
import j4.t;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import n4.i4;
import n4.u2;
import n4.w2;
import o.c;
import o1.d;
import o1.h;
import q1.w;
import q8.f;
import r3.o;
import w3.b;
import z7.e;

public class a implements d, c2.d, m, u2, b {
    public static final int[] A = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};
    public static final int[] B = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] C = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] D = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] E = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] F = {16842960, 16842994, 16842995};
    public static final int[] G = {R.attr.stl_clickable, R.attr.stl_customTabTextLayoutId, R.attr.stl_customTabTextViewId, R.attr.stl_defaultTabBackground, R.attr.stl_defaultTabTextAllCaps, R.attr.stl_defaultTabTextColor, R.attr.stl_defaultTabTextHorizontalPadding, R.attr.stl_defaultTabTextMinWidth, R.attr.stl_defaultTabTextSize, R.attr.stl_distributeEvenly, R.attr.stl_dividerColor, R.attr.stl_dividerColors, R.attr.stl_dividerThickness, R.attr.stl_drawDecorationAfterTab, R.attr.stl_indicatorAlwaysInCenter, R.attr.stl_indicatorColor, R.attr.stl_indicatorColors, R.attr.stl_indicatorCornerRadius, R.attr.stl_indicatorGravity, R.attr.stl_indicatorInFront, R.attr.stl_indicatorInterpolation, R.attr.stl_indicatorThickness, R.attr.stl_indicatorWidth, R.attr.stl_indicatorWithoutPadding, R.attr.stl_overlineColor, R.attr.stl_overlineThickness, R.attr.stl_titleOffset, R.attr.stl_underlineColor, R.attr.stl_underlineThickness};
    public static final e H = new e("NO_DECISION", 1);
    public static final /* synthetic */ a I = new a();
    public static final String[] J = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] K = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] L = {"items"};
    public static final String[] M = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static final int[] N = {16842755, 16842960, 16842961};
    public static final int[] O = {16842755, 16842961};
    public static final a P = new a();

    /* renamed from: a  reason: collision with root package name */
    public static Context f13020a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f13021b;

    /* renamed from: c  reason: collision with root package name */
    public static a f13022c;

    /* renamed from: d  reason: collision with root package name */
    public static z7 f13023d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f13024e = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f13025f = {16842931};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f13026g = {16843071};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f13027h = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f13028i = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f13029j = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
    public static final int[] k = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f13030l = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f13031m = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f13032n = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f13033o = {R.attr.allowStacking};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f13034p = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f13035q = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f13036r = {R.attr.arrowHeadLength, R.attr.arrowShaftLength, R.attr.barLength, R.attr.color, R.attr.drawableSize, R.attr.gapBetweenBars, R.attr.spinBars, R.attr.thickness};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f13037s = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f13038t = {16843436, 16843437};
    public static final int[] u = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f13039v = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] w = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f13040x = {16843126, 16843465, R.attr.overlapAnchor};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f13041y = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f13042z = {16842804, 16842970, 16843039, 16843087, 16843088, 16843296, 16843364, R.attr.animateMenuItems, R.attr.animateNavigationIcon, R.attr.autoShowKeyboard, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.headerLayout, R.attr.hideNavigationIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.searchPrefixText, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.useDrawerArrowDrawable, R.attr.voiceIcon};

    public /* synthetic */ a() {
    }

    public static void A(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable != null) {
            int G2 = G(i10, parcel);
            parcelable.writeToParcel(parcel, i11);
            S(G2, parcel);
        }
    }

    public static void B(Parcel parcel, int i10, String str) {
        if (str != null) {
            int G2 = G(i10, parcel);
            parcel.writeString(str);
            S(G2, parcel);
        }
    }

    public static void C(Parcel parcel, int i10, List list) {
        if (list != null) {
            int G2 = G(i10, parcel);
            parcel.writeStringList(list);
            S(G2, parcel);
        }
    }

    public static void D(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr != null) {
            int G2 = G(i10, parcel);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    W(parcel, parcelable, i11);
                }
            }
            S(G2, parcel);
        }
    }

    public static void E(Parcel parcel, int i10, List list) {
        if (list != null) {
            int G2 = G(i10, parcel);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = (Parcelable) list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    W(parcel, parcelable, 0);
                }
            }
            S(G2, parcel);
        }
    }

    public static int F(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i11 = 0;
        while (i11 < 6) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            } else if (i13 == i10) {
                return i12;
            } else {
                i11++;
            }
        }
        return 1;
    }

    public static int G(int i10, Parcel parcel) {
        parcel.writeInt(i10 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static p H(q qVar) {
        if (!TextUtils.isEmpty(qVar.f6919f)) {
            String str = qVar.f6917d;
            String str2 = qVar.f6919f;
            boolean z9 = qVar.f6918e;
            p pVar = new p();
            o.e(str);
            pVar.f7576a = str;
            o.e(str2);
            pVar.f7579d = str2;
            pVar.f7581f = z9;
            return pVar;
        }
        String str3 = qVar.f6914a;
        String str4 = qVar.f6915b;
        boolean z10 = qVar.f6918e;
        p pVar2 = new p();
        o.e(str3);
        pVar2.f7577b = str3;
        o.e(str4);
        pVar2.f7578c = str4;
        pVar2.f7581f = z10;
        return pVar2;
    }

    public static o6 I(tb tbVar) {
        if (tbVar.y() == 3) {
            return new m6(16);
        }
        if (tbVar.y() == 4) {
            return new m6(32);
        }
        if (tbVar.y() == 5) {
            return new n6();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static j4.p J(l lVar, t tVar, c cVar, ArrayList arrayList) {
        if (lVar.g(tVar.f8469a)) {
            j4.p h10 = lVar.h(tVar.f8469a);
            if (h10 instanceof j) {
                return ((j) h10).c(cVar, arrayList);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{tVar.f8469a}));
        } else if ("hasOwnProperty".equals(tVar.f8469a)) {
            j4.h("hasOwnProperty", 1, arrayList);
            if (lVar.g(cVar.b((j4.p) arrayList.get(0)).zzi())) {
                return j4.p.f8378h0;
            }
            return j4.p.f8379i0;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{tVar.f8469a}));
        }
    }

    public static m5 K(m5 m5Var) {
        return ((m5Var instanceof o5) || (m5Var instanceof n5)) ? m5Var : m5Var instanceof Serializable ? new n5(m5Var) : new o5(m5Var);
    }

    public static String L() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb.append("-");
                    sb.append(country2);
                }
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String M(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "UNRECOGNIZED" : "DHKEM_P521_HKDF_SHA512" : "DHKEM_P384_HKDF_SHA384" : "DHKEM_P256_HKDF_SHA256" : "DHKEM_X25519_HKDF_SHA256" : "KEM_UNKNOWN";
    }

    public static String N(q6 q6Var) {
        String str;
        StringBuilder sb = new StringBuilder(q6Var.g());
        for (int i10 = 0; i10 < q6Var.g(); i10++) {
            int a10 = q6Var.a(i10);
            if (a10 == 34) {
                str = "\\\"";
            } else if (a10 == 39) {
                str = "\\'";
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a10 >>> 6) & 3) + 48));
                            sb.append((char) (((a10 >>> 3) & 7) + 48));
                            a10 = (a10 & 7) + 48;
                        }
                        sb.append((char) a10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String O(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb.append("0123456789abcdef".charAt(b11 >> 4));
            sb.append("0123456789abcdef".charAt(b11 & 15));
        }
        return sb.toString();
    }

    public static byte[] P(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            int i10 = 0;
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b10 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b10;
            copyOf[31] = (byte) (b10 | 64);
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i11 = 0;
                while (i11 < 7) {
                    byte[][] bArr5 = fd.f7312a;
                    if (!c6.b.J(bArr5[i11], copyOf2)) {
                        i11++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(O(bArr5[i11])));
                    }
                }
                int i12 = 10;
                long[] jArr2 = new long[10];
                for (int i13 = 0; i13 < 10; i13++) {
                    int i14 = c6.b.f2477i[i13];
                    jArr2[i13] = (((((long) (copyOf2[i14 + 3] & 255)) << 24) | ((((long) (copyOf2[i14] & 255)) | (((long) (copyOf2[i14 + 1] & 255)) << 8)) | (((long) (copyOf2[i14 + 2] & 255)) << 16))) >> c6.b.f2478j[i13]) & ((long) c6.b.k[i13 & 1]);
                }
                long[] jArr3 = new long[19];
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                jArr5[0] = 1;
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                long[] jArr8 = new long[19];
                jArr8[0] = 1;
                long[] jArr9 = new long[19];
                long[] jArr10 = new long[19];
                jArr10[0] = 1;
                System.arraycopy(jArr2, 0, jArr3, 0, 10);
                int i15 = 0;
                while (i15 < 32) {
                    byte b11 = copyOf[(32 - i15) - 1] & 255;
                    int i16 = 8;
                    while (i10 < i16) {
                        int i17 = (b11 >> (7 - i10)) & 1;
                        fd.a(jArr5, jArr3, i17);
                        fd.a(jArr6, jArr4, i17);
                        byte[] bArr6 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr5, i12);
                        byte b12 = b11;
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i18 = i15;
                        long[] jArr13 = new long[19];
                        int i19 = i10;
                        long[] jArr14 = new long[19];
                        int i20 = i17;
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr10;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        c6.b.S(jArr5, jArr5, jArr6);
                        c6.b.R(jArr6, copyOf3, jArr6);
                        long[] copyOf4 = Arrays.copyOf(jArr3, 10);
                        c6.b.S(jArr3, jArr3, jArr4);
                        c6.b.R(jArr4, copyOf4, jArr4);
                        c6.b.I(jArr14, jArr3, jArr6);
                        c6.b.I(jArr15, jArr5, jArr4);
                        c6.b.N(jArr14);
                        c6.b.L(jArr14);
                        c6.b.N(jArr15);
                        c6.b.L(jArr15);
                        long[] jArr19 = jArr3;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        c6.b.S(jArr14, jArr14, jArr15);
                        c6.b.R(jArr15, copyOf4, jArr15);
                        c6.b.Q(jArr18, jArr14);
                        c6.b.Q(jArr17, jArr15);
                        c6.b.I(jArr15, jArr17, jArr2);
                        c6.b.N(jArr15);
                        c6.b.L(jArr15);
                        System.arraycopy(jArr18, 0, jArr7, 0, 10);
                        System.arraycopy(jArr15, 0, jArr8, 0, 10);
                        c6.b.Q(jArr12, jArr5);
                        c6.b.Q(jArr13, jArr6);
                        c6.b.I(jArr9, jArr12, jArr13);
                        c6.b.N(jArr9);
                        c6.b.L(jArr9);
                        c6.b.R(jArr13, jArr12, jArr13);
                        long[] jArr20 = new long[19];
                        Arrays.fill(jArr20, 10, 18, 0);
                        int i21 = 0;
                        for (int i22 = 10; i21 < i22; i22 = 10) {
                            jArr20[i21] = jArr13[i21] * 121665;
                            i21++;
                        }
                        c6.b.L(jArr20);
                        c6.b.S(jArr20, jArr20, jArr12);
                        long[] jArr21 = jArr16;
                        c6.b.I(jArr21, jArr13, jArr20);
                        c6.b.N(jArr21);
                        c6.b.L(jArr21);
                        int i23 = i20;
                        fd.a(jArr9, jArr7, i23);
                        fd.a(jArr21, jArr8, i23);
                        i10 = i19 + 1;
                        jArr3 = jArr7;
                        b11 = b12;
                        copyOf = bArr6;
                        jArr = jArr11;
                        i15 = i18;
                        jArr7 = jArr19;
                        i12 = 10;
                        i16 = 8;
                        long[] jArr22 = jArr6;
                        jArr6 = jArr21;
                        jArr10 = jArr22;
                        long[] jArr23 = jArr5;
                        jArr5 = jArr9;
                        jArr9 = jArr23;
                        long[] jArr24 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr24;
                    }
                    byte[] bArr7 = copyOf;
                    long[] jArr25 = jArr;
                    long[] jArr26 = jArr3;
                    i15++;
                    i10 = 0;
                    i12 = 10;
                }
                long[] jArr27 = jArr;
                int i24 = i12;
                long[] jArr28 = new long[i24];
                long[] jArr29 = new long[i24];
                long[] jArr30 = new long[i24];
                long[] jArr31 = new long[i24];
                long[] jArr32 = new long[i24];
                long[] jArr33 = new long[i24];
                long[] jArr34 = new long[i24];
                long[] jArr35 = new long[i24];
                long[] jArr36 = new long[i24];
                long[] jArr37 = new long[i24];
                long[] jArr38 = jArr3;
                long[] jArr39 = new long[i24];
                c6.b.Q(jArr29, jArr6);
                c6.b.Q(jArr39, jArr29);
                c6.b.Q(jArr37, jArr39);
                c6.b.F(jArr30, jArr37, jArr6);
                c6.b.F(jArr31, jArr30, jArr29);
                c6.b.Q(jArr37, jArr31);
                c6.b.F(jArr32, jArr37, jArr30);
                c6.b.Q(jArr37, jArr32);
                c6.b.Q(jArr39, jArr37);
                c6.b.Q(jArr37, jArr39);
                c6.b.Q(jArr39, jArr37);
                c6.b.Q(jArr37, jArr39);
                c6.b.F(jArr33, jArr37, jArr32);
                c6.b.Q(jArr37, jArr33);
                c6.b.Q(jArr39, jArr37);
                for (int i25 = 2; i25 < 10; i25 += 2) {
                    c6.b.Q(jArr37, jArr39);
                    c6.b.Q(jArr39, jArr37);
                }
                c6.b.F(jArr34, jArr39, jArr33);
                c6.b.Q(jArr37, jArr34);
                c6.b.Q(jArr39, jArr37);
                for (int i26 = 2; i26 < 20; i26 += 2) {
                    c6.b.Q(jArr37, jArr39);
                    c6.b.Q(jArr39, jArr37);
                }
                c6.b.F(jArr37, jArr39, jArr34);
                c6.b.Q(jArr39, jArr37);
                c6.b.Q(jArr37, jArr39);
                for (int i27 = 2; i27 < 10; i27 += 2) {
                    c6.b.Q(jArr39, jArr37);
                    c6.b.Q(jArr37, jArr39);
                }
                c6.b.F(jArr35, jArr37, jArr33);
                c6.b.Q(jArr37, jArr35);
                c6.b.Q(jArr39, jArr37);
                for (int i28 = 2; i28 < 50; i28 += 2) {
                    c6.b.Q(jArr37, jArr39);
                    c6.b.Q(jArr39, jArr37);
                }
                c6.b.F(jArr36, jArr39, jArr35);
                c6.b.Q(jArr39, jArr36);
                c6.b.Q(jArr37, jArr39);
                for (int i29 = 2; i29 < 100; i29 += 2) {
                    c6.b.Q(jArr39, jArr37);
                    c6.b.Q(jArr37, jArr39);
                }
                c6.b.F(jArr39, jArr37, jArr36);
                c6.b.Q(jArr37, jArr39);
                c6.b.Q(jArr39, jArr37);
                for (int i30 = 2; i30 < 50; i30 += 2) {
                    c6.b.Q(jArr37, jArr39);
                    c6.b.Q(jArr39, jArr37);
                }
                c6.b.F(jArr37, jArr39, jArr35);
                c6.b.Q(jArr39, jArr37);
                c6.b.Q(jArr37, jArr39);
                c6.b.Q(jArr39, jArr37);
                c6.b.Q(jArr37, jArr39);
                c6.b.Q(jArr39, jArr37);
                c6.b.F(jArr28, jArr39, jArr31);
                long[] jArr40 = jArr27;
                c6.b.F(jArr40, jArr5, jArr28);
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[10];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                long[] jArr45 = new long[11];
                c6.b.F(jArr41, jArr2, jArr40);
                c6.b.S(jArr42, jArr2, jArr40);
                long[] jArr46 = new long[10];
                jArr46[0] = 486662;
                c6.b.S(jArr44, jArr42, jArr46);
                c6.b.F(jArr44, jArr44, jArr4);
                long[] jArr47 = jArr38;
                c6.b.S(jArr44, jArr44, jArr47);
                c6.b.F(jArr44, jArr44, jArr41);
                c6.b.F(jArr44, jArr44, jArr47);
                for (int i31 = 0; i31 < 10; i31++) {
                    jArr43[i31] = jArr44[i31] * 4;
                }
                c6.b.L(jArr43);
                c6.b.F(jArr44, jArr41, jArr4);
                c6.b.R(jArr44, jArr44, jArr4);
                c6.b.F(jArr45, jArr42, jArr47);
                c6.b.S(jArr44, jArr44, jArr45);
                c6.b.Q(jArr44, jArr44);
                if (c6.b.J(c6.b.T(jArr43), c6.b.T(jArr44))) {
                    return c6.b.T(jArr40);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(O(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static r6 Q(tb tbVar) {
        if (tbVar.A() == 3) {
            return new g(new u1.t((Object) "HmacSha256"));
        }
        if (tbVar.A() == 4) {
            return v6.b(1);
        }
        if (tbVar.A() == 5) {
            return v6.b(2);
        }
        if (tbVar.A() == 6) {
            return v6.b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static String R(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }

    public static void S(int i10, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static byte[] T(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i10 = 0; i10 < 16; i10++) {
                byte b10 = bArr[i10];
                byte b11 = (byte) ((b10 + b10) & 254);
                bArr2[i10] = b11;
                if (i10 < 15) {
                    bArr2[i10] = (byte) (((bArr[i10 + 1] >> 7) & 1) | b11);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static String U(Context context, String str) {
        o.h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = i4.a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static u1.t V(tb tbVar) {
        if (tbVar.z() == 3) {
            return new u1.t((Object) "HmacSha256");
        }
        if (tbVar.z() == 4) {
            return new u1.t((Object) "HmacSha384");
        }
        if (tbVar.z() == 5) {
            return new u1.t((Object) "HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static void W(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static boolean X(byte b10) {
        return b10 > -65;
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b6.l lVar = (b6.l) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", lVar.a());
            bundle.putLong("event_timestamp", lVar.b());
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x0039
        L_0x0005:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x0029
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x0029
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x0029:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
        L_0x0039:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.e(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static final void f(f fVar, CancellationException cancellationException) {
        int i10 = n0.f6254a0;
        n0 n0Var = (n0) fVar.get(n0.b.f6255a);
        if (n0Var != null) {
            n0Var.A(cancellationException);
        }
    }

    public static void g(String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static int i(Context context, String str) {
        boolean z9;
        int i10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = x.f.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !g0.b.a(packageName2, packageName)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                i10 = x.f.c((AppOpsManager) x.f.a(context, AppOpsManager.class), d10, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c10 = x.g.c(context);
                i10 = x.g.a(c10, d10, Binder.getCallingUid(), packageName);
                if (i10 == 0) {
                    i10 = x.g.a(c10, d10, myUid, x.g.b(context));
                }
            } else {
                i10 = x.f.c((AppOpsManager) x.f.a(context, AppOpsManager.class), d10, packageName);
            }
            if (i10 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final void k(f fVar, Throwable th) {
        try {
            e9.q qVar = (e9.q) fVar.get(q.a.f6259a);
            if (qVar == null) {
                r.a(fVar, th);
            } else {
                qVar.handleException(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                z5.c.c(runtimeException, th);
                th = runtimeException;
            }
            r.a(fVar, th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean l(android.content.Context r4) {
        /*
            java.lang.Class<y3.a> r0 = y3.a.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004b }
            android.content.Context r2 = f13020a     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0018
            java.lang.Boolean r3 = f13021b     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x0018
            if (r2 == r1) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x0018:
            r2 = 0
            f13021b = r2     // Catch:{ all -> 0x004b }
            boolean r2 = w3.g.a()     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0030
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004b }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004b }
        L_0x002d:
            f13021b = r4     // Catch:{ all -> 0x004b }
            goto L_0x0041
        L_0x0030:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003e }
            f13021b = r4     // Catch:{ ClassNotFoundException -> 0x003e }
            goto L_0x0041
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004b }
            goto L_0x002d
        L_0x0041:
            f13020a = r1     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = f13021b     // Catch:{ all -> 0x004b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x004b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.l(android.content.Context):boolean");
    }

    public static boolean m(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static void n(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void o(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static void p(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof s1) {
                    editorInfo.hintText = ((s1) parent).a();
                    return;
                }
            }
        }
    }

    public static boolean q(String str) {
        return !str.equals("GET") && !str.equals(VersionInfo.GIT_BRANCH);
    }

    public static void u(Parcel parcel, int i10, boolean z9) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static void v(Parcel parcel, int i10, Bundle bundle) {
        if (bundle != null) {
            int G2 = G(i10, parcel);
            parcel.writeBundle(bundle);
            S(G2, parcel);
        }
    }

    public static void w(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder != null) {
            int G2 = G(i10, parcel);
            parcel.writeStrongBinder(iBinder);
            S(G2, parcel);
        }
    }

    public static void x(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }

    public static void y(Parcel parcel, int i10, long j10) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j10);
    }

    public static void z(Parcel parcel, int i10, Long l6) {
        if (l6 != null) {
            parcel.writeInt(i10 | 524288);
            parcel.writeLong(l6.longValue());
        }
    }

    public w a(w wVar, h hVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((b2.c) wVar.get()).f2210a.f2220a.f2222a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = j2.a.f8002a;
        if (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) {
            bVar = null;
        } else {
            bVar = new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        }
        if (bVar != null && bVar.f8005a == 0 && bVar.f8006b == bVar.f8007c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new y1.b(bArr);
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public boolean d(Object obj, File file, h hVar) {
        try {
            j2.a.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public Object j() {
        return new LinkedHashMap();
    }

    public void r(boolean z9) {
    }

    public void s(boolean z9) {
        throw null;
    }

    public void t(l.a aVar, float f10) {
        float f11;
        CardView.a aVar2 = (CardView.a) aVar;
        l.b bVar = (l.b) aVar2.f1036a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (!(f10 == bVar.f9166e && bVar.f9167f == useCompatPadding && bVar.f9168g == preventCornerOverlap)) {
            bVar.f9166e = f10;
            bVar.f9167f = useCompatPadding;
            bVar.f9168g = preventCornerOverlap;
            bVar.c((Rect) null);
            bVar.invalidateSelf();
        }
        if (!CardView.this.getUseCompatPadding()) {
            aVar2.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = aVar2.f1036a;
        float f12 = ((l.b) drawable).f9166e;
        float f13 = ((l.b) drawable).f9162a;
        if (CardView.this.getPreventCornerOverlap()) {
            f11 = (float) (((1.0d - l.c.f9172a) * ((double) f13)) + ((double) f12));
        } else {
            int i10 = l.c.f9173b;
            f11 = f12;
        }
        int ceil = (int) Math.ceil((double) f11);
        float f14 = f12 * 1.5f;
        if (CardView.this.getPreventCornerOverlap()) {
            f14 = (float) (((1.0d - l.c.f9172a) * ((double) f13)) + ((double) f14));
        }
        int ceil2 = (int) Math.ceil((double) f14);
        aVar2.a(ceil, ceil2, ceil, ceil2);
    }

    public Object zza() {
        List list = w2.f10205a;
        return Long.valueOf(ga.f8203b.zza().zzb());
    }

    public /* synthetic */ a(int i10) {
    }
}

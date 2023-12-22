package z5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.imgdkh.app.R;
import e9.a1;
import e9.d0;
import e9.n0;
import e9.p;
import e9.y0;
import g7.l;
import g7.m;
import h0.l0;
import h0.y;
import j4.m5;
import j6.d;
import j6.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import n4.z;
import q1.g;
import q8.e;
import r5.f;
import r5.h;
import s1.a;
import t8.b;
import x8.f;
import z7.e;

public class c implements d, m, m5, a {

    /* renamed from: a  reason: collision with root package name */
    public static t f13177a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f13178b = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ c f13179c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final e f13180d = new e("UNDEFINED", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final e f13181e = new e("REUSABLE_CLAIMED", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ c f13182f = new c();

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f13183g = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f13184h = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: i  reason: collision with root package name */
    public static final c f13185i = new c();

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f13186j;
    public static final int[] k = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843701, 16843702, 16843840, 16844091, 16844092, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f13187l = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f13188m = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintRotate, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionSteps, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f13189n = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f13190o = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f13191p = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f13192q = {R.attr.onHide, R.attr.onShow};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f13193r = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f13194s = {16842960, R.attr.constraints};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f13195t = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};
    public static final int[] u = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    static {
        int[] iArr = new int[com.ironsource.sdk.mediation.R.styleable.AppCompatTheme_windowMinWidthMajor];
        // fill-array-data instruction
        iArr[0] = 16842948;
        iArr[1] = 16842960;
        iArr[2] = 16842972;
        iArr[3] = 16842996;
        iArr[4] = 16842997;
        iArr[5] = 16842999;
        iArr[6] = 16843000;
        iArr[7] = 16843001;
        iArr[8] = 16843002;
        iArr[9] = 16843039;
        iArr[10] = 16843040;
        iArr[11] = 16843071;
        iArr[12] = 16843072;
        iArr[13] = 16843551;
        iArr[14] = 16843552;
        iArr[15] = 16843553;
        iArr[16] = 16843554;
        iArr[17] = 16843555;
        iArr[18] = 16843556;
        iArr[19] = 16843557;
        iArr[20] = 16843558;
        iArr[21] = 16843559;
        iArr[22] = 16843560;
        iArr[23] = 16843701;
        iArr[24] = 16843702;
        iArr[25] = 16843770;
        iArr[26] = 16843840;
        iArr[27] = 2130903100;
        iArr[28] = 2130903103;
        iArr[29] = 2130903148;
        iArr[30] = 2130903149;
        iArr[31] = 2130903150;
        iArr[32] = 2130903223;
        iArr[33] = 2130903365;
        iArr[34] = 2130903366;
        iArr[35] = 2130903451;
        iArr[36] = 2130903551;
        iArr[37] = 2130903552;
        iArr[38] = 2130903553;
        iArr[39] = 2130903554;
        iArr[40] = 2130903555;
        iArr[41] = 2130903556;
        iArr[42] = 2130903557;
        iArr[43] = 2130903558;
        iArr[44] = 2130903559;
        iArr[45] = 2130903560;
        iArr[46] = 2130903561;
        iArr[47] = 2130903562;
        iArr[48] = 2130903563;
        iArr[49] = 2130903565;
        iArr[50] = 2130903566;
        iArr[51] = 2130903567;
        iArr[52] = 2130903568;
        iArr[53] = 2130903569;
        iArr[54] = 2130903591;
        iArr[55] = 2130903694;
        iArr[56] = 2130903695;
        iArr[57] = 2130903696;
        iArr[58] = 2130903697;
        iArr[59] = 2130903698;
        iArr[60] = 2130903699;
        iArr[61] = 2130903700;
        iArr[62] = 2130903701;
        iArr[63] = 2130903702;
        iArr[64] = 2130903703;
        iArr[65] = 2130903704;
        iArr[66] = 2130903705;
        iArr[67] = 2130903706;
        iArr[68] = 2130903707;
        iArr[69] = 2130903708;
        iArr[70] = 2130903709;
        iArr[71] = 2130903710;
        iArr[72] = 2130903711;
        iArr[73] = 2130903712;
        iArr[74] = 2130903713;
        iArr[75] = 2130903714;
        iArr[76] = 2130903715;
        iArr[77] = 2130903716;
        iArr[78] = 2130903717;
        iArr[79] = 2130903718;
        iArr[80] = 2130903719;
        iArr[81] = 2130903720;
        iArr[82] = 2130903721;
        iArr[83] = 2130903722;
        iArr[84] = 2130903723;
        iArr[85] = 2130903724;
        iArr[86] = 2130903725;
        iArr[87] = 2130903726;
        iArr[88] = 2130903727;
        iArr[89] = 2130903728;
        iArr[90] = 2130903729;
        iArr[91] = 2130903730;
        iArr[92] = 2130903731;
        iArr[93] = 2130903732;
        iArr[94] = 2130903733;
        iArr[95] = 2130903734;
        iArr[96] = 2130903735;
        iArr[97] = 2130903736;
        iArr[98] = 2130903737;
        iArr[99] = 2130903738;
        iArr[100] = 2130903739;
        iArr[101] = 2130903741;
        iArr[102] = 2130903742;
        iArr[103] = 2130903743;
        iArr[104] = 2130903744;
        iArr[105] = 2130903745;
        iArr[106] = 2130903746;
        iArr[107] = 2130903747;
        iArr[108] = 2130903748;
        iArr[109] = 2130903749;
        iArr[110] = 2130903752;
        iArr[111] = 2130903757;
        iArr[112] = 2130903909;
        iArr[113] = 2130903910;
        iArr[114] = 2130903959;
        iArr[115] = 2130903966;
        iArr[116] = 2130903974;
        iArr[117] = 2130903992;
        iArr[118] = 2130903993;
        iArr[119] = 2130903994;
        iArr[120] = 2130904340;
        iArr[121] = 2130904342;
        iArr[122] = 2130904344;
        iArr[123] = 2130904364;
        f13186j = iArr;
    }

    public /* synthetic */ c() {
    }

    public static final void c(Throwable th, Throwable th2) {
        f.f(th, "<this>");
        f.f(th2, "exception");
        if (th != th2) {
            b.f12030a.a(th, th2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0185, code lost:
        if (r3 == r6) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x019b, code lost:
        if (r3 == r6) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x019f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x026e, code lost:
        if (r4.f10877d == r6) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f6, code lost:
        if (r5.f10877d == r6) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x043c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x05f5  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x06aa  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0576 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(q.e r36, o.d r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.B0
            q.b[] r2 = r0.E0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.C0
            q.b[] r2 = r0.D0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0705
            r1 = r15[r9]
            boolean r2 = r1.f10873q
            r17 = 0
            r3 = 3
            r8 = 8
            r5 = 1
            if (r2 != 0) goto L_0x0140
            int r2 = r1.f10868l
            int r2 = r2 * r12
            q.d r6 = r1.f10858a
            r7 = r6
            r18 = 0
        L_0x0031:
            if (r18 != 0) goto L_0x0108
            int r13 = r1.f10866i
            int r13 = r13 + r5
            r1.f10866i = r13
            q.d[] r13 = r6.p0
            int r4 = r1.f10868l
            r13[r4] = r17
            q.d[] r13 = r6.f10920o0
            r13[r4] = r17
            int r13 = r6.f10911j0
            if (r13 == r8) goto L_0x00d8
            int r4 = r6.k(r4)
            if (r4 == r3) goto L_0x004e
            int r4 = r1.f10868l
        L_0x004e:
            q.c[] r4 = r6.S
            r4 = r4[r2]
            r4.e()
            q.c[] r4 = r6.S
            int r13 = r2 + 1
            r4 = r4[r13]
            r4.e()
            q.c[] r4 = r6.S
            r4 = r4[r2]
            r4.e()
            q.c[] r4 = r6.S
            r4 = r4[r13]
            r4.e()
            q.d r4 = r1.f10859b
            if (r4 != 0) goto L_0x0072
            r1.f10859b = r6
        L_0x0072:
            r1.f10861d = r6
            int[] r4 = r6.V
            int r13 = r1.f10868l
            r4 = r4[r13]
            if (r4 != r3) goto L_0x00d8
            int[] r8 = r6.u
            r8 = r8[r13]
            if (r8 == 0) goto L_0x0086
            if (r8 == r3) goto L_0x0086
            if (r8 != r12) goto L_0x00d8
        L_0x0086:
            int r12 = r1.f10867j
            int r12 = r12 + r5
            r1.f10867j = r12
            float[] r12 = r6.f10918n0
            r12 = r12[r13]
            r13 = 0
            int r23 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r23 <= 0) goto L_0x0099
            float r13 = r1.k
            float r13 = r13 + r12
            r1.k = r13
        L_0x0099:
            int r13 = r6.f10911j0
            r5 = 8
            if (r13 == r5) goto L_0x00a7
            if (r4 != r3) goto L_0x00a7
            if (r8 == 0) goto L_0x00a5
            if (r8 != r3) goto L_0x00a7
        L_0x00a5:
            r4 = 1
            goto L_0x00a8
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            if (r4 == 0) goto L_0x00c6
            r4 = 0
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b3
            r4 = 1
            r1.f10870n = r4
            goto L_0x00b6
        L_0x00b3:
            r4 = 1
            r1.f10871o = r4
        L_0x00b6:
            java.util.ArrayList<q.d> r4 = r1.f10865h
            if (r4 != 0) goto L_0x00c1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f10865h = r4
        L_0x00c1:
            java.util.ArrayList<q.d> r4 = r1.f10865h
            r4.add(r6)
        L_0x00c6:
            q.d r4 = r1.f10863f
            if (r4 != 0) goto L_0x00cc
            r1.f10863f = r6
        L_0x00cc:
            q.d r4 = r1.f10864g
            if (r4 == 0) goto L_0x00d6
            q.d[] r4 = r4.f10920o0
            int r5 = r1.f10868l
            r4[r5] = r6
        L_0x00d6:
            r1.f10864g = r6
        L_0x00d8:
            if (r7 == r6) goto L_0x00e0
            q.d[] r4 = r7.p0
            int r5 = r1.f10868l
            r4[r5] = r6
        L_0x00e0:
            q.c[] r4 = r6.S
            int r5 = r2 + 1
            r4 = r4[r5]
            q.c r4 = r4.f10879f
            if (r4 == 0) goto L_0x00f8
            q.d r4 = r4.f10877d
            q.c[] r5 = r4.S
            r5 = r5[r2]
            q.c r5 = r5.f10879f
            if (r5 == 0) goto L_0x00f8
            q.d r5 = r5.f10877d
            if (r5 == r6) goto L_0x00fa
        L_0x00f8:
            r4 = r17
        L_0x00fa:
            if (r4 == 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r4 = r6
            r18 = 1
        L_0x0100:
            r7 = r6
            r5 = 1
            r8 = 8
            r12 = 2
            r6 = r4
            goto L_0x0031
        L_0x0108:
            q.d r4 = r1.f10859b
            if (r4 == 0) goto L_0x0113
            q.c[] r4 = r4.S
            r4 = r4[r2]
            r4.e()
        L_0x0113:
            q.d r4 = r1.f10861d
            if (r4 == 0) goto L_0x0120
            q.c[] r4 = r4.S
            int r2 = r2 + 1
            r2 = r4[r2]
            r2.e()
        L_0x0120:
            r1.f10860c = r6
            int r2 = r1.f10868l
            if (r2 != 0) goto L_0x012d
            boolean r2 = r1.f10869m
            if (r2 == 0) goto L_0x012d
            r1.f10862e = r6
            goto L_0x0131
        L_0x012d:
            q.d r2 = r1.f10858a
            r1.f10862e = r2
        L_0x0131:
            boolean r2 = r1.f10871o
            if (r2 == 0) goto L_0x013b
            boolean r2 = r1.f10870n
            if (r2 == 0) goto L_0x013b
            r2 = 1
            goto L_0x013c
        L_0x013b:
            r2 = 0
        L_0x013c:
            r1.f10872p = r2
            r2 = 1
            goto L_0x0141
        L_0x0140:
            r2 = r5
        L_0x0141:
            r1.f10873q = r2
            if (r11 == 0) goto L_0x0158
            q.d r2 = r1.f10858a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L_0x014e
            goto L_0x0158
        L_0x014e:
            r18 = r9
            r29 = r14
            r31 = r15
            r19 = 0
            goto L_0x06f8
        L_0x0158:
            q.d r12 = r1.f10858a
            q.d r13 = r1.f10860c
            q.d r8 = r1.f10859b
            q.d r7 = r1.f10861d
            q.d r2 = r1.f10862e
            float r4 = r1.k
            int[] r5 = r0.V
            r5 = r5[r39]
            r6 = 2
            if (r5 != r6) goto L_0x016d
            r5 = 1
            goto L_0x016e
        L_0x016d:
            r5 = 0
        L_0x016e:
            if (r39 != 0) goto L_0x0188
            int r3 = r2.f10914l0
            r6 = 1
            if (r3 != 0) goto L_0x0178
            r23 = 1
            goto L_0x017a
        L_0x0178:
            r23 = 0
        L_0x017a:
            if (r3 != r6) goto L_0x0180
            r22 = r6
            r6 = 2
            goto L_0x0183
        L_0x0180:
            r6 = 2
            r22 = 0
        L_0x0183:
            r24 = r23
            if (r3 != r6) goto L_0x019f
            goto L_0x019d
        L_0x0188:
            int r3 = r2.f10916m0
            r6 = 1
            if (r3 != 0) goto L_0x0190
            r24 = 1
            goto L_0x0192
        L_0x0190:
            r24 = 0
        L_0x0192:
            if (r3 != r6) goto L_0x0198
            r6 = 2
            r22 = 1
            goto L_0x019b
        L_0x0198:
            r6 = 2
            r22 = 0
        L_0x019b:
            if (r3 != r6) goto L_0x019f
        L_0x019d:
            r3 = 1
            goto L_0x01a0
        L_0x019f:
            r3 = 0
        L_0x01a0:
            r26 = r4
            r6 = r12
            r25 = 0
        L_0x01a5:
            if (r25 != 0) goto L_0x0284
            q.c[] r4 = r6.S
            r4 = r4[r16]
            if (r3 == 0) goto L_0x01b0
            r28 = 1
            goto L_0x01b2
        L_0x01b0:
            r28 = 4
        L_0x01b2:
            int r29 = r4.e()
            r30 = r9
            int[] r9 = r6.V
            r9 = r9[r39]
            r11 = 3
            if (r9 != r11) goto L_0x01c7
            int[] r9 = r6.u
            r9 = r9[r39]
            if (r9 != 0) goto L_0x01c7
            r9 = 1
            goto L_0x01c8
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            q.c r11 = r4.f10879f
            if (r11 == 0) goto L_0x01d4
            if (r6 == r12) goto L_0x01d4
            int r11 = r11.e()
            int r29 = r11 + r29
        L_0x01d4:
            r11 = r29
            if (r3 == 0) goto L_0x01e1
            if (r6 == r12) goto L_0x01e1
            if (r6 == r8) goto L_0x01e1
            r29 = r14
            r28 = 8
            goto L_0x01e3
        L_0x01e1:
            r29 = r14
        L_0x01e3:
            q.c r14 = r4.f10879f
            if (r14 == 0) goto L_0x0221
            if (r6 != r8) goto L_0x01f6
            r31 = r15
            o.h r15 = r4.f10882i
            o.h r14 = r14.f10882i
            r32 = r2
            r2 = 6
            r10.f(r15, r14, r11, r2)
            goto L_0x0203
        L_0x01f6:
            r32 = r2
            r31 = r15
            o.h r2 = r4.f10882i
            o.h r14 = r14.f10882i
            r15 = 8
            r10.f(r2, r14, r11, r15)
        L_0x0203:
            if (r9 == 0) goto L_0x0209
            if (r3 != 0) goto L_0x0209
            r28 = 5
        L_0x0209:
            if (r6 != r8) goto L_0x0215
            if (r3 == 0) goto L_0x0215
            boolean[] r2 = r6.U
            boolean r2 = r2[r39]
            if (r2 == 0) goto L_0x0215
            r2 = 5
            goto L_0x0217
        L_0x0215:
            r2 = r28
        L_0x0217:
            o.h r9 = r4.f10882i
            q.c r4 = r4.f10879f
            o.h r4 = r4.f10882i
            r10.e(r9, r4, r11, r2)
            goto L_0x0225
        L_0x0221:
            r32 = r2
            r31 = r15
        L_0x0225:
            if (r5 == 0) goto L_0x0258
            int r2 = r6.f10911j0
            r4 = 8
            if (r2 == r4) goto L_0x0246
            int[] r2 = r6.V
            r2 = r2[r39]
            r4 = 3
            if (r2 != r4) goto L_0x0246
            q.c[] r2 = r6.S
            int r4 = r16 + 1
            r4 = r2[r4]
            o.h r4 = r4.f10882i
            r2 = r2[r16]
            o.h r2 = r2.f10882i
            r9 = 5
            r11 = 0
            r10.f(r4, r2, r11, r9)
            goto L_0x0247
        L_0x0246:
            r11 = 0
        L_0x0247:
            q.c[] r2 = r6.S
            r2 = r2[r16]
            o.h r2 = r2.f10882i
            q.c[] r4 = r0.S
            r4 = r4[r16]
            o.h r4 = r4.f10882i
            r9 = 8
            r10.f(r2, r4, r11, r9)
        L_0x0258:
            q.c[] r2 = r6.S
            int r4 = r16 + 1
            r2 = r2[r4]
            q.c r2 = r2.f10879f
            if (r2 == 0) goto L_0x0270
            q.d r2 = r2.f10877d
            q.c[] r4 = r2.S
            r4 = r4[r16]
            q.c r4 = r4.f10879f
            if (r4 == 0) goto L_0x0270
            q.d r4 = r4.f10877d
            if (r4 == r6) goto L_0x0272
        L_0x0270:
            r2 = r17
        L_0x0272:
            if (r2 == 0) goto L_0x0276
            r6 = r2
            goto L_0x0278
        L_0x0276:
            r25 = 1
        L_0x0278:
            r11 = r38
            r14 = r29
            r9 = r30
            r15 = r31
            r2 = r32
            goto L_0x01a5
        L_0x0284:
            r32 = r2
            r30 = r9
            r29 = r14
            r31 = r15
            if (r7 == 0) goto L_0x02ee
            q.c[] r2 = r13.S
            int r4 = r16 + 1
            r2 = r2[r4]
            q.c r2 = r2.f10879f
            if (r2 == 0) goto L_0x02ee
            q.c[] r2 = r7.S
            r2 = r2[r4]
            int[] r6 = r7.V
            r6 = r6[r39]
            r9 = 3
            if (r6 != r9) goto L_0x02ab
            int[] r6 = r7.u
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02ab
            r6 = 1
            goto L_0x02ac
        L_0x02ab:
            r6 = 0
        L_0x02ac:
            if (r6 == 0) goto L_0x02c4
            if (r3 != 0) goto L_0x02c4
            q.c r6 = r2.f10879f
            q.d r9 = r6.f10877d
            if (r9 != r0) goto L_0x02c4
            o.h r9 = r2.f10882i
            o.h r6 = r6.f10882i
            int r11 = r2.e()
            int r11 = -r11
            r14 = 5
            r10.e(r9, r6, r11, r14)
            goto L_0x02da
        L_0x02c4:
            r14 = 5
            if (r3 == 0) goto L_0x02da
            q.c r6 = r2.f10879f
            q.d r9 = r6.f10877d
            if (r9 != r0) goto L_0x02da
            o.h r9 = r2.f10882i
            o.h r6 = r6.f10882i
            int r11 = r2.e()
            int r11 = -r11
            r15 = 4
            r10.e(r9, r6, r11, r15)
        L_0x02da:
            o.h r6 = r2.f10882i
            q.c[] r9 = r13.S
            r4 = r9[r4]
            q.c r4 = r4.f10879f
            o.h r4 = r4.f10882i
            int r2 = r2.e()
            int r2 = -r2
            r9 = 6
            r10.g(r6, r4, r2, r9)
            goto L_0x02ef
        L_0x02ee:
            r14 = 5
        L_0x02ef:
            if (r5 == 0) goto L_0x0308
            q.c[] r2 = r0.S
            int r4 = r16 + 1
            r2 = r2[r4]
            o.h r2 = r2.f10882i
            q.c[] r5 = r13.S
            r4 = r5[r4]
            o.h r5 = r4.f10882i
            int r4 = r4.e()
            r6 = 8
            r10.f(r2, r5, r4, r6)
        L_0x0308:
            java.util.ArrayList<q.d> r2 = r1.f10865h
            if (r2 == 0) goto L_0x0434
            int r4 = r2.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0434
            boolean r6 = r1.f10870n
            if (r6 == 0) goto L_0x031f
            boolean r6 = r1.f10872p
            if (r6 != 0) goto L_0x031f
            int r6 = r1.f10867j
            float r6 = (float) r6
            goto L_0x0321
        L_0x031f:
            r6 = r26
        L_0x0321:
            r15 = r17
            r9 = 0
            r11 = 0
        L_0x0325:
            if (r11 >= r4) goto L_0x0434
            java.lang.Object r18 = r2.get(r11)
            r5 = r18
            q.d r5 = (q.d) r5
            float[] r14 = r5.f10918n0
            r14 = r14[r39]
            r18 = 0
            int r25 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r25 >= 0) goto L_0x035c
            boolean r14 = r1.f10872p
            if (r14 == 0) goto L_0x0354
            q.c[] r0 = r5.S
            int r5 = r16 + 1
            r5 = r0[r5]
            o.h r5 = r5.f10882i
            r0 = r0[r16]
            o.h r0 = r0.f10882i
            r18 = r2
            r2 = 0
            r14 = 4
            r10.e(r5, r0, r2, r14)
            r25 = r14
            r14 = r2
            goto L_0x0377
        L_0x0354:
            r18 = r2
            r2 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r25 = 4
            goto L_0x0361
        L_0x035c:
            r18 = r2
            r25 = 4
            r2 = 0
        L_0x0361:
            int r26 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r26 != 0) goto L_0x0383
            q.c[] r0 = r5.S
            int r2 = r16 + 1
            r2 = r0[r2]
            o.h r2 = r2.f10882i
            r0 = r0[r16]
            o.h r0 = r0.f10882i
            r5 = 8
            r14 = 0
            r10.e(r2, r0, r14, r5)
        L_0x0377:
            r34 = r1
            r33 = r4
            r26 = r6
            r19 = r14
            r20 = 0
            goto L_0x0424
        L_0x0383:
            r19 = 0
            if (r15 == 0) goto L_0x0417
            q.c[] r2 = r15.S
            r15 = r2[r16]
            o.h r15 = r15.f10882i
            int r27 = r16 + 1
            r2 = r2[r27]
            o.h r2 = r2.f10882i
            q.c[] r0 = r5.S
            r33 = r4
            r4 = r0[r16]
            o.h r4 = r4.f10882i
            r0 = r0[r27]
            o.h r0 = r0.f10882i
            r27 = r5
            o.b r5 = r37.m()
            r34 = r1
            r1 = 0
            r5.f10417b = r1
            int r20 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r20 == 0) goto L_0x03f7
            int r20 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r20 != 0) goto L_0x03b5
            goto L_0x03f7
        L_0x03b5:
            r20 = 0
            int r35 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r35 != 0) goto L_0x03c8
            o.b$a r0 = r5.f10419d
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.c(r15, r4)
            o.b$a r0 = r5.f10419d
            r0.c(r2, r1)
            goto L_0x03d8
        L_0x03c8:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x03db
            o.b$a r2 = r5.f10419d
            r2.c(r4, r1)
            o.b$a r1 = r5.f10419d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.c(r0, r2)
        L_0x03d8:
            r26 = r6
            goto L_0x0413
        L_0x03db:
            float r9 = r9 / r6
            float r26 = r14 / r6
            float r9 = r9 / r26
            r26 = r6
            o.b$a r6 = r5.f10419d
            r6.c(r15, r1)
            o.b$a r1 = r5.f10419d
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.c(r2, r6)
            o.b$a r1 = r5.f10419d
            r1.c(r0, r9)
            o.b$a r0 = r5.f10419d
            float r1 = -r9
            goto L_0x0410
        L_0x03f7:
            r26 = r6
            r20 = 0
            r6 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            o.b$a r9 = r5.f10419d
            r9.c(r15, r1)
            o.b$a r9 = r5.f10419d
            r9.c(r2, r6)
            o.b$a r2 = r5.f10419d
            r2.c(r0, r1)
            o.b$a r0 = r5.f10419d
            r1 = r6
        L_0x0410:
            r0.c(r4, r1)
        L_0x0413:
            r10.c(r5)
            goto L_0x0421
        L_0x0417:
            r34 = r1
            r33 = r4
            r27 = r5
            r26 = r6
            r20 = 0
        L_0x0421:
            r9 = r14
            r15 = r27
        L_0x0424:
            int r11 = r11 + 1
            r2 = r18
            r6 = r26
            r4 = r33
            r1 = r34
            r5 = 1
            r14 = 5
            r0 = r36
            goto L_0x0325
        L_0x0434:
            r34 = r1
            r19 = 0
            r25 = 4
            if (r8 == 0) goto L_0x0499
            if (r8 == r7) goto L_0x0440
            if (r3 == 0) goto L_0x0499
        L_0x0440:
            q.c[] r0 = r12.S
            r0 = r0[r16]
            q.c[] r1 = r13.S
            int r2 = r16 + 1
            r1 = r1[r2]
            q.c r0 = r0.f10879f
            if (r0 == 0) goto L_0x0452
            o.h r0 = r0.f10882i
            r3 = r0
            goto L_0x0454
        L_0x0452:
            r3 = r17
        L_0x0454:
            q.c r0 = r1.f10879f
            if (r0 == 0) goto L_0x045c
            o.h r0 = r0.f10882i
            r6 = r0
            goto L_0x045e
        L_0x045c:
            r6 = r17
        L_0x045e:
            q.c[] r0 = r8.S
            r0 = r0[r16]
            if (r7 == 0) goto L_0x0468
            q.c[] r1 = r7.S
            r1 = r1[r2]
        L_0x0468:
            if (r3 == 0) goto L_0x0492
            if (r6 == 0) goto L_0x0492
            r2 = r32
            if (r39 != 0) goto L_0x0473
            float r2 = r2.f10905g0
            goto L_0x0475
        L_0x0473:
            float r2 = r2.f10907h0
        L_0x0475:
            r5 = r2
            int r4 = r0.e()
            int r9 = r1.e()
            o.h r2 = r0.f10882i
            o.h r0 = r1.f10882i
            r11 = 7
            r1 = r37
            r14 = 2
            r15 = r7
            r7 = r0
            r0 = r8
            r8 = r9
            r18 = r30
            r9 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x069a
        L_0x0492:
            r15 = r7
            r0 = r8
            r18 = r30
            r14 = 2
            goto L_0x069a
        L_0x0499:
            r15 = r7
            r0 = r8
            r18 = r30
            r14 = 2
            if (r24 == 0) goto L_0x057c
            if (r0 == 0) goto L_0x057c
            r1 = r34
            int r2 = r1.f10867j
            if (r2 <= 0) goto L_0x04af
            int r1 = r1.f10866i
            if (r1 != r2) goto L_0x04af
            r23 = 1
            goto L_0x04b1
        L_0x04af:
            r23 = r19
        L_0x04b1:
            r9 = r0
            r11 = r9
        L_0x04b3:
            if (r11 == 0) goto L_0x069a
            q.d[] r1 = r11.p0
            r1 = r1[r39]
            r8 = r1
        L_0x04ba:
            if (r8 == 0) goto L_0x04c7
            int r1 = r8.f10911j0
            r7 = 8
            if (r1 != r7) goto L_0x04c9
            q.d[] r1 = r8.p0
            r8 = r1[r39]
            goto L_0x04ba
        L_0x04c7:
            r7 = 8
        L_0x04c9:
            if (r8 != 0) goto L_0x04d3
            if (r11 != r15) goto L_0x04ce
            goto L_0x04d3
        L_0x04ce:
            r14 = r8
            r20 = r9
            goto L_0x056e
        L_0x04d3:
            q.c[] r1 = r11.S
            r1 = r1[r16]
            o.h r2 = r1.f10882i
            q.c r3 = r1.f10879f
            if (r3 == 0) goto L_0x04e0
            o.h r3 = r3.f10882i
            goto L_0x04e2
        L_0x04e0:
            r3 = r17
        L_0x04e2:
            if (r9 == r11) goto L_0x04eb
            q.c[] r3 = r9.S
            int r4 = r16 + 1
            r3 = r3[r4]
            goto L_0x04f5
        L_0x04eb:
            if (r11 != r0) goto L_0x04fa
            q.c[] r3 = r12.S
            r3 = r3[r16]
            q.c r3 = r3.f10879f
            if (r3 == 0) goto L_0x04f8
        L_0x04f5:
            o.h r3 = r3.f10882i
            goto L_0x04fa
        L_0x04f8:
            r3 = r17
        L_0x04fa:
            int r1 = r1.e()
            q.c[] r4 = r11.S
            int r5 = r16 + 1
            r4 = r4[r5]
            int r4 = r4.e()
            if (r8 == 0) goto L_0x050f
            q.c[] r6 = r8.S
            r6 = r6[r16]
            goto L_0x0517
        L_0x050f:
            q.c[] r6 = r13.S
            r6 = r6[r5]
            q.c r6 = r6.f10879f
            if (r6 == 0) goto L_0x051a
        L_0x0517:
            o.h r7 = r6.f10882i
            goto L_0x051c
        L_0x051a:
            r7 = r17
        L_0x051c:
            q.c[] r14 = r11.S
            r14 = r14[r5]
            o.h r14 = r14.f10882i
            if (r6 == 0) goto L_0x0529
            int r6 = r6.e()
            int r4 = r4 + r6
        L_0x0529:
            q.c[] r6 = r9.S
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r1
            if (r2 == 0) goto L_0x04ce
            if (r3 == 0) goto L_0x04ce
            if (r7 == 0) goto L_0x04ce
            if (r14 == 0) goto L_0x04ce
            if (r11 != r0) goto L_0x0545
            q.c[] r1 = r0.S
            r1 = r1[r16]
            int r1 = r1.e()
            r6 = r1
        L_0x0545:
            if (r11 != r15) goto L_0x0552
            q.c[] r1 = r15.S
            r1 = r1[r5]
            int r1 = r1.e()
            r20 = r1
            goto L_0x0554
        L_0x0552:
            r20 = r4
        L_0x0554:
            if (r23 == 0) goto L_0x0559
            r25 = 8
            goto L_0x055b
        L_0x0559:
            r25 = 5
        L_0x055b:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r4 = r6
            r6 = r7
            r21 = 8
            r7 = r14
            r14 = r8
            r8 = r20
            r20 = r9
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x056e:
            int r1 = r11.f10911j0
            r9 = 8
            if (r1 == r9) goto L_0x0576
            r20 = r11
        L_0x0576:
            r11 = r14
            r9 = r20
            r14 = 2
            goto L_0x04b3
        L_0x057c:
            r1 = r34
            r9 = 8
            if (r22 == 0) goto L_0x069a
            if (r0 == 0) goto L_0x069a
            int r2 = r1.f10867j
            if (r2 <= 0) goto L_0x058f
            int r1 = r1.f10866i
            if (r1 != r2) goto L_0x058f
            r23 = 1
            goto L_0x0591
        L_0x058f:
            r23 = r19
        L_0x0591:
            r11 = r0
            r14 = r11
        L_0x0593:
            if (r11 == 0) goto L_0x063c
            q.d[] r1 = r11.p0
            r1 = r1[r39]
        L_0x0599:
            if (r1 == 0) goto L_0x05a4
            int r2 = r1.f10911j0
            if (r2 != r9) goto L_0x05a4
            q.d[] r1 = r1.p0
            r1 = r1[r39]
            goto L_0x0599
        L_0x05a4:
            if (r11 == r0) goto L_0x062c
            if (r11 == r15) goto L_0x062c
            if (r1 == 0) goto L_0x062c
            if (r1 != r15) goto L_0x05af
            r8 = r17
            goto L_0x05b0
        L_0x05af:
            r8 = r1
        L_0x05b0:
            q.c[] r1 = r11.S
            r1 = r1[r16]
            o.h r2 = r1.f10882i
            q.c[] r3 = r14.S
            int r4 = r16 + 1
            r3 = r3[r4]
            o.h r3 = r3.f10882i
            int r1 = r1.e()
            q.c[] r5 = r11.S
            r5 = r5[r4]
            int r5 = r5.e()
            if (r8 == 0) goto L_0x05da
            q.c[] r6 = r8.S
            r6 = r6[r16]
            o.h r7 = r6.f10882i
            q.c r9 = r6.f10879f
            if (r9 == 0) goto L_0x05d7
            goto L_0x05e9
        L_0x05d7:
            r9 = r17
            goto L_0x05eb
        L_0x05da:
            q.c[] r6 = r15.S
            r6 = r6[r16]
            if (r6 == 0) goto L_0x05e3
            o.h r7 = r6.f10882i
            goto L_0x05e5
        L_0x05e3:
            r7 = r17
        L_0x05e5:
            q.c[] r9 = r11.S
            r9 = r9[r4]
        L_0x05e9:
            o.h r9 = r9.f10882i
        L_0x05eb:
            if (r6 == 0) goto L_0x05f5
            int r6 = r6.e()
            int r6 = r6 + r5
            r20 = r6
            goto L_0x05f7
        L_0x05f5:
            r20 = r5
        L_0x05f7:
            q.c[] r5 = r14.S
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = r4 + r1
            if (r23 == 0) goto L_0x0605
            r21 = 8
            goto L_0x0607
        L_0x0605:
            r21 = r25
        L_0x0607:
            if (r2 == 0) goto L_0x0623
            if (r3 == 0) goto L_0x0623
            if (r7 == 0) goto L_0x0623
            if (r9 == 0) goto L_0x0623
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r6 = r7
            r7 = r9
            r26 = r8
            r8 = r20
            r20 = r14
            r14 = 8
            r9 = r21
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0629
        L_0x0623:
            r26 = r8
            r20 = r14
            r14 = 8
        L_0x0629:
            r8 = r26
            goto L_0x0630
        L_0x062c:
            r20 = r14
            r14 = r9
            r8 = r1
        L_0x0630:
            int r1 = r11.f10911j0
            if (r1 == r14) goto L_0x0636
            r20 = r11
        L_0x0636:
            r11 = r8
            r9 = r14
            r14 = r20
            goto L_0x0593
        L_0x063c:
            q.c[] r1 = r0.S
            r1 = r1[r16]
            q.c[] r2 = r12.S
            r2 = r2[r16]
            q.c r2 = r2.f10879f
            q.c[] r3 = r15.S
            int r4 = r16 + 1
            r11 = r3[r4]
            q.c[] r3 = r13.S
            r3 = r3[r4]
            q.c r12 = r3.f10879f
            if (r2 == 0) goto L_0x0689
            if (r0 == r15) goto L_0x0663
            o.h r3 = r1.f10882i
            o.h r2 = r2.f10882i
            int r1 = r1.e()
            r14 = 5
            r10.e(r3, r2, r1, r14)
            goto L_0x068a
        L_0x0663:
            r14 = 5
            if (r12 == 0) goto L_0x068a
            o.h r3 = r1.f10882i
            o.h r4 = r2.f10882i
            int r5 = r1.e()
            r6 = 1056964608(0x3f000000, float:0.5)
            o.h r7 = r11.f10882i
            o.h r8 = r12.f10882i
            int r9 = r11.e()
            r20 = 5
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r20
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x068a
        L_0x0689:
            r14 = 5
        L_0x068a:
            if (r12 == 0) goto L_0x069a
            if (r0 == r15) goto L_0x069a
            o.h r1 = r11.f10882i
            o.h r2 = r12.f10882i
            int r3 = r11.e()
            int r3 = -r3
            r10.e(r1, r2, r3, r14)
        L_0x069a:
            if (r24 != 0) goto L_0x069e
            if (r22 == 0) goto L_0x06f8
        L_0x069e:
            if (r0 == 0) goto L_0x06f8
            if (r0 == r15) goto L_0x06f8
            q.c[] r1 = r0.S
            r2 = r1[r16]
            if (r15 != 0) goto L_0x06aa
            r8 = r0
            goto L_0x06ab
        L_0x06aa:
            r8 = r15
        L_0x06ab:
            q.c[] r3 = r8.S
            int r4 = r16 + 1
            r3 = r3[r4]
            q.c r5 = r2.f10879f
            if (r5 == 0) goto L_0x06b8
            o.h r5 = r5.f10882i
            goto L_0x06ba
        L_0x06b8:
            r5 = r17
        L_0x06ba:
            q.c r6 = r3.f10879f
            if (r6 == 0) goto L_0x06c1
            o.h r6 = r6.f10882i
            goto L_0x06c3
        L_0x06c1:
            r6 = r17
        L_0x06c3:
            if (r13 == r8) goto L_0x06d3
            q.c[] r6 = r13.S
            r6 = r6[r4]
            q.c r6 = r6.f10879f
            if (r6 == 0) goto L_0x06d1
            o.h r6 = r6.f10882i
            r17 = r6
        L_0x06d1:
            r6 = r17
        L_0x06d3:
            if (r0 != r8) goto L_0x06d7
            r3 = r1[r4]
        L_0x06d7:
            if (r5 == 0) goto L_0x06f8
            if (r6 == 0) goto L_0x06f8
            r0 = 1056964608(0x3f000000, float:0.5)
            int r7 = r2.e()
            q.c[] r1 = r8.S
            r1 = r1[r4]
            int r8 = r1.e()
            o.h r2 = r2.f10882i
            o.h r9 = r3.f10882i
            r11 = 5
            r1 = r37
            r3 = r5
            r4 = r7
            r5 = r0
            r7 = r9
            r9 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06f8:
            int r9 = r18 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r29
            r15 = r31
            goto L_0x001b
        L_0x0705:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c.d(q.e, o.d, java.util.ArrayList, int):void");
    }

    public static int e(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static z f(int i10) {
        if (i10 == 0) {
            return new h();
        }
        if (i10 != 1) {
            return new h();
        }
        return new r5.d();
    }

    public static final boolean g(char c10, char c11, boolean z9) {
        if (c10 == c11) {
            return true;
        }
        if (!z9) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final Class i(b9.b bVar) {
        f.f(bVar, "<this>");
        Class<?> a10 = ((x8.b) bVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a10 : Double.class;
            case 104431:
                return !name.equals("int") ? a10 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a10 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a10 : Character.class;
            case 3327612:
                return !name.equals("long") ? a10 : Long.class;
            case 3625364:
                return !name.equals("void") ? a10 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a10 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a10 : Float.class;
            case 109413500:
                return !name.equals("short") ? a10 : Short.class;
            default:
                return a10;
        }
    }

    public static final q8.d k(q8.d<Object> dVar) {
        s8.c cVar;
        f.f(dVar, "<this>");
        if (dVar instanceof s8.c) {
            cVar = (s8.c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (dVar = cVar.f11899c) == null) {
            q8.f fVar = cVar.f11898b;
            f.c(fVar);
            q8.e eVar = (q8.e) fVar.get(e.a.f11373a);
            if (eVar == null || (dVar = eVar.c(cVar)) == null) {
                dVar = cVar;
            }
            cVar.f11899c = dVar;
        }
        return dVar;
    }

    public static boolean l(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    public static final int m(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((((float) i10) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void n(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final Object o(Object obj) {
        return obj instanceof e9.m ? c.a.d(((e9.m) obj).f6251a) : obj;
    }

    public static void p(q8.d dVar, Object obj) {
        Object obj2;
        boolean z9;
        q8.f b10;
        Object c10;
        a1 a1Var;
        if (dVar instanceof h9.c) {
            h9.c cVar = (h9.c) dVar;
            Throwable a10 = o8.f.a(obj);
            boolean z10 = false;
            if (a10 == null) {
                obj2 = obj;
            } else {
                obj2 = new e9.m(a10, false);
            }
            p pVar = cVar.f7043d;
            cVar.b();
            if (pVar.M()) {
                cVar.f7045f = obj2;
                cVar.f6277c = 1;
                cVar.f7043d.L(cVar.b(), cVar);
                return;
            }
            d0 a11 = y0.a();
            if (a11.f6225b >= 4294967296L) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                cVar.f7045f = obj2;
                cVar.f6277c = 1;
                a11.O(cVar);
                return;
            }
            a11.P(true);
            try {
                n0 n0Var = (n0) cVar.b().get(n0.b.f6255a);
                if (n0Var != null && !n0Var.a()) {
                    CancellationException u10 = n0Var.u();
                    cVar.a(obj2, u10);
                    cVar.e(c.a.d(u10));
                    z10 = true;
                }
                if (!z10) {
                    q8.d<T> dVar2 = cVar.f7044e;
                    Object obj3 = cVar.f7046g;
                    b10 = dVar2.b();
                    c10 = h9.p.c(b10, obj3);
                    if (c10 != h9.p.f7069a) {
                        a1Var = c.a.l(dVar2, b10);
                    } else {
                        a1Var = null;
                    }
                    cVar.f7044e.e(obj);
                    o8.h hVar = o8.h.f10610a;
                    if (a1Var == null) {
                        h9.p.a(b10, c10);
                    } else {
                        throw null;
                    }
                }
                do {
                } while (a11.Q());
            } catch (Throwable th) {
                try {
                    cVar.h(th, (Throwable) null);
                } catch (Throwable th2) {
                    a11.N();
                    throw th2;
                }
            }
            a11.N();
            return;
        }
        dVar.e(obj);
    }

    public static void q(View view) {
        Drawable background = view.getBackground();
        if (background instanceof r5.f) {
            r(view, (r5.f) background);
        }
    }

    public static void r(View view, r5.f fVar) {
        boolean z9;
        g5.a aVar = fVar.f11660a.f11682b;
        if (aVar == null || !aVar.f6575a) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                f10 += y.i.i((View) parent);
            }
            f.b bVar = fVar.f11660a;
            if (bVar.f11692m != f10) {
                bVar.f11692m = f10;
                fVar.n();
            }
        }
    }

    public static final Map s(LinkedHashMap linkedHashMap) {
        x8.f.f(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        x8.f.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static int t(int i10) {
        int[] iArr = {1, 2, 3};
        int i11 = 0;
        while (i11 < 3) {
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

    public static Object u(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    public static String v(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static /* synthetic */ boolean w(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static /* synthetic */ boolean x(String str, Object obj) {
        return str == obj || (str != null && str.equals(obj));
    }

    public static void y(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public File a(o1.f fVar) {
        return null;
    }

    public void b(o1.f fVar, g gVar) {
    }

    public Object h(w wVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(wVar);
    }

    public Object j() {
        return new l();
    }

    public Object zza() {
        throw new IllegalStateException();
    }

    public /* synthetic */ c(int i10) {
    }
}

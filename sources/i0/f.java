package i0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import i0.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static int f7090d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f7091a;

    /* renamed from: b  reason: collision with root package name */
    public int f7092b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f7093c = -1;

    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f7094e = new a(1);

        /* renamed from: f  reason: collision with root package name */
        public static final a f7095f = new a(2);

        /* renamed from: g  reason: collision with root package name */
        public static final a f7096g = new a(16);

        /* renamed from: h  reason: collision with root package name */
        public static final a f7097h = new a(4096);

        /* renamed from: i  reason: collision with root package name */
        public static final a f7098i = new a(8192);

        /* renamed from: j  reason: collision with root package name */
        public static final a f7099j = new a(262144);
        public static final a k = new a(524288);

        /* renamed from: l  reason: collision with root package name */
        public static final a f7100l = new a(1048576);

        /* renamed from: m  reason: collision with root package name */
        public static final a f7101m = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (j) null, (Class) null);

        /* renamed from: n  reason: collision with root package name */
        public static final a f7102n = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (j) null, (Class) null);

        /* renamed from: a  reason: collision with root package name */
        public final Object f7103a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7104b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends j.a> f7105c;

        /* renamed from: d  reason: collision with root package name */
        public final j f7106d;

        static {
            Class<j.c> cls = j.c.class;
            Class<j.b> cls2 = j.b.class;
            new a(4);
            new a(8);
            new a(32);
            new a(64);
            new a(128);
            new a(256, cls2);
            new a(512, cls2);
            new a(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, cls);
            new a(2048, cls);
            new a(16384);
            new a(32768);
            new a(65536);
            new a(131072, j.g.class);
            new a(2097152, j.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (j) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (j) null, j.e.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (j) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (j) null, (Class) null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (String) null, (j) null, (Class) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (String) null, (j) null, (Class) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (String) null, (j) null, (Class) null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (String) null, (j) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (j) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (String) null, (j) null, j.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (String) null, (j) null, j.d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (String) null, (j) null, (Class) null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (String) null, (j) null, (Class) null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (String) null, (j) null, (Class) null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (String) null, (j) null, (Class) null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (String) null, (j) null, (Class) null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (String) null, (j) null, (Class) null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (String) null, (j) null, (Class) null);
            if (i10 >= 33) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            new a(accessibilityAction, 16908376, (String) null, (j) null, (Class) null);
        }

        public a(int i10) {
            this((Object) null, i10, (String) null, (j) null, (Class) null);
        }

        public a(int i10, Class cls) {
            this((Object) null, i10, (String) null, (j) null, cls);
        }

        public a(Object obj, int i10, String str, j jVar, Class cls) {
            this.f7104b = i10;
            this.f7106d = jVar;
            this.f7103a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, str) : obj;
            this.f7105c = cls;
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7103a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7103a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f7103a;
            Object obj3 = ((a) obj).f7103a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f7103a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7107a;

        public b(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f7107a = collectionItemInfo;
        }

        public static b a(int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
            return new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z9, z10));
        }
    }

    public f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f7091a = accessibilityNodeInfo;
    }

    public final void a(int i10) {
        this.f7091a.addAction(i10);
    }

    public final void b(a aVar) {
        this.f7091a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7103a);
    }

    public final ArrayList c(String str) {
        ArrayList<Integer> integerArrayList = this.f7091a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f7091a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.f7091a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        if (!(!c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f7091a.getText();
        }
        ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f7091a.getText(), 0, this.f7091a.getText().length()));
        for (int i10 = 0; i10 < c10.size(); i10++) {
            spannableString.setSpan(new a(((Integer) c13.get(i10)).intValue(), this, this.f7091a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue(), ((Integer) c12.get(i10)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7091a;
        if (accessibilityNodeInfo == null) {
            if (fVar.f7091a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(fVar.f7091a)) {
            return false;
        }
        return this.f7093c == fVar.f7093c && this.f7092b == fVar.f7092b;
    }

    public final void f(int i10, boolean z9) {
        Bundle extras = this.f7091a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z9) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public final void g(CharSequence charSequence) {
        this.f7091a.setClassName(charSequence);
    }

    public final void h(b bVar) {
        this.f7091a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) bVar.f7107a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7091a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.f7091a.setContentDescription(charSequence);
    }

    public final void j(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7091a.setHintText(str);
        } else {
            this.f7091a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void k(boolean z9) {
        this.f7091a.setScrollable(z9);
    }

    public final void l(CharSequence charSequence) {
        this.f7091a.setText(charSequence);
    }

    public final String toString() {
        String str;
        ArrayList arrayList;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb.append("; boundsInParent: " + rect);
        this.f7091a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f7091a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f7091a.getClassName());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; contentDescription: ");
        sb.append(this.f7091a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f7091a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (d0.a.a()) {
            str = this.f7091a.getUniqueId();
        } else {
            str = this.f7091a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(str);
        sb.append("; checkable: ");
        sb.append(this.f7091a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f7091a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f7091a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f7091a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f7091a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f7091a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f7091a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f7091a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f7091a.isPassword());
        sb.append("; scrollable: " + this.f7091a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f7091a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(new a(actionList.get(i10), 0, (String) null, (j) null, (Class) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar = (a) arrayList.get(i11);
            int a10 = aVar.a();
            if (a10 == 1) {
                str2 = "ACTION_FOCUS";
            } else if (a10 != 2) {
                switch (a10) {
                    case 4:
                        str2 = "ACTION_SELECT";
                        break;
                    case 8:
                        str2 = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str2 = "ACTION_CLICK";
                        break;
                    case 32:
                        str2 = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str2 = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str2 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str2 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str2 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES:
                        str2 = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str2 = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str2 = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str2 = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str2 = "ACTION_COPY";
                        break;
                    case 32768:
                        str2 = "ACTION_PASTE";
                        break;
                    case 65536:
                        str2 = "ACTION_CUT";
                        break;
                    case 131072:
                        str2 = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str2 = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str2 = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str2 = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str2 = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (a10) {
                            case 16908342:
                                str2 = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str2 = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str2 = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str2 = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str2 = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str2 = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str2 = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str2 = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a10) {
                                    case 16908356:
                                        str2 = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str2 = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str2 = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str2 = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str2 = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str2 = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str2 = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (a10) {
                                            case 16908372:
                                                str2 = "ACTION_IME_ENTER";
                                                break;
                                            case 16908373:
                                                str2 = "ACTION_DRAG_START";
                                                break;
                                            case 16908374:
                                                str2 = "ACTION_DRAG_DROP";
                                                break;
                                            case 16908375:
                                                str2 = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                str2 = "ACTION_UNKNOWN";
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str2 = "ACTION_CLEAR_FOCUS";
            }
            if (str2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                str2 = aVar.b().toString();
            }
            sb.append(str2);
            if (i11 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

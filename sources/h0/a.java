package h0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.imgdkh.app.R;
import h0.y;
import i0.f;
import i0.g;
import i0.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f6676c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f6677a;

    /* renamed from: b  reason: collision with root package name */
    public final C0089a f6678b;

    /* renamed from: h0.a$a  reason: collision with other inner class name */
    public static final class C0089a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f6679a;

        public C0089a(a aVar) {
            this.f6679a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f6679a.a(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            g b10 = this.f6679a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f7108a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f6679a.c(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z9;
            Object obj;
            boolean z10;
            boolean z11;
            Object obj2;
            boolean z12;
            boolean z13;
            Object obj3;
            int i10;
            View view2 = view;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
            Class<Boolean> cls = Boolean.class;
            f fVar = new f(accessibilityNodeInfo2);
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            boolean z14 = true;
            int i11 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                z9 = true;
            } else {
                z9 = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z9) {
                obj = Boolean.valueOf(y.l.d(view));
            } else {
                obj = view2.getTag(R.id.tag_screen_reader_focusable);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            if (bool == null || !bool.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                accessibilityNodeInfo2.setScreenReaderFocusable(z10);
            } else {
                fVar.f(1, z10);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                obj2 = Boolean.valueOf(y.l.c(view));
            } else {
                Object tag = view2.getTag(R.id.tag_accessibility_heading);
                if (cls.isInstance(tag)) {
                    obj2 = tag;
                } else {
                    obj2 = null;
                }
            }
            Boolean bool2 = (Boolean) obj2;
            if (bool2 == null || !bool2.booleanValue()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i12 >= 28) {
                accessibilityNodeInfo2.setHeading(z12);
            } else {
                fVar.f(2, z12);
            }
            CharSequence e10 = y.e(view);
            if (i12 >= 28) {
                accessibilityNodeInfo2.setPaneTitle(e10);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e10);
            }
            Class<CharSequence> cls2 = CharSequence.class;
            if (i12 >= 30) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                obj3 = y.n.a(view);
            } else {
                Object tag2 = view2.getTag(R.id.tag_state_description);
                if (cls2.isInstance(tag2)) {
                    obj3 = tag2;
                } else {
                    obj3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) obj3;
            if (i12 < 30) {
                z14 = false;
            }
            if (z14) {
                accessibilityNodeInfo2.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f6679a.d(view2, fVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i12 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    fVar.f7091a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i15 = 0;
                    while (i15 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i15];
                        int i16 = i11;
                        while (true) {
                            if (i16 >= sparseArray2.size()) {
                                i10 = f.f7090d;
                                f.f7090d = i10 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                i10 = sparseArray2.keyAt(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                        Spanned spanned = (Spanned) text;
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                        i15++;
                        i11 = 0;
                    }
                }
            }
            List list = (List) view2.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i17 = 0; i17 < list.size(); i17++) {
                fVar.b((f.a) list.get(i17));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f6679a.e(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f6679a.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f6679a.g(view, i10, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i10) {
            this.f6679a.h(view, i10);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f6679a.i(view, accessibilityEvent);
        }
    }

    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f6676c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f6677a = accessibilityDelegate;
        this.f6678b = new C0089a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6677a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public g b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f6677a, view);
        if (a10 != null) {
            return new g(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f6677a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, f fVar) {
        this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f6677a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6677a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z9;
        WeakReference weakReference;
        boolean z10;
        ClickableSpan[] clickableSpanArr;
        String str;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            f.a aVar = (f.a) list.get(i11);
            if (aVar.a() != i10) {
                i11++;
            } else if (aVar.f7106d != null) {
                Class<? extends j.a> cls = aVar.f7105c;
                if (cls != null) {
                    try {
                        ((j.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                    } catch (Exception e10) {
                        Class<? extends j.a> cls2 = aVar.f7105c;
                        if (cls2 == null) {
                            str = "null";
                        } else {
                            str = cls2.getName();
                        }
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + str, e10);
                    }
                }
                z9 = aVar.f7106d.a(view);
            }
        }
        z9 = false;
        if (!z9) {
            z9 = b.b(this.f6677a, view, i10, bundle);
        }
        if (z9 || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z9;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i12)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                int i13 = 0;
                while (true) {
                    if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i13])) {
                        z10 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            z10 = false;
            if (z10) {
                clickableSpan.onClick(view);
                z11 = true;
            }
        }
        return z11;
    }

    public void h(View view, int i10) {
        this.f6677a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f6677a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

package i0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7108a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final g f7109a;

        public a(g gVar) {
            this.f7109a = gVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            f a10 = this.f7109a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f7091a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f7109a.getClass();
            return null;
        }

        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f7109a.c(i10, i11, bundle);
        }
    }

    public static class b extends a {
        public b(g gVar) {
            super(gVar);
        }

        public final AccessibilityNodeInfo findFocus(int i10) {
            f b10 = this.f7109a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f7091a;
        }
    }

    public static class c extends b {
        public c(g gVar) {
            super(gVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f7109a.getClass();
        }
    }

    public g() {
        this.f7108a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public g(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f7108a = accessibilityNodeProvider;
    }

    public f a(int i10) {
        return null;
    }

    public f b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }
}

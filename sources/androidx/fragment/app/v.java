package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class v implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final y f1640a;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f0 f1641a;

        public a(f0 f0Var) {
            this.f1641a = f0Var;
        }

        public final void onViewAttachedToWindow(View view) {
            f0 f0Var = this.f1641a;
            o oVar = f0Var.f1473c;
            f0Var.k();
            t0.f((ViewGroup) oVar.F.getParent(), v.this.f1640a.G()).e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public v(y yVar) {
        this.f1640a = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r9 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.FragmentContainerView r10 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.y r11 = r9.f1640a
            r10.<init>(r12, r13, r11)
            return r10
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r11 = r0.equals(r11)
            r0 = 0
            if (r11 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r11 = "class"
            java.lang.String r11 = r13.getAttributeValue(r0, r11)
            int[] r1 = y3.a.N
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r13, r1)
            r2 = 0
            if (r11 != 0) goto L_0x0031
            java.lang.String r11 = r1.getString(r2)
        L_0x0031:
            r3 = -1
            r4 = 1
            int r5 = r1.getResourceId(r4, r3)
            r6 = 2
            java.lang.String r7 = r1.getString(r6)
            r1.recycle()
            if (r11 == 0) goto L_0x01d8
            java.lang.ClassLoader r1 = r12.getClassLoader()
            java.lang.Class r1 = androidx.fragment.app.t.a(r1, r11)     // Catch:{ ClassNotFoundException -> 0x0050 }
            java.lang.Class<androidx.fragment.app.o> r8 = androidx.fragment.app.o.class
            boolean r1 = r8.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0055
            goto L_0x01d8
        L_0x0055:
            if (r10 == 0) goto L_0x005b
            int r2 = r10.getId()
        L_0x005b:
            if (r2 != r3) goto L_0x0080
            if (r5 != r3) goto L_0x0080
            if (r7 == 0) goto L_0x0062
            goto L_0x0080
        L_0x0062:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x0080:
            if (r5 == r3) goto L_0x0089
            androidx.fragment.app.y r1 = r9.f1640a
            androidx.fragment.app.o r1 = r1.C(r5)
            goto L_0x008a
        L_0x0089:
            r1 = r0
        L_0x008a:
            if (r1 != 0) goto L_0x0094
            if (r7 == 0) goto L_0x0094
            androidx.fragment.app.y r1 = r9.f1640a
            androidx.fragment.app.o r1 = r1.D(r7)
        L_0x0094:
            if (r1 != 0) goto L_0x009e
            if (r2 == r3) goto L_0x009e
            androidx.fragment.app.y r1 = r9.f1640a
            androidx.fragment.app.o r1 = r1.C(r2)
        L_0x009e:
            java.lang.String r3 = "Fragment "
            if (r1 != 0) goto L_0x00f3
            androidx.fragment.app.y r13 = r9.f1640a
            androidx.fragment.app.t r13 = r13.F()
            r12.getClassLoader()
            androidx.fragment.app.y$b r13 = (androidx.fragment.app.y.b) r13
            androidx.fragment.app.y r12 = androidx.fragment.app.y.this
            androidx.fragment.app.u<?> r12 = r12.f1660o
            android.content.Context r12 = r12.f1636c
            androidx.fragment.app.o r1 = androidx.fragment.app.o.v(r12, r11, r0)
            r1.f1574n = r4
            if (r5 == 0) goto L_0x00bd
            r12 = r5
            goto L_0x00be
        L_0x00bd:
            r12 = r2
        L_0x00be:
            r1.w = r12
            r1.f1582x = r2
            r1.f1583y = r7
            r1.f1575o = r4
            androidx.fragment.app.y r12 = r9.f1640a
            r1.f1579s = r12
            androidx.fragment.app.u<?> r13 = r12.f1660o
            r1.f1580t = r13
            android.content.Context r2 = r13.f1636c
            r1.D = r4
            if (r13 != 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            android.app.Activity r0 = r13.f1635b
        L_0x00d7:
            if (r0 == 0) goto L_0x00db
            r1.D = r4
        L_0x00db:
            androidx.fragment.app.f0 r12 = r12.a(r1)
            boolean r13 = androidx.fragment.app.y.I(r6)
            if (r13 == 0) goto L_0x013a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r1)
            java.lang.String r0 = " has been inflated via the <fragment> tag: id=0x"
            goto L_0x0127
        L_0x00f3:
            boolean r12 = r1.f1575o
            if (r12 != 0) goto L_0x019a
            r1.f1575o = r4
            androidx.fragment.app.y r12 = r9.f1640a
            r1.f1579s = r12
            androidx.fragment.app.u<?> r13 = r12.f1660o
            r1.f1580t = r13
            android.content.Context r2 = r13.f1636c
            r1.D = r4
            if (r13 != 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            android.app.Activity r0 = r13.f1635b
        L_0x010a:
            if (r0 == 0) goto L_0x010e
            r1.D = r4
        L_0x010e:
            androidx.fragment.app.f0 r12 = r12.g(r1)
            boolean r13 = androidx.fragment.app.y.I(r6)
            if (r13 == 0) goto L_0x013a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Retained Fragment "
            r13.append(r0)
            r13.append(r1)
            java.lang.String r0 = " has been re-attached via the <fragment> tag: id=0x"
        L_0x0127:
            r13.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r5)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r13)
        L_0x013a:
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            v0.c$c r13 = v0.c.f12386a
            v0.d r13 = new v0.d
            r13.<init>(r1, r10)
            v0.c.c(r13)
            v0.c$c r0 = v0.c.a(r1)
            java.util.Set<v0.c$a> r2 = r0.f12395a
            v0.c$a r4 = v0.c.a.DETECT_FRAGMENT_TAG_USAGE
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0163
            java.lang.Class r2 = r1.getClass()
            java.lang.Class<v0.d> r4 = v0.d.class
            boolean r2 = v0.c.f(r0, r2, r4)
            if (r2 == 0) goto L_0x0163
            v0.c.b(r0, r13)
        L_0x0163:
            r1.E = r10
            r12.k()
            r12.j()
            android.view.View r10 = r1.F
            if (r10 == 0) goto L_0x018e
            if (r5 == 0) goto L_0x0174
            r10.setId(r5)
        L_0x0174:
            android.view.View r10 = r1.F
            java.lang.Object r10 = r10.getTag()
            if (r10 != 0) goto L_0x0181
            android.view.View r10 = r1.F
            r10.setTag(r7)
        L_0x0181:
            android.view.View r10 = r1.F
            androidx.fragment.app.v$a r11 = new androidx.fragment.app.v$a
            r11.<init>(r12)
            r10.addOnAttachStateChangeListener(r11)
            android.view.View r10 = r1.F
            return r10
        L_0x018e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r12 = " did not create a view."
            java.lang.String r11 = androidx.fragment.app.w0.d(r3, r11, r12)
            r10.<init>(r11)
            throw r10
        L_0x019a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r12.append(r13)
            java.lang.String r13 = ": Duplicate id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r5)
            r12.append(r13)
            java.lang.String r13 = ", tag "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r13 = ", or parent id 0x"
            r12.append(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r2)
            r12.append(r13)
            java.lang.String r13 = " with another fragment for "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x01d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}

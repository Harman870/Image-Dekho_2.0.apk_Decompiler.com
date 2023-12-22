package o0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import h0.l0;
import h0.y;
import i0.f;
import i0.g;
import i0.i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.b;

public abstract class a extends h0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f10461n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final C0119a f10462o = new C0119a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f10463p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f10464d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f10465e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f10466f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f10467g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f10468h;

    /* renamed from: i  reason: collision with root package name */
    public final View f10469i;

    /* renamed from: j  reason: collision with root package name */
    public c f10470j;
    public int k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f10471l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f10472m = Integer.MIN_VALUE;

    /* renamed from: o0.a$a  reason: collision with other inner class name */
    public class C0119a implements b.a<f> {
    }

    public class b {
    }

    public class c extends g {
        public c() {
        }

        public final f a(int i10) {
            return new f(AccessibilityNodeInfo.obtain(a.this.n(i10).f7091a));
        }

        public final f b(int i10) {
            int i11 = i10 == 2 ? a.this.k : a.this.f10471l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i11);
        }

        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            if (i10 != -1) {
                boolean z9 = true;
                if (i11 == 1) {
                    return aVar.p(i10);
                }
                if (i11 == 2) {
                    return aVar.j(i10);
                }
                boolean z10 = false;
                if (i11 != 64) {
                    if (i11 != 128) {
                        Chip.b bVar = (Chip.b) aVar;
                        bVar.getClass();
                        if (i11 == 16) {
                            if (i10 == 0) {
                                return Chip.this.performClick();
                            }
                            if (i10 == 1) {
                                Chip chip = Chip.this;
                                chip.playSoundEffect(0);
                                View.OnClickListener onClickListener = chip.f3059h;
                                if (onClickListener != null) {
                                    onClickListener.onClick(chip);
                                    z10 = true;
                                }
                                if (chip.f3069s) {
                                    chip.f3068r.q(1, 1);
                                }
                            }
                        }
                        return z10;
                    } else if (aVar.k == i10) {
                        aVar.k = Integer.MIN_VALUE;
                        aVar.f10469i.invalidate();
                        aVar.q(i10, 65536);
                        return z9;
                    }
                } else if (aVar.f10468h.isEnabled() && aVar.f10468h.isTouchExplorationEnabled() && (i12 = aVar.k) != i10) {
                    if (i12 != Integer.MIN_VALUE) {
                        aVar.k = Integer.MIN_VALUE;
                        aVar.f10469i.invalidate();
                        aVar.q(i12, 65536);
                    }
                    aVar.k = i10;
                    aVar.f10469i.invalidate();
                    aVar.q(i10, 32768);
                    return z9;
                }
                z9 = false;
                return z9;
            }
            View view = aVar.f10469i;
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            return y.d.j(view, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f10469i = view;
            this.f10468h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.d.c(view) == 0) {
                y.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final g b(View view) {
        if (this.f10470j == null) {
            this.f10470j = new c();
        }
        return this.f10470j;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final void d(View view, f fVar) {
        boolean z9;
        this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
        Chip.b bVar = (Chip.b) this;
        com.google.android.material.chip.a aVar = Chip.this.f3056e;
        if (aVar == null || !aVar.R) {
            z9 = false;
        } else {
            z9 = true;
        }
        fVar.f7091a.setCheckable(z9);
        fVar.f7091a.setClickable(Chip.this.isClickable());
        fVar.g(Chip.this.getAccessibilityClassName());
        fVar.l(Chip.this.getText());
    }

    public final boolean j(int i10) {
        if (this.f10471l != i10) {
            return false;
        }
        this.f10471l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.f3063m = false;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final f k(int i10) {
        boolean z9;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        fVar.g("android.view.View");
        Rect rect = f10461n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f10469i;
        fVar.f7092b = -1;
        obtain.setParent(view);
        o(i10, fVar);
        if (fVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        fVar.d(this.f10465e);
        if (!this.f10465e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.f10469i.getContext().getPackageName());
                View view2 = this.f10469i;
                fVar.f7093c = i10;
                obtain.setSource(view2, i10);
                boolean z10 = false;
                if (this.k == i10) {
                    obtain.setAccessibilityFocused(true);
                    fVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    fVar.a(64);
                }
                if (this.f10471l == i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    fVar.a(2);
                } else if (obtain.isFocusable()) {
                    fVar.a(1);
                }
                obtain.setFocused(z9);
                this.f10469i.getLocationOnScreen(this.f10467g);
                obtain.getBoundsInScreen(this.f10464d);
                if (this.f10464d.equals(rect)) {
                    fVar.d(this.f10464d);
                    if (fVar.f7092b != -1) {
                        f fVar2 = new f(AccessibilityNodeInfo.obtain());
                        for (int i11 = fVar.f7092b; i11 != -1; i11 = fVar2.f7092b) {
                            View view3 = this.f10469i;
                            fVar2.f7092b = -1;
                            fVar2.f7091a.setParent(view3, -1);
                            fVar2.f7091a.setBoundsInParent(f10461n);
                            o(i11, fVar2);
                            fVar2.d(this.f10465e);
                            Rect rect2 = this.f10464d;
                            Rect rect3 = this.f10465e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        fVar2.f7091a.recycle();
                    }
                    this.f10464d.offset(this.f10467g[0] - this.f10469i.getScrollX(), this.f10467g[1] - this.f10469i.getScrollY());
                }
                if (this.f10469i.getLocalVisibleRect(this.f10466f)) {
                    this.f10466f.offset(this.f10467g[0] - this.f10469i.getScrollX(), this.f10467g[1] - this.f10469i.getScrollY());
                    if (this.f10464d.intersect(this.f10466f)) {
                        fVar.f7091a.setBoundsInScreen(this.f10464d);
                        Rect rect4 = this.f10464d;
                        if (rect4 != null && !rect4.isEmpty() && this.f10469i.getWindowVisibility() == 0) {
                            View view4 = this.f10469i;
                            while (true) {
                                ViewParent parent = view4.getParent();
                                if (parent instanceof View) {
                                    view4 = (View) parent;
                                    if (view4.getAlpha() > 0.0f) {
                                        if (view4.getVisibility() != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z10 = true;
                                }
                            }
                        }
                        if (z10) {
                            fVar.f7091a.setVisibleToUser(true);
                        }
                    }
                }
                return fVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0145 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            m.i r4 = new m.i
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            i0.f r7 = r0.k(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.f(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f10471l
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r3 != r6) goto L_0x0042
            r3 = r7
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r4.e(r3, r7)
            i0.f r3 = (i0.f) r3
        L_0x0048:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0148
            if (r1 == r8) goto L_0x0148
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0068
            if (r1 == r12) goto L_0x0068
            if (r1 == r11) goto L_0x0068
            if (r1 != r8) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0068:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f10471l
            java.lang.String r7 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r6) goto L_0x007b
            i0.f r2 = r0.n(r15)
            r2.d(r14)
            goto L_0x00a8
        L_0x007b:
            if (r2 == 0) goto L_0x0081
            r14.set(r2)
            goto L_0x00a8
        L_0x0081:
            android.view.View r2 = r0.f10469i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a5
            if (r1 == r12) goto L_0x00a1
            if (r1 == r11) goto L_0x009d
            if (r1 != r8) goto L_0x0097
            r14.set(r5, r9, r15, r9)
            goto L_0x00a8
        L_0x0097:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x009d:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a8
        L_0x00a1:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a8
        L_0x00a5:
            r14.set(r15, r5, r15, r2)
        L_0x00a8:
            o0.a$b r2 = f10463p
            o0.a$a r15 = f10462o
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r14)
            if (r1 == r13) goto L_0x00d6
            if (r1 == r12) goto L_0x00cd
            if (r1 == r11) goto L_0x00c6
            if (r1 != r8) goto L_0x00c0
            int r7 = r14.height()
            int r7 = r7 + r10
            int r7 = -r7
            goto L_0x00d2
        L_0x00c0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x00c6:
            int r7 = r14.width()
            int r7 = r7 + r10
            int r7 = -r7
            goto L_0x00db
        L_0x00cd:
            int r7 = r14.height()
            int r7 = r7 + r10
        L_0x00d2:
            r6.offset(r5, r7)
            goto L_0x00de
        L_0x00d6:
            int r7 = r14.width()
            int r7 = r7 + r10
        L_0x00db:
            r6.offset(r7, r5)
        L_0x00de:
            r2.getClass()
            int r2 = r4.g()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r8 = r5
            r16 = 0
        L_0x00ed:
            if (r8 >= r2) goto L_0x01b4
            java.lang.Object r11 = r4.h(r8)
            i0.f r11 = (i0.f) r11
            if (r11 != r3) goto L_0x00f8
            goto L_0x0145
        L_0x00f8:
            r15.getClass()
            r11.d(r7)
            boolean r12 = o0.b.c(r1, r14, r7)
            if (r12 != 0) goto L_0x0105
            goto L_0x013d
        L_0x0105:
            boolean r12 = o0.b.c(r1, r14, r6)
            if (r12 != 0) goto L_0x010c
            goto L_0x013b
        L_0x010c:
            boolean r12 = o0.b.a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0113
            goto L_0x013b
        L_0x0113:
            boolean r12 = o0.b.a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x011a
            goto L_0x013d
        L_0x011a:
            int r12 = o0.b.d(r1, r14, r7)
            int r13 = o0.b.e(r1, r14, r7)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = o0.b.d(r1, r14, r6)
            int r17 = o0.b.e(r1, r14, r6)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x013d
        L_0x013b:
            r12 = r10
            goto L_0x013e
        L_0x013d:
            r12 = r5
        L_0x013e:
            if (r12 == 0) goto L_0x0145
            r6.set(r7)
            r16 = r11
        L_0x0145:
            int r8 = r8 + 1
            goto L_0x00ed
        L_0x0148:
            android.view.View r2 = r0.f10469i
            java.util.WeakHashMap<android.view.View, h0.l0> r6 = h0.y.f6776a
            int r2 = h0.y.e.d(r2)
            if (r2 != r10) goto L_0x0154
            r2 = r10
            goto L_0x0155
        L_0x0154:
            r2 = r5
        L_0x0155:
            o0.a$b r6 = f10463p
            o0.a$a r7 = f10462o
            r6.getClass()
            int r6 = r4.g()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = r5
        L_0x0166:
            if (r12 >= r6) goto L_0x0174
            java.lang.Object r13 = r4.h(r12)
            i0.f r13 = (i0.f) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0166
        L_0x0174:
            o0.b$b r6 = new o0.b$b
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x019c
            if (r1 != r8) goto L_0x0194
            int r1 = r11.size()
            if (r3 != 0) goto L_0x0188
            r2 = r9
            goto L_0x018c
        L_0x0188:
            int r2 = r11.lastIndexOf(r3)
        L_0x018c:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01af
            java.lang.Object r7 = r11.get(r2)
            goto L_0x01b0
        L_0x0194:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x019c:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01a3
            goto L_0x01a7
        L_0x01a3:
            int r1 = r11.indexOf(r3)
        L_0x01a7:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x01af
            java.lang.Object r7 = r11.get(r1)
            goto L_0x01b0
        L_0x01af:
            r7 = 0
        L_0x01b0:
            r16 = r7
            i0.f r16 = (i0.f) r16
        L_0x01b4:
            r1 = r16
            if (r1 != 0) goto L_0x01bb
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01dc
        L_0x01bb:
            boolean r2 = r4.f9303a
            if (r2 == 0) goto L_0x01c2
            r4.d()
        L_0x01c2:
            int r2 = r4.f9306d
            if (r5 >= r2) goto L_0x01d1
            java.lang.Object[] r2 = r4.f9305c
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01ce
            r9 = r5
            goto L_0x01d1
        L_0x01ce:
            int r5 = r5 + 1
            goto L_0x01c2
        L_0x01d1:
            boolean r1 = r4.f9303a
            if (r1 == 0) goto L_0x01d8
            r4.d()
        L_0x01d8:
            int[] r1 = r4.f9304b
            r6 = r1[r9]
        L_0x01dc:
            boolean r1 = r0.p(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.m(int, android.graphics.Rect):boolean");
    }

    public final f n(int i10) {
        if (i10 != -1) {
            return k(i10);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f10469i);
        f fVar = new f(obtain);
        View view = this.f10469i;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                fVar.f7091a.addChild(this.f10469i, ((Integer) arrayList.get(i11)).intValue());
            }
            return fVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract void o(int i10, f fVar);

    public final boolean p(int i10) {
        int i11;
        if ((!this.f10469i.isFocused() && !this.f10469i.requestFocus()) || (i11 = this.f10471l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f10471l = i10;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.f3063m = true;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final void q(int i10, int i11) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i10 != Integer.MIN_VALUE && this.f10468h.isEnabled() && (parent = this.f10469i.getParent()) != null) {
            if (i10 != -1) {
                accessibilityEvent = AccessibilityEvent.obtain(i11);
                f n2 = n(i10);
                accessibilityEvent.getText().add(n2.e());
                accessibilityEvent.setContentDescription(n2.f7091a.getContentDescription());
                accessibilityEvent.setScrollable(n2.f7091a.isScrollable());
                accessibilityEvent.setPassword(n2.f7091a.isPassword());
                accessibilityEvent.setEnabled(n2.f7091a.isEnabled());
                accessibilityEvent.setChecked(n2.f7091a.isChecked());
                if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                    accessibilityEvent.setClassName(n2.f7091a.getClassName());
                    i.a(accessibilityEvent, this.f10469i, i10);
                    accessibilityEvent.setPackageName(this.f10469i.getContext().getPackageName());
                } else {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
            } else {
                accessibilityEvent = AccessibilityEvent.obtain(i11);
                this.f10469i.onInitializeAccessibilityEvent(accessibilityEvent);
            }
            parent.requestSendAccessibilityEvent(this.f10469i, accessibilityEvent);
        }
    }
}

package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import b0.a;
import l0.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f793a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f794b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f795c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f796d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f797e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f798f;

    public i(CompoundButton compoundButton) {
        this.f793a = compoundButton;
    }

    public final void a() {
        Drawable a10 = c.a(this.f793a);
        if (a10 == null) {
            return;
        }
        if (this.f796d || this.f797e) {
            Drawable mutate = a10.mutate();
            if (this.f796d) {
                a.b.h(mutate, this.f794b);
            }
            if (this.f797e) {
                a.b.i(mutate, this.f795c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f793a.getDrawableState());
            }
            this.f793a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038 A[SYNTHETIC, Splitter:B:11:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[Catch:{ all -> 0x007b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.widget.CompoundButton r0 = r7.f793a
            android.content.Context r0 = r0.getContext()
            int[] r3 = y3.a.f13035q
            androidx.appcompat.widget.i1 r0 = androidx.appcompat.widget.i1.m(r0, r8, r3, r9)
            android.widget.CompoundButton r1 = r7.f793a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f809b
            r4 = r8
            r6 = r9
            h0.y.m(r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x007b }
            r1 = 0
            if (r9 == 0) goto L_0x0035
            int r9 = r0.i(r8, r1)     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0035
            android.widget.CompoundButton r2 = r7.f793a     // Catch:{ NotFoundException -> 0x0035 }
            android.content.Context r3 = r2.getContext()     // Catch:{ NotFoundException -> 0x0035 }
            android.graphics.drawable.Drawable r9 = e.a.a(r3, r9)     // Catch:{ NotFoundException -> 0x0035 }
            r2.setButtonDrawable(r9)     // Catch:{ NotFoundException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r8 = r1
        L_0x0036:
            if (r8 != 0) goto L_0x0051
            boolean r8 = r0.l(r1)     // Catch:{ all -> 0x007b }
            if (r8 == 0) goto L_0x0051
            int r8 = r0.i(r1, r1)     // Catch:{ all -> 0x007b }
            if (r8 == 0) goto L_0x0051
            android.widget.CompoundButton r9 = r7.f793a     // Catch:{ all -> 0x007b }
            android.content.Context r1 = r9.getContext()     // Catch:{ all -> 0x007b }
            android.graphics.drawable.Drawable r8 = e.a.a(r1, r8)     // Catch:{ all -> 0x007b }
            r9.setButtonDrawable(r8)     // Catch:{ all -> 0x007b }
        L_0x0051:
            r8 = 2
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0061
            android.widget.CompoundButton r9 = r7.f793a     // Catch:{ all -> 0x007b }
            android.content.res.ColorStateList r8 = r0.b(r8)     // Catch:{ all -> 0x007b }
            l0.b.c(r9, r8)     // Catch:{ all -> 0x007b }
        L_0x0061:
            r8 = 3
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0077
            android.widget.CompoundButton r9 = r7.f793a     // Catch:{ all -> 0x007b }
            r1 = -1
            int r8 = r0.h(r8, r1)     // Catch:{ all -> 0x007b }
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.o0.b(r8, r1)     // Catch:{ all -> 0x007b }
            l0.b.d(r9, r8)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r0.n()
            return
        L_0x007b:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.b(android.util.AttributeSet, int):void");
    }
}

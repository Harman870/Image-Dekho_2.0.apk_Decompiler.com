package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.imgdkh.app.R;
import g0.c;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class w extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    public static final int f3169g = e0.e((Calendar) null).getMaximum(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f3170h = ((e0.e((Calendar) null).getMaximum(7) + e0.e((Calendar) null).getMaximum(5)) - 1);

    /* renamed from: a  reason: collision with root package name */
    public final v f3171a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f3172b;

    /* renamed from: c  reason: collision with root package name */
    public Collection<Long> f3173c;

    /* renamed from: d  reason: collision with root package name */
    public c f3174d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3175e;

    /* renamed from: f  reason: collision with root package name */
    public final f f3176f;

    public w(v vVar, d<?> dVar, a aVar, f fVar) {
        this.f3171a = vVar;
        this.f3172b = dVar;
        this.f3175e = aVar;
        this.f3176f = fVar;
        this.f3173c = dVar.n();
    }

    public final int b() {
        v vVar = this.f3171a;
        int i10 = this.f3175e.f3092e;
        int i11 = vVar.f3162a.get(7);
        if (i10 <= 0) {
            i10 = vVar.f3162a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + vVar.f3165d;
        }
        return i12;
    }

    /* renamed from: c */
    public final Long getItem(int i10) {
        if (i10 < b()) {
            return null;
        }
        int b10 = b();
        v vVar = this.f3171a;
        if (i10 > (b10 + vVar.f3166e) - 1) {
            return null;
        }
        Calendar c10 = e0.c(vVar.f3162a);
        c10.set(5, (i10 - b()) + 1);
        return Long.valueOf(c10.getTimeInMillis());
    }

    public final void d(TextView textView, long j10, int i10) {
        boolean z9;
        boolean z10;
        String str;
        b bVar;
        boolean z11;
        if (textView != null) {
            Context context = textView.getContext();
            boolean z12 = true;
            if (e0.d().getTimeInMillis() == j10) {
                z9 = true;
            } else {
                z9 = false;
            }
            for (c<Long, Long> cVar : this.f3172b.j()) {
                cVar.getClass();
            }
            for (c<Long, Long> cVar2 : this.f3172b.j()) {
                cVar2.getClass();
            }
            Calendar d10 = e0.d();
            Calendar e10 = e0.e((Calendar) null);
            e10.setTimeInMillis(j10);
            if (d10.get(1) == e10.get(1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                str = e0.b("MMMEd", Locale.getDefault()).format(new Date(j10));
            } else {
                str = e0.b("yMMMEd", Locale.getDefault()).format(new Date(j10));
            }
            if (z9) {
                str = String.format(context.getString(R.string.mtrl_picker_today_description), new Object[]{str});
            }
            textView.setContentDescription(str);
            if (this.f3175e.f3090c.k(j10)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f3172b.n().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (e0.a(j10) == e0.a(it.next().longValue())) {
                        z11 = true;
                        break;
                    }
                }
                textView.setSelected(z11);
                if (z11) {
                    bVar = this.f3174d.f3109b;
                } else {
                    if (e0.d().getTimeInMillis() != j10) {
                        z12 = false;
                    }
                    c cVar3 = this.f3174d;
                    if (z12) {
                        bVar = cVar3.f3110c;
                    } else {
                        bVar = cVar3.f3108a;
                    }
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f3174d.f3114g;
            }
            if (this.f3176f == null || i10 == -1) {
                bVar.b(textView);
                return;
            }
            int i11 = this.f3171a.f3164c;
            bVar.b(textView);
            this.f3176f.getClass();
            this.f3176f.getClass();
            this.f3176f.getClass();
            this.f3176f.getClass();
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f3176f.getClass();
            textView.setContentDescription(str);
        }
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (v.b(j10).equals(this.f3171a)) {
            Calendar c10 = e0.c(this.f3171a.f3162a);
            c10.setTimeInMillis(j10);
            int i10 = c10.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().b() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    public final int getCount() {
        return f3170h;
    }

    public final long getItemId(int i10) {
        return (long) (i10 / this.f3171a.f3165d);
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.c r1 = r5.f3174d
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r5.f3174d = r1
        L_0x000f:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0027
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131492961(0x7f0c0061, float:1.8609389E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = -1
            if (r7 < 0) goto L_0x005f
            com.google.android.material.datepicker.v r2 = r5.f3171a
            int r3 = r2.f3166e
            if (r7 < r3) goto L_0x0037
            goto L_0x005f
        L_0x0037:
            r8 = 1
            int r7 = r7 + r8
            r0.setTag(r2)
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r0.setText(r2)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            r8 = r7
            goto L_0x0067
        L_0x005f:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0067:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x006e
            goto L_0x0075
        L_0x006e:
            long r6 = r6.longValue()
            r5.d(r0, r6, r8)
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.w.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}

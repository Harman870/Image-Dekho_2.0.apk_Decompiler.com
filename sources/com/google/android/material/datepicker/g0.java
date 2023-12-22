package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.imgdkh.app.R;
import java.util.Calendar;
import java.util.Locale;

public final class g0 extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final i<?> f3127c;

    public static class a extends RecyclerView.z {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f3128t;

        public a(TextView textView) {
            super(textView);
            this.f3128t = textView;
        }
    }

    public g0(i<?> iVar) {
        this.f3127c = iVar;
    }

    public final int a() {
        return this.f3127c.W.f3093f;
    }

    public final void d(RecyclerView.z zVar, int i10) {
        String str;
        b bVar;
        a aVar = (a) zVar;
        int i11 = this.f3127c.W.f3088a.f3164c + i10;
        aVar.f3128t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i11)}));
        TextView textView = aVar.f3128t;
        Context context = textView.getContext();
        if (e0.d().get(1) == i11) {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i11)});
        } else {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i11)});
        }
        textView.setContentDescription(str);
        c cVar = this.f3127c.f3132o0;
        Calendar d10 = e0.d();
        if (d10.get(1) == i11) {
            bVar = cVar.f3113f;
        } else {
            bVar = cVar.f3111d;
        }
        for (Long longValue : this.f3127c.V.n()) {
            d10.setTimeInMillis(longValue.longValue());
            if (d10.get(1) == i11) {
                bVar = cVar.f3112e;
            }
        }
        bVar.b(aVar.f3128t);
        aVar.f3128t.setOnClickListener(new f0(this, i11));
    }

    public final RecyclerView.z e(RecyclerView recyclerView, int i10) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, recyclerView, false));
    }
}

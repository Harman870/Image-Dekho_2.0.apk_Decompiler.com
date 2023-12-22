package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class u<S> extends a0<S> {
    public int U;
    public d<S> V;
    public a W;

    public class a extends z<S> {
        public a() {
        }

        public final void a(S s10) {
            Iterator<z<S>> it = u.this.T.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    public final void D(Bundle bundle) {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.f1568g;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        this.V = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.W = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(l(), this.U));
        d<S> dVar = this.V;
        new a();
        return dVar.p();
    }

    public final void K(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.W);
    }
}

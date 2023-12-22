package com.google.android.material.datepicker;

import androidx.fragment.app.o;
import com.google.android.material.datepicker.q;
import java.util.LinkedHashSet;

public abstract class a0<S> extends o {
    public final LinkedHashSet<z<S>> T = new LinkedHashSet<>();

    public boolean b0(q.d dVar) {
        return this.T.add(dVar);
    }
}

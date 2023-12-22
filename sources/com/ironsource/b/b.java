package com.ironsource.b;

import android.util.Pair;
import com.ironsource.d.c;
import com.ironsource.environment.c.a;
import java.util.ArrayList;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public d f3651a;

    /* renamed from: b  reason: collision with root package name */
    public String f3652b;

    /* renamed from: c  reason: collision with root package name */
    public String f3653c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f3654d;

    public b(d dVar, String str, String str2, ArrayList<a> arrayList) {
        this.f3651a = dVar;
        this.f3652b = str;
        this.f3653c = str2;
        this.f3654d = arrayList;
    }

    public final void run() {
        boolean z9 = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            c a10 = com.ironsource.d.b.a(this.f3653c, this.f3652b, arrayList);
            if (a10 != null) {
                int i10 = a10.f3671a;
                if (i10 == 200 || i10 == 204) {
                    z9 = true;
                }
            }
        } catch (Exception unused) {
        }
        d dVar = this.f3651a;
        if (dVar != null) {
            dVar.a(this.f3654d, z9);
        }
    }
}

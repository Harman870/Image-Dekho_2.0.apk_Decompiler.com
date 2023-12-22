package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import z6.b;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3472a;

    public a(FirebaseAuth firebaseAuth, b bVar) {
        this.f3472a = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f3472a.f3461c.iterator();
        while (it.hasNext()) {
            ((i6.a) it.next()).a();
        }
        Iterator it2 = this.f3472a.f3460b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a();
        }
    }
}

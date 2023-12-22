package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f3473a;

    public b(FirebaseAuth firebaseAuth) {
        this.f3473a = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f3473a.f3462d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a();
        }
    }
}

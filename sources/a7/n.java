package a7;

import c6.f;
import com.google.firebase.messaging.FirebaseMessaging;
import r6.a;
import r6.b;

public final /* synthetic */ class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging.a f182a;

    public /* synthetic */ n(FirebaseMessaging.a aVar) {
        this.f182a = aVar;
    }

    public final void a(a aVar) {
        boolean z9;
        boolean z10;
        FirebaseMessaging.a aVar2 = this.f182a;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f3499c;
            if (bool != null) {
                z9 = bool.booleanValue();
            } else {
                f fVar = FirebaseMessaging.this.f3487a;
                fVar.a();
                z6.a aVar3 = fVar.f2500g.get();
                synchronized (aVar3) {
                    z10 = aVar3.f13229b;
                }
                z9 = z10;
            }
        }
        if (z9) {
            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
            com.google.firebase.messaging.a aVar4 = FirebaseMessaging.f3484l;
            firebaseMessaging.d();
        }
    }
}

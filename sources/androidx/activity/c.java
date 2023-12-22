package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.p;
import androidx.lifecycle.g;
import d1.b;
import java.util.ArrayList;

public final /* synthetic */ class c implements b.C0076b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f263a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f264b;

    public /* synthetic */ c(ComponentActivity componentActivity, int i10) {
        this.f263a = i10;
        this.f264b = componentActivity;
    }

    public final Bundle a() {
        switch (this.f263a) {
            case 0:
                ComponentActivity componentActivity = this.f264b;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.b bVar = componentActivity.f235i;
                bVar.getClass();
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(bVar.f299c.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(bVar.f299c.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(bVar.f301e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f304h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f297a);
                return bundle;
            default:
                p pVar = (p) this.f264b;
                int i10 = p.f1598v;
                do {
                } while (p.x(pVar.w()));
                pVar.f1600r.f(g.b.ON_STOP);
                return new Bundle();
        }
    }
}

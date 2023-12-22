package androidx.activity;

import a.b;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.Random;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f265a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f266b;

    public /* synthetic */ d(ComponentActivity componentActivity, int i10) {
        this.f265a = i10;
        this.f266b = componentActivity;
    }

    public final void a() {
        switch (this.f265a) {
            case 0:
                ComponentActivity componentActivity = this.f266b;
                Bundle a10 = componentActivity.f231e.f6042b.a("android:support:activity-result");
                if (a10 != null) {
                    ComponentActivity.b bVar = componentActivity.f235i;
                    bVar.getClass();
                    ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        bVar.f301e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bVar.f297a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        bVar.f304h.putAll(a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                            String str = stringArrayList.get(i10);
                            if (bVar.f299c.containsKey(str)) {
                                Integer num = (Integer) bVar.f299c.remove(str);
                                if (!bVar.f304h.containsKey(str)) {
                                    bVar.f298b.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i10).intValue();
                            String str2 = stringArrayList.get(i10);
                            bVar.f298b.put(Integer.valueOf(intValue), str2);
                            bVar.f299c.put(str2, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                u<?> uVar = ((p) this.f266b).f1599q.f1618a;
                uVar.f1638e.c(uVar, uVar, (o) null);
                return;
        }
    }
}

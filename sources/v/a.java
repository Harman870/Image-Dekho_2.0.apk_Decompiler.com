package v;

import c2.b;
import g0.e;
import i4.id;
import i4.l6;
import i4.s3;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import m.h;

public final class a implements s3 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12377a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12378b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12379c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12380d;

    public /* synthetic */ a() {
        this.f12377a = new e(10);
        this.f12378b = new h();
        this.f12379c = new ArrayList();
        this.f12380d = new HashSet();
    }

    public /* synthetic */ a(ECPublicKey eCPublicKey, byte[] bArr, String str, l6 l6Var) {
        id.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f12377a = new b((Object) eCPublicKey);
        this.f12379c = bArr;
        this.f12378b = str;
        this.f12380d = l6Var;
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((h) this.f12378b).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        a(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}

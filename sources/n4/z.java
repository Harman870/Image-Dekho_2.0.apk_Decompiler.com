package n4;

import com.bumptech.glide.manager.o;
import i4.md;
import j4.ga;
import java.security.Provider;
import java.util.List;
import javax.crypto.Mac;
import r5.l;

public /* synthetic */ class z implements u2, o, md {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ z f10342a = new z();

    public void a(float f10, float f11, l lVar) {
        throw null;
    }

    public /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    public Object zza() {
        List list = w2.f10205a;
        return Long.valueOf(ga.f8203b.zza().B());
    }
}

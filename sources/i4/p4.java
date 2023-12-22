package i4;

import androidx.activity.f;
import java.nio.charset.Charset;

public final class p4 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7586a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static kc a(gc gcVar) {
        hc v10 = kc.v();
        int w = gcVar.w();
        v10.j();
        ((kc) v10.f7833b).zzd = w;
        for (fc fcVar : gcVar.B()) {
            ic w10 = jc.w();
            String A = fcVar.w().A();
            w10.j();
            jc.y((jc) w10.f7833b, A);
            int E = fcVar.E();
            w10.j();
            jc.B((jc) w10.f7833b, E);
            int z9 = fcVar.z();
            w10.j();
            ((jc) w10.f7833b).zzg = f.a(z9);
            int v11 = fcVar.v();
            w10.j();
            ((jc) w10.f7833b).zzf = v11;
            v10.j();
            kc.z((kc) v10.f7833b, (jc) w10.d());
        }
        return (kc) v10.d();
    }
}

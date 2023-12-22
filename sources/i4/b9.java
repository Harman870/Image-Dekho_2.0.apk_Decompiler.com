package i4;

import androidx.activity.e;
import androidx.activity.result.c;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public final class b9 implements l4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7203a = Logger.getLogger(b9.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7204b = {0};

    public final Object a(k4 k4Var) {
        byte[] bArr;
        for (List it : ((ConcurrentMap) k4Var.f7436a).values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    i4 i4Var = (i4) it2.next();
                    c cVar = i4Var.f7383e;
                    if (cVar instanceof y8) {
                        y8 y8Var = (y8) cVar;
                        byte[] bArr2 = i4Var.f7380b;
                        if (bArr2 == null) {
                            bArr = null;
                        } else {
                            bArr = Arrays.copyOf(bArr2, bArr2.length);
                        }
                        xd a10 = xd.a(bArr);
                        if (!a10.equals(y8Var.B())) {
                            String valueOf = String.valueOf(y8Var.A());
                            String xdVar = y8Var.B().toString();
                            String xdVar2 = a10.toString();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Mac Key with parameters ");
                            sb.append(valueOf);
                            sb.append(" has wrong output prefix (");
                            sb.append(xdVar);
                            sb.append(") instead of (");
                            throw new GeneralSecurityException(e.c(sb, xdVar2, ")"));
                        }
                    }
                }
            }
        }
        return new a9(k4Var);
    }

    public final Class zza() {
        return g4.class;
    }

    public final Class zzb() {
        return g4.class;
    }
}

package u1;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.activity.result.c;
import b6.f;
import com.google.android.gms.common.api.Status;
import h6.b0;
import i4.af;
import i4.fg;
import i4.gc;
import i4.h6;
import i4.k0;
import i4.kd;
import i4.l0;
import i4.lf;
import i4.n;
import i4.re;
import i4.wg;
import i4.ye;
import i4.zf;
import i6.h;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import n3.w;
import n4.a6;
import n4.c8;
import o1.d;
import r3.o;
import u3.a;
import z5.l;
import z5.q;

public final class t implements d, c8, f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12166a;

    public /* synthetic */ t(zf zfVar) {
        this.f12166a = zfVar;
    }

    public /* synthetic */ t(Object obj) {
        this.f12166a = obj;
    }

    public static void h(t tVar, n nVar, w wVar, fg fgVar) {
        boolean z9;
        Status status;
        if (nVar.f7497a || !TextUtils.isEmpty(nVar.f7507l)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            b0 a10 = nVar.a();
            String str = nVar.f7501e;
            String str2 = nVar.f7509n;
            if (nVar.f7497a) {
                status = new Status(17012, (String) null);
            } else {
                status = h.a(nVar.f7507l);
            }
            re reVar = new re(status, a10, str, str2);
            wVar.getClass();
            try {
                ((lf) wVar.f9573a).e(reVar);
            } catch (RemoteException e10) {
                ((a) wVar.f9574b).b("RemoteException when sending failure result with credential", e10, new Object[0]);
            }
        } else {
            tVar.e(new wg(nVar.f7499c, nVar.f7498b, Long.valueOf(nVar.f7500d), "Bearer"), nVar.f7503g, nVar.f7502f, Boolean.valueOf(nVar.f7504h), nVar.a(), wVar, fgVar);
        }
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return new q((l) ((b6.h) this.f12166a).a());
    }

    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            a6 a6Var = (a6) this.f12166a;
            a6Var.f9600a.f9998n.getClass();
            a6Var.m("auto", "_err", bundle, true, true, System.currentTimeMillis());
            return;
        }
        ((a6) this.f12166a).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void b(String str, fg fgVar) {
        o.e(str);
        wg x9 = wg.x(str);
        if (x9.z()) {
            fgVar.c(x9);
            return;
        }
        ((c) this.f12166a).u(new h6(x9.f7776a), new af(fgVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC, Splitter:B:29:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r5, java.io.File r6, o1.h r7) {
        /*
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.lang.Object r0 = r4.f12166a
            r1.b r0 = (r1.b) r0
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r0 = r0.c(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0033 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0033 }
        L_0x0019:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r2 = -1
            if (r6 == r2) goto L_0x0024
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            goto L_0x0019
        L_0x0024:
            r3.close()     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            r1 = 1
            r3.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0045
        L_0x002c:
            r5 = move-exception
            goto L_0x004e
        L_0x002e:
            r5 = move-exception
            r2 = r3
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x004d
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0040
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0031 }
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.lang.Object r5 = r4.f12166a
            r1.b r5 = (r1.b) r5
            r5.put(r0)
            return r1
        L_0x004d:
            r3 = r2
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            java.lang.Object r6 = r4.f12166a
            r1.b r6 = (r1.b) r6
            r6.put(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.t.d(java.lang.Object, java.io.File, o1.h):boolean");
    }

    public final void e(wg wgVar, String str, String str2, Boolean bool, b0 b0Var, w wVar, fg fgVar) {
        o.h(fgVar);
        o.h(wVar);
        wg wgVar2 = wgVar;
        ((c) this.f12166a).v(new af(wgVar2.f7777b), new ye(wVar, fgVar, wgVar2, b0Var, bool, str2, str));
    }

    public final void f(gc gcVar) {
        try {
            OutputStream outputStream = (OutputStream) this.f12166a;
            gcVar.getClass();
            int h10 = gcVar.h();
            Logger logger = l0.f7459c;
            if (h10 > 4096) {
                h10 = 4096;
            }
            k0 k0Var = new k0(outputStream, h10);
            gcVar.l(k0Var);
            if (k0Var.f7429g > 0) {
                k0Var.X();
            }
        } finally {
            ((OutputStream) this.f12166a).close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] g() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12166a
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002e
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L_0x0024
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = r3
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = r4
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 0
            goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            if (r0 == 0) goto L_0x004d
            if (r0 == r4) goto L_0x004a
            if (r0 != r3) goto L_0x0042
            byte[] r0 = i4.u6.f7718h
            return r0
        L_0x0042:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L_0x004a:
            byte[] r0 = i4.u6.f7717g
            return r0
        L_0x004d:
            byte[] r0 = i4.u6.f7716f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.t.g():byte[]");
    }

    public final byte[] i(int i10, byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) kd.f7451f.a((String) this.f12166a);
        if (i10 <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i10];
            mac.init(new SecretKeySpec(bArr, (String) this.f12166a));
            byte[] bArr4 = new byte[0];
            int i11 = 1;
            int i12 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i11);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i13 = i12 + length;
                if (i13 < i10) {
                    System.arraycopy(bArr4, 0, bArr3, i12, length);
                    i11++;
                    i12 = i13;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i12, i10 - i12);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    public final byte[] j(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) kd.f7451f.a((String) this.f12166a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], (String) this.f12166a));
        } else {
            mac.init(new SecretKeySpec(bArr2, (String) this.f12166a));
        }
        return mac.doFinal(bArr);
    }
}

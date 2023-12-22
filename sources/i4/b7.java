package i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i6.h;
import j4.a1;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import n3.w;
import n4.g5;
import n4.n4;
import u1.t;

public final class b7 implements fg, g5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7199a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7200b;

    public /* synthetic */ b7(Context context, String str) {
        this.f7200b = "GenericIdpKeyset";
        Context applicationContext = context.getApplicationContext();
        this.f7199a = str == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str, 0);
    }

    public /* synthetic */ b7(Object obj, Object obj2) {
        this.f7200b = obj;
        this.f7199a = obj2;
    }

    public final byte[] a() {
        try {
            String string = ((SharedPreferences) this.f7199a).getString((String) this.f7200b, (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{(String) this.f7200b}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 + i10;
                    int digit = Character.digit(string.charAt(i11), 16);
                    int digit2 = Character.digit(string.charAt(i11 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i10] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{(String) this.f7200b}));
        }
    }

    public final void c(xf xfVar) {
        n nVar = (n) xfVar;
        if (!(!TextUtils.isEmpty(nVar.f7511p))) {
            t.h((t) this.f7200b, nVar, (w) this.f7199a, this);
        } else {
            ((w) this.f7199a).e(new te(nVar.f7511p, nVar.f7510o, nVar.a()));
        }
    }

    public final void interceptEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            ((a1) this.f7199a).zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            n4 n4Var = ((AppMeasurementDynamiteService) this.f7200b).f2841a;
            if (n4Var != null) {
                n4Var.a().f9831i.b("Event interceptor threw exception", e10);
            }
        }
    }

    public final void zza(String str) {
        ((w) this.f7199a).f(h.a(str));
    }
}

package z5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import b6.d;
import b6.r;
import b6.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class e extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f13198b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f13199c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(l lVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f13199c = lVar;
        this.f13198b = context;
    }

    public final void b() {
        int length;
        String str;
        TaskCompletionSource taskCompletionSource = this.f13199c.f13215c;
        Context context = this.f13198b;
        r rVar = d.f2285a;
        boolean z9 = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    r rVar2 = d.f2285a;
                    Object[] objArr = new Object[0];
                    rVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", r.c(rVar2.f2295a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        byte[] byteArray = signatureArr[i10].toByteArray();
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.update(byteArray);
                            str = Base64.encodeToString(instance.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                            z9 = true;
                        } else {
                            i10++;
                        }
                    }
                    z9 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        taskCompletionSource.trySetResult(Boolean.valueOf(z9));
    }
}

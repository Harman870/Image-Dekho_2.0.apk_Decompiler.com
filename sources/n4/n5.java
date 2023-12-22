package n4;

import android.os.Bundle;

public final class n5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10010b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f10011c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f10012d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f10013e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f10014f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f10015g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f10016h = null;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a6 f10017i;

    public n5(a6 a6Var, String str, String str2, long j10, Bundle bundle, boolean z9, boolean z10, boolean z11) {
        this.f10017i = a6Var;
        this.f10009a = str;
        this.f10010b = str2;
        this.f10011c = j10;
        this.f10012d = bundle;
        this.f10013e = z9;
        this.f10014f = z10;
        this.f10015g = z11;
    }

    public final void run() {
        this.f10017i.p(this.f10009a, this.f10010b, this.f10011c, this.f10012d, this.f10013e, this.f10014f, this.f10015g, this.f10016h);
    }
}

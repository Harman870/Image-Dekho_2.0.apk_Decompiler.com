package n4;

import android.os.Bundle;

public final class j3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f9858a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9859b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9860c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f9861d;

    public j3(String str, String str2, Bundle bundle, long j10) {
        this.f9858a = str;
        this.f9859b = str2;
        this.f9861d = bundle;
        this.f9860c = j10;
    }

    public static j3 b(r rVar) {
        return new j3(rVar.f10085a, rVar.f10087c, rVar.f10086b.x(), rVar.f10088d);
    }

    public final r a() {
        return new r(this.f9858a, new p(new Bundle(this.f9861d)), this.f9859b, this.f9860c);
    }

    public final String toString() {
        String str = this.f9859b;
        String str2 = this.f9858a;
        String obj = this.f9861d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}

package u1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import y3.a;

public final class f implements o1.f {

    /* renamed from: b  reason: collision with root package name */
    public final g f12112b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f12113c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12114d;

    /* renamed from: e  reason: collision with root package name */
    public String f12115e;

    /* renamed from: f  reason: collision with root package name */
    public URL f12116f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f12117g;

    /* renamed from: h  reason: collision with root package name */
    public int f12118h;

    public f(String str) {
        i iVar = g.f12119a;
        this.f12113c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f12114d = str;
            a.h(iVar);
            this.f12112b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public final void b(MessageDigest messageDigest) {
        if (this.f12117g == null) {
            this.f12117g = c().getBytes(o1.f.f10513a);
        }
        messageDigest.update(this.f12117g);
    }

    public final String c() {
        String str = this.f12114d;
        if (str != null) {
            return str;
        }
        URL url = this.f12113c;
        a.h(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f12116f == null) {
            if (TextUtils.isEmpty(this.f12115e)) {
                String str = this.f12114d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f12113c;
                    a.h(url);
                    str = url.toString();
                }
                this.f12115e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f12116f = new URL(this.f12115e);
        }
        return this.f12116f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c().equals(fVar.c()) && this.f12112b.equals(fVar.f12112b);
    }

    public final int hashCode() {
        if (this.f12118h == 0) {
            int hashCode = c().hashCode();
            this.f12118h = hashCode;
            this.f12118h = this.f12112b.hashCode() + (hashCode * 31);
        }
        return this.f12118h;
    }

    public final String toString() {
        return c();
    }

    public f(URL url) {
        i iVar = g.f12119a;
        a.h(url);
        this.f12113c = url;
        this.f12114d = null;
        a.h(iVar);
        this.f12112b = iVar;
    }
}

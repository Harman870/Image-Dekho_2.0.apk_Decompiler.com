package j4;

import android.net.Uri;

public final class c5 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f8082a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8083b;

    public c5(Uri uri, boolean z9, boolean z10) {
        this.f8082a = uri;
        this.f8083b = z9;
    }

    public final y4 a(long j10, String str) {
        return new y4(this, str, Long.valueOf(j10));
    }

    public final b5 b(String str, String str2) {
        return new b5(this, str, str2);
    }

    public final z4 c(String str, boolean z9) {
        return new z4(this, str, Boolean.valueOf(z9));
    }
}

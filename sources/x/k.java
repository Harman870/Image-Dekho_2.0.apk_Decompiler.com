package x;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f12783a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f12784b;

    /* renamed from: c  reason: collision with root package name */
    public final t[] f12785c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12786d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12787e = true;

    /* renamed from: f  reason: collision with root package name */
    public final int f12788f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12789g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public int f12790h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f12791i;

    /* renamed from: j  reason: collision with root package name */
    public PendingIntent f12792j;
    public boolean k;

    public k(String str, PendingIntent pendingIntent) {
        IconCompat b10 = IconCompat.b("", 2131165340);
        Bundle bundle = new Bundle();
        this.f12784b = b10;
        int i10 = b10.f1259a;
        if ((i10 == -1 ? IconCompat.a.c(b10.f1260b) : i10) == 2) {
            this.f12790h = b10.c();
        }
        this.f12791i = n.b(str);
        this.f12792j = pendingIntent;
        this.f12783a = bundle;
        this.f12785c = null;
        this.f12786d = true;
        this.f12788f = 0;
        this.f12787e = true;
        this.f12789g = false;
        this.k = false;
    }
}

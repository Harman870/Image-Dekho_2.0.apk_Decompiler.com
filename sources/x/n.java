package x;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.imgdkh.app.R;
import java.util.ArrayList;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public Context f12797a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<k> f12798b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<s> f12799c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<k> f12800d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f12801e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f12802f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f12803g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f12804h;

    /* renamed from: i  reason: collision with root package name */
    public int f12805i;

    /* renamed from: j  reason: collision with root package name */
    public int f12806j;
    public boolean k = true;

    /* renamed from: l  reason: collision with root package name */
    public o f12807l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12808m = false;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f12809n;

    /* renamed from: o  reason: collision with root package name */
    public int f12810o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f12811p = 0;

    /* renamed from: q  reason: collision with root package name */
    public String f12812q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12813r;

    /* renamed from: s  reason: collision with root package name */
    public Notification f12814s;
    @Deprecated

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<String> f12815t;

    public n(Context context, String str) {
        Notification notification = new Notification();
        this.f12814s = notification;
        this.f12797a = context;
        this.f12812q = str;
        notification.when = System.currentTimeMillis();
        this.f12814s.audioStreamType = -1;
        this.f12806j = 0;
        this.f12815t = new ArrayList<>();
        this.f12813r = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        p pVar = new p(this);
        o oVar = pVar.f12819c.f12807l;
        if (oVar != null) {
            oVar.b(pVar);
        }
        Notification build = pVar.f12818b.build();
        pVar.f12819c.getClass();
        if (oVar != null) {
            pVar.f12819c.f12807l.getClass();
        }
        if (!(oVar == null || (bundle = build.extras) == null)) {
            oVar.a(bundle);
        }
        return build;
    }

    public final void c(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f12797a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.f12804h = bitmap;
    }

    public final void d(o oVar) {
        if (this.f12807l != oVar) {
            this.f12807l = oVar;
            if (oVar.f12816a != this) {
                oVar.f12816a = this;
                d(oVar);
            }
        }
    }
}

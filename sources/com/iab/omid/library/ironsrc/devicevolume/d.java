package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3533a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f3534b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3535c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3536d;

    /* renamed from: e  reason: collision with root package name */
    private float f3537e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f3533a = context;
        this.f3534b = (AudioManager) context.getSystemService("audio");
        this.f3535c = aVar;
        this.f3536d = cVar;
    }

    private float a() {
        return this.f3535c.a(this.f3534b.getStreamVolume(3), this.f3534b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f3537e;
    }

    private void b() {
        this.f3536d.a(this.f3537e);
    }

    public final void c() {
        this.f3537e = a();
        b();
        this.f3533a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void d() {
        this.f3533a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z9) {
        super.onChange(z9);
        float a10 = a();
        if (a(a10)) {
            this.f3537e = a10;
            b();
        }
    }
}

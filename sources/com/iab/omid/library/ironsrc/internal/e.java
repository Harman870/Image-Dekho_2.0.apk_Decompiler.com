package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.weakreference.a;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final a f3551a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3552b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f3553c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3554d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f3551a = new a(view);
        this.f3552b = view.getClass().getCanonicalName();
        this.f3553c = friendlyObstructionPurpose;
        this.f3554d = str;
    }

    public String a() {
        return this.f3554d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f3553c;
    }

    public a c() {
        return this.f3551a;
    }

    public String d() {
        return this.f3552b;
    }
}

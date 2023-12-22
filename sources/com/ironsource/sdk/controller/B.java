package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.service.d;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class B {

    /* renamed from: a  reason: collision with root package name */
    public final String f5323a;

    /* renamed from: b  reason: collision with root package name */
    public Context f5324b;

    /* renamed from: c  reason: collision with root package name */
    public d f5325c;

    /* renamed from: d  reason: collision with root package name */
    public C0201c f5326d;

    /* renamed from: e  reason: collision with root package name */
    public k f5327e;

    /* renamed from: f  reason: collision with root package name */
    public int f5328f;

    /* renamed from: g  reason: collision with root package name */
    public com.ironsource.sdk.l.d f5329g;

    /* renamed from: h  reason: collision with root package name */
    public int f5330h;

    /* renamed from: i  reason: collision with root package name */
    public int f5331i = FeaturesManager.getInstance().getInitRecoverTrials();

    /* renamed from: j  reason: collision with root package name */
    public final String f5332j = "B";
    public int k;

    /* 'enum' modifier removed */
    /* JADX WARNING: Enum class init method not found */
    public static final class a extends Enum<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5333a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5334b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5335c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f5336d = 4;
    }

    public B(Context context, C0201c cVar, d dVar, k kVar, int i10, com.ironsource.sdk.l.d dVar2, String str) {
        int i11;
        Logger.i("B", "getInitialState mMaxAllowedTrials: " + this.f5331i);
        if (this.f5331i <= 0) {
            Logger.i("B", "recovery is not allowed by config");
            i11 = a.f5336d;
        } else {
            i11 = a.f5333a;
        }
        this.k = i11;
        if (i11 != a.f5336d) {
            this.f5324b = context;
            this.f5326d = cVar;
            this.f5325c = dVar;
            this.f5327e = kVar;
            this.f5328f = i10;
            this.f5329g = dVar2;
            this.f5330h = 0;
        }
        this.f5323a = str;
    }

    public final void a(boolean z9) {
        if (this.k == a.f5335c) {
            if (z9) {
                this.f5324b = null;
                this.f5326d = null;
                this.f5325c = null;
                this.f5327e = null;
                this.f5329g = null;
                this.k = a.f5334b;
            } else if (this.f5330h == this.f5331i) {
                Logger.i(this.f5332j, "handleRecoveringEndedFailed | Reached max trials");
                this.k = a.f5336d;
                this.f5324b = null;
                this.f5326d = null;
                this.f5325c = null;
                this.f5327e = null;
                this.f5329g = null;
            } else {
                this.k = a.f5333a;
            }
        }
    }

    public final boolean a() {
        return this.k == a.f5335c;
    }

    public final boolean a(d.c cVar, d.b bVar) {
        Logger.i(this.f5332j, "shouldRecoverWebController: ");
        int i10 = this.k;
        if (i10 == a.f5336d) {
            Logger.i(this.f5332j, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        } else if (cVar != d.c.Native) {
            String str = this.f5332j;
            Logger.i(str, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        } else if (bVar == d.b.Loading || bVar == d.b.None) {
            Logger.i(this.f5332j, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        } else if (i10 == a.f5334b) {
            Logger.i(this.f5332j, "shouldRecoverWebController: false | already recovered");
            return false;
        } else if (i10 == a.f5335c) {
            Logger.i(this.f5332j, "shouldRecoverWebController: false | currently in recovering");
            return false;
        } else if (this.f5324b == null || this.f5326d == null || this.f5325c == null || this.f5327e == null) {
            Logger.i(this.f5332j, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        } else {
            Logger.i(this.f5332j, "shouldRecoverWebController: true | allow recovering ");
            return true;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isRecovered", this.k == a.f5334b);
            jSONObject.put("trialNumber", this.f5330h);
            jSONObject.put("maxAllowedTrials", this.f5331i);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}

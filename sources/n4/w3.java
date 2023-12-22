package n4;

import android.content.SharedPreferences;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r3.o;

public final class w3 extends b5 {

    /* renamed from: x  reason: collision with root package name */
    public static final Pair f10252x = new Pair("", 0L);

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f10253c;

    /* renamed from: d  reason: collision with root package name */
    public u3 f10254d;

    /* renamed from: e  reason: collision with root package name */
    public final t3 f10255e = new t3(this, "first_open_time", 0);

    /* renamed from: f  reason: collision with root package name */
    public final v3 f10256f;

    /* renamed from: g  reason: collision with root package name */
    public String f10257g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10258h;

    /* renamed from: i  reason: collision with root package name */
    public long f10259i;

    /* renamed from: j  reason: collision with root package name */
    public final t3 f10260j = new t3(this, "session_timeout", 1800000);
    public final r3 k = new r3(this, "start_new_session", true);

    /* renamed from: l  reason: collision with root package name */
    public final v3 f10261l = new v3(this, "non_personalized_ads");

    /* renamed from: m  reason: collision with root package name */
    public final r3 f10262m = new r3(this, "allow_remote_dynamite", false);

    /* renamed from: n  reason: collision with root package name */
    public final t3 f10263n = new t3(this, "last_pause_time", 0);

    /* renamed from: o  reason: collision with root package name */
    public final t3 f10264o = new t3(this, "session_id", 0);

    /* renamed from: p  reason: collision with root package name */
    public boolean f10265p;

    /* renamed from: q  reason: collision with root package name */
    public final r3 f10266q;

    /* renamed from: r  reason: collision with root package name */
    public final r3 f10267r;

    /* renamed from: s  reason: collision with root package name */
    public final t3 f10268s;

    /* renamed from: t  reason: collision with root package name */
    public final v3 f10269t;
    public final v3 u;

    /* renamed from: v  reason: collision with root package name */
    public final t3 f10270v;
    public final s3 w;

    public w3(n4 n4Var) {
        super(n4Var);
        o.e("app_install_time");
        this.f10256f = new v3(this, "app_instance_id");
        this.f10266q = new r3(this, "app_backgrounded", false);
        this.f10267r = new r3(this, "deep_link_retrieval_complete", false);
        this.f10268s = new t3(this, "deep_link_retrieval_attempts", 0);
        this.f10269t = new v3(this, "firebase_feature_rollouts");
        this.u = new v3(this, "deferred_attribution_cache");
        this.f10270v = new t3(this, "deferred_attribution_cache_timestamp", 0);
        this.w = new s3(this);
    }

    public final boolean h() {
        return true;
    }

    public final SharedPreferences k() {
        g();
        i();
        o.h(this.f10253c);
        return this.f10253c;
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void l() {
        SharedPreferences sharedPreferences = this.f9600a.f9986a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10253c = sharedPreferences;
        boolean z9 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f10265p = z9;
        if (!z9) {
            SharedPreferences.Editor edit = this.f10253c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f9600a.getClass();
        this.f10254d = new u3(this, Math.max(0, ((Long) w2.f10211d.a((Object) null)).longValue()));
    }

    public final f5 m() {
        g();
        return f5.b(k().getInt("consent_source", 100), k().getString("consent_settings", "G1"));
    }

    public final Boolean n() {
        g();
        if (k().contains("measurement_enabled")) {
            return Boolean.valueOf(k().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void o(Boolean bool) {
        g();
        SharedPreferences.Editor edit = k().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void p(boolean z9) {
        g();
        this.f9600a.a().f9835n.b("App measurement setting deferred collection", Boolean.valueOf(z9));
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean("deferred_analytics_collection", z9);
        edit.apply();
    }

    public final boolean q(long j10) {
        return j10 - this.f10260j.a() > this.f10263n.a();
    }

    public final boolean r(int i10) {
        int i11 = k().getInt("consent_source", 100);
        f5 f5Var = f5.f9743c;
        return i10 <= i11;
    }
}

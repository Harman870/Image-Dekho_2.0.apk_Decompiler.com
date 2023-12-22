package j4;

public final class ia implements ha {
    public static final y4 A;
    public static final y4 B;
    public static final y4 C;
    public static final y4 D;
    public static final y4 E;
    public static final y4 F;
    public static final y4 G;
    public static final y4 H;
    public static final y4 I;
    public static final y4 J;
    public static final b5 K;
    public static final y4 L;

    /* renamed from: a  reason: collision with root package name */
    public static final y4 f8241a;

    /* renamed from: b  reason: collision with root package name */
    public static final y4 f8242b;

    /* renamed from: c  reason: collision with root package name */
    public static final y4 f8243c;

    /* renamed from: d  reason: collision with root package name */
    public static final y4 f8244d;

    /* renamed from: e  reason: collision with root package name */
    public static final b5 f8245e;

    /* renamed from: f  reason: collision with root package name */
    public static final b5 f8246f;

    /* renamed from: g  reason: collision with root package name */
    public static final y4 f8247g;

    /* renamed from: h  reason: collision with root package name */
    public static final y4 f8248h;

    /* renamed from: i  reason: collision with root package name */
    public static final y4 f8249i;

    /* renamed from: j  reason: collision with root package name */
    public static final y4 f8250j;
    public static final y4 k;

    /* renamed from: l  reason: collision with root package name */
    public static final y4 f8251l;

    /* renamed from: m  reason: collision with root package name */
    public static final y4 f8252m;

    /* renamed from: n  reason: collision with root package name */
    public static final y4 f8253n;

    /* renamed from: o  reason: collision with root package name */
    public static final y4 f8254o;

    /* renamed from: p  reason: collision with root package name */
    public static final y4 f8255p;

    /* renamed from: q  reason: collision with root package name */
    public static final y4 f8256q;

    /* renamed from: r  reason: collision with root package name */
    public static final y4 f8257r;

    /* renamed from: s  reason: collision with root package name */
    public static final y4 f8258s;

    /* renamed from: t  reason: collision with root package name */
    public static final y4 f8259t;
    public static final y4 u;

    /* renamed from: v  reason: collision with root package name */
    public static final y4 f8260v;
    public static final y4 w;

    /* renamed from: x  reason: collision with root package name */
    public static final y4 f8261x;

    /* renamed from: y  reason: collision with root package name */
    public static final y4 f8262y;

    /* renamed from: z  reason: collision with root package name */
    public static final y4 f8263z;

    static {
        c5 c5Var = new c5(v4.a(), false, true);
        f8241a = c5Var.a(10000, "measurement.ad_id_cache_time");
        f8242b = c5Var.a(3600000, "measurement.app_uninstalled_additional_ad_id_cache_time");
        f8243c = c5Var.a(100, "measurement.max_bundles_per_iteration");
        f8244d = c5Var.a(86400000, "measurement.config.cache_time");
        c5Var.b("measurement.log_tag", "FA");
        f8245e = new b5(c5Var, "measurement.config.url_authority", "app-measurement.com");
        f8246f = new b5(c5Var, "measurement.config.url_scheme", "https");
        f8247g = c5Var.a(1000, "measurement.upload.debug_upload_interval");
        f8248h = c5Var.a(4, "measurement.lifetimevalue.max_currency_tracked");
        f8249i = c5Var.a(100000, "measurement.store.max_stored_events_per_app");
        f8250j = c5Var.a(50, "measurement.experiment.max_ids");
        k = c5Var.a(200, "measurement.audience.filter_result_max_count");
        f8251l = c5Var.a(27, "measurement.upload.max_item_scoped_custom_parameters");
        f8252m = c5Var.a(60000, "measurement.alarm_manager.minimum_interval");
        f8253n = c5Var.a(500, "measurement.upload.minimum_delay");
        f8254o = c5Var.a(86400000, "measurement.monitoring.sample_period_millis");
        f8255p = c5Var.a(10000, "measurement.upload.realtime_upload_interval");
        f8256q = c5Var.a(604800000, "measurement.upload.refresh_blacklisted_config_interval");
        c5Var.a(3600000, "measurement.config.cache_time.service");
        f8257r = c5Var.a(5000, "measurement.service_client.idle_disconnect_millis");
        c5Var.b("measurement.log_tag.service", "FA-SVC");
        f8258s = c5Var.a(86400000, "measurement.upload.stale_data_deletion_interval");
        f8259t = c5Var.a(604800000, "measurement.sdk.attribution.cache.ttl");
        u = c5Var.a(7200000, "measurement.redaction.app_instance_id.ttl");
        f8260v = c5Var.a(43200000, "measurement.upload.backoff_period");
        w = c5Var.a(15000, "measurement.upload.initial_upload_delay_time");
        f8261x = c5Var.a(3600000, "measurement.upload.interval");
        f8262y = c5Var.a(65536, "measurement.upload.max_bundle_size");
        f8263z = c5Var.a(100, "measurement.upload.max_bundles");
        A = c5Var.a(500, "measurement.upload.max_conversions_per_day");
        B = c5Var.a(1000, "measurement.upload.max_error_events_per_day");
        C = c5Var.a(1000, "measurement.upload.max_events_per_bundle");
        D = c5Var.a(100000, "measurement.upload.max_events_per_day");
        E = c5Var.a(50000, "measurement.upload.max_public_events_per_day");
        F = c5Var.a(2419200000L, "measurement.upload.max_queue_time");
        G = c5Var.a(10, "measurement.upload.max_realtime_events_per_day");
        H = c5Var.a(65536, "measurement.upload.max_batch_size");
        I = c5Var.a(6, "measurement.upload.retry_count");
        J = c5Var.a(1800000, "measurement.upload.retry_time");
        K = new b5(c5Var, "measurement.upload.url", "https://app-measurement.com/a");
        L = c5Var.a(3600000, "measurement.upload.window_interval");
    }

    public final long A() {
        return ((Long) J.b()).longValue();
    }

    public final long B() {
        return ((Long) F.b()).longValue();
    }

    public final long C() {
        return ((Long) L.b()).longValue();
    }

    public final long D() {
        return ((Long) G.b()).longValue();
    }

    public final long E() {
        return ((Long) f8263z.b()).longValue();
    }

    public final long F() {
        return ((Long) C.b()).longValue();
    }

    public final long G() {
        return ((Long) f8260v.b()).longValue();
    }

    public final long a() {
        return ((Long) f8244d.b()).longValue();
    }

    public final long b() {
        return ((Long) f8250j.b()).longValue();
    }

    public final long c() {
        return ((Long) D.b()).longValue();
    }

    public final long d() {
        return ((Long) f8253n.b()).longValue();
    }

    public final long e() {
        return ((Long) f8258s.b()).longValue();
    }

    public final long f() {
        return ((Long) f8251l.b()).longValue();
    }

    public final String g() {
        return (String) K.b();
    }

    public final long h() {
        return ((Long) u.b()).longValue();
    }

    public final long i() {
        return ((Long) f8256q.b()).longValue();
    }

    public final long j() {
        return ((Long) f8252m.b()).longValue();
    }

    public final long k() {
        return ((Long) f8249i.b()).longValue();
    }

    public final long l() {
        return ((Long) f8257r.b()).longValue();
    }

    public final String m() {
        return (String) f8245e.b();
    }

    public final long n() {
        return ((Long) H.b()).longValue();
    }

    public final long o() {
        return ((Long) A.b()).longValue();
    }

    public final long p() {
        return ((Long) w.b()).longValue();
    }

    public final long q() {
        return ((Long) B.b()).longValue();
    }

    public final long r() {
        return ((Long) f8254o.b()).longValue();
    }

    public final String s() {
        return (String) f8246f.b();
    }

    public final long t() {
        return ((Long) f8261x.b()).longValue();
    }

    public final long u() {
        return ((Long) I.b()).longValue();
    }

    public final long v() {
        return ((Long) f8259t.b()).longValue();
    }

    public final long w() {
        return ((Long) E.b()).longValue();
    }

    public final long x() {
        return ((Long) f8255p.b()).longValue();
    }

    public final long y() {
        return ((Long) f8262y.b()).longValue();
    }

    public final long z() {
        return ((Long) f8248h.b()).longValue();
    }

    public final long zza() {
        return ((Long) f8241a.b()).longValue();
    }

    public final long zzb() {
        return ((Long) f8242b.b()).longValue();
    }

    public final long zzc() {
        return ((Long) f8243c.b()).longValue();
    }

    public final long zze() {
        return ((Long) f8247g.b()).longValue();
    }

    public final long zzi() {
        return ((Long) k.b()).longValue();
    }
}

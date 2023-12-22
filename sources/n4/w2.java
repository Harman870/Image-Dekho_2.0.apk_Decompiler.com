package n4;

import androidx.lifecycle.c0;
import c6.b;
import g7.e;
import g7.g;
import g7.h;
import g7.i;
import i4.v8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import y3.a;

public final class w2 {
    public static final v2 A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, w.f10202a);
    public static final v2 A0;
    public static final v2 B = a("measurement.upload.retry_time", 1800000L, 1800000L, x.f10305a);
    public static final v2 C = a("measurement.upload.retry_count", 6, 6, y.f10321a);
    public static final v2 D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, z.f10342a);
    public static final v2 E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, b0.f9624a);
    public static final v2 F = a("measurement.audience.filter_result_max_count", 200, 200, c0.f9650a);
    public static final v2 G = a("measurement.upload.max_public_user_properties", 25, 25, (u2) null);
    public static final v2 H = a("measurement.upload.max_event_name_cardinality", 500, 500, (u2) null);
    public static final v2 I = a("measurement.upload.max_public_event_params", 25, 25, (u2) null);
    public static final v2 J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, d0.f9665a);
    public static final v2 K;
    public static final v2 L = a("measurement.test.string_flag", "---", "---", f0.f9733a);
    public static final v2 M = a("measurement.test.long_flag", -1L, -1L, g0.f9753a);
    public static final v2 N = a("measurement.test.int_flag", -2, -2, i0.f9822a);
    public static final v2 O;
    public static final v2 P = a("measurement.experiment.max_ids", 50, 50, k0.f9884a);
    public static final v2 Q = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, l0.f9905a);
    public static final v2 R = a("measurement.max_bundles_per_iteration", 100, 100, n0.f9983a);
    public static final v2 S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, o0.f10028a);
    public static final v2 T = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, q0.f10067a);
    public static final v2 U;
    public static final v2 V;
    public static final v2 W;
    public static final v2 X;
    public static final v2 Y;
    public static final v2 Z;

    /* renamed from: a  reason: collision with root package name */
    public static final List f10205a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final v2 f10206a0;

    /* renamed from: b  reason: collision with root package name */
    public static final v2 f10207b = a("measurement.ad_id_cache_time", 10000L, 10000L, i.f6598a);

    /* renamed from: b0  reason: collision with root package name */
    public static final v2 f10208b0;

    /* renamed from: c  reason: collision with root package name */
    public static final v2 f10209c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, a.I);

    /* renamed from: c0  reason: collision with root package name */
    public static final v2 f10210c0;

    /* renamed from: d  reason: collision with root package name */
    public static final v2 f10211d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, a0.f9584a);

    /* renamed from: d0  reason: collision with root package name */
    public static final v2 f10212d0;

    /* renamed from: e  reason: collision with root package name */
    public static final v2 f10213e = a("measurement.config.cache_time", 86400000L, 3600000L, m0.f9941a);

    /* renamed from: e0  reason: collision with root package name */
    public static final v2 f10214e0;

    /* renamed from: f  reason: collision with root package name */
    public static final v2 f10215f = a("measurement.config.url_scheme", "https", "https", z0.f10343a);

    /* renamed from: f0  reason: collision with root package name */
    public static final v2 f10216f0 = a("measurement.service.storage_consent_support_version", 203600, 203600, g1.f9754a);

    /* renamed from: g  reason: collision with root package name */
    public static final v2 f10217g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", l1.f9906a);

    /* renamed from: g0  reason: collision with root package name */
    public static final v2 f10218g0;

    /* renamed from: h  reason: collision with root package name */
    public static final v2 f10219h = a("measurement.upload.max_bundles", 100, 100, y1.f10323a);

    /* renamed from: h0  reason: collision with root package name */
    public static final v2 f10220h0;

    /* renamed from: i  reason: collision with root package name */
    public static final v2 f10221i = a("measurement.upload.max_batch_size", 65536, 65536, k2.f9886a);

    /* renamed from: i0  reason: collision with root package name */
    public static final v2 f10222i0;

    /* renamed from: j  reason: collision with root package name */
    public static final v2 f10223j = a("measurement.upload.max_bundle_size", 65536, 65536, p2.f10053a);

    /* renamed from: j0  reason: collision with root package name */
    public static final v2 f10224j0;
    public static final v2 k = a("measurement.upload.max_events_per_bundle", 1000, 1000, q2.f10071a);

    /* renamed from: k0  reason: collision with root package name */
    public static final v2 f10225k0;

    /* renamed from: l  reason: collision with root package name */
    public static final v2 f10226l = a("measurement.upload.max_events_per_day", 100000, 100000, h0.f9792a);

    /* renamed from: l0  reason: collision with root package name */
    public static final v2 f10227l0;

    /* renamed from: m  reason: collision with root package name */
    public static final v2 f10228m = a("measurement.upload.max_error_events_per_day", 1000, 1000, t0.f10127a);

    /* renamed from: m0  reason: collision with root package name */
    public static final v2 f10229m0;

    /* renamed from: n  reason: collision with root package name */
    public static final v2 f10230n = a("measurement.upload.max_public_events_per_day", 50000, 50000, e1.f9713a);

    /* renamed from: n0  reason: collision with root package name */
    public static final v2 f10231n0;

    /* renamed from: o  reason: collision with root package name */
    public static final v2 f10232o = a("measurement.upload.max_conversions_per_day", 10000, 10000, p1.f10052a);

    /* renamed from: o0  reason: collision with root package name */
    public static final v2 f10233o0;

    /* renamed from: p  reason: collision with root package name */
    public static final v2 f10234p = a("measurement.upload.max_realtime_events_per_day", 10, 10, b2.f9626a);
    public static final v2 p0;

    /* renamed from: q  reason: collision with root package name */
    public static final v2 f10235q = a("measurement.store.max_stored_events_per_app", 100000, 100000, m2.f9943a);

    /* renamed from: q0  reason: collision with root package name */
    public static final v2 f10236q0;

    /* renamed from: r  reason: collision with root package name */
    public static final v2 f10237r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", s2.f10108a);

    /* renamed from: r0  reason: collision with root package name */
    public static final v2 f10238r0;

    /* renamed from: s  reason: collision with root package name */
    public static final v2 f10239s = a("measurement.upload.backoff_period", 43200000L, 43200000L, t2.f10129a);

    /* renamed from: s0  reason: collision with root package name */
    public static final v2 f10240s0;

    /* renamed from: t  reason: collision with root package name */
    public static final v2 f10241t = a("measurement.upload.interval", 3600000L, 3600000L, c.a.f2355p);

    /* renamed from: t0  reason: collision with root package name */
    public static final v2 f10242t0;
    public static final v2 u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, c0.f1724h);
    public static final v2 u0;

    /* renamed from: v  reason: collision with root package name */
    public static final v2 f10243v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, h.f6597a);

    /* renamed from: v0  reason: collision with root package name */
    public static final v2 f10244v0;
    public static final v2 w = a("measurement.upload.minimum_delay", 500L, 500L, e.f6594a);

    /* renamed from: w0  reason: collision with root package name */
    public static final v2 f10245w0;

    /* renamed from: x  reason: collision with root package name */
    public static final v2 f10246x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, v.f10172a);

    /* renamed from: x0  reason: collision with root package name */
    public static final v2 f10247x0;

    /* renamed from: y  reason: collision with root package name */
    public static final v2 f10248y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, g.f6596a);

    /* renamed from: y0  reason: collision with root package name */
    public static final v2 f10249y0;

    /* renamed from: z  reason: collision with root package name */
    public static final v2 f10250z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, v8.f7744b);

    /* renamed from: z0  reason: collision with root package name */
    public static final v2 f10251z0;

    static {
        Collections.synchronizedSet(new HashSet());
        a("measurement.upload.window_interval", 3600000L, 3600000L, b.f2483p);
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, e0.f9712a);
        Double valueOf = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf, valueOf, j0.f9855a);
        Boolean bool2 = Boolean.TRUE;
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, r0.f10089a);
        U = a("measurement.quality.checksum", bool, bool, (u2) null);
        V = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, s0.f10106a);
        W = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, u0.f10151a);
        X = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, v0.f10173a);
        Y = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, w0.f10203a);
        Z = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, x0.f10306a);
        f10206a0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, y0.f10322a);
        f10208b0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, a1.f9585a);
        f10210c0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, b1.f9625a);
        f10212d0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, c1.f9651a);
        f10214e0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, d1.f9666a);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, f1.f9734a);
        a("measurement.client.click_identifier_control.dev", bool, bool, h1.f9793a);
        a("measurement.service.click_identifier_control", bool, bool, i1.f9823a);
        f10218g0 = a("measurement.service.store_null_safelist", bool2, bool2, j1.f9856a);
        f10220h0 = a("measurement.service.store_safelist", bool2, bool2, k1.f9885a);
        f10222i0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, m1.f9942a);
        f10224j0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, n1.f9984a);
        f10225k0 = a("measurement.session_stitching_token_enabled", bool, bool, o1.f10029a);
        a("measurement.sgtm.client.dev", bool, bool, r1.f10090a);
        f10227l0 = a("measurement.sgtm.service", bool, bool, s1.f10107a);
        f10229m0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, t1.f10128a);
        a("measurement.redaction.scion_payload_generator", bool2, bool2, u1.f10152a);
        f10231n0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, v1.f10174a);
        f10233o0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, w1.f10204a);
        p0 = a("measurement.sfmc.client", bool2, bool2, x1.f10307a);
        a("measurement.sfmc.service", bool2, bool2, z1.f10344a);
        f10236q0 = a("measurement.gmscore_feature_tracking", bool2, bool2, a2.f9586a);
        f10238r0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, c2.f9652a);
        f10240s0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, d2.f9667a);
        f10242t0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, e2.f9714a);
        u0 = a("measurement.remove_app_background.client", bool, bool, f2.f9735a);
        a("measurement.rb.attribution.service", bool, bool, g2.f9755a);
        f10244v0 = a("measurement.collection.client.log_target_api_version", bool2, bool2, h2.f9794a);
        f10245w0 = a("measurement.collection.service.log_target_api_version", bool2, bool2, i2.f9824a);
        f10247x0 = a("measurement.client.deep_link_referrer_fix", bool2, bool2, j2.f9857a);
        f10249y0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, l2.f9907a);
        f10251z0 = a("measurement.link_sst_to_sid", bool2, bool2, n2.f9985a);
        A0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, o2.f10030a);
    }

    public static v2 a(String str, Object obj, Object obj2, u2 u2Var) {
        v2 v2Var = new v2(str, obj, obj2, u2Var);
        f10205a.add(v2Var);
        return v2Var;
    }
}

package n4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.w0;
import j4.k3;
import j4.ma;
import j4.na;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r3.o;

public final class i extends q7 {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f9813f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f9814g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f9815h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f9816i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f9817j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f9818l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f9819m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    public final h f9820d;

    /* renamed from: e  reason: collision with root package name */
    public final m7 f9821e = new m7(this.f9600a.f9998n);

    public i(w7 w7Var) {
        super(w7Var);
        this.f9600a.getClass();
        this.f9820d = new h(this, this.f9600a.f9986a);
    }

    public static final void t(ContentValues contentValues, Object obj) {
        o.e("value");
        o.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x032b A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f6 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f8 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0115 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0117 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0134 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0136 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0153 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0155 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017b A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x017d A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x018b A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x018f A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b7 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b9 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d6 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01d8 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ef A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0208 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x020a A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0221 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0224 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0233 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0296 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02d1 A[Catch:{ SQLiteException -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02fc A[Catch:{ SQLiteException -> 0x02bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n4.d5 A(java.lang.String r39) {
        /*
            r38 = this;
            r1 = r38
            r2 = r39
            r3.o.e(r39)
            r38.g()
            r38.h()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r38.z()     // Catch:{ SQLiteException -> 0x0342, all -> 0x0340 }
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String r34 = "session_stitching_token"
            java.lang.String r35 = "sgtm_upload_enabled"
            java.lang.String r36 = "target_os_version"
            java.lang.String r37 = "session_stitching_token_hash"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37}     // Catch:{ SQLiteException -> 0x0342, all -> 0x0340 }
            java.lang.String r7 = "app_id=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0342, all -> 0x0340 }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0342, all -> 0x0340 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0342, all -> 0x0340 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x02bf }
            if (r5 != 0) goto L_0x0071
            r4.close()
            return r3
        L_0x0071:
            n4.d5 r5 = new n4.d5     // Catch:{ SQLiteException -> 0x02bf }
            n4.w7 r6 = r1.f10066b     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r6 = r6.f10292l     // Catch:{ SQLiteException -> 0x02bf }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x02bf }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x02bf }
            r5.c(r6)     // Catch:{ SQLiteException -> 0x02bf }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x02bf }
            r5.k(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.r(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.o(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.p(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.n(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.e(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.d(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.l(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.h(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r7 != 0) goto L_0x00db
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r6 = r12
            goto L_0x00dc
        L_0x00db:
            r6 = r0
        L_0x00dc:
            r5.q(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.f9695y     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00f8
            r9 = r0
            goto L_0x00f9
        L_0x00f8:
            r9 = r12
        L_0x00f9:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.f9695y = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.f9696z     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0117
            r9 = r0
            goto L_0x0118
        L_0x0117:
            r9 = r12
        L_0x0118:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.f9696z = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.A     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0136
            r9 = r0
            goto L_0x0137
        L_0x0136:
            r9 = r12
        L_0x0137:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.A = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.B     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0155
            r9 = r0
            goto L_0x0156
        L_0x0155:
            r9 = r12
        L_0x0156:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.B = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.g(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.H     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x017d
            r9 = r0
            goto L_0x017e
        L_0x017d:
            r9 = r12
        L_0x017e:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.H = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r7 == 0) goto L_0x018f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0194
        L_0x018f:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x02bf }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x02bf }
        L_0x0194:
            r5.f(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.j(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.C     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x01b9
            r9 = r0
            goto L_0x01ba
        L_0x01b9:
            r9 = r12
        L_0x01ba:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.C = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.D     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x01d8
            r9 = r0
            goto L_0x01d9
        L_0x01d8:
            r9 = r12
        L_0x01d9:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.D = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.m(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 23
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r7 != 0) goto L_0x01f8
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 == 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r6 = r12
            goto L_0x01f9
        L_0x01f8:
            r6 = r0
        L_0x01f9:
            n4.n4 r7 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r7 = r7.d()     // Catch:{ SQLiteException -> 0x02bf }
            r7.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r7 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.f9688p     // Catch:{ SQLiteException -> 0x02bf }
            if (r8 == r6) goto L_0x020a
            r8 = r0
            goto L_0x020b
        L_0x020a:
            r8 = r12
        L_0x020b:
            r7 = r7 | r8
            r5.F = r7     // Catch:{ SQLiteException -> 0x02bf }
            r5.f9688p = r6     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 24
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.b(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 25
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r7 == 0) goto L_0x0224
            r6 = 0
            goto L_0x0228
        L_0x0224:
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
        L_0x0228:
            r5.i(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r6 = 26
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r7 != 0) goto L_0x0245
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            java.lang.String r7 = ","
            r8 = -1
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ SQLiteException -> 0x02bf }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ SQLiteException -> 0x02bf }
            r5.s(r6)     // Catch:{ SQLiteException -> 0x02bf }
        L_0x0245:
            j4.tc.b()     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r6 = r1.f9600a     // Catch:{ SQLiteException -> 0x02bf }
            n4.f r6 = r6.f9992g     // Catch:{ SQLiteException -> 0x02bf }
            n4.v2 r7 = n4.w2.f10225k0     // Catch:{ SQLiteException -> 0x02bf }
            boolean r6 = r6.o(r2, r7)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 != 0) goto L_0x0260
            n4.n4 r6 = r1.f9600a     // Catch:{ SQLiteException -> 0x02bf }
            n4.f r6 = r6.f9992g     // Catch:{ SQLiteException -> 0x02bf }
            n4.v2 r7 = n4.w2.f10222i0     // Catch:{ SQLiteException -> 0x02bf }
            boolean r6 = r6.o(r3, r7)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 == 0) goto L_0x027d
        L_0x0260:
            r6 = 28
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r7 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r7 = r7.d()     // Catch:{ SQLiteException -> 0x02bf }
            r7.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r7 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            java.lang.String r8 = r5.u     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = z5.c.w(r8, r6)     // Catch:{ SQLiteException -> 0x02bf }
            r8 = r8 ^ r0
            r7 = r7 | r8
            r5.F = r7     // Catch:{ SQLiteException -> 0x02bf }
            r5.u = r6     // Catch:{ SQLiteException -> 0x02bf }
        L_0x027d:
            j4.cd r6 = j4.cd.f8091b     // Catch:{ SQLiteException -> 0x02bf }
            j4.m5 r6 = r6.f8092a     // Catch:{ SQLiteException -> 0x02bf }
            java.lang.Object r6 = r6.zza()     // Catch:{ SQLiteException -> 0x02bf }
            j4.dd r6 = (j4.dd) r6     // Catch:{ SQLiteException -> 0x02bf }
            r6.zza()     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r6 = r1.f9600a     // Catch:{ SQLiteException -> 0x02bf }
            n4.f r6 = r6.f9992g     // Catch:{ SQLiteException -> 0x02bf }
            n4.v2 r7 = n4.w2.f10227l0     // Catch:{ SQLiteException -> 0x02bf }
            boolean r6 = r6.o(r3, r7)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 == 0) goto L_0x02c2
            r6 = 29
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r7 != 0) goto L_0x02a6
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 == 0) goto L_0x02a6
            r6 = r0
            goto L_0x02a7
        L_0x02a6:
            r6 = r12
        L_0x02a7:
            n4.n4 r7 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r7 = r7.d()     // Catch:{ SQLiteException -> 0x02bf }
            r7.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r7 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.f9693v     // Catch:{ SQLiteException -> 0x02bf }
            if (r8 == r6) goto L_0x02b8
            r8 = r0
            goto L_0x02b9
        L_0x02b8:
            r8 = r12
        L_0x02b9:
            r7 = r7 | r8
            r5.F = r7     // Catch:{ SQLiteException -> 0x02bf }
            r5.f9693v = r6     // Catch:{ SQLiteException -> 0x02bf }
            goto L_0x02c2
        L_0x02bf:
            r0 = move-exception
            goto L_0x0344
        L_0x02c2:
            j4.xb.a()     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r6 = r1.f9600a     // Catch:{ SQLiteException -> 0x02bf }
            n4.f r6 = r6.f9992g     // Catch:{ SQLiteException -> 0x02bf }
            n4.v2 r7 = n4.w2.f10245w0     // Catch:{ SQLiteException -> 0x02bf }
            boolean r6 = r6.o(r3, r7)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 == 0) goto L_0x02f0
            r6 = 30
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.w     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x02ea
            r9 = r0
            goto L_0x02eb
        L_0x02ea:
            r9 = r12
        L_0x02eb:
            r8 = r8 | r9
            r5.F = r8     // Catch:{ SQLiteException -> 0x02bf }
            r5.w = r6     // Catch:{ SQLiteException -> 0x02bf }
        L_0x02f0:
            n4.n4 r6 = r1.f9600a     // Catch:{ SQLiteException -> 0x02bf }
            n4.f r6 = r6.f9992g     // Catch:{ SQLiteException -> 0x02bf }
            n4.v2 r7 = n4.w2.f10251z0     // Catch:{ SQLiteException -> 0x02bf }
            boolean r6 = r6.o(r3, r7)     // Catch:{ SQLiteException -> 0x02bf }
            if (r6 == 0) goto L_0x031a
            r6 = 31
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x02bf }
            n4.n4 r8 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r8 = r8.d()     // Catch:{ SQLiteException -> 0x02bf }
            r8.g()     // Catch:{ SQLiteException -> 0x02bf }
            boolean r8 = r5.F     // Catch:{ SQLiteException -> 0x02bf }
            long r9 = r5.f9694x     // Catch:{ SQLiteException -> 0x02bf }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0314
            goto L_0x0315
        L_0x0314:
            r0 = r12
        L_0x0315:
            r0 = r0 | r8
            r5.F = r0     // Catch:{ SQLiteException -> 0x02bf }
            r5.f9694x = r6     // Catch:{ SQLiteException -> 0x02bf }
        L_0x031a:
            n4.n4 r0 = r5.f9674a     // Catch:{ SQLiteException -> 0x02bf }
            n4.m4 r0 = r0.d()     // Catch:{ SQLiteException -> 0x02bf }
            r0.g()     // Catch:{ SQLiteException -> 0x02bf }
            r5.F = r12     // Catch:{ SQLiteException -> 0x02bf }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x02bf }
            if (r0 == 0) goto L_0x033c
            n4.n4 r0 = r1.f9600a     // Catch:{ SQLiteException -> 0x02bf }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x02bf }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteException -> 0x02bf }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            n4.h3 r7 = n4.i3.p(r39)     // Catch:{ SQLiteException -> 0x02bf }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x02bf }
        L_0x033c:
            r4.close()
            return r5
        L_0x0340:
            r0 = move-exception
            goto L_0x035d
        L_0x0342:
            r0 = move-exception
            r4 = r3
        L_0x0344:
            n4.n4 r5 = r1.f9600a     // Catch:{ all -> 0x035b }
            n4.i3 r5 = r5.a()     // Catch:{ all -> 0x035b }
            n4.g3 r5 = r5.f9828f     // Catch:{ all -> 0x035b }
            java.lang.String r6 = "Error querying app. appId"
            n4.h3 r2 = n4.i3.p(r39)     // Catch:{ all -> 0x035b }
            r5.c(r6, r2, r0)     // Catch:{ all -> 0x035b }
            if (r4 == 0) goto L_0x035a
            r4.close()
        L_0x035a:
            return r3
        L_0x035b:
            r0 = move-exception
            r3 = r4
        L_0x035d:
            if (r3 == 0) goto L_0x0362
            r3.close()
        L_0x0362:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.A(java.lang.String):n4.d5");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n4.c B(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            r3.o.e(r31)
            r3.o.e(r32)
            r30.g()
            r30.h()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.z()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r12 = "origin"
            java.lang.String r13 = "value"
            java.lang.String r14 = "active"
            java.lang.String r15 = "trigger_event_name"
            java.lang.String r16 = "trigger_timeout"
            java.lang.String r17 = "timed_out_event"
            java.lang.String r18 = "creation_timestamp"
            java.lang.String r19 = "triggered_event"
            java.lang.String r20 = "triggered_timestamp"
            java.lang.String r21 = "time_to_live"
            java.lang.String r22 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r5 = r1.G(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = r3
            goto L_0x0068
        L_0x0066:
            r21 = r2
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            n4.w7 r0 = r1.f10066b     // Catch:{ SQLiteException -> 0x00f9 }
            n4.y7 r0 = r0.f10288g     // Catch:{ SQLiteException -> 0x00f9 }
            n4.w7.H(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<n4.r> r3 = n4.r.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.x(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            n4.r r23 = (n4.r) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            n4.w7 r0 = r1.f10066b     // Catch:{ SQLiteException -> 0x00f9 }
            n4.y7 r0 = r0.f10288g     // Catch:{ SQLiteException -> 0x00f9 }
            n4.w7.H(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.x(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            n4.r r26 = (n4.r) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r6 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            n4.w7 r0 = r1.f10066b     // Catch:{ SQLiteException -> 0x00f9 }
            n4.y7 r0 = r0.f10288g     // Catch:{ SQLiteException -> 0x00f9 }
            n4.w7.H(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.x(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            n4.r r29 = (n4.r) r29     // Catch:{ SQLiteException -> 0x00f9 }
            n4.z7 r18 = new n4.z7     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r6
            r6 = r32
            r7 = r17
            r2.<init>(r3, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            n4.c r0 = new n4.c     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            n4.n4 r2 = r1.f9600a     // Catch:{ SQLiteException -> 0x00f9 }
            n4.i3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x00f9 }
            n4.g3 r2 = r2.f9828f     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            n4.h3 r4 = n4.i3.p(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            n4.n4 r5 = r1.f9600a     // Catch:{ SQLiteException -> 0x00f9 }
            n4.d3 r5 = r5.f9997m     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0120
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            n4.n4 r2 = r1.f9600a     // Catch:{ all -> 0x011e }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x011e }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x011e }
            java.lang.String r3 = "Error querying conditional property"
            n4.h3 r4 = n4.i3.p(r31)     // Catch:{ all -> 0x011e }
            n4.n4 r5 = r1.f9600a     // Catch:{ all -> 0x011e }
            n4.d3 r5 = r5.f9997m     // Catch:{ all -> 0x011e }
            java.lang.String r5 = r5.f(r8)     // Catch:{ all -> 0x011e }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x011e }
            if (r10 == 0) goto L_0x011d
            r10.close()
        L_0x011d:
            return r9
        L_0x011e:
            r0 = move-exception
            r9 = r10
        L_0x0120:
            if (r9 == 0) goto L_0x0125
            r9.close()
        L_0x0125:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.B(java.lang.String, java.lang.String):n4.c");
    }

    public final g C(long j10, String str, boolean z9, boolean z10) {
        return D(j10, str, 1, false, false, z9, false, z10);
    }

    public final g D(long j10, String str, long j11, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        o.e(str);
        g();
        h();
        String[] strArr = {str};
        g gVar = new g();
        Cursor cursor = null;
        try {
            SQLiteDatabase z14 = z();
            cursor = z14.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f9600a.a().f9831i.b("Not updating daily counts, app is not known. appId", i3.p(str));
                cursor.close();
                return gVar;
            }
            if (cursor.getLong(0) == j10) {
                gVar.f9749b = cursor.getLong(1);
                gVar.f9748a = cursor.getLong(2);
                gVar.f9750c = cursor.getLong(3);
                gVar.f9751d = cursor.getLong(4);
                gVar.f9752e = cursor.getLong(5);
            }
            if (z9) {
                gVar.f9749b += j11;
            }
            if (z10) {
                gVar.f9748a += j11;
            }
            if (z11) {
                gVar.f9750c += j11;
            }
            if (z12) {
                gVar.f9751d += j11;
            }
            if (z13) {
                gVar.f9752e += j11;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j10));
            contentValues.put("daily_public_events_count", Long.valueOf(gVar.f9748a));
            contentValues.put("daily_events_count", Long.valueOf(gVar.f9749b));
            contentValues.put("daily_conversions_count", Long.valueOf(gVar.f9750c));
            contentValues.put("daily_error_events_count", Long.valueOf(gVar.f9751d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.f9752e));
            z14.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return gVar;
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Error updating daily counts. appId", i3.p(str), e10);
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n4.n E(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            r3.o.e(r28)
            r3.o.e(r29)
            r27.g()
            r27.h()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.z()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.String r5 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = r11
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r9 = r2
        L_0x00dc:
            n4.n r24 = new n4.n     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            if (r0 == 0) goto L_0x010b
            n4.n4 r0 = r1.f9600a     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            n4.h3 r3 = n4.i3.p(r28)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            r0.b(r2, r3)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
        L_0x010b:
            r25.close()
            return r24
        L_0x010f:
            r0 = move-exception
            goto L_0x0116
        L_0x0111:
            r0 = move-exception
            goto L_0x011c
        L_0x0113:
            r0 = move-exception
            r25 = r13
        L_0x0116:
            r19 = r25
            goto L_0x0148
        L_0x0119:
            r0 = move-exception
            r25 = r13
        L_0x011c:
            r13 = r25
            goto L_0x0124
        L_0x011f:
            r0 = move-exception
            goto L_0x0148
        L_0x0121:
            r0 = move-exception
            r13 = r19
        L_0x0124:
            n4.n4 r2 = r1.f9600a     // Catch:{ all -> 0x0145 }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x0145 }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = "Error querying events. appId"
            n4.h3 r4 = n4.i3.p(r28)     // Catch:{ all -> 0x0145 }
            n4.n4 r5 = r1.f9600a     // Catch:{ all -> 0x0145 }
            n4.d3 r5 = r5.f9997m     // Catch:{ all -> 0x0145 }
            r6 = r29
            java.lang.String r5 = r5.d(r6)     // Catch:{ all -> 0x0145 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x0145 }
            if (r13 == 0) goto L_0x0144
            r13.close()
        L_0x0144:
            return r19
        L_0x0145:
            r0 = move-exception
            r19 = r13
        L_0x0148:
            if (r19 == 0) goto L_0x014d
            r19.close()
        L_0x014d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.E(java.lang.String, java.lang.String):n4.n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n4.b8 F(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            r3.o.e(r20)
            r3.o.e(r21)
            r19.g()
            r19.h()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.z()     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            java.lang.String r12 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            java.lang.String r14 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007b, all -> 0x0079 }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0077 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.Object r8 = r1.G(r11, r3)     // Catch:{ SQLiteException -> 0x0077 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0077 }
            n4.b8 r0 = new n4.b8     // Catch:{ SQLiteException -> 0x0077 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0077 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0077 }
            if (r2 == 0) goto L_0x0073
            n4.n4 r2 = r1.f9600a     // Catch:{ SQLiteException -> 0x0077 }
            n4.i3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x0077 }
            n4.g3 r2 = r2.f9828f     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            n4.h3 r4 = n4.i3.p(r20)     // Catch:{ SQLiteException -> 0x0077 }
            r2.b(r3, r4)     // Catch:{ SQLiteException -> 0x0077 }
        L_0x0073:
            r11.close()
            return r0
        L_0x0077:
            r0 = move-exception
            goto L_0x007d
        L_0x0079:
            r0 = move-exception
            goto L_0x009e
        L_0x007b:
            r0 = move-exception
            r11 = r10
        L_0x007d:
            n4.n4 r2 = r1.f9600a     // Catch:{ all -> 0x009c }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x009c }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "Error querying user property. appId"
            n4.h3 r4 = n4.i3.p(r20)     // Catch:{ all -> 0x009c }
            n4.n4 r5 = r1.f9600a     // Catch:{ all -> 0x009c }
            n4.d3 r5 = r5.f9997m     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r5.f(r9)     // Catch:{ all -> 0x009c }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x009c }
            if (r11 == 0) goto L_0x009b
            r11.close()
        L_0x009b:
            return r10
        L_0x009c:
            r0 = move-exception
            r10 = r11
        L_0x009e:
            if (r10 == 0) goto L_0x00a3
            r10.close()
        L_0x00a3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.F(java.lang.String, java.lang.String):n4.b8");
    }

    public final Object G(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f9600a.a().f9828f.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                this.f9600a.a().f9828f.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f9600a.a().f9828f.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String H() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.z()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003c
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            n4.n4 r3 = r6.f9600a     // Catch:{ all -> 0x0038 }
            n4.i3 r3 = r3.a()     // Catch:{ all -> 0x0038 }
            n4.g3 r3 = r3.f9828f     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return r1
        L_0x0038:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.H():java.lang.String");
    }

    public final List I(String str, String str2, String str3) {
        o.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return J(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List J(String str, String[] strArr) {
        boolean z9;
        g();
        h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f9600a.getClass();
            Cursor query = z().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f9600a.getClass();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object G = G(query, 3);
                        if (query.getInt(4) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        String string4 = query.getString(5);
                        long j10 = query.getLong(6);
                        y7 y7Var = this.f10066b.f10288g;
                        w7.H(y7Var);
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<r> creator = r.CREATOR;
                        long j11 = query.getLong(8);
                        y7 y7Var2 = this.f10066b.f10288g;
                        w7.H(y7Var2);
                        long j12 = query.getLong(10);
                        long j13 = query.getLong(11);
                        y7 y7Var3 = this.f10066b.f10288g;
                        w7.H(y7Var3);
                        arrayList.add(new c(string, string2, new z7(j12, G, string3, string2), j11, z9, string4, (r) y7Var.x(blob, creator), j10, (r) y7Var2.x(query.getBlob(9), creator), j13, (r) y7Var3.x(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        g3 g3Var = this.f9600a.a().f9828f;
                        this.f9600a.getClass();
                        g3Var.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.b("Error querying conditional user property value", e10);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List K(String str) {
        o.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f9600a.getClass();
            Cursor query = z().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = query.getLong(2);
                    Object G = G(query, 3);
                    if (G == null) {
                        this.f9600a.a().f9828f.b("Read invalid user property value, ignoring it. appId", i3.p(str));
                    } else {
                        arrayList.add(new b8(str, str2, string, j10, G));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Error querying user properties. appId", i3.p(str), e10);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x011b A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List L(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r3.o.e(r18)
            r17.g()
            r17.h()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0100 }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x0100 }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x00fa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fa }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00fa }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00fa }
            r15 = r19
            if (r5 != 0) goto L_0x0037
            r3.add(r15)     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00f8 }
        L_0x0037:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x00f8 }
            if (r5 != 0) goto L_0x0056
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f8 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00f8 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x00f8 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00f8 }
        L_0x0056:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x00f8 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x00f8 }
            android.database.sqlite.SQLiteDatabase r3 = r17.z()     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r10 = "rowid"
            n4.n4 r4 = r1.f9600a     // Catch:{ SQLiteException -> 0x00f8 }
            r4.getClass()     // Catch:{ SQLiteException -> 0x00f8 }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00f8 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00f8 }
            if (r3 != 0) goto L_0x0097
            r12.close()
            return r2
        L_0x0097:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x00f8 }
            n4.n4 r4 = r1.f9600a     // Catch:{ SQLiteException -> 0x00f8 }
            r4.getClass()     // Catch:{ SQLiteException -> 0x00f8 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00bb
            n4.n4 r0 = r1.f9600a     // Catch:{ SQLiteException -> 0x00f8 }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x00f8 }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            n4.n4 r5 = r1.f9600a     // Catch:{ SQLiteException -> 0x00f8 }
            r5.getClass()     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x00f8 }
            r0.b(r3, r4)     // Catch:{ SQLiteException -> 0x00f8 }
            goto L_0x00f4
        L_0x00bb:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x00f8 }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x00f8 }
            r3 = 2
            java.lang.Object r10 = r1.G(r12, r3)     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x00f8 }
            if (r10 != 0) goto L_0x00e2
            n4.n4 r3 = r1.f9600a     // Catch:{ SQLiteException -> 0x00f8 }
            n4.i3 r3 = r3.a()     // Catch:{ SQLiteException -> 0x00f8 }
            n4.g3 r3 = r3.f9828f     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            n4.h3 r5 = n4.i3.p(r18)     // Catch:{ SQLiteException -> 0x00f8 }
            r3.d(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x00f8 }
            goto L_0x00ee
        L_0x00e2:
            n4.b8 r3 = new n4.b8     // Catch:{ SQLiteException -> 0x00f8 }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00f8 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x00f8 }
        L_0x00ee:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00f8 }
            if (r3 != 0) goto L_0x0097
        L_0x00f4:
            r12.close()
            return r2
        L_0x00f8:
            r0 = move-exception
            goto L_0x0104
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            r15 = r19
            goto L_0x0104
        L_0x00fe:
            r0 = move-exception
            goto L_0x011f
        L_0x0100:
            r0 = move-exception
            r14 = r18
            goto L_0x00fb
        L_0x0104:
            n4.n4 r2 = r1.f9600a     // Catch:{ all -> 0x00fe }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x00fe }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "(2)Error querying user properties"
            n4.h3 r4 = n4.i3.p(r18)     // Catch:{ all -> 0x00fe }
            r2.d(r3, r4, r15, r0)     // Catch:{ all -> 0x00fe }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00fe }
            if (r12 == 0) goto L_0x011e
            r12.close()
        L_0x011e:
            return r0
        L_0x011f:
            if (r12 == 0) goto L_0x0124
            r12.close()
        L_0x0124:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.L(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void M() {
        h();
        z().beginTransaction();
    }

    public final void N() {
        h();
        z().endTransaction();
    }

    public final void O(List list) {
        g();
        h();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (o()) {
            String d10 = w0.d("(", TextUtils.join(",", list), ")");
            if (u("SELECT COUNT(1) FROM queue WHERE rowid IN " + d10 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.f9600a.a().f9831i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase z9 = z();
                z9.execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + d10 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                this.f9600a.a().f9828f.b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void P() {
        g();
        h();
        if (o()) {
            long a10 = this.f10066b.f10290i.f9701e.a();
            this.f9600a.f9998n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a10);
            this.f9600a.getClass();
            if (abs > ((Long) w2.f10248y.a((Object) null)).longValue()) {
                this.f10066b.f10290i.f9701e.b(elapsedRealtime);
                g();
                h();
                if (o()) {
                    SQLiteDatabase z9 = z();
                    this.f9600a.f9998n.getClass();
                    this.f9600a.getClass();
                    int delete = z9.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) w2.D.a((Object) null)).longValue())});
                    if (delete > 0) {
                        this.f9600a.a().f9835n.b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final void j() {
    }

    public final void k(String str, String str2) {
        o.e(str);
        o.e(str2);
        g();
        h();
        try {
            z().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.d("Error deleting user property. appId", i3.p(str), this.f9600a.f9997m.f(str2), e10);
        }
    }

    public final void l() {
        h();
        z().setTransactionSuccessful();
    }

    public final void m(d5 d5Var) {
        g();
        h();
        String w = d5Var.w();
        o.h(w);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", w);
        contentValues.put("app_instance_id", d5Var.x());
        contentValues.put("gmp_app_id", d5Var.a());
        d5Var.f9674a.d().g();
        contentValues.put("resettable_device_id_hash", d5Var.f9678e);
        d5Var.f9674a.d().g();
        contentValues.put("last_bundle_index", Long.valueOf(d5Var.f9680g));
        d5Var.f9674a.d().g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(d5Var.f9681h));
        d5Var.f9674a.d().g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(d5Var.f9682i));
        contentValues.put("app_version", d5Var.y());
        d5Var.f9674a.d().g();
        contentValues.put("app_store", d5Var.f9684l);
        d5Var.f9674a.d().g();
        contentValues.put("gmp_version", Long.valueOf(d5Var.f9685m));
        d5Var.f9674a.d().g();
        contentValues.put("dev_cert_hash", Long.valueOf(d5Var.f9686n));
        d5Var.f9674a.d().g();
        contentValues.put("measurement_enabled", Boolean.valueOf(d5Var.f9687o));
        d5Var.f9674a.d().g();
        contentValues.put("day", Long.valueOf(d5Var.f9695y));
        d5Var.f9674a.d().g();
        contentValues.put("daily_public_events_count", Long.valueOf(d5Var.f9696z));
        d5Var.f9674a.d().g();
        contentValues.put("daily_events_count", Long.valueOf(d5Var.A));
        d5Var.f9674a.d().g();
        contentValues.put("daily_conversions_count", Long.valueOf(d5Var.B));
        d5Var.f9674a.d().g();
        contentValues.put("config_fetched_time", Long.valueOf(d5Var.G));
        d5Var.f9674a.d().g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(d5Var.H));
        contentValues.put("app_version_int", Long.valueOf(d5Var.t()));
        contentValues.put("firebase_instance_id", d5Var.z());
        d5Var.f9674a.d().g();
        contentValues.put("daily_error_events_count", Long.valueOf(d5Var.C));
        d5Var.f9674a.d().g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(d5Var.D));
        d5Var.f9674a.d().g();
        contentValues.put("health_monitor_sample", d5Var.E);
        d5Var.f9674a.d().g();
        contentValues.put("android_id", 0L);
        d5Var.f9674a.d().g();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(d5Var.f9688p));
        contentValues.put("admob_app_id", d5Var.u());
        d5Var.f9674a.d().g();
        contentValues.put("dynamite_version", Long.valueOf(d5Var.f9691s));
        d5Var.f9674a.d().g();
        contentValues.put("session_stitching_token", d5Var.u);
        d5Var.f9674a.d().g();
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(d5Var.f9693v));
        d5Var.f9674a.d().g();
        contentValues.put("target_os_version", Long.valueOf(d5Var.w));
        d5Var.f9674a.d().g();
        contentValues.put("session_stitching_token_hash", Long.valueOf(d5Var.f9694x));
        d5Var.f9674a.d().g();
        ArrayList arrayList = d5Var.f9692t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                this.f9600a.a().f9831i.b("Safelisted events should not be an empty list. appId", w);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((na) ma.f8327b.f8328a.zza()).zza();
        if (this.f9600a.f9992g.o((String) null, w2.f10218g0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase z9 = z();
            if (((long) z9.update("apps", contentValues, "app_id = ?", new String[]{w})) == 0 && z9.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f9600a.a().f9828f.b("Failed to insert/update app (got -1). appId", i3.p(w));
            }
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Error storing app. appId", i3.p(w), e10);
        }
    }

    public final void n(n nVar) {
        long j10;
        o.h(nVar);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", nVar.f9973a);
        contentValues.put("name", nVar.f9974b);
        contentValues.put("lifetime_count", Long.valueOf(nVar.f9975c));
        contentValues.put("current_bundle_count", Long.valueOf(nVar.f9976d));
        contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f9978f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.f9979g));
        contentValues.put("last_bundled_day", nVar.f9980h);
        contentValues.put("last_sampled_complex_event_id", nVar.f9981i);
        contentValues.put("last_sampling_rate", nVar.f9982j);
        contentValues.put("current_session_count", Long.valueOf(nVar.f9977e));
        Boolean bool = nVar.k;
        if (bool == null || !bool.booleanValue()) {
            j10 = null;
        } else {
            j10 = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j10);
        try {
            if (z().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f9600a.a().f9828f.b("Failed to insert/update event aggregates (got -1). appId", i3.p(nVar.f9973a));
            }
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Error storing event aggregates. appId", i3.p(nVar.f9973a), e10);
        }
    }

    public final boolean o() {
        n4 n4Var = this.f9600a;
        Context context = n4Var.f9986a;
        n4Var.getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void p(String str, Long l6, long j10, k3 k3Var) {
        g();
        h();
        o.h(k3Var);
        o.e(str);
        byte[] g10 = k3Var.g();
        this.f9600a.a().f9835n.c("Saving complex main event, appId, data size", this.f9600a.f9997m.d(str), Integer.valueOf(g10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l6);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", g10);
        try {
            if (z().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                this.f9600a.a().f9828f.b("Failed to insert complex main event (got -1). appId", i3.p(str));
            }
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Error storing complex main event. appId", i3.p(str), e10);
        }
    }

    public final boolean q(c cVar) {
        g();
        h();
        String str = cVar.f9640a;
        o.h(str);
        if (F(str, cVar.f9642c.f10354b) == null) {
            long u = u("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f9600a.getClass();
            if (u >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", cVar.f9641b);
        contentValues.put("name", cVar.f9642c.f10354b);
        Object x9 = cVar.f9642c.x();
        o.h(x9);
        t(contentValues, x9);
        contentValues.put("active", Boolean.valueOf(cVar.f9644e));
        contentValues.put("trigger_event_name", cVar.f9645f);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.f9647h));
        d8 x10 = this.f9600a.x();
        r rVar = cVar.f9646g;
        x10.getClass();
        contentValues.put("timed_out_event", d8.X(rVar));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f9643d));
        d8 x11 = this.f9600a.x();
        r rVar2 = cVar.f9648i;
        x11.getClass();
        contentValues.put("triggered_event", d8.X(rVar2));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f9642c.f10355c));
        contentValues.put("time_to_live", Long.valueOf(cVar.f9649j));
        d8 x12 = this.f9600a.x();
        r rVar3 = cVar.k;
        x12.getClass();
        contentValues.put("expired_event", d8.X(rVar3));
        try {
            if (z().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f9600a.a().f9828f.b("Failed to insert/update conditional user property (got -1)", i3.p(str));
            }
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Error storing conditional user property", i3.p(str), e10);
        }
        return true;
    }

    public final boolean r(b8 b8Var) {
        g();
        h();
        if (F(b8Var.f9635a, b8Var.f9637c) == null) {
            if (d8.U(b8Var.f9637c)) {
                if (u("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{b8Var.f9635a}) >= ((long) this.f9600a.f9992g.j(b8Var.f9635a, w2.G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(b8Var.f9637c)) {
                long u = u("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{b8Var.f9635a, b8Var.f9636b});
                this.f9600a.getClass();
                if (u >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b8Var.f9635a);
        contentValues.put("origin", b8Var.f9636b);
        contentValues.put("name", b8Var.f9637c);
        contentValues.put("set_timestamp", Long.valueOf(b8Var.f9638d));
        t(contentValues, b8Var.f9639e);
        try {
            if (z().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f9600a.a().f9828f.b("Failed to insert/update user property (got -1). appId", i3.p(b8Var.f9635a));
            }
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Error storing user property. appId", i3.p(b8Var.f9635a), e10);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019b, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ed, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ee, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0202, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020a, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019b A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v15 java.lang.String), (r3v17 java.lang.String), (r3v19 java.lang.String), (r3v21 java.lang.String), (r3v23 java.lang.String), (r3v25 java.lang.String), (r3v27 java.lang.String), (r3v29 java.lang.String), (r3v31 java.lang.String) binds: [B:1:0x000b, B:22:0x006c, B:7:0x0020, B:37:0x00b3, B:43:0x00e9, B:80:0x01d2, B:81:?, B:47:0x00fd, B:74:0x01ba, B:75:?, B:68:0x019f, B:60:0x016e] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(long r21, long r23, n4.u7 r25) {
        /*
            r20 = this;
            r1 = r20
            r2 = r25
            r20.g()
            r20.h()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.z()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 0
            r12 = 1
            r11 = 2
            if (r4 == 0) goto L_0x0068
            int r4 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x002f
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r7 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            goto L_0x0037
        L_0x002f:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
        L_0x0037:
            if (r4 == 0) goto L_0x003b
            java.lang.String r5 = "rowid <= ? and "
        L_0x003b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r4.<init>()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01eb }
            if (r5 != 0) goto L_0x005f
            r4.close()
            return
        L_0x005f:
            java.lang.String r3 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01eb }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01eb }
            goto L_0x00a7
        L_0x0068:
            int r4 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0077
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r7 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            goto L_0x007b
        L_0x0077:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
        L_0x007b:
            if (r4 == 0) goto L_0x007f
            java.lang.String r5 = " and rowid <= ?"
        L_0x007f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r4.<init>()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019b }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01eb }
            if (r5 != 0) goto L_0x00a3
            r4.close()
            return
        L_0x00a3:
            java.lang.String r5 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01eb }
        L_0x00a7:
            r4.close()     // Catch:{ SQLiteException -> 0x01eb }
            r16 = r3
            r3 = r4
            r17 = r5
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r8[r15] = r16     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r11 = r18
            r12 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            if (r4 != 0) goto L_0x00e9
            n4.n4 r0 = r1.f9600a     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            n4.h3 r4 = n4.i3.p(r16)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r3.close()
            return
        L_0x00e9:
            byte[] r4 = r3.getBlob(r15)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.s3 r5 = j4.t3.G1()     // Catch:{ IOException -> 0x01d1 }
            j4.i7 r4 = n4.y7.z(r5, r4)     // Catch:{ IOException -> 0x01d1 }
            j4.s3 r4 = (j4.s3) r4     // Catch:{ IOException -> 0x01d1 }
            j4.m7 r4 = r4.h()     // Catch:{ IOException -> 0x01d1 }
            j4.t3 r4 = (j4.t3) r4     // Catch:{ IOException -> 0x01d1 }
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            if (r5 == 0) goto L_0x0114
            n4.n4 r5 = r1.f9600a     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.i3 r5 = r5.a()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.g3 r5 = r5.f9831i     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            n4.h3 r7 = n4.i3.p(r16)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
        L_0x0114:
            r3.close()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r2.f10167a = r4     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            int r4 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x012f
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            java.lang.String r6 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r12 = 2
            r5[r12] = r6     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            goto L_0x0139
        L_0x012f:
            r12 = 2
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
        L_0x0139:
            r7 = r4
            r8 = r5
            java.lang.String r5 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r6, r9, r10}     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r17 = 0
            r4 = r0
            r12 = r17
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            if (r0 == 0) goto L_0x01ba
        L_0x015c:
            long r4 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            byte[] r0 = r3.getBlob(r13)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.j3 r6 = j4.k3.x()     // Catch:{ IOException -> 0x019d }
            j4.i7 r0 = n4.y7.z(r6, r0)     // Catch:{ IOException -> 0x019d }
            j4.j3 r0 = (j4.j3) r0     // Catch:{ IOException -> 0x019d }
            java.lang.String r6 = r3.getString(r14)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r0.j()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.m7 r7 = r0.f8238b     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.k3 r7 = (j4.k3) r7     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.k3.H(r7, r6)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r0.j()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.m7 r9 = r0.f8238b     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.k3 r9 = (j4.k3) r9     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.k3.I(r7, r9)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.m7 r0 = r0.h()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            j4.k3 r0 = (j4.k3) r0     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            boolean r0 = r2.a(r4, r0)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            if (r0 != 0) goto L_0x01b0
            r3.close()
            return
        L_0x019b:
            r0 = move-exception
            goto L_0x0208
        L_0x019d:
            r0 = move-exception
            r6 = 2
            n4.n4 r4 = r1.f9600a     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.i3 r4 = r4.a()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.g3 r4 = r4.f9828f     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            n4.h3 r7 = n4.i3.p(r16)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r4.c(r5, r7, r0)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
        L_0x01b0:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            if (r0 != 0) goto L_0x015c
            r3.close()
            return
        L_0x01ba:
            n4.n4 r0 = r1.f9600a     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.g3 r0 = r0.f9831i     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            n4.h3 r4 = n4.i3.p(r16)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r3.close()
            return
        L_0x01cf:
            r0 = move-exception
            goto L_0x01e7
        L_0x01d1:
            r0 = move-exception
            n4.n4 r2 = r1.f9600a     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.i3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            n4.g3 r2 = r2.f9828f     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            n4.h3 r5 = n4.i3.p(r16)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r2.c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01cf, all -> 0x019b }
            r3.close()
            return
        L_0x01e7:
            r4 = r3
            r3 = r16
            goto L_0x01ef
        L_0x01eb:
            r0 = move-exception
            goto L_0x01ef
        L_0x01ed:
            r0 = move-exception
            r4 = r3
        L_0x01ef:
            n4.n4 r2 = r1.f9600a     // Catch:{ all -> 0x0206 }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x0206 }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x0206 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            n4.h3 r3 = n4.i3.p(r3)     // Catch:{ all -> 0x0206 }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0206 }
            if (r4 == 0) goto L_0x0205
            r4.close()
        L_0x0205:
            return
        L_0x0206:
            r0 = move-exception
            r3 = r4
        L_0x0208:
            if (r3 == 0) goto L_0x020d
            r3.close()
        L_0x020d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.i.s(long, long, n4.u7):void");
    }

    public final long u(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = z().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void v(String str, String str2) {
        o.e(str);
        o.e(str2);
        g();
        h();
        try {
            z().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.d("Error deleting conditional property", i3.p(str), this.f9600a.f9997m.f(str2), e10);
        }
    }

    public final long w(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = z().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long x(String str) {
        long j10;
        SQLiteException e10;
        o.e(str);
        o.e("first_open_count");
        g();
        h();
        SQLiteDatabase z9 = z();
        z9.beginTransaction();
        try {
            j10 = w("select first_open_count from app2 where app_id=?", new String[]{str}, -1);
            if (j10 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (z9.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f9600a.a().f9828f.c("Failed to insert column (got -1). appId", i3.p(str), "first_open_count");
                    z9.endTransaction();
                    return -1;
                }
                j10 = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j10));
                if (((long) z9.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.f9600a.a().f9828f.c("Failed to update column (got 0). appId", i3.p(str), "first_open_count");
                    z9.endTransaction();
                    return -1;
                }
                z9.setTransactionSuccessful();
                z9.endTransaction();
                return j10;
            } catch (SQLiteException e11) {
                e10 = e11;
            }
        } catch (SQLiteException e12) {
            j10 = 0;
            e10 = e12;
            try {
                this.f9600a.a().f9828f.d("Error inserting column. appId", i3.p(str), "first_open_count", e10);
                z9.endTransaction();
                return j10;
            } catch (Throwable th) {
                z9.endTransaction();
                throw th;
            }
        }
    }

    public final long y(String str) {
        o.e(str);
        return w("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final SQLiteDatabase z() {
        g();
        try {
            return this.f9820d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f9600a.a().f9831i.b("Error opening database", e10);
            throw e10;
        }
    }
}

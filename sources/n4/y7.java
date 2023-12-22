package n4;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.f;
import j4.a4;
import j4.b;
import j4.c4;
import j4.c8;
import j4.g3;
import j4.g7;
import j4.i2;
import j4.i3;
import j4.i7;
import j4.j3;
import j4.k3;
import j4.l2;
import j4.n2;
import j4.n3;
import j4.o3;
import j4.q2;
import j4.q7;
import j4.r3;
import j4.r7;
import j4.s3;
import j4.t3;
import j4.tc;
import j4.xb;
import j4.y3;
import j4.y6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import r3.o;
import y3.a;

public final class y7 extends q7 {
    public y7(w7 w7Var) {
        super(w7Var);
    }

    public static ArrayList D(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static HashMap E(Bundle bundle, boolean z9) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z9) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(E((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(E((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(E((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public static boolean G(q7 q7Var, int i10) {
        if (i10 >= ((c8) q7Var).f8087c * 64) {
            return false;
        }
        if (((1 << (i10 % 64)) & ((Long) ((c8) q7Var).get(i10 / 64)).longValue()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean I(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void k(j3 j3Var, String str, Long l6) {
        List p5 = j3Var.p();
        int i10 = 0;
        while (true) {
            if (i10 >= p5.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((o3) p5.get(i10)).z())) {
                break;
            } else {
                i10++;
            }
        }
        n3 x9 = o3.x();
        x9.l(str);
        if (l6 instanceof Long) {
            x9.k(l6.longValue());
        }
        if (i10 >= 0) {
            j3Var.j();
            k3.C((k3) j3Var.f8238b, i10, (o3) x9.h());
            return;
        }
        j3Var.m(x9);
    }

    public static final o3 l(k3 k3Var, String str) {
        for (o3 o3Var : k3Var.B()) {
            if (o3Var.z().equals(str)) {
                return o3Var;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable m(k3 k3Var, String str) {
        o3 l6 = l(k3Var, str);
        if (l6 == null) {
            return null;
        }
        if (l6.Q()) {
            return l6.A();
        }
        if (l6.O()) {
            return Long.valueOf(l6.w());
        }
        if (l6.M()) {
            return Double.valueOf(l6.t());
        }
        if (l6.v() <= 0) {
            return null;
        }
        List<o3> B = l6.B();
        ArrayList arrayList = new ArrayList();
        for (o3 o3Var : B) {
            if (o3Var != null) {
                Bundle bundle = new Bundle();
                for (o3 o3Var2 : o3Var.B()) {
                    if (o3Var2.Q()) {
                        bundle.putString(o3Var2.z(), o3Var2.A());
                    } else if (o3Var2.O()) {
                        bundle.putLong(o3Var2.z(), o3Var2.w());
                    } else if (o3Var2.M()) {
                        bundle.putDouble(o3Var2.z(), o3Var2.t());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void p(int i10, StringBuilder sb) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    public static final String q(boolean z9, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void r(StringBuilder sb, String str, y3 y3Var) {
        if (y3Var != null) {
            p(3, sb);
            sb.append(str);
            sb.append(" {\n");
            if (y3Var.u() != 0) {
                p(4, sb);
                sb.append("results: ");
                int i10 = 0;
                for (Long l6 : y3Var.B()) {
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l6);
                    i10 = i11;
                }
                sb.append(10);
            }
            if (y3Var.w() != 0) {
                p(4, sb);
                sb.append("status: ");
                int i12 = 0;
                for (Long l10 : y3Var.D()) {
                    int i13 = i12 + 1;
                    if (i12 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l10);
                    i12 = i13;
                }
                sb.append(10);
            }
            if (y3Var.t() != 0) {
                p(4, sb);
                sb.append("dynamic_filter_timestamps: {");
                int i14 = 0;
                for (i3 i3Var : y3Var.A()) {
                    int i15 = i14 + 1;
                    if (i14 != 0) {
                        sb.append(", ");
                    }
                    sb.append(i3Var.A() ? Integer.valueOf(i3Var.t()) : null);
                    sb.append(":");
                    sb.append(i3Var.z() ? Long.valueOf(i3Var.u()) : null);
                    i14 = i15;
                }
                sb.append("}\n");
            }
            if (y3Var.v() != 0) {
                p(4, sb);
                sb.append("sequence_filter_timestamps: {");
                int i16 = 0;
                for (a4 a4Var : y3Var.C()) {
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(a4Var.B() ? Integer.valueOf(a4Var.u()) : null);
                    sb.append(": [");
                    int i18 = 0;
                    for (Long longValue : a4Var.y()) {
                        long longValue2 = longValue.longValue();
                        int i19 = i18 + 1;
                        if (i18 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i18 = i19;
                    }
                    sb.append("]");
                    i16 = i17;
                }
                sb.append("}\n");
            }
            p(3, sb);
            sb.append("}\n");
        }
    }

    public static final void s(StringBuilder sb, int i10, String str, Object obj) {
        if (obj != null) {
            p(i10 + 1, sb);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final void t(StringBuilder sb, int i10, String str, l2 l2Var) {
        if (l2Var != null) {
            p(i10, sb);
            sb.append(str);
            sb.append(" {\n");
            if (l2Var.z()) {
                int E = l2Var.E();
                s(sb, i10, "comparison_type", E != 1 ? E != 2 ? E != 3 ? E != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (l2Var.B()) {
                s(sb, i10, "match_as_float", Boolean.valueOf(l2Var.y()));
            }
            if (l2Var.A()) {
                s(sb, i10, "comparison_value", l2Var.v());
            }
            if (l2Var.D()) {
                s(sb, i10, "min_comparison_value", l2Var.x());
            }
            if (l2Var.C()) {
                s(sb, i10, "max_comparison_value", l2Var.w());
            }
            p(i10, sb);
            sb.append("}\n");
        }
    }

    public static int u(s3 s3Var, String str) {
        for (int i10 = 0; i10 < ((t3) s3Var.f8238b).t1(); i10++) {
            if (str.equals(((t3) s3Var.f8238b).I1(i10).y())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle w(Map map, boolean z9) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z9) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(w((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public static r y(b bVar) {
        String str;
        Object obj;
        Bundle w = w(bVar.f8051c, true);
        if (!w.containsKey("_o") || (obj = w.get("_o")) == null) {
            str = "app";
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String R = a.R(bVar.f8049a, c.a.f2356q, c.a.f2360s);
        if (R == null) {
            R = bVar.f8049a;
        }
        return new r(R, new p(w), str2, bVar.f8050b);
    }

    public static i7 z(i7 i7Var, byte[] bArr) {
        Class<y6> cls = y6.class;
        y6 y6Var = y6.f8567b;
        if (y6Var == null) {
            synchronized (cls) {
                y6Var = y6.f8567b;
                if (y6Var == null) {
                    y6Var = g7.b();
                    y6.f8567b = y6Var;
                }
            }
        }
        i7Var.getClass();
        if (y6Var != null) {
            i7Var.g(bArr, bArr.length, y6Var);
            return i7Var;
        }
        i7Var.g(bArr, bArr.length, y6.f8568c);
        return i7Var;
    }

    public final String A(r3 r3Var) {
        Long l6;
        Long l10;
        Double d10;
        StringBuilder g10 = f.g("\nbatch {\n");
        for (t3 t3Var : r3Var.w()) {
            if (t3Var != null) {
                p(1, g10);
                g10.append("bundle {\n");
                if (t3Var.g1()) {
                    s(g10, 1, "protocol_version", Integer.valueOf(t3Var.q1()));
                }
                tc.b();
                if (this.f9600a.f9992g.o(t3Var.K1(), w2.f10225k0) && t3Var.j1()) {
                    s(g10, 1, "session_stitching_token", t3Var.E());
                }
                s(g10, 1, "platform", t3Var.C());
                if (t3Var.c1()) {
                    s(g10, 1, "gmp_version", Long.valueOf(t3Var.y1()));
                }
                if (t3Var.o1()) {
                    s(g10, 1, "uploading_gmp_version", Long.valueOf(t3Var.E1()));
                }
                if (t3Var.a1()) {
                    s(g10, 1, "dynamite_version", Long.valueOf(t3Var.w1()));
                }
                if (t3Var.X0()) {
                    s(g10, 1, "config_version", Long.valueOf(t3Var.u1()));
                }
                s(g10, 1, "gmp_app_id", t3Var.z());
                s(g10, 1, "admob_app_id", t3Var.J1());
                s(g10, 1, "app_id", t3Var.K1());
                s(g10, 1, "app_version", t3Var.u());
                if (t3Var.V0()) {
                    s(g10, 1, "app_version_major", Integer.valueOf(t3Var.S()));
                }
                s(g10, 1, "firebase_instance_id", t3Var.y());
                if (t3Var.Z0()) {
                    s(g10, 1, "dev_cert_hash", Long.valueOf(t3Var.v1()));
                }
                s(g10, 1, "app_store", t3Var.t());
                if (t3Var.n1()) {
                    s(g10, 1, "upload_timestamp_millis", Long.valueOf(t3Var.D1()));
                }
                if (t3Var.k1()) {
                    s(g10, 1, "start_timestamp_millis", Long.valueOf(t3Var.B1()));
                }
                if (t3Var.b1()) {
                    s(g10, 1, "end_timestamp_millis", Long.valueOf(t3Var.x1()));
                }
                if (t3Var.f1()) {
                    s(g10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(t3Var.A1()));
                }
                if (t3Var.e1()) {
                    s(g10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(t3Var.z1()));
                }
                s(g10, 1, "app_instance_id", t3Var.L1());
                s(g10, 1, "resettable_device_id", t3Var.D());
                s(g10, 1, "ds_id", t3Var.x());
                if (t3Var.d1()) {
                    s(g10, 1, "limited_ad_tracking", Boolean.valueOf(t3Var.r0()));
                }
                s(g10, 1, "os_version", t3Var.B());
                s(g10, 1, "device_model", t3Var.w());
                s(g10, 1, "user_default_language", t3Var.F());
                if (t3Var.m1()) {
                    s(g10, 1, "time_zone_offset_minutes", Integer.valueOf(t3Var.s1()));
                }
                if (t3Var.W0()) {
                    s(g10, 1, "bundle_sequential_index", Integer.valueOf(t3Var.S0()));
                }
                if (t3Var.i1()) {
                    s(g10, 1, "service_upload", Boolean.valueOf(t3Var.s0()));
                }
                s(g10, 1, "health_monitor", t3Var.A());
                if (t3Var.h1()) {
                    s(g10, 1, "retry_counter", Integer.valueOf(t3Var.r1()));
                }
                if (t3Var.Y0()) {
                    s(g10, 1, "consent_signals", t3Var.v());
                }
                xb.a();
                if (this.f9600a.f9992g.o((String) null, w2.f10245w0) && t3Var.l1()) {
                    s(g10, 1, "target_os_version", Long.valueOf(t3Var.C1()));
                }
                r7<c4> I = t3Var.I();
                if (I != null) {
                    for (c4 c4Var : I) {
                        if (c4Var != null) {
                            p(2, g10);
                            g10.append("user_property {\n");
                            if (c4Var.K()) {
                                l6 = Long.valueOf(c4Var.v());
                            } else {
                                l6 = null;
                            }
                            s(g10, 2, "set_timestamp_millis", l6);
                            s(g10, 2, "name", this.f9600a.f9997m.f(c4Var.y()));
                            s(g10, 2, "string_value", c4Var.z());
                            if (c4Var.J()) {
                                l10 = Long.valueOf(c4Var.u());
                            } else {
                                l10 = null;
                            }
                            s(g10, 2, "int_value", l10);
                            if (c4Var.I()) {
                                d10 = Double.valueOf(c4Var.t());
                            } else {
                                d10 = null;
                            }
                            s(g10, 2, "double_value", d10);
                            p(2, g10);
                            g10.append("}\n");
                        }
                    }
                }
                r7<g3> G = t3Var.G();
                if (G != null) {
                    for (g3 g3Var : G) {
                        if (g3Var != null) {
                            p(2, g10);
                            g10.append("audience_membership {\n");
                            if (g3Var.D()) {
                                s(g10, 2, "audience_id", Integer.valueOf(g3Var.t()));
                            }
                            if (g3Var.E()) {
                                s(g10, 2, "new_audience", Boolean.valueOf(g3Var.C()));
                            }
                            r(g10, "current_data", g3Var.w());
                            if (g3Var.F()) {
                                r(g10, "previous_data", g3Var.x());
                            }
                            p(2, g10);
                            g10.append("}\n");
                        }
                    }
                }
                r7<k3> H = t3Var.H();
                if (H != null) {
                    for (k3 k3Var : H) {
                        if (k3Var != null) {
                            p(2, g10);
                            g10.append("event {\n");
                            s(g10, 2, "name", this.f9600a.f9997m.d(k3Var.A()));
                            if (k3Var.M()) {
                                s(g10, 2, "timestamp_millis", Long.valueOf(k3Var.w()));
                            }
                            if (k3Var.L()) {
                                s(g10, 2, "previous_timestamp_millis", Long.valueOf(k3Var.v()));
                            }
                            if (k3Var.K()) {
                                s(g10, 2, "count", Integer.valueOf(k3Var.t()));
                            }
                            if (k3Var.u() != 0) {
                                n(g10, 2, (r7) k3Var.B());
                            }
                            p(2, g10);
                            g10.append("}\n");
                        }
                    }
                }
                p(1, g10);
                g10.append("}\n");
            }
        }
        g10.append("}\n");
        return g10.toString();
    }

    public final String B(n2 n2Var) {
        StringBuilder g10 = f.g("\nproperty_filter {\n");
        if (n2Var.C()) {
            s(g10, 0, "filter_id", Integer.valueOf(n2Var.t()));
        }
        s(g10, 0, "property_name", this.f9600a.f9997m.f(n2Var.x()));
        String q10 = q(n2Var.z(), n2Var.A(), n2Var.B());
        if (!q10.isEmpty()) {
            s(g10, 0, "filter_type", q10);
        }
        o(g10, 1, n2Var.u());
        g10.append("}\n");
        return g10.toString();
    }

    public final List C(q7 q7Var, List list) {
        int i10;
        ArrayList arrayList = new ArrayList(q7Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f9600a.a().f9831i.b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f9600a.a().f9831i.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    public final void F(n3 n3Var, Object obj) {
        n3Var.j();
        o3.E((o3) n3Var.f8238b);
        n3Var.j();
        o3.G((o3) n3Var.f8238b);
        n3Var.j();
        o3.I((o3) n3Var.f8238b);
        n3Var.j();
        o3.L((o3) n3Var.f8238b);
        if (obj instanceof String) {
            n3Var.j();
            o3.D((o3) n3Var.f8238b, (String) obj);
        } else if (obj instanceof Long) {
            n3Var.k(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            n3Var.j();
            o3.H((o3) n3Var.f8238b, doubleValue);
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    n3 x9 = o3.x();
                    for (String next : bundle.keySet()) {
                        n3 x10 = o3.x();
                        x10.l(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            x10.k(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            x10.j();
                            o3.D((o3) x10.f8238b, (String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            x10.j();
                            o3.H((o3) x10.f8238b, doubleValue2);
                        }
                        x9.j();
                        o3.J((o3) x9.f8238b, (o3) x10.h());
                    }
                    if (((o3) x9.f8238b).v() > 0) {
                        arrayList.add((o3) x9.h());
                    }
                }
            }
            n3Var.j();
            o3.K((o3) n3Var.f8238b, arrayList);
        } else {
            this.f9600a.a().f9828f.b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final boolean H(long j10, long j11) {
        if (j10 == 0 || j11 <= 0) {
            return true;
        }
        this.f9600a.f9998n.getClass();
        if (Math.abs(System.currentTimeMillis() - j10) > j11) {
            return true;
        }
        return false;
    }

    public final byte[] J(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f9600a.a().f9828f.b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final void j() {
    }

    public final void n(StringBuilder sb, int i10, r7 r7Var) {
        String str;
        String str2;
        Long l6;
        if (r7Var != null) {
            int i11 = i10 + 1;
            Iterator it = r7Var.iterator();
            while (it.hasNext()) {
                o3 o3Var = (o3) it.next();
                if (o3Var != null) {
                    p(i11, sb);
                    sb.append("param {\n");
                    Double d10 = null;
                    if (o3Var.P()) {
                        str = this.f9600a.f9997m.e(o3Var.z());
                    } else {
                        str = null;
                    }
                    s(sb, i11, "name", str);
                    if (o3Var.Q()) {
                        str2 = o3Var.A();
                    } else {
                        str2 = null;
                    }
                    s(sb, i11, "string_value", str2);
                    if (o3Var.O()) {
                        l6 = Long.valueOf(o3Var.w());
                    } else {
                        l6 = null;
                    }
                    s(sb, i11, "int_value", l6);
                    if (o3Var.M()) {
                        d10 = Double.valueOf(o3Var.t());
                    }
                    s(sb, i11, "double_value", d10);
                    if (o3Var.v() > 0) {
                        n(sb, i11, (r7) o3Var.B());
                    }
                    p(i11, sb);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void o(StringBuilder sb, int i10, i2 i2Var) {
        String str;
        if (i2Var != null) {
            p(i10, sb);
            sb.append("filter {\n");
            if (i2Var.A()) {
                s(sb, i10, "complement", Boolean.valueOf(i2Var.z()));
            }
            if (i2Var.C()) {
                s(sb, i10, "param_name", this.f9600a.f9997m.e(i2Var.x()));
            }
            if (i2Var.D()) {
                int i11 = i10 + 1;
                q2 w = i2Var.w();
                if (w != null) {
                    p(i11, sb);
                    sb.append("string_filter {\n");
                    if (w.B()) {
                        switch (w.C()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        s(sb, i11, "match_type", str);
                    }
                    if (w.A()) {
                        s(sb, i11, "expression", w.w());
                    }
                    if (w.z()) {
                        s(sb, i11, "case_sensitive", Boolean.valueOf(w.y()));
                    }
                    if (w.t() > 0) {
                        p(i11 + 1, sb);
                        sb.append("expression_list {\n");
                        for (String append : w.x()) {
                            p(i11 + 2, sb);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    p(i11, sb);
                    sb.append("}\n");
                }
            }
            if (i2Var.B()) {
                t(sb, i10 + 1, "number_filter", i2Var.v());
            }
            p(i10, sb);
            sb.append("}\n");
        }
    }

    public final long v(byte[] bArr) {
        o.h(bArr);
        this.f9600a.x().g();
        MessageDigest o10 = d8.o();
        if (o10 != null) {
            return d8.i0(o10.digest(bArr));
        }
        this.f9600a.a().f9828f.a("Failed to get MD5");
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f9600a.a().f9828f.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable x(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            n4.n4 r5 = r4.f9600a     // Catch:{ all -> 0x001a }
            n4.i3 r5 = r5.a()     // Catch:{ all -> 0x001a }
            n4.g3 r5 = r5.f9828f     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.y7.x(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}

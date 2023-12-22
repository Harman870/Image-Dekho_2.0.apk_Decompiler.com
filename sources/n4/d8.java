package n4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j4.ob;
import j4.pb;
import j4.x0;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import o3.f;
import o3.i;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r3.o;
import y3.a;
import z5.c;

public final class d8 extends b5 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f9706g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f9707h = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    public SecureRandom f9708c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f9709d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public int f9710e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f9711f = null;

    public d8(n4 n4Var) {
        super(n4Var);
    }

    public static boolean Q(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean T(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean U(String str) {
        o.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean V(android.content.Context r4) {
        /*
            r3.o.h(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.d8.V(android.content.Context):boolean");
    }

    public static boolean W(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            o.h(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public static byte[] X(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean Y(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    public static boolean b0(String str, String[] strArr) {
        o.h(strArr);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str2 = strArr[i10];
            if (str == str2 || (str != null && str.equals(str2))) {
                return true;
            }
        }
        return false;
    }

    public static long i0(byte[] bArr) {
        o.h(bArr);
        int length = bArr.length;
        int i10 = 0;
        o.k(length > 0);
        long j10 = 0;
        while (true) {
            length--;
            if (length < 0 || length < bArr.length - 8) {
                return j10;
            }
            j10 += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static String n(int i10, String str, boolean z9) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z9) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public static MessageDigest o() {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList q(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", cVar.f9640a);
            bundle.putString("origin", cVar.f9641b);
            bundle.putLong("creation_timestamp", cVar.f9643d);
            bundle.putString("name", cVar.f9642c.f10354b);
            Object x9 = cVar.f9642c.x();
            o.h(x9);
            c.y(bundle, x9);
            bundle.putBoolean("active", cVar.f9644e);
            String str = cVar.f9645f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            r rVar = cVar.f9646g;
            if (rVar != null) {
                bundle.putString("timed_out_event_name", rVar.f10085a);
                p pVar = rVar.f10086b;
                if (pVar != null) {
                    bundle.putBundle("timed_out_event_params", pVar.x());
                }
            }
            bundle.putLong("trigger_timeout", cVar.f9647h);
            r rVar2 = cVar.f9648i;
            if (rVar2 != null) {
                bundle.putString("triggered_event_name", rVar2.f10085a);
                p pVar2 = rVar2.f10086b;
                if (pVar2 != null) {
                    bundle.putBundle("triggered_event_params", pVar2.x());
                }
            }
            bundle.putLong("triggered_timestamp", cVar.f9642c.f10355c);
            bundle.putLong("time_to_live", cVar.f9649j);
            r rVar3 = cVar.k;
            if (rVar3 != null) {
                bundle.putString("expired_event_name", rVar3.f10085a);
                p pVar3 = rVar3.f10086b;
                if (pVar3 != null) {
                    bundle.putBundle("expired_event_params", pVar3.x());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void t(g6 g6Var, Bundle bundle, boolean z9) {
        if (!(bundle == null || g6Var == null)) {
            if (!bundle.containsKey("_sc") || z9) {
                String str = g6Var.f9761a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = g6Var.f9762b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", g6Var.f9763c);
                return;
            }
            z9 = false;
        }
        if (bundle != null && g6Var == null && z9) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void x(c8 c8Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        Y(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        c8Var.a(str, bundle);
    }

    public final void A(x0 x0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f9600a.a().f9831i.b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void B(x0 x0Var, Bundle bundle) {
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f9600a.a().f9831i.b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void C(x0 x0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f9600a.a().f9831i.b("Error returning byte array to wrapper", e10);
        }
    }

    public final void D(x0 x0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f9600a.a().f9831i.b("Error returning int value to wrapper", e10);
        }
    }

    public final void E(x0 x0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f9600a.a().f9831i.b("Error returning long value to wrapper", e10);
        }
    }

    public final void F(String str, x0 x0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f9600a.a().f9831i.b("Error returning string value to wrapper", e10);
        }
    }

    public final void G(String str, String str2, Bundle bundle, List list, boolean z9) {
        int i10;
        int i11;
        String str3;
        int i12;
        g3 g3Var;
        String d10;
        String b10;
        String str4;
        String str5;
        String str6 = str;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            f fVar = this.f9600a.f9992g;
            ((pb) ob.f8369b.f8370a.zza()).zza();
            if (!fVar.f9600a.f9992g.o((String) null, w2.f10240s0) || !fVar.f9600a.x().S(231100000)) {
                i10 = 0;
            } else {
                i10 = 35;
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i13 = 0;
            while (it.hasNext()) {
                String str7 = (String) it.next();
                if (list2 == null || !list2.contains(str7)) {
                    if (!z9) {
                        i11 = f0(str7);
                    } else {
                        i11 = 0;
                    }
                    if (i11 == 0) {
                        i11 = e0(str7);
                    }
                } else {
                    i11 = 0;
                }
                if (i11 != 0) {
                    if (i11 == 3) {
                        str5 = str7;
                    } else {
                        str5 = null;
                    }
                    s(bundle2, i11, str7, str5);
                    bundle2.remove(str7);
                } else {
                    if (Q(bundle2.get(str7))) {
                        this.f9600a.a().k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str2, str7);
                        i12 = 22;
                        str3 = str7;
                    } else {
                        String str8 = str2;
                        str3 = str7;
                        i12 = J(str, str7, bundle2.get(str7), bundle, list, z9, false);
                    }
                    if (i12 != 0 && !"_ev".equals(str3)) {
                        s(bundle2, i12, str3, bundle2.get(str3));
                        bundle2.remove(str3);
                    } else if (U(str3) && !b0(str3, a.M)) {
                        int i14 = i13 + 1;
                        int i15 = 23;
                        if (!S(231100000)) {
                            g3Var = this.f9600a.a().f9830h;
                            d10 = this.f9600a.f9997m.d(str6);
                            b10 = this.f9600a.f9997m.b(bundle2);
                            str4 = "Item array not supported on client's version of Google Play Services (Android Only)";
                        } else {
                            if (i14 > i10) {
                                ((pb) ob.f8369b.f8370a.zza()).zza();
                                if (this.f9600a.f9992g.o((String) null, w2.f10240s0)) {
                                    this.f9600a.a().f9830h.c("Item can't contain more than " + i10 + " item-scoped custom params", this.f9600a.f9997m.d(str6), this.f9600a.f9997m.b(bundle2));
                                    i15 = 28;
                                    Y(i15, bundle2);
                                    bundle2.remove(str3);
                                } else {
                                    g3Var = this.f9600a.a().f9830h;
                                    d10 = this.f9600a.f9997m.d(str6);
                                    b10 = this.f9600a.f9997m.b(bundle2);
                                    str4 = "Item cannot contain custom parameters";
                                }
                            }
                            i13 = i14;
                        }
                        g3Var.c(str4, d10, b10);
                        Y(i15, bundle2);
                        bundle2.remove(str3);
                        i13 = i14;
                    }
                }
            }
        }
    }

    public final boolean H(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            o.h(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(this.f9600a.f9987b)) {
                this.f9600a.a().f9830h.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", i3.p(str));
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            o.h(str2);
            if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            this.f9600a.a().f9830h.b("Invalid admob_app_id. Analytics disabled.", i3.p(str2));
            return false;
        } else {
            if (TextUtils.isEmpty(this.f9600a.f9987b)) {
                this.f9600a.a().f9830h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    public final boolean I(int i10, String str, String str2) {
        if (str2 == null) {
            this.f9600a.a().f9830h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            this.f9600a.a().f9830h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int J(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            r12 = this;
            r6 = r12
            r7 = r14
            r0 = r15
            r1 = r16
            r12.g()
            boolean r2 = Q(r15)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00a8
            if (r19 == 0) goto L_0x00a5
            java.lang.String[] r2 = y3.a.L
            boolean r2 = b0(r14, r2)
            if (r2 != 0) goto L_0x001e
            r0 = 20
            return r0
        L_0x001e:
            n4.n4 r2 = r6.f9600a
            n4.a7 r2 = r2.v()
            r2.g()
            r2.h()
            boolean r5 = r2.o()
            if (r5 != 0) goto L_0x0031
            goto L_0x0043
        L_0x0031:
            n4.n4 r2 = r2.f9600a
            n4.d8 r2 = r2.x()
            int r2 = r2.h0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0043
            r0 = 25
            return r0
        L_0x0043:
            n4.n4 r2 = r6.f9600a
            r2.getClass()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0051
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005c
        L_0x0051:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00a8
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005c:
            r8 = 200(0xc8, float:2.8E-43)
            if (r5 <= r8) goto L_0x00a8
            n4.n4 r9 = r6.f9600a
            n4.i3 r9 = r9.a()
            n4.g3 r9 = r9.k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.d(r10, r3, r14, r5)
            n4.n4 r5 = r6.f9600a
            r5.getClass()
            if (r2 == 0) goto L_0x0088
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r8) goto L_0x00a1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r8)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r14, r2)
            goto L_0x00a1
        L_0x0088:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a1
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r8) goto L_0x00a1
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r8)
            r5.<init>(r2)
            r1.putParcelableArrayList(r14, r5)
        L_0x00a1:
            r1 = 17
            r8 = r1
            goto L_0x00a9
        L_0x00a5:
            r0 = 21
            return r0
        L_0x00a8:
            r8 = r4
        L_0x00a9:
            boolean r1 = T(r13)
            if (r1 != 0) goto L_0x00be
            boolean r1 = T(r14)
            if (r1 == 0) goto L_0x00b6
            goto L_0x00be
        L_0x00b6:
            n4.n4 r1 = r6.f9600a
            r1.getClass()
            r1 = 100
            goto L_0x00c5
        L_0x00be:
            n4.n4 r1 = r6.f9600a
            r1.getClass()
            r1 = 256(0x100, float:3.59E-43)
        L_0x00c5:
            boolean r1 = r12.M(r3, r14, r1, r15)
            if (r1 == 0) goto L_0x00cc
            return r8
        L_0x00cc:
            if (r19 == 0) goto L_0x014f
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e1
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r17
            r5 = r18
            r0.G(r1, r2, r3, r4, r5)
            goto L_0x014e
        L_0x00e1:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0111
            r9 = r0
            android.os.Parcelable[] r9 = (android.os.Parcelable[]) r9
            int r10 = r9.length
            r11 = r4
        L_0x00ea:
            if (r11 >= r10) goto L_0x014e
            r0 = r9[r11]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0101
            n4.n4 r1 = r6.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            goto L_0x013a
        L_0x0101:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r17
            r5 = r18
            r0.G(r1, r2, r3, r4, r5)
            int r11 = r11 + 1
            goto L_0x00ea
        L_0x0111:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x014f
            r9 = r0
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r10 = r9.size()
            r11 = r4
        L_0x011d:
            if (r11 >= r10) goto L_0x014e
            java.lang.Object r0 = r9.get(r11)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x013e
            n4.n4 r1 = r6.f9600a
            n4.i3 r1 = r1.a()
            n4.g3 r1 = r1.k
            if (r0 == 0) goto L_0x0136
            java.lang.Class r0 = r0.getClass()
            goto L_0x0138
        L_0x0136:
            java.lang.String r0 = "null"
        L_0x0138:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
        L_0x013a:
            r1.c(r2, r0, r14)
            goto L_0x014f
        L_0x013e:
            r3 = r0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r17
            r5 = r18
            r0.G(r1, r2, r3, r4, r5)
            int r11 = r11 + 1
            goto L_0x011d
        L_0x014e:
            return r8
        L_0x014f:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.d8.J(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final void K() {
        g();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f9600a.a().f9831i.a("Utils falling back to Random for random id");
            }
        }
        this.f9709d.set(nextLong);
    }

    public final boolean L(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f9600a.a().f9830h.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f9706g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f9600a.a().f9830h.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !b0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && b0(str2, strArr2)) {
            return true;
        }
        this.f9600a.a().f9830h.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean M(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f9600a.a().k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean N(String str, String str2) {
        if (str2 == null) {
            this.f9600a.a().f9830h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f9600a.a().f9830h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f9600a.a().f9830h.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f9600a.a().f9830h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean O(String str, String str2) {
        if (str2 == null) {
            this.f9600a.a().f9830h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f9600a.a().f9830h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f9600a.a().f9830h.c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f9600a.a().f9830h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean P(String str) {
        g();
        if (y3.c.a(this.f9600a.f9986a).f13043a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.f9600a.a().f9834m.b("Permission not granted", str);
        return false;
    }

    public final boolean R(Context context, String str) {
        g3 g3Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b10 = y3.c.a(context).b(64, str);
            if (b10 == null || (signatureArr = b10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e10) {
            e = e10;
            g3Var = this.f9600a.a().f9828f;
            str2 = "Error obtaining certificate";
            g3Var.b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            g3Var = this.f9600a.a().f9828f;
            str2 = "Package name not found";
            g3Var.b(str2, e);
            return true;
        }
    }

    public final boolean S(int i10) {
        Boolean bool = this.f9600a.v().f9614e;
        if (h0() >= i10 / 1000 || (bool != null && !bool.booleanValue())) {
            return true;
        }
        return false;
    }

    public final int Z(String str) {
        if ("_ldl".equals(str)) {
            this.f9600a.getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f9600a.getClass();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f9600a.getClass();
            return 100;
        } else {
            this.f9600a.getClass();
            return 36;
        }
    }

    public final Object a0(int i10, Object obj, boolean z9, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return n(i10, obj.toString(), z9);
            }
            if (!z10 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle l02 = l0((Bundle) parcelable);
                    if (!l02.isEmpty()) {
                        arrayList.add(l02);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int c0(Object obj, String str) {
        String str2;
        int i10;
        if ("_ldl".equals(str)) {
            i10 = Z(str);
            str2 = "user property referrer";
        } else {
            i10 = Z(str);
            str2 = "user property";
        }
        return M(str2, str, i10, obj) ? 0 : 7;
    }

    public final int d0(String str) {
        if (!N("event", str)) {
            return 2;
        }
        if (!L("event", c.a.f2356q, c.a.f2358r, str)) {
            return 13;
        }
        this.f9600a.getClass();
        return !I(40, "event", str) ? 2 : 0;
    }

    public final int e0(String str) {
        if (!N("event param", str)) {
            return 3;
        }
        if (!L("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f9600a.getClass();
        return !I(40, "event param", str) ? 3 : 0;
    }

    public final int f0(String str) {
        if (!O("event param", str)) {
            return 3;
        }
        if (!L("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f9600a.getClass();
        return !I(40, "event param", str) ? 3 : 0;
    }

    public final int g0(String str) {
        if (!N("user property", str)) {
            return 6;
        }
        if (!L("user property", c.f13183g, (String[]) null, str)) {
            return 15;
        }
        this.f9600a.getClass();
        return !I(24, "user property", str) ? 6 : 0;
    }

    public final boolean h() {
        return true;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int h0() {
        if (this.f9711f == null) {
            f fVar = f.f10556b;
            Context context = this.f9600a.f9986a;
            fVar.getClass();
            AtomicBoolean atomicBoolean = i.f10562a;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f9711f = Integer.valueOf(i10 / 1000);
        }
        return this.f9711f.intValue();
    }

    public final long j0() {
        long andIncrement;
        long j10;
        if (this.f9709d.get() == 0) {
            synchronized (this.f9709d) {
                long nanoTime = System.nanoTime();
                this.f9600a.f9998n.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i10 = this.f9710e + 1;
                this.f9710e = i10;
                j10 = nextLong + ((long) i10);
            }
            return j10;
        }
        synchronized (this.f9709d) {
            this.f9709d.compareAndSet(-1, 1);
            andIncrement = this.f9709d.getAndIncrement();
        }
        return andIncrement;
    }

    public final Object k(Object obj, String str) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f9600a.getClass();
            return a0(256, obj, true, true);
        }
        if (T(str)) {
            this.f9600a.getClass();
        } else {
            this.f9600a.getClass();
            i10 = 100;
        }
        return a0(i10, obj, false, true);
    }

    public final Bundle k0(boolean z9, Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Uri uri2 = uri;
        if (uri2 != null) {
            try {
                if (uri.isHierarchical()) {
                    str8 = uri2.getQueryParameter("utm_campaign");
                    str7 = uri2.getQueryParameter("utm_source");
                    str6 = uri2.getQueryParameter("utm_medium");
                    str5 = uri2.getQueryParameter("gclid");
                    str4 = uri2.getQueryParameter("utm_id");
                    str3 = uri2.getQueryParameter("dclid");
                    str2 = uri2.getQueryParameter("srsltid");
                    if (z9) {
                        str = uri2.getQueryParameter("sfmc_id");
                    } else {
                        str = null;
                    }
                } else {
                    str8 = null;
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z9 || TextUtils.isEmpty(str))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("campaign", str8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("source", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("medium", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri2.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri2.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri2.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri2.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign_id", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("dclid", str3);
                }
                String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("srsltid", str2);
                }
                if (z9 && !TextUtils.isEmpty(str)) {
                    bundle.putString("sfmc_id", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f9600a.a().f9831i.b("Install referrer url isn't a hierarchical URI", e10);
                return null;
            }
        } else {
            return null;
        }
    }

    public final Object l(Object obj, String str) {
        boolean equals = "_ldl".equals(str);
        int Z = Z(str);
        return equals ? a0(Z, obj, true, false) : a0(Z, obj, false, false);
    }

    public final Bundle l0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object k = k(bundle.get(next), next);
                if (k == null) {
                    this.f9600a.a().k.b("Param value can't be null", this.f9600a.f9997m.e(next));
                } else {
                    y(bundle2, next, k);
                }
            }
        }
        return bundle2;
    }

    public final String m() {
        byte[] bArr = new byte[16];
        p().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle m0(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            java.lang.String[] r0 = c.a.f2362t
            boolean r12 = b0(r9, r0)
            if (r10 == 0) goto L_0x00f8
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r10)
            n4.n4 r0 = r8.f9600a
            n4.f r0 = r0.f9992g
            n4.n4 r0 = r0.f9600a
            n4.d8 r0 = r0.x()
            r1 = 201500000(0xc02a560, float:1.0064601E-31)
            boolean r0 = r0.S(r1)
            if (r0 == 0) goto L_0x002b
            r0 = 100
            goto L_0x002d
        L_0x002b:
            r0 = 25
        L_0x002d:
            r15 = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r21.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x003f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r11 == 0) goto L_0x0058
            boolean r0 = r11.contains(r7)
            if (r0 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r0 = r17
            goto L_0x0067
        L_0x0058:
            if (r23 != 0) goto L_0x005f
            int r0 = r8.f0(r7)
            goto L_0x0061
        L_0x005f:
            r0 = r17
        L_0x0061:
            if (r0 != 0) goto L_0x0067
            int r0 = r8.e0(r7)
        L_0x0067:
            if (r0 == 0) goto L_0x0076
            r1 = 3
            if (r0 != r1) goto L_0x006e
            r1 = r7
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            r8.s(r14, r0, r7, r1)
            r14.remove(r7)
            goto L_0x003f
        L_0x0076:
            java.lang.Object r3 = r10.get(r7)
            r0 = r19
            r1 = r20
            r2 = r7
            r4 = r14
            r5 = r22
            r6 = r23
            r13 = r7
            r7 = r12
            int r0 = r0.J(r1, r2, r3, r4, r5, r6, r7)
            r1 = 17
            if (r0 != r1) goto L_0x0094
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.s(r14, r1, r13, r0)
            goto L_0x00b0
        L_0x0094:
            if (r0 == 0) goto L_0x00b0
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00b0
            r1 = 21
            if (r0 != r1) goto L_0x00a4
            r7 = r9
            goto L_0x00a5
        L_0x00a4:
            r7 = r13
        L_0x00a5:
            java.lang.Object r1 = r10.get(r13)
            r8.s(r14, r0, r7, r1)
            r14.remove(r13)
            goto L_0x003f
        L_0x00b0:
            boolean r0 = U(r13)
            if (r0 == 0) goto L_0x003f
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x00f2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            n4.n4 r2 = r8.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9830h
            n4.n4 r3 = r8.f9600a
            n4.d3 r3 = r3.f9997m
            java.lang.String r3 = r3.d(r9)
            n4.n4 r4 = r8.f9600a
            n4.d3 r4 = r4.f9997m
            java.lang.String r4 = r4.b(r10)
            r2.c(r1, r3, r4)
            r1 = 5
            Y(r1, r14)
            r14.remove(r13)
        L_0x00f2:
            r18 = r0
            goto L_0x003f
        L_0x00f6:
            r13 = r14
            goto L_0x00f9
        L_0x00f8:
            r13 = 0
        L_0x00f9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.d8.m0(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final r n0(String str, Bundle bundle, String str2, long j10, boolean z9) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (d0(str) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle m02 = m0(str, bundle2, Collections.singletonList("_o"), true);
            if (z9) {
                m02 = l0(m02);
            }
            o.h(m02);
            return new r(str, new p(m02), str2, j10);
        }
        this.f9600a.a().f9828f.b("Invalid conditional property event name", this.f9600a.f9997m.f(str));
        throw new IllegalArgumentException();
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom p() {
        g();
        if (this.f9708c == null) {
            this.f9708c = new SecureRandom();
        }
        return this.f9708c;
    }

    public final void r(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f9600a.a().f9831i.b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void s(Bundle bundle, int i10, String str, Object obj) {
        if (Y(i10, bundle)) {
            this.f9600a.getClass();
            bundle.putString("_ev", n(40, str, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) obj.toString().length());
            }
        }
    }

    public final void u(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    this.f9600a.x().y(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    public final void v(Parcelable[] parcelableArr, int i10, boolean z9) {
        int i11;
        o.h(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i12 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (U(str) && !b0(str, a.M) && (i12 = i12 + 1) > i10) {
                    i3 a10 = this.f9600a.a();
                    if (z9) {
                        a10.f9830h.c("Param can't contain more than " + i10 + " item-scoped custom parameters", this.f9600a.f9997m.e(str), this.f9600a.f9997m.b(bundle));
                        i11 = 28;
                    } else {
                        a10.f9830h.c("Param cannot contain item-scoped custom parameters", this.f9600a.f9997m.e(str), this.f9600a.f9997m.b(bundle));
                        i11 = 23;
                    }
                    Y(i11, bundle);
                    bundle.remove(str);
                }
            }
        }
    }

    public final void w(j3 j3Var, int i10) {
        Iterator it = new TreeSet(j3Var.f9861d.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (U(str) && (i11 = i11 + 1) > i10) {
                this.f9600a.a().f9830h.c("Event can't contain more than " + i10 + " params", this.f9600a.f9997m.d(j3Var.f9858a), this.f9600a.f9997m.b(j3Var.f9861d));
                Y(5, j3Var.f9861d);
                j3Var.f9861d.remove(str);
            }
        }
    }

    public final void y(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                this.f9600a.a().k.c("Not putting event parameter. Invalid value type. name, type", this.f9600a.f9997m.e(str), str2);
            }
        }
    }

    public final void z(x0 x0Var, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z9);
        try {
            x0Var.w(bundle);
        } catch (RemoteException e10) {
            this.f9600a.a().f9831i.b("Error returning boolean value to wrapper", e10);
        }
    }
}

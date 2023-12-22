package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.h0;
import androidx.fragment.app.o;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import com.imgdkh.app.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class y {
    public boolean A;
    public boolean B;
    public boolean C;
    public ArrayList<a> D;
    public ArrayList<Boolean> E;
    public ArrayList<o> F;
    public b0 G;
    public d H;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<k> f1647a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1648b;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f1649c = new g0();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f1650d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<o> f1651e;

    /* renamed from: f  reason: collision with root package name */
    public final v f1652f = new v(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f1653g;

    /* renamed from: h  reason: collision with root package name */
    public final a f1654h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1655i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, c> f1656j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final w f1657l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList<c0> f1658m;

    /* renamed from: n  reason: collision with root package name */
    public int f1659n;

    /* renamed from: o  reason: collision with root package name */
    public u<?> f1660o;

    /* renamed from: p  reason: collision with root package name */
    public androidx.activity.result.c f1661p;

    /* renamed from: q  reason: collision with root package name */
    public o f1662q;

    /* renamed from: r  reason: collision with root package name */
    public o f1663r;

    /* renamed from: s  reason: collision with root package name */
    public b f1664s;

    /* renamed from: t  reason: collision with root package name */
    public c f1665t;
    public androidx.activity.result.e u;

    /* renamed from: v  reason: collision with root package name */
    public androidx.activity.result.e f1666v;
    public androidx.activity.result.e w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayDeque<j> f1667x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1668y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1669z;

    public class a extends androidx.activity.k {
        public a() {
        }

        public final void a() {
            y yVar = y.this;
            yVar.y(true);
            if (yVar.f1654h.f277a) {
                yVar.O();
            } else {
                yVar.f1653g.b();
            }
        }
    }

    public class b extends t {
        public b() {
        }
    }

    public class c implements x0 {
    }

    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            y.this.y(true);
        }
    }

    public class e implements c0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f1673a;

        public e(o oVar) {
            this.f1673a = oVar;
        }

        public final void a() {
            this.f1673a.getClass();
        }
    }

    public class f implements androidx.activity.result.b<androidx.activity.result.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f1674a;

        public f(z zVar) {
            this.f1674a = zVar;
        }

        public final void b(Object obj) {
            StringBuilder sb;
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            j pollFirst = this.f1674a.f1667x.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1677a;
                int i10 = pollFirst.f1678b;
                o e10 = this.f1674a.f1649c.e(str);
                if (e10 == null) {
                    sb = com.ironsource.adapters.ironsource.a.h("Activity result delivered for unknown Fragment ", str);
                } else {
                    e10.B(i10, aVar.f288a, aVar.f289b);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class g implements androidx.activity.result.b<androidx.activity.result.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f1675a;

        public g(z zVar) {
            this.f1675a = zVar;
        }

        public final void b(Object obj) {
            StringBuilder sb;
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            j pollFirst = this.f1675a.f1667x.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1677a;
                int i10 = pollFirst.f1678b;
                o e10 = this.f1675a.f1649c.e(str);
                if (e10 == null) {
                    sb = com.ironsource.adapters.ironsource.a.h("Intent Sender result delivered for unknown Fragment ", str);
                } else {
                    e10.B(i10, aVar.f288a, aVar.f289b);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class h implements androidx.activity.result.b<Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f1676a;

        public h(z zVar) {
            this.f1676a = zVar;
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(Object obj) {
            String str;
            int i10;
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            j pollFirst = this.f1676a.f1667x.pollFirst();
            if (pollFirst == null) {
                str = "No permissions were requested for " + this;
            } else {
                String str2 = pollFirst.f1677a;
                if (this.f1676a.f1649c.e(str2) == null) {
                    str = com.ironsource.adapters.ironsource.a.g("Permission request result delivered for unknown Fragment ", str2);
                } else {
                    return;
                }
            }
            Log.w("FragmentManager", str);
        }
    }

    public static class i extends b.a<androidx.activity.result.h, androidx.activity.result.a> {
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.h hVar = (androidx.activity.result.h) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = hVar.f310b;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new androidx.activity.result.h(hVar.f309a, (Intent) null, hVar.f311c, hVar.f312d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (y.I(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        public final Object c(Intent intent, int i10) {
            return new androidx.activity.result.a(intent, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f1677a;

        /* renamed from: b  reason: collision with root package name */
        public int f1678b;

        public class a implements Parcelable.Creator<j> {
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel);
            }

            public final Object[] newArray(int i10) {
                return new j[i10];
            }
        }

        public j(Parcel parcel) {
            this.f1677a = parcel.readString();
            this.f1678b = parcel.readInt();
        }

        public j(String str, int i10) {
            this.f1677a = str;
            this.f1678b = i10;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1677a);
            parcel.writeInt(this.f1678b);
        }
    }

    public interface k {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class l implements k {

        /* renamed from: a  reason: collision with root package name */
        public final int f1679a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1680b = 1;

        public l(int i10) {
            this.f1679a = i10;
        }

        public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            o oVar = y.this.f1663r;
            if (oVar == null || this.f1679a >= 0 || !oVar.k().O()) {
                return y.this.P(arrayList, arrayList2, this.f1679a, this.f1680b);
            }
            return false;
        }
    }

    public y() {
        Collections.synchronizedMap(new HashMap());
        this.f1657l = new w(this);
        this.f1658m = new CopyOnWriteArrayList<>();
        this.f1659n = -1;
        this.f1664s = new b();
        this.f1665t = new c();
        this.f1667x = new ArrayDeque<>();
        this.H = new d();
    }

    public static boolean I(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean J(o oVar) {
        Iterator it = oVar.u.f1649c.g().iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            if (oVar2 != null) {
                z9 = J(oVar2);
                continue;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(o oVar) {
        if (oVar == null) {
            return true;
        }
        return oVar.C && (oVar.f1579s == null || K(oVar.f1581v));
    }

    public static boolean L(o oVar) {
        if (oVar == null) {
            return true;
        }
        y yVar = oVar.f1579s;
        if (!oVar.equals(yVar.f1663r) || !L(yVar.f1662q)) {
            return false;
        }
        return true;
    }

    public static void Z(o oVar) {
        if (I(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.f1584z) {
            oVar.f1584z = false;
            oVar.J = !oVar.J;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        r6 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r5 = r1.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            boolean r5 = r5.f1503o
            java.util.ArrayList<androidx.fragment.app.o> r6 = r0.F
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.F = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.o> r6 = r0.F
            androidx.fragment.app.g0 r7 = r0.f1649c
            java.util.List r7 = r7.h()
            r6.addAll(r7)
            androidx.fragment.app.o r6 = r0.f1663r
            r7 = 0
            r8 = r3
        L_0x0030:
            r9 = 1
            if (r8 >= r4) goto L_0x017a
            java.lang.Object r10 = r1.get(r8)
            androidx.fragment.app.a r10 = (androidx.fragment.app.a) r10
            java.lang.Object r11 = r2.get(r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r12 = 3
            if (r11 != 0) goto L_0x012b
            java.util.ArrayList<androidx.fragment.app.o> r11 = r0.F
            r13 = 0
        L_0x0049:
            java.util.ArrayList<androidx.fragment.app.h0$a> r14 = r10.f1490a
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x0163
            java.util.ArrayList<androidx.fragment.app.h0$a> r14 = r10.f1490a
            java.lang.Object r14 = r14.get(r13)
            androidx.fragment.app.h0$a r14 = (androidx.fragment.app.h0.a) r14
            int r15 = r14.f1504a
            if (r15 == r9) goto L_0x011a
            r9 = 2
            r3 = 9
            if (r15 == r9) goto L_0x00a1
            if (r15 == r12) goto L_0x0087
            r9 = 6
            if (r15 == r9) goto L_0x0087
            r9 = 7
            if (r15 == r9) goto L_0x0084
            r9 = 8
            if (r15 == r9) goto L_0x0070
            goto L_0x010e
        L_0x0070:
            java.util.ArrayList<androidx.fragment.app.h0$a> r9 = r10.f1490a
            androidx.fragment.app.h0$a r12 = new androidx.fragment.app.h0$a
            r15 = 0
            r12.<init>(r3, r6, r15)
            r9.add(r13, r12)
            r3 = 1
            r14.f1506c = r3
            int r13 = r13 + 1
            androidx.fragment.app.o r6 = r14.f1505b
            goto L_0x010e
        L_0x0084:
            r9 = 1
            goto L_0x011a
        L_0x0087:
            androidx.fragment.app.o r9 = r14.f1505b
            r11.remove(r9)
            androidx.fragment.app.o r9 = r14.f1505b
            if (r9 != r6) goto L_0x010e
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r10.f1490a
            androidx.fragment.app.h0$a r12 = new androidx.fragment.app.h0$a
            r12.<init>((int) r3, (androidx.fragment.app.o) r9)
            r6.add(r13, r12)
            int r13 = r13 + 1
            r3 = 1
            r6 = 0
            r9 = r3
            goto L_0x011f
        L_0x00a1:
            androidx.fragment.app.o r3 = r14.f1505b
            int r9 = r3.f1582x
            int r12 = r11.size()
            int r12 = r12 + -1
            r15 = 0
        L_0x00ac:
            if (r12 < 0) goto L_0x0105
            java.lang.Object r16 = r11.get(r12)
            r2 = r16
            androidx.fragment.app.o r2 = (androidx.fragment.app.o) r2
            int r1 = r2.f1582x
            if (r1 != r9) goto L_0x00f8
            if (r2 != r3) goto L_0x00bf
            r1 = 1
            r15 = r1
            goto L_0x00f8
        L_0x00bf:
            if (r2 != r6) goto L_0x00d4
            java.util.ArrayList<androidx.fragment.app.h0$a> r1 = r10.f1490a
            androidx.fragment.app.h0$a r6 = new androidx.fragment.app.h0$a
            r16 = r9
            r9 = 0
            r4 = 9
            r6.<init>(r4, r2, r9)
            r1.add(r13, r6)
            int r13 = r13 + 1
            r6 = 0
            goto L_0x00d7
        L_0x00d4:
            r16 = r9
            r9 = 0
        L_0x00d7:
            androidx.fragment.app.h0$a r1 = new androidx.fragment.app.h0$a
            r4 = 3
            r1.<init>(r4, r2, r9)
            int r4 = r14.f1507d
            r1.f1507d = r4
            int r4 = r14.f1509f
            r1.f1509f = r4
            int r4 = r14.f1508e
            r1.f1508e = r4
            int r4 = r14.f1510g
            r1.f1510g = r4
            java.util.ArrayList<androidx.fragment.app.h0$a> r4 = r10.f1490a
            r4.add(r13, r1)
            r11.remove(r2)
            int r13 = r13 + 1
            goto L_0x00fa
        L_0x00f8:
            r16 = r9
        L_0x00fa:
            int r12 = r12 + -1
            r1 = r18
            r2 = r19
            r4 = r21
            r9 = r16
            goto L_0x00ac
        L_0x0105:
            if (r15 == 0) goto L_0x0111
            java.util.ArrayList<androidx.fragment.app.h0$a> r1 = r10.f1490a
            r1.remove(r13)
            int r13 = r13 + -1
        L_0x010e:
            r1 = 1
        L_0x010f:
            r9 = r1
            goto L_0x011f
        L_0x0111:
            r1 = 1
            r14.f1504a = r1
            r14.f1506c = r1
            r11.add(r3)
            goto L_0x010f
        L_0x011a:
            androidx.fragment.app.o r1 = r14.f1505b
            r11.add(r1)
        L_0x011f:
            int r13 = r13 + r9
            r12 = 3
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0049
        L_0x012b:
            java.util.ArrayList<androidx.fragment.app.o> r1 = r0.F
            java.util.ArrayList<androidx.fragment.app.h0$a> r2 = r10.f1490a
            int r2 = r2.size()
            int r2 = r2 - r9
        L_0x0134:
            if (r2 < 0) goto L_0x0163
            java.util.ArrayList<androidx.fragment.app.h0$a> r3 = r10.f1490a
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.h0$a r3 = (androidx.fragment.app.h0.a) r3
            int r4 = r3.f1504a
            if (r4 == r9) goto L_0x015a
            r9 = 3
            if (r4 == r9) goto L_0x0154
            switch(r4) {
                case 6: goto L_0x0154;
                case 7: goto L_0x015a;
                case 8: goto L_0x0151;
                case 9: goto L_0x014e;
                case 10: goto L_0x0149;
                default: goto L_0x0148;
            }
        L_0x0148:
            goto L_0x015f
        L_0x0149:
            androidx.lifecycle.g$c r4 = r3.f1511h
            r3.f1512i = r4
            goto L_0x015f
        L_0x014e:
            androidx.fragment.app.o r3 = r3.f1505b
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            r6 = r3
            goto L_0x015f
        L_0x0154:
            androidx.fragment.app.o r3 = r3.f1505b
            r1.add(r3)
            goto L_0x015f
        L_0x015a:
            androidx.fragment.app.o r3 = r3.f1505b
            r1.remove(r3)
        L_0x015f:
            int r2 = r2 + -1
            r9 = 1
            goto L_0x0134
        L_0x0163:
            if (r7 != 0) goto L_0x016c
            boolean r1 = r10.f1496g
            if (r1 == 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            r1 = 0
            goto L_0x016d
        L_0x016c:
            r1 = 1
        L_0x016d:
            r7 = r1
            int r8 = r8 + 1
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0030
        L_0x017a:
            java.util.ArrayList<androidx.fragment.app.o> r1 = r0.F
            r1.clear()
            if (r5 != 0) goto L_0x01bb
            int r1 = r0.f1659n
            r2 = 1
            if (r1 < r2) goto L_0x01bb
            r2 = r20
            r1 = r21
        L_0x018a:
            r3 = r18
            if (r2 >= r1) goto L_0x01bf
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            java.util.ArrayList<androidx.fragment.app.h0$a> r4 = r4.f1490a
            java.util.Iterator r4 = r4.iterator()
        L_0x019a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01b8
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.h0$a r5 = (androidx.fragment.app.h0.a) r5
            androidx.fragment.app.o r5 = r5.f1505b
            if (r5 == 0) goto L_0x019a
            androidx.fragment.app.y r6 = r5.f1579s
            if (r6 == 0) goto L_0x019a
            androidx.fragment.app.f0 r5 = r0.g(r5)
            androidx.fragment.app.g0 r6 = r0.f1649c
            r6.i(r5)
            goto L_0x019a
        L_0x01b8:
            int r2 = r2 + 1
            goto L_0x018a
        L_0x01bb:
            r3 = r18
            r1 = r21
        L_0x01bf:
            r2 = r20
        L_0x01c1:
            if (r2 >= r1) goto L_0x03d3
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            r5 = r19
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r7 = "Unknown cmd: "
            if (r6 == 0) goto L_0x02e3
            r6 = -1
            r4.e(r6)
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r4.f1490a
            int r6 = r6.size()
            int r6 = r6 + -1
        L_0x01e5:
            if (r6 < 0) goto L_0x03cf
            java.util.ArrayList<androidx.fragment.app.h0$a> r8 = r4.f1490a
            java.lang.Object r8 = r8.get(r6)
            androidx.fragment.app.h0$a r8 = (androidx.fragment.app.h0.a) r8
            androidx.fragment.app.o r9 = r8.f1505b
            if (r9 == 0) goto L_0x0239
            androidx.fragment.app.o$b r10 = r9.I
            if (r10 != 0) goto L_0x01f8
            goto L_0x01ff
        L_0x01f8:
            androidx.fragment.app.o$b r10 = r9.i()
            r11 = 1
            r10.f1586a = r11
        L_0x01ff:
            int r10 = r4.f1495f
            r11 = 4100(0x1004, float:5.745E-42)
            r12 = 4099(0x1003, float:5.744E-42)
            r13 = 8197(0x2005, float:1.1486E-41)
            r14 = 8194(0x2002, float:1.1482E-41)
            r15 = 4097(0x1001, float:5.741E-42)
            if (r10 == r15) goto L_0x021d
            if (r10 == r14) goto L_0x021b
            if (r10 == r13) goto L_0x021e
            if (r10 == r12) goto L_0x0219
            if (r10 == r11) goto L_0x0217
            r11 = 0
            goto L_0x021e
        L_0x0217:
            r11 = r13
            goto L_0x021e
        L_0x0219:
            r11 = r12
            goto L_0x021e
        L_0x021b:
            r11 = r15
            goto L_0x021e
        L_0x021d:
            r11 = r14
        L_0x021e:
            androidx.fragment.app.o$b r10 = r9.I
            if (r10 != 0) goto L_0x0225
            if (r11 != 0) goto L_0x0225
            goto L_0x022c
        L_0x0225:
            r9.i()
            androidx.fragment.app.o$b r10 = r9.I
            r10.f1591f = r11
        L_0x022c:
            java.util.ArrayList<java.lang.String> r10 = r4.f1502n
            java.util.ArrayList<java.lang.String> r11 = r4.f1501m
            r9.i()
            androidx.fragment.app.o$b r12 = r9.I
            r12.f1592g = r10
            r12.f1593h = r11
        L_0x0239:
            int r10 = r8.f1504a
            switch(r10) {
                case 1: goto L_0x02c9;
                case 2: goto L_0x023e;
                case 3: goto L_0x02b8;
                case 4: goto L_0x02a4;
                case 5: goto L_0x028d;
                case 6: goto L_0x027c;
                case 7: goto L_0x0265;
                case 8: goto L_0x025d;
                case 9: goto L_0x025a;
                case 10: goto L_0x0251;
                default: goto L_0x023e;
            }
        L_0x023e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = androidx.activity.f.g(r7)
            int r3 = r8.f1504a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0251:
            androidx.fragment.app.y r10 = r4.f1409p
            androidx.lifecycle.g$c r8 = r8.f1511h
            r10.W(r9, r8)
            goto L_0x02df
        L_0x025a:
            androidx.fragment.app.y r8 = r4.f1409p
            goto L_0x0260
        L_0x025d:
            androidx.fragment.app.y r8 = r4.f1409p
            r9 = 0
        L_0x0260:
            r8.X(r9)
            goto L_0x02df
        L_0x0265:
            int r10 = r8.f1507d
            int r11 = r8.f1508e
            int r12 = r8.f1509f
            int r8 = r8.f1510g
            r9.X(r10, r11, r12, r8)
            androidx.fragment.app.y r8 = r4.f1409p
            r10 = 1
            r8.V(r9, r10)
            androidx.fragment.app.y r8 = r4.f1409p
            r8.h(r9)
            goto L_0x02df
        L_0x027c:
            int r10 = r8.f1507d
            int r11 = r8.f1508e
            int r12 = r8.f1509f
            int r8 = r8.f1510g
            r9.X(r10, r11, r12, r8)
            androidx.fragment.app.y r8 = r4.f1409p
            r8.d(r9)
            goto L_0x02df
        L_0x028d:
            int r10 = r8.f1507d
            int r11 = r8.f1508e
            int r12 = r8.f1509f
            int r8 = r8.f1510g
            r9.X(r10, r11, r12, r8)
            androidx.fragment.app.y r8 = r4.f1409p
            r10 = 1
            r8.V(r9, r10)
            androidx.fragment.app.y r8 = r4.f1409p
            r8.H(r9)
            goto L_0x02df
        L_0x02a4:
            int r10 = r8.f1507d
            int r11 = r8.f1508e
            int r12 = r8.f1509f
            int r8 = r8.f1510g
            r9.X(r10, r11, r12, r8)
            androidx.fragment.app.y r8 = r4.f1409p
            r8.getClass()
            Z(r9)
            goto L_0x02df
        L_0x02b8:
            int r10 = r8.f1507d
            int r11 = r8.f1508e
            int r12 = r8.f1509f
            int r8 = r8.f1510g
            r9.X(r10, r11, r12, r8)
            androidx.fragment.app.y r8 = r4.f1409p
            r8.a(r9)
            goto L_0x02df
        L_0x02c9:
            int r10 = r8.f1507d
            int r11 = r8.f1508e
            int r12 = r8.f1509f
            int r8 = r8.f1510g
            r9.X(r10, r11, r12, r8)
            androidx.fragment.app.y r8 = r4.f1409p
            r10 = 1
            r8.V(r9, r10)
            androidx.fragment.app.y r8 = r4.f1409p
            r8.Q(r9)
        L_0x02df:
            int r6 = r6 + -1
            goto L_0x01e5
        L_0x02e3:
            r6 = 1
            r4.e(r6)
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r4.f1490a
            int r6 = r6.size()
            r8 = 0
        L_0x02ee:
            if (r8 >= r6) goto L_0x03cf
            java.util.ArrayList<androidx.fragment.app.h0$a> r9 = r4.f1490a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.h0$a r9 = (androidx.fragment.app.h0.a) r9
            androidx.fragment.app.o r10 = r9.f1505b
            if (r10 == 0) goto L_0x0325
            androidx.fragment.app.o$b r11 = r10.I
            if (r11 != 0) goto L_0x0301
            goto L_0x0308
        L_0x0301:
            androidx.fragment.app.o$b r11 = r10.i()
            r12 = 0
            r11.f1586a = r12
        L_0x0308:
            int r11 = r4.f1495f
            androidx.fragment.app.o$b r12 = r10.I
            if (r12 != 0) goto L_0x0311
            if (r11 != 0) goto L_0x0311
            goto L_0x0318
        L_0x0311:
            r10.i()
            androidx.fragment.app.o$b r12 = r10.I
            r12.f1591f = r11
        L_0x0318:
            java.util.ArrayList<java.lang.String> r11 = r4.f1501m
            java.util.ArrayList<java.lang.String> r12 = r4.f1502n
            r10.i()
            androidx.fragment.app.o$b r13 = r10.I
            r13.f1592g = r11
            r13.f1593h = r12
        L_0x0325:
            int r11 = r9.f1504a
            switch(r11) {
                case 1: goto L_0x03b5;
                case 2: goto L_0x032a;
                case 3: goto L_0x03a4;
                case 4: goto L_0x0393;
                case 5: goto L_0x0379;
                case 6: goto L_0x0368;
                case 7: goto L_0x0351;
                case 8: goto L_0x034a;
                case 9: goto L_0x0346;
                case 10: goto L_0x033d;
                default: goto L_0x032a;
            }
        L_0x032a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = androidx.activity.f.g(r7)
            int r3 = r9.f1504a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x033d:
            androidx.fragment.app.y r11 = r4.f1409p
            androidx.lifecycle.g$c r9 = r9.f1512i
            r11.W(r10, r9)
            goto L_0x03cb
        L_0x0346:
            androidx.fragment.app.y r9 = r4.f1409p
            r10 = 0
            goto L_0x034c
        L_0x034a:
            androidx.fragment.app.y r9 = r4.f1409p
        L_0x034c:
            r9.X(r10)
            goto L_0x03cb
        L_0x0351:
            int r11 = r9.f1507d
            int r12 = r9.f1508e
            int r13 = r9.f1509f
            int r9 = r9.f1510g
            r10.X(r11, r12, r13, r9)
            androidx.fragment.app.y r9 = r4.f1409p
            r11 = 0
            r9.V(r10, r11)
            androidx.fragment.app.y r9 = r4.f1409p
            r9.d(r10)
            goto L_0x03cb
        L_0x0368:
            int r11 = r9.f1507d
            int r12 = r9.f1508e
            int r13 = r9.f1509f
            int r9 = r9.f1510g
            r10.X(r11, r12, r13, r9)
            androidx.fragment.app.y r9 = r4.f1409p
            r9.h(r10)
            goto L_0x03cb
        L_0x0379:
            int r11 = r9.f1507d
            int r12 = r9.f1508e
            int r13 = r9.f1509f
            int r9 = r9.f1510g
            r10.X(r11, r12, r13, r9)
            androidx.fragment.app.y r9 = r4.f1409p
            r11 = 0
            r9.V(r10, r11)
            androidx.fragment.app.y r9 = r4.f1409p
            r9.getClass()
            Z(r10)
            goto L_0x03cb
        L_0x0393:
            int r11 = r9.f1507d
            int r12 = r9.f1508e
            int r13 = r9.f1509f
            int r9 = r9.f1510g
            r10.X(r11, r12, r13, r9)
            androidx.fragment.app.y r9 = r4.f1409p
            r9.H(r10)
            goto L_0x03cb
        L_0x03a4:
            int r11 = r9.f1507d
            int r12 = r9.f1508e
            int r13 = r9.f1509f
            int r9 = r9.f1510g
            r10.X(r11, r12, r13, r9)
            androidx.fragment.app.y r9 = r4.f1409p
            r9.Q(r10)
            goto L_0x03cb
        L_0x03b5:
            int r11 = r9.f1507d
            int r12 = r9.f1508e
            int r13 = r9.f1509f
            int r9 = r9.f1510g
            r10.X(r11, r12, r13, r9)
            androidx.fragment.app.y r9 = r4.f1409p
            r11 = 0
            r9.V(r10, r11)
            androidx.fragment.app.y r9 = r4.f1409p
            r9.a(r10)
        L_0x03cb:
            int r8 = r8 + 1
            goto L_0x02ee
        L_0x03cf:
            int r2 = r2 + 1
            goto L_0x01c1
        L_0x03d3:
            r5 = r19
            int r2 = r1 + -1
            java.lang.Object r2 = r5.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = r20
        L_0x03e3:
            if (r4 >= r1) goto L_0x042e
            java.lang.Object r6 = r3.get(r4)
            androidx.fragment.app.a r6 = (androidx.fragment.app.a) r6
            if (r2 == 0) goto L_0x040d
            java.util.ArrayList<androidx.fragment.app.h0$a> r7 = r6.f1490a
            int r7 = r7.size()
            int r7 = r7 + -1
        L_0x03f5:
            if (r7 < 0) goto L_0x042b
            java.util.ArrayList<androidx.fragment.app.h0$a> r8 = r6.f1490a
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.h0$a r8 = (androidx.fragment.app.h0.a) r8
            androidx.fragment.app.o r8 = r8.f1505b
            if (r8 == 0) goto L_0x040a
            androidx.fragment.app.f0 r8 = r0.g(r8)
            r8.k()
        L_0x040a:
            int r7 = r7 + -1
            goto L_0x03f5
        L_0x040d:
            java.util.ArrayList<androidx.fragment.app.h0$a> r6 = r6.f1490a
            java.util.Iterator r6 = r6.iterator()
        L_0x0413:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x042b
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.h0$a r7 = (androidx.fragment.app.h0.a) r7
            androidx.fragment.app.o r7 = r7.f1505b
            if (r7 == 0) goto L_0x0413
            androidx.fragment.app.f0 r7 = r0.g(r7)
            r7.k()
            goto L_0x0413
        L_0x042b:
            int r4 = r4 + 1
            goto L_0x03e3
        L_0x042e:
            int r4 = r0.f1659n
            r6 = 1
            r0.M(r4, r6)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r6 = r20
        L_0x043b:
            if (r6 >= r1) goto L_0x046c
            java.lang.Object r7 = r3.get(r6)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            java.util.ArrayList<androidx.fragment.app.h0$a> r7 = r7.f1490a
            java.util.Iterator r7 = r7.iterator()
        L_0x0449:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0469
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.h0$a r8 = (androidx.fragment.app.h0.a) r8
            androidx.fragment.app.o r8 = r8.f1505b
            if (r8 == 0) goto L_0x0449
            android.view.ViewGroup r8 = r8.E
            if (r8 == 0) goto L_0x0449
            androidx.fragment.app.x0 r9 = r17.G()
            androidx.fragment.app.t0 r8 = androidx.fragment.app.t0.f(r8, r9)
            r4.add(r8)
            goto L_0x0449
        L_0x0469:
            int r6 = r6 + 1
            goto L_0x043b
        L_0x046c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0470:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0485
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.t0 r6 = (androidx.fragment.app.t0) r6
            r6.f1625d = r2
            r6.g()
            r6.c()
            goto L_0x0470
        L_0x0485:
            r2 = r20
        L_0x0487:
            if (r2 >= r1) goto L_0x04a8
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x04a2
            int r6 = r4.f1411r
            if (r6 < 0) goto L_0x04a2
            r6 = -1
            r4.f1411r = r6
        L_0x04a2:
            r4.getClass()
            int r2 = r2 + 1
            goto L_0x0487
        L_0x04a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final o B(String str) {
        return this.f1649c.d(str);
    }

    public final o C(int i10) {
        g0 g0Var = this.f1649c;
        int size = ((ArrayList) g0Var.f1482a).size();
        while (true) {
            size--;
            if (size >= 0) {
                o oVar = (o) ((ArrayList) g0Var.f1482a).get(size);
                if (oVar != null && oVar.w == i10) {
                    return oVar;
                }
            } else {
                for (f0 f0Var : ((HashMap) g0Var.f1483b).values()) {
                    if (f0Var != null) {
                        o oVar2 = f0Var.f1473c;
                        if (oVar2.w == i10) {
                            return oVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final o D(String str) {
        g0 g0Var = this.f1649c;
        if (str != null) {
            int size = ((ArrayList) g0Var.f1482a).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                o oVar = (o) ((ArrayList) g0Var.f1482a).get(size);
                if (oVar != null && str.equals(oVar.f1583y)) {
                    return oVar;
                }
            }
        }
        if (str != null) {
            for (f0 f0Var : ((HashMap) g0Var.f1483b).values()) {
                if (f0Var != null) {
                    o oVar2 = f0Var.f1473c;
                    if (str.equals(oVar2.f1583y)) {
                        return oVar2;
                    }
                }
            }
        } else {
            g0Var.getClass();
        }
        return null;
    }

    public final ViewGroup E(o oVar) {
        ViewGroup viewGroup = oVar.E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.f1582x > 0 && this.f1661p.m()) {
            View i10 = this.f1661p.i(oVar.f1582x);
            if (i10 instanceof ViewGroup) {
                return (ViewGroup) i10;
            }
        }
        return null;
    }

    public final t F() {
        o oVar = this.f1662q;
        return oVar != null ? oVar.f1579s.F() : this.f1664s;
    }

    public final x0 G() {
        o oVar = this.f1662q;
        return oVar != null ? oVar.f1579s.G() : this.f1665t;
    }

    public final void H(o oVar) {
        if (I(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (!oVar.f1584z) {
            oVar.f1584z = true;
            oVar.J = true ^ oVar.J;
            Y(oVar);
        }
    }

    public final void M(int i10, boolean z9) {
        u<?> uVar;
        if (this.f1660o == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z9 || i10 != this.f1659n) {
            this.f1659n = i10;
            g0 g0Var = this.f1649c;
            Iterator it = ((ArrayList) g0Var.f1482a).iterator();
            while (it.hasNext()) {
                f0 f0Var = (f0) ((HashMap) g0Var.f1483b).get(((o) it.next()).f1567f);
                if (f0Var != null) {
                    f0Var.k();
                }
            }
            Iterator it2 = ((HashMap) g0Var.f1483b).values().iterator();
            while (true) {
                boolean z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                f0 f0Var2 = (f0) it2.next();
                if (f0Var2 != null) {
                    f0Var2.k();
                    o oVar = f0Var2.f1473c;
                    if (oVar.f1573m && !oVar.y()) {
                        z10 = true;
                    }
                    if (z10) {
                        g0Var.j(f0Var2);
                    }
                }
            }
            a0();
            if (this.f1668y && (uVar = this.f1660o) != null && this.f1659n == 7) {
                uVar.C();
                this.f1668y = false;
            }
        }
    }

    public final void N() {
        if (this.f1660o != null) {
            this.f1669z = false;
            this.A = false;
            this.G.f1441h = false;
            for (o oVar : this.f1649c.h()) {
                if (oVar != null) {
                    oVar.u.N();
                }
            }
        }
    }

    public final boolean O() {
        y(false);
        x(true);
        o oVar = this.f1663r;
        if (oVar != null && oVar.k().O()) {
            return true;
        }
        boolean P = P(this.D, this.E, -1, 0);
        if (P) {
            this.f1648b = true;
            try {
                R(this.D, this.E);
            } finally {
                e();
            }
        }
        b0();
        if (this.C) {
            this.C = false;
            a0();
        }
        this.f1649c.b();
        return P;
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z9;
        if ((i11 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList<a> arrayList3 = this.f1650d;
        int i12 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                i12 = z9 ? 0 : -1 + this.f1650d.size();
            } else {
                int size = this.f1650d.size() - 1;
                while (size >= 0) {
                    a aVar = this.f1650d.get(size);
                    if (i10 >= 0 && i10 == aVar.f1411r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z9) {
                        while (size > 0) {
                            int i13 = size - 1;
                            a aVar2 = this.f1650d.get(i13);
                            if (i10 < 0 || i10 != aVar2.f1411r) {
                                break;
                            }
                            size = i13;
                        }
                    } else if (size != this.f1650d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f1650d.size() - 1; size2 >= i12; size2--) {
            arrayList.add(this.f1650d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(o oVar) {
        if (I(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.f1578r);
        }
        boolean z9 = !oVar.y();
        if (!oVar.A || z9) {
            g0 g0Var = this.f1649c;
            synchronized (((ArrayList) g0Var.f1482a)) {
                ((ArrayList) g0Var.f1482a).remove(oVar);
            }
            oVar.f1572l = false;
            if (J(oVar)) {
                this.f1668y = true;
            }
            oVar.f1573m = true;
            Y(oVar);
        }
    }

    public final void R(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f1503o) {
                        if (i11 != i10) {
                            A(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f1503o) {
                                i11++;
                            }
                        }
                        A(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    A(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void S(Parcelable parcelable) {
        a0 a0Var;
        ArrayList<e0> arrayList;
        int i10;
        boolean z9;
        f0 f0Var;
        if (parcelable != null && (arrayList = a0Var.f1412a) != null) {
            g0 g0Var = this.f1649c;
            ((HashMap) g0Var.f1484c).clear();
            Iterator<e0> it = arrayList.iterator();
            while (it.hasNext()) {
                e0 next = it.next();
                ((HashMap) g0Var.f1484c).put(next.f1458b, next);
            }
            ((HashMap) this.f1649c.f1483b).clear();
            Iterator<String> it2 = (a0Var = (a0) parcelable).f1413b.iterator();
            while (it2.hasNext()) {
                e0 k10 = this.f1649c.k(it2.next(), (e0) null);
                if (k10 != null) {
                    o oVar = this.G.f1436c.get(k10.f1458b);
                    if (oVar != null) {
                        if (I(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + oVar);
                        }
                        f0Var = new f0(this.f1657l, this.f1649c, oVar, k10);
                    } else {
                        f0Var = new f0(this.f1657l, this.f1649c, this.f1660o.f1636c.getClassLoader(), F(), k10);
                    }
                    o oVar2 = f0Var.f1473c;
                    oVar2.f1579s = this;
                    if (I(2)) {
                        StringBuilder g10 = androidx.activity.f.g("restoreSaveState: active (");
                        g10.append(oVar2.f1567f);
                        g10.append("): ");
                        g10.append(oVar2);
                        Log.v("FragmentManager", g10.toString());
                    }
                    f0Var.m(this.f1660o.f1636c.getClassLoader());
                    this.f1649c.i(f0Var);
                    f0Var.f1475e = this.f1659n;
                }
            }
            b0 b0Var = this.G;
            b0Var.getClass();
            Iterator it3 = new ArrayList(b0Var.f1436c.values()).iterator();
            while (true) {
                i10 = 0;
                if (!it3.hasNext()) {
                    break;
                }
                o oVar3 = (o) it3.next();
                if (((HashMap) this.f1649c.f1483b).get(oVar3.f1567f) != null) {
                    i10 = 1;
                }
                if (i10 == 0) {
                    if (I(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + oVar3 + " that was not found in the set of active Fragments " + a0Var.f1413b);
                    }
                    this.G.d(oVar3);
                    oVar3.f1579s = this;
                    f0 f0Var2 = new f0(this.f1657l, this.f1649c, oVar3);
                    f0Var2.f1475e = 1;
                    f0Var2.k();
                    oVar3.f1573m = true;
                    f0Var2.k();
                }
            }
            g0 g0Var2 = this.f1649c;
            ArrayList<String> arrayList2 = a0Var.f1414c;
            ((ArrayList) g0Var2.f1482a).clear();
            if (arrayList2 != null) {
                for (String next2 : arrayList2) {
                    o d10 = g0Var2.d(next2);
                    if (d10 != null) {
                        if (I(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + d10);
                        }
                        g0Var2.a(d10);
                    } else {
                        throw new IllegalStateException(w0.d("No instantiated fragment for (", next2, ")"));
                    }
                }
            }
            if (a0Var.f1415d != null) {
                this.f1650d = new ArrayList<>(a0Var.f1415d.length);
                int i11 = 0;
                while (true) {
                    b[] bVarArr = a0Var.f1415d;
                    if (i11 >= bVarArr.length) {
                        break;
                    }
                    b bVar = bVarArr[i11];
                    bVar.getClass();
                    a aVar = new a(this);
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < bVar.f1422a.length) {
                        h0.a aVar2 = new h0.a();
                        int i14 = i12 + 1;
                        aVar2.f1504a = bVar.f1422a[i12];
                        if (I(2)) {
                            Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + bVar.f1422a[i14]);
                        }
                        aVar2.f1511h = g.c.values()[bVar.f1424c[i13]];
                        aVar2.f1512i = g.c.values()[bVar.f1425d[i13]];
                        int[] iArr = bVar.f1422a;
                        int i15 = i14 + 1;
                        if (iArr[i14] != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        aVar2.f1506c = z9;
                        int i16 = i15 + 1;
                        int i17 = iArr[i15];
                        aVar2.f1507d = i17;
                        int i18 = i16 + 1;
                        int i19 = iArr[i16];
                        aVar2.f1508e = i19;
                        int i20 = i18 + 1;
                        int i21 = iArr[i18];
                        aVar2.f1509f = i21;
                        int i22 = iArr[i20];
                        aVar2.f1510g = i22;
                        aVar.f1491b = i17;
                        aVar.f1492c = i19;
                        aVar.f1493d = i21;
                        aVar.f1494e = i22;
                        aVar.b(aVar2);
                        i13++;
                        i12 = i20 + 1;
                    }
                    aVar.f1495f = bVar.f1426e;
                    aVar.f1497h = bVar.f1427f;
                    aVar.f1496g = true;
                    aVar.f1498i = bVar.f1429h;
                    aVar.f1499j = bVar.f1430i;
                    aVar.k = bVar.f1431j;
                    aVar.f1500l = bVar.k;
                    aVar.f1501m = bVar.f1432l;
                    aVar.f1502n = bVar.f1433m;
                    aVar.f1503o = bVar.f1434n;
                    aVar.f1411r = bVar.f1428g;
                    for (int i23 = 0; i23 < bVar.f1423b.size(); i23++) {
                        String str = bVar.f1423b.get(i23);
                        if (str != null) {
                            aVar.f1490a.get(i23).f1505b = B(str);
                        }
                    }
                    aVar.e(1);
                    if (I(2)) {
                        Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + aVar.f1411r + "): " + aVar);
                        PrintWriter printWriter = new PrintWriter(new q0());
                        aVar.h("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f1650d.add(aVar);
                    i11++;
                }
            } else {
                this.f1650d = null;
            }
            this.f1655i.set(a0Var.f1416e);
            String str2 = a0Var.f1417f;
            if (str2 != null) {
                o B2 = B(str2);
                this.f1663r = B2;
                r(B2);
            }
            ArrayList<String> arrayList3 = a0Var.f1418g;
            if (arrayList3 != null) {
                for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                    this.f1656j.put(arrayList3.get(i24), a0Var.f1419h.get(i24));
                }
            }
            ArrayList<String> arrayList4 = a0Var.f1420i;
            if (arrayList4 != null) {
                while (i10 < arrayList4.size()) {
                    Bundle bundle = a0Var.f1421j.get(i10);
                    bundle.setClassLoader(this.f1660o.f1636c.getClassLoader());
                    this.k.put(arrayList4.get(i10), bundle);
                    i10++;
                }
            }
            this.f1667x = new ArrayDeque<>(a0Var.k);
        }
    }

    public final a0 T() {
        int i10;
        ArrayList<String> arrayList;
        int size;
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t0 t0Var = (t0) it.next();
            if (t0Var.f1626e) {
                if (I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                t0Var.f1626e = false;
                t0Var.c();
            }
        }
        Iterator it2 = f().iterator();
        while (it2.hasNext()) {
            ((t0) it2.next()).e();
        }
        y(true);
        this.f1669z = true;
        this.G.f1441h = true;
        g0 g0Var = this.f1649c;
        g0Var.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(((HashMap) g0Var.f1483b).size());
        for (f0 f0Var : ((HashMap) g0Var.f1483b).values()) {
            if (f0Var != null) {
                o oVar = f0Var.f1473c;
                f0Var.o();
                arrayList2.add(oVar.f1567f);
                if (I(2)) {
                    Log.v("FragmentManager", "Saved state of " + oVar + ": " + oVar.f1563b);
                }
            }
        }
        g0 g0Var2 = this.f1649c;
        g0Var2.getClass();
        ArrayList<e0> arrayList3 = new ArrayList<>(((HashMap) g0Var2.f1484c).values());
        b[] bVarArr = null;
        if (arrayList3.isEmpty()) {
            if (I(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        g0 g0Var3 = this.f1649c;
        synchronized (((ArrayList) g0Var3.f1482a)) {
            if (((ArrayList) g0Var3.f1482a).isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(((ArrayList) g0Var3.f1482a).size());
                Iterator it3 = ((ArrayList) g0Var3.f1482a).iterator();
                while (it3.hasNext()) {
                    o oVar2 = (o) it3.next();
                    arrayList.add(oVar2.f1567f);
                    if (I(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + oVar2.f1567f + "): " + oVar2);
                    }
                }
            }
        }
        ArrayList<a> arrayList4 = this.f1650d;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            bVarArr = new b[size];
            for (i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new b(this.f1650d.get(i10));
                if (I(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f1650d.get(i10));
                }
            }
        }
        a0 a0Var = new a0();
        a0Var.f1412a = arrayList3;
        a0Var.f1413b = arrayList2;
        a0Var.f1414c = arrayList;
        a0Var.f1415d = bVarArr;
        a0Var.f1416e = this.f1655i.get();
        o oVar3 = this.f1663r;
        if (oVar3 != null) {
            a0Var.f1417f = oVar3.f1567f;
        }
        a0Var.f1418g.addAll(this.f1656j.keySet());
        a0Var.f1419h.addAll(this.f1656j.values());
        a0Var.f1420i.addAll(this.k.keySet());
        a0Var.f1421j.addAll(this.k.values());
        a0Var.k = new ArrayList<>(this.f1667x);
        return a0Var;
    }

    public final void U() {
        synchronized (this.f1647a) {
            boolean z9 = true;
            if (this.f1647a.size() != 1) {
                z9 = false;
            }
            if (z9) {
                this.f1660o.f1637d.removeCallbacks(this.H);
                this.f1660o.f1637d.post(this.H);
                b0();
            }
        }
    }

    public final void V(o oVar, boolean z9) {
        ViewGroup E2 = E(oVar);
        if (E2 != null && (E2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) E2).setDrawDisappearingViewsLast(!z9);
        }
    }

    public final void W(o oVar, g.c cVar) {
        if (!oVar.equals(B(oVar.f1567f)) || !(oVar.f1580t == null || oVar.f1579s == this)) {
            throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
        }
        oVar.M = cVar;
    }

    public final void X(o oVar) {
        if (oVar == null || (oVar.equals(B(oVar.f1567f)) && (oVar.f1580t == null || oVar.f1579s == this))) {
            o oVar2 = this.f1663r;
            this.f1663r = oVar;
            r(oVar2);
            r(this.f1663r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(o oVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup E2 = E(oVar);
        if (E2 != null) {
            o.b bVar = oVar.I;
            boolean z9 = false;
            if (bVar == null) {
                i10 = 0;
            } else {
                i10 = bVar.f1587b;
            }
            if (bVar == null) {
                i11 = 0;
            } else {
                i11 = bVar.f1588c;
            }
            int i14 = i11 + i10;
            if (bVar == null) {
                i12 = 0;
            } else {
                i12 = bVar.f1589d;
            }
            int i15 = i12 + i14;
            if (bVar == null) {
                i13 = 0;
            } else {
                i13 = bVar.f1590e;
            }
            if (i13 + i15 > 0) {
                if (E2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    E2.setTag(R.id.visible_removing_fragment_view_tag, oVar);
                }
                o oVar2 = (o) E2.getTag(R.id.visible_removing_fragment_view_tag);
                o.b bVar2 = oVar.I;
                if (bVar2 != null) {
                    z9 = bVar2.f1586a;
                }
                if (oVar2.I != null) {
                    oVar2.i().f1586a = z9;
                }
            }
        }
    }

    public final f0 a(o oVar) {
        String str = oVar.L;
        if (str != null) {
            v0.c.d(oVar, str);
        }
        if (I(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        f0 g10 = g(oVar);
        oVar.f1579s = this;
        this.f1649c.i(g10);
        if (!oVar.A) {
            this.f1649c.a(oVar);
            oVar.f1573m = false;
            if (oVar.F == null) {
                oVar.J = false;
            }
            if (J(oVar)) {
                this.f1668y = true;
            }
        }
        return g10;
    }

    public final void a0() {
        Iterator it = this.f1649c.f().iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            o oVar = f0Var.f1473c;
            if (oVar.G) {
                if (this.f1648b) {
                    this.C = true;
                } else {
                    oVar.G = false;
                    f0Var.k();
                }
            }
        }
    }

    public final void b(c0 c0Var) {
        this.f1658m.add(c0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r0 = r4.f1654h;
        r1 = r4.f1650d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r1 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (L(r4.f1662q) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r0.f277a = r2;
        r0 = r0.f279c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        r0.accept(java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.y$k> r0 = r4.f1647a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.y$k> r1 = r4.f1647a     // Catch:{ all -> 0x001a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001a }
            r2 = 1
            if (r1 != 0) goto L_0x001e
            androidx.fragment.app.y$a r1 = r4.f1654h     // Catch:{ all -> 0x001a }
            r1.f277a = r2     // Catch:{ all -> 0x001a }
            g0.a<java.lang.Boolean> r1 = r1.f279c     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x001c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x001a }
            r1.accept(r2)     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r1 = move-exception
            goto L_0x0046
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            androidx.fragment.app.y$a r0 = r4.f1654h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f1650d
            r3 = 0
            if (r1 == 0) goto L_0x002b
            int r1 = r1.size()
            goto L_0x002c
        L_0x002b:
            r1 = r3
        L_0x002c:
            if (r1 <= 0) goto L_0x0037
            androidx.fragment.app.o r1 = r4.f1662q
            boolean r1 = L(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r3
        L_0x0038:
            r0.f277a = r2
            g0.a<java.lang.Boolean> r0 = r0.f279c
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.accept(r1)
        L_0x0045:
            return
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.b0():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: androidx.activity.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: androidx.fragment.app.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: androidx.fragment.app.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.fragment.app.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.fragment.app.u<?> r4, androidx.activity.result.c r5, androidx.fragment.app.o r6) {
        /*
            r3 = this;
            androidx.fragment.app.u<?> r0 = r3.f1660o
            if (r0 != 0) goto L_0x0120
            r3.f1660o = r4
            r3.f1661p = r5
            r3.f1662q = r6
            if (r6 == 0) goto L_0x0012
            androidx.fragment.app.y$e r5 = new androidx.fragment.app.y$e
            r5.<init>(r6)
            goto L_0x0019
        L_0x0012:
            boolean r5 = r4 instanceof androidx.fragment.app.c0
            if (r5 == 0) goto L_0x001c
            r5 = r4
            androidx.fragment.app.c0 r5 = (androidx.fragment.app.c0) r5
        L_0x0019:
            r3.b(r5)
        L_0x001c:
            androidx.fragment.app.o r5 = r3.f1662q
            if (r5 == 0) goto L_0x0023
            r3.b0()
        L_0x0023:
            boolean r5 = r4 instanceof androidx.activity.o
            if (r5 == 0) goto L_0x0038
            r5 = r4
            androidx.activity.o r5 = (androidx.activity.o) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.b()
            r3.f1653g = r0
            if (r6 == 0) goto L_0x0033
            r5 = r6
        L_0x0033:
            androidx.fragment.app.y$a r1 = r3.f1654h
            r0.a(r5, r1)
        L_0x0038:
            r5 = 0
            if (r6 == 0) goto L_0x005c
            androidx.fragment.app.y r4 = r6.f1579s
            androidx.fragment.app.b0 r4 = r4.G
            java.util.HashMap<java.lang.String, androidx.fragment.app.b0> r0 = r4.f1437d
            java.lang.String r1 = r6.f1567f
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.b0 r0 = (androidx.fragment.app.b0) r0
            if (r0 != 0) goto L_0x0059
            androidx.fragment.app.b0 r0 = new androidx.fragment.app.b0
            boolean r1 = r4.f1439f
            r0.<init>(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.b0> r4 = r4.f1437d
            java.lang.String r1 = r6.f1567f
            r4.put(r1, r0)
        L_0x0059:
            r3.G = r0
            goto L_0x007d
        L_0x005c:
            boolean r0 = r4 instanceof androidx.lifecycle.f0
            if (r0 == 0) goto L_0x0076
            androidx.lifecycle.f0 r4 = (androidx.lifecycle.f0) r4
            androidx.lifecycle.e0 r4 = r4.p()
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            androidx.fragment.app.b0$a r1 = androidx.fragment.app.b0.f1435i
            r0.<init>(r4, r1)
            java.lang.Class<androidx.fragment.app.b0> r4 = androidx.fragment.app.b0.class
            androidx.lifecycle.b0 r4 = r0.a(r4)
            androidx.fragment.app.b0 r4 = (androidx.fragment.app.b0) r4
            goto L_0x007b
        L_0x0076:
            androidx.fragment.app.b0 r4 = new androidx.fragment.app.b0
            r4.<init>(r5)
        L_0x007b:
            r3.G = r4
        L_0x007d:
            androidx.fragment.app.b0 r4 = r3.G
            boolean r0 = r3.f1669z
            if (r0 != 0) goto L_0x008a
            boolean r0 = r3.A
            if (r0 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r0 = r5
            goto L_0x008b
        L_0x008a:
            r0 = 1
        L_0x008b:
            r4.f1441h = r0
            androidx.fragment.app.g0 r0 = r3.f1649c
            r0.f1485d = r4
            androidx.fragment.app.u<?> r4 = r3.f1660o
            boolean r0 = r4 instanceof d1.d
            if (r0 == 0) goto L_0x00b6
            if (r6 != 0) goto L_0x00b6
            d1.d r4 = (d1.d) r4
            d1.b r4 = r4.c()
            androidx.fragment.app.x r0 = new androidx.fragment.app.x
            r0.<init>(r5, r3)
            java.lang.String r5 = "android:support:fragments"
            r4.b(r5, r0)
            android.os.Bundle r4 = r4.a(r5)
            if (r4 == 0) goto L_0x00b6
            android.os.Parcelable r4 = r4.getParcelable(r5)
            r3.S(r4)
        L_0x00b6:
            androidx.fragment.app.u<?> r4 = r3.f1660o
            boolean r5 = r4 instanceof androidx.activity.result.g
            if (r5 == 0) goto L_0x011f
            androidx.activity.result.g r4 = (androidx.activity.result.g) r4
            androidx.activity.result.f r4 = r4.o()
            if (r6 == 0) goto L_0x00d2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r6.f1567f
            java.lang.String r0 = ":"
            java.lang.String r5 = androidx.activity.e.c(r5, r6, r0)
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r5 = ""
        L_0x00d4:
            java.lang.String r6 = "FragmentManager:"
            java.lang.String r5 = com.ironsource.adapters.ironsource.a.g(r6, r5)
            java.lang.String r6 = "StartActivityForResult"
            java.lang.String r6 = com.ironsource.adapters.ironsource.a.g(r5, r6)
            b.c r0 = new b.c
            r0.<init>()
            androidx.fragment.app.y$f r1 = new androidx.fragment.app.y$f
            r2 = r3
            androidx.fragment.app.z r2 = (androidx.fragment.app.z) r2
            r1.<init>(r2)
            androidx.activity.result.e r6 = r4.d(r6, r0, r1)
            r3.u = r6
            java.lang.String r6 = "StartIntentSenderForResult"
            java.lang.String r6 = com.ironsource.adapters.ironsource.a.g(r5, r6)
            androidx.fragment.app.y$i r0 = new androidx.fragment.app.y$i
            r0.<init>()
            androidx.fragment.app.y$g r1 = new androidx.fragment.app.y$g
            r1.<init>(r2)
            androidx.activity.result.e r6 = r4.d(r6, r0, r1)
            r3.f1666v = r6
            java.lang.String r6 = "RequestPermissions"
            java.lang.String r5 = com.ironsource.adapters.ironsource.a.g(r5, r6)
            b.b r6 = new b.b
            r6.<init>()
            androidx.fragment.app.y$h r0 = new androidx.fragment.app.y$h
            r0.<init>(r2)
            androidx.activity.result.e r4 = r4.d(r5, r6, r0)
            r3.w = r4
        L_0x011f:
            return
        L_0x0120:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.y.c(androidx.fragment.app.u, androidx.activity.result.c, androidx.fragment.app.o):void");
    }

    public final void d(o oVar) {
        if (I(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.A) {
            oVar.A = false;
            if (!oVar.f1572l) {
                this.f1649c.a(oVar);
                if (I(2)) {
                    Log.v("FragmentManager", "add from attach: " + oVar);
                }
                if (J(oVar)) {
                    this.f1668y = true;
                }
            }
        }
    }

    public final void e() {
        this.f1648b = false;
        this.E.clear();
        this.D.clear();
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1649c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((f0) it.next()).f1473c.E;
            if (viewGroup != null) {
                hashSet.add(t0.f(viewGroup, G()));
            }
        }
        return hashSet;
    }

    public final f0 g(o oVar) {
        g0 g0Var = this.f1649c;
        f0 f0Var = (f0) ((HashMap) g0Var.f1483b).get(oVar.f1567f);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this.f1657l, this.f1649c, oVar);
        f0Var2.m(this.f1660o.f1636c.getClassLoader());
        f0Var2.f1475e = this.f1659n;
        return f0Var2;
    }

    public final void h(o oVar) {
        if (I(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (!oVar.A) {
            oVar.A = true;
            if (oVar.f1572l) {
                if (I(2)) {
                    Log.v("FragmentManager", "remove from detach: " + oVar);
                }
                g0 g0Var = this.f1649c;
                synchronized (((ArrayList) g0Var.f1482a)) {
                    ((ArrayList) g0Var.f1482a).remove(oVar);
                }
                oVar.f1572l = false;
                if (J(oVar)) {
                    this.f1668y = true;
                }
                Y(oVar);
            }
        }
    }

    public final void i(Configuration configuration) {
        for (o oVar : this.f1649c.h()) {
            if (oVar != null) {
                oVar.onConfigurationChanged(configuration);
                oVar.u.i(configuration);
            }
        }
    }

    public final boolean j() {
        if (this.f1659n < 1) {
            return false;
        }
        for (o oVar : this.f1649c.h()) {
            if (oVar != null) {
                if (!oVar.f1584z ? oVar.u.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z9;
        if (this.f1659n < 1) {
            return false;
        }
        ArrayList<o> arrayList = null;
        boolean z10 = false;
        for (o oVar : this.f1649c.h()) {
            if (oVar != null && K(oVar)) {
                if (!oVar.f1584z) {
                    z9 = oVar.u.k() | false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(oVar);
                    z10 = true;
                }
            }
        }
        if (this.f1651e != null) {
            for (int i10 = 0; i10 < this.f1651e.size(); i10++) {
                o oVar2 = this.f1651e.get(i10);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    oVar2.getClass();
                }
            }
        }
        this.f1651e = arrayList;
        return z10;
    }

    public final void l() {
        boolean z9 = true;
        this.B = true;
        y(true);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((t0) it.next()).e();
        }
        u<?> uVar = this.f1660o;
        if (uVar instanceof f0) {
            z9 = ((b0) this.f1649c.f1485d).f1440g;
        } else {
            Context context = uVar.f1636c;
            if (context instanceof Activity) {
                z9 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z9) {
            for (c cVar : this.f1656j.values()) {
                for (String str : cVar.f1442a) {
                    b0 b0Var = (b0) this.f1649c.f1485d;
                    b0Var.getClass();
                    if (I(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    b0Var.c(str);
                }
            }
        }
        u(-1);
        this.f1660o = null;
        this.f1661p = null;
        this.f1662q = null;
        if (this.f1653g != null) {
            Iterator<androidx.activity.a> it2 = this.f1654h.f278b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f1653g = null;
        }
        androidx.activity.result.e eVar = this.u;
        if (eVar != null) {
            eVar.f296d.f(eVar.f294b);
            androidx.activity.result.e eVar2 = this.f1666v;
            eVar2.f296d.f(eVar2.f294b);
            androidx.activity.result.e eVar3 = this.w;
            eVar3.f296d.f(eVar3.f294b);
        }
    }

    public final void m() {
        for (o oVar : this.f1649c.h()) {
            if (oVar != null) {
                oVar.P();
            }
        }
    }

    public final void n(boolean z9) {
        for (o oVar : this.f1649c.h()) {
            if (oVar != null) {
                oVar.Q(z9);
            }
        }
    }

    public final void o() {
        Iterator it = this.f1649c.g().iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar != null) {
                oVar.x();
                oVar.u.o();
            }
        }
    }

    public final boolean p() {
        if (this.f1659n < 1) {
            return false;
        }
        for (o oVar : this.f1649c.h()) {
            if (oVar != null) {
                if (!oVar.f1584z ? oVar.u.p() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f1659n >= 1) {
            for (o oVar : this.f1649c.h()) {
                if (oVar != null && !oVar.f1584z) {
                    oVar.u.q();
                }
            }
        }
    }

    public final void r(o oVar) {
        if (oVar != null && oVar.equals(B(oVar.f1567f))) {
            oVar.f1579s.getClass();
            boolean L = L(oVar);
            Boolean bool = oVar.k;
            if (bool == null || bool.booleanValue() != L) {
                oVar.k = Boolean.valueOf(L);
                z zVar = oVar.u;
                zVar.b0();
                zVar.r(zVar.f1663r);
            }
        }
    }

    public final void s(boolean z9) {
        for (o oVar : this.f1649c.h()) {
            if (oVar != null) {
                oVar.R(z9);
            }
        }
    }

    public final boolean t() {
        boolean z9 = false;
        if (this.f1659n < 1) {
            return false;
        }
        for (o oVar : this.f1649c.h()) {
            if (oVar != null && K(oVar) && oVar.S()) {
                z9 = true;
            }
        }
        return z9;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o oVar = this.f1662q;
        if (oVar != null) {
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1662q;
        } else {
            u<?> uVar = this.f1660o;
            if (uVar != null) {
                sb.append(uVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f1660o;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    public final void u(int i10) {
        try {
            this.f1648b = true;
            for (f0 f0Var : ((HashMap) this.f1649c.f1483b).values()) {
                if (f0Var != null) {
                    f0Var.f1475e = i10;
                }
            }
            M(i10, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((t0) it.next()).e();
            }
            this.f1648b = false;
            y(true);
        } catch (Throwable th) {
            this.f1648b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String g10 = com.ironsource.adapters.ironsource.a.g(str, "    ");
        g0 g0Var = this.f1649c;
        g0Var.getClass();
        String str2 = str + "    ";
        if (!((HashMap) g0Var.f1483b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (f0 f0Var : ((HashMap) g0Var.f1483b).values()) {
                printWriter.print(str);
                if (f0Var != null) {
                    o oVar = f0Var.f1473c;
                    printWriter.println(oVar);
                    oVar.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) g0Var.f1482a).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((o) ((ArrayList) g0Var.f1482a).get(i10)).toString());
            }
        }
        ArrayList<o> arrayList = this.f1651e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f1651e.get(i11).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f1650d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = this.f1650d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(g10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1655i.get());
        synchronized (this.f1647a) {
            int size4 = this.f1647a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(this.f1647a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1660o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1661p);
        if (this.f1662q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1662q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1659n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1669z);
        printWriter.print(" mStopped=");
        printWriter.print(this.A);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.B);
        if (this.f1668y) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1668y);
        }
    }

    public final void w(k kVar, boolean z9) {
        boolean z10;
        if (!z9) {
            if (this.f1660o != null) {
                if (this.f1669z || this.A) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else if (this.B) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f1647a) {
            if (this.f1660o != null) {
                this.f1647a.add(kVar);
                U();
            } else if (!z9) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void x(boolean z9) {
        boolean z10;
        if (this.f1648b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1660o == null) {
            if (this.B) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f1660o.f1637d.getLooper()) {
            if (!z9) {
                if (this.f1669z || this.A) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            }
            if (this.D == null) {
                this.D = new ArrayList<>();
                this.E = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean y(boolean z9) {
        boolean z10;
        x(z9);
        boolean z11 = false;
        while (true) {
            ArrayList<a> arrayList = this.D;
            ArrayList<Boolean> arrayList2 = this.E;
            synchronized (this.f1647a) {
                if (this.f1647a.isEmpty()) {
                    z10 = false;
                } else {
                    try {
                        int size = this.f1647a.size();
                        z10 = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            z10 |= this.f1647a.get(i10).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f1647a.clear();
                        this.f1660o.f1637d.removeCallbacks(this.H);
                    }
                }
            }
            if (z10) {
                this.f1648b = true;
                try {
                    R(this.D, this.E);
                    e();
                    z11 = true;
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            } else {
                b0();
                if (this.C) {
                    this.C = false;
                    a0();
                }
                this.f1649c.b();
                return z11;
            }
        }
    }

    public final void z(k kVar, boolean z9) {
        if (!z9 || (this.f1660o != null && !this.B)) {
            x(z9);
            if (kVar.a(this.D, this.E)) {
                this.f1648b = true;
                try {
                    R(this.D, this.E);
                } finally {
                    e();
                }
            }
            b0();
            if (this.C) {
                this.C = false;
                a0();
            }
            this.f1649c.b();
        }
    }
}

package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.activity.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1111d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f1112e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    public static SparseIntArray f1113f = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, t.a> f1114a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1115b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f1116c = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1117a;

        /* renamed from: b  reason: collision with root package name */
        public final d f1118b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f1119c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final C0009b f1120d = new C0009b();

        /* renamed from: e  reason: collision with root package name */
        public final e f1121e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, t.a> f1122f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.b$a$a  reason: collision with other inner class name */
        public static class C0008a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1123a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1124b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1125c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1126d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1127e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1128f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1129g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1130h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1131i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1132j = new int[4];
            public boolean[] k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1133l = 0;

            public final void a(int i10, float f10) {
                int i11 = this.f1128f;
                int[] iArr = this.f1126d;
                if (i11 >= iArr.length) {
                    this.f1126d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1127e;
                    this.f1127e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1126d;
                int i12 = this.f1128f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1127e;
                this.f1128f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f1125c;
                int[] iArr = this.f1123a;
                if (i12 >= iArr.length) {
                    this.f1123a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1124b;
                    this.f1124b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1123a;
                int i13 = this.f1125c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1124b;
                this.f1125c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f1131i;
                int[] iArr = this.f1129g;
                if (i11 >= iArr.length) {
                    this.f1129g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1130h;
                    this.f1130h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1129g;
                int i12 = this.f1131i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1130h;
                this.f1131i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z9) {
                int i11 = this.f1133l;
                int[] iArr = this.f1132j;
                if (i11 >= iArr.length) {
                    this.f1132j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1132j;
                int i12 = this.f1133l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.k;
                this.f1133l = i12 + 1;
                zArr2[i12] = z9;
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            C0009b bVar = this.f1120d;
            aVar.f1063e = bVar.f1148h;
            aVar.f1065f = bVar.f1150i;
            aVar.f1067g = bVar.f1152j;
            aVar.f1069h = bVar.k;
            aVar.f1071i = bVar.f1155l;
            aVar.f1073j = bVar.f1157m;
            aVar.k = bVar.f1159n;
            aVar.f1076l = bVar.f1161o;
            aVar.f1078m = bVar.f1163p;
            aVar.f1080n = bVar.f1164q;
            aVar.f1082o = bVar.f1165r;
            aVar.f1088s = bVar.f1166s;
            aVar.f1089t = bVar.f1167t;
            aVar.u = bVar.u;
            aVar.f1090v = bVar.f1168v;
            aVar.leftMargin = bVar.F;
            aVar.rightMargin = bVar.G;
            aVar.topMargin = bVar.H;
            aVar.bottomMargin = bVar.I;
            aVar.A = bVar.R;
            aVar.B = bVar.Q;
            aVar.f1091x = bVar.N;
            aVar.f1093z = bVar.P;
            aVar.E = bVar.w;
            aVar.F = bVar.f1169x;
            aVar.f1084p = bVar.f1171z;
            aVar.f1085q = bVar.A;
            aVar.f1087r = bVar.B;
            aVar.G = bVar.f1170y;
            aVar.T = bVar.C;
            aVar.U = bVar.D;
            aVar.I = bVar.T;
            aVar.H = bVar.U;
            aVar.K = bVar.W;
            aVar.J = bVar.V;
            aVar.W = bVar.f1156l0;
            aVar.X = bVar.f1158m0;
            aVar.L = bVar.X;
            aVar.M = bVar.Y;
            aVar.P = bVar.Z;
            aVar.Q = bVar.f1135a0;
            aVar.N = bVar.f1137b0;
            aVar.O = bVar.f1139c0;
            aVar.R = bVar.f1141d0;
            aVar.S = bVar.f1143e0;
            aVar.V = bVar.E;
            aVar.f1059c = bVar.f1144f;
            aVar.f1055a = bVar.f1140d;
            aVar.f1057b = bVar.f1142e;
            aVar.width = bVar.f1136b;
            aVar.height = bVar.f1138c;
            String str = bVar.f1154k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f1162o0;
            aVar.setMarginStart(bVar.K);
            aVar.setMarginEnd(this.f1120d.J);
            aVar.a();
        }

        public final void b(int i10, ConstraintLayout.a aVar) {
            this.f1117a = i10;
            C0009b bVar = this.f1120d;
            bVar.f1148h = aVar.f1063e;
            bVar.f1150i = aVar.f1065f;
            bVar.f1152j = aVar.f1067g;
            bVar.k = aVar.f1069h;
            bVar.f1155l = aVar.f1071i;
            bVar.f1157m = aVar.f1073j;
            bVar.f1159n = aVar.k;
            bVar.f1161o = aVar.f1076l;
            bVar.f1163p = aVar.f1078m;
            bVar.f1164q = aVar.f1080n;
            bVar.f1165r = aVar.f1082o;
            bVar.f1166s = aVar.f1088s;
            bVar.f1167t = aVar.f1089t;
            bVar.u = aVar.u;
            bVar.f1168v = aVar.f1090v;
            bVar.w = aVar.E;
            bVar.f1169x = aVar.F;
            bVar.f1170y = aVar.G;
            bVar.f1171z = aVar.f1084p;
            bVar.A = aVar.f1085q;
            bVar.B = aVar.f1087r;
            bVar.C = aVar.T;
            bVar.D = aVar.U;
            bVar.E = aVar.V;
            bVar.f1144f = aVar.f1059c;
            bVar.f1140d = aVar.f1055a;
            bVar.f1142e = aVar.f1057b;
            bVar.f1136b = aVar.width;
            bVar.f1138c = aVar.height;
            bVar.F = aVar.leftMargin;
            bVar.G = aVar.rightMargin;
            bVar.H = aVar.topMargin;
            bVar.I = aVar.bottomMargin;
            bVar.L = aVar.D;
            bVar.T = aVar.I;
            bVar.U = aVar.H;
            bVar.W = aVar.K;
            bVar.V = aVar.J;
            bVar.f1156l0 = aVar.W;
            bVar.f1158m0 = aVar.X;
            bVar.X = aVar.L;
            bVar.Y = aVar.M;
            bVar.Z = aVar.P;
            bVar.f1135a0 = aVar.Q;
            bVar.f1137b0 = aVar.N;
            bVar.f1139c0 = aVar.O;
            bVar.f1141d0 = aVar.R;
            bVar.f1143e0 = aVar.S;
            bVar.f1154k0 = aVar.Y;
            bVar.N = aVar.f1091x;
            bVar.P = aVar.f1093z;
            bVar.M = aVar.w;
            bVar.O = aVar.f1092y;
            bVar.R = aVar.A;
            bVar.Q = aVar.B;
            bVar.S = aVar.C;
            bVar.f1162o0 = aVar.Z;
            bVar.J = aVar.getMarginEnd();
            this.f1120d.K = aVar.getMarginStart();
        }

        public final void c(int i10, c.a aVar) {
            b(i10, aVar);
            this.f1118b.f1184c = aVar.f1200r0;
            e eVar = this.f1121e;
            eVar.f1187a = aVar.u0;
            eVar.f1188b = aVar.f1203v0;
            eVar.f1189c = aVar.f1204w0;
            eVar.f1190d = aVar.f1205x0;
            eVar.f1191e = aVar.f1206y0;
            eVar.f1192f = aVar.f1207z0;
            eVar.f1193g = aVar.A0;
            eVar.f1195i = aVar.B0;
            eVar.f1196j = aVar.C0;
            eVar.k = aVar.D0;
            eVar.f1198m = aVar.f1202t0;
            eVar.f1197l = aVar.f1201s0;
        }

        public final Object clone() {
            a aVar = new a();
            C0009b bVar = aVar.f1120d;
            C0009b bVar2 = this.f1120d;
            bVar.getClass();
            bVar.f1134a = bVar2.f1134a;
            bVar.f1136b = bVar2.f1136b;
            bVar.f1138c = bVar2.f1138c;
            bVar.f1140d = bVar2.f1140d;
            bVar.f1142e = bVar2.f1142e;
            bVar.f1144f = bVar2.f1144f;
            bVar.f1146g = bVar2.f1146g;
            bVar.f1148h = bVar2.f1148h;
            bVar.f1150i = bVar2.f1150i;
            bVar.f1152j = bVar2.f1152j;
            bVar.k = bVar2.k;
            bVar.f1155l = bVar2.f1155l;
            bVar.f1157m = bVar2.f1157m;
            bVar.f1159n = bVar2.f1159n;
            bVar.f1161o = bVar2.f1161o;
            bVar.f1163p = bVar2.f1163p;
            bVar.f1164q = bVar2.f1164q;
            bVar.f1165r = bVar2.f1165r;
            bVar.f1166s = bVar2.f1166s;
            bVar.f1167t = bVar2.f1167t;
            bVar.u = bVar2.u;
            bVar.f1168v = bVar2.f1168v;
            bVar.w = bVar2.w;
            bVar.f1169x = bVar2.f1169x;
            bVar.f1170y = bVar2.f1170y;
            bVar.f1171z = bVar2.f1171z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f1135a0 = bVar2.f1135a0;
            bVar.f1137b0 = bVar2.f1137b0;
            bVar.f1139c0 = bVar2.f1139c0;
            bVar.f1141d0 = bVar2.f1141d0;
            bVar.f1143e0 = bVar2.f1143e0;
            bVar.f1145f0 = bVar2.f1145f0;
            bVar.f1147g0 = bVar2.f1147g0;
            bVar.f1149h0 = bVar2.f1149h0;
            bVar.f1154k0 = bVar2.f1154k0;
            int[] iArr = bVar2.f1151i0;
            if (iArr == null || bVar2.f1153j0 != null) {
                bVar.f1151i0 = null;
            } else {
                bVar.f1151i0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f1153j0 = bVar2.f1153j0;
            bVar.f1156l0 = bVar2.f1156l0;
            bVar.f1158m0 = bVar2.f1158m0;
            bVar.f1160n0 = bVar2.f1160n0;
            bVar.f1162o0 = bVar2.f1162o0;
            c cVar = aVar.f1119c;
            c cVar2 = this.f1119c;
            cVar.getClass();
            cVar2.getClass();
            cVar.f1172a = cVar2.f1172a;
            cVar.f1174c = cVar2.f1174c;
            cVar.f1176e = cVar2.f1176e;
            cVar.f1175d = cVar2.f1175d;
            d dVar = aVar.f1118b;
            d dVar2 = this.f1118b;
            dVar.getClass();
            dVar2.getClass();
            dVar.f1182a = dVar2.f1182a;
            dVar.f1184c = dVar2.f1184c;
            dVar.f1185d = dVar2.f1185d;
            dVar.f1183b = dVar2.f1183b;
            e eVar = aVar.f1121e;
            e eVar2 = this.f1121e;
            eVar.getClass();
            eVar2.getClass();
            eVar.f1187a = eVar2.f1187a;
            eVar.f1188b = eVar2.f1188b;
            eVar.f1189c = eVar2.f1189c;
            eVar.f1190d = eVar2.f1190d;
            eVar.f1191e = eVar2.f1191e;
            eVar.f1192f = eVar2.f1192f;
            eVar.f1193g = eVar2.f1193g;
            eVar.f1194h = eVar2.f1194h;
            eVar.f1195i = eVar2.f1195i;
            eVar.f1196j = eVar2.f1196j;
            eVar.k = eVar2.k;
            eVar.f1197l = eVar2.f1197l;
            eVar.f1198m = eVar2.f1198m;
            aVar.f1117a = this.f1117a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    public static class C0009b {
        public static SparseIntArray p0;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1134a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f1135a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1136b;

        /* renamed from: b0  reason: collision with root package name */
        public int f1137b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1138c;

        /* renamed from: c0  reason: collision with root package name */
        public int f1139c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1140d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public float f1141d0 = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public int f1142e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public float f1143e0 = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1144f = -1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public int f1145f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1146g = true;

        /* renamed from: g0  reason: collision with root package name */
        public int f1147g0 = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1148h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1149h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1150i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int[] f1151i0;

        /* renamed from: j  reason: collision with root package name */
        public int f1152j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public String f1153j0;
        public int k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public String f1154k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1155l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public boolean f1156l0 = false;

        /* renamed from: m  reason: collision with root package name */
        public int f1157m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1158m0 = false;

        /* renamed from: n  reason: collision with root package name */
        public int f1159n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1160n0 = true;

        /* renamed from: o  reason: collision with root package name */
        public int f1161o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1162o0 = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f1163p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1164q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f1165r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1166s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1167t = -1;
        public int u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1168v = -1;
        public float w = 0.5f;

        /* renamed from: x  reason: collision with root package name */
        public float f1169x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public String f1170y = null;

        /* renamed from: z  reason: collision with root package name */
        public int f1171z = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            p0.append(44, 25);
            p0.append(46, 28);
            p0.append(47, 29);
            p0.append(52, 35);
            p0.append(51, 34);
            p0.append(24, 4);
            p0.append(23, 3);
            p0.append(19, 1);
            p0.append(61, 6);
            p0.append(62, 7);
            p0.append(31, 17);
            p0.append(32, 18);
            p0.append(33, 19);
            p0.append(15, 90);
            p0.append(0, 26);
            p0.append(48, 31);
            p0.append(49, 32);
            p0.append(30, 10);
            p0.append(29, 9);
            p0.append(66, 13);
            p0.append(69, 16);
            p0.append(67, 14);
            p0.append(64, 11);
            p0.append(68, 15);
            p0.append(65, 12);
            p0.append(55, 38);
            p0.append(41, 37);
            p0.append(40, 39);
            p0.append(54, 40);
            p0.append(39, 20);
            p0.append(53, 36);
            p0.append(28, 5);
            p0.append(42, 91);
            p0.append(50, 91);
            p0.append(45, 91);
            p0.append(22, 91);
            p0.append(18, 91);
            p0.append(3, 23);
            p0.append(5, 27);
            p0.append(7, 30);
            p0.append(8, 8);
            p0.append(4, 33);
            p0.append(6, 2);
            p0.append(1, 22);
            p0.append(2, 21);
            p0.append(56, 41);
            p0.append(34, 42);
            p0.append(17, 41);
            p0.append(16, 42);
            p0.append(71, 76);
            p0.append(25, 61);
            p0.append(27, 62);
            p0.append(26, 63);
            p0.append(60, 69);
            p0.append(38, 70);
            p0.append(12, 71);
            p0.append(10, 72);
            p0.append(11, 73);
            p0.append(13, 74);
            p0.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            String str;
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.c.f13190o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = p0.get(index);
                switch (i11) {
                    case 1:
                        this.f1163p = b.f(obtainStyledAttributes, index, this.f1163p);
                        break;
                    case 2:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.f1161o = b.f(obtainStyledAttributes, index, this.f1161o);
                        break;
                    case 4:
                        this.f1159n = b.f(obtainStyledAttributes, index, this.f1159n);
                        break;
                    case 5:
                        this.f1170y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f1168v = b.f(obtainStyledAttributes, index, this.f1168v);
                        break;
                    case 10:
                        this.u = b.f(obtainStyledAttributes, index, this.u);
                        break;
                    case 11:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f1140d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1140d);
                        break;
                    case 18:
                        this.f1142e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1142e);
                        break;
                    case 19:
                        this.f1144f = obtainStyledAttributes.getFloat(index, this.f1144f);
                        break;
                    case 20:
                        this.w = obtainStyledAttributes.getFloat(index, this.w);
                        break;
                    case 21:
                        this.f1138c = obtainStyledAttributes.getLayoutDimension(index, this.f1138c);
                        break;
                    case 22:
                        this.f1136b = obtainStyledAttributes.getLayoutDimension(index, this.f1136b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f1148h = b.f(obtainStyledAttributes, index, this.f1148h);
                        break;
                    case 25:
                        this.f1150i = b.f(obtainStyledAttributes, index, this.f1150i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f1152j = b.f(obtainStyledAttributes, index, this.f1152j);
                        break;
                    case 29:
                        this.k = b.f(obtainStyledAttributes, index, this.k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.f1166s = b.f(obtainStyledAttributes, index, this.f1166s);
                        break;
                    case 32:
                        this.f1167t = b.f(obtainStyledAttributes, index, this.f1167t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.f1157m = b.f(obtainStyledAttributes, index, this.f1157m);
                        break;
                    case 35:
                        this.f1155l = b.f(obtainStyledAttributes, index, this.f1155l);
                        break;
                    case 36:
                        this.f1169x = obtainStyledAttributes.getFloat(index, this.f1169x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        b.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f1171z = b.f(obtainStyledAttributes, index, this.f1171z);
                                break;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                break;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1141d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f1143e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f1145f0 = obtainStyledAttributes.getInt(index, this.f1145f0);
                                        continue;
                                    case 73:
                                        this.f1147g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1147g0);
                                        continue;
                                    case 74:
                                        this.f1153j0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f1160n0 = obtainStyledAttributes.getBoolean(index, this.f1160n0);
                                        continue;
                                    case 76:
                                        this.f1162o0 = obtainStyledAttributes.getInt(index, this.f1162o0);
                                        continue;
                                    case 77:
                                        this.f1164q = b.f(obtainStyledAttributes, index, this.f1164q);
                                        continue;
                                    case 78:
                                        this.f1165r = b.f(obtainStyledAttributes, index, this.f1165r);
                                        continue;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        continue;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        continue;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        continue;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 83:
                                        this.f1135a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1135a0);
                                        continue;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        continue;
                                    case 85:
                                        this.f1139c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1139c0);
                                        continue;
                                    case 86:
                                        this.f1137b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1137b0);
                                        continue;
                                    case 87:
                                        this.f1156l0 = obtainStyledAttributes.getBoolean(index, this.f1156l0);
                                        continue;
                                    case 88:
                                        this.f1158m0 = obtainStyledAttributes.getBoolean(index, this.f1158m0);
                                        continue;
                                    case 89:
                                        this.f1154k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1146g = obtainStyledAttributes.getBoolean(index, this.f1146g);
                                        continue;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb.append(str);
                                sb.append(Integer.toHexString(index));
                                sb.append("   ");
                                sb.append(p0.get(index));
                                Log.w("ConstraintSet", sb.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static SparseIntArray k;

        /* renamed from: a  reason: collision with root package name */
        public int f1172a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1173b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1174c = -1;

        /* renamed from: d  reason: collision with root package name */
        public float f1175d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f1176e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public float f1177f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public int f1178g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f1179h = null;

        /* renamed from: i  reason: collision with root package name */
        public int f1180i = -3;

        /* renamed from: j  reason: collision with root package name */
        public int f1181j = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k = sparseIntArray;
            sparseIntArray.append(3, 1);
            k.append(5, 2);
            k.append(9, 3);
            k.append(2, 4);
            k.append(1, 5);
            k.append(0, 6);
            k.append(4, 7);
            k.append(8, 8);
            k.append(7, 9);
            k.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.c.f13191p);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (k.get(index)) {
                    case 1:
                        this.f1176e = obtainStyledAttributes.getFloat(index, this.f1176e);
                        break;
                    case 2:
                        this.f1174c = obtainStyledAttributes.getInt(index, this.f1174c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            String str = p.a.f10642b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1172a = b.f(obtainStyledAttributes, index, this.f1172a);
                        break;
                    case 6:
                        this.f1173b = obtainStyledAttributes.getInteger(index, this.f1173b);
                        break;
                    case 7:
                        this.f1175d = obtainStyledAttributes.getFloat(index, this.f1175d);
                        break;
                    case 8:
                        this.f1178g = obtainStyledAttributes.getInteger(index, this.f1178g);
                        break;
                    case 9:
                        this.f1177f = obtainStyledAttributes.getFloat(index, this.f1177f);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.f1180i = obtainStyledAttributes.getInteger(index, this.f1181j);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1179h = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f1180i = -1;
                                    break;
                                } else {
                                    this.f1181j = obtainStyledAttributes.getResourceId(index, -1);
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1181j = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                        }
                        this.f1180i = -2;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f1182a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1183b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f1184c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1185d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.c.f13193r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f1184c = obtainStyledAttributes.getFloat(index, this.f1184c);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f1182a);
                    this.f1182a = i11;
                    this.f1182a = b.f1111d[i11];
                } else if (index == 4) {
                    this.f1183b = obtainStyledAttributes.getInt(index, this.f1183b);
                } else if (index == 3) {
                    this.f1185d = obtainStyledAttributes.getFloat(index, this.f1185d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static SparseIntArray f1186n;

        /* renamed from: a  reason: collision with root package name */
        public float f1187a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1188b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1189c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1190d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1191e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1192f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f1193g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1194h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f1195i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f1196j = 0.0f;
        public float k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1197l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f1198m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1186n = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1186n.append(7, 2);
            f1186n.append(8, 3);
            f1186n.append(4, 4);
            f1186n.append(5, 5);
            f1186n.append(0, 6);
            f1186n.append(1, 7);
            f1186n.append(2, 8);
            f1186n.append(3, 9);
            f1186n.append(9, 10);
            f1186n.append(10, 11);
            f1186n.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.c.f13195t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1186n.get(index)) {
                    case 1:
                        this.f1187a = obtainStyledAttributes.getFloat(index, this.f1187a);
                        break;
                    case 2:
                        this.f1188b = obtainStyledAttributes.getFloat(index, this.f1188b);
                        break;
                    case 3:
                        this.f1189c = obtainStyledAttributes.getFloat(index, this.f1189c);
                        break;
                    case 4:
                        this.f1190d = obtainStyledAttributes.getFloat(index, this.f1190d);
                        break;
                    case 5:
                        this.f1191e = obtainStyledAttributes.getFloat(index, this.f1191e);
                        break;
                    case 6:
                        this.f1192f = obtainStyledAttributes.getDimension(index, this.f1192f);
                        break;
                    case 7:
                        this.f1193g = obtainStyledAttributes.getDimension(index, this.f1193g);
                        break;
                    case 8:
                        this.f1195i = obtainStyledAttributes.getDimension(index, this.f1195i);
                        break;
                    case 9:
                        this.f1196j = obtainStyledAttributes.getDimension(index, this.f1196j);
                        break;
                    case 10:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 11:
                        this.f1197l = true;
                        this.f1198m = obtainStyledAttributes.getDimension(index, this.f1198m);
                        break;
                    case 12:
                        this.f1194h = b.f(obtainStyledAttributes, index, this.f1194h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1112e.append(82, 25);
        f1112e.append(83, 26);
        f1112e.append(85, 29);
        f1112e.append(86, 30);
        f1112e.append(92, 36);
        f1112e.append(91, 35);
        f1112e.append(63, 4);
        f1112e.append(62, 3);
        f1112e.append(58, 1);
        f1112e.append(60, 91);
        f1112e.append(59, 92);
        f1112e.append(101, 6);
        f1112e.append(102, 7);
        f1112e.append(70, 17);
        f1112e.append(71, 18);
        f1112e.append(72, 19);
        f1112e.append(54, 99);
        f1112e.append(0, 27);
        f1112e.append(87, 32);
        f1112e.append(88, 33);
        f1112e.append(69, 10);
        f1112e.append(68, 9);
        f1112e.append(106, 13);
        f1112e.append(109, 16);
        f1112e.append(107, 14);
        f1112e.append(104, 11);
        f1112e.append(108, 15);
        f1112e.append(105, 12);
        f1112e.append(95, 40);
        f1112e.append(80, 39);
        f1112e.append(79, 41);
        f1112e.append(94, 42);
        f1112e.append(78, 20);
        f1112e.append(93, 37);
        f1112e.append(67, 5);
        f1112e.append(81, 87);
        f1112e.append(90, 87);
        f1112e.append(84, 87);
        f1112e.append(61, 87);
        f1112e.append(57, 87);
        f1112e.append(5, 24);
        f1112e.append(7, 28);
        f1112e.append(23, 31);
        f1112e.append(24, 8);
        f1112e.append(6, 34);
        f1112e.append(8, 2);
        f1112e.append(3, 23);
        f1112e.append(4, 21);
        f1112e.append(96, 95);
        f1112e.append(73, 96);
        f1112e.append(2, 22);
        f1112e.append(13, 43);
        f1112e.append(26, 44);
        f1112e.append(21, 45);
        f1112e.append(22, 46);
        f1112e.append(20, 60);
        f1112e.append(18, 47);
        f1112e.append(19, 48);
        f1112e.append(14, 49);
        f1112e.append(15, 50);
        f1112e.append(16, 51);
        f1112e.append(17, 52);
        f1112e.append(25, 53);
        f1112e.append(97, 54);
        f1112e.append(74, 55);
        f1112e.append(98, 56);
        f1112e.append(75, 57);
        f1112e.append(99, 58);
        f1112e.append(76, 59);
        f1112e.append(64, 61);
        f1112e.append(66, 62);
        f1112e.append(65, 63);
        f1112e.append(28, 64);
        f1112e.append(121, 65);
        f1112e.append(35, 66);
        f1112e.append(122, 67);
        f1112e.append(113, 79);
        f1112e.append(1, 38);
        f1112e.append(112, 68);
        f1112e.append(100, 69);
        f1112e.append(77, 70);
        f1112e.append(111, 97);
        f1112e.append(32, 71);
        f1112e.append(30, 72);
        f1112e.append(31, 73);
        f1112e.append(33, 74);
        f1112e.append(29, 75);
        f1112e.append(114, 76);
        f1112e.append(89, 77);
        f1112e.append(123, 78);
        f1112e.append(56, 80);
        f1112e.append(55, 81);
        f1112e.append(116, 82);
        f1112e.append(120, 83);
        f1112e.append(119, 84);
        f1112e.append(118, 85);
        f1112e.append(117, 86);
        f1113f.append(85, 6);
        f1113f.append(85, 7);
        f1113f.append(0, 27);
        f1113f.append(89, 13);
        f1113f.append(92, 16);
        f1113f.append(90, 14);
        f1113f.append(87, 11);
        f1113f.append(91, 15);
        f1113f.append(88, 12);
        f1113f.append(78, 40);
        f1113f.append(71, 39);
        f1113f.append(70, 41);
        f1113f.append(77, 42);
        f1113f.append(69, 20);
        f1113f.append(76, 37);
        f1113f.append(60, 5);
        f1113f.append(72, 87);
        f1113f.append(75, 87);
        f1113f.append(73, 87);
        f1113f.append(57, 87);
        f1113f.append(56, 87);
        f1113f.append(5, 24);
        f1113f.append(7, 28);
        f1113f.append(23, 31);
        f1113f.append(24, 8);
        f1113f.append(6, 34);
        f1113f.append(8, 2);
        f1113f.append(3, 23);
        f1113f.append(4, 21);
        f1113f.append(79, 95);
        f1113f.append(64, 96);
        f1113f.append(2, 22);
        f1113f.append(13, 43);
        f1113f.append(26, 44);
        f1113f.append(21, 45);
        f1113f.append(22, 46);
        f1113f.append(20, 60);
        f1113f.append(18, 47);
        f1113f.append(19, 48);
        f1113f.append(14, 49);
        f1113f.append(15, 50);
        f1113f.append(16, 51);
        f1113f.append(17, 52);
        f1113f.append(25, 53);
        f1113f.append(80, 54);
        f1113f.append(65, 55);
        f1113f.append(81, 56);
        f1113f.append(66, 57);
        f1113f.append(82, 58);
        f1113f.append(67, 59);
        f1113f.append(59, 62);
        f1113f.append(58, 63);
        f1113f.append(28, 64);
        f1113f.append(105, 65);
        f1113f.append(34, 66);
        f1113f.append(106, 67);
        f1113f.append(96, 79);
        f1113f.append(1, 38);
        f1113f.append(97, 98);
        f1113f.append(95, 68);
        f1113f.append(83, 69);
        f1113f.append(68, 70);
        f1113f.append(32, 71);
        f1113f.append(30, 72);
        f1113f.append(31, 73);
        f1113f.append(33, 74);
        f1113f.append(29, 75);
        f1113f.append(98, 76);
        f1113f.append(74, 77);
        f1113f.append(107, 78);
        f1113f.append(55, 80);
        f1113f.append(54, 81);
        f1113f.append(100, 82);
        f1113f.append(104, 83);
        f1113f.append(103, 84);
        f1113f.append(102, 85);
        f1113f.append(101, 86);
        f1113f.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int i10;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Integer num = null;
            try {
                i10 = t.d.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1052m) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f1052m.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i10 = num.intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ec, code lost:
        r7 = r13.getLayoutDimension(r11, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ff, code lost:
        r7 = r13.getFloat(r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0303, code lost:
        r9.a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0352, code lost:
        r12 = r6;
        r7 = r13.getDimensionPixelOffset(r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0359, code lost:
        r9.c(r6, r13.getString(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0366, code lost:
        r6 = r13.getDimensionPixelSize(r11, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x036a, code lost:
        r12 = r7;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x036c, code lost:
        r9.b(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0370, code lost:
        r6.append(r7);
        r6.append(java.lang.Integer.toHexString(r11));
        r6.append("   ");
        r6.append(f1112e.get(r11));
        android.util.Log.w("ConstraintSet", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x038d, code lost:
        r8 = r8 + 1;
        r6 = 3;
        r7 = 1;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03cb, code lost:
        r8.append(java.lang.Integer.toHexString(r7));
        r8.append("   ");
        r8.append(f1112e.get(r7));
        android.util.Log.w("ConstraintSet", r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03fa, code lost:
        g(r8, r13, r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x057c, code lost:
        r8.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x087f, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
        r12 = r6;
        r7 = r13.getInteger(r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0161, code lost:
        r9.d(r7, r13.getBoolean(r11, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0188, code lost:
        r7 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c5, code lost:
        r12 = r6;
        r7 = f(r13, r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0261, code lost:
        r7 = r13.getDimension(r11, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02be, code lost:
        r6 = r13.getInt(r11, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.constraintlayout.widget.b.a d(android.content.Context r13, android.util.AttributeSet r14, boolean r15) {
        /*
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a
            r0.<init>()
            if (r15 == 0) goto L_0x000a
            int[] r1 = z5.c.f13187l
            goto L_0x000c
        L_0x000a:
            int[] r1 = z5.c.f13186j
        L_0x000c:
            android.content.res.TypedArray r13 = r13.obtainStyledAttributes(r14, r1)
            java.lang.String r14 = "/"
            java.lang.String r1 = "unused attribute 0x"
            java.lang.String r2 = "CURRENTLY UNSUPPORTED"
            java.lang.String r3 = "Unknown attribute 0x"
            java.lang.String r4 = "   "
            java.lang.String r5 = "ConstraintSet"
            r6 = 3
            r7 = 1
            r8 = 0
            if (r15 == 0) goto L_0x0394
            int r15 = r13.getIndexCount()
            androidx.constraintlayout.widget.b$a$a r9 = new androidx.constraintlayout.widget.b$a$a
            r9.<init>()
            androidx.constraintlayout.widget.b$c r10 = r0.f1119c
            r10.getClass()
            androidx.constraintlayout.widget.b$b r10 = r0.f1120d
            r10.getClass()
            androidx.constraintlayout.widget.b$d r10 = r0.f1118b
            r10.getClass()
            androidx.constraintlayout.widget.b$e r10 = r0.f1121e
            r10.getClass()
            r10 = r8
        L_0x003f:
            if (r8 >= r15) goto L_0x088c
            int r11 = r13.getIndex(r8)
            android.util.SparseIntArray r12 = f1113f
            int r12 = r12.get(r11)
            switch(r12) {
                case 2: goto L_0x0361;
                case 3: goto L_0x004e;
                case 4: goto L_0x004e;
                case 5: goto L_0x0358;
                case 6: goto L_0x034d;
                case 7: goto L_0x0347;
                case 8: goto L_0x0340;
                case 9: goto L_0x004e;
                case 10: goto L_0x004e;
                case 11: goto L_0x0339;
                case 12: goto L_0x0332;
                case 13: goto L_0x032b;
                case 14: goto L_0x0324;
                case 15: goto L_0x031d;
                case 16: goto L_0x0316;
                case 17: goto L_0x030f;
                case 18: goto L_0x0308;
                case 19: goto L_0x02f9;
                case 20: goto L_0x02f2;
                case 21: goto L_0x02e4;
                case 22: goto L_0x02d4;
                case 23: goto L_0x02cc;
                case 24: goto L_0x02c4;
                case 25: goto L_0x004e;
                case 26: goto L_0x004e;
                case 27: goto L_0x02b8;
                case 28: goto L_0x02b0;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x02a8;
                case 32: goto L_0x004e;
                case 33: goto L_0x004e;
                case 34: goto L_0x02a0;
                case 35: goto L_0x004e;
                case 36: goto L_0x004e;
                case 37: goto L_0x0299;
                case 38: goto L_0x028d;
                case 39: goto L_0x0285;
                case 40: goto L_0x027d;
                case 41: goto L_0x0276;
                case 42: goto L_0x026f;
                case 43: goto L_0x0267;
                case 44: goto L_0x0257;
                case 45: goto L_0x024f;
                case 46: goto L_0x0247;
                case 47: goto L_0x023f;
                case 48: goto L_0x0237;
                case 49: goto L_0x0230;
                case 50: goto L_0x0229;
                case 51: goto L_0x0222;
                case 52: goto L_0x021b;
                case 53: goto L_0x0214;
                case 54: goto L_0x020c;
                case 55: goto L_0x0204;
                case 56: goto L_0x01fc;
                case 57: goto L_0x01f4;
                case 58: goto L_0x01ec;
                case 59: goto L_0x01e4;
                case 60: goto L_0x01dc;
                case 61: goto L_0x004e;
                case 62: goto L_0x01d4;
                case 63: goto L_0x01cc;
                case 64: goto L_0x01bf;
                case 65: goto L_0x01a1;
                case 66: goto L_0x019c;
                case 67: goto L_0x0194;
                case 68: goto L_0x018c;
                case 69: goto L_0x0186;
                case 70: goto L_0x0183;
                case 71: goto L_0x017e;
                case 72: goto L_0x0176;
                case 73: goto L_0x016e;
                case 74: goto L_0x016a;
                case 75: goto L_0x015b;
                case 76: goto L_0x0153;
                case 77: goto L_0x014f;
                case 78: goto L_0x0147;
                case 79: goto L_0x013f;
                case 80: goto L_0x0138;
                case 81: goto L_0x0131;
                case 82: goto L_0x0124;
                case 83: goto L_0x011c;
                case 84: goto L_0x0115;
                case 85: goto L_0x010d;
                case 86: goto L_0x00a1;
                case 87: goto L_0x0099;
                case 88: goto L_0x004e;
                case 89: goto L_0x004e;
                case 90: goto L_0x004e;
                case 91: goto L_0x004e;
                case 92: goto L_0x004e;
                case 93: goto L_0x0091;
                case 94: goto L_0x0089;
                case 95: goto L_0x0084;
                case 96: goto L_0x007f;
                case 97: goto L_0x0077;
                case 98: goto L_0x005e;
                case 99: goto L_0x0056;
                default: goto L_0x004e;
            }
        L_0x004e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r3
            goto L_0x0370
        L_0x0056:
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            boolean r6 = r6.f1146g
            r7 = 99
            goto L_0x0161
        L_0x005e:
            int r7 = s.d.K
            android.util.TypedValue r7 = r13.peekValue(r11)
            int r7 = r7.type
            if (r7 != r6) goto L_0x006d
            r13.getString(r11)
            goto L_0x038d
        L_0x006d:
            int r6 = r0.f1117a
            int r6 = r13.getResourceId(r11, r6)
            r0.f1117a = r6
            goto L_0x038d
        L_0x0077:
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.f1162o0
            r7 = 97
            goto L_0x02be
        L_0x007f:
            g(r9, r13, r11, r7)
            goto L_0x038d
        L_0x0084:
            g(r9, r13, r11, r10)
            goto L_0x038d
        L_0x0089:
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.S
            r7 = 94
            goto L_0x0366
        L_0x0091:
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.L
            r7 = 93
            goto L_0x0366
        L_0x0099:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r1
            goto L_0x0370
        L_0x00a1:
            android.util.TypedValue r6 = r13.peekValue(r11)
            int r6 = r6.type
            r10 = 89
            r12 = 88
            if (r6 != r7) goto L_0x00c4
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            r7 = -1
            int r11 = r13.getResourceId(r11, r7)
            r6.f1181j = r11
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            int r6 = r6.f1181j
            r9.b(r10, r6)
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            int r10 = r6.f1181j
            if (r10 == r7) goto L_0x038d
            goto L_0x00f4
        L_0x00c4:
            r7 = 3
            if (r6 != r7) goto L_0x00fd
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            java.lang.String r7 = r13.getString(r11)
            r6.f1179h = r7
            r6 = 90
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            java.lang.String r7 = r7.f1179h
            r9.c(r6, r7)
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            java.lang.String r6 = r6.f1179h
            int r6 = r6.indexOf(r14)
            if (r6 <= 0) goto L_0x00f6
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            r7 = -1
            int r7 = r13.getResourceId(r11, r7)
            r6.f1181j = r7
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            int r6 = r6.f1181j
            r9.b(r10, r6)
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
        L_0x00f4:
            r7 = -2
            goto L_0x00f9
        L_0x00f6:
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            r7 = -1
        L_0x00f9:
            r6.f1180i = r7
            goto L_0x036c
        L_0x00fd:
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            int r7 = r6.f1181j
            int r7 = r13.getInteger(r11, r7)
            r6.f1180i = r7
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            int r7 = r6.f1180i
            goto L_0x036c
        L_0x010d:
            r6 = 85
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            float r7 = r7.f1177f
            goto L_0x02ff
        L_0x0115:
            r6 = 84
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            int r7 = r7.f1178g
            goto L_0x012a
        L_0x011c:
            r6 = 83
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            int r7 = r7.f1194h
            goto L_0x01c5
        L_0x0124:
            r6 = 82
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            int r7 = r7.f1173b
        L_0x012a:
            r12 = r6
            int r7 = r13.getInteger(r11, r7)
            goto L_0x036c
        L_0x0131:
            r7 = 81
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            boolean r6 = r6.f1158m0
            goto L_0x0161
        L_0x0138:
            r7 = 80
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            boolean r6 = r6.f1156l0
            goto L_0x0161
        L_0x013f:
            r6 = 79
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            float r7 = r7.f1175d
            goto L_0x02ff
        L_0x0147:
            r7 = 78
            androidx.constraintlayout.widget.b$d r6 = r0.f1118b
            int r6 = r6.f1183b
            goto L_0x02be
        L_0x014f:
            r6 = 77
            goto L_0x0359
        L_0x0153:
            r7 = 76
            androidx.constraintlayout.widget.b$c r6 = r0.f1119c
            int r6 = r6.f1174c
            goto L_0x02be
        L_0x015b:
            r7 = 75
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            boolean r6 = r6.f1160n0
        L_0x0161:
            boolean r6 = r13.getBoolean(r11, r6)
            r9.d(r7, r6)
            goto L_0x038d
        L_0x016a:
            r6 = 74
            goto L_0x0359
        L_0x016e:
            r7 = 73
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.f1147g0
            goto L_0x0366
        L_0x0176:
            r7 = 72
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.f1145f0
            goto L_0x02be
        L_0x017e:
            android.util.Log.e(r5, r2)
            goto L_0x038d
        L_0x0183:
            r6 = 70
            goto L_0x0188
        L_0x0186:
            r6 = 69
        L_0x0188:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02ff
        L_0x018c:
            r6 = 68
            androidx.constraintlayout.widget.b$d r7 = r0.f1118b
            float r7 = r7.f1185d
            goto L_0x02ff
        L_0x0194:
            r6 = 67
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            float r7 = r7.f1176e
            goto L_0x02ff
        L_0x019c:
            r7 = 66
            r6 = 0
            goto L_0x02be
        L_0x01a1:
            android.util.TypedValue r6 = r13.peekValue(r11)
            int r6 = r6.type
            r7 = 65
            r10 = 3
            if (r6 != r10) goto L_0x01b1
            java.lang.String r6 = r13.getString(r11)
            goto L_0x01ba
        L_0x01b1:
            java.lang.String[] r6 = p.a.f10642b
            r10 = 0
            int r10 = r13.getInteger(r11, r10)
            r6 = r6[r10]
        L_0x01ba:
            r9.c(r7, r6)
            goto L_0x038d
        L_0x01bf:
            r6 = 64
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            int r7 = r7.f1172a
        L_0x01c5:
            r12 = r6
            int r7 = f(r13, r11, r7)
            goto L_0x036c
        L_0x01cc:
            r6 = 63
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            float r7 = r7.B
            goto L_0x02ff
        L_0x01d4:
            r7 = 62
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.A
            goto L_0x0366
        L_0x01dc:
            r6 = 60
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1187a
            goto L_0x02ff
        L_0x01e4:
            r7 = 59
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.f1139c0
            goto L_0x0366
        L_0x01ec:
            r7 = 58
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.f1137b0
            goto L_0x0366
        L_0x01f4:
            r7 = 57
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.f1135a0
            goto L_0x0366
        L_0x01fc:
            r7 = 56
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.Z
            goto L_0x0366
        L_0x0204:
            r7 = 55
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.Y
            goto L_0x02be
        L_0x020c:
            r7 = 54
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.X
            goto L_0x02be
        L_0x0214:
            r6 = 53
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.k
            goto L_0x0261
        L_0x021b:
            r6 = 52
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1196j
            goto L_0x0261
        L_0x0222:
            r6 = 51
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1195i
            goto L_0x0261
        L_0x0229:
            r6 = 50
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1193g
            goto L_0x0261
        L_0x0230:
            r6 = 49
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1192f
            goto L_0x0261
        L_0x0237:
            r6 = 48
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1191e
            goto L_0x02ff
        L_0x023f:
            r6 = 47
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1190d
            goto L_0x02ff
        L_0x0247:
            r6 = 46
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1189c
            goto L_0x02ff
        L_0x024f:
            r6 = 45
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1188b
            goto L_0x02ff
        L_0x0257:
            r6 = 44
            r7 = 1
            r9.d(r6, r7)
            androidx.constraintlayout.widget.b$e r7 = r0.f1121e
            float r7 = r7.f1198m
        L_0x0261:
            float r7 = r13.getDimension(r11, r7)
            goto L_0x0303
        L_0x0267:
            r6 = 43
            androidx.constraintlayout.widget.b$d r7 = r0.f1118b
            float r7 = r7.f1184c
            goto L_0x02ff
        L_0x026f:
            r7 = 42
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.W
            goto L_0x02be
        L_0x0276:
            r7 = 41
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.V
            goto L_0x02be
        L_0x027d:
            r6 = 40
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            float r7 = r7.T
            goto L_0x02ff
        L_0x0285:
            r6 = 39
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            float r7 = r7.U
            goto L_0x02ff
        L_0x028d:
            int r6 = r0.f1117a
            int r7 = r13.getResourceId(r11, r6)
            r0.f1117a = r7
            r12 = 38
            goto L_0x036c
        L_0x0299:
            r6 = 37
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            float r7 = r7.f1169x
            goto L_0x02ff
        L_0x02a0:
            r7 = 34
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.H
            goto L_0x0366
        L_0x02a8:
            r7 = 31
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.K
            goto L_0x0366
        L_0x02b0:
            r7 = 28
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.G
            goto L_0x0366
        L_0x02b8:
            r7 = 27
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.E
        L_0x02be:
            int r6 = r13.getInt(r11, r6)
            goto L_0x036a
        L_0x02c4:
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.F
            r7 = 24
            goto L_0x0366
        L_0x02cc:
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.f1136b
            r7 = 23
            r12 = r7
            goto L_0x02ec
        L_0x02d4:
            r12 = 22
            int[] r6 = f1111d
            androidx.constraintlayout.widget.b$d r7 = r0.f1118b
            int r7 = r7.f1182a
            int r7 = r13.getInt(r11, r7)
            r7 = r6[r7]
            goto L_0x036c
        L_0x02e4:
            r6 = 21
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            int r7 = r7.f1138c
            r12 = r6
            r6 = r7
        L_0x02ec:
            int r7 = r13.getLayoutDimension(r11, r6)
            goto L_0x036c
        L_0x02f2:
            r6 = 20
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            float r7 = r7.w
            goto L_0x02ff
        L_0x02f9:
            r6 = 19
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            float r7 = r7.f1144f
        L_0x02ff:
            float r7 = r13.getFloat(r11, r7)
        L_0x0303:
            r9.a(r6, r7)
            goto L_0x038d
        L_0x0308:
            r6 = 18
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            int r7 = r7.f1142e
            goto L_0x0352
        L_0x030f:
            r6 = 17
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            int r7 = r7.f1140d
            goto L_0x0352
        L_0x0316:
            r7 = 16
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.N
            goto L_0x0366
        L_0x031d:
            r7 = 15
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.R
            goto L_0x0366
        L_0x0324:
            r7 = 14
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.O
            goto L_0x0366
        L_0x032b:
            r7 = 13
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.M
            goto L_0x0366
        L_0x0332:
            r7 = 12
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.Q
            goto L_0x0366
        L_0x0339:
            r7 = 11
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.P
            goto L_0x0366
        L_0x0340:
            r7 = 8
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.J
            goto L_0x0366
        L_0x0347:
            r6 = 7
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            int r7 = r7.D
            goto L_0x0352
        L_0x034d:
            r6 = 6
            androidx.constraintlayout.widget.b$b r7 = r0.f1120d
            int r7 = r7.C
        L_0x0352:
            r12 = r6
            int r7 = r13.getDimensionPixelOffset(r11, r7)
            goto L_0x036c
        L_0x0358:
            r6 = 5
        L_0x0359:
            java.lang.String r7 = r13.getString(r11)
            r9.c(r6, r7)
            goto L_0x038d
        L_0x0361:
            r7 = 2
            androidx.constraintlayout.widget.b$b r6 = r0.f1120d
            int r6 = r6.I
        L_0x0366:
            int r6 = r13.getDimensionPixelSize(r11, r6)
        L_0x036a:
            r12 = r7
            r7 = r6
        L_0x036c:
            r9.b(r12, r7)
            goto L_0x038d
        L_0x0370:
            r6.append(r7)
            java.lang.String r7 = java.lang.Integer.toHexString(r11)
            r6.append(r7)
            r6.append(r4)
            android.util.SparseIntArray r7 = f1112e
            int r7 = r7.get(r11)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
        L_0x038d:
            int r8 = r8 + 1
            r6 = 3
            r7 = 1
            r10 = 0
            goto L_0x003f
        L_0x0394:
            int r15 = r13.getIndexCount()
            r6 = 0
        L_0x0399:
            if (r6 >= r15) goto L_0x0883
            int r7 = r13.getIndex(r6)
            r8 = 1
            if (r7 == r8) goto L_0x03be
            r8 = 23
            r9 = 24
            if (r8 == r7) goto L_0x03be
            if (r9 == r7) goto L_0x03be
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            r8.getClass()
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            r8.getClass()
            androidx.constraintlayout.widget.b$d r8 = r0.f1118b
            r8.getClass()
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            r8.getClass()
        L_0x03be:
            android.util.SparseIntArray r8 = f1112e
            int r8 = r8.get(r7)
            switch(r8) {
                case 1: goto L_0x0875;
                case 2: goto L_0x086a;
                case 3: goto L_0x085f;
                case 4: goto L_0x0854;
                case 5: goto L_0x084b;
                case 6: goto L_0x0840;
                case 7: goto L_0x0835;
                case 8: goto L_0x082a;
                case 9: goto L_0x081f;
                case 10: goto L_0x0814;
                case 11: goto L_0x0808;
                case 12: goto L_0x07fc;
                case 13: goto L_0x07f0;
                case 14: goto L_0x07e4;
                case 15: goto L_0x07d8;
                case 16: goto L_0x07cc;
                case 17: goto L_0x07c0;
                case 18: goto L_0x07b4;
                case 19: goto L_0x07a8;
                case 20: goto L_0x079c;
                case 21: goto L_0x0790;
                case 22: goto L_0x077a;
                case 23: goto L_0x076e;
                case 24: goto L_0x0762;
                case 25: goto L_0x0756;
                case 26: goto L_0x074a;
                case 27: goto L_0x073e;
                case 28: goto L_0x0732;
                case 29: goto L_0x0726;
                case 30: goto L_0x071a;
                case 31: goto L_0x070e;
                case 32: goto L_0x0702;
                case 33: goto L_0x06f6;
                case 34: goto L_0x06ea;
                case 35: goto L_0x06de;
                case 36: goto L_0x06d2;
                case 37: goto L_0x06c6;
                case 38: goto L_0x06bc;
                case 39: goto L_0x06b0;
                case 40: goto L_0x06a4;
                case 41: goto L_0x0698;
                case 42: goto L_0x068c;
                case 43: goto L_0x0680;
                case 44: goto L_0x0671;
                case 45: goto L_0x0665;
                case 46: goto L_0x0659;
                case 47: goto L_0x064d;
                case 48: goto L_0x0641;
                case 49: goto L_0x0635;
                case 50: goto L_0x0629;
                case 51: goto L_0x061d;
                case 52: goto L_0x0611;
                case 53: goto L_0x0605;
                case 54: goto L_0x05f9;
                case 55: goto L_0x05ed;
                case 56: goto L_0x05e1;
                case 57: goto L_0x05d5;
                case 58: goto L_0x05c9;
                case 59: goto L_0x05bd;
                case 60: goto L_0x05b1;
                case 61: goto L_0x05a5;
                case 62: goto L_0x0599;
                case 63: goto L_0x058d;
                case 64: goto L_0x0581;
                case 65: goto L_0x0562;
                case 66: goto L_0x055b;
                case 67: goto L_0x054f;
                case 68: goto L_0x0543;
                case 69: goto L_0x0537;
                case 70: goto L_0x052b;
                case 71: goto L_0x0526;
                case 72: goto L_0x051a;
                case 73: goto L_0x050e;
                case 74: goto L_0x0504;
                case 75: goto L_0x04f8;
                case 76: goto L_0x04ec;
                case 77: goto L_0x04e2;
                case 78: goto L_0x04d6;
                case 79: goto L_0x04ca;
                case 80: goto L_0x04be;
                case 81: goto L_0x04b2;
                case 82: goto L_0x04a6;
                case 83: goto L_0x049a;
                case 84: goto L_0x048e;
                case 85: goto L_0x0482;
                case 86: goto L_0x0434;
                case 87: goto L_0x042f;
                case 88: goto L_0x03c7;
                case 89: goto L_0x03c7;
                case 90: goto L_0x03c7;
                case 91: goto L_0x0423;
                case 92: goto L_0x0417;
                case 93: goto L_0x040b;
                case 94: goto L_0x03ff;
                case 95: goto L_0x03f7;
                case 96: goto L_0x03f3;
                case 97: goto L_0x03e7;
                default: goto L_0x03c7;
            }
        L_0x03c7:
            java.lang.StringBuilder r8 = androidx.activity.f.g(r3)
        L_0x03cb:
            java.lang.String r9 = java.lang.Integer.toHexString(r7)
            r8.append(r9)
            r8.append(r4)
            android.util.SparseIntArray r9 = f1112e
            int r7 = r9.get(r7)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r5, r7)
            goto L_0x087f
        L_0x03e7:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1162o0
            int r7 = r13.getInt(r7, r9)
            r8.f1162o0 = r7
            goto L_0x087f
        L_0x03f3:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            r9 = 1
            goto L_0x03fa
        L_0x03f7:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            r9 = 0
        L_0x03fa:
            g(r8, r13, r7, r9)
            goto L_0x087f
        L_0x03ff:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.S
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.S = r7
            goto L_0x087f
        L_0x040b:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.L
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.L = r7
            goto L_0x087f
        L_0x0417:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1165r
            int r7 = f(r13, r7, r9)
            r8.f1165r = r7
            goto L_0x087f
        L_0x0423:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1164q
            int r7 = f(r13, r7, r9)
            r8.f1164q = r7
            goto L_0x087f
        L_0x042f:
            java.lang.StringBuilder r8 = androidx.activity.f.g(r1)
            goto L_0x03cb
        L_0x0434:
            android.util.TypedValue r8 = r13.peekValue(r7)
            int r8 = r8.type
            r9 = 1
            if (r8 != r9) goto L_0x0451
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            r9 = -1
            int r7 = r13.getResourceId(r7, r9)
            r8.f1181j = r7
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            int r8 = r7.f1181j
            if (r8 == r9) goto L_0x087f
        L_0x044c:
            r8 = -2
            r7.f1180i = r8
            goto L_0x087f
        L_0x0451:
            r9 = 3
            if (r8 != r9) goto L_0x0476
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            java.lang.String r9 = r13.getString(r7)
            r8.f1179h = r9
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            java.lang.String r8 = r8.f1179h
            int r8 = r8.indexOf(r14)
            if (r8 <= 0) goto L_0x0472
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            r9 = -1
            int r7 = r13.getResourceId(r7, r9)
            r8.f1181j = r7
            androidx.constraintlayout.widget.b$c r7 = r0.f1119c
            goto L_0x044c
        L_0x0472:
            r7 = -1
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            goto L_0x047e
        L_0x0476:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            int r9 = r8.f1181j
            int r7 = r13.getInteger(r7, r9)
        L_0x047e:
            r8.f1180i = r7
            goto L_0x087f
        L_0x0482:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            float r9 = r8.f1177f
            float r7 = r13.getFloat(r7, r9)
            r8.f1177f = r7
            goto L_0x087f
        L_0x048e:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            int r9 = r8.f1178g
            int r7 = r13.getInteger(r7, r9)
            r8.f1178g = r7
            goto L_0x087f
        L_0x049a:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            int r9 = r8.f1194h
            int r7 = f(r13, r7, r9)
            r8.f1194h = r7
            goto L_0x087f
        L_0x04a6:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            int r9 = r8.f1173b
            int r7 = r13.getInteger(r7, r9)
            r8.f1173b = r7
            goto L_0x087f
        L_0x04b2:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            boolean r9 = r8.f1158m0
            boolean r7 = r13.getBoolean(r7, r9)
            r8.f1158m0 = r7
            goto L_0x087f
        L_0x04be:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            boolean r9 = r8.f1156l0
            boolean r7 = r13.getBoolean(r7, r9)
            r8.f1156l0 = r7
            goto L_0x087f
        L_0x04ca:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            float r9 = r8.f1175d
            float r7 = r13.getFloat(r7, r9)
            r8.f1175d = r7
            goto L_0x087f
        L_0x04d6:
            androidx.constraintlayout.widget.b$d r8 = r0.f1118b
            int r9 = r8.f1183b
            int r7 = r13.getInt(r7, r9)
            r8.f1183b = r7
            goto L_0x087f
        L_0x04e2:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            java.lang.String r7 = r13.getString(r7)
            r8.f1154k0 = r7
            goto L_0x087f
        L_0x04ec:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            int r9 = r8.f1174c
            int r7 = r13.getInt(r7, r9)
            r8.f1174c = r7
            goto L_0x087f
        L_0x04f8:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            boolean r9 = r8.f1160n0
            boolean r7 = r13.getBoolean(r7, r9)
            r8.f1160n0 = r7
            goto L_0x087f
        L_0x0504:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            java.lang.String r7 = r13.getString(r7)
            r8.f1153j0 = r7
            goto L_0x087f
        L_0x050e:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1147g0
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.f1147g0 = r7
            goto L_0x087f
        L_0x051a:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1145f0
            int r7 = r13.getInt(r7, r9)
            r8.f1145f0 = r7
            goto L_0x087f
        L_0x0526:
            android.util.Log.e(r5, r2)
            goto L_0x087f
        L_0x052b:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = r13.getFloat(r7, r9)
            r8.f1143e0 = r7
            goto L_0x087f
        L_0x0537:
            r8 = 1065353216(0x3f800000, float:1.0)
            androidx.constraintlayout.widget.b$b r9 = r0.f1120d
            float r7 = r13.getFloat(r7, r8)
            r9.f1141d0 = r7
            goto L_0x087f
        L_0x0543:
            androidx.constraintlayout.widget.b$d r8 = r0.f1118b
            float r9 = r8.f1185d
            float r7 = r13.getFloat(r7, r9)
            r8.f1185d = r7
            goto L_0x087f
        L_0x054f:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            float r9 = r8.f1176e
            float r7 = r13.getFloat(r7, r9)
            r8.f1176e = r7
            goto L_0x087f
        L_0x055b:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            r9 = 0
            r13.getInt(r7, r9)
            goto L_0x057c
        L_0x0562:
            android.util.TypedValue r8 = r13.peekValue(r7)
            int r8 = r8.type
            r9 = 3
            if (r8 != r9) goto L_0x0571
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            r13.getString(r7)
            goto L_0x057c
        L_0x0571:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            java.lang.String[] r9 = p.a.f10642b
            r10 = 0
            int r7 = r13.getInteger(r7, r10)
            r7 = r9[r7]
        L_0x057c:
            r8.getClass()
            goto L_0x087f
        L_0x0581:
            androidx.constraintlayout.widget.b$c r8 = r0.f1119c
            int r9 = r8.f1172a
            int r7 = f(r13, r7, r9)
            r8.f1172a = r7
            goto L_0x087f
        L_0x058d:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            float r9 = r8.B
            float r7 = r13.getFloat(r7, r9)
            r8.B = r7
            goto L_0x087f
        L_0x0599:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.A
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.A = r7
            goto L_0x087f
        L_0x05a5:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1171z
            int r7 = f(r13, r7, r9)
            r8.f1171z = r7
            goto L_0x087f
        L_0x05b1:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1187a
            float r7 = r13.getFloat(r7, r9)
            r8.f1187a = r7
            goto L_0x087f
        L_0x05bd:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1139c0
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.f1139c0 = r7
            goto L_0x087f
        L_0x05c9:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1137b0
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.f1137b0 = r7
            goto L_0x087f
        L_0x05d5:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1135a0
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.f1135a0 = r7
            goto L_0x087f
        L_0x05e1:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.Z
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.Z = r7
            goto L_0x087f
        L_0x05ed:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.Y
            int r7 = r13.getInt(r7, r9)
            r8.Y = r7
            goto L_0x087f
        L_0x05f9:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.X
            int r7 = r13.getInt(r7, r9)
            r8.X = r7
            goto L_0x087f
        L_0x0605:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.k
            float r7 = r13.getDimension(r7, r9)
            r8.k = r7
            goto L_0x087f
        L_0x0611:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1196j
            float r7 = r13.getDimension(r7, r9)
            r8.f1196j = r7
            goto L_0x087f
        L_0x061d:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1195i
            float r7 = r13.getDimension(r7, r9)
            r8.f1195i = r7
            goto L_0x087f
        L_0x0629:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1193g
            float r7 = r13.getDimension(r7, r9)
            r8.f1193g = r7
            goto L_0x087f
        L_0x0635:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1192f
            float r7 = r13.getDimension(r7, r9)
            r8.f1192f = r7
            goto L_0x087f
        L_0x0641:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1191e
            float r7 = r13.getFloat(r7, r9)
            r8.f1191e = r7
            goto L_0x087f
        L_0x064d:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1190d
            float r7 = r13.getFloat(r7, r9)
            r8.f1190d = r7
            goto L_0x087f
        L_0x0659:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1189c
            float r7 = r13.getFloat(r7, r9)
            r8.f1189c = r7
            goto L_0x087f
        L_0x0665:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            float r9 = r8.f1188b
            float r7 = r13.getFloat(r7, r9)
            r8.f1188b = r7
            goto L_0x087f
        L_0x0671:
            androidx.constraintlayout.widget.b$e r8 = r0.f1121e
            r9 = 1
            r8.f1197l = r9
            float r9 = r8.f1198m
            float r7 = r13.getDimension(r7, r9)
            r8.f1198m = r7
            goto L_0x087f
        L_0x0680:
            androidx.constraintlayout.widget.b$d r8 = r0.f1118b
            float r9 = r8.f1184c
            float r7 = r13.getFloat(r7, r9)
            r8.f1184c = r7
            goto L_0x087f
        L_0x068c:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.W
            int r7 = r13.getInt(r7, r9)
            r8.W = r7
            goto L_0x087f
        L_0x0698:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.V
            int r7 = r13.getInt(r7, r9)
            r8.V = r7
            goto L_0x087f
        L_0x06a4:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            float r9 = r8.T
            float r7 = r13.getFloat(r7, r9)
            r8.T = r7
            goto L_0x087f
        L_0x06b0:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            float r9 = r8.U
            float r7 = r13.getFloat(r7, r9)
            r8.U = r7
            goto L_0x087f
        L_0x06bc:
            int r8 = r0.f1117a
            int r7 = r13.getResourceId(r7, r8)
            r0.f1117a = r7
            goto L_0x087f
        L_0x06c6:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            float r9 = r8.f1169x
            float r7 = r13.getFloat(r7, r9)
            r8.f1169x = r7
            goto L_0x087f
        L_0x06d2:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1155l
            int r7 = f(r13, r7, r9)
            r8.f1155l = r7
            goto L_0x087f
        L_0x06de:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1157m
            int r7 = f(r13, r7, r9)
            r8.f1157m = r7
            goto L_0x087f
        L_0x06ea:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.H
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.H = r7
            goto L_0x087f
        L_0x06f6:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1167t
            int r7 = f(r13, r7, r9)
            r8.f1167t = r7
            goto L_0x087f
        L_0x0702:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1166s
            int r7 = f(r13, r7, r9)
            r8.f1166s = r7
            goto L_0x087f
        L_0x070e:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.K
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.K = r7
            goto L_0x087f
        L_0x071a:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.k
            int r7 = f(r13, r7, r9)
            r8.k = r7
            goto L_0x087f
        L_0x0726:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1152j
            int r7 = f(r13, r7, r9)
            r8.f1152j = r7
            goto L_0x087f
        L_0x0732:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.G
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.G = r7
            goto L_0x087f
        L_0x073e:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.E
            int r7 = r13.getInt(r7, r9)
            r8.E = r7
            goto L_0x087f
        L_0x074a:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1150i
            int r7 = f(r13, r7, r9)
            r8.f1150i = r7
            goto L_0x087f
        L_0x0756:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1148h
            int r7 = f(r13, r7, r9)
            r8.f1148h = r7
            goto L_0x087f
        L_0x0762:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.F
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.F = r7
            goto L_0x087f
        L_0x076e:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1136b
            int r7 = r13.getLayoutDimension(r7, r9)
            r8.f1136b = r7
            goto L_0x087f
        L_0x077a:
            androidx.constraintlayout.widget.b$d r8 = r0.f1118b
            int r9 = r8.f1182a
            int r7 = r13.getInt(r7, r9)
            r8.f1182a = r7
            androidx.constraintlayout.widget.b$d r7 = r0.f1118b
            int[] r8 = f1111d
            int r9 = r7.f1182a
            r8 = r8[r9]
            r7.f1182a = r8
            goto L_0x087f
        L_0x0790:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1138c
            int r7 = r13.getLayoutDimension(r7, r9)
            r8.f1138c = r7
            goto L_0x087f
        L_0x079c:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            float r9 = r8.w
            float r7 = r13.getFloat(r7, r9)
            r8.w = r7
            goto L_0x087f
        L_0x07a8:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            float r9 = r8.f1144f
            float r7 = r13.getFloat(r7, r9)
            r8.f1144f = r7
            goto L_0x087f
        L_0x07b4:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1142e
            int r7 = r13.getDimensionPixelOffset(r7, r9)
            r8.f1142e = r7
            goto L_0x087f
        L_0x07c0:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1140d
            int r7 = r13.getDimensionPixelOffset(r7, r9)
            r8.f1140d = r7
            goto L_0x087f
        L_0x07cc:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.N
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.N = r7
            goto L_0x087f
        L_0x07d8:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.R
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.R = r7
            goto L_0x087f
        L_0x07e4:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.O
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.O = r7
            goto L_0x087f
        L_0x07f0:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.M
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.M = r7
            goto L_0x087f
        L_0x07fc:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.Q
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.Q = r7
            goto L_0x087f
        L_0x0808:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.P
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.P = r7
            goto L_0x087f
        L_0x0814:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.u
            int r7 = f(r13, r7, r9)
            r8.u = r7
            goto L_0x087f
        L_0x081f:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1168v
            int r7 = f(r13, r7, r9)
            r8.f1168v = r7
            goto L_0x087f
        L_0x082a:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.J
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.J = r7
            goto L_0x087f
        L_0x0835:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.D
            int r7 = r13.getDimensionPixelOffset(r7, r9)
            r8.D = r7
            goto L_0x087f
        L_0x0840:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.C
            int r7 = r13.getDimensionPixelOffset(r7, r9)
            r8.C = r7
            goto L_0x087f
        L_0x084b:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            java.lang.String r7 = r13.getString(r7)
            r8.f1170y = r7
            goto L_0x087f
        L_0x0854:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1159n
            int r7 = f(r13, r7, r9)
            r8.f1159n = r7
            goto L_0x087f
        L_0x085f:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1161o
            int r7 = f(r13, r7, r9)
            r8.f1161o = r7
            goto L_0x087f
        L_0x086a:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.I
            int r7 = r13.getDimensionPixelSize(r7, r9)
            r8.I = r7
            goto L_0x087f
        L_0x0875:
            androidx.constraintlayout.widget.b$b r8 = r0.f1120d
            int r9 = r8.f1163p
            int r7 = f(r13, r7, r9)
            r8.f1163p = r7
        L_0x087f:
            int r6 = r6 + 1
            goto L_0x0399
        L_0x0883:
            androidx.constraintlayout.widget.b$b r14 = r0.f1120d
            java.lang.String r15 = r14.f1153j0
            if (r15 == 0) goto L_0x088c
            r15 = 0
            r14.f1151i0 = r15
        L_0x088c:
            r13.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.d(android.content.Context, android.util.AttributeSet, boolean):androidx.constraintlayout.widget.b$a");
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006a
            r1 = -2
            if (r0 == r6) goto L_0x0029
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x0027
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r1) goto L_0x002d
            if (r9 == r5) goto L_0x002d
        L_0x0025:
            r4 = r7
            goto L_0x002f
        L_0x0027:
            r7 = r1
            goto L_0x002f
        L_0x0029:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002d:
            r4 = r7
            r7 = r9
        L_0x002f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r9 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x003c
            r8.width = r7
            r8.W = r4
            goto L_0x0069
        L_0x003c:
            r8.height = r7
            r8.X = r4
            goto L_0x0069
        L_0x0041:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.C0009b
            if (r9 == 0) goto L_0x0053
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0009b) r8
            if (r11 != 0) goto L_0x004e
            r8.f1136b = r7
            r8.f1156l0 = r4
            goto L_0x0069
        L_0x004e:
            r8.f1138c = r7
            r8.f1158m0 = r4
            goto L_0x0069
        L_0x0053:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0008a
            if (r9 == 0) goto L_0x0069
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0008a) r8
            if (r11 != 0) goto L_0x0061
            r8.b(r3, r7)
            r9 = 80
            goto L_0x0066
        L_0x0061:
            r8.b(r2, r7)
            r9 = 81
        L_0x0066:
            r8.d(r9, r4)
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0072
            goto L_0x016c
        L_0x0072:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x016c
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x016c
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x016c
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00c7
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r10 == 0) goto L_0x00b2
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x00ab
            r8.width = r7
            goto L_0x00ad
        L_0x00ab:
            r8.height = r7
        L_0x00ad:
            h(r8, r9)
            goto L_0x016c
        L_0x00b2:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0009b
            if (r10 == 0) goto L_0x00bc
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0009b) r8
            r8.f1170y = r9
            goto L_0x016c
        L_0x00bc:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0008a
            if (r10 == 0) goto L_0x016c
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0008a) r8
            r8.c(r6, r9)
            goto L_0x016c
        L_0x00c7:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0112
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016c }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x00e7
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x00e1
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00e1:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.I = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00e7:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0009b     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x00fb
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0009b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x00f5
            r8.f1136b = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.U = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00f5:
            r8.f1138c = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.T = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00fb:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0008a     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x016c
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0008a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0109
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 39
            goto L_0x010e
        L_0x0109:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 40
        L_0x010e:
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0112:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x016c
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016c }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x016c }
            r0 = 2
            if (r10 == 0) goto L_0x0140
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0139
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0139:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.S = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.M = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0140:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0009b     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x0156
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0009b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x014f
            r8.f1136b = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1141d0 = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.X = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x014f:
            r8.f1138c = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1143e0 = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.Y = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0156:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0008a     // Catch:{ NumberFormatException -> 0x016c }
            if (r9 == 0) goto L_0x016c
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0008a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0164
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r9 = 54
            goto L_0x0169
        L_0x0164:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r9 = 55
        L_0x0169:
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x016c }
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i10 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i10);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i10, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1116c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f1116c.containsKey(Integer.valueOf(id))) {
                StringBuilder g10 = f.g("id unknown ");
                g10.append(s.a.b(childAt));
                Log.w("ConstraintSet", g10.toString());
            } else if (this.f1115b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1116c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f1116c.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f1120d.f1149h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f1120d.f1145f0);
                            barrier.setMargin(aVar.f1120d.f1147g0);
                            barrier.setAllowsGoneWidget(aVar.f1120d.f1160n0);
                            C0009b bVar = aVar.f1120d;
                            int[] iArr = bVar.f1151i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1153j0;
                                if (str != null) {
                                    bVar.f1151i0 = c(barrier, str);
                                    barrier.setReferencedIds(aVar.f1120d.f1151i0);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        t.a.b(childAt, aVar.f1122f);
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.f1118b;
                        if (dVar.f1183b == 0) {
                            childAt.setVisibility(dVar.f1182a);
                        }
                        childAt.setAlpha(aVar.f1118b.f1184c);
                        childAt.setRotation(aVar.f1121e.f1187a);
                        childAt.setRotationX(aVar.f1121e.f1188b);
                        childAt.setRotationY(aVar.f1121e.f1189c);
                        childAt.setScaleX(aVar.f1121e.f1190d);
                        childAt.setScaleY(aVar.f1121e.f1191e);
                        e eVar = aVar.f1121e;
                        if (eVar.f1194h != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1121e.f1194h);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1192f)) {
                                childAt.setPivotX(aVar.f1121e.f1192f);
                            }
                            if (!Float.isNaN(aVar.f1121e.f1193g)) {
                                childAt.setPivotY(aVar.f1121e.f1193g);
                            }
                        }
                        childAt.setTranslationX(aVar.f1121e.f1195i);
                        childAt.setTranslationY(aVar.f1121e.f1196j);
                        childAt.setTranslationZ(aVar.f1121e.k);
                        e eVar2 = aVar.f1121e;
                        if (eVar2.f1197l) {
                            childAt.setElevation(eVar2.f1198m);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f1116c.get(num);
            if (aVar3 != null) {
                if (aVar3.f1120d.f1149h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0009b bVar2 = aVar3.f1120d;
                    int[] iArr2 = bVar2.f1151i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f1153j0;
                        if (str2 != null) {
                            bVar2.f1151i0 = c(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f1120d.f1151i0);
                        }
                    }
                    barrier2.setType(aVar3.f1120d.f1145f0);
                    barrier2.setMargin(aVar3.f1120d.f1147g0);
                    t.e eVar3 = ConstraintLayout.f1040p;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (aVar3.f1120d.f1134a) {
                    d dVar2 = new d(constraintLayout.getContext());
                    dVar2.setId(num.intValue());
                    t.e eVar4 = ConstraintLayout.f1040p;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(dVar2, aVar5);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof a) {
                ((a) childAt2).g(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        t.a aVar;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        bVar.f1116c.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f1115b || id != -1) {
                if (!bVar.f1116c.containsKey(Integer.valueOf(id))) {
                    bVar.f1116c.put(Integer.valueOf(id), new a());
                }
                a aVar3 = bVar.f1116c.get(Integer.valueOf(id));
                if (aVar3 != null) {
                    HashMap<String, t.a> hashMap = bVar.f1114a;
                    HashMap<String, t.a> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        t.a aVar4 = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                aVar = new t.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            } else {
                                try {
                                    aVar = new t.a(aVar4, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0]));
                                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                                    e = e10;
                                    e.printStackTrace();
                                }
                            }
                            hashMap2.put(next, aVar);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                            e = e11;
                            e.printStackTrace();
                        }
                    }
                    aVar3.f1122f = hashMap2;
                    aVar3.b(id, aVar2);
                    aVar3.f1118b.f1182a = childAt.getVisibility();
                    aVar3.f1118b.f1184c = childAt.getAlpha();
                    aVar3.f1121e.f1187a = childAt.getRotation();
                    aVar3.f1121e.f1188b = childAt.getRotationX();
                    aVar3.f1121e.f1189c = childAt.getRotationY();
                    aVar3.f1121e.f1190d = childAt.getScaleX();
                    aVar3.f1121e.f1191e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar3.f1121e;
                        eVar.f1192f = pivotX;
                        eVar.f1193g = pivotY;
                    }
                    aVar3.f1121e.f1195i = childAt.getTranslationX();
                    aVar3.f1121e.f1196j = childAt.getTranslationY();
                    aVar3.f1121e.k = childAt.getTranslationZ();
                    e eVar2 = aVar3.f1121e;
                    if (eVar2.f1197l) {
                        eVar2.f1198m = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar3.f1120d.f1160n0 = barrier.getAllowsGoneWidget();
                        aVar3.f1120d.f1151i0 = barrier.getReferencedIds();
                        aVar3.f1120d.f1145f0 = barrier.getType();
                        aVar3.f1120d.f1147g0 = barrier.getMargin();
                    }
                }
                i10++;
                bVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a d10 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d10.f1120d.f1134a = true;
                    }
                    this.f1116c.put(Integer.valueOf(d10.f1117a), d10);
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}

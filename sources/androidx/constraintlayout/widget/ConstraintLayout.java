package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import q.d;
import q.g;
import r.b;
import t.e;
import z5.c;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: p  reason: collision with root package name */
    public static e f1040p;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<View> f1041a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<a> f1042b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    public q.e f1043c = new q.e();

    /* renamed from: d  reason: collision with root package name */
    public int f1044d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1045e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1046f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public int f1047g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1048h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f1049i = 257;

    /* renamed from: j  reason: collision with root package name */
    public b f1050j = null;
    public t.b k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f1051l = -1;

    /* renamed from: m  reason: collision with root package name */
    public HashMap<String, Integer> f1052m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    public SparseArray<d> f1053n = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    public b f1054o = new b(this);

    public static class a extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = Integer.MIN_VALUE;
        public int D = 0;
        public float E = 0.5f;
        public float F = 0.5f;
        public String G = null;
        public float H = -1.0f;
        public float I = -1.0f;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public float R = 1.0f;
        public float S = 1.0f;
        public int T = -1;
        public int U = -1;
        public int V = -1;
        public boolean W = false;
        public boolean X = false;
        public String Y = null;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public int f1055a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1056a0 = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1057b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1058b0 = true;

        /* renamed from: c  reason: collision with root package name */
        public float f1059c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1060c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1061d = true;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1062d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f1063e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f1064e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f1065f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1066f0 = false;

        /* renamed from: g  reason: collision with root package name */
        public int f1067g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f1068g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1069h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1070h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1071i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1072i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1073j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f1074j0 = -1;
        public int k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f1075k0 = Integer.MIN_VALUE;

        /* renamed from: l  reason: collision with root package name */
        public int f1076l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f1077l0 = Integer.MIN_VALUE;

        /* renamed from: m  reason: collision with root package name */
        public int f1078m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f1079m0 = 0.5f;

        /* renamed from: n  reason: collision with root package name */
        public int f1080n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f1081n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1082o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1083o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1084p = -1;
        public float p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1085q = 0;

        /* renamed from: q0  reason: collision with root package name */
        public d f1086q0 = new d();

        /* renamed from: r  reason: collision with root package name */
        public float f1087r = 0.0f;

        /* renamed from: s  reason: collision with root package name */
        public int f1088s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1089t = -1;
        public int u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1090v = -1;
        public int w = Integer.MIN_VALUE;

        /* renamed from: x  reason: collision with root package name */
        public int f1091x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f1092y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f1093z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0007a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1094a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1094a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a() {
            super(-2, -2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x014a, code lost:
            android.util.Log.e("ConstraintLayout", r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f1055a = r0
                r9.f1057b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f1059c = r1
                r2 = 1
                r9.f1061d = r2
                r9.f1063e = r0
                r9.f1065f = r0
                r9.f1067g = r0
                r9.f1069h = r0
                r9.f1071i = r0
                r9.f1073j = r0
                r9.k = r0
                r9.f1076l = r0
                r9.f1078m = r0
                r9.f1080n = r0
                r9.f1082o = r0
                r9.f1084p = r0
                r3 = 0
                r9.f1085q = r3
                r4 = 0
                r9.f1087r = r4
                r9.f1088s = r0
                r9.f1089t = r0
                r9.u = r0
                r9.f1090v = r0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r9.w = r5
                r9.f1091x = r5
                r9.f1092y = r5
                r9.f1093z = r5
                r9.A = r5
                r9.B = r5
                r9.C = r5
                r9.D = r3
                r6 = 1056964608(0x3f000000, float:0.5)
                r9.E = r6
                r9.F = r6
                r7 = 0
                r9.G = r7
                r9.H = r1
                r9.I = r1
                r9.J = r3
                r9.K = r3
                r9.L = r3
                r9.M = r3
                r9.N = r3
                r9.O = r3
                r9.P = r3
                r9.Q = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.R = r1
                r9.S = r1
                r9.T = r0
                r9.U = r0
                r9.V = r0
                r9.W = r3
                r9.X = r3
                r9.Y = r7
                r9.Z = r3
                r9.f1056a0 = r2
                r9.f1058b0 = r2
                r9.f1060c0 = r3
                r9.f1062d0 = r3
                r9.f1064e0 = r3
                r9.f1066f0 = r3
                r9.f1068g0 = r0
                r9.f1070h0 = r0
                r9.f1072i0 = r0
                r9.f1074j0 = r0
                r9.f1075k0 = r5
                r9.f1077l0 = r5
                r9.f1079m0 = r6
                q.d r1 = new q.d
                r1.<init>()
                r9.f1086q0 = r1
                int[] r1 = z5.c.k
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = r3
            L_0x00a4:
                if (r1 >= r11) goto L_0x038e
                int r5 = r10.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.a.C0007a.f1094a
                int r6 = r6.get(r5)
                r7 = 2
                r8 = -2
                switch(r6) {
                    case 1: goto L_0x02ef;
                    case 2: goto L_0x02dd;
                    case 3: goto L_0x02d3;
                    case 4: goto L_0x02bd;
                    case 5: goto L_0x02b3;
                    case 6: goto L_0x02a9;
                    case 7: goto L_0x029f;
                    case 8: goto L_0x028d;
                    case 9: goto L_0x027b;
                    case 10: goto L_0x0269;
                    case 11: goto L_0x0257;
                    case 12: goto L_0x0245;
                    case 13: goto L_0x0233;
                    case 14: goto L_0x0221;
                    case 15: goto L_0x020f;
                    case 16: goto L_0x01fd;
                    case 17: goto L_0x01eb;
                    case 18: goto L_0x01d9;
                    case 19: goto L_0x01c7;
                    case 20: goto L_0x01b5;
                    case 21: goto L_0x01ab;
                    case 22: goto L_0x01a1;
                    case 23: goto L_0x0197;
                    case 24: goto L_0x018d;
                    case 25: goto L_0x0183;
                    case 26: goto L_0x0179;
                    case 27: goto L_0x016f;
                    case 28: goto L_0x0165;
                    case 29: goto L_0x015b;
                    case 30: goto L_0x0151;
                    case 31: goto L_0x0140;
                    case 32: goto L_0x0135;
                    case 33: goto L_0x011f;
                    case 34: goto L_0x0109;
                    case 35: goto L_0x00f9;
                    case 36: goto L_0x00e3;
                    case 37: goto L_0x00cd;
                    case 38: goto L_0x00bd;
                    default: goto L_0x00b5;
                }
            L_0x00b5:
                switch(r6) {
                    case 44: goto L_0x0369;
                    case 45: goto L_0x0360;
                    case 46: goto L_0x0357;
                    case 47: goto L_0x0350;
                    case 48: goto L_0x0349;
                    case 49: goto L_0x0340;
                    case 50: goto L_0x0337;
                    case 51: goto L_0x0330;
                    case 52: goto L_0x031f;
                    case 53: goto L_0x030d;
                    case 54: goto L_0x0303;
                    case 55: goto L_0x02f9;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                switch(r6) {
                    case 64: goto L_0x0387;
                    case 65: goto L_0x0383;
                    case 66: goto L_0x037a;
                    case 67: goto L_0x0371;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                goto L_0x038a
            L_0x00bd:
                float r6 = r9.S
                float r5 = r10.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r9.S = r5
                r9.M = r7
                goto L_0x038a
            L_0x00cd:
                int r6 = r9.Q     // Catch:{ Exception -> 0x00d7 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x00d7 }
                r9.Q = r6     // Catch:{ Exception -> 0x00d7 }
                goto L_0x038a
            L_0x00d7:
                int r6 = r9.Q
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038a
                r9.Q = r8
                goto L_0x038a
            L_0x00e3:
                int r6 = r9.O     // Catch:{ Exception -> 0x00ed }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x00ed }
                r9.O = r6     // Catch:{ Exception -> 0x00ed }
                goto L_0x038a
            L_0x00ed:
                int r6 = r9.O
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038a
                r9.O = r8
                goto L_0x038a
            L_0x00f9:
                float r6 = r9.R
                float r5 = r10.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r9.R = r5
                r9.L = r7
                goto L_0x038a
            L_0x0109:
                int r6 = r9.P     // Catch:{ Exception -> 0x0113 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0113 }
                r9.P = r6     // Catch:{ Exception -> 0x0113 }
                goto L_0x038a
            L_0x0113:
                int r6 = r9.P
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038a
                r9.P = r8
                goto L_0x038a
            L_0x011f:
                int r6 = r9.N     // Catch:{ Exception -> 0x0129 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0129 }
                r9.N = r6     // Catch:{ Exception -> 0x0129 }
                goto L_0x038a
            L_0x0129:
                int r6 = r9.N
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038a
                r9.N = r8
                goto L_0x038a
            L_0x0135:
                int r5 = r10.getInt(r5, r3)
                r9.M = r5
                if (r5 != r2) goto L_0x038a
                java.lang.String r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x014a
            L_0x0140:
                int r5 = r10.getInt(r5, r3)
                r9.L = r5
                if (r5 != r2) goto L_0x038a
                java.lang.String r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x014a:
                java.lang.String r6 = "ConstraintLayout"
                android.util.Log.e(r6, r5)
                goto L_0x038a
            L_0x0151:
                float r6 = r9.F
                float r5 = r10.getFloat(r5, r6)
                r9.F = r5
                goto L_0x038a
            L_0x015b:
                float r6 = r9.E
                float r5 = r10.getFloat(r5, r6)
                r9.E = r5
                goto L_0x038a
            L_0x0165:
                boolean r6 = r9.X
                boolean r5 = r10.getBoolean(r5, r6)
                r9.X = r5
                goto L_0x038a
            L_0x016f:
                boolean r6 = r9.W
                boolean r5 = r10.getBoolean(r5, r6)
                r9.W = r5
                goto L_0x038a
            L_0x0179:
                int r6 = r9.B
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.B = r5
                goto L_0x038a
            L_0x0183:
                int r6 = r9.A
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.A = r5
                goto L_0x038a
            L_0x018d:
                int r6 = r9.f1093z
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f1093z = r5
                goto L_0x038a
            L_0x0197:
                int r6 = r9.f1092y
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f1092y = r5
                goto L_0x038a
            L_0x01a1:
                int r6 = r9.f1091x
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f1091x = r5
                goto L_0x038a
            L_0x01ab:
                int r6 = r9.w
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.w = r5
                goto L_0x038a
            L_0x01b5:
                int r6 = r9.f1090v
                int r6 = r10.getResourceId(r5, r6)
                r9.f1090v = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1090v = r5
                goto L_0x038a
            L_0x01c7:
                int r6 = r9.u
                int r6 = r10.getResourceId(r5, r6)
                r9.u = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.u = r5
                goto L_0x038a
            L_0x01d9:
                int r6 = r9.f1089t
                int r6 = r10.getResourceId(r5, r6)
                r9.f1089t = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1089t = r5
                goto L_0x038a
            L_0x01eb:
                int r6 = r9.f1088s
                int r6 = r10.getResourceId(r5, r6)
                r9.f1088s = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1088s = r5
                goto L_0x038a
            L_0x01fd:
                int r6 = r9.f1078m
                int r6 = r10.getResourceId(r5, r6)
                r9.f1078m = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1078m = r5
                goto L_0x038a
            L_0x020f:
                int r6 = r9.f1076l
                int r6 = r10.getResourceId(r5, r6)
                r9.f1076l = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1076l = r5
                goto L_0x038a
            L_0x0221:
                int r6 = r9.k
                int r6 = r10.getResourceId(r5, r6)
                r9.k = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.k = r5
                goto L_0x038a
            L_0x0233:
                int r6 = r9.f1073j
                int r6 = r10.getResourceId(r5, r6)
                r9.f1073j = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1073j = r5
                goto L_0x038a
            L_0x0245:
                int r6 = r9.f1071i
                int r6 = r10.getResourceId(r5, r6)
                r9.f1071i = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1071i = r5
                goto L_0x038a
            L_0x0257:
                int r6 = r9.f1069h
                int r6 = r10.getResourceId(r5, r6)
                r9.f1069h = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1069h = r5
                goto L_0x038a
            L_0x0269:
                int r6 = r9.f1067g
                int r6 = r10.getResourceId(r5, r6)
                r9.f1067g = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1067g = r5
                goto L_0x038a
            L_0x027b:
                int r6 = r9.f1065f
                int r6 = r10.getResourceId(r5, r6)
                r9.f1065f = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1065f = r5
                goto L_0x038a
            L_0x028d:
                int r6 = r9.f1063e
                int r6 = r10.getResourceId(r5, r6)
                r9.f1063e = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1063e = r5
                goto L_0x038a
            L_0x029f:
                float r6 = r9.f1059c
                float r5 = r10.getFloat(r5, r6)
                r9.f1059c = r5
                goto L_0x038a
            L_0x02a9:
                int r6 = r9.f1057b
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.f1057b = r5
                goto L_0x038a
            L_0x02b3:
                int r6 = r9.f1055a
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.f1055a = r5
                goto L_0x038a
            L_0x02bd:
                float r6 = r9.f1087r
                float r5 = r10.getFloat(r5, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r5 = r5 % r6
                r9.f1087r = r5
                int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r7 >= 0) goto L_0x038a
                float r5 = r6 - r5
                float r5 = r5 % r6
                r9.f1087r = r5
                goto L_0x038a
            L_0x02d3:
                int r6 = r9.f1085q
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f1085q = r5
                goto L_0x038a
            L_0x02dd:
                int r6 = r9.f1084p
                int r6 = r10.getResourceId(r5, r6)
                r9.f1084p = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1084p = r5
                goto L_0x038a
            L_0x02ef:
                int r6 = r9.V
                int r5 = r10.getInt(r5, r6)
                r9.V = r5
                goto L_0x038a
            L_0x02f9:
                int r6 = r9.C
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.C = r5
                goto L_0x038a
            L_0x0303:
                int r6 = r9.D
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.D = r5
                goto L_0x038a
            L_0x030d:
                int r6 = r9.f1082o
                int r6 = r10.getResourceId(r5, r6)
                r9.f1082o = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1082o = r5
                goto L_0x038a
            L_0x031f:
                int r6 = r9.f1080n
                int r6 = r10.getResourceId(r5, r6)
                r9.f1080n = r6
                if (r6 != r0) goto L_0x038a
                int r5 = r10.getInt(r5, r0)
                r9.f1080n = r5
                goto L_0x038a
            L_0x0330:
                java.lang.String r5 = r10.getString(r5)
                r9.Y = r5
                goto L_0x038a
            L_0x0337:
                int r6 = r9.U
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.U = r5
                goto L_0x038a
            L_0x0340:
                int r6 = r9.T
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.T = r5
                goto L_0x038a
            L_0x0349:
                int r5 = r10.getInt(r5, r3)
                r9.K = r5
                goto L_0x038a
            L_0x0350:
                int r5 = r10.getInt(r5, r3)
                r9.J = r5
                goto L_0x038a
            L_0x0357:
                float r6 = r9.I
                float r5 = r10.getFloat(r5, r6)
                r9.I = r5
                goto L_0x038a
            L_0x0360:
                float r6 = r9.H
                float r5 = r10.getFloat(r5, r6)
                r9.H = r5
                goto L_0x038a
            L_0x0369:
                java.lang.String r5 = r10.getString(r5)
                androidx.constraintlayout.widget.b.h(r9, r5)
                goto L_0x038a
            L_0x0371:
                boolean r6 = r9.f1061d
                boolean r5 = r10.getBoolean(r5, r6)
                r9.f1061d = r5
                goto L_0x038a
            L_0x037a:
                int r6 = r9.Z
                int r5 = r10.getInt(r5, r6)
                r9.Z = r5
                goto L_0x038a
            L_0x0383:
                androidx.constraintlayout.widget.b.g(r9, r10, r5, r2)
                goto L_0x038a
            L_0x0387:
                androidx.constraintlayout.widget.b.g(r9, r10, r5, r3)
            L_0x038a:
                int r1 = r1 + 1
                goto L_0x00a4
            L_0x038e:
                r10.recycle()
                r9.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void a() {
            this.f1062d0 = false;
            this.f1056a0 = true;
            this.f1058b0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.W) {
                this.f1056a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.X) {
                this.f1058b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1056a0 = false;
                if (i10 == 0 && this.L == 1) {
                    this.width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1058b0 = false;
                if (i11 == 0 && this.M == 1) {
                    this.height = -2;
                    this.X = true;
                }
            }
            if (this.f1059c != -1.0f || this.f1055a != -1 || this.f1057b != -1) {
                this.f1062d0 = true;
                this.f1056a0 = true;
                this.f1058b0 = true;
                if (!(this.f1086q0 instanceof g)) {
                    this.f1086q0 = new g();
                }
                ((g) this.f1086q0).R(this.V);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00df, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f1  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f1072i0 = r4
                r10.f1074j0 = r4
                r10.f1068g0 = r4
                r10.f1070h0 = r4
                int r5 = r10.w
                r10.f1075k0 = r5
                int r5 = r10.f1092y
                r10.f1077l0 = r5
                float r5 = r10.E
                r10.f1079m0 = r5
                int r6 = r10.f1055a
                r10.f1081n0 = r6
                int r7 = r10.f1057b
                r10.f1083o0 = r7
                float r8 = r10.f1059c
                r10.p0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0092
                int r11 = r10.f1088s
                if (r11 == r4) goto L_0x003f
                r10.f1072i0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f1089t
                if (r11 == r4) goto L_0x0046
                r10.f1074j0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.u
                if (r11 == r4) goto L_0x004d
                r10.f1070h0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f1090v
                if (r11 == r4) goto L_0x0054
                r10.f1068g0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005a
                r10.f1077l0 = r11
            L_0x005a:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0060
                r10.f1075k0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f1079m0 = r2
            L_0x0068:
                boolean r2 = r10.f1062d0
                if (r2 == 0) goto L_0x00b6
                int r2 = r10.V
                if (r2 != r3) goto L_0x00b6
                boolean r2 = r10.f1061d
                if (r2 == 0) goto L_0x00b6
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.p0 = r11
                r10.f1081n0 = r4
                r10.f1083o0 = r4
                goto L_0x00b6
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f1083o0 = r6
                r10.f1081n0 = r4
            L_0x0088:
                r10.p0 = r2
                goto L_0x00b6
            L_0x008b:
                if (r7 == r4) goto L_0x00b6
                r10.f1081n0 = r7
                r10.f1083o0 = r4
                goto L_0x0088
            L_0x0092:
                int r11 = r10.f1088s
                if (r11 == r4) goto L_0x0098
                r10.f1070h0 = r11
            L_0x0098:
                int r11 = r10.f1089t
                if (r11 == r4) goto L_0x009e
                r10.f1068g0 = r11
            L_0x009e:
                int r11 = r10.u
                if (r11 == r4) goto L_0x00a4
                r10.f1072i0 = r11
            L_0x00a4:
                int r11 = r10.f1090v
                if (r11 == r4) goto L_0x00aa
                r10.f1074j0 = r11
            L_0x00aa:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b0
                r10.f1075k0 = r11
            L_0x00b0:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00b6
                r10.f1077l0 = r11
            L_0x00b6:
                int r11 = r10.u
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1090v
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1089t
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1088s
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1067g
                if (r11 == r4) goto L_0x00d5
                r10.f1072i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
            L_0x00d2:
                r10.rightMargin = r1
                goto L_0x00e2
            L_0x00d5:
                int r11 = r10.f1069h
                if (r11 == r4) goto L_0x00e2
                r10.f1074j0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
                goto L_0x00d2
            L_0x00e2:
                int r11 = r10.f1063e
                if (r11 == r4) goto L_0x00f1
                r10.f1068g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
            L_0x00ee:
                r10.leftMargin = r0
                goto L_0x00fe
            L_0x00f1:
                int r11 = r10.f1065f
                if (r11 == r4) goto L_0x00fe
                r10.f1070h0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
                goto L_0x00ee
            L_0x00fe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public class b implements b.C0134b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f1095a;

        /* renamed from: b  reason: collision with root package name */
        public int f1096b;

        /* renamed from: c  reason: collision with root package name */
        public int f1097c;

        /* renamed from: d  reason: collision with root package name */
        public int f1098d;

        /* renamed from: e  reason: collision with root package name */
        public int f1099e;

        /* renamed from: f  reason: collision with root package name */
        public int f1100f;

        /* renamed from: g  reason: collision with root package name */
        public int f1101g;

        public b(ConstraintLayout constraintLayout) {
            this.f1095a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01e8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(q.d r18, r.b.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f10911j0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.G
                if (r3 != 0) goto L_0x001b
                r2.f11408e = r5
                r2.f11409f = r5
                r2.f11410g = r5
                return
            L_0x001b:
                q.d r3 = r1.W
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                int r3 = r2.f11404a
                int r4 = r2.f11405b
                int r6 = r2.f11406c
                int r7 = r2.f11407d
                int r8 = r0.f1096b
                int r9 = r0.f1097c
                int r8 = r8 + r9
                int r9 = r0.f1098d
                java.lang.Object r10 = r1.f10909i0
                android.view.View r10 = (android.view.View) r10
                int r11 = o.g.b(r3)
                r12 = 2
                r13 = 3
                r14 = -1
                r15 = 1
                if (r11 == 0) goto L_0x00b1
                if (r11 == r15) goto L_0x00a7
                if (r11 == r12) goto L_0x005d
                if (r11 == r13) goto L_0x0045
                goto L_0x00b7
            L_0x0045:
                int r6 = r0.f1100f
                q.c r11 = r1.K
                if (r11 == 0) goto L_0x004f
                int r11 = r11.f10880g
                int r11 = r11 + r5
                goto L_0x0050
            L_0x004f:
                r11 = r5
            L_0x0050:
                q.c r5 = r1.M
                if (r5 == 0) goto L_0x0057
                int r5 = r5.f10880g
                int r11 = r11 + r5
            L_0x0057:
                int r9 = r9 + r11
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r14)
                goto L_0x00b7
            L_0x005d:
                int r5 = r0.f1100f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                int r6 = r1.f10926s
                if (r6 != r15) goto L_0x006a
                r6 = r15
                goto L_0x006b
            L_0x006a:
                r6 = 0
            L_0x006b:
                int r9 = r2.f11413j
                if (r9 == r15) goto L_0x0075
                if (r9 != r12) goto L_0x0072
                goto L_0x0075
            L_0x0072:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x00b7
            L_0x0075:
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.l()
                if (r9 != r11) goto L_0x0081
                r9 = r15
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                int r11 = r2.f11413j
                if (r11 == r12) goto L_0x0099
                if (r6 == 0) goto L_0x0099
                if (r6 == 0) goto L_0x008c
                if (r9 != 0) goto L_0x0099
            L_0x008c:
                boolean r6 = r10 instanceof androidx.constraintlayout.widget.e
                if (r6 != 0) goto L_0x0099
                boolean r6 = r18.B()
                if (r6 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r6 = 0
                goto L_0x009a
            L_0x0099:
                r6 = r15
            L_0x009a:
                if (r6 == 0) goto L_0x0072
                int r5 = r18.r()
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
                goto L_0x00b7
            L_0x00a7:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = r0.f1100f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                goto L_0x00b7
            L_0x00b1:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            L_0x00b7:
                int r6 = o.g.b(r4)
                if (r6 == 0) goto L_0x0137
                if (r6 == r15) goto L_0x012d
                if (r6 == r12) goto L_0x00e3
                if (r6 == r13) goto L_0x00c6
                r9 = 0
                goto L_0x013e
            L_0x00c6:
                int r6 = r0.f1101g
                q.c r7 = r1.K
                if (r7 == 0) goto L_0x00d3
                q.c r7 = r1.L
                int r7 = r7.f10880g
                r9 = 0
                int r7 = r7 + r9
                goto L_0x00d4
            L_0x00d3:
                r7 = 0
            L_0x00d4:
                q.c r9 = r1.M
                if (r9 == 0) goto L_0x00dd
                q.c r9 = r1.N
                int r9 = r9.f10880g
                int r7 = r7 + r9
            L_0x00dd:
                int r8 = r8 + r7
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r14)
                goto L_0x013d
            L_0x00e3:
                int r6 = r0.f1101g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                int r7 = r1.f10927t
                if (r7 != r15) goto L_0x00f0
                r7 = r15
                goto L_0x00f1
            L_0x00f0:
                r7 = 0
            L_0x00f1:
                int r8 = r2.f11413j
                if (r8 == r15) goto L_0x00fb
                if (r8 != r12) goto L_0x00f8
                goto L_0x00fb
            L_0x00f8:
                r9 = 1073741824(0x40000000, float:2.0)
                goto L_0x013d
            L_0x00fb:
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.r()
                if (r8 != r9) goto L_0x0107
                r8 = r15
                goto L_0x0108
            L_0x0107:
                r8 = 0
            L_0x0108:
                int r9 = r2.f11413j
                if (r9 == r12) goto L_0x011f
                if (r7 == 0) goto L_0x011f
                if (r7 == 0) goto L_0x0112
                if (r8 != 0) goto L_0x011f
            L_0x0112:
                boolean r7 = r10 instanceof androidx.constraintlayout.widget.e
                if (r7 != 0) goto L_0x011f
                boolean r7 = r18.C()
                if (r7 == 0) goto L_0x011d
                goto L_0x011f
            L_0x011d:
                r7 = 0
                goto L_0x0120
            L_0x011f:
                r7 = r15
            L_0x0120:
                if (r7 == 0) goto L_0x00f8
                int r6 = r18.l()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x013d
            L_0x012d:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f1101g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                goto L_0x013d
            L_0x0137:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            L_0x013d:
                r9 = r6
            L_0x013e:
                q.d r6 = r1.W
                q.e r6 = (q.e) r6
                if (r6 == 0) goto L_0x01b4
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.f1049i
                r8 = 256(0x100, float:3.59E-43)
                boolean r7 = androidx.lifecycle.c0.g(r7, r8)
                if (r7 == 0) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r18.r()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r6.r()
                if (r7 >= r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r8 = r18.l()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r6 = r6.l()
                if (r7 >= r6) goto L_0x01b4
                int r6 = r10.getBaseline()
                int r7 = r1.f10899d0
                if (r6 != r7) goto L_0x01b4
                boolean r6 = r18.A()
                if (r6 != 0) goto L_0x01b4
                int r6 = r1.I
                int r7 = r18.r()
                boolean r6 = a(r6, r5, r7)
                if (r6 == 0) goto L_0x01a0
                int r6 = r1.J
                int r7 = r18.l()
                boolean r6 = a(r6, r9, r7)
                if (r6 == 0) goto L_0x01a0
                r6 = r15
                goto L_0x01a1
            L_0x01a0:
                r6 = 0
            L_0x01a1:
                if (r6 == 0) goto L_0x01b4
                int r3 = r18.r()
                r2.f11408e = r3
                int r3 = r18.l()
                r2.f11409f = r3
                int r1 = r1.f10899d0
                r2.f11410g = r1
                return
            L_0x01b4:
                if (r3 != r13) goto L_0x01b8
                r6 = r15
                goto L_0x01b9
            L_0x01b8:
                r6 = 0
            L_0x01b9:
                if (r4 != r13) goto L_0x01bd
                r7 = r15
                goto L_0x01be
            L_0x01bd:
                r7 = 0
            L_0x01be:
                r8 = 4
                if (r4 == r8) goto L_0x01c6
                if (r4 != r15) goto L_0x01c4
                goto L_0x01c6
            L_0x01c4:
                r4 = 0
                goto L_0x01c7
            L_0x01c6:
                r4 = r15
            L_0x01c7:
                if (r3 == r8) goto L_0x01ce
                if (r3 != r15) goto L_0x01cc
                goto L_0x01ce
            L_0x01cc:
                r3 = 0
                goto L_0x01cf
            L_0x01ce:
                r3 = r15
            L_0x01cf:
                r8 = 0
                if (r6 == 0) goto L_0x01da
                float r11 = r1.Z
                int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r11 <= 0) goto L_0x01da
                r11 = r15
                goto L_0x01db
            L_0x01da:
                r11 = 0
            L_0x01db:
                if (r7 == 0) goto L_0x01e5
                float r13 = r1.Z
                int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r8 <= 0) goto L_0x01e5
                r8 = r15
                goto L_0x01e6
            L_0x01e5:
                r8 = 0
            L_0x01e6:
                if (r10 != 0) goto L_0x01e9
                return
            L_0x01e9:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.a) r13
                int r14 = r2.f11413j
                if (r14 == r15) goto L_0x0209
                if (r14 == r12) goto L_0x0209
                if (r6 == 0) goto L_0x0209
                int r6 = r1.f10926s
                if (r6 != 0) goto L_0x0209
                if (r7 == 0) goto L_0x0209
                int r6 = r1.f10927t
                if (r6 == 0) goto L_0x0202
                goto L_0x0209
            L_0x0202:
                r0 = -1
                r4 = 0
                r9 = 0
                r14 = 0
                r15 = 0
                goto L_0x02b0
            L_0x0209:
                boolean r6 = r10 instanceof t.f
                if (r6 == 0) goto L_0x021b
                boolean r6 = r1 instanceof q.j
                if (r6 == 0) goto L_0x021b
                r6 = r1
                q.j r6 = (q.j) r6
                r7 = r10
                t.f r7 = (t.f) r7
                r7.l(r6, r5, r9)
                goto L_0x021e
            L_0x021b:
                r10.measure(r5, r9)
            L_0x021e:
                r1.I = r5
                r1.J = r9
                r6 = 0
                r1.f10904g = r6
                int r6 = r10.getMeasuredWidth()
                int r7 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                int r14 = r1.f10928v
                if (r14 <= 0) goto L_0x023a
                int r14 = java.lang.Math.max(r14, r6)
                goto L_0x023b
            L_0x023a:
                r14 = r6
            L_0x023b:
                int r15 = r1.w
                if (r15 <= 0) goto L_0x0243
                int r14 = java.lang.Math.min(r15, r14)
            L_0x0243:
                int r15 = r1.f10930y
                if (r15 <= 0) goto L_0x024e
                int r15 = java.lang.Math.max(r15, r7)
                r16 = r5
                goto L_0x0251
            L_0x024e:
                r16 = r5
                r15 = r7
            L_0x0251:
                int r5 = r1.f10931z
                if (r5 <= 0) goto L_0x0259
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0259:
                androidx.constraintlayout.widget.ConstraintLayout r5 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r5 = r5.f1049i
                r0 = 1
                boolean r5 = androidx.lifecycle.c0.g(r5, r0)
                if (r5 != 0) goto L_0x027d
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x0272
                if (r4 == 0) goto L_0x0272
                float r3 = r1.Z
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r14 = r0
                goto L_0x027d
            L_0x0272:
                if (r8 == 0) goto L_0x027d
                if (r3 == 0) goto L_0x027d
                float r3 = r1.Z
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
            L_0x027d:
                if (r6 != r14) goto L_0x0286
                if (r7 == r15) goto L_0x0282
                goto L_0x0286
            L_0x0282:
                r4 = r12
                r0 = -1
                r9 = 0
                goto L_0x02b0
            L_0x0286:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r6 == r14) goto L_0x028f
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
                goto L_0x0291
            L_0x028f:
                r5 = r16
            L_0x0291:
                if (r7 == r15) goto L_0x0297
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            L_0x0297:
                r10.measure(r5, r9)
                r1.I = r5
                r1.J = r9
                r9 = 0
                r1.f10904g = r9
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r14 = r0
                r15 = r3
                r0 = -1
            L_0x02b0:
                if (r4 == r0) goto L_0x02b4
                r0 = 1
                goto L_0x02b5
            L_0x02b4:
                r0 = r9
            L_0x02b5:
                int r3 = r2.f11406c
                if (r14 != r3) goto L_0x02c0
                int r3 = r2.f11407d
                if (r15 == r3) goto L_0x02be
                goto L_0x02c0
            L_0x02be:
                r5 = r9
                goto L_0x02c1
            L_0x02c0:
                r5 = 1
            L_0x02c1:
                r2.f11412i = r5
                boolean r3 = r13.f1060c0
                if (r3 == 0) goto L_0x02c8
                r0 = 1
            L_0x02c8:
                if (r0 == 0) goto L_0x02d4
                r3 = -1
                if (r4 == r3) goto L_0x02d4
                int r1 = r1.f10899d0
                if (r1 == r4) goto L_0x02d4
                r1 = 1
                r2.f11412i = r1
            L_0x02d4:
                r2.f11408e = r14
                r2.f11409f = r15
                r2.f11411h = r0
                r2.f11410g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(q.d, r.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d(attributeSet, i10);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static e getSharedValues() {
        if (f1040p == null) {
            f1040p = new e();
        }
        return f1040p;
    }

    public final d c(View view) {
        if (view == this) {
            return this.f1043c;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof a)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof a)) {
                return null;
            }
        }
        return ((a) view.getLayoutParams()).f1086q0;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        q.e eVar = this.f1043c;
        eVar.f10909i0 = this;
        b bVar = this.f1054o;
        eVar.f10934w0 = bVar;
        eVar.u0.f11420f = bVar;
        this.f1041a.put(getId(), this);
        this.f1050j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.k, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f1044d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1044d);
                } else if (index == 17) {
                    this.f1045e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1045e);
                } else if (index == 14) {
                    this.f1046f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1046f);
                } else if (index == 15) {
                    this.f1047g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1047g);
                } else if (index == 113) {
                    this.f1049i = obtainStyledAttributes.getInt(index, this.f1049i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar2 = new b();
                        this.f1050j = bVar2;
                        bVar2.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1050j = null;
                    }
                    this.f1051l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        q.e eVar2 = this.f1043c;
        eVar2.F0 = this.f1049i;
        o.d.f10425p = eVar2.W(512);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a> arrayList = this.f1042b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1042b.get(i10).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = (float) i13;
                        float f13 = f10;
                        float f14 = f10;
                        float f15 = f12;
                        Paint paint2 = paint;
                        float f16 = f11;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f13, f15, f16, f12, paint3);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f11;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f15, f16, f18, paint3);
                        float f19 = parseInt4;
                        float f20 = f14;
                        canvas2.drawLine(f17, f19, f20, f18, paint3);
                        float f21 = f14;
                        canvas2.drawLine(f21, f19, f20, f12, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f22 = f11;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f21, f12, f22, parseInt4, paint6);
                        canvas2.drawLine(f21, parseInt4, f22, f12, paint6);
                    }
                }
            }
        }
    }

    public final boolean e() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void f(int i10) {
        this.k = new t.b(getContext(), this, i10);
    }

    public final void forceLayout() {
        this.f1048h = true;
        super.forceLayout();
    }

    public final void g(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1052m == null) {
                this.f1052m = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1052m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1047g;
    }

    public int getMaxWidth() {
        return this.f1046f;
    }

    public int getMinHeight() {
        return this.f1045e;
    }

    public int getMinWidth() {
        return this.f1044d;
    }

    public int getOptimizationLevel() {
        return this.f1043c.F0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1043c.k == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1043c.k = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1043c.k = "parent";
            }
        }
        q.e eVar = this.f1043c;
        if (eVar.f10912k0 == null) {
            eVar.f10912k0 = eVar.k;
            StringBuilder g10 = f.g(" setDebugName ");
            g10.append(this.f1043c.f10912k0);
            Log.v("ConstraintLayout", g10.toString());
        }
        Iterator<d> it = this.f1043c.f10970s0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            View view = (View) next.f10909i0;
            if (view != null) {
                if (next.k == null && (id = view.getId()) != -1) {
                    next.k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f10912k0 == null) {
                    next.f10912k0 = next.k;
                    StringBuilder g11 = f.g(" setDebugName ");
                    g11.append(next.f10912k0);
                    Log.v("ConstraintLayout", g11.toString());
                }
            }
        }
        this.f1043c.o(sb);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x053b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r24 = this;
            r0 = r24
            q.c$a r1 = q.c.a.BASELINE
            int r2 = r24.getChildCount()
            r3 = 0
            r4 = r3
        L_0x000a:
            r5 = 1
            if (r4 >= r2) goto L_0x001c
            android.view.View r6 = r0.getChildAt(r4)
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L_0x0019
            r2 = r5
            goto L_0x001d
        L_0x0019:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x001c:
            r2 = r3
        L_0x001d:
            if (r2 == 0) goto L_0x05b4
            boolean r4 = r24.isInEditMode()
            int r6 = r24.getChildCount()
            r7 = r3
        L_0x0028:
            if (r7 >= r6) goto L_0x003b
            android.view.View r8 = r0.getChildAt(r7)
            q.d r8 = r0.c(r8)
            if (r8 != 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r8.D()
        L_0x0038:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x003b:
            r7 = 0
            r8 = -1
            if (r4 == 0) goto L_0x00a3
            r9 = r3
        L_0x0040:
            if (r9 >= r6) goto L_0x00a3
            android.view.View r10 = r0.getChildAt(r9)
            android.content.res.Resources r11 = r24.getResources()     // Catch:{ NotFoundException -> 0x00a0 }
            int r12 = r10.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.String r11 = r11.getResourceName(r12)     // Catch:{ NotFoundException -> 0x00a0 }
            int r12 = r10.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NotFoundException -> 0x00a0 }
            r0.g(r11, r12)     // Catch:{ NotFoundException -> 0x00a0 }
            r12 = 47
            int r12 = r11.indexOf(r12)     // Catch:{ NotFoundException -> 0x00a0 }
            if (r12 == r8) goto L_0x006b
            int r12 = r12 + 1
            java.lang.String r11 = r11.substring(r12)     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x006b:
            int r10 = r10.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            if (r10 != 0) goto L_0x0072
            goto L_0x008f
        L_0x0072:
            android.util.SparseArray<android.view.View> r12 = r0.f1041a     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.Object r12 = r12.get(r10)     // Catch:{ NotFoundException -> 0x00a0 }
            android.view.View r12 = (android.view.View) r12     // Catch:{ NotFoundException -> 0x00a0 }
            if (r12 != 0) goto L_0x008d
            android.view.View r12 = r0.findViewById(r10)     // Catch:{ NotFoundException -> 0x00a0 }
            if (r12 == 0) goto L_0x008d
            if (r12 == r0) goto L_0x008d
            android.view.ViewParent r10 = r12.getParent()     // Catch:{ NotFoundException -> 0x00a0 }
            if (r10 != r0) goto L_0x008d
            r0.onViewAdded(r12)     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x008d:
            if (r12 != r0) goto L_0x0092
        L_0x008f:
            q.e r10 = r0.f1043c     // Catch:{ NotFoundException -> 0x00a0 }
            goto L_0x009e
        L_0x0092:
            if (r12 != 0) goto L_0x0096
            r10 = r7
            goto L_0x009e
        L_0x0096:
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()     // Catch:{ NotFoundException -> 0x00a0 }
            androidx.constraintlayout.widget.ConstraintLayout$a r10 = (androidx.constraintlayout.widget.ConstraintLayout.a) r10     // Catch:{ NotFoundException -> 0x00a0 }
            q.d r10 = r10.f1086q0     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x009e:
            r10.f10912k0 = r11     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x00a0:
            int r9 = r9 + 1
            goto L_0x0040
        L_0x00a3:
            int r9 = r0.f1051l
            if (r9 == r8) goto L_0x00c5
            r9 = r3
        L_0x00a8:
            if (r9 >= r6) goto L_0x00c5
            android.view.View r10 = r0.getChildAt(r9)
            int r11 = r10.getId()
            int r12 = r0.f1051l
            if (r11 != r12) goto L_0x00c2
            boolean r11 = r10 instanceof androidx.constraintlayout.widget.c
            if (r11 == 0) goto L_0x00c2
            androidx.constraintlayout.widget.c r10 = (androidx.constraintlayout.widget.c) r10
            androidx.constraintlayout.widget.b r10 = r10.getConstraintSet()
            r0.f1050j = r10
        L_0x00c2:
            int r9 = r9 + 1
            goto L_0x00a8
        L_0x00c5:
            androidx.constraintlayout.widget.b r9 = r0.f1050j
            if (r9 == 0) goto L_0x00cc
            r9.a(r0)
        L_0x00cc:
            q.e r9 = r0.f1043c
            java.util.ArrayList<q.d> r9 = r9.f10970s0
            r9.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.a> r9 = r0.f1042b
            int r9 = r9.size()
            r10 = 2
            if (r9 <= 0) goto L_0x0177
            r11 = r3
        L_0x00dd:
            if (r11 >= r9) goto L_0x0177
            java.util.ArrayList<androidx.constraintlayout.widget.a> r12 = r0.f1042b
            java.lang.Object r12 = r12.get(r11)
            androidx.constraintlayout.widget.a r12 = (androidx.constraintlayout.widget.a) r12
            boolean r13 = r12.isInEditMode()
            if (r13 == 0) goto L_0x00f2
            java.lang.String r13 = r12.f1107e
            r12.setIds(r13)
        L_0x00f2:
            q.i r13 = r12.f1106d
            if (r13 != 0) goto L_0x00f8
            goto L_0x0170
        L_0x00f8:
            r13.f10964t0 = r3
            q.d[] r13 = r13.f10963s0
            java.util.Arrays.fill(r13, r7)
            r13 = r3
        L_0x0100:
            int r14 = r12.f1104b
            if (r13 >= r14) goto L_0x016b
            int[] r14 = r12.f1103a
            r14 = r14[r13]
            android.util.SparseArray<android.view.View> r15 = r0.f1041a
            java.lang.Object r15 = r15.get(r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 != 0) goto L_0x013a
            java.util.HashMap<java.lang.Integer, java.lang.String> r7 = r12.f1110h
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r7 = r7.get(r14)
            java.lang.String r7 = (java.lang.String) r7
            int r14 = r12.h(r0, r7)
            if (r14 == 0) goto L_0x013a
            int[] r15 = r12.f1103a
            r15[r13] = r14
            java.util.HashMap<java.lang.Integer, java.lang.String> r15 = r12.f1110h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r15.put(r3, r7)
            android.util.SparseArray<android.view.View> r3 = r0.f1041a
            java.lang.Object r3 = r3.get(r14)
            r15 = r3
            android.view.View r15 = (android.view.View) r15
        L_0x013a:
            if (r15 == 0) goto L_0x0165
            q.i r3 = r12.f1106d
            q.d r7 = r0.c(r15)
            r3.getClass()
            if (r7 == r3) goto L_0x0165
            if (r7 != 0) goto L_0x014a
            goto L_0x0165
        L_0x014a:
            int r14 = r3.f10964t0
            int r14 = r14 + r5
            q.d[] r15 = r3.f10963s0
            int r8 = r15.length
            if (r14 <= r8) goto L_0x015c
            int r8 = r15.length
            int r8 = r8 * r10
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r15, r8)
            q.d[] r8 = (q.d[]) r8
            r3.f10963s0 = r8
        L_0x015c:
            q.d[] r8 = r3.f10963s0
            int r14 = r3.f10964t0
            r8[r14] = r7
            int r14 = r14 + r5
            r3.f10964t0 = r14
        L_0x0165:
            int r13 = r13 + 1
            r3 = 0
            r7 = 0
            r8 = -1
            goto L_0x0100
        L_0x016b:
            q.i r3 = r12.f1106d
            r3.a()
        L_0x0170:
            int r11 = r11 + 1
            r3 = 0
            r7 = 0
            r8 = -1
            goto L_0x00dd
        L_0x0177:
            r3 = 0
        L_0x0178:
            if (r3 >= r6) goto L_0x01b2
            android.view.View r7 = r0.getChildAt(r3)
            boolean r8 = r7 instanceof androidx.constraintlayout.widget.e
            if (r8 == 0) goto L_0x01af
            androidx.constraintlayout.widget.e r7 = (androidx.constraintlayout.widget.e) r7
            int r8 = r7.f1209a
            r9 = -1
            if (r8 != r9) goto L_0x0194
            boolean r8 = r7.isInEditMode()
            if (r8 != 0) goto L_0x0194
            int r8 = r7.f1211c
            r7.setVisibility(r8)
        L_0x0194:
            int r8 = r7.f1209a
            android.view.View r8 = r0.findViewById(r8)
            r7.f1210b = r8
            if (r8 == 0) goto L_0x01af
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            r8.f1066f0 = r5
            android.view.View r8 = r7.f1210b
            r9 = 0
            r8.setVisibility(r9)
            r7.setVisibility(r9)
        L_0x01af:
            int r3 = r3 + 1
            goto L_0x0178
        L_0x01b2:
            android.util.SparseArray<q.d> r3 = r0.f1053n
            r3.clear()
            android.util.SparseArray<q.d> r3 = r0.f1053n
            q.e r7 = r0.f1043c
            r8 = 0
            r3.put(r8, r7)
            android.util.SparseArray<q.d> r3 = r0.f1053n
            int r7 = r24.getId()
            q.e r8 = r0.f1043c
            r3.put(r7, r8)
            r3 = 0
        L_0x01cb:
            if (r3 >= r6) goto L_0x01e1
            android.view.View r7 = r0.getChildAt(r3)
            q.d r8 = r0.c(r7)
            android.util.SparseArray<q.d> r9 = r0.f1053n
            int r7 = r7.getId()
            r9.put(r7, r8)
            int r3 = r3 + 1
            goto L_0x01cb
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            if (r9 >= r6) goto L_0x05b4
            android.view.View r3 = r0.getChildAt(r9)
            q.d r7 = r0.c(r3)
            if (r7 != 0) goto L_0x01fb
            r18 = r2
            r20 = r4
            r17 = r6
            r19 = r9
            r2 = r10
        L_0x01f7:
            r4 = 0
            r9 = -1
            goto L_0x05a8
        L_0x01fb:
            android.view.ViewGroup$LayoutParams r8 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            q.e r11 = r0.f1043c
            java.util.ArrayList<q.d> r12 = r11.f10970s0
            r12.add(r7)
            q.d r12 = r7.W
            if (r12 == 0) goto L_0x0216
            q.k r12 = (q.k) r12
            java.util.ArrayList<q.d> r12 = r12.f10970s0
            r12.remove(r7)
            r7.D()
        L_0x0216:
            r7.W = r11
            android.util.SparseArray<q.d> r15 = r0.f1053n
            q.c$a r13 = q.c.a.RIGHT
            q.c$a r12 = q.c.a.LEFT
            q.c$a r11 = q.c.a.BOTTOM
            q.c$a r10 = q.c.a.TOP
            r8.a()
            int r14 = r3.getVisibility()
            r7.f10911j0 = r14
            boolean r14 = r8.f1066f0
            if (r14 == 0) goto L_0x0235
            r7.G = r5
            r14 = 8
            r7.f10911j0 = r14
        L_0x0235:
            r7.f10909i0 = r3
            boolean r14 = r3 instanceof androidx.constraintlayout.widget.a
            if (r14 == 0) goto L_0x0244
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.a) r3
            q.e r14 = r0.f1043c
            boolean r14 = r14.f10935x0
            r3.j(r7, r14)
        L_0x0244:
            boolean r3 = r8.f1062d0
            if (r3 == 0) goto L_0x0281
            q.g r7 = (q.g) r7
            int r3 = r8.f1081n0
            int r10 = r8.f1083o0
            float r8 = r8.p0
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x0260
            if (r12 <= 0) goto L_0x0276
            r7.f10958s0 = r8
            r8 = -1
            r7.f10959t0 = r8
            r7.u0 = r8
            goto L_0x0276
        L_0x0260:
            r8 = -1
            if (r3 == r8) goto L_0x026c
            if (r3 <= r8) goto L_0x0276
            r7.f10958s0 = r11
            r7.f10959t0 = r3
            r7.u0 = r8
            goto L_0x0276
        L_0x026c:
            if (r10 == r8) goto L_0x0276
            if (r10 <= r8) goto L_0x0276
            r7.f10958s0 = r11
            r7.f10959t0 = r8
            r7.u0 = r10
        L_0x0276:
            r18 = r2
            r20 = r4
            r17 = r6
            r19 = r9
            r2 = 2
            goto L_0x01f7
        L_0x0281:
            int r3 = r8.f1068g0
            int r14 = r8.f1070h0
            int r5 = r8.f1072i0
            r17 = r6
            int r6 = r8.f1074j0
            r18 = r2
            int r2 = r8.f1075k0
            r19 = r9
            int r9 = r8.f1077l0
            r20 = r4
            float r4 = r8.f1079m0
            r21 = r11
            int r11 = r8.f1084p
            r22 = r4
            r4 = -1
            if (r11 == r4) goto L_0x02ca
            java.lang.Object r2 = r15.get(r11)
            q.d r2 = (q.d) r2
            if (r2 == 0) goto L_0x02bf
            float r3 = r8.f1087r
            int r15 = r8.f1085q
            q.c$a r14 = q.c.a.CENTER
            r4 = 0
            r5 = r21
            r11 = r7
            r6 = r12
            r12 = r14
            r9 = r13
            r13 = r2
            r2 = 4
            r16 = r4
            r11.w(r12, r13, r14, r15, r16)
            r7.E = r3
            goto L_0x02c4
        L_0x02bf:
            r6 = r12
            r9 = r13
            r5 = r21
            r2 = 4
        L_0x02c4:
            r2 = r5
            r23 = r6
            r4 = r9
            goto L_0x0411
        L_0x02ca:
            r11 = r4
            r4 = r13
            r13 = r12
            r12 = r21
            if (r3 == r11) goto L_0x02e6
            java.lang.Object r3 = r15.get(r3)
            q.d r3 = (q.d) r3
            if (r3 == 0) goto L_0x02df
            int r14 = r8.leftMargin
            r16 = r14
            r14 = r13
            goto L_0x02f5
        L_0x02df:
            r2 = r11
            r21 = r12
            r23 = r13
            r3 = r15
            goto L_0x0312
        L_0x02e6:
            if (r14 == r11) goto L_0x030c
            java.lang.Object r3 = r15.get(r14)
            q.d r3 = (q.d) r3
            if (r3 == 0) goto L_0x0305
            int r11 = r8.leftMargin
            r14 = r4
            r16 = r11
        L_0x02f5:
            r11 = r7
            r21 = r12
            r12 = r13
            r23 = r13
            r13 = r3
            r3 = r15
            r15 = r16
            r16 = r2
            r11.w(r12, r13, r14, r15, r16)
            goto L_0x030a
        L_0x0305:
            r21 = r12
            r23 = r13
            r3 = r15
        L_0x030a:
            r2 = -1
            goto L_0x0312
        L_0x030c:
            r21 = r12
            r23 = r13
            r3 = r15
            r2 = r11
        L_0x0312:
            if (r5 == r2) goto L_0x0323
            java.lang.Object r5 = r3.get(r5)
            q.d r5 = (q.d) r5
            if (r5 == 0) goto L_0x0339
            int r6 = r8.rightMargin
            r13 = r5
            r15 = r6
            r14 = r23
            goto L_0x0332
        L_0x0323:
            if (r6 == r2) goto L_0x0339
            java.lang.Object r2 = r3.get(r6)
            q.d r2 = (q.d) r2
            if (r2 == 0) goto L_0x0339
            int r5 = r8.rightMargin
            r13 = r2
            r14 = r4
            r15 = r5
        L_0x0332:
            r11 = r7
            r12 = r4
            r16 = r9
            r11.w(r12, r13, r14, r15, r16)
        L_0x0339:
            int r2 = r8.f1071i
            r5 = -1
            if (r2 == r5) goto L_0x0350
            java.lang.Object r2 = r3.get(r2)
            q.d r2 = (q.d) r2
            if (r2 == 0) goto L_0x036b
            int r6 = r8.topMargin
            int r9 = r8.f1091x
            r13 = r2
            r15 = r6
            r16 = r9
            r14 = r10
            goto L_0x0366
        L_0x0350:
            int r2 = r8.f1073j
            if (r2 == r5) goto L_0x036b
            java.lang.Object r2 = r3.get(r2)
            q.d r2 = (q.d) r2
            if (r2 == 0) goto L_0x036b
            int r5 = r8.topMargin
            int r6 = r8.f1091x
            r13 = r2
            r15 = r5
            r16 = r6
            r14 = r21
        L_0x0366:
            r11 = r7
            r12 = r10
            r11.w(r12, r13, r14, r15, r16)
        L_0x036b:
            int r2 = r8.k
            r5 = -1
            if (r2 == r5) goto L_0x0382
            java.lang.Object r2 = r3.get(r2)
            q.d r2 = (q.d) r2
            if (r2 == 0) goto L_0x039e
            int r6 = r8.bottomMargin
            int r9 = r8.f1093z
            r13 = r2
            r15 = r6
            r16 = r9
            r14 = r10
            goto L_0x0398
        L_0x0382:
            int r2 = r8.f1076l
            if (r2 == r5) goto L_0x039e
            java.lang.Object r2 = r3.get(r2)
            q.d r2 = (q.d) r2
            if (r2 == 0) goto L_0x039e
            int r5 = r8.bottomMargin
            int r6 = r8.f1093z
            r13 = r2
            r15 = r5
            r16 = r6
            r14 = r21
        L_0x0398:
            r11 = r7
            r12 = r21
            r11.w(r12, r13, r14, r15, r16)
        L_0x039e:
            int r2 = r8.f1078m
            r5 = -1
            if (r2 == r5) goto L_0x03a5
            r11 = r1
            goto L_0x03b1
        L_0x03a5:
            int r2 = r8.f1080n
            if (r2 == r5) goto L_0x03ab
            r11 = r10
            goto L_0x03b1
        L_0x03ab:
            int r2 = r8.f1082o
            if (r2 == r5) goto L_0x03fe
            r11 = r21
        L_0x03b1:
            android.util.SparseArray<android.view.View> r5 = r0.f1041a
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r2 = r3.get(r2)
            q.d r2 = (q.d) r2
            if (r2 == 0) goto L_0x03fe
            if (r5 == 0) goto L_0x03fe
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r3 == 0) goto L_0x03fe
            r3 = 1
            r8.f1060c0 = r3
            if (r11 != r1) goto L_0x03dc
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
            r5.f1060c0 = r3
            q.d r5 = r5.f1086q0
            r5.F = r3
        L_0x03dc:
            q.c r5 = r7.j(r1)
            q.c r2 = r2.j(r11)
            int r6 = r8.D
            int r9 = r8.C
            r5.b(r2, r6, r9, r3)
            r7.F = r3
            q.c r2 = r7.j(r10)
            r2.j()
            r2 = r21
            q.c r3 = r7.j(r2)
            r3.j()
            goto L_0x0400
        L_0x03fe:
            r2 = r21
        L_0x0400:
            r3 = 0
            int r5 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0409
            r5 = r22
            r7.f10905g0 = r5
        L_0x0409:
            float r5 = r8.F
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0411
            r7.f10907h0 = r5
        L_0x0411:
            if (r20 == 0) goto L_0x0422
            int r3 = r8.T
            r5 = -1
            if (r3 != r5) goto L_0x041c
            int r6 = r8.U
            if (r6 == r5) goto L_0x0422
        L_0x041c:
            int r5 = r8.U
            r7.f10895b0 = r3
            r7.f10897c0 = r5
        L_0x0422:
            boolean r3 = r8.f1056a0
            r5 = -2
            r6 = 3
            if (r3 != 0) goto L_0x0458
            int r3 = r8.width
            r9 = -1
            if (r3 != r9) goto L_0x044f
            boolean r3 = r8.W
            if (r3 == 0) goto L_0x0438
            r7.M(r6)
            r9 = r23
            r3 = 4
            goto L_0x043e
        L_0x0438:
            r3 = 4
            r7.M(r3)
            r9 = r23
        L_0x043e:
            q.c r9 = r7.j(r9)
            int r11 = r8.leftMargin
            r9.f10880g = r11
            q.c r4 = r7.j(r4)
            int r9 = r8.rightMargin
            r4.f10880g = r9
            goto L_0x046a
        L_0x044f:
            r3 = 4
            r7.M(r6)
            r4 = 0
            r7.O(r4)
            goto L_0x046a
        L_0x0458:
            r3 = 4
            r4 = 1
            r7.M(r4)
            int r4 = r8.width
            r7.O(r4)
            int r4 = r8.width
            if (r4 != r5) goto L_0x046a
            r4 = 2
            r7.M(r4)
        L_0x046a:
            boolean r4 = r8.f1058b0
            if (r4 != 0) goto L_0x0497
            int r4 = r8.height
            r9 = -1
            if (r4 != r9) goto L_0x048f
            boolean r4 = r8.X
            if (r4 == 0) goto L_0x047b
            r7.N(r6)
            goto L_0x047e
        L_0x047b:
            r7.N(r3)
        L_0x047e:
            q.c r3 = r7.j(r10)
            int r4 = r8.topMargin
            r3.f10880g = r4
            q.c r2 = r7.j(r2)
            int r3 = r8.bottomMargin
            r2.f10880g = r3
            goto L_0x04a9
        L_0x048f:
            r7.N(r6)
            r2 = 0
            r7.L(r2)
            goto L_0x04a9
        L_0x0497:
            r2 = 1
            r9 = -1
            r7.N(r2)
            int r2 = r8.height
            r7.L(r2)
            int r2 = r8.height
            if (r2 != r5) goto L_0x04a9
            r2 = 2
            r7.N(r2)
        L_0x04a9:
            java.lang.String r2 = r8.G
            if (r2 == 0) goto L_0x0540
            int r3 = r2.length()
            if (r3 != 0) goto L_0x04b5
            goto L_0x0540
        L_0x04b5:
            int r3 = r2.length()
            r4 = 44
            int r4 = r2.indexOf(r4)
            if (r4 <= 0) goto L_0x04e2
            int r5 = r3 + -1
            if (r4 >= r5) goto L_0x04e2
            r5 = 0
            java.lang.String r10 = r2.substring(r5, r4)
            java.lang.String r5 = "W"
            boolean r5 = r10.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04d4
            r5 = 0
            goto L_0x04df
        L_0x04d4:
            java.lang.String r5 = "H"
            boolean r5 = r10.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x04de
            r5 = 1
            goto L_0x04df
        L_0x04de:
            r5 = r9
        L_0x04df:
            int r4 = r4 + 1
            goto L_0x04e4
        L_0x04e2:
            r5 = r9
            r4 = 0
        L_0x04e4:
            r10 = 58
            int r10 = r2.indexOf(r10)
            if (r10 < 0) goto L_0x0526
            int r3 = r3 + -1
            if (r10 >= r3) goto L_0x0526
            java.lang.String r3 = r2.substring(r4, r10)
            int r10 = r10 + 1
            java.lang.String r2 = r2.substring(r10)
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0535
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x0535
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x0535 }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0535 }
            r4 = 0
            int r10 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0535
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0535
            r4 = 1
            if (r5 != r4) goto L_0x0520
            float r2 = r2 / r3
            float r2 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0535 }
            goto L_0x0536
        L_0x0520:
            float r3 = r3 / r2
            float r2 = java.lang.Math.abs(r3)     // Catch:{ NumberFormatException -> 0x0535 }
            goto L_0x0536
        L_0x0526:
            java.lang.String r2 = r2.substring(r4)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0535
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0535 }
            goto L_0x0536
        L_0x0535:
            r2 = 0
        L_0x0536:
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0543
            r7.Z = r2
            r7.f10893a0 = r5
            goto L_0x0543
        L_0x0540:
            r3 = 0
            r7.Z = r3
        L_0x0543:
            float r2 = r8.H
            float[] r3 = r7.f10918n0
            r4 = 0
            r3[r4] = r2
            float r2 = r8.I
            r5 = 1
            r3[r5] = r2
            int r2 = r8.J
            r7.f10914l0 = r2
            int r2 = r8.K
            r7.f10916m0 = r2
            int r2 = r8.Z
            if (r2 < 0) goto L_0x055f
            if (r2 > r6) goto L_0x055f
            r7.f10924r = r2
        L_0x055f:
            int r2 = r8.L
            int r3 = r8.N
            int r6 = r8.P
            float r10 = r8.R
            r7.f10926s = r2
            r7.f10928v = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r3) goto L_0x0571
            r6 = r4
        L_0x0571:
            r7.w = r6
            r7.f10929x = r10
            r6 = 0
            int r11 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r11 <= 0) goto L_0x0585
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0585
            if (r2 != 0) goto L_0x0585
            r2 = 2
            r7.f10926s = r2
        L_0x0585:
            int r2 = r8.M
            int r10 = r8.O
            int r11 = r8.Q
            float r8 = r8.S
            r7.f10927t = r2
            r7.f10930y = r10
            if (r11 != r3) goto L_0x0594
            r11 = r4
        L_0x0594:
            r7.f10931z = r11
            r7.A = r8
            r3 = 0
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x05a7
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x05a7
            if (r2 != 0) goto L_0x05a7
            r2 = 2
            r7.f10927t = r2
            goto L_0x05a8
        L_0x05a7:
            r2 = 2
        L_0x05a8:
            int r3 = r19 + 1
            r10 = r2
            r9 = r3
            r6 = r17
            r2 = r18
            r4 = r20
            goto L_0x01e2
        L_0x05b4:
            r18 = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.h():boolean");
    }

    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            d dVar = aVar.f1086q0;
            if ((childAt.getVisibility() != 8 || aVar.f1062d0 || aVar.f1064e0 || isInEditMode) && !aVar.f1066f0) {
                int s10 = dVar.s();
                int t10 = dVar.t();
                int r4 = dVar.r() + s10;
                int l6 = dVar.l() + t10;
                childAt.layout(s10, t10, r4, l6);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s10, t10, r4, l6);
                }
            }
        }
        int size = this.f1042b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f1042b.get(i15).getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x079d  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x07ea  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ea A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r0.f1048h
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0023
            int r3 = r24.getChildCount()
            r6 = r4
        L_0x0011:
            if (r6 >= r3) goto L_0x0023
            android.view.View r7 = r0.getChildAt(r6)
            boolean r7 = r7.isLayoutRequested()
            if (r7 == 0) goto L_0x0020
            r0.f1048h = r5
            goto L_0x0023
        L_0x0020:
            int r6 = r6 + 1
            goto L_0x0011
        L_0x0023:
            q.e r3 = r0.f1043c
            boolean r5 = r24.e()
            r3.f10935x0 = r5
            boolean r3 = r0.f1048h
            if (r3 == 0) goto L_0x003e
            r0.f1048h = r4
            boolean r3 = r24.h()
            if (r3 == 0) goto L_0x003e
            q.e r3 = r0.f1043c
            r.b r5 = r3.f10932t0
            r5.c(r3)
        L_0x003e:
            q.e r3 = r0.f1043c
            int r5 = r0.f1049i
            int r6 = android.view.View.MeasureSpec.getMode(r25)
            int r7 = android.view.View.MeasureSpec.getSize(r25)
            int r8 = android.view.View.MeasureSpec.getMode(r26)
            int r9 = android.view.View.MeasureSpec.getSize(r26)
            int r10 = r24.getPaddingTop()
            int r10 = java.lang.Math.max(r4, r10)
            int r11 = r24.getPaddingBottom()
            int r11 = java.lang.Math.max(r4, r11)
            int r12 = r10 + r11
            int r13 = r24.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r14 = r0.f1054o
            r14.f1096b = r10
            r14.f1097c = r11
            r14.f1098d = r13
            r14.f1099e = r12
            r14.f1100f = r1
            r14.f1101g = r2
            int r11 = r24.getPaddingStart()
            int r11 = java.lang.Math.max(r4, r11)
            int r14 = r24.getPaddingEnd()
            int r14 = java.lang.Math.max(r4, r14)
            if (r11 > 0) goto L_0x0094
            if (r14 <= 0) goto L_0x008b
            goto L_0x0094
        L_0x008b:
            int r11 = r24.getPaddingLeft()
            int r11 = java.lang.Math.max(r4, r11)
            goto L_0x009b
        L_0x0094:
            boolean r4 = r24.e()
            if (r4 == 0) goto L_0x009b
            r11 = r14
        L_0x009b:
            int r7 = r7 - r13
            int r9 = r9 - r12
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = r0.f1054o
            int r12 = r4.f1099e
            int r4 = r4.f1098d
            int r13 = r24.getChildCount()
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r6 == r14) goto L_0x00c7
            if (r6 == 0) goto L_0x00bd
            if (r6 == r15) goto L_0x00b3
            r15 = 1
            goto L_0x00c1
        L_0x00b3:
            int r15 = r0.f1046f
            int r15 = r15 - r4
            int r15 = java.lang.Math.min(r15, r7)
            r16 = 1
            goto L_0x00d7
        L_0x00bd:
            if (r13 != 0) goto L_0x00c0
            goto L_0x00c9
        L_0x00c0:
            r15 = 2
        L_0x00c1:
            r16 = 0
            r2 = r15
            r15 = r16
            goto L_0x00d9
        L_0x00c7:
            if (r13 != 0) goto L_0x00d2
        L_0x00c9:
            int r14 = r0.f1044d
            r15 = 0
            int r14 = java.lang.Math.max(r15, r14)
            r15 = r14
            goto L_0x00d3
        L_0x00d2:
            r15 = r7
        L_0x00d3:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = 2
        L_0x00d7:
            r2 = r16
        L_0x00d9:
            if (r8 == r14) goto L_0x00f7
            if (r8 == 0) goto L_0x00ec
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r13) goto L_0x00e3
            r13 = 1
            goto L_0x00f0
        L_0x00e3:
            int r13 = r0.f1047g
            int r13 = r13 - r12
            int r13 = java.lang.Math.min(r13, r9)
            r14 = 1
            goto L_0x0103
        L_0x00ec:
            if (r13 != 0) goto L_0x00ef
            goto L_0x00f9
        L_0x00ef:
            r13 = 2
        L_0x00f0:
            r14 = 0
            r23 = r14
            r14 = r13
            r13 = r23
            goto L_0x0103
        L_0x00f7:
            if (r13 != 0) goto L_0x0101
        L_0x00f9:
            int r13 = r0.f1045e
            r14 = 0
            int r13 = java.lang.Math.max(r14, r13)
            goto L_0x0102
        L_0x0101:
            r13 = r9
        L_0x0102:
            r14 = 2
        L_0x0103:
            int r1 = r3.r()
            if (r15 != r1) goto L_0x0114
            int r1 = r3.l()
            if (r13 == r1) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            r1 = 0
            r16 = r9
            goto L_0x011c
        L_0x0114:
            r.e r1 = r3.u0
            r16 = r9
            r9 = 1
            r1.f11417c = r9
            r1 = 0
        L_0x011c:
            r3.f10895b0 = r1
            r3.f10897c0 = r1
            int r9 = r0.f1046f
            int r9 = r9 - r4
            r17 = r7
            int[] r7 = r3.D
            r7[r1] = r9
            int r9 = r0.f1047g
            int r9 = r9 - r12
            r18 = 1
            r7[r18] = r9
            r3.f10901e0 = r1
            r3.f10903f0 = r1
            r3.M(r2)
            r3.O(r15)
            r3.N(r14)
            r3.L(r13)
            int r1 = r0.f1044d
            int r1 = r1 - r4
            if (r1 >= 0) goto L_0x0146
            r1 = 0
        L_0x0146:
            r3.f10901e0 = r1
            int r1 = r0.f1045e
            int r1 = r1 - r12
            if (r1 >= 0) goto L_0x014e
            r1 = 0
        L_0x014e:
            r3.f10903f0 = r1
            r3.f10937z0 = r11
            r3.A0 = r10
            r.b r1 = r3.f10932t0
            r1.getClass()
            q.c$a r2 = q.c.a.BOTTOM
            q.c$a r4 = q.c.a.RIGHT
            r.b$b r9 = r3.f10934w0
            java.util.ArrayList<q.d> r10 = r3.f10970s0
            int r10 = r10.size()
            int r11 = r3.r()
            int r12 = r3.l()
            r13 = 128(0x80, float:1.794E-43)
            boolean r13 = androidx.lifecycle.c0.g(r5, r13)
            r14 = 64
            if (r13 != 0) goto L_0x0180
            boolean r5 = androidx.lifecycle.c0.g(r5, r14)
            if (r5 == 0) goto L_0x017e
            goto L_0x0180
        L_0x017e:
            r5 = 0
            goto L_0x0181
        L_0x0180:
            r5 = 1
        L_0x0181:
            if (r5 == 0) goto L_0x01e2
            r14 = 0
        L_0x0184:
            if (r14 >= r10) goto L_0x01e2
            java.util.ArrayList<q.d> r15 = r3.f10970s0
            java.lang.Object r15 = r15.get(r14)
            q.d r15 = (q.d) r15
            int[] r7 = r15.V
            r19 = 0
            r20 = r5
            r5 = r7[r19]
            r0 = 3
            if (r5 != r0) goto L_0x019b
            r5 = 1
            goto L_0x019c
        L_0x019b:
            r5 = 0
        L_0x019c:
            r18 = 1
            r7 = r7[r18]
            if (r7 != r0) goto L_0x01a4
            r7 = 1
            goto L_0x01a5
        L_0x01a4:
            r7 = 0
        L_0x01a5:
            if (r5 == 0) goto L_0x01b2
            if (r7 == 0) goto L_0x01b2
            float r5 = r15.Z
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x01b2
            r5 = 1
            goto L_0x01b3
        L_0x01b2:
            r5 = 0
        L_0x01b3:
            boolean r7 = r15.y()
            if (r7 == 0) goto L_0x01bc
            if (r5 == 0) goto L_0x01bc
            goto L_0x01de
        L_0x01bc:
            boolean r7 = r15.z()
            if (r7 == 0) goto L_0x01c5
            if (r5 == 0) goto L_0x01c5
            goto L_0x01de
        L_0x01c5:
            boolean r5 = r15 instanceof q.j
            if (r5 == 0) goto L_0x01ca
            goto L_0x01de
        L_0x01ca:
            boolean r5 = r15.y()
            if (r5 != 0) goto L_0x01de
            boolean r5 = r15.z()
            if (r5 == 0) goto L_0x01d7
            goto L_0x01de
        L_0x01d7:
            int r14 = r14 + 1
            r0 = r24
            r5 = r20
            goto L_0x0184
        L_0x01de:
            r0 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            goto L_0x01e8
        L_0x01e2:
            r20 = r5
            r0 = 1073741824(0x40000000, float:2.0)
            r5 = r20
        L_0x01e8:
            if (r6 != r0) goto L_0x01ec
            if (r8 == r0) goto L_0x01ee
        L_0x01ec:
            if (r13 == 0) goto L_0x01f0
        L_0x01ee:
            r0 = 1
            goto L_0x01f1
        L_0x01f0:
            r0 = 0
        L_0x01f1:
            r0 = r0 & r5
            if (r0 == 0) goto L_0x04a0
            int[] r5 = r3.D
            r7 = 0
            r5 = r5[r7]
            r7 = r17
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r3.D
            r14 = 1
            r7 = r7[r14]
            r15 = r16
            int r7 = java.lang.Math.min(r7, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r6 != r15) goto L_0x021d
            int r15 = r3.r()
            if (r15 == r5) goto L_0x021b
            r3.O(r5)
            r.e r5 = r3.u0
            r5.f11416b = r14
        L_0x021b:
            r15 = 1073741824(0x40000000, float:2.0)
        L_0x021d:
            if (r8 != r15) goto L_0x022e
            int r5 = r3.l()
            if (r5 == r7) goto L_0x022e
            r3.L(r7)
            r.e r5 = r3.u0
            r7 = 1
            r5.f11416b = r7
            goto L_0x022f
        L_0x022e:
            r7 = 1
        L_0x022f:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r6 != r5) goto L_0x03f0
            if (r8 != r5) goto L_0x03f0
            r.e r5 = r3.u0
            r7 = r7 & r13
            boolean r13 = r5.f11416b
            if (r13 != 0) goto L_0x0243
            boolean r13 = r5.f11417c
            if (r13 == 0) goto L_0x0241
            goto L_0x0243
        L_0x0241:
            r13 = 0
            goto L_0x0281
        L_0x0243:
            q.e r13 = r5.f11415a
            java.util.ArrayList<q.d> r13 = r13.f10970s0
            java.util.Iterator r13 = r13.iterator()
        L_0x024b:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0268
            java.lang.Object r14 = r13.next()
            q.d r14 = (q.d) r14
            r14.i()
            r15 = 0
            r14.f10892a = r15
            r.l r15 = r14.f10898d
            r15.n()
            r.n r14 = r14.f10900e
            r14.m()
            goto L_0x024b
        L_0x0268:
            q.e r13 = r5.f11415a
            r13.i()
            q.e r13 = r5.f11415a
            r14 = 0
            r13.f10892a = r14
            r.l r13 = r13.f10898d
            r13.n()
            q.e r13 = r5.f11415a
            r.n r13 = r13.f10900e
            r13.m()
            r5.f11417c = r14
            r13 = r14
        L_0x0281:
            q.e r14 = r5.f11418d
            r5.b(r14)
            q.e r14 = r5.f11415a
            r14.f10895b0 = r13
            r14.f10897c0 = r13
            int r13 = r14.k(r13)
            q.e r14 = r5.f11415a
            r15 = 1
            int r14 = r14.k(r15)
            boolean r15 = r5.f11416b
            if (r15 == 0) goto L_0x029e
            r5.c()
        L_0x029e:
            q.e r15 = r5.f11415a
            int r15 = r15.s()
            r16 = r0
            q.e r0 = r5.f11415a
            int r0 = r0.t()
            r17 = r2
            q.e r2 = r5.f11415a
            r.l r2 = r2.f10898d
            r.f r2 = r2.f11452h
            r2.d(r15)
            q.e r2 = r5.f11415a
            r.n r2 = r2.f10900e
            r.f r2 = r2.f11452h
            r2.d(r0)
            r5.g()
            r2 = 2
            if (r13 == r2) goto L_0x02cc
            if (r14 != r2) goto L_0x02c9
            goto L_0x02cc
        L_0x02c9:
            r18 = r4
            goto L_0x032f
        L_0x02cc:
            if (r7 == 0) goto L_0x02e7
            java.util.ArrayList<r.p> r2 = r5.f11419e
            java.util.Iterator r2 = r2.iterator()
        L_0x02d4:
            boolean r18 = r2.hasNext()
            if (r18 == 0) goto L_0x02e7
            java.lang.Object r18 = r2.next()
            r.p r18 = (r.p) r18
            boolean r18 = r18.k()
            if (r18 != 0) goto L_0x02d4
            r7 = 0
        L_0x02e7:
            if (r7 == 0) goto L_0x030c
            r2 = 2
            if (r13 != r2) goto L_0x030c
            q.e r2 = r5.f11415a
            r18 = r4
            r4 = 1
            r2.M(r4)
            q.e r2 = r5.f11415a
            r4 = 0
            int r4 = r5.d(r2, r4)
            r2.O(r4)
            q.e r2 = r5.f11415a
            r.l r4 = r2.f10898d
            r.g r4 = r4.f11449e
            int r2 = r2.r()
            r4.d(r2)
            goto L_0x030e
        L_0x030c:
            r18 = r4
        L_0x030e:
            if (r7 == 0) goto L_0x032f
            r2 = 2
            if (r14 != r2) goto L_0x032f
            q.e r2 = r5.f11415a
            r4 = 1
            r2.N(r4)
            q.e r2 = r5.f11415a
            int r4 = r5.d(r2, r4)
            r2.L(r4)
            q.e r2 = r5.f11415a
            r.n r4 = r2.f10900e
            r.g r4 = r4.f11449e
            int r2 = r2.l()
            r4.d(r2)
        L_0x032f:
            q.e r2 = r5.f11415a
            int[] r4 = r2.V
            r7 = 0
            r4 = r4[r7]
            r7 = 1
            if (r4 == r7) goto L_0x033f
            r7 = 4
            if (r4 != r7) goto L_0x033d
            goto L_0x033f
        L_0x033d:
            r0 = 0
            goto L_0x0382
        L_0x033f:
            int r2 = r2.r()
            int r2 = r2 + r15
            q.e r4 = r5.f11415a
            r.l r4 = r4.f10898d
            r.f r4 = r4.f11453i
            r4.d(r2)
            q.e r4 = r5.f11415a
            r.l r4 = r4.f10898d
            r.g r4 = r4.f11449e
            int r2 = r2 - r15
            r4.d(r2)
            r5.g()
            q.e r2 = r5.f11415a
            int[] r4 = r2.V
            r7 = 1
            r4 = r4[r7]
            if (r4 == r7) goto L_0x0366
            r7 = 4
            if (r4 != r7) goto L_0x037e
        L_0x0366:
            int r2 = r2.l()
            int r2 = r2 + r0
            q.e r4 = r5.f11415a
            r.n r4 = r4.f10900e
            r.f r4 = r4.f11453i
            r4.d(r2)
            q.e r4 = r5.f11415a
            r.n r4 = r4.f10900e
            r.g r4 = r4.f11449e
            int r2 = r2 - r0
            r4.d(r2)
        L_0x037e:
            r5.g()
            r0 = 1
        L_0x0382:
            java.util.ArrayList<r.p> r2 = r5.f11419e
            java.util.Iterator r2 = r2.iterator()
        L_0x0388:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03a3
            java.lang.Object r4 = r2.next()
            r.p r4 = (r.p) r4
            q.d r7 = r4.f11446b
            q.e r15 = r5.f11415a
            if (r7 != r15) goto L_0x039f
            boolean r7 = r4.f11451g
            if (r7 != 0) goto L_0x039f
            goto L_0x0388
        L_0x039f:
            r4.e()
            goto L_0x0388
        L_0x03a3:
            java.util.ArrayList<r.p> r2 = r5.f11419e
            java.util.Iterator r2 = r2.iterator()
        L_0x03a9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03e0
            java.lang.Object r4 = r2.next()
            r.p r4 = (r.p) r4
            if (r0 != 0) goto L_0x03be
            q.d r7 = r4.f11446b
            q.e r15 = r5.f11415a
            if (r7 != r15) goto L_0x03be
            goto L_0x03a9
        L_0x03be:
            r.f r7 = r4.f11452h
            boolean r7 = r7.f11432j
            if (r7 != 0) goto L_0x03c5
            goto L_0x03de
        L_0x03c5:
            r.f r7 = r4.f11453i
            boolean r7 = r7.f11432j
            if (r7 != 0) goto L_0x03d0
            boolean r7 = r4 instanceof r.j
            if (r7 != 0) goto L_0x03d0
            goto L_0x03de
        L_0x03d0:
            r.g r7 = r4.f11449e
            boolean r7 = r7.f11432j
            if (r7 != 0) goto L_0x03a9
            boolean r7 = r4 instanceof r.c
            if (r7 != 0) goto L_0x03a9
            boolean r4 = r4 instanceof r.j
            if (r4 != 0) goto L_0x03a9
        L_0x03de:
            r0 = 0
            goto L_0x03e1
        L_0x03e0:
            r0 = 1
        L_0x03e1:
            q.e r2 = r5.f11415a
            r2.M(r13)
            q.e r2 = r5.f11415a
            r2.N(r14)
            r2 = 1073741824(0x40000000, float:2.0)
            r4 = 2
            goto L_0x0490
        L_0x03f0:
            r16 = r0
            r17 = r2
            r18 = r4
            r.e r0 = r3.u0
            boolean r2 = r0.f11416b
            if (r2 == 0) goto L_0x0453
            q.e r2 = r0.f11415a
            java.util.ArrayList<q.d> r2 = r2.f10970s0
            java.util.Iterator r2 = r2.iterator()
        L_0x0404:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x042d
            java.lang.Object r4 = r2.next()
            q.d r4 = (q.d) r4
            r4.i()
            r5 = 0
            r4.f10892a = r5
            r.l r7 = r4.f10898d
            r.g r14 = r7.f11449e
            r14.f11432j = r5
            r7.f11451g = r5
            r7.n()
            r.n r4 = r4.f10900e
            r.g r7 = r4.f11449e
            r7.f11432j = r5
            r4.f11451g = r5
            r4.m()
            goto L_0x0404
        L_0x042d:
            r2 = 0
            q.e r4 = r0.f11415a
            r4.i()
            q.e r4 = r0.f11415a
            r4.f10892a = r2
            r.l r4 = r4.f10898d
            r.g r5 = r4.f11449e
            r5.f11432j = r2
            r4.f11451g = r2
            r4.n()
            q.e r4 = r0.f11415a
            r.n r4 = r4.f10900e
            r.g r5 = r4.f11449e
            r5.f11432j = r2
            r4.f11451g = r2
            r4.m()
            r0.c()
            goto L_0x0454
        L_0x0453:
            r2 = 0
        L_0x0454:
            q.e r4 = r0.f11418d
            r0.b(r4)
            q.e r4 = r0.f11415a
            r4.f10895b0 = r2
            r4.f10897c0 = r2
            r.l r4 = r4.f10898d
            r.f r4 = r4.f11452h
            r4.d(r2)
            q.e r0 = r0.f11415a
            r.n r0 = r0.f10900e
            r.f r0 = r0.f11452h
            r0.d(r2)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 != r0) goto L_0x047c
            boolean r2 = r3.U(r2, r13)
            r4 = 1
            r2 = r2 & 1
            r5 = r4
            goto L_0x0480
        L_0x047c:
            r4 = 1
            r2 = 0
            r5 = r2
            r2 = r4
        L_0x0480:
            if (r8 != r0) goto L_0x048a
            boolean r4 = r3.U(r4, r13)
            r2 = r2 & r4
            int r4 = r5 + 1
            goto L_0x048b
        L_0x048a:
            r4 = r5
        L_0x048b:
            r23 = r2
            r2 = r0
            r0 = r23
        L_0x0490:
            if (r0 == 0) goto L_0x04a8
            if (r6 != r2) goto L_0x0496
            r5 = 1
            goto L_0x0497
        L_0x0496:
            r5 = 0
        L_0x0497:
            if (r8 != r2) goto L_0x049b
            r2 = 1
            goto L_0x049c
        L_0x049b:
            r2 = 0
        L_0x049c:
            r3.P(r5, r2)
            goto L_0x04a8
        L_0x04a0:
            r16 = r0
            r17 = r2
            r18 = r4
            r0 = 0
            r4 = 0
        L_0x04a8:
            if (r0 == 0) goto L_0x04ad
            r0 = 2
            if (r4 == r0) goto L_0x07ac
        L_0x04ad:
            int r0 = r3.F0
            if (r10 <= 0) goto L_0x05c8
            java.util.ArrayList<q.d> r2 = r3.f10970s0
            int r2 = r2.size()
            r4 = 64
            boolean r4 = r3.W(r4)
            r.b$b r5 = r3.f10934w0
            r6 = 0
        L_0x04c0:
            if (r6 >= r2) goto L_0x0552
            java.util.ArrayList<q.d> r7 = r3.f10970s0
            java.lang.Object r7 = r7.get(r6)
            q.d r7 = (q.d) r7
            boolean r8 = r7 instanceof q.g
            if (r8 == 0) goto L_0x04cf
            goto L_0x04ef
        L_0x04cf:
            boolean r8 = r7 instanceof q.a
            if (r8 == 0) goto L_0x04d4
            goto L_0x04ef
        L_0x04d4:
            boolean r8 = r7.H
            if (r8 == 0) goto L_0x04d9
            goto L_0x04ef
        L_0x04d9:
            if (r4 == 0) goto L_0x04f2
            r.l r8 = r7.f10898d
            if (r8 == 0) goto L_0x04f2
            r.n r13 = r7.f10900e
            if (r13 == 0) goto L_0x04f2
            r.g r8 = r8.f11449e
            boolean r8 = r8.f11432j
            if (r8 == 0) goto L_0x04f2
            r.g r8 = r13.f11449e
            boolean r8 = r8.f11432j
            if (r8 == 0) goto L_0x04f2
        L_0x04ef:
            r19 = r2
            goto L_0x054c
        L_0x04f2:
            r8 = 0
            int r8 = r7.k(r8)
            r13 = 1
            int r14 = r7.k(r13)
            r15 = 3
            r19 = r2
            if (r8 != r15) goto L_0x050d
            int r2 = r7.f10926s
            if (r2 == r13) goto L_0x050d
            if (r14 != r15) goto L_0x050d
            int r2 = r7.f10927t
            if (r2 == r13) goto L_0x050d
            r2 = r13
            goto L_0x050e
        L_0x050d:
            r2 = 0
        L_0x050e:
            if (r2 != 0) goto L_0x0545
            boolean r13 = r3.W(r13)
            if (r13 == 0) goto L_0x0545
            boolean r13 = r7 instanceof q.j
            if (r13 != 0) goto L_0x0545
            r13 = 3
            if (r8 != r13) goto L_0x052a
            int r15 = r7.f10926s
            if (r15 != 0) goto L_0x052a
            if (r14 == r13) goto L_0x052a
            boolean r15 = r7.y()
            if (r15 != 0) goto L_0x052a
            r2 = 1
        L_0x052a:
            if (r14 != r13) goto L_0x0539
            int r15 = r7.f10927t
            if (r15 != 0) goto L_0x0539
            if (r8 == r13) goto L_0x0539
            boolean r15 = r7.y()
            if (r15 != 0) goto L_0x0539
            r2 = 1
        L_0x0539:
            if (r8 == r13) goto L_0x053d
            if (r14 != r13) goto L_0x0545
        L_0x053d:
            float r8 = r7.Z
            r13 = 0
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0545
            r2 = 1
        L_0x0545:
            if (r2 == 0) goto L_0x0548
            goto L_0x054c
        L_0x0548:
            r2 = 0
            r1.a(r2, r7, r5)
        L_0x054c:
            int r6 = r6 + 1
            r2 = r19
            goto L_0x04c0
        L_0x0552:
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.b) r5
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f1095a
            int r2 = r2.getChildCount()
            r4 = 0
        L_0x055b:
            if (r4 >= r2) goto L_0x05ab
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.f1095a
            android.view.View r6 = r6.getChildAt(r4)
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.e
            if (r7 == 0) goto L_0x05a8
            androidx.constraintlayout.widget.e r6 = (androidx.constraintlayout.widget.e) r6
            android.view.View r7 = r6.f1210b
            if (r7 != 0) goto L_0x056e
            goto L_0x05a8
        L_0x056e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.a) r7
            android.view.View r6 = r6.f1210b
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r6 = (androidx.constraintlayout.widget.ConstraintLayout.a) r6
            q.d r8 = r6.f1086q0
            r13 = 0
            r8.f10911j0 = r13
            q.d r14 = r7.f1086q0
            int[] r15 = r14.V
            r13 = r15[r13]
            r15 = 1
            if (r13 == r15) goto L_0x0591
            int r8 = r8.r()
            r14.O(r8)
        L_0x0591:
            q.d r7 = r7.f1086q0
            int[] r8 = r7.V
            r8 = r8[r15]
            if (r8 == r15) goto L_0x05a2
            q.d r8 = r6.f1086q0
            int r8 = r8.l()
            r7.L(r8)
        L_0x05a2:
            q.d r6 = r6.f1086q0
            r7 = 8
            r6.f10911j0 = r7
        L_0x05a8:
            int r4 = r4 + 1
            goto L_0x055b
        L_0x05ab:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.f1095a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r2 = r2.f1042b
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x05c8
            r4 = 0
        L_0x05b6:
            if (r4 >= r2) goto L_0x05c8
            androidx.constraintlayout.widget.ConstraintLayout r6 = r5.f1095a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r6 = r6.f1042b
            java.lang.Object r6 = r6.get(r4)
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.a) r6
            r6.getClass()
            int r4 = r4 + 1
            goto L_0x05b6
        L_0x05c8:
            r1.c(r3)
            java.util.ArrayList<q.d> r2 = r1.f11401a
            int r2 = r2.size()
            r4 = 0
            if (r10 <= 0) goto L_0x05d7
            r1.b(r3, r4, r11, r12)
        L_0x05d7:
            if (r2 <= 0) goto L_0x079d
            int[] r5 = r3.V
            r4 = r5[r4]
            r6 = 2
            if (r4 != r6) goto L_0x05e2
            r4 = 1
            goto L_0x05e3
        L_0x05e2:
            r4 = 0
        L_0x05e3:
            r7 = 1
            r5 = r5[r7]
            if (r5 != r6) goto L_0x05ea
            r5 = 1
            goto L_0x05eb
        L_0x05ea:
            r5 = 0
        L_0x05eb:
            int r6 = r3.r()
            q.e r7 = r1.f11403c
            int r7 = r7.f10901e0
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = r3.l()
            q.e r8 = r1.f11403c
            int r8 = r8.f10903f0
            int r7 = java.lang.Math.max(r7, r8)
            r8 = 0
            r10 = 0
        L_0x0605:
            if (r8 >= r2) goto L_0x06a5
            java.util.ArrayList<q.d> r13 = r1.f11401a
            java.lang.Object r13 = r13.get(r8)
            q.d r13 = (q.d) r13
            boolean r14 = r13 instanceof q.j
            if (r14 != 0) goto L_0x061b
            r19 = r0
            r15 = r17
            r14 = r18
            goto L_0x069b
        L_0x061b:
            int r14 = r13.r()
            int r15 = r13.l()
            r19 = r0
            r0 = 1
            boolean r0 = r1.a(r0, r13, r9)
            r0 = r0 | r10
            int r10 = r13.r()
            r20 = r0
            int r0 = r13.l()
            if (r10 == r14) goto L_0x0663
            r13.O(r10)
            if (r4 == 0) goto L_0x065d
            int r10 = r13.s()
            int r14 = r13.X
            int r10 = r10 + r14
            if (r10 <= r6) goto L_0x065d
            int r10 = r13.s()
            int r14 = r13.X
            int r10 = r10 + r14
            r14 = r18
            q.c r18 = r13.j(r14)
            int r18 = r18.e()
            int r10 = r18 + r10
            int r6 = java.lang.Math.max(r6, r10)
            goto L_0x065f
        L_0x065d:
            r14 = r18
        L_0x065f:
            r10 = 1
            r20 = r10
            goto L_0x0665
        L_0x0663:
            r14 = r18
        L_0x0665:
            if (r0 == r15) goto L_0x0692
            r13.L(r0)
            if (r5 == 0) goto L_0x068d
            int r0 = r13.t()
            int r10 = r13.Y
            int r0 = r0 + r10
            if (r0 <= r7) goto L_0x068d
            int r0 = r13.t()
            int r10 = r13.Y
            int r0 = r0 + r10
            r15 = r17
            q.c r10 = r13.j(r15)
            int r10 = r10.e()
            int r10 = r10 + r0
            int r0 = java.lang.Math.max(r7, r10)
            r7 = r0
            goto L_0x068f
        L_0x068d:
            r15 = r17
        L_0x068f:
            r20 = 1
            goto L_0x0694
        L_0x0692:
            r15 = r17
        L_0x0694:
            q.j r13 = (q.j) r13
            boolean r0 = r13.A0
            r0 = r0 | r20
            r10 = r0
        L_0x069b:
            int r8 = r8 + 1
            r18 = r14
            r17 = r15
            r0 = r19
            goto L_0x0605
        L_0x06a5:
            r19 = r0
            r15 = r17
            r14 = r18
            r0 = 0
            r8 = 2
        L_0x06ad:
            if (r0 >= r8) goto L_0x079f
            r8 = 0
        L_0x06b0:
            if (r8 >= r2) goto L_0x0777
            java.util.ArrayList<q.d> r13 = r1.f11401a
            java.lang.Object r13 = r13.get(r8)
            q.d r13 = (q.d) r13
            r17 = r2
            boolean r2 = r13 instanceof q.h
            if (r2 == 0) goto L_0x06c4
            boolean r2 = r13 instanceof q.j
            if (r2 == 0) goto L_0x06c8
        L_0x06c4:
            boolean r2 = r13 instanceof q.g
            if (r2 == 0) goto L_0x06cb
        L_0x06c8:
            r18 = r3
            goto L_0x06eb
        L_0x06cb:
            int r2 = r13.f10911j0
            r18 = r3
            r3 = 8
            if (r2 != r3) goto L_0x06d4
            goto L_0x06eb
        L_0x06d4:
            if (r16 == 0) goto L_0x06e7
            r.l r2 = r13.f10898d
            r.g r2 = r2.f11449e
            boolean r2 = r2.f11432j
            if (r2 == 0) goto L_0x06e7
            r.n r2 = r13.f10900e
            r.g r2 = r2.f11449e
            boolean r2 = r2.f11432j
            if (r2 == 0) goto L_0x06e7
            goto L_0x06eb
        L_0x06e7:
            boolean r2 = r13 instanceof q.j
            if (r2 == 0) goto L_0x06f3
        L_0x06eb:
            r22 = r9
            r20 = r11
            r21 = r12
            goto L_0x0769
        L_0x06f3:
            int r2 = r13.r()
            int r3 = r13.l()
            r20 = r11
            int r11 = r13.f10899d0
            r21 = r12
            r12 = 1
            if (r0 != r12) goto L_0x0705
            r12 = 2
        L_0x0705:
            boolean r12 = r1.a(r12, r13, r9)
            r10 = r10 | r12
            int r12 = r13.r()
            r22 = r9
            int r9 = r13.l()
            if (r12 == r2) goto L_0x0739
            r13.O(r12)
            if (r4 == 0) goto L_0x0738
            int r2 = r13.s()
            int r10 = r13.X
            int r2 = r2 + r10
            if (r2 <= r6) goto L_0x0738
            int r2 = r13.s()
            int r10 = r13.X
            int r2 = r2 + r10
            q.c r10 = r13.j(r14)
            int r10 = r10.e()
            int r10 = r10 + r2
            int r6 = java.lang.Math.max(r6, r10)
        L_0x0738:
            r10 = 1
        L_0x0739:
            if (r9 == r3) goto L_0x075f
            r13.L(r9)
            if (r5 == 0) goto L_0x075e
            int r2 = r13.t()
            int r3 = r13.Y
            int r2 = r2 + r3
            if (r2 <= r7) goto L_0x075e
            int r2 = r13.t()
            int r3 = r13.Y
            int r2 = r2 + r3
            q.c r3 = r13.j(r15)
            int r3 = r3.e()
            int r3 = r3 + r2
            int r2 = java.lang.Math.max(r7, r3)
            r7 = r2
        L_0x075e:
            r10 = 1
        L_0x075f:
            boolean r2 = r13.F
            if (r2 == 0) goto L_0x0769
            int r2 = r13.f10899d0
            if (r11 == r2) goto L_0x0769
            r2 = 1
            r10 = r2
        L_0x0769:
            int r8 = r8 + 1
            r2 = r17
            r3 = r18
            r11 = r20
            r12 = r21
            r9 = r22
            goto L_0x06b0
        L_0x0777:
            r17 = r2
            r18 = r3
            r22 = r9
            r20 = r11
            r21 = r12
            if (r10 == 0) goto L_0x079a
            int r0 = r0 + 1
            r2 = r18
            r3 = r20
            r8 = r21
            r1.b(r2, r0, r3, r8)
            r10 = 0
            r9 = 2
            r11 = r3
            r12 = r8
            r8 = r9
            r9 = r22
            r3 = r2
            r2 = r17
            goto L_0x06ad
        L_0x079a:
            r2 = r18
            goto L_0x07a0
        L_0x079d:
            r19 = r0
        L_0x079f:
            r2 = r3
        L_0x07a0:
            r0 = r19
            r2.F0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r2.W(r0)
            o.d.f10425p = r0
        L_0x07ac:
            r0 = r24
            q.e r1 = r0.f1043c
            int r1 = r1.r()
            q.e r2 = r0.f1043c
            int r2 = r2.l()
            q.e r3 = r0.f1043c
            boolean r4 = r3.G0
            boolean r3 = r3.H0
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = r0.f1054o
            int r6 = r5.f1099e
            int r5 = r5.f1098d
            int r1 = r1 + r5
            int r2 = r2 + r6
            r5 = 0
            r6 = r25
            int r1 = android.view.View.resolveSizeAndState(r1, r6, r5)
            r6 = r26
            int r2 = android.view.View.resolveSizeAndState(r2, r6, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r5
            r2 = r2 & r5
            int r5 = r0.f1046f
            int r1 = java.lang.Math.min(r5, r1)
            int r5 = r0.f1047g
            int r2 = java.lang.Math.min(r5, r2)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == 0) goto L_0x07eb
            r1 = r1 | r5
        L_0x07eb:
            if (r3 == 0) goto L_0x07ee
            r2 = r2 | r5
        L_0x07ee:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d c10 = c(view);
        if ((view instanceof d) && !(c10 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.f1086q0 = gVar;
            aVar.f1062d0 = true;
            gVar.R(aVar.V);
        }
        if (view instanceof a) {
            a aVar2 = (a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f1064e0 = true;
            if (!this.f1042b.contains(aVar2)) {
                this.f1042b.add(aVar2);
            }
        }
        this.f1041a.put(view.getId(), view);
        this.f1048h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1041a.remove(view.getId());
        d c10 = c(view);
        this.f1043c.f10970s0.remove(c10);
        c10.D();
        this.f1042b.remove(view);
        this.f1048h = true;
    }

    public void requestLayout() {
        this.f1048h = true;
        super.requestLayout();
    }

    public void setConstraintSet(b bVar) {
        this.f1050j = bVar;
    }

    public void setId(int i10) {
        this.f1041a.remove(getId());
        super.setId(i10);
        this.f1041a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f1047g) {
            this.f1047g = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f1046f) {
            this.f1046f = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f1045e) {
            this.f1045e = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f1044d) {
            this.f1044d = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(t.c cVar) {
        t.b bVar = this.k;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1049i = i10;
        q.e eVar = this.f1043c;
        eVar.F0 = i10;
        o.d.f10425p = eVar.W(512);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

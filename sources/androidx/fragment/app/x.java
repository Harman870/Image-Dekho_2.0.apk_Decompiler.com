package androidx.fragment.app;

import d1.b;

public final /* synthetic */ class x implements b.C0076b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1646b;

    public /* synthetic */ x(int i10, Object obj) {
        this.f1645a = i10;
        this.f1646b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.lifecycle.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r11 = this;
            int r0 = r11.f1645a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x001e
        L_0x0006:
            java.lang.Object r0 = r11.f1646b
            androidx.fragment.app.y r0 = (androidx.fragment.app.y) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            androidx.fragment.app.a0 r0 = r0.T()
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = "android:support:fragments"
            r1.putParcelable(r2, r0)
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.Object r0 = r11.f1646b
            androidx.lifecycle.w r0 = (androidx.lifecycle.w) r0
            java.lang.Class<? extends java.lang.Object>[] r1 = androidx.lifecycle.w.f1769f
            java.lang.String r1 = "this$0"
            x8.f.f(r0, r1)
            java.util.LinkedHashMap r1 = r0.f1771b
            java.lang.String r2 = "<this>"
            x8.f.f(r1, r2)
            int r2 = r1.size()
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r3) goto L_0x003f
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            goto L_0x0046
        L_0x003f:
            java.util.Map r2 = z5.c.s(r1)
            goto L_0x0046
        L_0x0044:
            p8.g r2 = p8.g.f10706a
        L_0x0046:
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x004e:
            boolean r2 = r1.hasNext()
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x00d7
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.getValue()
            d1.b$b r2 = (d1.b.C0076b) r2
            android.os.Bundle r2 = r2.a()
            java.lang.String r7 = "key"
            x8.f.f(r6, r7)
            if (r2 != 0) goto L_0x0074
            goto L_0x0086
        L_0x0074:
            java.lang.Class<? extends java.lang.Object>[] r7 = androidx.lifecycle.w.f1769f
            r8 = 29
            r9 = r5
        L_0x0079:
            if (r9 >= r8) goto L_0x008b
            r10 = r7[r9]
            x8.f.c(r10)
            boolean r10 = r10.isInstance(r2)
            if (r10 == 0) goto L_0x0088
        L_0x0086:
            r5 = r3
            goto L_0x008b
        L_0x0088:
            int r9 = r9 + 1
            goto L_0x0079
        L_0x008b:
            if (r5 == 0) goto L_0x00b4
            java.util.LinkedHashMap r5 = r0.f1772c
            java.lang.Object r5 = r5.get(r6)
            boolean r7 = r5 instanceof androidx.lifecycle.q
            if (r7 == 0) goto L_0x009a
            r4 = r5
            androidx.lifecycle.q r4 = (androidx.lifecycle.q) r4
        L_0x009a:
            if (r4 == 0) goto L_0x00a0
            r4.i(r2)
            goto L_0x00a5
        L_0x00a0:
            java.util.LinkedHashMap r4 = r0.f1770a
            r4.put(r6, r2)
        L_0x00a5:
            java.util.LinkedHashMap r2 = r0.f1773d
            java.lang.Object r2 = r2.get(r6)
            g9.a r2 = (g9.a) r2
            if (r2 != 0) goto L_0x00b0
            goto L_0x004e
        L_0x00b0:
            r2.a()
            goto L_0x004e
        L_0x00b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Can't put value with type "
            r1.append(r3)
            x8.f.c(r2)
            java.lang.Class r2 = r2.getClass()
            r1.append(r2)
            java.lang.String r2 = " into saved state"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d7:
            java.util.LinkedHashMap r1 = r0.f1770a
            java.util.Set r1 = r1.keySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r1.size()
            r2.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r2.size()
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x00f3:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x010c
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            r2.add(r7)
            java.util.LinkedHashMap r8 = r0.f1770a
            java.lang.Object r7 = r8.get(r7)
            r6.add(r7)
            goto L_0x00f3
        L_0x010c:
            r0 = 2
            o8.e[] r1 = new o8.e[r0]
            o8.e r7 = new o8.e
            java.lang.String r8 = "keys"
            r7.<init>(r8, r2)
            r1[r5] = r7
            o8.e r2 = new o8.e
            java.lang.String r7 = "values"
            r2.<init>(r7, r6)
            r1[r3] = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r0)
        L_0x0126:
            if (r5 >= r0) goto L_0x02e6
            r3 = r1[r5]
            A r6 = r3.f10603a
            java.lang.String r6 = (java.lang.String) r6
            B r3 = r3.f10604b
            if (r3 != 0) goto L_0x0137
            r2.putString(r6, r4)
            goto L_0x02ba
        L_0x0137:
            boolean r7 = r3 instanceof java.lang.Boolean
            if (r7 == 0) goto L_0x0146
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.putBoolean(r6, r3)
            goto L_0x02ba
        L_0x0146:
            boolean r7 = r3 instanceof java.lang.Byte
            if (r7 == 0) goto L_0x0155
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            r2.putByte(r6, r3)
            goto L_0x02ba
        L_0x0155:
            boolean r7 = r3 instanceof java.lang.Character
            if (r7 == 0) goto L_0x0164
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            r2.putChar(r6, r3)
            goto L_0x02ba
        L_0x0164:
            boolean r7 = r3 instanceof java.lang.Double
            if (r7 == 0) goto L_0x0173
            java.lang.Number r3 = (java.lang.Number) r3
            double r7 = r3.doubleValue()
            r2.putDouble(r6, r7)
            goto L_0x02ba
        L_0x0173:
            boolean r7 = r3 instanceof java.lang.Float
            if (r7 == 0) goto L_0x0182
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r2.putFloat(r6, r3)
            goto L_0x02ba
        L_0x0182:
            boolean r7 = r3 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x0191
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.putInt(r6, r3)
            goto L_0x02ba
        L_0x0191:
            boolean r7 = r3 instanceof java.lang.Long
            if (r7 == 0) goto L_0x01a0
            java.lang.Number r3 = (java.lang.Number) r3
            long r7 = r3.longValue()
            r2.putLong(r6, r7)
            goto L_0x02ba
        L_0x01a0:
            boolean r7 = r3 instanceof java.lang.Short
            if (r7 == 0) goto L_0x01af
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            r2.putShort(r6, r3)
            goto L_0x02ba
        L_0x01af:
            boolean r7 = r3 instanceof android.os.Bundle
            if (r7 == 0) goto L_0x01ba
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.putBundle(r6, r3)
            goto L_0x02ba
        L_0x01ba:
            boolean r7 = r3 instanceof java.lang.CharSequence
            if (r7 == 0) goto L_0x01c5
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.putCharSequence(r6, r3)
            goto L_0x02ba
        L_0x01c5:
            boolean r7 = r3 instanceof android.os.Parcelable
            if (r7 == 0) goto L_0x01d0
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r2.putParcelable(r6, r3)
            goto L_0x02ba
        L_0x01d0:
            boolean r7 = r3 instanceof boolean[]
            if (r7 == 0) goto L_0x01db
            boolean[] r3 = (boolean[]) r3
            r2.putBooleanArray(r6, r3)
            goto L_0x02ba
        L_0x01db:
            boolean r7 = r3 instanceof byte[]
            if (r7 == 0) goto L_0x01e6
            byte[] r3 = (byte[]) r3
            r2.putByteArray(r6, r3)
            goto L_0x02ba
        L_0x01e6:
            boolean r7 = r3 instanceof char[]
            if (r7 == 0) goto L_0x01f1
            char[] r3 = (char[]) r3
            r2.putCharArray(r6, r3)
            goto L_0x02ba
        L_0x01f1:
            boolean r7 = r3 instanceof double[]
            if (r7 == 0) goto L_0x01fc
            double[] r3 = (double[]) r3
            r2.putDoubleArray(r6, r3)
            goto L_0x02ba
        L_0x01fc:
            boolean r7 = r3 instanceof float[]
            if (r7 == 0) goto L_0x0207
            float[] r3 = (float[]) r3
            r2.putFloatArray(r6, r3)
            goto L_0x02ba
        L_0x0207:
            boolean r7 = r3 instanceof int[]
            if (r7 == 0) goto L_0x0212
            int[] r3 = (int[]) r3
            r2.putIntArray(r6, r3)
            goto L_0x02ba
        L_0x0212:
            boolean r7 = r3 instanceof long[]
            if (r7 == 0) goto L_0x021d
            long[] r3 = (long[]) r3
            r2.putLongArray(r6, r3)
            goto L_0x02ba
        L_0x021d:
            boolean r7 = r3 instanceof short[]
            if (r7 == 0) goto L_0x0228
            short[] r3 = (short[]) r3
            r2.putShortArray(r6, r3)
            goto L_0x02ba
        L_0x0228:
            boolean r7 = r3 instanceof java.lang.Object[]
            r8 = 34
            java.lang.String r9 = " for key \""
            if (r7 == 0) goto L_0x0293
            java.lang.Class r7 = r3.getClass()
            java.lang.Class r7 = r7.getComponentType()
            x8.f.c(r7)
            java.lang.Class<android.os.Parcelable> r10 = android.os.Parcelable.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L_0x024a
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            r2.putParcelableArray(r6, r3)
            goto L_0x02ba
        L_0x024a:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L_0x0258
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.putStringArray(r6, r3)
            goto L_0x02ba
        L_0x0258:
            java.lang.Class<java.lang.CharSequence> r10 = java.lang.CharSequence.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L_0x0266
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            r2.putCharSequenceArray(r6, r3)
            goto L_0x02ba
        L_0x0266:
            java.lang.Class<java.io.Serializable> r10 = java.io.Serializable.class
            boolean r10 = r10.isAssignableFrom(r7)
            if (r10 == 0) goto L_0x026f
            goto L_0x0297
        L_0x026f:
            java.lang.String r0 = r7.getCanonicalName()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal value array type "
            r2.append(r3)
            r2.append(r0)
            r2.append(r9)
            r2.append(r6)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0293:
            boolean r7 = r3 instanceof java.io.Serializable
            if (r7 == 0) goto L_0x029d
        L_0x0297:
            java.io.Serializable r3 = (java.io.Serializable) r3
            r2.putSerializable(r6, r3)
            goto L_0x02ba
        L_0x029d:
            boolean r7 = r3 instanceof android.os.IBinder
            if (r7 == 0) goto L_0x02a7
            android.os.IBinder r3 = (android.os.IBinder) r3
            d0.b.a(r2, r6, r3)
            goto L_0x02ba
        L_0x02a7:
            boolean r7 = r3 instanceof android.util.Size
            if (r7 == 0) goto L_0x02b1
            android.util.Size r3 = (android.util.Size) r3
            d0.c.a(r2, r6, r3)
            goto L_0x02ba
        L_0x02b1:
            boolean r7 = r3 instanceof android.util.SizeF
            if (r7 == 0) goto L_0x02be
            android.util.SizeF r3 = (android.util.SizeF) r3
            d0.c.b(r2, r6, r3)
        L_0x02ba:
            int r5 = r5 + 1
            goto L_0x0126
        L_0x02be:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal value type "
            r2.append(r3)
            r2.append(r0)
            r2.append(r9)
            r2.append(r6)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x02e6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.a():android.os.Bundle");
    }
}

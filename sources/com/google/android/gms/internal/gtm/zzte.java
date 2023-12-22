package com.google.android.gms.internal.gtm;

import javax.annotation.CheckForNull;

final class zzte extends zzsw {
    public final transient Object[] zzb;
    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    static {
        new zzte((Object) null, new Object[0], 0);
    }

    private zzte(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v4 ?, r2v10 ?, r2v7 ?, r2v12 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public static com.google.android.gms.internal.gtm.zzte zzg(int r16, java.lang.Object[] r17, com.google.android.gms.internal.gtm.zzsv r18) {
        /*
            r0 = r17
            r1 = 6
            java.lang.String r2 = "index"
            com.google.android.gms.internal.gtm.zzsl.zzb(r1, r1, r2)
            int r2 = com.google.android.gms.internal.gtm.zzsx.zzf(r1)
            int r3 = r2 + -1
            r4 = 3
            r5 = 0
            r7 = -1
            r8 = 0
            r9 = 1
            r10 = 128(0x80, float:1.794E-43)
            if (r2 > r10) goto L_0x0082
            byte[] r2 = new byte[r2]
            java.util.Arrays.fill(r2, r7)
            r7 = r8
            r10 = r7
        L_0x001e:
            if (r7 >= r1) goto L_0x006d
            int r11 = r10 + r10
            int r12 = r7 + r7
            r13 = r0[r12]
            r13.getClass()
            r12 = r12 ^ r9
            r12 = r0[r12]
            r12.getClass()
            com.google.android.gms.internal.gtm.zzso.zza(r13, r12)
            int r14 = r13.hashCode()
            int r14 = com.google.android.gms.internal.gtm.zzsp.zza(r14)
        L_0x003a:
            r14 = r14 & r3
            byte r15 = r2[r14]
            r6 = 255(0xff, float:3.57E-43)
            r15 = r15 & r6
            if (r15 != r6) goto L_0x0050
            byte r6 = (byte) r11
            r2[r14] = r6
            if (r10 >= r7) goto L_0x004d
            r0[r11] = r13
            r6 = r11 ^ 1
            r0[r6] = r12
        L_0x004d:
            int r10 = r10 + 1
            goto L_0x0067
        L_0x0050:
            r6 = r0[r15]
            boolean r6 = r13.equals(r6)
            if (r6 == 0) goto L_0x006a
            r5 = r15 ^ 1
            com.google.android.gms.internal.gtm.zzsu r6 = new com.google.android.gms.internal.gtm.zzsu
            r11 = r0[r5]
            r11.getClass()
            r6.<init>(r13, r12, r11)
            r0[r5] = r12
            r5 = r6
        L_0x0067:
            int r7 = r7 + 1
            goto L_0x001e
        L_0x006a:
            int r14 = r14 + 1
            goto L_0x003a
        L_0x006d:
            if (r10 != r1) goto L_0x0073
        L_0x006f:
            r3 = r2
            r2 = 2
            goto L_0x0154
        L_0x0073:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r3[r9] = r2
            r2 = 2
            r3[r2] = r5
            goto L_0x0154
        L_0x0082:
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r2 > r6) goto L_0x00ef
            short[] r2 = new short[r2]
            java.util.Arrays.fill(r2, r7)
            r6 = r8
            r7 = r6
        L_0x008e:
            if (r6 >= r1) goto L_0x00de
            int r10 = r7 + r7
            int r11 = r6 + r6
            r12 = r0[r11]
            r12.getClass()
            r11 = r11 ^ r9
            r11 = r0[r11]
            r11.getClass()
            com.google.android.gms.internal.gtm.zzso.zza(r12, r11)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.gtm.zzsp.zza(r13)
        L_0x00aa:
            r13 = r13 & r3
            short r14 = r2[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x00c1
            short r14 = (short) r10
            r2[r13] = r14
            if (r7 >= r6) goto L_0x00be
            r0[r10] = r12
            r10 = r10 ^ 1
            r0[r10] = r11
        L_0x00be:
            int r7 = r7 + 1
            goto L_0x00d8
        L_0x00c1:
            r15 = r0[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00db
            r5 = r14 ^ 1
            com.google.android.gms.internal.gtm.zzsu r10 = new com.google.android.gms.internal.gtm.zzsu
            r13 = r0[r5]
            r13.getClass()
            r10.<init>(r12, r11, r13)
            r0[r5] = r11
            r5 = r10
        L_0x00d8:
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00db:
            int r13 = r13 + 1
            goto L_0x00aa
        L_0x00de:
            if (r7 != r1) goto L_0x00e1
            goto L_0x006f
        L_0x00e1:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3[r9] = r2
            r2 = 2
            r3[r2] = r5
            goto L_0x0154
        L_0x00ef:
            int[] r2 = new int[r2]
            java.util.Arrays.fill(r2, r7)
            r6 = r8
            r10 = r6
        L_0x00f6:
            if (r6 >= r1) goto L_0x0143
            int r11 = r10 + r10
            int r12 = r6 + r6
            r13 = r0[r12]
            r13.getClass()
            r12 = r12 ^ r9
            r12 = r0[r12]
            r12.getClass()
            com.google.android.gms.internal.gtm.zzso.zza(r13, r12)
            int r14 = r13.hashCode()
            int r14 = com.google.android.gms.internal.gtm.zzsp.zza(r14)
        L_0x0112:
            r14 = r14 & r3
            r15 = r2[r14]
            if (r15 != r7) goto L_0x0124
            r2[r14] = r11
            if (r10 >= r6) goto L_0x0121
            r0[r11] = r13
            r11 = r11 ^ 1
            r0[r11] = r12
        L_0x0121:
            int r10 = r10 + 1
            goto L_0x013b
        L_0x0124:
            r7 = r0[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x013f
            r5 = r15 ^ 1
            com.google.android.gms.internal.gtm.zzsu r7 = new com.google.android.gms.internal.gtm.zzsu
            r11 = r0[r5]
            r11.getClass()
            r7.<init>(r13, r12, r11)
            r0[r5] = r12
            r5 = r7
        L_0x013b:
            int r6 = r6 + 1
            r7 = -1
            goto L_0x00f6
        L_0x013f:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x0112
        L_0x0143:
            if (r10 != r1) goto L_0x0147
            goto L_0x006f
        L_0x0147:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r3[r9] = r2
            r2 = 2
            r3[r2] = r5
        L_0x0154:
            boolean r4 = r3 instanceof java.lang.Object[]
            if (r4 != 0) goto L_0x015e
            com.google.android.gms.internal.gtm.zzte r2 = new com.google.android.gms.internal.gtm.zzte
            r2.<init>(r3, r0, r1)
            return r2
        L_0x015e:
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r2]
            com.google.android.gms.internal.gtm.zzsu r0 = (com.google.android.gms.internal.gtm.zzsu) r0
            java.lang.IllegalArgumentException r0 = r0.zza()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzte.zzg(int, java.lang.Object[], com.google.android.gms.internal.gtm.zzsv):com.google.android.gms.internal.gtm.zzte");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    @javax.annotation.CheckForNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zzc
            java.lang.Object[] r1 = r9.zzb
            int r2 = r9.zzd
            r3 = 0
            if (r10 != 0) goto L_0x000c
        L_0x0009:
            r10 = r3
            goto L_0x009c
        L_0x000c:
            r4 = 1
            if (r2 != r4) goto L_0x0022
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0009
            r10 = r1[r4]
            r10.getClass()
            goto L_0x009c
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0009
        L_0x0025:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L_0x0051
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.gtm.zzsp.zza(r0)
        L_0x0038:
            r0 = r0 & r6
            byte r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0041
            goto L_0x0009
        L_0x0041:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x004e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x004e:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0051:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L_0x007d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.gtm.zzsp.zza(r0)
        L_0x0063:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L_0x006d
            goto L_0x0009
        L_0x006d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.gtm.zzsp.zza(r6)
        L_0x0089:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L_0x0090
            goto L_0x0009
        L_0x0090:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L_0x009c:
            if (r10 != 0) goto L_0x009f
            return r3
        L_0x009f:
            return r10
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzte.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.zzd;
    }

    public final zzsq zza() {
        return new zztd(this.zzb, 1, this.zzd);
    }

    public final zzsx zzd() {
        return new zztb(this, this.zzb, 0, this.zzd);
    }

    public final zzsx zze() {
        return new zztc(this, new zztd(this.zzb, 0, this.zzd));
    }
}

package i4;

public final class g implements wf {

    /* renamed from: a  reason: collision with root package name */
    public String f7317a;

    /* renamed from: b  reason: collision with root package name */
    public String f7318b;

    /* renamed from: c  reason: collision with root package name */
    public String f7319c;

    /* renamed from: d  reason: collision with root package name */
    public final i f7320d = new i();

    /* renamed from: e  reason: collision with root package name */
    public final i f7321e = new i();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() {
        /*
            r11 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "returnSecureToken"
            r2 = 1
            r0.put(r1, r2)
            i4.i r1 = r11.f7321e
            java.util.List r1 = r1.f7374b
            boolean r1 = r1.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0035
            i4.i r1 = r11.f7321e
            java.util.List r1 = r1.f7374b
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = r3
        L_0x0020:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0030
            java.lang.Object r6 = r1.get(r5)
            r4.put(r6)
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0030:
            java.lang.String r1 = "deleteProvider"
            r0.put(r1, r4)
        L_0x0035:
            i4.i r1 = r11.f7320d
            java.util.List r1 = r1.f7374b
            int r4 = r1.size()
            int[] r5 = new int[r4]
            r6 = r3
        L_0x0040:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0093
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -333046776: goto L_0x0074;
                case 66081660: goto L_0x006a;
                case 1939891618: goto L_0x0060;
                case 1999612571: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x007e
        L_0x0056:
            java.lang.String r8 = "PASSWORD"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r10
            goto L_0x007f
        L_0x0060:
            java.lang.String r8 = "PHOTO_URL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r9
            goto L_0x007f
        L_0x006a:
            java.lang.String r8 = "EMAIL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r3
            goto L_0x007f
        L_0x0074:
            java.lang.String r8 = "DISPLAY_NAME"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r2
            goto L_0x007f
        L_0x007e:
            r7 = -1
        L_0x007f:
            if (r7 == 0) goto L_0x008d
            if (r7 == r2) goto L_0x008e
            if (r7 == r10) goto L_0x008b
            if (r7 == r9) goto L_0x0089
            r10 = r3
            goto L_0x008e
        L_0x0089:
            r10 = 4
            goto L_0x008e
        L_0x008b:
            r10 = 5
            goto L_0x008e
        L_0x008d:
            r10 = r2
        L_0x008e:
            r5[r6] = r10
            int r6 = r6 + 1
            goto L_0x0040
        L_0x0093:
            if (r4 <= 0) goto L_0x00a9
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x009a:
            if (r3 >= r4) goto L_0x00a4
            r2 = r5[r3]
            r1.put(r2)
            int r3 = r3 + 1
            goto L_0x009a
        L_0x00a4:
            java.lang.String r2 = "deleteAttribute"
            r0.put(r2, r1)
        L_0x00a9:
            java.lang.String r1 = r11.f7317a
            if (r1 == 0) goto L_0x00b2
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x00b2:
            java.lang.String r1 = r11.f7318b
            if (r1 == 0) goto L_0x00bb
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x00bb:
            java.lang.String r1 = r11.f7319c
            if (r1 == 0) goto L_0x00c4
            java.lang.String r2 = "password"
            r0.put(r2, r1)
        L_0x00c4:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.g.zza():java.lang.String");
    }
}

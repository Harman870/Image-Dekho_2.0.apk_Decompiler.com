package j4;

import android.os.IBinder;
import android.os.IInterface;

public abstract class t0 extends i0 implements u0 {
    public t0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static u0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v11, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v16, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v21, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v27, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v31, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v35, types: [j4.c1] */
    /* JADX WARNING: type inference failed for: r4v39, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v43, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v47, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v51, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v55, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v60, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v67, types: [j4.a1] */
    /* JADX WARNING: type inference failed for: r4v71, types: [j4.a1] */
    /* JADX WARNING: type inference failed for: r4v75, types: [j4.a1] */
    /* JADX WARNING: type inference failed for: r4v79, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v83, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v87, types: [j4.x0] */
    /* JADX WARNING: type inference failed for: r4v91 */
    /* JADX WARNING: type inference failed for: r4v92 */
    /* JADX WARNING: type inference failed for: r4v93 */
    /* JADX WARNING: type inference failed for: r4v94 */
    /* JADX WARNING: type inference failed for: r4v95 */
    /* JADX WARNING: type inference failed for: r4v96 */
    /* JADX WARNING: type inference failed for: r4v97 */
    /* JADX WARNING: type inference failed for: r4v98 */
    /* JADX WARNING: type inference failed for: r4v99 */
    /* JADX WARNING: type inference failed for: r4v100 */
    /* JADX WARNING: type inference failed for: r4v101 */
    /* JADX WARNING: type inference failed for: r4v102 */
    /* JADX WARNING: type inference failed for: r4v103 */
    /* JADX WARNING: type inference failed for: r4v104 */
    /* JADX WARNING: type inference failed for: r4v105 */
    /* JADX WARNING: type inference failed for: r4v106 */
    /* JADX WARNING: type inference failed for: r4v107 */
    /* JADX WARNING: type inference failed for: r4v108 */
    /* JADX WARNING: type inference failed for: r4v109 */
    /* JADX WARNING: type inference failed for: r4v110 */
    /* JADX WARNING: type inference failed for: r4v111 */
    /* JADX WARNING: type inference failed for: r4v112 */
    /* JADX WARNING: type inference failed for: r4v113 */
    /* JADX WARNING: type inference failed for: r4v114 */
    /* JADX WARNING: type inference failed for: r4v115 */
    /* JADX WARNING: type inference failed for: r4v116 */
    /* JADX WARNING: type inference failed for: r4v117 */
    /* JADX WARNING: type inference failed for: r4v118 */
    /* JADX WARNING: type inference failed for: r4v119 */
    /* JADX WARNING: type inference failed for: r4v120 */
    /* JADX WARNING: type inference failed for: r4v121 */
    /* JADX WARNING: type inference failed for: r4v122 */
    /* JADX WARNING: type inference failed for: r4v123 */
    /* JADX WARNING: type inference failed for: r4v124 */
    /* JADX WARNING: type inference failed for: r4v125 */
    /* JADX WARNING: type inference failed for: r4v126 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r12, android.os.Parcel r13, android.os.Parcel r14) {
        /*
            r11 = this;
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r8 = 1
            r2 = 0
            java.lang.String r3 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r4 = 0
            switch(r12) {
                case 1: goto L_0x04d9;
                case 2: goto L_0x04a6;
                case 3: goto L_0x0470;
                case 4: goto L_0x0444;
                case 5: goto L_0x0413;
                case 6: goto L_0x03ef;
                case 7: goto L_0x03df;
                case 8: goto L_0x03cb;
                case 9: goto L_0x03b3;
                case 10: goto L_0x038b;
                case 11: goto L_0x0376;
                case 12: goto L_0x036a;
                case 13: goto L_0x035e;
                case 14: goto L_0x0352;
                case 15: goto L_0x0335;
                case 16: goto L_0x0315;
                case 17: goto L_0x02f5;
                case 18: goto L_0x02d3;
                case 19: goto L_0x02b3;
                case 20: goto L_0x0293;
                case 21: goto L_0x0273;
                case 22: goto L_0x0253;
                case 23: goto L_0x0243;
                case 24: goto L_0x0233;
                case 25: goto L_0x021f;
                case 26: goto L_0x020b;
                case 27: goto L_0x01ef;
                case 28: goto L_0x01db;
                case 29: goto L_0x01c7;
                case 30: goto L_0x01b3;
                case 31: goto L_0x0187;
                case 32: goto L_0x015b;
                case 33: goto L_0x0132;
                case 34: goto L_0x0112;
                case 35: goto L_0x00f2;
                case 36: goto L_0x00d2;
                case 37: goto L_0x00c4;
                case 38: goto L_0x00a0;
                case 39: goto L_0x008f;
                case 40: goto L_0x006f;
                case 41: goto L_0x000a;
                case 42: goto L_0x005f;
                case 43: goto L_0x0053;
                case 44: goto L_0x003f;
                case 45: goto L_0x002b;
                case 46: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            return r2
        L_0x000b:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            goto L_0x0023
        L_0x0012:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x001e
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x0023
        L_0x001e:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x0023:
            j4.j0.b(r13)
            r11.getSessionId(r4)
            goto L_0x04f3
        L_0x002b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = j4.j0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.setConsentThirdParty(r1, r2)
            goto L_0x04f3
        L_0x003f:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = j4.j0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.setConsent(r1, r2)
            goto L_0x04f3
        L_0x0053:
            long r1 = r13.readLong()
            j4.j0.b(r13)
            r11.clearMeasurementEnabled(r1)
            goto L_0x04f3
        L_0x005f:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = j4.j0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            j4.j0.b(r13)
            r11.setDefaultEventParameters(r1)
            goto L_0x04f3
        L_0x006f:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x0082
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x0087
        L_0x0082:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x0087:
            j4.j0.b(r13)
            r11.isDataCollectionEnabled(r4)
            goto L_0x04f3
        L_0x008f:
            java.lang.ClassLoader r1 = j4.j0.f8270a
            int r1 = r13.readInt()
            if (r1 == 0) goto L_0x0098
            r2 = r8
        L_0x0098:
            j4.j0.b(r13)
            r11.setDataCollectionEnabled(r2)
            goto L_0x04f3
        L_0x00a0:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x00a7
            goto L_0x00b8
        L_0x00a7:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x00b3
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x00b8
        L_0x00b3:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x00b8:
            int r1 = r13.readInt()
            j4.j0.b(r13)
            r11.getTestFlag(r4, r1)
            goto L_0x04f3
        L_0x00c4:
            java.lang.ClassLoader r1 = j4.j0.f8270a
            java.util.HashMap r1 = r13.readHashMap(r1)
            j4.j0.b(r13)
            r11.initForTests(r1)
            goto L_0x04f3
        L_0x00d2:
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x00d9
            goto L_0x00ea
        L_0x00d9:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof j4.a1
            if (r3 == 0) goto L_0x00e5
            r4 = r1
            j4.a1 r4 = (j4.a1) r4
            goto L_0x00ea
        L_0x00e5:
            j4.y0 r4 = new j4.y0
            r4.<init>(r2)
        L_0x00ea:
            j4.j0.b(r13)
            r11.unregisterOnMeasurementEventListener(r4)
            goto L_0x04f3
        L_0x00f2:
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x00f9
            goto L_0x010a
        L_0x00f9:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof j4.a1
            if (r3 == 0) goto L_0x0105
            r4 = r1
            j4.a1 r4 = (j4.a1) r4
            goto L_0x010a
        L_0x0105:
            j4.y0 r4 = new j4.y0
            r4.<init>(r2)
        L_0x010a:
            j4.j0.b(r13)
            r11.registerOnMeasurementEventListener(r4)
            goto L_0x04f3
        L_0x0112:
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x0119
            goto L_0x012a
        L_0x0119:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof j4.a1
            if (r3 == 0) goto L_0x0125
            r4 = r1
            j4.a1 r4 = (j4.a1) r4
            goto L_0x012a
        L_0x0125:
            j4.y0 r4 = new j4.y0
            r4.<init>(r2)
        L_0x012a:
            j4.j0.b(r13)
            r11.setEventInterceptor(r4)
            goto L_0x04f3
        L_0x0132:
            int r1 = r13.readInt()
            java.lang.String r2 = r13.readString()
            android.os.IBinder r3 = r13.readStrongBinder()
            z3.a r3 = z3.a.C0177a.E(r3)
            android.os.IBinder r4 = r13.readStrongBinder()
            z3.a r4 = z3.a.C0177a.E(r4)
            android.os.IBinder r5 = r13.readStrongBinder()
            z3.a r5 = z3.a.C0177a.E(r5)
            j4.j0.b(r13)
            r0 = r11
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L_0x04f3
        L_0x015b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = j4.j0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x016a
            goto L_0x017b
        L_0x016a:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof j4.x0
            if (r4 == 0) goto L_0x0176
            r4 = r3
            j4.x0 r4 = (j4.x0) r4
            goto L_0x017b
        L_0x0176:
            j4.v0 r4 = new j4.v0
            r4.<init>(r2)
        L_0x017b:
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.performAction(r1, r4, r2)
            goto L_0x04f3
        L_0x0187:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x0196
            goto L_0x01a7
        L_0x0196:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof j4.x0
            if (r4 == 0) goto L_0x01a2
            r4 = r3
            j4.x0 r4 = (j4.x0) r4
            goto L_0x01a7
        L_0x01a2:
            j4.v0 r4 = new j4.v0
            r4.<init>(r2)
        L_0x01a7:
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.onActivitySaveInstanceState(r1, r4, r2)
            goto L_0x04f3
        L_0x01b3:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.onActivityResumed(r1, r2)
            goto L_0x04f3
        L_0x01c7:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.onActivityPaused(r1, r2)
            goto L_0x04f3
        L_0x01db:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.onActivityDestroyed(r1, r2)
            goto L_0x04f3
        L_0x01ef:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = j4.j0.a(r13, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r13.readLong()
            j4.j0.b(r13)
            r11.onActivityCreated(r1, r2, r3)
            goto L_0x04f3
        L_0x020b:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.onActivityStopped(r1, r2)
            goto L_0x04f3
        L_0x021f:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.onActivityStarted(r1, r2)
            goto L_0x04f3
        L_0x0233:
            java.lang.String r1 = r13.readString()
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.endAdUnitExposure(r1, r2)
            goto L_0x04f3
        L_0x0243:
            java.lang.String r1 = r13.readString()
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.beginAdUnitExposure(r1, r2)
            goto L_0x04f3
        L_0x0253:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x025a
            goto L_0x026b
        L_0x025a:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x0266
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x026b
        L_0x0266:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x026b:
            j4.j0.b(r13)
            r11.generateEventId(r4)
            goto L_0x04f3
        L_0x0273:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x027a
            goto L_0x028b
        L_0x027a:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x0286
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x028b
        L_0x0286:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x028b:
            j4.j0.b(r13)
            r11.getGmpAppId(r4)
            goto L_0x04f3
        L_0x0293:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x029a
            goto L_0x02ab
        L_0x029a:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x02a6
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x02ab
        L_0x02a6:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x02ab:
            j4.j0.b(r13)
            r11.getAppInstanceId(r4)
            goto L_0x04f3
        L_0x02b3:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x02ba
            goto L_0x02cb
        L_0x02ba:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x02c6
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x02cb
        L_0x02c6:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x02cb:
            j4.j0.b(r13)
            r11.getCachedAppInstanceId(r4)
            goto L_0x04f3
        L_0x02d3:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x02da
            goto L_0x02ed
        L_0x02da:
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof j4.c1
            if (r3 == 0) goto L_0x02e8
            r4 = r2
            j4.c1 r4 = (j4.c1) r4
            goto L_0x02ed
        L_0x02e8:
            j4.b1 r4 = new j4.b1
            r4.<init>(r1)
        L_0x02ed:
            j4.j0.b(r13)
            r11.setInstanceIdProvider(r4)
            goto L_0x04f3
        L_0x02f5:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x02fc
            goto L_0x030d
        L_0x02fc:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x0308
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x030d
        L_0x0308:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x030d:
            j4.j0.b(r13)
            r11.getCurrentScreenClass(r4)
            goto L_0x04f3
        L_0x0315:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x031c
            goto L_0x032d
        L_0x031c:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof j4.x0
            if (r3 == 0) goto L_0x0328
            r4 = r2
            j4.x0 r4 = (j4.x0) r4
            goto L_0x032d
        L_0x0328:
            j4.v0 r4 = new j4.v0
            r4.<init>(r1)
        L_0x032d:
            j4.j0.b(r13)
            r11.getCurrentScreenName(r4)
            goto L_0x04f3
        L_0x0335:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            java.lang.String r2 = r13.readString()
            java.lang.String r3 = r13.readString()
            long r4 = r13.readLong()
            j4.j0.b(r13)
            r0 = r11
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L_0x04f3
        L_0x0352:
            long r1 = r13.readLong()
            j4.j0.b(r13)
            r11.setSessionTimeoutDuration(r1)
            goto L_0x04f3
        L_0x035e:
            long r1 = r13.readLong()
            j4.j0.b(r13)
            r11.setMinimumSessionDuration(r1)
            goto L_0x04f3
        L_0x036a:
            long r1 = r13.readLong()
            j4.j0.b(r13)
            r11.resetAnalyticsData(r1)
            goto L_0x04f3
        L_0x0376:
            java.lang.ClassLoader r1 = j4.j0.f8270a
            int r1 = r13.readInt()
            if (r1 == 0) goto L_0x037f
            r2 = r8
        L_0x037f:
            long r3 = r13.readLong()
            j4.j0.b(r13)
            r11.setMeasurementEnabled(r2, r3)
            goto L_0x04f3
        L_0x038b:
            java.lang.String r1 = r13.readString()
            java.lang.String r2 = r13.readString()
            android.os.IBinder r5 = r13.readStrongBinder()
            if (r5 != 0) goto L_0x039a
            goto L_0x03ab
        L_0x039a:
            android.os.IInterface r3 = r5.queryLocalInterface(r3)
            boolean r4 = r3 instanceof j4.x0
            if (r4 == 0) goto L_0x03a6
            r4 = r3
            j4.x0 r4 = (j4.x0) r4
            goto L_0x03ab
        L_0x03a6:
            j4.v0 r4 = new j4.v0
            r4.<init>(r5)
        L_0x03ab:
            j4.j0.b(r13)
            r11.getConditionalUserProperties(r1, r2, r4)
            goto L_0x04f3
        L_0x03b3:
            java.lang.String r1 = r13.readString()
            java.lang.String r2 = r13.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = j4.j0.a(r13, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            j4.j0.b(r13)
            r11.clearConditionalUserProperty(r1, r2, r3)
            goto L_0x04f3
        L_0x03cb:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = j4.j0.a(r13, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.setConditionalUserProperty(r1, r2)
            goto L_0x04f3
        L_0x03df:
            java.lang.String r1 = r13.readString()
            long r2 = r13.readLong()
            j4.j0.b(r13)
            r11.setUserId(r1, r2)
            goto L_0x04f3
        L_0x03ef:
            java.lang.String r1 = r13.readString()
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x03fa
            goto L_0x040b
        L_0x03fa:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof j4.x0
            if (r4 == 0) goto L_0x0406
            r4 = r3
            j4.x0 r4 = (j4.x0) r4
            goto L_0x040b
        L_0x0406:
            j4.v0 r4 = new j4.v0
            r4.<init>(r2)
        L_0x040b:
            j4.j0.b(r13)
            r11.getMaxUserProperties(r1, r4)
            goto L_0x04f3
        L_0x0413:
            java.lang.String r1 = r13.readString()
            java.lang.String r5 = r13.readString()
            java.lang.ClassLoader r6 = j4.j0.f8270a
            int r6 = r13.readInt()
            if (r6 == 0) goto L_0x0424
            r2 = r8
        L_0x0424:
            android.os.IBinder r6 = r13.readStrongBinder()
            if (r6 != 0) goto L_0x042b
            goto L_0x043c
        L_0x042b:
            android.os.IInterface r3 = r6.queryLocalInterface(r3)
            boolean r4 = r3 instanceof j4.x0
            if (r4 == 0) goto L_0x0437
            r4 = r3
            j4.x0 r4 = (j4.x0) r4
            goto L_0x043c
        L_0x0437:
            j4.v0 r4 = new j4.v0
            r4.<init>(r6)
        L_0x043c:
            j4.j0.b(r13)
            r11.getUserProperties(r1, r5, r2, r4)
            goto L_0x04f3
        L_0x0444:
            java.lang.String r1 = r13.readString()
            java.lang.String r3 = r13.readString()
            android.os.IBinder r4 = r13.readStrongBinder()
            z3.a r4 = z3.a.C0177a.E(r4)
            java.lang.ClassLoader r5 = j4.j0.f8270a
            int r5 = r13.readInt()
            if (r5 == 0) goto L_0x045e
            r5 = r8
            goto L_0x045f
        L_0x045e:
            r5 = r2
        L_0x045f:
            long r6 = r13.readLong()
            j4.j0.b(r13)
            r0 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L_0x04f3
        L_0x0470:
            java.lang.String r1 = r13.readString()
            java.lang.String r2 = r13.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = j4.j0.a(r13, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r13.readStrongBinder()
            if (r6 != 0) goto L_0x0487
            goto L_0x0498
        L_0x0487:
            android.os.IInterface r3 = r6.queryLocalInterface(r3)
            boolean r4 = r3 instanceof j4.x0
            if (r4 == 0) goto L_0x0492
            j4.x0 r3 = (j4.x0) r3
            goto L_0x0497
        L_0x0492:
            j4.v0 r3 = new j4.v0
            r3.<init>(r6)
        L_0x0497:
            r4 = r3
        L_0x0498:
            long r6 = r13.readLong()
            j4.j0.b(r13)
            r0 = r11
            r3 = r5
            r5 = r6
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L_0x04f3
        L_0x04a6:
            java.lang.String r1 = r13.readString()
            java.lang.String r3 = r13.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = j4.j0.a(r13, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            int r5 = r13.readInt()
            if (r5 == 0) goto L_0x04be
            r5 = r8
            goto L_0x04bf
        L_0x04be:
            r5 = r2
        L_0x04bf:
            int r6 = r13.readInt()
            if (r6 == 0) goto L_0x04c7
            r6 = r8
            goto L_0x04c8
        L_0x04c7:
            r6 = r2
        L_0x04c8:
            long r9 = r13.readLong()
            j4.j0.b(r13)
            r0 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L_0x04f3
        L_0x04d9:
            android.os.IBinder r1 = r13.readStrongBinder()
            z3.a r1 = z3.a.C0177a.E(r1)
            android.os.Parcelable$Creator<j4.d1> r2 = j4.d1.CREATOR
            android.os.Parcelable r2 = j4.j0.a(r13, r2)
            j4.d1 r2 = (j4.d1) r2
            long r3 = r13.readLong()
            j4.j0.b(r13)
            r11.initialize(r1, r2, r3)
        L_0x04f3:
            r14.writeNoException()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.t0.b(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}

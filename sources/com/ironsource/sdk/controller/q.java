package com.ironsource.sdk.controller;

import x8.f;

public interface q {

    public static final class a implements q {

        /* renamed from: a  reason: collision with root package name */
        public final String f5492a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5493b;

        /* renamed from: c  reason: collision with root package name */
        public final String f5494c;

        /* renamed from: d  reason: collision with root package name */
        public final String f5495d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(String str) {
            this(str, (String) null, 14);
            f.f(str, "funToCall");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            this(str, str2, 12);
            f.f(str, "funToCall");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r4, java.lang.String r5, int r6) {
            /*
                r3 = this;
                r0 = r6 & 2
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0007
                r5 = r1
            L_0x0007:
                r0 = r6 & 4
                r2 = 0
                if (r0 == 0) goto L_0x000e
                r0 = r1
                goto L_0x000f
            L_0x000e:
                r0 = r2
            L_0x000f:
                r6 = r6 & 8
                if (r6 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r1 = r2
            L_0x0015:
                r3.<init>(r4, r5, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.q.a.<init>(java.lang.String, java.lang.String, int):void");
        }

        public a(String str, String str2, String str3, String str4) {
            f.f(str, "funToCall");
            this.f5492a = str;
            this.f5493b = str2;
            this.f5494c = str3;
            this.f5495d = str4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
            if (r1 == true) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SSA_CORE.SDKController.runFunction('"
                r0.<init>(r1)
                java.lang.String r1 = r5.f5492a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = r5.f5493b
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0023
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x001e
                r1 = r2
                goto L_0x001f
            L_0x001e:
                r1 = r3
            L_0x001f:
                if (r1 != r2) goto L_0x0023
                r1 = r2
                goto L_0x0024
            L_0x0023:
                r1 = r3
            L_0x0024:
                if (r1 == 0) goto L_0x0035
                java.lang.String r1 = "?parameters="
                java.lang.StringBuilder r0 = com.ironsource.adapters.ironsource.a.h(r0, r1)
                java.lang.String r1 = r5.f5493b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L_0x0035:
                java.lang.String r1 = r5.f5494c
                if (r1 == 0) goto L_0x0046
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0041
                r1 = r2
                goto L_0x0042
            L_0x0041:
                r1 = r3
            L_0x0042:
                if (r1 != r2) goto L_0x0046
                r1 = r2
                goto L_0x0047
            L_0x0046:
                r1 = r3
            L_0x0047:
                java.lang.String r4 = "','"
                if (r1 == 0) goto L_0x0058
                java.lang.StringBuilder r0 = com.ironsource.adapters.ironsource.a.h(r0, r4)
                java.lang.String r1 = r5.f5494c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L_0x0058:
                java.lang.String r1 = r5.f5495d
                if (r1 == 0) goto L_0x0068
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0064
                r1 = r2
                goto L_0x0065
            L_0x0064:
                r1 = r3
            L_0x0065:
                if (r1 != r2) goto L_0x0068
                goto L_0x0069
            L_0x0068:
                r2 = r3
            L_0x0069:
                if (r2 == 0) goto L_0x0078
                java.lang.StringBuilder r0 = com.ironsource.adapters.ironsource.a.h(r0, r4)
                java.lang.String r1 = r5.f5495d
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L_0x0078:
                java.lang.String r1 = "');"
                java.lang.String r0 = com.ironsource.adapters.ironsource.a.g(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.q.a.a():java.lang.String");
        }
    }
}

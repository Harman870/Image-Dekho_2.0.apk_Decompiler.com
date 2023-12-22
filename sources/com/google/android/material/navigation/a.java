package com.google.android.material.navigation;

import androidx.appcompat.view.menu.f;

public final class a implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationView f3281a;

    public a(NavigationView navigationView) {
        this.f3281a = navigationView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011c, code lost:
        l8.e.c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013a, code lost:
        r7.d(com.imgdkh.app.R.id.frame_layout, r6);
        r7.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0140, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0142, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0143, code lost:
        r4.f5824y.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0148, code lost:
        if (r0 == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(androidx.appcompat.view.menu.f r19, android.view.MenuItem r20) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.material.navigation.NavigationView r0 = r1.f3281a
            com.google.android.material.navigation.NavigationView$a r0 = r0.f3270j
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x014b
            r4 = r0
            com.wallpapersindia.app.HomeScreen r4 = (com.wallpapersindia.app.HomeScreen) r4
            int r0 = r20.getItemId()
            r5 = 2131296502(0x7f0900f6, float:1.8210922E38)
            switch(r0) {
                case 2131296626: goto L_0x0129;
                case 2131296627: goto L_0x0017;
                case 2131296628: goto L_0x0108;
                case 2131296629: goto L_0x0063;
                case 2131296630: goto L_0x0017;
                case 2131296631: goto L_0x0050;
                case 2131296632: goto L_0x0039;
                case 2131296633: goto L_0x0017;
                case 2131296634: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0142
        L_0x0019:
            androidx.fragment.app.z r0 = r4.w()
            j8.r r6 = new j8.r
            r6.<init>()
            boolean r7 = l8.e.b()
            if (r7 == 0) goto L_0x002f
            h8.b r5 = new h8.b
            r5.<init>(r0, r6)
            goto L_0x011c
        L_0x002f:
            r0.getClass()
            androidx.fragment.app.a r7 = new androidx.fragment.app.a
            r7.<init>(r0)
            goto L_0x013a
        L_0x0039:
            android.content.Intent r0 = new android.content.Intent
            r5 = 2131951886(0x7f13010e, float:1.95402E38)
            java.lang.String r5 = r4.getString(r5)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r6 = "android.intent.action.VIEW"
            r0.<init>(r6, r5)
            r4.startActivity(r0)
            goto L_0x0142
        L_0x0050:
            androidx.fragment.app.z r0 = r4.w()
            j8.g r6 = new j8.g
            r6.<init>()
            r0.getClass()
            androidx.fragment.app.a r7 = new androidx.fragment.app.a
            r7.<init>(r0)
            goto L_0x013a
        L_0x0063:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.k
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r3.o.h(r0)
            java.util.HashSet r5 = new java.util.HashSet
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r6 = r0.f2784b
            r5.<init>(r6)
            boolean r12 = r0.f2787e
            boolean r13 = r0.f2788f
            boolean r11 = r0.f2786d
            java.lang.String r14 = r0.f2789g
            android.accounts.Account r10 = r0.f2785c
            java.lang.String r15 = r0.f2790h
            java.util.ArrayList<m3.a> r6 = r0.f2791i
            java.util.HashMap r16 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.y(r6)
            java.lang.String r0 = r0.f2792j
            com.google.android.gms.common.api.Scope r6 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2778l
            r5.add(r6)
            com.google.android.gms.common.api.Scope r6 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2781o
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L_0x00a5
            com.google.android.gms.common.api.Scope r6 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2780n
            boolean r7 = r5.contains(r6)
            if (r7 == 0) goto L_0x00a5
            r5.remove(r6)
        L_0x00a5:
            if (r11 == 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00af
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00b4
        L_0x00af:
            com.google.android.gms.common.api.Scope r6 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f2779m
            r5.add(r6)
        L_0x00b4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            r8 = 3
            r7 = r6
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            l3.a r0 = new l3.a
            r0.<init>((android.app.Activity) r4, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r6)
            r0.c()
            l8.g r0 = r4.f5823x
            r0.getClass()
            android.content.SharedPreferences r0 = r0.f9254a     // Catch:{ Exception -> 0x00dd }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00dd }
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch:{ Exception -> 0x00dd }
            r0.apply()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00e1:
            java.lang.String r0 = "Logout Success"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r3)
            r0.show()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.wallpapersindia.app.SplashScreen> r5 = com.wallpapersindia.app.SplashScreen.class
            r0.<init>(r4, r5)
            r5 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r0 = r0.addFlags(r5)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r0.addFlags(r5)
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r0 = r0.addFlags(r5)
            r4.startActivity(r0)
            goto L_0x0142
        L_0x0108:
            androidx.fragment.app.z r0 = r4.w()
            j8.o r6 = new j8.o
            r6.<init>()
            boolean r7 = l8.e.b()
            if (r7 == 0) goto L_0x0120
            a7.k r5 = new a7.k
            r5.<init>(r0, r2, r6)
        L_0x011c:
            l8.e.c(r5)
            goto L_0x0140
        L_0x0120:
            r0.getClass()
            androidx.fragment.app.a r7 = new androidx.fragment.app.a
            r7.<init>(r0)
            goto L_0x013a
        L_0x0129:
            androidx.fragment.app.z r0 = r4.w()
            j8.k r6 = new j8.k
            r6.<init>()
            r0.getClass()
            androidx.fragment.app.a r7 = new androidx.fragment.app.a
            r7.<init>(r0)
        L_0x013a:
            r7.d(r5, r6)
            r7.f()
        L_0x0140:
            r0 = r2
            goto L_0x0143
        L_0x0142:
            r0 = r3
        L_0x0143:
            androidx.drawerlayout.widget.DrawerLayout r4 = r4.f5824y
            r4.c()
            if (r0 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r2 = r3
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.a.a(androidx.appcompat.view.menu.f, android.view.MenuItem):boolean");
    }

    public final void b(f fVar) {
    }
}

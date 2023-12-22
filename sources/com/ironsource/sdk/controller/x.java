package com.ironsource.sdk.controller;

import android.media.AudioManager;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5525a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5526b;

    /* renamed from: c  reason: collision with root package name */
    public int f5527c;

    /* renamed from: d  reason: collision with root package name */
    public String f5528d;

    /* renamed from: e  reason: collision with root package name */
    public String f5529e;

    /* renamed from: f  reason: collision with root package name */
    public int f5530f;

    /* renamed from: g  reason: collision with root package name */
    public int f5531g;

    /* renamed from: h  reason: collision with root package name */
    public int f5532h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f5533i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f5534j;
    public int[] k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f5535l;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AudioManager f5536a;

        public a(AudioManager audioManager) {
            this.f5536a = audioManager;
        }

        public final void run() {
            try {
                this.f5536a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ AudioManager f5537a;

        public b(AudioManager audioManager) {
            this.f5537a = audioManager;
        }

        public final void run() {
            try {
                this.f5537a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public x() {
    }

    public x(boolean z9, boolean z10, boolean z11, int i10, String str, String str2, int i11, int i12, int i13, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.f5525a = z10;
        this.f5526b = z11;
        this.f5527c = i10;
        this.f5528d = str;
        this.f5529e = str2;
        this.f5530f = i11;
        this.f5531g = i12;
        this.f5532h = i13;
        this.f5533i = iArr;
        this.f5534j = iArr2;
        this.k = iArr3;
        this.f5535l = iArr4;
    }

    public boolean a() {
        return this.f5525a;
    }

    public boolean b() {
        return this.f5526b;
    }

    public int c() {
        return this.f5527c;
    }

    public String d() {
        return this.f5528d;
    }

    public String e() {
        return this.f5529e;
    }

    public int f() {
        return this.f5530f;
    }

    public int g() {
        return this.f5531g;
    }

    public int h() {
        return this.f5532h;
    }

    public int[] i() {
        return this.f5533i;
    }

    public int[] j() {
        return this.f5534j;
    }

    public int[] k() {
        return this.k;
    }

    public int[] l() {
        return this.f5535l;
    }
}

package com.ironsource.sdk.f;

import android.text.TextUtils;
import java.util.HashSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5590a = false;

    /* renamed from: b  reason: collision with root package name */
    public HashSet<String> f5591b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public String f5592c;

    /* renamed from: d  reason: collision with root package name */
    public String f5593d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5594e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f5595f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5596g = true;

    /* renamed from: com.ironsource.sdk.f.a$a  reason: collision with other inner class name */
    public static class C0066a {

        /* renamed from: a  reason: collision with root package name */
        public String f5597a;

        /* renamed from: b  reason: collision with root package name */
        public String f5598b;

        /* renamed from: c  reason: collision with root package name */
        public String f5599c;
    }

    public HashSet<String> a() {
        return this.f5591b;
    }

    public void a(int i10) {
        this.f5595f = i10;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f5591b.add(str);
        }
    }

    public void a(boolean z9) {
        this.f5590a = z9;
    }

    public void b(String str) {
        this.f5592c = str;
    }

    public void b(boolean z9) {
        this.f5594e = z9;
    }

    public boolean b() {
        return this.f5590a;
    }

    public String c() {
        return this.f5592c;
    }

    public void c(String str) {
        this.f5593d = str;
    }

    public void c(boolean z9) {
        this.f5596g = z9;
    }

    public String d() {
        return this.f5593d;
    }

    public boolean e() {
        return this.f5594e;
    }

    public int f() {
        return this.f5595f;
    }

    public boolean g() {
        return this.f5596g;
    }
}

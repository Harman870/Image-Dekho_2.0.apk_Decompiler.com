package com.ironsource.a;

import android.util.Pair;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f3632a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3633b;

    /* renamed from: c  reason: collision with root package name */
    public String f3634c;

    /* renamed from: d  reason: collision with root package name */
    public d f3635d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3636e = false;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<Pair<String, String>> f3637f;

    /* renamed from: com.ironsource.a.a$a  reason: collision with other inner class name */
    public static class C0037a {

        /* renamed from: a  reason: collision with root package name */
        public String f3638a = "";

        /* renamed from: b  reason: collision with root package name */
        public boolean f3639b = false;

        /* renamed from: c  reason: collision with root package name */
        public String f3640c = "POST";

        /* renamed from: d  reason: collision with root package name */
        public d f3641d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3642e = false;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<Pair<String, String>> f3643f = new ArrayList<>();

        public C0037a(String str) {
            if (str != null && !str.isEmpty()) {
                this.f3638a = str;
            }
        }
    }

    public a(C0037a aVar) {
        this.f3632a = aVar.f3638a;
        this.f3633b = aVar.f3639b;
        this.f3634c = aVar.f3640c;
        this.f3635d = aVar.f3641d;
        this.f3636e = aVar.f3642e;
        if (aVar.f3643f != null) {
            this.f3637f = new ArrayList<>(aVar.f3643f);
        }
    }
}

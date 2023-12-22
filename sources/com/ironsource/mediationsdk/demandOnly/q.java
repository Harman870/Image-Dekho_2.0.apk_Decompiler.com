package com.ironsource.mediationsdk.demandOnly;

import x8.f;

public interface q {

    public static class a implements q {

        /* renamed from: a  reason: collision with root package name */
        public final String f4472a;

        public a(String str) {
            f.f(str, "plumbus");
            this.f4472a = str;
        }

        public final String a() {
            return this.f4472a;
        }
    }

    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String a();
}

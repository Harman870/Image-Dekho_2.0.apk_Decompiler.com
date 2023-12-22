package com.ironsource.mediationsdk.demandOnly;

import x8.f;

public interface o {

    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final String f4466a;

        public a(String str) {
            f.f(str, "rowAdm");
            this.f4466a = str;
        }

        public final <T> T a(l<String, T> lVar) {
            f.f(lVar, "mapper");
            return lVar.a(this.f4466a);
        }
    }

    <T> T a(l<String, T> lVar);
}

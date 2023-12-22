package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import r1.b;
import x1.w;

public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final w f2606a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f2607a;

        public a(b bVar) {
            this.f2607a = bVar;
        }

        public final Class<InputStream> a() {
            return InputStream.class;
        }

        public final e b(Object obj) {
            return new k((InputStream) obj, this.f2607a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f2606a = wVar;
        wVar.mark(5242880);
    }

    public final Object a() {
        this.f2606a.reset();
        return this.f2606a;
    }

    public final void b() {
        this.f2606a.c();
    }
}

package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f2563a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f2564a = new HashMap();
    }

    public i(a aVar) {
        this.f2563a = Collections.unmodifiableMap(new HashMap(aVar.f2564a));
    }
}

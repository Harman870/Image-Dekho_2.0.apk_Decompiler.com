package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import o1.a;

public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f2587a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f2588b;

    /* renamed from: c  reason: collision with root package name */
    public T f2589c;

    public b(AssetManager assetManager, String str) {
        this.f2588b = assetManager;
        this.f2587a = str;
    }

    public final void b() {
        T t10 = this.f2589c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10);

    public final void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str);

    public final a e() {
        return a.LOCAL;
    }

    public final void f(j jVar, d.a<? super T> aVar) {
        try {
            T d10 = d(this.f2588b, this.f2587a);
            this.f2589c = d10;
            aVar.d(d10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }
}

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import o1.a;

public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f2608a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f2609b;

    /* renamed from: c  reason: collision with root package name */
    public T f2610c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f2609b = contentResolver;
        this.f2608a = uri;
    }

    public final void b() {
        T t10 = this.f2610c;
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

    public abstract Object d(ContentResolver contentResolver, Uri uri);

    public final a e() {
        return a.LOCAL;
    }

    public final void f(j jVar, d.a<? super T> aVar) {
        try {
            T d10 = d(this.f2609b, this.f2608a);
            this.f2610c = d10;
            aVar.d(d10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }
}

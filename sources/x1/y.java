package x1;

import android.graphics.Bitmap;
import j2.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import o1.h;
import o1.j;
import q1.w;
import r1.b;
import x1.m;
import x1.s;

public final class y implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f12918a;

    /* renamed from: b  reason: collision with root package name */
    public final b f12919b;

    public static class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        public final w f12920a;

        /* renamed from: b  reason: collision with root package name */
        public final d f12921b;

        public a(w wVar, d dVar) {
            this.f12920a = wVar;
            this.f12921b = dVar;
        }

        public final void a(Bitmap bitmap, r1.d dVar) {
            IOException iOException = this.f12921b.f8013b;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.e(bitmap);
                }
                throw iOException;
            }
        }

        public final void b() {
            w wVar = this.f12920a;
            synchronized (wVar) {
                wVar.f12912c = wVar.f12910a.length;
            }
        }
    }

    public y(m mVar, b bVar) {
        this.f12918a = mVar;
        this.f12919b = bVar;
    }

    public final boolean a(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        this.f12918a.getClass();
        return true;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        boolean z9;
        w wVar;
        d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof w) {
            z9 = false;
            wVar = (w) inputStream;
        } else {
            wVar = new w(inputStream, this.f12919b);
            z9 = true;
        }
        ArrayDeque arrayDeque = d.f8011c;
        synchronized (arrayDeque) {
            dVar = (d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        d dVar2 = dVar;
        dVar2.f8012a = wVar;
        j2.j jVar = new j2.j(dVar2);
        a aVar = new a(wVar, dVar2);
        try {
            m mVar = this.f12918a;
            d a10 = mVar.a(new s.b(mVar.f12880c, jVar, mVar.f12881d), i10, i11, hVar, aVar);
            dVar2.f8013b = null;
            dVar2.f8012a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z9) {
                wVar.c();
            }
            return a10;
        } catch (Throwable th) {
            dVar2.f8013b = null;
            dVar2.f8012a = null;
            ArrayDeque arrayDeque2 = d.f8011c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z9) {
                    wVar.c();
                }
                throw th;
            }
        }
    }
}

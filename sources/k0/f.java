package k0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f9037a;

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f9038a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9038a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f9038a = (InputContentInfo) obj;
        }

        public final ClipDescription a() {
            return this.f9038a.getDescription();
        }

        public final Object b() {
            return this.f9038a;
        }

        public final Uri c() {
            return this.f9038a.getContentUri();
        }

        public final void d() {
            this.f9038a.requestPermission();
        }

        public final Uri e() {
            return this.f9038a.getLinkUri();
        }
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f9039a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f9040b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f9041c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9039a = uri;
            this.f9040b = clipDescription;
            this.f9041c = uri2;
        }

        public final ClipDescription a() {
            return this.f9040b;
        }

        public final Object b() {
            return null;
        }

        public final Uri c() {
            return this.f9039a;
        }

        public final void d() {
        }

        public final Uri e() {
            return this.f9041c;
        }
    }

    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f9037a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public f(a aVar) {
        this.f9037a = aVar;
    }
}

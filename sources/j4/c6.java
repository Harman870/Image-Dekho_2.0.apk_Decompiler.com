package j4;

import androidx.fragment.app.w0;
import java.util.Iterator;
import javax.annotation.CheckForNull;

public final class c6 extends y5 {

    /* renamed from: d  reason: collision with root package name */
    public final transient Object f8084d;

    public c6(Object obj) {
        this.f8084d = obj;
    }

    public final void a(Object[] objArr) {
        objArr[0] = this.f8084d;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f8084d.equals(obj);
    }

    public final int hashCode() {
        return this.f8084d.hashCode();
    }

    public final d6 i() {
        return new z5(this.f8084d);
    }

    public final /* synthetic */ Iterator iterator() {
        return new z5(this.f8084d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return w0.d("[", this.f8084d.toString(), "]");
    }
}

package o1;

import android.text.TextUtils;
import androidx.activity.f;
import java.security.MessageDigest;

public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10514e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f10515a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f10516b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10517c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f10518d;

    public class a implements b<Object> {
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public g(String str, T t10, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f10517c = str;
            this.f10515a = t10;
            this.f10516b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f10514e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f10517c.equals(((g) obj).f10517c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10517c.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("Option{key='");
        g10.append(this.f10517c);
        g10.append('\'');
        g10.append('}');
        return g10.toString();
    }
}

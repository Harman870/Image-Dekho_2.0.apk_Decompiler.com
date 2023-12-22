package j9;

import androidx.activity.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f8868a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f8869b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f8870c;

    public e0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (inetSocketAddress != null) {
            this.f8868a = aVar;
            this.f8869b = proxy;
            this.f8870c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return e0Var.f8868a.equals(this.f8868a) && e0Var.f8869b.equals(this.f8869b) && e0Var.f8870c.equals(this.f8870c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f8869b.hashCode();
        return this.f8870c.hashCode() + ((hashCode + ((this.f8868a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder g10 = f.g("Route{");
        g10.append(this.f8870c);
        g10.append("}");
        return g10.toString();
    }
}

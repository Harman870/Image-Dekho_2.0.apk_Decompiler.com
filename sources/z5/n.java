package z5;

import android.app.PendingIntent;
import androidx.activity.result.c;
import b6.r;

public final class n extends c {

    /* renamed from: b  reason: collision with root package name */
    public String f13218b;

    /* renamed from: c  reason: collision with root package name */
    public r f13219c;

    public n() {
        super(0);
    }

    public final n A(PendingIntent pendingIntent) {
        return this;
    }

    public final n B(r rVar) {
        if (rVar != null) {
            this.f13219c = rVar;
            return this;
        }
        throw new NullPointerException("Null logger");
    }

    public final n C(String str) {
        if (str != null) {
            this.f13218b = str;
            return this;
        }
        throw new NullPointerException("Null token");
    }

    public final o D() {
        String str = this.f13218b;
        if (str != null && this.f13219c != null) {
            return new o(str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13218b == null) {
            sb.append(" token");
        }
        if (this.f13219c == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

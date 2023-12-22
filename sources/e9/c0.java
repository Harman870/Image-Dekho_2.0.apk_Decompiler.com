package e9;

import androidx.activity.f;

public final class c0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6223a;

    public c0(boolean z9) {
        this.f6223a = z9;
    }

    public final boolean a() {
        return this.f6223a;
    }

    public final t0 d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder g10 = f.g("Empty{");
        if (this.f6223a) {
            str = "Active";
        } else {
            str = "New";
        }
        g10.append(str);
        g10.append('}');
        return g10.toString();
    }
}

package d0;

import android.os.LocaleList;
import java.util.Locale;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f6034a;

    public h(Object obj) {
        this.f6034a = (LocaleList) obj;
    }

    public final String a() {
        return this.f6034a.toLanguageTags();
    }

    public final Object b() {
        return this.f6034a;
    }

    public final boolean equals(Object obj) {
        return this.f6034a.equals(((g) obj).b());
    }

    public final Locale get(int i10) {
        return this.f6034a.get(i10);
    }

    public final int hashCode() {
        return this.f6034a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f6034a.isEmpty();
    }

    public final int size() {
        return this.f6034a.size();
    }

    public final String toString() {
        return this.f6034a.toString();
    }
}

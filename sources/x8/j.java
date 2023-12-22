package x8;

import androidx.activity.e;
import androidx.activity.f;
import b9.a;
import b9.c;
import e9.t;

public abstract class j extends a implements c {
    public j() {
    }

    public j(Object obj) {
        super(obj, t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (!b().equals(jVar.b()) || !this.f12996d.equals(jVar.f12996d) || !this.f12997e.equals(jVar.f12997e) || !f.a(this.f12994b, jVar.f12994b)) {
                return false;
            }
            return true;
        } else if (!(obj instanceof c)) {
            return false;
        } else {
            a aVar = this.f12993a;
            if (aVar == null) {
                aVar = a();
                this.f12993a = aVar;
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f12996d.hashCode();
        return this.f12997e.hashCode() + ((hashCode + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a aVar = this.f12993a;
        if (aVar == null) {
            aVar = a();
            this.f12993a = aVar;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        return e.c(f.g("property "), this.f12996d, " (Kotlin reflection is not available)");
    }
}

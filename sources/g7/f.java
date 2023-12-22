package g7;

import e7.m;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public final class f implements m<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f6595a;

    public f(Type type) {
        this.f6595a = type;
    }

    public final Object j() {
        Type type = this.f6595a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder g10 = androidx.activity.f.g("Invalid EnumSet type: ");
            g10.append(this.f6595a.toString());
            throw new m(g10.toString());
        }
        StringBuilder g11 = androidx.activity.f.g("Invalid EnumSet type: ");
        g11.append(this.f6595a.toString());
        throw new m(g11.toString());
    }
}

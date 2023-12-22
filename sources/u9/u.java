package u9;

import j9.d0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u9.f;

@IgnoreJRERequirement
public final class u extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final u f12316a = new u();

    @IgnoreJRERequirement
    public static final class a<T> implements f<d0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<d0, T> f12317a;

        public a(f<d0, T> fVar) {
            this.f12317a = fVar;
        }

        public final Object b(Object obj) {
            return Optional.ofNullable(this.f12317a.b((d0) obj));
        }
    }

    @Nullable
    public final f<d0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (h0.e(type) != Optional.class) {
            return null;
        }
        return new a(d0Var.d(h0.d(0, (ParameterizedType) type), annotationArr));
    }
}

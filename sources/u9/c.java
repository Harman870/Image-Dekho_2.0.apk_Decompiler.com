package u9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public interface c<R, T> {

    public static abstract class a {
        @Nullable
        public abstract c a(Type type, Annotation[] annotationArr);
    }

    Object a(t tVar);

    Type b();
}

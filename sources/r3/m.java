package r3;

import java.util.ArrayList;

public final class m {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f11614a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f11615b;

        public /* synthetic */ a(Object obj) {
            o.h(obj);
            this.f11615b = obj;
        }

        public final void a(Object obj, String str) {
            ArrayList arrayList = this.f11614a;
            String valueOf = String.valueOf(obj);
            arrayList.add(str + "=" + valueOf);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f11615b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f11614a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) this.f11614a.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}

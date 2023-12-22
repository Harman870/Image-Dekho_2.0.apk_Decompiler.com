package i4;

import android.text.TextUtils;

public final class vf {
    public static Object a(String str, Class cls) {
        if (cls == String.class) {
            try {
                mg mgVar = new mg();
                mgVar.a(str);
                if (!TextUtils.isEmpty(mgVar.f7496a)) {
                    return mgVar.f7496a;
                }
                throw new bf("No error message: " + str);
            } catch (Exception e10) {
                throw new bf("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } else if (cls == Void.class) {
            return null;
        } else {
            try {
                xf xfVar = (xf) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    xfVar.zza(str);
                    return xfVar;
                } catch (Exception e11) {
                    throw new bf("Json conversion failed! ".concat(String.valueOf(e11.getMessage())), e11);
                }
            } catch (Exception e12) {
                throw new bf("Instantiation of JsonResponse failed! ".concat(cls.toString()), e12);
            }
        }
    }
}

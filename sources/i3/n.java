package i3;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class n {
    public static String zza(Object obj) {
        return zzd(obj, 0);
    }

    public static String zzb(Map map) {
        return zzd(map, 1);
    }

    private static String zzd(Object obj, int i10) {
        if (i10 > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? "" : obj.toString();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d ? "" : obj.toString();
        }
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue() ? "" : obj.toString();
        }
        if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i10 > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object next : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(zzd(next, i10 + 1));
            }
            if (i10 > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z9 = false;
            int i11 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String zzd = zzd(entry.getValue(), i10 + 1);
                if (!TextUtils.isEmpty(zzd)) {
                    if (i10 > 0 && !z9) {
                        sb2.append("{");
                        i11 = sb2.length();
                        z9 = true;
                    }
                    if (sb2.length() > i11) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(zzd);
                }
            }
            if (z9) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }

    public abstract void zzc(n nVar);
}

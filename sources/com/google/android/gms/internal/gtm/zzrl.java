package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r3.o;

public final class zzrl {
    public static Bundle zza(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof zzrk) {
                bundle.putString((String) entry.getKey(), ((zzrk) entry.getValue()).zzk());
            } else if (entry.getValue() instanceof zzra) {
                bundle.putBoolean((String) entry.getKey(), ((zzra) entry.getValue()).zzi().booleanValue());
            } else if (entry.getValue() instanceof zzrb) {
                bundle.putDouble((String) entry.getKey(), ((zzrb) entry.getValue()).zzi().doubleValue());
            } else if (entry.getValue() instanceof zzrh) {
                bundle.putBundle((String) entry.getKey(), zza(((zzrh) entry.getValue()).zza));
            } else {
                throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", new Object[]{entry.getKey()}));
            }
        }
        return bundle;
    }

    public static zzqz zzb(Object obj) {
        if (obj == null) {
            return zzrd.zzd;
        }
        if (obj instanceof zzqz) {
            return (zzqz) obj;
        }
        if (obj instanceof Boolean) {
            return new zzra((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new zzrb(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzrb(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new zzrb(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new zzrb(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new zzrb((Double) obj);
        }
        if (obj instanceof Byte) {
            return new zzrk(obj.toString());
        }
        if (obj instanceof Character) {
            return new zzrk(obj.toString());
        }
        if (obj instanceof String) {
            return new zzrk((String) obj);
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (Object zzb : (List) obj) {
                arrayList.add(zzb(zzb));
            }
            return new zzrg(arrayList);
        } else if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                o.b(entry.getKey() instanceof String);
                hashMap.put((String) entry.getKey(), zzb(entry.getValue()));
            }
            return new zzrh(hashMap);
        } else if (obj instanceof Bundle) {
            HashMap hashMap2 = new HashMap();
            Bundle bundle = (Bundle) obj;
            for (String next : bundle.keySet()) {
                hashMap2.put(next, zzb(bundle.get(next)));
            }
            return new zzrh(hashMap2);
        } else {
            throw new UnsupportedOperationException("Type not supported: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public static zzqz zzc(zzie zzie, zzqz zzqz) {
        o.h(zzqz);
        if (!zzj(zzqz) && !(zzqz instanceof zzrc) && !(zzqz instanceof zzrg) && !(zzqz instanceof zzrh)) {
            if (zzqz instanceof zzri) {
                zzqz = zzd(zzie, (zzri) zzqz);
            } else {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
        }
        if (zzqz == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        } else if (!(zzqz instanceof zzri)) {
            return zzqz;
        } else {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
    }

    public static zzqz zzd(zzie zzie, zzri zzri) {
        String zzi = zzri.zzi();
        List zzj = zzri.zzj();
        zzqz zzb = zzie.zzb(zzi);
        if (zzb == null) {
            throw new UnsupportedOperationException(w0.d("Function '", zzi, "' is not supported"));
        } else if (zzb instanceof zzrc) {
            return ((zzrc) zzb).zzi().zzd(zzie, (zzqz[]) zzj.toArray(new zzqz[zzj.size()]));
        } else {
            throw new UnsupportedOperationException(w0.d("Function '", zzi, "' is not a function"));
        }
    }

    public static zzqz zze(zzqz zzqz) {
        if (!(zzqz instanceof zzrh)) {
            return zzqz;
        }
        HashSet hashSet = new HashSet();
        Map map = ((zzrh) zzqz).zza;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == zzrd.zze) {
                hashSet.add((String) entry.getKey());
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
        return zzqz;
    }

    public static zzrd zzf(zzie zzie, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzqz zzqz = (zzqz) it.next();
            o.b(zzqz instanceof zzri);
            zzqz zzc = zzc(zzie, zzqz);
            if (zzi(zzc)) {
                return (zzrd) zzc;
            }
        }
        return zzrd.zze;
    }

    public static Object zzg(zzqz zzqz) {
        String concat;
        if (zzqz == null || zzqz == zzrd.zzd) {
            return null;
        }
        if (zzqz instanceof zzra) {
            return ((zzra) zzqz).zzi();
        }
        if (zzqz instanceof zzrb) {
            zzrb zzrb = (zzrb) zzqz;
            double doubleValue = zzrb.zzi().doubleValue();
            return (Double.isInfinite(doubleValue) || doubleValue - Math.floor(doubleValue) >= 1.0E-5d) ? zzrb.zzi().toString() : Integer.valueOf((int) doubleValue);
        } else if (zzqz instanceof zzrk) {
            return ((zzrk) zzqz).zzk();
        } else {
            if (zzqz instanceof zzrg) {
                ArrayList arrayList = new ArrayList();
                for (zzqz zzqz2 : ((zzrg) zzqz).zzk()) {
                    Object zzg = zzg(zzqz2);
                    if (zzg == null) {
                        concat = String.format("Failure to convert a list element to object: %s (%s)", new Object[]{zzqz2, zzqz2.getClass().getCanonicalName()});
                    } else {
                        arrayList.add(zzg);
                    }
                }
                return arrayList;
            } else if (zzqz instanceof zzrh) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((zzrh) zzqz).zza.entrySet()) {
                    Object zzg2 = zzg((zzqz) entry.getValue());
                    if (zzg2 == null) {
                        concat = String.format("Failure to convert a map's value to object: %s (%s)", new Object[]{entry.getValue(), ((zzqz) entry.getValue()).getClass().getCanonicalName()});
                    } else {
                        hashMap.put((String) entry.getKey(), zzg2);
                    }
                }
                return hashMap;
            } else {
                concat = "Converting to Object from unknown abstract type: ".concat(String.valueOf(zzqz.getClass()));
            }
            zzho.zza(concat);
            return null;
        }
    }

    public static Map zzh(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                obj = zzh((Bundle) obj);
            } else if (obj instanceof List) {
                obj = zzk((List) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static boolean zzi(zzqz zzqz) {
        return zzqz == zzrd.zzc || zzqz == zzrd.zzb || ((zzqz instanceof zzrd) && ((zzrd) zzqz).zzj());
    }

    public static boolean zzj(zzqz zzqz) {
        return (zzqz instanceof zzra) || (zzqz instanceof zzrb) || (zzqz instanceof zzrk) || zzqz == zzrd.zzd || zzqz == zzrd.zze;
    }

    private static List zzk(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof Bundle) {
                next = zzh((Bundle) next);
            } else if (next instanceof List) {
                next = zzk((List) next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}

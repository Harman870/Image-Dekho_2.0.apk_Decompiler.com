package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzju {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2833a = 0;
    private static final Map zzb;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(zza.CONTAINS.toString(), new zzjt("contains"));
        hashMap.put(zza.ENDS_WITH.toString(), new zzjt("endsWith"));
        hashMap.put(zza.EQUALS.toString(), new zzjt("equals"));
        hashMap.put(zza.GREATER_EQUALS.toString(), new zzjt("greaterEquals"));
        hashMap.put(zza.GREATER_THAN.toString(), new zzjt("greaterThan"));
        hashMap.put(zza.LESS_EQUALS.toString(), new zzjt("lessEquals"));
        hashMap.put(zza.LESS_THAN.toString(), new zzjt("lessThan"));
        hashMap.put(zza.REGEX.toString(), new zzjt("regex", new String[]{zzb.ARG0.toString(), zzb.ARG1.toString(), zzb.IGNORE_CASE.toString()}));
        hashMap.put(zza.STARTS_WITH.toString(), new zzjt("startsWith"));
        zzb = hashMap;
    }

    public static zzri zza(String str, Map map, zzie zzie) {
        Object obj;
        Map map2 = zzb;
        if (map2.containsKey(str)) {
            zzjt zzjt = (zzjt) map2.get(str);
            String[] zzb2 = zzjt.zzb();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < zzb2.length; i10++) {
                if (!map.containsKey(zzb2[i10])) {
                    obj = zzrd.zze;
                } else {
                    obj = (zzqz) map.get(zzb2[i10]);
                }
                arrayList.add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new zzrk("gtmUtils"));
            zzri zzri = new zzri("15", arrayList2);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(zzri);
            arrayList3.add(new zzrk("mobile"));
            zzri zzri2 = new zzri("17", arrayList3);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(zzri2);
            arrayList4.add(new zzrk(zzjt.zza()));
            arrayList4.add(new zzrg(arrayList));
            return new zzri("2", arrayList4);
        }
        throw new RuntimeException(w0.d("Fail to convert ", str, " to the internal representation"));
    }

    public static String zzb(String str) {
        Map map = zzb;
        if (map.containsKey(str)) {
            return ((zzjt) map.get(str)).zza();
        }
        return null;
    }
}

package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import r3.o;

public final class zzpj {
    public static zzjv zza(Object obj) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            str = jSONObject.getString("name");
            jSONArray2 = jSONObject.getJSONArray("params");
            jSONArray = jSONObject.getJSONArray("instructions");
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray3 = (JSONArray) obj;
            o.b(jSONArray3.length() >= 3);
            str = jSONArray3.getString(1);
            JSONArray jSONArray4 = jSONArray3.getJSONArray(2);
            JSONArray jSONArray5 = new JSONArray();
            for (int i10 = 1; i10 < jSONArray4.length(); i10++) {
                o.b(jSONArray4.get(i10) instanceof String);
                jSONArray5.put(jSONArray4.get(i10));
            }
            JSONArray jSONArray6 = new JSONArray();
            for (int i11 = 3; i11 < jSONArray3.length(); i11++) {
                jSONArray6.put(jSONArray3.get(i11));
            }
            jSONArray = jSONArray6;
            jSONArray2 = jSONArray5;
        } else {
            throw new IllegalArgumentException("invalid JSON in runtime section");
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
            arrayList.add(jSONArray2.getString(i12));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            JSONArray jSONArray7 = jSONArray.getJSONArray(i13);
            if (jSONArray7.length() != 0) {
                arrayList2.add(zze(jSONArray7));
            }
        }
        return new zzjv((zzie) null, str, arrayList, arrayList2);
    }

    public static zzqp zzb(JSONArray jSONArray, List list, List list2) {
        zzqn zzqn = new zzqn();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            int i11 = 1;
            if (jSONArray2.getString(0).equals("if")) {
                while (i11 < jSONArray2.length()) {
                    zzqn.zzc((zzqm) list2.get(jSONArray2.getInt(i11)));
                    i11++;
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                while (i11 < jSONArray2.length()) {
                    zzqn.zzb((zzqm) list2.get(jSONArray2.getInt(i11)));
                    i11++;
                }
            } else if (jSONArray2.getString(0).equals("add")) {
                while (i11 < jSONArray2.length()) {
                    zzqn.zza((zzqm) list.get(jSONArray2.getInt(i11)));
                    i11++;
                }
            } else if (jSONArray2.getString(0).equals("block")) {
                while (i11 < jSONArray2.length()) {
                    zzqn.zzd((zzqm) list.get(jSONArray2.getInt(i11)));
                    i11++;
                }
            } else {
                zzf("Unknown Rule property: ".concat(String.valueOf(jSONArray2.getString(0))));
            }
        }
        return zzqn.zze();
    }

    public static zzqt zzc(Object obj, List list) {
        zzqt zzqt;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            String string = jSONArray.getString(0);
            if (string.equals("escape")) {
                zzqt zzc = zzc(jSONArray.get(1), list);
                for (int i10 = 2; i10 < jSONArray.length(); i10++) {
                    zzc.zza(jSONArray.getInt(i10));
                }
                return zzc;
            }
            if (string.equals("list")) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 1; i11 < jSONArray.length(); i11++) {
                    arrayList.add(zzc(jSONArray.get(i11), list).zzc());
                }
                zzqt = new zzqt(2, arrayList);
            } else if (string.equals("map")) {
                HashMap hashMap = new HashMap();
                for (int i12 = 1; i12 < jSONArray.length(); i12 += 2) {
                    hashMap.put(zzc(jSONArray.get(i12), list).zzc(), zzc(jSONArray.get(i12 + 1), list).zzc());
                }
                zzqt = new zzqt(3, hashMap);
            } else if (string.equals("macro")) {
                zzqt zzqt2 = new zzqt(4, list.get(jSONArray.getInt(1)));
                zzqt2.zzb(true);
                return zzqt2;
            } else if (string.equals("template")) {
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 1; i13 < jSONArray.length(); i13++) {
                    arrayList2.add(zzc(jSONArray.get(i13), list).zzc());
                }
                zzqt = new zzqt(7, arrayList2);
            }
            zzqt.zzb(true);
            return zzqt;
        }
        if (obj instanceof Boolean) {
            zzqt = new zzqt(8, obj);
        } else if (obj instanceof Integer) {
            zzqt = new zzqt(6, obj);
        } else if (obj instanceof String) {
            zzqt = new zzqt(1, obj);
        }
        return zzqt;
        zzf("Invalid value type: ".concat(String.valueOf(obj)));
        return null;
    }

    public static List zzd(JSONArray jSONArray, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzqk zzqk = new zzqk();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzqv zzc = zzc(jSONObject.get(next), list).zzc();
                if ("push_after_evaluate".equals(next)) {
                    zzqk.zzb(zzc);
                } else {
                    zzqk.zza(next, zzc);
                }
            }
            arrayList.add(zzqk.zzc());
        }
        return arrayList;
    }

    private static zzri zze(JSONArray jSONArray) {
        Object obj;
        o.b(jSONArray.length() > 0);
        String string = jSONArray.getString(0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 1; i10 < jSONArray.length(); i10++) {
            Object obj2 = jSONArray.get(i10);
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() != 0) {
                    obj = zze(jSONArray2);
                }
            } else {
                obj = obj2 == JSONObject.NULL ? zzrd.zzd : zzrl.zzb(obj2);
            }
            arrayList.add(obj);
        }
        return new zzri(string, arrayList);
    }

    private static void zzf(String str) {
        zzho.zza(str);
        throw new zzpi(str);
    }
}

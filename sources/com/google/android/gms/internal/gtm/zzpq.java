package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzpq implements zzpp {
    public final zzpv zza(byte[] bArr) {
        if (bArr == null) {
            throw new zzpi("Cannot parse a null byte[]");
        } else if (bArr.length != 0) {
            try {
                Object obj = new JSONObject(new String(bArr)).get("resource");
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    zzqi zzqi = new zzqi();
                    zzqi.zzc(jSONObject.optString("version"));
                    JSONArray jSONArray = jSONObject.getJSONArray("macros");
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add(jSONArray.getJSONObject(i10).getString("instance_name"));
                    }
                    List zzd = zzpj.zzd(jSONObject.getJSONArray("tags"), arrayList);
                    List zzd2 = zzpj.zzd(jSONObject.getJSONArray("predicates"), arrayList);
                    for (zzqm zza : zzpj.zzd(jSONObject.getJSONArray("macros"), arrayList)) {
                        zzqi.zza(zza);
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray("rules");
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        zzqi.zzb(zzpj.zzb(jSONArray2.getJSONArray(i11), zzd, zzd2));
                    }
                    zzqj zzd3 = zzqi.zzd();
                    zzho.zzd("The container was successfully parsed from the resource");
                    return new zzpv(Status.f2805f, 0, new zzpu((zzph) null, (byte[]) null, zzd3, 0), zzps.zzb.zza(bArr).zzc());
                }
                throw new zzpi("Resource map not found");
            } catch (JSONException unused) {
                throw new zzpi("The resource data is corrupted. The container cannot be extracted from the JSON data");
            } catch (zzpi unused2) {
                throw new zzpi("The resource data is invalid. The container cannot be extracted from the JSON data");
            }
        } else {
            throw new zzpi("Cannot parse a 0 length byte[]");
        }
    }
}

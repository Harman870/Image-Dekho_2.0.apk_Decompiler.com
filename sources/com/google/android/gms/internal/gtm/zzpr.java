package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzpr implements zzpp {
    public final zzpv zza(byte[] bArr) {
        zzqs zzqs;
        if (bArr == null) {
            throw new zzpi("Cannot parse a null byte[]");
        } else if (bArr.length != 0) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                JSONArray optJSONArray = jSONObject.optJSONArray("runtime");
                if (optJSONArray == null) {
                    zzqs = null;
                } else {
                    zzqq zzqq = new zzqq();
                    Object obj = jSONObject.get("resource");
                    if (obj instanceof JSONObject) {
                        zzqq.zzb(((JSONObject) obj).optString("version"));
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            Object obj2 = optJSONArray.get(i10);
                            if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                                zzqq.zza(zzpj.zza(obj2));
                            }
                        }
                        zzqs = zzqq.zzc();
                    } else {
                        throw new zzpi("Resource map not found");
                    }
                }
                if (zzqs != null) {
                    zzho.zzd("The runtime configuration was successfully parsed from the resource");
                }
                return new zzpv(Status.f2805f, 0, (zzpu) null, zzqs);
            } catch (JSONException unused) {
                throw new zzpi("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
            } catch (zzpi unused2) {
                throw new zzpi("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
            }
        } else {
            throw new zzpi("Cannot parse a 0 length byte[]");
        }
    }
}

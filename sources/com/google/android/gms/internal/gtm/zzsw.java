package com.google.android.gms.internal.gtm;

import androidx.activity.e;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzsw implements Map, Serializable {
    @CheckForNull
    private transient zzsx zza;
    @CheckForNull
    private transient zzsx zzb;
    @CheckForNull
    private transient zzsq zzc;

    public static zzsw zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        zzso.zza(obj, obj2);
        zzso.zza(obj3, obj4);
        zzso.zza(obj5, obj6);
        zzso.zza(obj7, obj8);
        zzso.zza(obj9, obj10);
        zzso.zza(obj11, "&cu");
        return zzte.zzg(6, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, "&cu"}, (zzsv) null);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zztg.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzsx zzsx = this.zzb;
        if (zzsx != null) {
            return zzsx;
        }
        zzsx zze = zze();
        this.zzb = zze;
        return zze;
    }

    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
            sb.append('{');
            boolean z9 = true;
            for (Map.Entry entry : entrySet()) {
                if (!z9) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z9 = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException(e.a("size cannot be negative but was: ", size));
    }

    public abstract zzsq zza();

    /* renamed from: zzb */
    public final zzsq values() {
        zzsq zzsq = this.zzc;
        if (zzsq != null) {
            return zzsq;
        }
        zzsq zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    public abstract zzsx zzd();

    public abstract zzsx zze();

    /* renamed from: zzf */
    public final zzsx entrySet() {
        zzsx zzsx = this.zza;
        if (zzsx != null) {
            return zzsx;
        }
        zzsx zzd = zzd();
        this.zza = zzd;
        return zzd;
    }
}

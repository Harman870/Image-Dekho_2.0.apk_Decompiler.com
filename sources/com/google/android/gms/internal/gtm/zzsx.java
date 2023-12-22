package com.google.android.gms.internal.gtm;

import androidx.activity.e;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzsx extends zzsq implements Set {
    @CheckForNull
    private transient zzst zza;

    public static int zzf(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzsx zzi(Object obj, Object obj2, Object obj3) {
        return zzl(3, "", "0", "false");
    }

    public static zzsx zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "GET", VersionInfo.GIT_BRANCH, "POST", "PUT");
    }

    private static zzsx zzl(int i10, Object... objArr) {
        if (i10 == 0) {
            return zztf.zza;
        }
        if (i10 != 1) {
            int zzf = zzf(i10);
            Object[] objArr2 = new Object[zzf];
            int i11 = zzf - 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i10) {
                Object obj = objArr[i12];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int zza2 = zzsp.zza(hashCode);
                    while (true) {
                        int i15 = zza2 & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            zza2++;
                        } else {
                            objArr[i14] = obj;
                            objArr2[i15] = obj;
                            i13 += hashCode;
                            i14++;
                            break;
                        }
                    }
                    i12++;
                } else {
                    throw new NullPointerException(e.a("at index ", i12));
                }
            }
            Arrays.fill(objArr, i14, i10, (Object) null);
            if (i14 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzth(obj3);
            }
            if (zzf(i14) < zzf / 2) {
                return zzl(i14, objArr);
            }
            int length = objArr.length;
            if (i14 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i14);
            }
            return new zztf(objArr, i13, objArr2, i11, i14);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new zzth(obj4);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzsx) && zzk() && ((zzsx) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return zztg.zza(this);
    }

    /* renamed from: zzd */
    public abstract zzti iterator();

    public final zzst zzg() {
        zzst zzst = this.zza;
        if (zzst != null) {
            return zzst;
        }
        zzst zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    public zzst zzh() {
        Object[] array = toArray();
        int i10 = zzst.f2834a;
        return zzst.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}

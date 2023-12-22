package com.google.android.gms.internal.gtm;

public enum zza {
    REGEX("_re"),
    STARTS_WITH("_sw"),
    ENDS_WITH("_ew"),
    CONTAINS("_cn"),
    EQUALS("_eq"),
    LESS_THAN("_lt"),
    LESS_EQUALS("_le"),
    GREATER_THAN("_gt"),
    GREATER_EQUALS("_ge"),
    UNIVERSAL_ANALYTICS("_ua");
    
    private final String zzbo;

    private zza(String str) {
        this.zzbo = str;
    }

    public final String toString() {
        return this.zzbo;
    }
}

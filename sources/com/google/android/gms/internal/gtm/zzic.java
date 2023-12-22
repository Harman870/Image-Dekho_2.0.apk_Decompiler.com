package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import androidx.fragment.app.w0;
import com.google.android.gms.tagmanager.zzcf;
import com.google.android.gms.tagmanager.zzco;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r3.o;

public final class zzic {
    private final Context zza;
    private final zzqj zzc;
    private final zzco zzd;
    /* access modifiers changed from: private */
    public final zzcf zze;
    private final zzie zzf;
    private final zzrh zzg;
    private final zzrh zzh;
    private final Set zzi = new HashSet();
    private int zzj;
    private zznw zzk;
    /* access modifiers changed from: private */
    public zzgz zzl;

    public zzic(Context context, String str, zzqj zzqj, zzqs zzqs, zzco zzco, zzcf zzcf) {
        zzie zzie = new zzie();
        this.zzf = zzie;
        zzrh zzrh = new zzrh(new HashMap(50));
        this.zzg = zzrh;
        zzrh zzrh2 = new zzrh(new HashMap(10));
        this.zzh = zzrh2;
        zzhw zzhw = new zzhw(this);
        if (zzqj == null) {
            throw new NullPointerException("Internal Error: Container resource cannot be null");
        } else if (zzqs != null) {
            o.f("Internal Error: ContainerId cannot be empty", str);
            o.h(zzco);
            o.h(zzcf);
            this.zza = context;
            this.zzc = zzqj;
            this.zzd = zzco;
            this.zze = zzcf;
            zzie.zzc(IronSourceConstants.BOOLEAN_TRUE_AS_STRING, new zzrc(new zzkv()));
            zzie.zzc("12", new zzrc(new zzkw()));
            zzie.zzc("18", new zzrc(new zzkx()));
            zzie.zzc("19", new zzrc(new zzky()));
            zzie.zzc("20", new zzrc(new zzkz()));
            zzie.zzc("21", new zzrc(new zzla()));
            zzie.zzc("23", new zzrc(new zzlb()));
            zzie.zzc("24", new zzrc(new zzlc()));
            zzie.zzc("27", new zzrc(new zzld()));
            zzie.zzc("28", new zzrc(new zzle()));
            zzie.zzc("29", new zzrc(new zzlf()));
            zzie.zzc("30", new zzrc(new zzlg()));
            zzie.zzc("32", new zzrc(new zzlh()));
            zzie.zzc("33", new zzrc(new zzlh()));
            zzie.zzc("34", new zzrc(new zzli()));
            zzie.zzc("35", new zzrc(new zzli()));
            zzie.zzc("39", new zzrc(new zzlj()));
            zzie.zzc("40", new zzrc(new zzlk()));
            zzie.zzc("0", new zzrc(new zzmh()));
            zzie.zzc("10", new zzrc(new zzmi()));
            zzie.zzc("25", new zzrc(new zzmj()));
            zzie.zzc("26", new zzrc(new zzmk()));
            zzie.zzc("37", new zzrc(new zzml()));
            zzie.zzc("2", new zzrc(new zzll()));
            zzie.zzc("3", new zzrc(new zzlm()));
            zzie.zzc("4", new zzrc(new zzln()));
            zzie.zzc("5", new zzrc(new zzlo()));
            zzie.zzc("6", new zzrc(new zzlp()));
            zzie.zzc("7", new zzrc(new zzlq()));
            zzie.zzc("8", new zzrc(new zzlr()));
            zzie.zzc("9", new zzrc(new zzlo()));
            zzie.zzc("13", new zzrc(new zzls()));
            zzie.zzc("47", new zzrc(new zzlt()));
            zzie.zzc("15", new zzrc(new zzlu()));
            zzie.zzc("48", new zzrc(new zzlv(this)));
            zzlw zzlw = new zzlw();
            zzie.zzc("16", new zzrc(zzlw));
            zzie.zzc("17", new zzrc(zzlw));
            zzie.zzc("22", new zzrc(new zzly()));
            zzie.zzc("45", new zzrc(new zzlz()));
            zzie.zzc("46", new zzrc(new zzma()));
            zzie.zzc("36", new zzrc(new zzmb()));
            zzie.zzc("43", new zzrc(new zzmc()));
            zzie.zzc("38", new zzrc(new zzmd()));
            zzie.zzc("44", new zzrc(new zzme()));
            zzie.zzc("41", new zzrc(new zzmf()));
            zzie.zzc("42", new zzrc(new zzmg()));
            zzl(zza.CONTAINS, new zzot());
            zzl(zza.ENDS_WITH, new zzou());
            zzl(zza.EQUALS, new zzov());
            zzl(zza.GREATER_EQUALS, new zzow());
            zzl(zza.GREATER_THAN, new zzox());
            zzl(zza.LESS_EQUALS, new zzoy());
            zzl(zza.LESS_THAN, new zzoz());
            zzl(zza.REGEX, new zzpb());
            zzl(zza.STARTS_WITH, new zzpc());
            zzrh.zzf("advertiserId", new zzrc(new zznm(context)));
            zzrh.zzf("advertiserTrackingEnabled", new zzrc(new zznn(context)));
            zzrh.zzf("adwordsClickReferrer", new zzrc(new zzno(zzhw)));
            zzrh.zzf("applicationId", new zzrc(new zznp(context)));
            zzrh.zzf("applicationName", new zzrc(new zznq(context)));
            zzrh.zzf("applicationVersion", new zzrc(new zznr(context)));
            zzrh.zzf("applicationVersionName", new zzrc(new zzns(context)));
            zzrh.zzf("arbitraryPixieMacro", new zzrc(new zznj(1, zzie)));
            zzrh.zzf("carrier", new zzrc(new zznt(context)));
            zzrh.zzf("constant", new zzrc(new zzmb()));
            zzrh.zzf("containerId", new zzrc(new zznu(new zzrk(str))));
            zzrh.zzf("containerVersion", new zzrc(new zznu(new zzrk(zzqj.zzb()))));
            zzrh.zzf("customMacro", new zzrc(new zzni(new zzia(this, (zzhz) null))));
            zzrh.zzf("deviceBrand", new zzrc(new zznx()));
            zzrh.zzf("deviceId", new zzrc(new zzny(context)));
            zzrh.zzf("deviceModel", new zzrc(new zznz()));
            zzrh.zzf("deviceName", new zzrc(new zzoa()));
            zzrh.zzf("encode", new zzrc(new zzob()));
            zzrh.zzf("encrypt", new zzrc(new zzoc()));
            zzrh.zzf("event", new zzrc(new zznv()));
            zzrh.zzf("eventParameters", new zzrc(new zzod(zzhw)));
            zzrh.zzf("version", new zzrc(new zzoe()));
            zzrh.zzf("hashcode", new zzrc(new zzof()));
            zzrh.zzf("installReferrer", new zzrc(new zzog(context)));
            zzrh.zzf("join", new zzrc(new zzoh()));
            zzrh.zzf("language", new zzrc(new zzoi()));
            zzrh.zzf("locale", new zzrc(new zzoj()));
            zzrh.zzf("adWordsUniqueId", new zzrc(new zzol(context)));
            zzrh.zzf("osVersion", new zzrc(new zzom()));
            zzrh.zzf("platform", new zzrc(new zzon()));
            zzrh.zzf("random", new zzrc(new zzoo()));
            zzrh.zzf("regexGroup", new zzrc(new zzop()));
            zzrh.zzf("resolution", new zzrc(new zzor(context)));
            zzrh.zzf("runtimeVersion", new zzrc(new zzoq()));
            zzrh.zzf("sdkVersion", new zzrc(new zzos()));
            this.zzk = new zznw();
            zzrh.zzf("currentTime", new zzrc(this.zzk));
            zzrh.zzf("userProperty", new zzrc(new zzok(zzhw)));
            zzrh.zzf("arbitraryPixel", new zzrc(new zzpf(zzgx.zza(context))));
            zzrh.zzf("customTag", new zzrc(new zzni(new zzhy(this, (zzhx) null))));
            zzrh.zzf("universalAnalytics", new zzrc(new zzpg(context, zzhw)));
            zzrh.zzf("queueRequest", new zzrc(new zzpd(zzgx.zza(context))));
            zzrh.zzf("sendMeasurement", new zzrc(new zzpe(zzco, zzhw)));
            zzrh.zzf("arbitraryPixieTag", new zzrc(new zznj(0, zzie)));
            zzrh.zzf("suppressPassthrough", new zzrc(new zznl(context, zzhw)));
            zzrh2.zzf("decodeURI", new zzrc(new zznc()));
            zzrh2.zzf("decodeURIComponent", new zzrc(new zznd()));
            zzrh2.zzf("encodeURI", new zzrc(new zzne()));
            zzrh2.zzf("encodeURIComponent", new zzrc(new zznf()));
            zzrh2.zzf("log", new zzrc(new zznk()));
            zzrh2.zzf("isArray", new zzrc(new zzng()));
            for (zzjv zzjv : zzqs.zza()) {
                zzjv.zzc(this.zzf);
                this.zzf.zzc(zzjv.zzb(), new zzrc(zzjv));
            }
            zzrh zzrh3 = new zzrh(new HashMap(1));
            zzrh3.zzf("mobile", this.zzg);
            zzrh3.zzf("common", this.zzh);
            this.zzf.zzc("gtmUtils", zzrh3);
            zzrh zzrh4 = new zzrh(new HashMap(this.zzg.zzi()));
            zzrh4.zzj();
            zzrh zzrh5 = new zzrh(new HashMap(this.zzh.zzi()));
            zzrh5.zzj();
            if (this.zzf.zzf("main") && (this.zzf.zzb("main") instanceof zzrc)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzrh3);
                zzrl.zzd(this.zzf, new zzri("main", arrayList));
            }
            this.zzg.zzf("base", zzrh4);
            this.zzh.zzf("base", zzrh5);
            zzrh3.zzj();
            this.zzg.zzj();
            this.zzh.zzj();
        } else {
            throw new NullPointerException("Internal Error: Runtime resource cannot be null");
        }
    }

    private final zzqz zzg(Map map) {
        Context context;
        String str;
        zzri zzri;
        zzqz zzqz = (zzqz) map.get(zzb.FUNCTION.toString());
        if (!(zzqz instanceof zzrk)) {
            context = this.zza;
            str = "No function id in properties";
        } else {
            String zzk2 = ((zzrk) zzqz).zzk();
            if (this.zzf.zzf(zzk2)) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).startsWith("vtp_")) {
                        hashMap.put(((String) entry.getKey()).substring(4), (zzqz) entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new zzrh(hashMap));
                zzri = new zzri(zzk2, arrayList);
            } else {
                String zzb = zzju.zzb(zzk2);
                if (zzb == null || !this.zzg.zzh(zzb)) {
                    zzgv.zza(w0.d("functionId '", zzk2, "' is not supported"), this.zza);
                    return zzrd.zze;
                }
                try {
                    zzri = zzju.zza(zzk2, map, this.zzf);
                } catch (RuntimeException e10) {
                    String message = e10.getMessage();
                    zzho.zza("Incorrect keys for function " + zzk2 + ". " + message);
                    zzri = null;
                }
            }
            if (zzri == null) {
                context = this.zza;
                str = "Internal error: failed to convert function to a valid statement";
            } else {
                zzho.zzd("Executing: ".concat(String.valueOf(zzri.zzi())));
                zzqz zzd2 = zzrl.zzd(this.zzf, zzri);
                if (!(zzd2 instanceof zzrd)) {
                    return zzd2;
                }
                zzrd zzrd = (zzrd) zzd2;
                if (zzrd.zzj()) {
                    return zzrd.zzi();
                }
                return zzd2;
            }
        }
        zzgv.zza(str, context);
        return zzrd.zze;
    }

    private final zzqz zzh(zzqv zzqv) {
        switch (zzqv.zza()) {
            case 1:
                try {
                    return new zzrb(Double.valueOf(Double.parseDouble((String) zzqv.zzb())));
                } catch (NumberFormatException unused) {
                    return new zzrk((String) zzqv.zzb());
                }
            case 2:
                List<zzqv> list = (List) zzqv.zzb();
                ArrayList arrayList = new ArrayList(list.size());
                for (zzqv zzh2 : list) {
                    arrayList.add(zzh(zzh2));
                }
                return new zzrg(arrayList);
            case 3:
                Map map = (Map) zzqv.zzb();
                HashMap hashMap = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    zzqz zzh3 = zzh((zzqv) entry.getKey());
                    hashMap.put(zzjx.zzd(zzh3), zzh((zzqv) entry.getValue()));
                }
                return new zzrh(hashMap);
            case 4:
                zzqz zzi2 = zzi((String) zzqv.zzb());
                if (!(zzi2 instanceof zzrk) || zzqv.zzc().isEmpty()) {
                    return zzi2;
                }
                String zzk2 = ((zzrk) zzi2).zzk();
                for (Integer intValue : zzqv.zzc()) {
                    if (intValue.intValue() == 12) {
                        try {
                            zzk2 = URLEncoder.encode(zzk2, "UTF-8").replaceAll("\\+", "%20");
                        } catch (UnsupportedEncodingException e10) {
                            zzho.zzb("Escape URI: unsupported encoding", e10);
                        }
                    }
                }
                return new zzrk(zzk2);
            case 5:
                return new zzrk((String) zzqv.zzb());
            case 6:
                return new zzrb(Double.valueOf(((Integer) zzqv.zzb()).doubleValue()));
            case 7:
                StringBuilder sb = new StringBuilder();
                for (zzqv zzh4 : (List) zzqv.zzb()) {
                    sb.append(zzjx.zzd(zzh(zzh4)));
                }
                return new zzrk(sb.toString());
            default:
                return new zzra((Boolean) zzqv.zzb());
        }
    }

    private final zzqz zzi(String str) {
        this.zzj++;
        zzho.zzd(zzj() + "Beginning to evaluate variable " + str);
        if (!this.zzi.contains(str)) {
            this.zzi.add(str);
            zzqm zza2 = this.zzc.zza(str);
            if (zza2 != null) {
                zzqz zzg2 = zzg(zzk(zza2.zza()));
                zzho.zzd(zzj() + "Done evaluating variable " + str);
                this.zzj = this.zzj + -1;
                this.zzi.remove(str);
                return zzg2;
            }
            this.zzj--;
            this.zzi.remove(str);
            throw new IllegalStateException(w0.d(zzj(), "Attempting to resolve unknown macro ", str));
        }
        this.zzj--;
        throw new IllegalStateException("Macro cycle detected.  Current macro reference: " + str + ". Previous macro references: " + this.zzi.toString());
    }

    private final String zzj() {
        if (this.zzj <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.zzj));
        for (int i10 = 2; i10 < this.zzj; i10++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    private final Map zzk(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), zzh((zzqv) entry.getValue()));
        }
        return hashMap;
    }

    private final void zzl(zza zza2, zzjw zzjw) {
        int i10 = zzju.f2833a;
        this.zzg.zzf(zzju.zzb(zza2.toString()), new zzrc(zzjw));
    }

    public final zzqz zzc(String str) {
        if (!this.zzi.contains(str)) {
            this.zzj = 0;
            return zzi(str);
        }
        String obj = this.zzi.toString();
        throw new IllegalStateException("Macro cycle detected.  Current macro reference: " + str + ". Previous macro references: " + obj);
    }

    public final zzqz zzd(zzqm zzqm) {
        this.zzi.clear();
        try {
            zzqz zzg2 = zzg(zzk(zzqm.zza()));
            if (zzg2 instanceof zzra) {
                return zzg2;
            }
            zzgv.zza("Predicate must return a boolean value", this.zza);
            return new zzra(Boolean.FALSE);
        } catch (IllegalStateException unused) {
            zzho.zza("Error evaluating predicate.");
            return zzrd.zzd;
        }
    }

    public final void zze() {
        zzgx.zza(this.zza);
        zzin.zzf().zzi();
    }

    public final void zzf(zzgz zzgz) {
        boolean z9;
        IllegalStateException e10;
        zzqz zzra;
        String str;
        String str2;
        this.zzf.zzc("gtm.globals.eventName", new zzrk(zzgz.zzb()));
        this.zzk.zza(zzgz);
        this.zzl = zzgz;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (zzqp zzqp : this.zzc.zzc()) {
            if (!zzqp.zza().isEmpty() || !zzqp.zzd().isEmpty()) {
                zzho.zzd("Evaluating trigger ".concat(String.valueOf(zzqp)));
                Iterator it = zzqp.zzb().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = zzqp.zzc().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                zzra = new zzra(Boolean.TRUE);
                                break;
                            }
                            zzqm zzqm = (zzqm) it2.next();
                            zzqz zzqz = (zzqz) hashMap.get(zzqm);
                            if (zzqz == null) {
                                zzqz = zzd(zzqm);
                                hashMap.put(zzqm, zzqz);
                            }
                            zzra = zzrd.zzd;
                            if (zzqz != zzra) {
                                if (!((zzra) zzqz).zzi().booleanValue()) {
                                    zzra = new zzra(Boolean.FALSE);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        zzqm zzqm2 = (zzqm) it.next();
                        zzqz zzqz2 = (zzqz) hashMap.get(zzqm2);
                        if (zzqz2 == null) {
                            zzqz2 = zzd(zzqm2);
                            hashMap.put(zzqm2, zzqz2);
                        }
                        zzra = zzrd.zzd;
                        if (zzqz2 != zzra) {
                            if (((zzra) zzqz2).zzi().booleanValue()) {
                                zzra = new zzra(Boolean.FALSE);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (zzra == zzrd.zzd) {
                    zzgv.zzc("Error encounted while evaluating trigger ".concat(String.valueOf(zzqp)), this.zza);
                    if (!zzqp.zzd().isEmpty()) {
                        str2 = String.valueOf(zzqp.zzd());
                        str = "Blocking tags: ";
                    }
                } else if (((zzra) zzra).zzi().booleanValue()) {
                    zzho.zzd("Trigger is firing: ".concat(String.valueOf(zzqp)));
                    if (!zzqp.zza().isEmpty()) {
                        zzho.zzd("Adding tags to firing candidates: ".concat(String.valueOf(zzqp.zza())));
                        hashSet.addAll(zzqp.zza());
                    }
                    if (!zzqp.zzd().isEmpty()) {
                        str2 = String.valueOf(zzqp.zzd());
                        str = "Blocking disabled tags: ";
                    }
                }
                zzho.zzd(str.concat(str2));
                hashSet2.addAll(zzqp.zzd());
            } else {
                zzho.zzd("Trigger is not being evaluated since it has no associated tags: ".concat(String.valueOf(zzqp)));
            }
        }
        hashSet.removeAll(hashSet2);
        Iterator it3 = hashSet.iterator();
        boolean z10 = false;
        while (it3.hasNext()) {
            zzqm zzqm3 = (zzqm) it3.next();
            this.zzi.clear();
            zzho.zzd("Executing firing tag ".concat(String.valueOf(zzqm3)));
            try {
                zzg(zzk(zzqm3.zza()));
                zzqv zzqv = (zzqv) zzqm3.zza().get(zzb.DISPATCH_ON_FIRE.toString());
                if (zzqv != null && zzqv.zza() == 8 && ((Boolean) zzqv.zzb()).booleanValue()) {
                    try {
                        zzho.zzd("Tag configured to dispatch on fire: " + String.valueOf(zzqm3));
                        z10 = true;
                    } catch (IllegalStateException e11) {
                        e10 = e11;
                        z9 = true;
                        zzgv.zzb(w0.d("Error firing tag ", String.valueOf(zzqm3), ": "), e10, this.zza);
                        z10 = z9;
                    }
                }
            } catch (IllegalStateException e12) {
                IllegalStateException illegalStateException = e12;
                z9 = z10;
                e10 = illegalStateException;
                zzgv.zzb(w0.d("Error firing tag ", String.valueOf(zzqm3), ": "), e10, this.zza);
                z10 = z9;
            }
        }
        this.zzf.zzd("gtm.globals.eventName");
        if (zzgz.zzf()) {
            zzho.zzd("Log passthrough event " + zzgz.zzb() + " to Firebase.");
            try {
                this.zzd.zzc(zzgz.zzc(), zzgz.zzb(), zzgz.zza(), zzgz.currentTimeMillis());
            } catch (RemoteException e13) {
                zzgv.zzb("Error calling measurement proxy: ", e13, this.zza);
            }
        } else {
            zzho.zzd("Non-passthrough event " + zzgz.zzb() + " doesn't get logged to Firebase directly.");
        }
        if (z10) {
            zzho.zzd("Dispatch called for dispatchOnFire tags.");
            zze();
        }
    }
}

package com.google.android.gms.internal.gtm;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

class zzcu extends zzbt {
    public final zzct zza;

    public zzcu(zzbx zzbx, zzct zzct) {
        super(zzbx);
        this.zza = zzct;
    }

    private final zzcs zzb(XmlResourceParser xmlResourceParser) {
        String trim;
        String str;
        xmlResourceParser.next();
        int eventType = xmlResourceParser.getEventType();
        while (eventType != 1) {
            if (xmlResourceParser.getEventType() == 2) {
                String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                if (lowerCase.equals("screenname")) {
                    String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                    String trim2 = xmlResourceParser.nextText().trim();
                    if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim2)) {
                        this.zza.zzb(attributeValue, trim2);
                    }
                } else if (lowerCase.equals("string")) {
                    String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "name");
                    String trim3 = xmlResourceParser.nextText().trim();
                    if (!TextUtils.isEmpty(attributeValue2) && trim3 != null) {
                        this.zza.zze(attributeValue2, trim3);
                    }
                } else if (lowerCase.equals("bool")) {
                    String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, "name");
                    trim = xmlResourceParser.nextText().trim();
                    if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim)) {
                        try {
                            this.zza.zzc(attributeValue3, Boolean.parseBoolean(trim));
                        } catch (NumberFormatException e10) {
                            e = e10;
                            str = "Error parsing bool configuration value";
                        }
                    }
                } else if (lowerCase.equals("integer")) {
                    String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, "name");
                    trim = xmlResourceParser.nextText().trim();
                    if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim)) {
                        try {
                            this.zza.zzd(attributeValue4, Integer.parseInt(trim));
                        } catch (NumberFormatException e11) {
                            e = e11;
                            str = "Error parsing int configuration value";
                        }
                    }
                }
            }
            eventType = xmlResourceParser.next();
        }
        return this.zza.zza();
        try {
            zzS(str, trim, e);
            eventType = xmlResourceParser.next();
        } catch (IOException | XmlPullParserException e12) {
            zzJ("Error parsing tracker configuration file", e12);
        }
    }

    public final zzcs zza(int i10) {
        try {
            return zzb(zzt().zzb().getResources().getXml(i10));
        } catch (Resources.NotFoundException e10) {
            zzR("inflate() called with unknown resourceId", e10);
            return null;
        }
    }
}

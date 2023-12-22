package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a  reason: collision with root package name */
    public String f3936a;

    /* renamed from: b  reason: collision with root package name */
    public int f3937b = 999999;

    /* renamed from: c  reason: collision with root package name */
    public double f3938c = 999999.99d;

    /* renamed from: d  reason: collision with root package name */
    public int f3939d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f3940e;

    /* renamed from: f  reason: collision with root package name */
    public int f3941f = -1;

    /* renamed from: g  reason: collision with root package name */
    public AtomicBoolean f3942g = null;

    /* renamed from: h  reason: collision with root package name */
    public double f3943h = -1.0d;

    /* renamed from: i  reason: collision with root package name */
    public long f3944i = 0;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<Pair<String, String>> f3945j = new ArrayList<>();

    public static boolean a(String str) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    public int getAge() {
        return this.f3939d;
    }

    public String getGender() {
        return this.f3940e;
    }

    public double getIapt() {
        return this.f3943h;
    }

    public AtomicBoolean getIsPaying() {
        return this.f3942g;
    }

    public int getLevel() {
        return this.f3941f;
    }

    public ArrayList<Pair<String, String>> getSegmentData() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f3939d != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3939d);
            arrayList.add(new Pair(AGE, sb.toString()));
        }
        if (!TextUtils.isEmpty(this.f3940e)) {
            arrayList.add(new Pair(GENDER, this.f3940e));
        }
        if (this.f3941f != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f3941f);
            arrayList.add(new Pair(LEVEL, sb2.toString()));
        }
        if (this.f3942g != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f3942g);
            arrayList.add(new Pair(PAYING, sb3.toString()));
        }
        if (this.f3943h != -1.0d) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f3943h);
            arrayList.add(new Pair(IAPT, sb4.toString()));
        }
        if (this.f3944i != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f3944i);
            arrayList.add(new Pair(USER_CREATION_DATE, sb5.toString()));
        }
        if (!TextUtils.isEmpty(this.f3936a)) {
            arrayList.add(new Pair("segName", this.f3936a));
        }
        arrayList.addAll(this.f3945j);
        return arrayList;
    }

    public String getSegmentName() {
        return this.f3936a;
    }

    public long getUcd() {
        return this.f3944i;
    }

    public void setAge(int i10) {
        if (i10 <= 0 || i10 > 199) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setAge( " + i10 + " ) age must be between 1-199", 2);
            return;
        }
        this.f3939d = i10;
    }

    public void setCustom(String str, String str2) {
        boolean z9;
        boolean z10;
        if (str == null) {
            z9 = false;
        } else {
            try {
                z9 = str.matches("^[a-zA-Z0-9]*$");
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (z9) {
            if (str2 == null) {
                z10 = false;
            } else {
                z10 = str2.matches("^[a-zA-Z0-9]*$");
            }
            if (z10 && a(str) && a(str2)) {
                String str3 = "custom_" + str;
                if (this.f3945j.size() >= 5) {
                    this.f3945j.remove(0);
                }
                this.f3945j.add(new Pair(str3, str2));
                return;
            }
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
    }

    public void setGender(String str) {
        if (TextUtils.isEmpty(str) || (!StringUtils.toLowerCase(str).equals("male") && !StringUtils.toLowerCase(str).equals("female"))) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
            return;
        }
        this.f3940e = str;
    }

    public void setIAPTotal(double d10) {
        if (d10 <= 0.0d || d10 >= this.f3938c) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f3938c, 2);
            return;
        }
        this.f3943h = Math.floor(d10 * 100.0d) / 100.0d;
    }

    public void setIsPaying(boolean z9) {
        if (this.f3942g == null) {
            this.f3942g = new AtomicBoolean();
        }
        this.f3942g.set(z9);
    }

    public void setLevel(int i10) {
        if (i10 <= 0 || i10 >= this.f3937b) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setLevel( " + i10 + " ) level must be between 1-" + this.f3937b, 2);
            return;
        }
        this.f3941f = i10;
    }

    public void setSegmentName(String str) {
        boolean z9;
        if (str == null) {
            z9 = false;
        } else {
            z9 = str.matches("^[a-zA-Z0-9]*$");
        }
        if (!z9 || !a(str)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
            return;
        }
        this.f3936a = str;
    }

    public void setUserCreationDate(long j10) {
        if (j10 > 0) {
            this.f3944i = j10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j10 + " ) is an invalid timestamp", 2);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = getSegmentData().iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            try {
                jSONObject.put((String) next.first, next.second);
            } catch (JSONException e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }
}

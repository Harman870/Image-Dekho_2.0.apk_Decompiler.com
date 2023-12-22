package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final e f4992d = new e();

    /* renamed from: a  reason: collision with root package name */
    public String f4993a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f4994b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f4995c = "";

    public static e a() {
        return f4992d;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f4993a)) {
            this.f4993a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f4993a;
    }

    public final synchronized String c() {
        if (TextUtils.isEmpty(this.f4994b)) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i10 = 0; i10 < 32; i10++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f4994b = sb.toString();
        }
        return this.f4994b;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.f4995c)) {
            try {
                this.f4995c = a.AnonymousClass1.a(c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e10) {
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f4995c;
    }
}

package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4998a;

    public static class a extends GZIPOutputStream {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ int f4999a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ByteArrayOutputStream byteArrayOutputStream, int i10) {
            super(byteArrayOutputStream);
            this.f4999a = i10;
            int i11 = this.f4999a;
            if (i11 >= 0 && i11 <= 9) {
                this.def.setLevel(i11);
            }
        }
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception while decompressing " + e10);
            return null;
        }
    }

    public static byte[] a(String str, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        a aVar = new a(byteArrayOutputStream, i10);
        aVar.write(str.getBytes());
        aVar.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public void a(boolean z9) {
        this.f4998a = z9;
    }

    public boolean a() {
        return this.f4998a;
    }
}

package x6;

import c6.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import o.g;
import org.json.JSONException;
import org.json.JSONObject;
import x6.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public File f12987a;

    /* renamed from: b  reason: collision with root package name */
    public final f f12988b;

    public c(f fVar) {
        this.f12988b = fVar;
    }

    public final File a() {
        if (this.f12987a == null) {
            synchronized (this) {
                if (this.f12987a == null) {
                    f fVar = this.f12988b;
                    fVar.a();
                    File filesDir = fVar.f2494a.getFilesDir();
                    this.f12987a = new File(filesDir, "PersistedInstallation." + this.f12988b.f() + ".json");
                }
            }
        }
        return this.f12987a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f12970b);
            jSONObject.put("Status", g.b(aVar.f12971c));
            jSONObject.put("AuthToken", aVar.f12972d);
            jSONObject.put("RefreshToken", aVar.f12973e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f12975g);
            jSONObject.put("ExpiresInSecs", aVar.f12974f);
            jSONObject.put("FisError", aVar.f12976h);
            f fVar = this.f12988b;
            fVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f2494a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(a())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i10 = d.f12989a;
        a.C0166a aVar = new a.C0166a();
        aVar.f12982f = 0L;
        aVar.b(1);
        aVar.f12981e = 0L;
        aVar.f12977a = optString;
        aVar.b(g.c(5)[optInt]);
        aVar.f12979c = optString2;
        aVar.f12980d = optString3;
        aVar.f12982f = Long.valueOf(optLong);
        aVar.f12981e = Long.valueOf(optLong2);
        aVar.f12983g = optString4;
        return aVar.a();
        throw th;
    }
}

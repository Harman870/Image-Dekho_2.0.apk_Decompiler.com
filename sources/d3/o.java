package d3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.Editable;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.OnSuccessListener;
import com.imgdkh.app.R;
import com.wallpapersindia.app.LoginScreen;
import com.wallpapersindia.app.utils.BackgroundWorker;
import d3.x;
import g3.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import w2.n;
import w2.s;
import z2.c;
import z5.b;

public final /* synthetic */ class o implements x.a, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f6073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6074b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6075c;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3) {
        this.f6073a = obj;
        this.f6074b = obj2;
        this.f6075c = obj3;
    }

    public final Object apply(Object obj) {
        boolean z9;
        long j10;
        boolean z10;
        byte[] bArr;
        x xVar = (x) this.f6073a;
        n nVar = (n) this.f6074b;
        s sVar = (s) this.f6075c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (xVar.s().compileStatement("PRAGMA page_size").simpleQueryForLong() * xVar.s().compileStatement("PRAGMA page_count").simpleQueryForLong() >= xVar.f6094d.e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            xVar.j(1, c.a.CACHE_FULL, nVar.g());
            return -1L;
        }
        Long t10 = x.t(sQLiteDatabase, sVar);
        if (t10 != null) {
            j10 = t10.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", sVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(sVar.d())));
            contentValues.put("next_request_ms", 0);
            if (sVar.c() != null) {
                contentValues.put("extras", Base64.encodeToString(sVar.c(), 0));
            }
            j10 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        int d10 = xVar.f6094d.d();
        byte[] bArr2 = nVar.d().f12717b;
        if (bArr2.length <= d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j10));
        contentValues2.put("transport_name", nVar.g());
        contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
        contentValues2.put("uptime_ms", Long.valueOf(nVar.h()));
        contentValues2.put("payload_encoding", nVar.d().f12716a.f11988a);
        contentValues2.put("code", nVar.c());
        contentValues2.put("num_attempts", 0);
        contentValues2.put("inline", Boolean.valueOf(z10));
        if (z10) {
            bArr = bArr2;
        } else {
            bArr = new byte[0];
        }
        contentValues2.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
        if (!z10) {
            int ceil = (int) Math.ceil(((double) bArr2.length) / ((double) d10));
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * d10, Math.min(i10 * d10, bArr2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i10));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
            }
        }
        for (Map.Entry next : Collections.unmodifiableMap(nVar.b()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put("name", (String) next.getKey());
            contentValues4.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
        }
        return Long.valueOf(insert);
    }

    public final void onSuccess(Object obj) {
        LoginScreen loginScreen = (LoginScreen) this.f6073a;
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) this.f6074b;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        loginScreen.F = ((b.C0178b) obj).a();
        BackgroundWorker backgroundWorker = new BackgroundWorker(loginScreen, loginScreen, loginScreen.getString(R.string.signup), true);
        Editable text = loginScreen.f5828z.getText();
        Objects.requireNonNull(text);
        backgroundWorker.execute(new String[]{googleSignInAccount.f2770e, googleSignInAccount.f2769d, (String) this.f6075c, text.toString(), loginScreen.G, googleSignInAccount.f2767b, loginScreen.F, loginScreen.E.a(loginScreen.getString(R.string.referral_code))});
    }
}

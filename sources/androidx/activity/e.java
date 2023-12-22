package androidx.activity;

import android.content.Context;
import android.database.Cursor;
import c7.f;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseCommonRegistrar;
import com.ironsource.mediationsdk.adunit.b.d;
import d3.x;
import j9.b;
import java.util.HashMap;
import q6.a;

public final /* synthetic */ class e implements x.a, TextInputLayout.f, f.a, b {
    public static String a(String str, int i10) {
        return str + i10;
    }

    public static String c(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static HashMap d(Class cls, a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static void e(int i10, int i11, HashMap hashMap, com.ironsource.mediationsdk.adunit.b.b bVar) {
        hashMap.put(bVar, new d.a(i10, i11));
    }

    public static /* synthetic */ String f(int i10) {
        return i10 == 1 ? "NONE" : i10 == 2 ? "READY_TO_LOAD" : i10 == 3 ? "STARTED_LOADING" : i10 == 4 ? "FIRST_AUCTION" : i10 == 5 ? "AUCTION" : i10 == 6 ? "LOADING" : i10 == 7 ? "RELOADING" : i10 == 8 ? "LOADED" : "null";
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    public String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }
}

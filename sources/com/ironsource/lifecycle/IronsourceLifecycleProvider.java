package com.ironsource.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class IronsourceLifecycleProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3782a = false;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Application application;
        f3782a = true;
        d a10 = d.a();
        Context context = getContext();
        if (d.f3795j.compareAndSet(false, true) && (application = (Application) context.getApplicationContext()) != null) {
            application.registerActivityLifecycleCallbacks(a10);
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

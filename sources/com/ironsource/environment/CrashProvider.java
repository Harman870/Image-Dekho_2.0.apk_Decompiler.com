package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class CrashProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public Context f3677a;

    /* renamed from: b  reason: collision with root package name */
    public String f3678b;

    /* renamed from: c  reason: collision with root package name */
    public UriMatcher f3679c = new UriMatcher(-1);

    /* renamed from: d  reason: collision with root package name */
    public String f3680d;

    /* renamed from: e  reason: collision with root package name */
    public String f3681e;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        int match = this.f3679c.match(uri);
        if (match == 1) {
            return this.f3680d;
        }
        if (match == 2) {
            return this.f3681e;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f3677a = getContext();
        new f(this.f3677a);
        this.f3678b = this.f3677a.getPackageName();
        Uri.parse("content://" + this.f3678b + "/REPORTS");
        this.f3680d = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f3681e = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f3679c.match(uri);
        if (match == 1) {
            return f.b();
        }
        if (match == 2) {
            return f.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

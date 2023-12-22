package e0;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z.d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f6127a = new d(0);

    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [e0.m[], android.database.Cursor] */
    public static l a(Context context, f fVar) {
        Cursor cursor;
        int i10;
        int i11;
        Uri uri;
        int i12;
        boolean z9;
        boolean z10;
        f fVar2 = fVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = fVar2.f6128a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(com.ironsource.adapters.ironsource.a.g("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(fVar2.f6129b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, f6127a);
            List<List<byte[]>> list = fVar2.f6131d;
            if (list == null) {
                list = d.b(0, resources);
            }
            int i13 = 0;
            while (true) {
                cursor = 0;
                if (i13 >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i13));
                Collections.sort(arrayList2, f6127a);
                if (arrayList.size() == arrayList2.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            z10 = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i14), (byte[]) arrayList2.get(i14))) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    break;
                }
                i13++;
            }
            if (resolveContentProvider == null) {
                return new l(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fVar2.f6130c}, (String) null, (Object) null);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        if (columnIndex != -1) {
                            i10 = cursor.getInt(columnIndex);
                        } else {
                            i10 = 0;
                        }
                        if (columnIndex4 != -1) {
                            i11 = cursor.getInt(columnIndex4);
                        } else {
                            i11 = 0;
                        }
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        Uri uri2 = uri;
                        if (columnIndex5 != -1) {
                            i12 = cursor.getInt(columnIndex5);
                        } else {
                            i12 = 400;
                        }
                        int i15 = i12;
                        if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        arrayList3.add(new m(uri2, i11, i15, z9, i10));
                    }
                }
                return new l(0, (m[]) arrayList3.toArray(new m[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + fVar2.f6129b);
        }
    }
}

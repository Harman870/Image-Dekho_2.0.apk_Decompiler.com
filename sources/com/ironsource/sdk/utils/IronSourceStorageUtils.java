package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import com.ironsource.environment.h;
import com.ironsource.sdk.h.c;
import com.ironsource.sdk.h.e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceStorageUtils {

    /* renamed from: a  reason: collision with root package name */
    public static e f5751a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5752b = false;

    public static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    public static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("supersonicads");
        sb.append(str);
        return new File(sb.toString());
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return androidx.activity.e.c(f.g(str), File.separator, str2);
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        String name;
        Object c10;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    Object c11 = c(file2);
                    if (c11 instanceof JSONArray) {
                        name = "files";
                        c10 = c(file2);
                    } else if (c11 instanceof JSONObject) {
                        name = file2.getName();
                        c10 = c(file2);
                    }
                    jSONObject.put(name, c10);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(c cVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        if (cVar == null || !cVar.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = cVar.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject3 = new JSONObject();
        for (File path : listFiles) {
            c cVar2 = new c(path.getPath());
            if (cVar2.isFile()) {
                str = cVar2.getName();
                jSONObject2 = cVar2.a();
                if (jSONObject.has(str)) {
                    jSONObject2 = SDKUtils.mergeJSONObjects(jSONObject2, jSONObject.getJSONObject(str));
                }
            } else if (cVar2.isDirectory()) {
                str = cVar2.getName();
                jSONObject2 = buildFilesMapOfDirectory(cVar2, jSONObject);
            }
            jSONObject3.put(str, jSONObject2);
        }
        return jSONObject3;
    }

    public static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObject.put(file2.getName(), c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObject.put("files", jSONArray);
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void deleteCacheDirectories(Context context) {
        a(h.r(context));
        a(h.t(context));
    }

    public static synchronized boolean deleteFile(c cVar) {
        synchronized (IronSourceStorageUtils.class) {
            if (!cVar.exists()) {
                return false;
            }
            boolean delete = cVar.delete();
            return delete;
        }
    }

    public static void deleteFilesDirectories(Context context) {
        a(h.s(context));
        a(h.u(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z9;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            z9 = deleteFolderContentRecursive(file) && file.delete();
        }
        return z9;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z9 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z9 &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z9 = false;
                }
            }
        }
        return z9;
    }

    public static void ensurePathSafety(File file, String str) {
        e eVar = f5751a;
        if (eVar == null || !eVar.f5668a.optBoolean("trvch", false)) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(a.j("illegal path access", canonicalPath2));
            }
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        e eVar = f5751a;
        boolean z9 = false;
        if ((eVar != null && eVar.f5668a.optBoolean("uxt", false)) || Build.VERSION.SDK_INT > 28) {
            z9 = true;
        }
        if (z9 && SDKUtils.isExternalStorageAvailable()) {
            e eVar2 = f5751a;
            File s10 = (eVar2 == null || !eVar2.a()) ? h.s(context) : h.r(context);
            if (s10 != null && s10.canWrite()) {
                f5752b = true;
                return s10.getPath();
            }
        }
        e eVar3 = f5751a;
        return ((eVar3 == null || !eVar3.a()) ? h.u(context) : h.t(context)).getPath();
    }

    public static ArrayList<c> getFilesInFolderRecursive(c cVar) {
        if (cVar == null || !cVar.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<c> arrayList = new ArrayList<>();
        File[] listFiles = cVar.listFiles();
        if (listFiles != null) {
            for (File path : listFiles) {
                c cVar2 = new c(path.getPath());
                if (cVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(cVar2));
                }
                if (cVar2.isFile()) {
                    arrayList.add(cVar2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b10 = b(new File(getDiskCacheDirPath(context)));
        if (!b10.exists()) {
            b10.mkdir();
        }
        return b10.getPath();
    }

    public static long getTotalSizeOfDir(c cVar) {
        long totalSizeOfDir;
        long j10 = 0;
        if (cVar != null && cVar.isDirectory()) {
            File[] listFiles = cVar.listFiles();
            if (listFiles == null) {
                return 0;
            }
            for (File path : listFiles) {
                c cVar2 = new c(path.getPath());
                if (cVar2.isFile()) {
                    totalSizeOfDir = cVar2.length();
                } else if (cVar2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(cVar2);
                }
                j10 = totalSizeOfDir + j10;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(Context context, e eVar) {
        f5751a = eVar;
        if (eVar != null && eVar.f5668a.optBoolean("deleteCacheDir", false)) {
            deleteCacheDirectories(context);
        }
        e eVar2 = f5751a;
        if (eVar2 != null && eVar2.f5668a.optBoolean("deleteFilesDir", false)) {
            deleteFilesDirectories(context);
        }
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f5752b;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(c cVar) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cVar));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append(10);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public static boolean renameFile(String str, String str2) {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i10;
                }
                fileOutputStream.write(bArr2, 0, read);
                i10 += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}

package a7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f115a;

    /* renamed from: b  reason: collision with root package name */
    public final String f116b;

    /* renamed from: c  reason: collision with root package name */
    public final String f117c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f118d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final Executor f119e;

    public e0(SharedPreferences sharedPreferences, Executor executor) {
        this.f115a = sharedPreferences;
        this.f116b = "topic_operation_queue";
        this.f117c = ",";
        this.f119e = executor;
    }

    public static e0 a(SharedPreferences sharedPreferences, Executor executor) {
        e0 e0Var = new e0(sharedPreferences, executor);
        synchronized (e0Var.f118d) {
            e0Var.f118d.clear();
            String string = e0Var.f115a.getString(e0Var.f116b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(e0Var.f117c)) {
                    String[] split = string.split(e0Var.f117c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            e0Var.f118d.add(str);
                        }
                    }
                }
            }
        }
        return e0Var;
    }
}

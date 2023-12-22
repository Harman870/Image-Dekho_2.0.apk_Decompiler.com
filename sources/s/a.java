package s;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.activity.e;

@SuppressLint({"LogConditional"})
public final class a {
    public static String a(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return e.a("?", i10);
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}

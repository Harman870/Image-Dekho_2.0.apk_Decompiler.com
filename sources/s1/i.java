package s1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.activity.f;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f11840a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11841b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11842c;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f11843e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a  reason: collision with root package name */
        public final Context f11844a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f11845b;

        /* renamed from: c  reason: collision with root package name */
        public b f11846c;

        /* renamed from: d  reason: collision with root package name */
        public float f11847d = ((float) f11843e);

        public a(Context context) {
            this.f11844a = context;
            this.f11845b = (ActivityManager) context.getSystemService("activity");
            this.f11846c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f11845b.isLowRamDevice()) {
                this.f11847d = 0.0f;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f11848a;

        public b(DisplayMetrics displayMetrics) {
            this.f11848a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i10;
        boolean z9;
        Context context = aVar.f11844a;
        if (aVar.f11845b.isLowRamDevice()) {
            i10 = 2097152;
        } else {
            i10 = 4194304;
        }
        this.f11842c = i10;
        ActivityManager activityManager = aVar.f11845b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES * IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f11846c.f11848a;
        float f10 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f11847d * f10);
        int round3 = Math.round(f10 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f11841b = round3;
            this.f11840a = round2;
        } else {
            float f11 = ((float) i11) / (aVar.f11847d + 2.0f);
            this.f11841b = Math.round(2.0f * f11);
            this.f11840a = Math.round(f11 * aVar.f11847d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder g10 = f.g("Calculation complete, Calculated memory cache size: ");
            g10.append(Formatter.formatFileSize(context, (long) this.f11841b));
            g10.append(", pool size: ");
            g10.append(Formatter.formatFileSize(context, (long) this.f11840a));
            g10.append(", byte array size: ");
            g10.append(Formatter.formatFileSize(context, (long) i10));
            g10.append(", memory class limited? ");
            if (i12 > round) {
                z9 = true;
            } else {
                z9 = false;
            }
            g10.append(z9);
            g10.append(", max size: ");
            g10.append(Formatter.formatFileSize(context, (long) round));
            g10.append(", memoryClass: ");
            g10.append(aVar.f11845b.getMemoryClass());
            g10.append(", isLowMemoryDevice: ");
            g10.append(aVar.f11845b.isLowRamDevice());
            Log.d("MemorySizeCalculator", g10.toString());
        }
    }
}

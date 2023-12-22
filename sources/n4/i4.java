package n4;

import android.content.Context;
import android.content.res.Resources;
import com.imgdkh.app.R;

public final class i4 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}

package j8;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.f;
import com.imgdkh.app.R;
import com.wallpapersindia.app.utils.BackgroundWorker;
import h8.a;
import l2.d;

public class o extends androidx.fragment.app.o implements BackgroundWorker.a {
    public static final /* synthetic */ int T = 0;

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_invite, viewGroup, false);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(j());
        Vibrator vibrator = (Vibrator) T().getSystemService("vibrator");
        ImageView imageView = (ImageView) inflate.findViewById(R.id.share);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.share_fb);
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.share_wp);
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.copy_btn);
        TextView textView = (TextView) inflate.findViewById(R.id.refer_code);
        TextView textView2 = (TextView) inflate.findViewById(R.id.refer_reward_text);
        if (!defaultSharedPreferences.getString(t(R.string.refer_reward), "").equals("")) {
            textView2.setText(defaultSharedPreferences.getString(t(R.string.refer_reward), ""));
        }
        StringBuilder g10 = f.g("https://play.google.com/store/apps/details?id=com.imgdkh.app&referrer=");
        g10.append(defaultSharedPreferences.getString(t(R.string.id), ""));
        String sb = g10.toString();
        textView.setOnClickListener(new l(this, sb, vibrator));
        imageView4.setOnClickListener(new m(this, sb, vibrator));
        imageView3.setOnClickListener(new n(this, sb));
        imageView2.setOnClickListener(new a(1, this, sb));
        imageView.setOnClickListener(new a8.a(this, 1, sb));
        return inflate;
    }

    public final void s(int i10, String str, String str2) {
        if (str2.equals(t(R.string.checker))) {
            d dVar = new d(j(), 1);
            dVar.s("Error");
            dVar.o(str);
            dVar.i();
            dVar.m("Close");
            dVar.V = null;
            dVar.show();
        }
    }
}

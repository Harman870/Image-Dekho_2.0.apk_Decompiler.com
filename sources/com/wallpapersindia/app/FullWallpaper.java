package com.wallpapersindia.app;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import com.imgdkh.app.R;
import d.f;
import h8.a;
import java.util.Objects;

public class FullWallpaper extends f {
    public static final /* synthetic */ int B = 0;
    public Dialog A;

    /* renamed from: x  reason: collision with root package name */
    public Integer f5820x = Integer.valueOf(R.drawable.f13240a1);

    /* renamed from: y  reason: collision with root package name */
    public ImageView f5821y;

    /* renamed from: z  reason: collision with root package name */
    public Button f5822z;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_full_wallpaper);
        Dialog dialog = new Dialog(this);
        this.A = dialog;
        dialog.requestWindowFeature(1);
        this.A.requestWindowFeature(1);
        this.A.setContentView(R.layout.alert_dialog_progress);
        this.A.setCancelable(false);
        Window window = this.A.getWindow();
        Objects.requireNonNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (this.A.getWindow() != null) {
            this.A.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        this.f5821y = (ImageView) findViewById(R.id.full_image);
        this.f5822z = (Button) findViewById(R.id.share_image);
        try {
            this.f5820x = Integer.valueOf(Integer.parseInt(getIntent().getStringExtra("item")));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
        this.f5821y.setImageResource(this.f5820x.intValue());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        StringBuilder g10 = androidx.activity.f.g("https://play.google.com/store/apps/details?id=com.imgdkh.app&referrer=");
        g10.append(defaultSharedPreferences.getString(getString(R.string.id), ""));
        this.f5822z.setOnClickListener(new a(0, this, g10.toString()));
    }
}

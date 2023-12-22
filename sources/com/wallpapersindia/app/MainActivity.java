package com.wallpapersindia.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.imgdkh.app.R;
import d.f;
import i4.h6;

public class MainActivity extends f {

    /* renamed from: x  reason: collision with root package name */
    public h6 f5830x;

    static {
        System.loadLibrary("app");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = 0;
        KeyEvent.Callback callback = null;
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        if (inflate instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) inflate;
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                KeyEvent.Callback findViewById = viewGroup.getChildAt(i10).findViewById(R.id.sample_text);
                if (findViewById != null) {
                    callback = findViewById;
                    break;
                }
                i10++;
            }
        }
        TextView textView = (TextView) callback;
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            this.f5830x = new h6((Object) constraintLayout, (Object) textView);
            setContentView((View) constraintLayout);
            ((TextView) this.f5830x.f7358b).setText(stringFromJNI());
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.sample_text)));
    }

    public native String stringFromJNI();
}

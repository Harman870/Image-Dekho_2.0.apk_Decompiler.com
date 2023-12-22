package h8;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.imgdkh.app.R;
import com.wallpapersindia.app.FullWallpaper;
import j8.o;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7021b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7022c;

    public /* synthetic */ a(int i10, Object obj, String str) {
        this.f7020a = i10;
        this.f7022c = obj;
        this.f7021b = str;
    }

    public final void onClick(View view) {
        switch (this.f7020a) {
            case 0:
                FullWallpaper fullWallpaper = (FullWallpaper) this.f7022c;
                String str = this.f7021b;
                int i10 = FullWallpaper.B;
                fullWallpaper.getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", fullWallpaper.getResources().getString(R.string.invite_msg) + str);
                fullWallpaper.startActivity(Intent.createChooser(intent, "Share via"));
                return;
            default:
                o oVar = (o) this.f7022c;
                String str2 = this.f7021b;
                int i11 = o.T;
                oVar.getClass();
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.setPackage("com.facebook.katana");
                intent2.putExtra("android.intent.extra.TEXT", oVar.q().getString(R.string.invite_msg) + str2);
                try {
                    oVar.a0(intent2);
                    return;
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(oVar.j(), "Install Facebook", 0).show();
                    return;
                }
        }
    }
}

package i8;

import android.content.Intent;
import android.view.View;
import com.wallpapersindia.app.FullWallpaper;
import j8.k;

public final class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f7943b;

    public c(d dVar, int i10) {
        this.f7943b = dVar;
        this.f7942a = i10;
    }

    public final void onClick(View view) {
        d dVar = this.f7943b;
        k kVar = (k) ((d3.k) dVar.f7945d).f6065a;
        int i10 = k.V;
        kVar.getClass();
        Intent intent = new Intent(kVar.j(), FullWallpaper.class);
        intent.putExtra("item", dVar.f7944c.get(this.f7942a).toString());
        kVar.a0(intent);
    }
}

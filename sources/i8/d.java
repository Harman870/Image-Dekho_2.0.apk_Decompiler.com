package i8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.imgdkh.app.R;
import d3.k;
import java.util.List;

public final class d extends RecyclerView.d<b> {

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f7944c;

    /* renamed from: d  reason: collision with root package name */
    public final a f7945d;

    public interface a {
    }

    public class b extends RecyclerView.z {

        /* renamed from: t  reason: collision with root package name */
        public ImageView f7946t;

        public b(View view) {
            super(view);
            this.f7946t = (ImageView) view.findViewById(R.id.wallpaper);
        }
    }

    public d(List list, k kVar) {
        this.f7944c = list;
        this.f7945d = kVar;
    }

    public final int a() {
        return this.f7944c.size();
    }

    @SuppressLint({"SetTextI18n"})
    public final void d(RecyclerView.z zVar, @SuppressLint({"RecyclerView"}) int i10) {
        b bVar = (b) zVar;
        bVar.f7946t.setImageResource(this.f7944c.get(i10).intValue());
        bVar.f7946t.setOnClickListener(new c(this, i10));
    }

    public final RecyclerView.z e(RecyclerView recyclerView, int i10) {
        return new b(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.row_wallpaper, recyclerView, false));
    }
}

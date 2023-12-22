package j8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.imgdkh.app.R;
import com.wallpapersindia.app.utils.BackgroundWorker;
import i8.d;
import java.util.ArrayList;
import java.util.Collections;

public class k extends o implements BackgroundWorker.a {
    public static final /* synthetic */ int V = 0;
    public RecyclerView T;
    public ArrayList U;

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.wallpaper_recycleview);
        this.T = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.T;
        j();
        recyclerView2.setLayoutManager(new GridLayoutManager());
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        arrayList.add(Integer.valueOf(R.drawable.f13240a1));
        this.U.add(Integer.valueOf(R.drawable.f13241a2));
        this.U.add(Integer.valueOf(R.drawable.f13242a3));
        this.U.add(Integer.valueOf(R.drawable.f13243a4));
        this.U.add(Integer.valueOf(R.drawable.f13244a5));
        this.U.add(Integer.valueOf(R.drawable.f13245a6));
        this.U.add(Integer.valueOf(R.drawable.f13246a7));
        this.U.add(Integer.valueOf(R.drawable.f13247a8));
        this.U.add(Integer.valueOf(R.drawable.f13248a9));
        this.U.add(Integer.valueOf(R.drawable.a10));
        this.U.add(Integer.valueOf(R.drawable.a11));
        this.U.add(Integer.valueOf(R.drawable.a12));
        this.U.add(Integer.valueOf(R.drawable.a13));
        this.U.add(Integer.valueOf(R.drawable.a14));
        this.U.add(Integer.valueOf(R.drawable.a15));
        this.U.add(Integer.valueOf(R.drawable.a16));
        this.U.add(Integer.valueOf(R.drawable.a17));
        this.U.add(Integer.valueOf(R.drawable.a18));
        this.U.add(Integer.valueOf(R.drawable.a19));
        this.U.add(Integer.valueOf(R.drawable.a20));
        Collections.shuffle(this.U);
        j();
        this.T.setAdapter(new d(this.U, new d3.k(this)));
        return inflate;
    }

    public final void s(int i10, String str, String str2) {
    }
}

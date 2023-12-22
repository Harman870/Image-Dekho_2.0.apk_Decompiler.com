package j8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import androidx.viewpager.widget.ViewPager;
import com.imgdkh.app.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import g8.a;
import g8.b;
import g8.c;
import l8.g;
import v5.j;

public class r extends o {
    public static final /* synthetic */ int X = 0;
    public SmartTabLayout T;
    public TextView U;
    public g V;
    public Button W;

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_wallet, viewGroup, false);
        this.V = new g(j());
        this.U = (TextView) inflate.findViewById(R.id.user_balance_wallet);
        this.W = (Button) inflate.findViewById(R.id.redeem_btn);
        this.U.setText(this.V.a(t(R.string.user_balance)));
        y k = k();
        c cVar = new c(j());
        cVar.add(new a("Transactions", q.class.getName(), new Bundle()));
        cVar.add(new a("Redeems", p.class.getName(), new Bundle()));
        b bVar = new b(k, cVar);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        this.T = (SmartTabLayout) inflate.findViewById(R.id.viewpagertab);
        viewPager.setAdapter(bVar);
        this.T.setViewPager(viewPager);
        this.W.setOnClickListener(new j(1, this));
        return inflate;
    }
}

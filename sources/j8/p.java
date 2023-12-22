package j8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import k8.a;
import l2.d;
import l8.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class p extends o {
    public g T;
    public RecyclerView U;
    public LinearLayout V;
    public ArrayList W;

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_redeem_history, viewGroup, false);
        this.T = new g(j());
        this.V = (LinearLayout) inflate.findViewById(R.id.no_history);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.transaction_history_list);
        this.U = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.U;
        j();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        this.W = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(this.T.a(t(R.string.redeems_list)));
            if (jSONArray.length() == 0) {
                this.V.setVisibility(0);
                this.U.setVisibility(8);
            } else {
                this.W.clear();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    a aVar = new a();
                    aVar.f9143d = jSONObject.getString("title");
                    aVar.f9141b = jSONObject.getString("created_at");
                    aVar.f9142c = jSONObject.getString("amount");
                    aVar.f9140a = jSONObject.getString(IronSourceConstants.EVENTS_STATUS);
                    aVar.f9144e = jSONObject.getString("redeem_id");
                    this.W.add(aVar);
                }
                j();
                this.U.setAdapter(new i8.a(this.W));
                this.V.setVisibility(8);
                this.U.setVisibility(0);
            }
        } catch (JSONException e10) {
            d dVar = new d(T(), 1);
            dVar.s("Error");
            dVar.o("Something Is Wrong Please Re Launch The App");
            dVar.i();
            dVar.m("Close");
            dVar.V = null;
            dVar.show();
            e10.printStackTrace();
        }
        return inflate;
    }
}

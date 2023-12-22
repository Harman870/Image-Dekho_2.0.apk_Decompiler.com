package j8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.imgdkh.app.R;
import com.wallpapersindia.app.utils.BackgroundWorker;
import java.util.ArrayList;
import k8.b;
import l2.d;
import l8.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class q extends o implements BackgroundWorker.a {
    public g T;
    public RecyclerView U;
    public LinearLayout V;
    public ArrayList W;

    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_transaction_history, viewGroup, false);
        this.T = new g(j());
        this.V = (LinearLayout) inflate.findViewById(R.id.no_history);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.transaction_history_list);
        this.U = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.U;
        j();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        this.W = new ArrayList();
        new BackgroundWorker(j(), this, t(R.string.get_transactions), true).execute(new String[]{this.T.a(t(R.string.uat)), this.T.a(t(R.string.id))});
        return inflate;
    }

    public final void s(int i10, String str, String str2) {
        if (str2.equals(t(R.string.get_transactions))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (i10 == 200) {
                    JSONArray jSONArray = jSONObject.getJSONArray("transactions");
                    if (jSONArray.length() == 0) {
                        this.V.setVisibility(0);
                        this.U.setVisibility(8);
                    } else {
                        this.W.clear();
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            b bVar = new b();
                            bVar.f9145a = jSONObject2.getString("title");
                            bVar.f9146b = jSONObject2.getString("created_at");
                            bVar.f9147c = jSONObject2.getString("amount");
                            this.W.add(bVar);
                        }
                        j();
                        this.U.setAdapter(new i8.b(this.W));
                        this.V.setVisibility(8);
                        this.U.setVisibility(0);
                    }
                    String string = jSONObject.getString(t(R.string.user_balance));
                    this.T.b(t(R.string.user_balance), string);
                    ((TextView) T().findViewById(R.id.user_balance_wallet)).setText(string);
                    return;
                }
                String string2 = jSONObject.getString("message");
                d dVar = new d(T(), 1);
                dVar.s("Error");
                dVar.o(string2);
                dVar.i();
                dVar.m("Close");
                dVar.V = null;
                dVar.show();
            } catch (JSONException e10) {
                d dVar2 = new d(T(), 1);
                dVar2.s("Error");
                dVar2.o("Something Is Wrong Please Retry");
                dVar2.i();
                dVar2.m("Close");
                dVar2.V = null;
                dVar2.show();
                e10.printStackTrace();
            }
        }
    }
}

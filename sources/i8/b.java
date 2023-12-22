package i8;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.imgdkh.app.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class b extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final List<k8.b> f7939c;

    public class a extends RecyclerView.z {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f7940t;
        public final TextView u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f7941v;

        public a(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.title);
            this.f7940t = (TextView) view.findViewById(R.id.time);
            this.f7941v = (TextView) view.findViewById(R.id.amount);
        }
    }

    public b(ArrayList arrayList) {
        this.f7939c = arrayList;
    }

    public final int a() {
        return this.f7939c.size();
    }

    public final void d(RecyclerView.z zVar, int i10) {
        a aVar = (a) zVar;
        k8.b bVar = this.f7939c.get(i10);
        aVar.u.setText(bVar.f9145a);
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSSSS'Z'").parse(bVar.f9146b);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            instance.add(10, 5);
            instance.add(12, 30);
            aVar.f7940t.setText(new SimpleDateFormat("dd MMMM hh:mm a").format(instance.getTime()));
        } catch (ParseException e10) {
            e10.printStackTrace();
            aVar.f7940t.setText(bVar.f9146b);
        }
        aVar.f7941v.setText(bVar.f9147c);
    }

    public final RecyclerView.z e(RecyclerView recyclerView, int i10) {
        return new a(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.row_transaction_hisory, recyclerView, false));
    }
}

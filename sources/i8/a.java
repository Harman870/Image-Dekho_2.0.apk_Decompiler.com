package i8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class a extends RecyclerView.d<C0100a> {

    /* renamed from: c  reason: collision with root package name */
    public List<k8.a> f7935c;

    /* renamed from: i8.a$a  reason: collision with other inner class name */
    public class C0100a extends RecyclerView.z {

        /* renamed from: t  reason: collision with root package name */
        public TextView f7936t;
        public TextView u;

        /* renamed from: v  reason: collision with root package name */
        public TextView f7937v;
        public TextView w;

        /* renamed from: x  reason: collision with root package name */
        public TextView f7938x;

        public C0100a(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.title);
            this.f7936t = (TextView) view.findViewById(R.id.time);
            this.f7937v = (TextView) view.findViewById(R.id.amount);
            this.w = (TextView) view.findViewById(R.id.status);
            this.f7938x = (TextView) view.findViewById(R.id.redeem_id);
        }
    }

    public a(List list) {
        this.f7935c = list;
    }

    public final int a() {
        return this.f7935c.size();
    }

    @SuppressLint({"SetTextI18n"})
    public final void d(RecyclerView.z zVar, int i10) {
        String str;
        TextView textView;
        C0100a aVar = (C0100a) zVar;
        k8.a aVar2 = this.f7935c.get(i10);
        aVar.u.setText(aVar2.f9143d);
        aVar.f7938x.setText(aVar2.f9144e);
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSSSS'Z'").parse(aVar2.f9141b);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            instance.add(10, 5);
            instance.add(12, 30);
            aVar.f7936t.setText(new SimpleDateFormat("dd MMMM hh:mm a").format(instance.getTime()));
        } catch (ParseException e10) {
            e10.printStackTrace();
            aVar.f7936t.setText(aVar2.f9141b);
        }
        if (aVar2.f9140a.equals("0")) {
            textView = aVar.w;
            str = "Pending";
        } else if (aVar2.f9140a.equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            textView = aVar.w;
            str = "Success";
        } else {
            textView = aVar.w;
            str = "Cancel";
        }
        textView.setText(str);
        aVar.f7937v.setText(aVar2.f9142c);
    }

    public final RecyclerView.z e(RecyclerView recyclerView, int i10) {
        return new C0100a(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.row_redeem_hisory, recyclerView, false));
    }
}

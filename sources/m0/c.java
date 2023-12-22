package m0;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a {

    /* renamed from: h  reason: collision with root package name */
    public int f9317h;

    /* renamed from: i  reason: collision with root package name */
    public int f9318i;

    /* renamed from: j  reason: collision with root package name */
    public LayoutInflater f9319j;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.f9318i = i10;
        this.f9317h = i10;
        this.f9319j = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

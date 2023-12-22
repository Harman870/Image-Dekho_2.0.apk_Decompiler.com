package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.imgdkh.app.R;
import d.p;
import java.lang.ref.WeakReference;

public final class AlertController {

    /* renamed from: a  reason: collision with root package name */
    public final Context f313a;

    /* renamed from: b  reason: collision with root package name */
    public final p f314b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f315c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f316d;

    /* renamed from: e  reason: collision with root package name */
    public RecycleListView f317e;

    /* renamed from: f  reason: collision with root package name */
    public Button f318f;

    /* renamed from: g  reason: collision with root package name */
    public Button f319g;

    /* renamed from: h  reason: collision with root package name */
    public Button f320h;

    /* renamed from: i  reason: collision with root package name */
    public NestedScrollView f321i;

    /* renamed from: j  reason: collision with root package name */
    public int f322j = 0;
    public Drawable k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f323l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f324m;

    /* renamed from: n  reason: collision with root package name */
    public TextView f325n;

    /* renamed from: o  reason: collision with root package name */
    public View f326o;

    /* renamed from: p  reason: collision with root package name */
    public ListAdapter f327p;

    /* renamed from: q  reason: collision with root package name */
    public int f328q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f329r;

    /* renamed from: s  reason: collision with root package name */
    public int f330s;

    /* renamed from: t  reason: collision with root package name */
    public int f331t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f332v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public c f333x;

    /* renamed from: y  reason: collision with root package name */
    public final a f334y = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        public final int f335a;

        /* renamed from: b  reason: collision with root package name */
        public final int f336b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y3.a.f13041y);
            this.f336b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f335a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            AlertController alertController = AlertController.this;
            Button button = alertController.f318f;
            Button button2 = alertController.f319g;
            Button button3 = alertController.f320h;
            alertController.f333x.obtainMessage(1, alertController.f314b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f338a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f339b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f340c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f341d;

        /* renamed from: e  reason: collision with root package name */
        public View f342e;

        /* renamed from: f  reason: collision with root package name */
        public DialogInterface.OnKeyListener f343f;

        /* renamed from: g  reason: collision with root package name */
        public ListAdapter f344g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f345h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f346i;

        /* renamed from: j  reason: collision with root package name */
        public int f347j = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f338a = contextThemeWrapper;
            this.f339b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f348a;

        public c(DialogInterface dialogInterface) {
            this.f348a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f348a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10) {
            super(context, i10, 16908308, (Object[]) null);
        }

        public final long getItemId(int i10) {
            return (long) i10;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.f313a = context;
        this.f314b = pVar;
        this.f315c = window;
        this.f333x = new c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, y3.a.f13028i, R.attr.alertDialogStyle, 0);
        this.f329r = obtainStyledAttributes.getResourceId(0, 0);
        this.f330s = obtainStyledAttributes.getResourceId(2, 0);
        this.f331t = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.u = obtainStyledAttributes.getResourceId(7, 0);
        this.f332v = obtainStyledAttributes.getResourceId(3, 0);
        this.w = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        pVar.d().u(1);
    }

    public static void a(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}

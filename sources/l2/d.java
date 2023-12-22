package l2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.developer.progressx.ProgressWheel;
import com.google.android.material.textfield.TextInputEditText;
import com.imgdkh.app.R;
import java.util.Objects;
import y.a;

public final class d extends androidx.appcompat.app.b implements View.OnClickListener {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public FrameLayout O;
    public FrameLayout P;
    public FrameLayout Q;
    public FrameLayout R;
    public final g S;
    public ProgressWheel T;
    public c U;
    public c V;
    public int W;
    public TextInputEditText X;

    /* renamed from: f  reason: collision with root package name */
    public final Context f9212f;

    /* renamed from: g  reason: collision with root package name */
    public final AnimationSet f9213g;

    /* renamed from: h  reason: collision with root package name */
    public final AnimationSet f9214h;

    /* renamed from: i  reason: collision with root package name */
    public final AnimationSet f9215i;

    /* renamed from: j  reason: collision with root package name */
    public final b f9216j;
    public final Animation k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f9217l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f9218m;

    /* renamed from: n  reason: collision with root package name */
    public WebView f9219n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f9220o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f9221p;

    /* renamed from: q  reason: collision with root package name */
    public ImageView f9222q;

    /* renamed from: r  reason: collision with root package name */
    public ImageView f9223r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f9224s;

    /* renamed from: t  reason: collision with root package name */
    public AppCompatButton f9225t;
    public AppCompatButton u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f9226v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public View f9227x;

    /* renamed from: y  reason: collision with root package name */
    public FrameLayout f9228y;

    /* renamed from: z  reason: collision with root package name */
    public String f9229z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        public final void onAnimationEnd(Animation animation) {
            d.this.f9227x.setVisibility(8);
            d.this.f9227x.post(new c(0, this));
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        public b() {
        }

        public final void applyTransformation(float f10, Transformation transformation) {
            Window window = d.this.getWindow();
            Objects.requireNonNull(window);
            Window window2 = window;
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f - f10;
            d.this.getWindow().setAttributes(attributes);
        }
    }

    public interface c {
        void c(d dVar);
    }

    static {
        Class<d> cls = d.class;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r5, int r6) {
        /*
            r4 = this;
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            if (r0 == 0) goto L_0x001b
            r0 = 2132018308(0x7f140484, float:1.9674919E38)
            goto L_0x001e
        L_0x001b:
            r0 = 2132018309(0x7f140485, float:1.967492E38)
        L_0x001e:
            r4.<init>(r5, r0)
            r0 = 17170443(0x106000b, float:2.4611944E-38)
            r4.J = r0
            r4.K = r0
            r4.L = r3
            r0 = 17
            r4.M = r0
            r4.f9212f = r5
            r4.setCancelable(r2)
            r4.setCanceledOnTouchOutside(r3)
            l2.g r0 = new l2.g
            r0.<init>(r5)
            r4.S = r0
            r4.W = r6
            android.content.Context r5 = r4.getContext()
            r6 = 2130771996(0x7f01001c, float:1.7147098E38)
            android.view.animation.Animation r5 = l2.a.b(r5, r6)
            r4.k = r5
            android.content.Context r5 = r4.getContext()
            r6 = 2130771997(0x7f01001d, float:1.71471E38)
            android.view.animation.Animation r5 = l2.a.b(r5, r6)
            android.view.animation.AnimationSet r5 = (android.view.animation.AnimationSet) r5
            r4.f9215i = r5
            android.content.Context r5 = r4.getContext()
            r6 = 2130772009(0x7f010029, float:1.7147124E38)
            android.view.animation.Animation r5 = l2.a.b(r5, r6)
            android.view.animation.AnimationSet r5 = (android.view.animation.AnimationSet) r5
            r4.f9213g = r5
            android.content.Context r5 = r4.getContext()
            r6 = 2130772010(0x7f01002a, float:1.7147126E38)
            android.view.animation.Animation r5 = l2.a.b(r5, r6)
            android.view.animation.AnimationSet r5 = (android.view.animation.AnimationSet) r5
            r4.f9214h = r5
            java.util.Objects.requireNonNull(r5)
            l2.d$a r6 = new l2.d$a
            r6.<init>()
            r5.setAnimationListener(r6)
            l2.d$b r5 = new l2.d$b
            r5.<init>()
            r4.f9216j = r5
            r0 = 120(0x78, double:5.93E-322)
            r5.setDuration(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.d.<init>(android.content.Context, int):void");
    }

    public final void cancel() {
        j(true);
    }

    public final void i() {
        Context context = this.f9212f;
        Object obj = y.a.f13006a;
        Drawable b10 = a.b.b(context, R.drawable.button_bg);
        this.f9226v = b10;
        AppCompatButton appCompatButton = this.f9225t;
        if (appCompatButton != null && b10 != null) {
            appCompatButton.setBackground(b10);
        }
    }

    public final void j(boolean z9) {
        this.N = z9;
        this.f9225t.startAnimation(this.f9216j);
        this.f9227x.startAnimation(this.f9214h);
    }

    @Deprecated
    public final void l(String str) {
        this.E = str;
        AppCompatButton appCompatButton = this.u;
        if (appCompatButton != null && str != null) {
            if (appCompatButton != null) {
                appCompatButton.setVisibility(0);
            }
            this.u.setText(this.E);
            AppCompatButton appCompatButton2 = this.u;
            Context context = this.f9212f;
            int i10 = this.K;
            Object obj = y.a.f13006a;
            appCompatButton2.setTextColor(a.c.a(context, i10));
        }
    }

    @Deprecated
    public final void m(String str) {
        this.F = str;
        AppCompatButton appCompatButton = this.f9225t;
        if (appCompatButton != null && str != null) {
            if (appCompatButton != null) {
                appCompatButton.setVisibility(0);
            }
            this.f9225t.setText(this.F);
            AppCompatButton appCompatButton2 = this.f9225t;
            Context context = this.f9212f;
            int i10 = this.J;
            Object obj = y.a.f13006a;
            appCompatButton2.setTextColor(a.c.a(context, i10));
        }
    }

    public final void o(String str) {
        this.A = str;
        TextView textView = this.f9218m;
        if (textView != null && str != null) {
            if (textView != null) {
                textView.setVisibility(0);
                this.f9218m.setAutoLinkMask(15);
            }
            this.f9218m.setTextAlignment(4);
            this.f9218m.setGravity(17);
            this.f9218m.setText(Html.fromHtml(this.A, 0));
        } else if (textView != null) {
            textView.setVisibility(8);
            this.f9218m.setAutoLinkMask(15);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        j(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r4.getId()
            r1 = 0
            r2 = 2131296388(0x7f090084, float:1.8210691E38)
            if (r0 != r2) goto L_0x0016
            l2.d$c r4 = r3.U
            if (r4 == 0) goto L_0x0012
        L_0x000e:
            r4.c(r3)
            goto L_0x0024
        L_0x0012:
            r3.j(r1)
            goto L_0x0024
        L_0x0016:
            int r4 = r4.getId()
            r0 = 2131296430(0x7f0900ae, float:1.8210776E38)
            if (r4 != r0) goto L_0x0024
            l2.d$c r4 = r3.V
            if (r4 == 0) goto L_0x0012
            goto L_0x000e
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.d.onClick(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0406, code lost:
        r7.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0409, code lost:
        r7 = r6.f9226v;
        r6.f9226v = r7;
        r0 = r6.f9225t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x040f, code lost:
        if (r0 == null) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0411, code lost:
        if (r7 == null) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0413, code lost:
        r0.setBackground(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r7 = 2131492901(0x7f0c0025, float:1.8609267E38)
            r6.setContentView((int) r7)
            android.view.Window r7 = r6.getWindow()
            java.util.Objects.requireNonNull(r7)
            android.view.View r7 = r7.getDecorView()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r7 = r7.findViewById(r0)
            r6.f9227x = r7
            r7 = 2131296859(0x7f09025b, float:1.8211647E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f9217l = r7
            r7 = 2131296417(0x7f0900a1, float:1.821075E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f9218m = r7
            r7 = 2131296418(0x7f0900a2, float:1.8210752E38)
            android.view.View r7 = r6.findViewById(r7)
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r6.f9219n = r7
            r7 = 2131296480(0x7f0900e0, float:1.8210878E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.O = r7
            r0 = 2131296481(0x7f0900e1, float:1.821088E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f9220o = r7
            r7 = 2131296473(0x7f0900d9, float:1.8210864E38)
            android.view.View r7 = r6.findViewById(r7)
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            r6.X = r7
            r7 = 2131296815(0x7f09022f, float:1.8211557E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.P = r7
            r7 = 2131296700(0x7f0901bc, float:1.8211324E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.Q = r7
            android.widget.FrameLayout r7 = r6.P
            r0 = 2131296816(0x7f090230, float:1.821156E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f9221p = r7
            r7 = 2131296431(0x7f0900af, float:1.8210778E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f9222q = r7
            r7 = 2131296429(0x7f0900ad, float:1.8210774E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f9223r = r7
            r7 = 2131296900(0x7f090284, float:1.821173E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.R = r7
            r7 = 2131296433(0x7f0900b1, float:1.8210783E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f9228y = r7
            l2.g r7 = r6.S
            r0 = 2131296698(0x7f0901ba, float:1.821132E38)
            android.view.View r0 = r6.findViewById(r0)
            com.developer.progressx.ProgressWheel r0 = (com.developer.progressx.ProgressWheel) r0
            r7.f9234a = r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x013f
            boolean r3 = r0.f2705t
            if (r3 != 0) goto L_0x00ce
            long r3 = android.os.SystemClock.uptimeMillis()
            r0.f2701p = r3
            r0.f2705t = r1
            r0.invalidate()
        L_0x00ce:
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            float r0 = r0.getSpinSpeed()
            r3 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00df
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            r0.setSpinSpeed(r3)
        L_0x00df:
            int r0 = r7.f9236c
            com.developer.progressx.ProgressWheel r3 = r7.f9234a
            int r3 = r3.getBarWidth()
            if (r0 == r3) goto L_0x00f0
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            int r3 = r7.f9236c
            r0.setBarWidth(r3)
        L_0x00f0:
            int r0 = r7.f9237d
            com.developer.progressx.ProgressWheel r3 = r7.f9234a
            int r3 = r3.getBarColor()
            if (r0 == r3) goto L_0x0101
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            int r3 = r7.f9237d
            r0.setBarColor(r3)
        L_0x0101:
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            int r0 = r0.getRimWidth()
            if (r0 == 0) goto L_0x010e
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            r0.setRimWidth(r2)
        L_0x010e:
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            int r0 = r0.getRimColor()
            if (r0 == 0) goto L_0x011b
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            r0.setRimColor(r2)
        L_0x011b:
            float r0 = r7.f9235b
            com.developer.progressx.ProgressWheel r3 = r7.f9234a
            float r3 = r3.getProgress()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x012e
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            float r3 = r7.f9235b
            r0.setProgress(r3)
        L_0x012e:
            int r0 = r7.f9238e
            com.developer.progressx.ProgressWheel r3 = r7.f9234a
            int r3 = r3.getCircleRadius()
            if (r0 == r3) goto L_0x013f
            com.developer.progressx.ProgressWheel r0 = r7.f9234a
            int r7 = r7.f9238e
            r0.setCircleRadius(r7)
        L_0x013f:
            r7 = 2131296531(0x7f090113, float:1.8210981E38)
            android.view.View r7 = r6.findViewById(r7)
            com.developer.progressx.ProgressWheel r7 = (com.developer.progressx.ProgressWheel) r7
            r6.T = r7
            r7 = 2131296430(0x7f0900ae, float:1.8210776E38)
            android.view.View r7 = r6.findViewById(r7)
            androidx.appcompat.widget.AppCompatButton r7 = (androidx.appcompat.widget.AppCompatButton) r7
            r6.f9225t = r7
            r7 = 2131296388(0x7f090084, float:1.8210691E38)
            android.view.View r7 = r6.findViewById(r7)
            androidx.appcompat.widget.AppCompatButton r7 = (androidx.appcompat.widget.AppCompatButton) r7
            r6.u = r7
            androidx.appcompat.widget.AppCompatButton r7 = r6.f9225t
            r7.setOnClickListener(r6)
            androidx.appcompat.widget.AppCompatButton r7 = r6.u
            r7.setOnClickListener(r6)
            java.lang.String r7 = r6.f9229z
            r6.s(r7)
            int r7 = r6.M
            r6.M = r7
            android.widget.TextView r0 = r6.f9217l
            if (r0 == 0) goto L_0x0184
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r0.<init>(r3, r3)
            r0.gravity = r7
            android.widget.TextView r7 = r6.f9217l
            r7.setLayoutParams(r0)
        L_0x0184:
            java.lang.String r7 = r6.A
            r6.o(r7)
            java.lang.String r7 = r6.B
            java.lang.String r0 = r6.C
            java.lang.String r3 = r6.D
            r6.B = r7
            r6.C = r0
            r6.D = r3
            android.webkit.WebView r4 = r6.f9219n
            r5 = 8
            if (r4 == 0) goto L_0x01f3
            if (r7 == 0) goto L_0x01f3
            if (r0 == 0) goto L_0x01f3
            if (r3 == 0) goto L_0x01f3
            r4.setBackgroundColor(r2)
            android.webkit.WebView r7 = r6.f9219n
            if (r7 == 0) goto L_0x01ab
            r7.setVisibility(r2)
        L_0x01ab:
            java.lang.String r7 = "<html><body><p style=\"color:"
            java.lang.String r7 = com.ironsource.adapters.ironsource.a.g(r7, r0)
            java.lang.String r0 = ";"
            java.lang.String r7 = com.ironsource.adapters.ironsource.a.g(r7, r0)
            java.lang.String r0 = "font-size:"
            java.lang.String r7 = com.ironsource.adapters.ironsource.a.g(r7, r0)
            java.lang.StringBuilder r7 = androidx.activity.f.g(r7)
            java.lang.String r0 = r6.D
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "\""
            java.lang.String r7 = com.ironsource.adapters.ironsource.a.g(r7, r0)
            java.lang.String r0 = "align=\"justify\">"
            java.lang.String r7 = com.ironsource.adapters.ironsource.a.g(r7, r0)
            java.lang.StringBuilder r7 = androidx.activity.f.g(r7)
            java.lang.String r0 = r6.B
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "</p></body></html>"
            java.lang.String r7 = com.ironsource.adapters.ironsource.a.g(r7, r0)
            android.webkit.WebView r0 = r6.f9219n
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "utf-8"
            r0.loadData(r7, r3, r4)
            goto L_0x01f8
        L_0x01f3:
            if (r4 == 0) goto L_0x01f8
            r4.setVisibility(r5)
        L_0x01f8:
            java.lang.String r7 = r6.E
            r6.l(r7)
            java.lang.String r7 = r6.E
            int r0 = r6.K
            r6.E = r7
            r6.K = r0
            androidx.appcompat.widget.AppCompatButton r3 = r6.u
            if (r3 == 0) goto L_0x0228
            if (r7 == 0) goto L_0x0228
            if (r0 == 0) goto L_0x0228
            if (r3 == 0) goto L_0x0212
            r3.setVisibility(r2)
        L_0x0212:
            androidx.appcompat.widget.AppCompatButton r7 = r6.u
            java.lang.String r0 = r6.E
            r7.setText(r0)
            androidx.appcompat.widget.AppCompatButton r7 = r6.u
            android.content.Context r0 = r6.f9212f
            int r3 = r6.K
            java.lang.Object r4 = y.a.f13006a
            int r0 = y.a.c.a(r0, r3)
            r7.setTextColor(r0)
        L_0x0228:
            java.lang.String r7 = r6.F
            r6.m(r7)
            java.lang.String r7 = r6.F
            int r0 = r6.J
            r6.F = r7
            r6.J = r0
            androidx.appcompat.widget.AppCompatButton r3 = r6.f9225t
            if (r3 == 0) goto L_0x0258
            if (r7 == 0) goto L_0x0258
            if (r0 == 0) goto L_0x0258
            if (r3 == 0) goto L_0x0242
            r3.setVisibility(r2)
        L_0x0242:
            androidx.appcompat.widget.AppCompatButton r7 = r6.f9225t
            java.lang.String r0 = r6.F
            r7.setText(r0)
            androidx.appcompat.widget.AppCompatButton r7 = r6.f9225t
            android.content.Context r0 = r6.f9212f
            int r3 = r6.J
            java.lang.Object r4 = y.a.f13006a
            int r0 = y.a.c.a(r0, r3)
            r7.setTextColor(r0)
        L_0x0258:
            android.graphics.drawable.Drawable r7 = r6.f9226v
            r6.f9226v = r7
            androidx.appcompat.widget.AppCompatButton r0 = r6.f9225t
            if (r0 == 0) goto L_0x0265
            if (r7 == 0) goto L_0x0265
            r0.setBackground(r7)
        L_0x0265:
            android.graphics.drawable.Drawable r7 = r6.w
            r6.w = r7
            androidx.appcompat.widget.AppCompatButton r0 = r6.u
            if (r0 == 0) goto L_0x0272
            if (r7 == 0) goto L_0x0272
            r0.setBackground(r7)
        L_0x0272:
            int r7 = r6.W
            r6.W = r7
            android.view.View r0 = r6.f9227x
            if (r0 == 0) goto L_0x0416
            switch(r7) {
                case 0: goto L_0x0409;
                case 1: goto L_0x0404;
                case 2: goto L_0x0401;
                case 3: goto L_0x03fe;
                case 4: goto L_0x03d2;
                case 5: goto L_0x02b5;
                case 6: goto L_0x02a9;
                case 7: goto L_0x027f;
                default: goto L_0x027d;
            }
        L_0x027d:
            goto L_0x0416
        L_0x027f:
            android.widget.FrameLayout r7 = r6.f9228y
            if (r7 == 0) goto L_0x0409
            r7.setVisibility(r2)
            android.content.Context r7 = r6.f9212f
            java.lang.String r0 = "input_method"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r7 = (android.view.inputmethod.InputMethodManager) r7
            com.google.android.material.textfield.TextInputEditText r0 = r6.X
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x029d
            com.google.android.material.textfield.TextInputEditText r0 = r6.X
            r0.requestFocus()
        L_0x029d:
            com.google.android.material.textfield.TextInputEditText r0 = r6.X
            l2.b r1 = new l2.b
            r1.<init>(r6, r2, r7)
            r0.post(r1)
            goto L_0x0409
        L_0x02a9:
            android.widget.FrameLayout r7 = r6.Q
            r7.setVisibility(r2)
            androidx.appcompat.widget.AppCompatButton r7 = r6.f9225t
            r7.setVisibility(r5)
            goto L_0x0409
        L_0x02b5:
            java.lang.String r7 = r6.H
            int r0 = r6.I
            r6.H = r7
            r6.I = r0
            android.widget.ImageView r3 = r6.f9222q
            if (r3 == 0) goto L_0x0409
            android.widget.ImageView r3 = r6.f9223r
            if (r3 == 0) goto L_0x0409
            com.developer.progressx.ProgressWheel r3 = r6.T
            if (r3 == 0) goto L_0x0409
            r3.setVisibility(r2)
            if (r0 == r5) goto L_0x030d
            r3 = 9
            if (r0 == r3) goto L_0x02d4
            goto L_0x0409
        L_0x02d4:
            android.widget.ImageView r0 = r6.f9222q
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r6.f9222q
            com.bumptech.glide.o r0 = com.bumptech.glide.b.d(r0)
            r0.getClass()
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.n r3 = new com.bumptech.glide.n
            com.bumptech.glide.b r4 = r0.f2661a
            android.content.Context r5 = r0.f2662b
            r3.<init>(r4, r0, r2, r5)
            com.bumptech.glide.n r7 = r3.B(r7)
            l2.f r0 = new l2.f
            r0.<init>(r6)
            com.bumptech.glide.n r7 = r7.A(r0)
            r7.getClass()
            x1.l$c r0 = x1.l.f12867b
            x1.j r2 = new x1.j
            r2.<init>()
            f2.a r7 = r7.q(r0, r2)
            com.bumptech.glide.n r7 = (com.bumptech.glide.n) r7
            android.widget.ImageView r0 = r6.f9222q
            goto L_0x0335
        L_0x030d:
            android.widget.ImageView r0 = r6.f9223r
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r6.f9223r
            com.bumptech.glide.o r0 = com.bumptech.glide.b.d(r0)
            r0.getClass()
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.n r3 = new com.bumptech.glide.n
            com.bumptech.glide.b r4 = r0.f2661a
            android.content.Context r5 = r0.f2662b
            r3.<init>(r4, r0, r2, r5)
            com.bumptech.glide.n r7 = r3.B(r7)
            l2.e r0 = new l2.e
            r0.<init>(r6)
            com.bumptech.glide.n r7 = r7.A(r0)
            android.widget.ImageView r0 = r6.f9223r
        L_0x0335:
            r7.getClass()
            j2.l.a()
            y3.a.h(r0)
            int r2 = r7.f6318a
            r3 = 2048(0x800, float:2.87E-42)
            boolean r2 = f2.a.f(r2, r3)
            if (r2 != 0) goto L_0x038d
            boolean r2 = r7.f6330n
            if (r2 == 0) goto L_0x038d
            android.widget.ImageView$ScaleType r2 = r0.getScaleType()
            if (r2 == 0) goto L_0x038d
            int[] r2 = com.bumptech.glide.n.a.f2659a
            android.widget.ImageView$ScaleType r3 = r0.getScaleType()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L_0x037d;
                case 2: goto L_0x0374;
                case 3: goto L_0x0362;
                case 4: goto L_0x0362;
                case 5: goto L_0x0362;
                case 6: goto L_0x0374;
                default: goto L_0x0361;
            }
        L_0x0361:
            goto L_0x038d
        L_0x0362:
            com.bumptech.glide.n r2 = r7.clone()
            x1.l$e r3 = x1.l.f12866a
            x1.q r4 = new x1.q
            r4.<init>()
            f2.a r2 = r2.h(r3, r4)
            r2.f6339y = r1
            goto L_0x038e
        L_0x0374:
            com.bumptech.glide.n r1 = r7.clone()
            f2.a r2 = r1.g()
            goto L_0x038e
        L_0x037d:
            com.bumptech.glide.n r1 = r7.clone()
            x1.l$d r2 = x1.l.f12868c
            x1.h r3 = new x1.h
            r3.<init>()
            f2.a r2 = r1.h(r2, r3)
            goto L_0x038e
        L_0x038d:
            r2 = r7
        L_0x038e:
            com.bumptech.glide.h r1 = r7.D
            java.lang.Class<TranscodeType> r3 = r7.C
            z5.c r1 = r1.f2555c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x03a5
            g2.b r1 = new g2.b
            r1.<init>(r0)
            goto L_0x03b2
        L_0x03a5:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L_0x03b6
            g2.d r1 = new g2.d
            r1.<init>(r0)
        L_0x03b2:
            r7.z(r1, r2)
            goto L_0x0409
        L_0x03b6:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x03d2:
            android.graphics.drawable.Drawable r7 = r6.f9224s
            r6.f9224s = r7
            android.widget.ImageView r0 = r6.f9222q
            if (r0 == 0) goto L_0x03e6
            if (r7 == 0) goto L_0x03e6
            r0.setVisibility(r2)
            android.widget.ImageView r7 = r6.f9222q
            android.graphics.drawable.Drawable r0 = r6.f9224s
            r7.setImageDrawable(r0)
        L_0x03e6:
            int r7 = r6.L
            r6.L = r7
            android.widget.ImageView r0 = r6.f9222q
            if (r0 == 0) goto L_0x0409
            if (r7 == 0) goto L_0x0409
            android.content.Context r1 = r6.f9212f
            java.lang.Object r2 = y.a.f13006a
            int r7 = y.a.c.a(r1, r7)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r7, r1)
            goto L_0x0409
        L_0x03fe:
            android.widget.FrameLayout r7 = r6.R
            goto L_0x0406
        L_0x0401:
            android.widget.FrameLayout r7 = r6.P
            goto L_0x0406
        L_0x0404:
            android.widget.FrameLayout r7 = r6.O
        L_0x0406:
            r7.setVisibility(r2)
        L_0x0409:
            android.graphics.drawable.Drawable r7 = r6.f9226v
            r6.f9226v = r7
            androidx.appcompat.widget.AppCompatButton r0 = r6.f9225t
            if (r0 == 0) goto L_0x0416
            if (r7 == 0) goto L_0x0416
            r0.setBackground(r7)
        L_0x0416:
            java.lang.String r7 = r6.G
            r6.G = r7
            com.google.android.material.textfield.TextInputEditText r0 = r6.X
            if (r0 == 0) goto L_0x0423
            if (r7 == 0) goto L_0x0423
            r0.setHint(r7)
        L_0x0423:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.d.onCreate(android.os.Bundle):void");
    }

    public final void onStart() {
        Animation animation;
        View view;
        super.onStart();
        this.f9227x.startAnimation(this.f9213g);
        int i10 = this.W;
        if (i10 == 1) {
            this.O.startAnimation(this.k);
            view = this.f9220o;
            animation = this.f9215i;
        } else if (i10 == 2) {
            this.f9221p.startAnimation(this.k);
            view = this.P;
            animation = this.k;
        } else {
            return;
        }
        view.startAnimation(animation);
    }

    public final void p(int i10) {
        Drawable drawable = getContext().getResources().getDrawable(i10, this.f9212f.getTheme());
        this.f9224s = drawable;
        ImageView imageView = this.f9222q;
        if (imageView != null && drawable != null) {
            imageView.setVisibility(0);
            this.f9222q.setImageDrawable(this.f9224s);
        }
    }

    public final void s(String str) {
        this.f9229z = str;
        TextView textView = this.f9217l;
        if (textView != null && str != null) {
            if (textView != null) {
                textView.setVisibility(0);
                this.f9217l.setAutoLinkMask(15);
            }
            this.f9217l.setText(Html.fromHtml(this.f9229z, 1));
        } else if (textView != null) {
            textView.setVisibility(8);
            this.f9217l.setAutoLinkMask(15);
        }
    }
}

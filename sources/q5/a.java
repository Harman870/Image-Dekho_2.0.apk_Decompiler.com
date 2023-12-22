package q5;

import android.graphics.Paint;
import android.graphics.Path;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f11334i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f11335j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f11336l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f11337a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f11338b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f11339c;

    /* renamed from: d  reason: collision with root package name */
    public int f11340d;

    /* renamed from: e  reason: collision with root package name */
    public int f11341e;

    /* renamed from: f  reason: collision with root package name */
    public int f11342f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f11343g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f11344h;

    public a() {
        Paint paint = new Paint();
        this.f11344h = paint;
        this.f11337a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f11338b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f11339c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f11340d = a0.a.c(i10, 68);
        this.f11341e = a0.a.c(i10, 20);
        this.f11342f = a0.a.c(i10, 0);
        this.f11337a.setColor(this.f11340d);
    }
}

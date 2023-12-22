package com.anupkumarpanwar.scratchview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import c6.b;
import com.imgdkh.app.R;
import y.a;

public class ScratchView extends View {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f2530a;

    /* renamed from: b  reason: collision with root package name */
    public AttributeSet f2531b;

    /* renamed from: c  reason: collision with root package name */
    public float f2532c;

    /* renamed from: d  reason: collision with root package name */
    public float f2533d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f2534e;

    /* renamed from: f  reason: collision with root package name */
    public Canvas f2535f;

    /* renamed from: g  reason: collision with root package name */
    public Path f2536g;

    /* renamed from: h  reason: collision with root package name */
    public Path f2537h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f2538i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f2539j;
    public Paint k;

    /* renamed from: l  reason: collision with root package name */
    public BitmapDrawable f2540l;

    /* renamed from: m  reason: collision with root package name */
    public float f2541m;

    /* renamed from: n  reason: collision with root package name */
    public int f2542n = 0;

    public interface a {
        void a();

        void b();
    }

    public ScratchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Shader.TileMode tileMode;
        Bitmap bitmap;
        Bitmap bitmap2;
        this.f2531b = attributeSet;
        this.f2537h = new Path();
        Paint paint = new Paint();
        this.f2539j = paint;
        paint.setAntiAlias(true);
        this.f2539j.setDither(true);
        this.f2539j.setColor(-65536);
        this.f2539j.setStyle(Paint.Style.STROKE);
        this.f2539j.setStrokeJoin(Paint.Join.BEVEL);
        this.f2539j.setStrokeCap(Paint.Cap.ROUND);
        this.f2539j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setStrokeWidth(6);
        this.k = new Paint();
        this.f2536g = new Path();
        this.f2538i = new Paint(4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f2531b, b.f2480m, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, R.drawable.ic_scratch_pattern);
        float dimension = obtainStyledAttributes.getDimension(2, 1000.0f);
        float dimension2 = obtainStyledAttributes.getDimension(0, 1000.0f);
        String string = obtainStyledAttributes.getString(3);
        string = string == null ? "CLAMP" : string;
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), resourceId);
        this.f2530a = decodeResource;
        if (decodeResource == null) {
            Context context2 = getContext();
            Object obj = y.a.f13006a;
            Drawable b10 = a.b.b(context2, resourceId);
            if (b10 instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) b10;
                if (bitmapDrawable.getBitmap() != null) {
                    bitmap = bitmapDrawable.getBitmap();
                    this.f2530a = bitmap;
                }
            }
            if (b10.getIntrinsicWidth() <= 0 || b10.getIntrinsicHeight() <= 0) {
                bitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            } else {
                bitmap2 = Bitmap.createBitmap(b10.getIntrinsicWidth(), b10.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(bitmap2);
            b10.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            b10.draw(canvas);
            bitmap = bitmap2;
            this.f2530a = bitmap;
        }
        this.f2530a = Bitmap.createScaledBitmap(this.f2530a, (int) dimension, (int) dimension2, false);
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getResources(), this.f2530a);
        this.f2540l = bitmapDrawable2;
        if (string.equals("MIRROR")) {
            tileMode = Shader.TileMode.MIRROR;
        } else if (!string.equals("REPEAT")) {
            tileMode = Shader.TileMode.CLAMP;
        } else {
            tileMode = Shader.TileMode.REPEAT;
        }
        bitmapDrawable2.setTileModeXY(tileMode, tileMode);
    }

    public final void a() {
        this.f2536g.lineTo(this.f2532c, this.f2533d);
        this.f2535f.drawPath(this.f2536g, this.f2539j);
        this.f2537h.reset();
        this.f2536g.reset();
        this.f2536g.moveTo(this.f2532c, this.f2533d);
    }

    public int getColor() {
        return this.f2539j.getColor();
    }

    public Paint getErasePaint() {
        return this.f2539j;
    }

    public int[] getViewBounds() {
        return new int[]{0, 0, getWidth() + 0, getHeight() + 0};
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f2534e, 0.0f, 0.0f, this.f2538i);
        canvas.drawPath(this.f2536g, this.f2539j);
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f2534e = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.f2535f = new Canvas(this.f2534e);
        Rect rect = new Rect(0, 0, getWidth(), getHeight());
        this.f2540l.setBounds(rect);
        Context context = getContext();
        Object obj = y.a.f13006a;
        this.k.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) getHeight(), a.c.a(context, R.color.scratch_start_gradient), a.c.a(getContext(), R.color.scratch_end_gradient), Shader.TileMode.MIRROR));
        this.f2535f.drawRect(rect, this.k);
        this.f2540l.draw(this.f2535f);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2536g.reset();
            this.f2536g.moveTo(x9, y9);
            this.f2532c = x9;
            this.f2533d = y9;
        } else if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(x9 - this.f2532c);
                float abs2 = Math.abs(y9 - this.f2533d);
                if (abs >= 4.0f || abs2 >= 4.0f) {
                    Path path = this.f2536g;
                    float f10 = this.f2532c;
                    float f11 = this.f2533d;
                    path.quadTo(f10, f11, (x9 + f10) / 2.0f, (y9 + f11) / 2.0f);
                    this.f2532c = x9;
                    this.f2533d = y9;
                    a();
                }
                this.f2537h.reset();
                this.f2537h.addCircle(this.f2532c, this.f2533d, 30.0f, Path.Direction.CW);
            }
            return true;
        } else {
            a();
        }
        invalidate();
        return true;
    }

    public void setRevealListener(a aVar) {
    }

    public void setStrokeWidth(int i10) {
        this.f2539j.setStrokeWidth(((float) i10) * 12.0f);
    }
}

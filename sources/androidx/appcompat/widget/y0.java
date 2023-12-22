package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.widget.j;
import com.imgdkh.app.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import m.e;
import m.f;
import m.i;

public final class y0 {

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f998f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public static y0 f999g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f1000h = new a();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, i<ColorStateList>> f1001a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Context, e<WeakReference<Drawable.ConstantState>>> f1002b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1003c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1004d;

    /* renamed from: e  reason: collision with root package name */
    public b f1005e;

    public static class a extends f<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    public interface b {
    }

    public static synchronized y0 c() {
        y0 y0Var;
        synchronized (y0.class) {
            if (f999g == null) {
                f999g = new y0();
            }
            y0Var = f999g;
        }
        return y0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (y0.class) {
            a aVar = f1000h;
            aVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.b(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                aVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.c(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            e eVar = this.f1002b.get(context);
            if (eVar == null) {
                eVar = new e();
                this.f1002b.put(context, eVar);
            }
            eVar.f(j10, new WeakReference(constantState));
        }
    }

    public final Drawable b(Context context, int i10) {
        int i11;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        if (this.f1003c == null) {
            this.f1003c = new TypedValue();
        }
        TypedValue typedValue = this.f1003c;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d10 = d(context, j10);
        if (d10 != null) {
            return d10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f1005e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, com.ironsource.sdk.mediation.R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i10 == R.drawable.abc_ratingbar_material) {
                    i11 = R.dimen.abc_star_big;
                } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                    i11 = R.dimen.abc_star_medium;
                } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                    i11 = R.dimen.abc_star_small;
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
                Drawable e10 = e(context, R.drawable.abc_star_black_48dp);
                Drawable e11 = e(context, R.drawable.abc_star_half_black_48dp);
                if ((e10 instanceof BitmapDrawable) && e10.getIntrinsicWidth() == dimensionPixelSize && e10.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable2 = (BitmapDrawable) e10;
                    bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    e10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    e10.draw(canvas);
                    bitmapDrawable2 = new BitmapDrawable(createBitmap);
                    bitmapDrawable = new BitmapDrawable(createBitmap);
                }
                bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
                if ((e11 instanceof BitmapDrawable) && e11.getIntrinsicWidth() == dimensionPixelSize && e11.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable3 = (BitmapDrawable) e11;
                } else {
                    Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    e11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    e11.draw(canvas2);
                    bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
                layerDrawable2.setId(0, 16908288);
                layerDrawable2.setId(1, 16908303);
                layerDrawable2.setId(2, 16908301);
                layerDrawable = layerDrawable2;
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f9273c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, m.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1002b     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            m.e r0 = (m.e) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.e(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f9272b     // Catch:{ all -> 0x0041 }
            int r2 = r0.f9274d     // Catch:{ all -> 0x0041 }
            int r4 = androidx.lifecycle.c0.d(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f9273c     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = m.e.f9270e     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f9271a = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.d(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(Context context, int i10) {
        return f(context, i10, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9 A[Catch:{ all -> 0x005d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r12, int r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f1004d     // Catch:{ all -> 0x005d }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            goto L_0x002d
        L_0x0008:
            r11.f1004d = r2     // Catch:{ all -> 0x005d }
            r0 = 2131165324(0x7f07008c, float:1.7944862E38)
            android.graphics.drawable.Drawable r0 = r11.e(r12, r0)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x00ea
            boolean r3 = r0 instanceof h1.g     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x002a
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x005d }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 == 0) goto L_0x00ea
        L_0x002d:
            android.graphics.drawable.Drawable r0 = r11.b(r12, r13)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r0 = y.a.f13006a     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r0 = y.a.b.b(r12, r13)     // Catch:{ all -> 0x005d }
        L_0x0039:
            if (r0 == 0) goto L_0x00e3
            android.content.res.ColorStateList r3 = r11.h(r12, r13)     // Catch:{ all -> 0x005d }
            r4 = 0
            if (r3 == 0) goto L_0x0063
            int[] r12 = androidx.appcompat.widget.o0.f876a     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r12 = r0.mutate()     // Catch:{ all -> 0x005d }
            b0.a.b.h(r12, r3)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.y0$b r14 = r11.f1005e     // Catch:{ all -> 0x005d }
            if (r14 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            r14 = 2131165311(0x7f07007f, float:1.7944836E38)
            if (r13 != r14) goto L_0x0057
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x005d }
        L_0x0057:
            if (r4 == 0) goto L_0x0060
            b0.a.b.i(r12, r4)     // Catch:{ all -> 0x005d }
            goto L_0x0060
        L_0x005d:
            r12 = move-exception
            goto L_0x00f4
        L_0x0060:
            r0 = r12
            goto L_0x00e3
        L_0x0063:
            androidx.appcompat.widget.y0$b r3 = r11.f1005e     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x00da
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            r7 = 2130903302(0x7f030106, float:1.7413418E38)
            r8 = 2130903304(0x7f030108, float:1.7413422E38)
            r9 = 2131165306(0x7f07007a, float:1.7944825E38)
            if (r13 != r9) goto L_0x00a1
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r6 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x005d }
            int r9 = androidx.appcompat.widget.d1.c(r12, r8)     // Catch:{ all -> 0x005d }
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.j.f811b     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.d(r6, r9, r10)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r5 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x005d }
            int r6 = androidx.appcompat.widget.d1.c(r12, r8)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.d(r5, r6, r10)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r3)     // Catch:{ all -> 0x005d }
            int r3 = androidx.appcompat.widget.d1.c(r12, r7)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.d(r1, r3, r10)     // Catch:{ all -> 0x005d }
            goto L_0x00d6
        L_0x00a1:
            r9 = 2131165297(0x7f070071, float:1.7944807E38)
            if (r13 == r9) goto L_0x00b0
            r9 = 2131165296(0x7f070070, float:1.7944805E38)
            if (r13 == r9) goto L_0x00b0
            r9 = 2131165298(0x7f070072, float:1.794481E38)
            if (r13 != r9) goto L_0x00d7
        L_0x00b0:
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r6 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x005d }
            int r8 = androidx.appcompat.widget.d1.b(r12, r8)     // Catch:{ all -> 0x005d }
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.j.f811b     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.d(r6, r8, r9)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r5 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x005d }
            int r6 = androidx.appcompat.widget.d1.c(r12, r7)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.d(r5, r6, r9)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r3)     // Catch:{ all -> 0x005d }
            int r3 = androidx.appcompat.widget.d1.c(r12, r7)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.d(r1, r3, r9)     // Catch:{ all -> 0x005d }
        L_0x00d6:
            r1 = r2
        L_0x00d7:
            if (r1 == 0) goto L_0x00da
            goto L_0x00e3
        L_0x00da:
            boolean r12 = r11.i(r12, r13, r0)     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x00e3
            if (r14 == 0) goto L_0x00e3
            r0 = r4
        L_0x00e3:
            if (r0 == 0) goto L_0x00e8
            androidx.appcompat.widget.o0.a(r0)     // Catch:{ all -> 0x005d }
        L_0x00e8:
            monitor-exit(r11)
            return r0
        L_0x00ea:
            r11.f1004d = r1     // Catch:{ all -> 0x005d }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r13 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r12.<init>(r13)     // Catch:{ all -> 0x005d }
            throw r12     // Catch:{ all -> 0x005d }
        L_0x00f4:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(Context context, int i10) {
        ColorStateList colorStateList;
        i iVar;
        try {
            WeakHashMap<Context, i<ColorStateList>> weakHashMap = this.f1001a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
                colorStateList = null;
            } else {
                colorStateList = (ColorStateList) iVar.e(i10, (Integer) null);
            }
            if (colorStateList == null) {
                b bVar = this.f1005e;
                if (bVar != null) {
                    colorStateList2 = ((j.a) bVar).c(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f1001a == null) {
                        this.f1001a = new WeakHashMap<>();
                    }
                    i iVar2 = this.f1001a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new i();
                        this.f1001a.put(context, iVar2);
                    }
                    iVar2.b(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.y0$b r0 = r7.f1005e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006b
            androidx.appcompat.widget.j$a r0 = (androidx.appcompat.widget.j.a) r0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.j.f811b
            int[] r4 = r0.f814a
            boolean r4 = androidx.appcompat.widget.j.a.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001a
            r5 = 2130903304(0x7f030108, float:1.7413422E38)
            goto L_0x0046
        L_0x001a:
            int[] r4 = r0.f816c
            boolean r4 = androidx.appcompat.widget.j.a.a(r4, r9)
            if (r4 == 0) goto L_0x0026
            r5 = 2130903302(0x7f030106, float:1.7413418E38)
            goto L_0x0046
        L_0x0026:
            int[] r0 = r0.f817d
            boolean r0 = androidx.appcompat.widget.j.a.a(r0, r9)
            if (r0 == 0) goto L_0x0031
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0046
        L_0x0031:
            r0 = 2131165283(0x7f070063, float:1.7944779E38)
            if (r9 != r0) goto L_0x0041
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0048
        L_0x0041:
            r0 = 2131165265(0x7f070051, float:1.7944742E38)
            if (r9 != r0) goto L_0x004a
        L_0x0046:
            r9 = r5
            r0 = r6
        L_0x0048:
            r4 = r1
            goto L_0x004d
        L_0x004a:
            r9 = r2
            r4 = r9
            r0 = r6
        L_0x004d:
            if (r4 == 0) goto L_0x0067
            int[] r4 = androidx.appcompat.widget.o0.f876a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = androidx.appcompat.widget.d1.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.j.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0065
            r10.setAlpha(r0)
        L_0x0065:
            r8 = r1
            goto L_0x0068
        L_0x0067:
            r8 = r2
        L_0x0068:
            if (r8 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r1 = r2
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}

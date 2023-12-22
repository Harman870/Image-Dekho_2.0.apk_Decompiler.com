package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import b0.f;

public class s {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f935c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f936a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f937b;

    public s(ProgressBar progressBar) {
        this.f936a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        i1 m2 = i1.m(this.f936a.getContext(), attributeSet, f935c, i10);
        Drawable f10 = m2.f(0);
        if (f10 != null) {
            ProgressBar progressBar = this.f936a;
            if (f10 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f10;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable b10 = b(animationDrawable.getFrame(i11), true);
                    b10.setLevel(10000);
                    animationDrawable2.addFrame(b10, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(10000);
                f10 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f10);
        }
        Drawable f11 = m2.f(1);
        if (f11 != null) {
            this.f936a.setProgressDrawable(b(f11, false));
        }
        m2.n();
    }

    public final Drawable b(Drawable drawable, boolean z9) {
        boolean z10;
        if (drawable instanceof f) {
            f fVar = (f) drawable;
            Drawable b10 = fVar.b();
            if (b10 != null) {
                fVar.a(b(b10, z9));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id = layerDrawable.getId(i10);
                Drawable drawable2 = layerDrawable.getDrawable(i10);
                if (id == 16908301 || id == 16908303) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawableArr[i10] = b(drawable2, z10);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f937b == null) {
                this.f937b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z9) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}

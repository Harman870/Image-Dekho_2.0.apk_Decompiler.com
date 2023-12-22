package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class p extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public final e f889a;

    /* renamed from: b  reason: collision with root package name */
    public final o f890b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f891c;

    public p(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f1.a(context);
        this.f891c = false;
        d1.a(getContext(), this);
        e eVar = new e(this);
        this.f889a = eVar;
        eVar.d(attributeSet, i10);
        o oVar = new o(this);
        this.f890b = oVar;
        oVar.b(attributeSet, i10);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f889a;
        if (eVar != null) {
            eVar.a();
        }
        o oVar = this.f890b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f889a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f889a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        g1 g1Var;
        o oVar = this.f890b;
        if (oVar == null || (g1Var = oVar.f874b) == null) {
            return null;
        }
        return g1Var.f783a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        g1 g1Var;
        o oVar = this.f890b;
        if (oVar == null || (g1Var = oVar.f874b) == null) {
            return null;
        }
        return g1Var.f784b;
    }

    public final boolean hasOverlappingRendering() {
        if (!(!(this.f890b.f873a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f889a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f889a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.f890b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        o oVar = this.f890b;
        if (!(oVar == null || drawable == null || this.f891c)) {
            oVar.f875c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        o oVar2 = this.f890b;
        if (oVar2 != null) {
            oVar2.a();
            if (!this.f891c) {
                o oVar3 = this.f890b;
                if (oVar3.f873a.getDrawable() != null) {
                    oVar3.f873a.getDrawable().setLevel(oVar3.f875c);
                }
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f891c = true;
    }

    public void setImageResource(int i10) {
        o oVar = this.f890b;
        if (oVar != null) {
            oVar.c(i10);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f890b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f889a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f889a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o oVar = this.f890b;
        if (oVar != null) {
            if (oVar.f874b == null) {
                oVar.f874b = new g1();
            }
            g1 g1Var = oVar.f874b;
            g1Var.f783a = colorStateList;
            g1Var.f786d = true;
            oVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o oVar = this.f890b;
        if (oVar != null) {
            if (oVar.f874b == null) {
                oVar.f874b = new g1();
            }
            g1 g1Var = oVar.f874b;
            g1Var.f784b = mode;
            g1Var.f785c = true;
            oVar.a();
        }
    }
}

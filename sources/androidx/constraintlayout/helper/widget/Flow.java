package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import q.d;
import q.j;
import t.f;
import z5.c;

public class Flow extends f {
    public q.f k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.k = new q.f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.k.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    q.f fVar = this.k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar.u0 = dimensionPixelSize;
                    fVar.f10965v0 = dimensionPixelSize;
                    fVar.f10966w0 = dimensionPixelSize;
                    fVar.f10967x0 = dimensionPixelSize;
                } else if (index == 18) {
                    q.f fVar2 = this.k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar2.f10966w0 = dimensionPixelSize2;
                    fVar2.f10968y0 = dimensionPixelSize2;
                    fVar2.f10969z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.k.f10967x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.k.f10968y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.k.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.k.f10969z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.k.f10965v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.k.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.k.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.k.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.k.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.k.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.k.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.k.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.k.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.k.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.k.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.k.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.k.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.k.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.k.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.k.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.k.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.k.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.k.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1106d = this.k;
        k();
    }

    public final void j(d dVar, boolean z9) {
        q.f fVar = this.k;
        int i10 = fVar.f10966w0;
        if (i10 <= 0 && fVar.f10967x0 <= 0) {
            return;
        }
        if (z9) {
            fVar.f10968y0 = fVar.f10967x0;
            fVar.f10969z0 = i10;
            return;
        }
        fVar.f10968y0 = i10;
        fVar.f10969z0 = fVar.f10967x0;
    }

    public final void l(j jVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (jVar != null) {
            jVar.S(mode, size, mode2, size2);
            setMeasuredDimension(jVar.B0, jVar.C0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        l(this.k, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.k.N0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.k.H0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.k.O0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.k.I0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.k.T0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.k.L0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.k.R0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.k.F0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.k.P0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.k.J0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.k.Q0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.k.K0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.k.W0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.k.X0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        q.f fVar = this.k;
        fVar.u0 = i10;
        fVar.f10965v0 = i10;
        fVar.f10966w0 = i10;
        fVar.f10967x0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.k.f10965v0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.k.f10968y0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.k.f10969z0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.k.u0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.k.U0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.k.M0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.k.S0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.k.G0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.k.V0 = i10;
        requestLayout();
    }
}

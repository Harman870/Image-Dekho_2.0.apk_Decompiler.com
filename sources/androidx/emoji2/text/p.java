package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public final class p extends k {
    public p(i iVar) {
        super(iVar);
    }

    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        f.a().getClass();
        i iVar = this.f1380b;
        Typeface typeface = iVar.f1368b.f1395d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i15 = iVar.f1367a * 2;
        char[] cArr = iVar.f1368b.f1393b;
        canvas.drawText(cArr, i15, 2, f10, (float) i13, paint);
        paint2.setTypeface(typeface2);
    }
}

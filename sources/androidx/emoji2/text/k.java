package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import r0.a;

public abstract class k extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1379a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final i f1380b;

    /* renamed from: c  reason: collision with root package name */
    public float f1381c = 1.0f;

    public k(i iVar) {
        if (iVar != null) {
            this.f1380b = iVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        paint.getFontMetricsInt(this.f1379a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1379a;
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        a c10 = this.f1380b.c();
        int a10 = c10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = c10.f11456b.getShort(a10 + c10.f11455a);
        } else {
            s10 = 0;
        }
        this.f1381c = abs / ((float) s10);
        a c11 = this.f1380b.c();
        int a11 = c11.a(14);
        if (a11 != 0) {
            c11.f11456b.getShort(a11 + c11.f11455a);
        }
        a c12 = this.f1380b.c();
        int a12 = c12.a(12);
        if (a12 != 0) {
            s11 = c12.f11456b.getShort(a12 + c12.f11455a);
        }
        short s12 = (short) ((int) (((float) s11) * this.f1381c));
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1379a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s12;
    }
}

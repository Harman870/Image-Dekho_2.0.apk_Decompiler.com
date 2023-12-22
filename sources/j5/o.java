package j5;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f8688a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f8689b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8690c;

    /* renamed from: d  reason: collision with root package name */
    public int f8691d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f8692e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f8693f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f8694g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f8695h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f8696i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8697j = true;
    public boolean k;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f8698l = null;

    public static class a extends Exception {
    }

    public o(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f8688a = charSequence;
        this.f8689b = textPaint;
        this.f8690c = i10;
        this.f8691d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f8688a == null) {
            this.f8688a = "";
        }
        int max = Math.max(0, this.f8690c);
        CharSequence charSequence = this.f8688a;
        if (this.f8693f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f8689b, (float) max, this.f8698l);
        }
        int min = Math.min(charSequence.length(), this.f8691d);
        this.f8691d = min;
        if (this.k && this.f8693f == 1) {
            this.f8692e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f8689b, max);
        obtain.setAlignment(this.f8692e);
        obtain.setIncludePad(this.f8697j);
        obtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f8698l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f8693f);
        float f10 = this.f8694g;
        if (!(f10 == 0.0f && this.f8695h == 1.0f)) {
            obtain.setLineSpacing(f10, this.f8695h);
        }
        if (this.f8693f > 1) {
            obtain.setHyphenationFrequency(this.f8696i);
        }
        return obtain.build();
    }
}

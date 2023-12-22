package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

public final class d implements f.d {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f1339b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1340a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f1340a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}

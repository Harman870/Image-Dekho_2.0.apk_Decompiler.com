package f0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.f;
import g0.b;

public final class c implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f6304a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f6305b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6306c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6307d;

        public a(PrecomputedText.Params params) {
            this.f6304a = params.getTextPaint();
            this.f6305b = params.getTextDirection();
            this.f6306c = params.getBreakStrategy();
            this.f6307d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            }
            this.f6304a = textPaint;
            this.f6305b = textDirectionHeuristic;
            this.f6306c = i10;
            this.f6307d = i11;
        }

        public final boolean a(a aVar) {
            if (this.f6306c != aVar.f6306c || this.f6307d != aVar.f6307d || this.f6304a.getTextSize() != aVar.f6304a.getTextSize() || this.f6304a.getTextScaleX() != aVar.f6304a.getTextScaleX() || this.f6304a.getTextSkewX() != aVar.f6304a.getTextSkewX() || this.f6304a.getLetterSpacing() != aVar.f6304a.getLetterSpacing() || !TextUtils.equals(this.f6304a.getFontFeatureSettings(), aVar.f6304a.getFontFeatureSettings()) || this.f6304a.getFlags() != aVar.f6304a.getFlags() || !this.f6304a.getTextLocales().equals(aVar.f6304a.getTextLocales())) {
                return false;
            }
            if (this.f6304a.getTypeface() == null) {
                if (aVar.f6304a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f6304a.getTypeface().equals(aVar.f6304a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f6305b == aVar.f6305b;
        }

        public final int hashCode() {
            return b.b(Float.valueOf(this.f6304a.getTextSize()), Float.valueOf(this.f6304a.getTextScaleX()), Float.valueOf(this.f6304a.getTextSkewX()), Float.valueOf(this.f6304a.getLetterSpacing()), Integer.valueOf(this.f6304a.getFlags()), this.f6304a.getTextLocales(), this.f6304a.getTypeface(), Boolean.valueOf(this.f6304a.isElegantTextHeight()), this.f6305b, Integer.valueOf(this.f6306c), Integer.valueOf(this.f6307d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder g10 = f.g("textSize=");
            g10.append(this.f6304a.getTextSize());
            sb.append(g10.toString());
            sb.append(", textScaleX=" + this.f6304a.getTextScaleX());
            sb.append(", textSkewX=" + this.f6304a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            StringBuilder g11 = f.g(", letterSpacing=");
            g11.append(this.f6304a.getLetterSpacing());
            sb.append(g11.toString());
            sb.append(", elegantTextHeight=" + this.f6304a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f6304a.getTextLocales());
            sb.append(", typeface=" + this.f6304a.getTypeface());
            if (i10 >= 26) {
                StringBuilder g12 = f.g(", variationSettings=");
                g12.append(this.f6304a.getFontVariationSettings());
                sb.append(g12.toString());
            }
            StringBuilder g13 = f.g(", textDir=");
            g13.append(this.f6305b);
            sb.append(g13.toString());
            sb.append(", breakStrategy=" + this.f6306c);
            sb.append(", hyphenationFrequency=" + this.f6307d);
            sb.append("}");
            return sb.toString();
        }
    }

    public final char charAt(int i10) {
        throw null;
    }

    public final int getSpanEnd(Object obj) {
        throw null;
    }

    public final int getSpanFlags(Object obj) {
        throw null;
    }

    public final int getSpanStart(Object obj) {
        throw null;
    }

    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        int i12 = Build.VERSION.SDK_INT;
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i10 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i13 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

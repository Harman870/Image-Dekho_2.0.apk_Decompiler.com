package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import f0.c;
import java.util.stream.IntStream;

public final class q implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1402a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f1403b;

    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof c;
        }
    }

    public static class b extends a {
        public final boolean a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof c);
        }
    }

    public q(Spannable spannable) {
        this.f1403b = spannable;
    }

    public q(CharSequence charSequence) {
        this.f1403b = new SpannableString(charSequence);
    }

    public final void a() {
        a aVar;
        Spannable spannable = this.f1403b;
        if (!this.f1402a) {
            if (Build.VERSION.SDK_INT < 28) {
                aVar = new a();
            } else {
                aVar = new b();
            }
            if (aVar.a(spannable)) {
                this.f1403b = new SpannableString(spannable);
            }
        }
        this.f1402a = true;
    }

    public final char charAt(int i10) {
        return this.f1403b.charAt(i10);
    }

    public final IntStream chars() {
        return this.f1403b.chars();
    }

    public final IntStream codePoints() {
        return this.f1403b.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.f1403b.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f1403b.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f1403b.getSpanStart(obj);
    }

    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return this.f1403b.getSpans(i10, i11, cls);
    }

    public final int length() {
        return this.f1403b.length();
    }

    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1403b.nextSpanTransition(i10, i11, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.f1403b.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f1403b.setSpan(obj, i10, i11, i12);
    }

    public final CharSequence subSequence(int i10, int i11) {
        return this.f1403b.subSequence(i10, i11);
    }

    public final String toString() {
        return this.f1403b.toString();
    }
}

package n5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.c;

public final class e extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f10378b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextPaint f10379c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f10380d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f10381e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Context context, TextPaint textPaint, c cVar) {
        super(0);
        this.f10381e = dVar;
        this.f10378b = context;
        this.f10379c = textPaint;
        this.f10380d = cVar;
    }

    public final void k(int i10) {
        this.f10380d.k(i10);
    }

    public final void l(Typeface typeface, boolean z9) {
        this.f10381e.g(this.f10378b, this.f10379c, typeface);
        this.f10380d.l(typeface, z9);
    }
}

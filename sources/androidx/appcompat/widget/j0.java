package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class j0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f820l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f821m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f822a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f823b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f824c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f825d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f826e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f827f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f828g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f829h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f830i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f831j;
    public final d k;

    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    public static class d extends f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) j0.e("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class e extends d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) j0.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public j0(TextView textView) {
        this.f830i = textView;
        this.f831j = textView.getContext();
        this.k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            Method method = f821m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f821m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        boolean z9;
        int i10;
        if (!i() || this.f822a == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            if (this.f823b) {
                if (this.f830i.getMeasuredHeight() > 0 && this.f830i.getMeasuredWidth() > 0) {
                    if (this.k.b(this.f830i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.f830i.getMeasuredWidth() - this.f830i.getTotalPaddingLeft()) - this.f830i.getTotalPaddingRight();
                    }
                    int height = (this.f830i.getHeight() - this.f830i.getCompoundPaddingBottom()) - this.f830i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = f820l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i10;
                            rectF.bottom = (float) height;
                            float c10 = (float) c(rectF);
                            if (c10 != this.f830i.getTextSize()) {
                                f(0, c10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f823b = true;
        }
    }

    public final int c(RectF rectF) {
        boolean z9;
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f827f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f827f[i13];
                CharSequence text = this.f830i.getText();
                TransformationMethod transformationMethod = this.f830i.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f830i)) == null)) {
                    text = transformation;
                }
                int b10 = a.b(this.f830i);
                TextPaint textPaint = this.f829h;
                if (textPaint == null) {
                    this.f829h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f829h.set(this.f830i.getPaint());
                this.f829h.setTextSize((float) i14);
                StaticLayout a10 = c.a(text, (Layout.Alignment) e("getLayoutAlignment", this.f830i, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF2.right), b10, this.f830i, this.f829h, this.k);
                if ((b10 == -1 || (a10.getLineCount() <= b10 && a10.getLineEnd(a10.getLineCount() - 1) == text.length())) && ((float) a10.getHeight()) <= rectF2.bottom) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f827f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i10, float f10) {
        Context context = this.f831j;
        float applyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f830i.getPaint().getTextSize()) {
            this.f830i.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(this.f830i);
            if (this.f830i.getLayout() != null) {
                this.f823b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(this.f830i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    this.f830i.requestLayout();
                } else {
                    this.f830i.forceLayout();
                }
                this.f830i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f822a != 1) {
            this.f823b = false;
        } else {
            if (!this.f828g || this.f827f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f826e - this.f825d) / this.f824c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((((float) i10) * this.f824c) + this.f825d);
                }
                this.f827f = b(iArr);
            }
            this.f823b = true;
        }
        return this.f823b;
    }

    public final boolean h() {
        int[] iArr = this.f827f;
        int length = iArr.length;
        boolean z9 = length > 0;
        this.f828g = z9;
        if (z9) {
            this.f822a = 1;
            this.f825d = (float) iArr[0];
            this.f826e = (float) iArr[length - 1];
            this.f824c = -1.0f;
        }
        return z9;
    }

    public final boolean i() {
        return !(this.f830i instanceof k);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f822a = 1;
            this.f825d = f10;
            this.f826e = f11;
            this.f824c = f12;
            this.f828g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }
}

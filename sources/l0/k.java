package l0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Locale;

public final class k {

    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    public static class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    public static class f implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f9201a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f9202b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f9203c;

        /* renamed from: d  reason: collision with root package name */
        public Method f9204d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9205e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9206f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f9201a = callback;
            this.f9202b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f9201a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f9201a.onCreateActionMode(actionMode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f9201a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                r12 = this;
                android.widget.TextView r0 = r12.f9202b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r12.f9206f
                r3 = 1
                java.lang.String r4 = "removeItemAt"
                r5 = 0
                if (r2 != 0) goto L_0x0032
                r12.f9206f = r3
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f9203c = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r6[r5] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f9204d = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f9205e = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r2 = 0
                r12.f9203c = r2
                r12.f9204d = r2
                r12.f9205e = r5
            L_0x0032:
                boolean r2 = r12.f9205e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.Class<?> r2 = r12.f9203c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r2 = r2.isInstance(r14)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.reflect.Method r2 = r12.f9204d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r2 = r14.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x004f:
                int r4 = r14.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                int r4 = r4 - r3
            L_0x0054:
                java.lang.String r6 = "android.intent.action.PROCESS_TEXT"
                if (r4 < 0) goto L_0x007e
                android.view.MenuItem r7 = r14.getItem(r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                android.content.Intent r8 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r8 == 0) goto L_0x007b
                android.content.Intent r7 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.String r7 = r7.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r6 = r6.equals(r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r6 == 0) goto L_0x007b
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r2.invoke(r14, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x007b:
                int r4 = r4 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                boolean r4 = r0 instanceof android.app.Activity
                java.lang.String r7 = "text/plain"
                if (r4 != 0) goto L_0x008a
                goto L_0x00d5
            L_0x008a:
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                android.content.Intent r4 = r4.setAction(r6)
                android.content.Intent r4 = r4.setType(r7)
                java.util.List r4 = r1.queryIntentActivities(r4, r5)
                java.util.Iterator r4 = r4.iterator()
            L_0x009f:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x00d5
                java.lang.Object r8 = r4.next()
                android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
                java.lang.String r9 = r0.getPackageName()
                android.content.pm.ActivityInfo r10 = r8.activityInfo
                java.lang.String r10 = r10.packageName
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x00ba
                goto L_0x00ce
            L_0x00ba:
                android.content.pm.ActivityInfo r9 = r8.activityInfo
                boolean r10 = r9.exported
                if (r10 != 0) goto L_0x00c1
                goto L_0x00cc
            L_0x00c1:
                java.lang.String r9 = r9.permission
                if (r9 == 0) goto L_0x00ce
                int r9 = r0.checkSelfPermission(r9)
                if (r9 != 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                r9 = r5
                goto L_0x00cf
            L_0x00ce:
                r9 = r3
            L_0x00cf:
                if (r9 == 0) goto L_0x009f
                r2.add(r8)
                goto L_0x009f
            L_0x00d5:
                r0 = r5
            L_0x00d6:
                int r4 = r2.size()
                if (r0 >= r4) goto L_0x0129
                java.lang.Object r4 = r2.get(r0)
                android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
                int r8 = r0 + 100
                java.lang.CharSequence r9 = r4.loadLabel(r1)
                android.view.MenuItem r8 = r14.add(r5, r5, r8, r9)
                android.widget.TextView r9 = r12.f9202b
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r6)
                android.content.Intent r10 = r10.setType(r7)
                boolean r11 = r9 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010d
                boolean r11 = r9.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010d
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x010d
                r9 = r3
                goto L_0x010e
            L_0x010d:
                r9 = r5
            L_0x010e:
                r9 = r9 ^ r3
                java.lang.String r11 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r9 = r10.putExtra(r11, r9)
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                java.lang.String r10 = r4.packageName
                java.lang.String r4 = r4.name
                android.content.Intent r4 = r9.setClassName(r10, r4)
                android.view.MenuItem r4 = r8.setIntent(r4)
                r4.setShowAsAction(r3)
                int r0 = r0 + 1
                goto L_0x00d6
            L_0x0129:
                android.view.ActionMode$Callback r0 = r12.f9201a
                boolean r13 = r0.onPrepareActionMode(r13, r14)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.k.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r7 != 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r5 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f0.c.a a(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            f0.c$a r0 = new f0.c$a
            android.text.PrecomputedText$Params r7 = l0.k.e.b(r7)
            r0.<init>(r7)
            return r0
        L_0x0010:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = l0.k.c.a(r7)
            int r4 = l0.k.c.d(r7)
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L_0x002e
        L_0x002b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0075
        L_0x002e:
            r5 = 0
            r6 = 1
            if (r0 < r1) goto L_0x0057
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x0057
            java.util.Locale r7 = l0.k.b.d(r7)
            android.icu.text.DecimalFormatSymbols r7 = l0.k.d.a(r7)
            java.lang.String[] r7 = l0.k.e.a(r7)
            r7 = r7[r5]
            int r7 = r7.codePointAt(r5)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r6) goto L_0x006d
            r0 = 2
            if (r7 != r0) goto L_0x002b
            goto L_0x006d
        L_0x0057:
            int r0 = l0.k.b.b(r7)
            if (r0 != r6) goto L_0x005e
            r5 = r6
        L_0x005e:
            int r7 = l0.k.b.c(r7)
            switch(r7) {
                case 2: goto L_0x0070;
                case 3: goto L_0x002b;
                case 4: goto L_0x006d;
                case 5: goto L_0x006a;
                case 6: goto L_0x0073;
                case 7: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            if (r5 == 0) goto L_0x0073
        L_0x0067:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0075
        L_0x006a:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0075
        L_0x006d:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0075
        L_0x0070:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0075
        L_0x0073:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0075:
            f0.c$a r0 = new f0.c$a
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.k.a(android.widget.TextView):f0.c$a");
    }

    public static void b(TextView textView, int i10) {
        c6.b.n(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i10) {
        c6.b.n(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).f9201a;
    }

    public static ActionMode.Callback e(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}

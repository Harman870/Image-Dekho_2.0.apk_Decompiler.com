package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imgdkh.app.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import m0.c;

public final class c1 extends c implements View.OnClickListener {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f741x = 0;
    public final SearchView k;

    /* renamed from: l  reason: collision with root package name */
    public final SearchableInfo f742l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f743m;

    /* renamed from: n  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f744n;

    /* renamed from: o  reason: collision with root package name */
    public final int f745o;

    /* renamed from: p  reason: collision with root package name */
    public int f746p = 1;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f747q;

    /* renamed from: r  reason: collision with root package name */
    public int f748r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f749s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f750t = -1;
    public int u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f751v = -1;
    public int w = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f752a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f753b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f754c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f755d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f756e;

        public a(View view) {
            this.f752a = (TextView) view.findViewById(16908308);
            this.f753b = (TextView) view.findViewById(16908309);
            this.f754c = (ImageView) view.findViewById(16908295);
            this.f755d = (ImageView) view.findViewById(16908296);
            this.f756e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public c1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.k = searchView;
        this.f742l = searchableInfo;
        this.f745o = searchView.getSuggestionCommitIconResId();
        this.f743m = context;
        this.f744n = weakHashMap;
    }

    public static String i(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r19, android.database.Cursor r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            androidx.appcompat.widget.c1$a r3 = (androidx.appcompat.widget.c1.a) r3
            int r0 = r1.w
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.f752a
            if (r0 == 0) goto L_0x0034
            int r0 = r1.f748r
            java.lang.String r0 = i(r2, r0)
            android.widget.TextView r8 = r3.f752a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 8
            goto L_0x0031
        L_0x0030:
            r0 = r5
        L_0x0031:
            r8.setVisibility(r0)
        L_0x0034:
            android.widget.TextView r0 = r3.f753b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00bd
            int r0 = r1.f750t
            java.lang.String r0 = i(r2, r0)
            if (r0 == 0) goto L_0x0086
            android.content.res.ColorStateList r10 = r1.f747q
            if (r10 != 0) goto L_0x0065
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f743m
            android.content.res.Resources$Theme r11 = r11.getTheme()
            r12 = 2130904252(0x7f0304bc, float:1.7415345E38)
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f743m
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f747q = r10
        L_0x0065:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f747q
            r16 = 0
            r17 = r11
            r11 = r15
            r7 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r7, r5, r0, r11)
            goto L_0x008c
        L_0x0086:
            int r0 = r1.f749s
            java.lang.String r10 = i(r2, r0)
        L_0x008c:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x009f
            android.widget.TextView r0 = r3.f752a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f752a
            r0.setMaxLines(r8)
            goto L_0x00ab
        L_0x009f:
            android.widget.TextView r0 = r3.f752a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f752a
            r0.setMaxLines(r9)
        L_0x00ab:
            android.widget.TextView r0 = r3.f753b
            r0.setText(r10)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 == 0) goto L_0x00b9
            r7 = 8
            goto L_0x00ba
        L_0x00b9:
            r7 = r5
        L_0x00ba:
            r0.setVisibility(r7)
        L_0x00bd:
            android.widget.ImageView r7 = r3.f754c
            r10 = 0
            if (r7 == 0) goto L_0x0175
            int r0 = r1.u
            if (r0 != r4) goto L_0x00c9
            r0 = r10
            goto L_0x0162
        L_0x00c9:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.g(r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x0162
        L_0x00d5:
            android.app.SearchableInfo r0 = r1.f742l
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f744n
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x00fe
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f744n
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f3
            r0 = r10
            goto L_0x0155
        L_0x00f3:
            android.content.Context r11 = r1.f743m
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0155
        L_0x00fe:
            android.content.Context r12 = r1.f743m
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x013b }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0111
            goto L_0x0146
        L_0x0111:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0147
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Invalid icon resource "
            r12.append(r13)
            r12.append(r14)
            java.lang.String r13 = " for "
            r12.append(r13)
            java.lang.String r0 = r0.flattenToShortString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            goto L_0x0141
        L_0x013b:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = r12.toString()
        L_0x0141:
            java.lang.String r12 = "SuggestionsAdapter"
            android.util.Log.w(r12, r0)
        L_0x0146:
            r12 = r10
        L_0x0147:
            if (r12 != 0) goto L_0x014b
            r0 = r10
            goto L_0x014f
        L_0x014b:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x014f:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.f744n
            r13.put(r11, r0)
            r0 = r12
        L_0x0155:
            if (r0 == 0) goto L_0x0158
            goto L_0x0162
        L_0x0158:
            android.content.Context r0 = r1.f743m
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0162:
            r11 = 4
            r7.setImageDrawable(r0)
            if (r0 != 0) goto L_0x016c
            r7.setVisibility(r11)
            goto L_0x0175
        L_0x016c:
            r7.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r9, r5)
        L_0x0175:
            android.widget.ImageView r0 = r3.f755d
            if (r0 == 0) goto L_0x019a
            int r7 = r1.f751v
            if (r7 != r4) goto L_0x017e
            goto L_0x0186
        L_0x017e:
            java.lang.String r2 = r2.getString(r7)
            android.graphics.drawable.Drawable r10 = r1.g(r2)
        L_0x0186:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0191
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x019a
        L_0x0191:
            r0.setVisibility(r5)
            r10.setVisible(r5, r5)
            r10.setVisible(r9, r5)
        L_0x019a:
            int r0 = r1.f746p
            if (r0 == r8) goto L_0x01ad
            if (r0 != r9) goto L_0x01a5
            r0 = r6 & 1
            if (r0 == 0) goto L_0x01a5
            goto L_0x01ad
        L_0x01a5:
            android.widget.ImageView r0 = r3.f756e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01c2
        L_0x01ad:
            android.widget.ImageView r0 = r3.f756e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f756e
            android.widget.TextView r2 = r3.f752a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f756e
            r0.setOnClickListener(r1)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c1.b(android.view.View, android.database.Cursor):void");
    }

    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f748r = cursor.getColumnIndex("suggest_text_1");
                this.f749s = cursor.getColumnIndex("suggest_text_2");
                this.f750t = cursor.getColumnIndex("suggest_text_2_url");
                this.u = cursor.getColumnIndex("suggest_icon_1");
                this.f751v = cursor.getColumnIndex("suggest_icon_2");
                this.w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    public final String d(Cursor cursor) {
        String i10;
        String i11;
        if (cursor == null) {
            return null;
        }
        String i12 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i12 != null) {
            return i12;
        }
        if (this.f742l.shouldRewriteQueryFromData() && (i11 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i11;
        }
        if (!this.f742l.shouldRewriteQueryFromText() || (i10 = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i10;
    }

    public final View e(ViewGroup viewGroup) {
        View inflate = this.f9319j.inflate(this.f9317h, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f745o);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int i10;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f743m.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i10 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i10 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i10 != 0) {
                        return resourcesForApplication.getDrawable(i10);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable g(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013c
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013c
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013c
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.content.Context r4 = r7.f743m     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f744n     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.f743m     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r5 = y.a.f13006a     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable r2 = y.a.b.b(r4, r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r2 == 0) goto L_0x005e
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f744n     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x005e:
            return r2
        L_0x005f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0074:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.f744n
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x0080
            r2 = r1
            goto L_0x0084
        L_0x0080:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0084:
            if (r2 == 0) goto L_0x0087
            return r2
        L_0x0087:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x0110 }
            if (r4 == 0) goto L_0x00b7
            android.graphics.drawable.Drawable r0 = r7.f(r2)     // Catch:{ NotFoundException -> 0x00a0 }
            r1 = r0
            goto L_0x0131
        L_0x00a0:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0110 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00b7:
            android.content.Context r4 = r7.f743m     // Catch:{ FileNotFoundException -> 0x0110 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            if (r4 == 0) goto L_0x00f9
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00e0 }
            r4.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00de
        L_0x00cb:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00de:
            r1 = r5
            goto L_0x0131
        L_0x00e0:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00f8
        L_0x00e5:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00f8:
            throw r5     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00f9:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0110 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x0110:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x0131:
            if (r1 == 0) goto L_0x013c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.f744n
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c1.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f9319j.inflate(this.f9318i, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f752a.setText(e10.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f752a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        Uri build = fragment.build();
        return this.f743m.getContentResolver().query(build, (String[]) null, suggestSelection, strArr, (String) null);
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f9309c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f9309c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.k.p((CharSequence) tag);
        }
    }
}

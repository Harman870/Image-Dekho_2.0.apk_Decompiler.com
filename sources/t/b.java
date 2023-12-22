package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import z5.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f11916a;

    /* renamed from: b  reason: collision with root package name */
    public int f11917b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f11918c = -1;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<a> f11919d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.b> f11920e = new SparseArray<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f11921a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<C0141b> f11922b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f11923c = -1;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.b f11924d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), c.f13194s);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f11921a = obtainStyledAttributes.getResourceId(index, this.f11921a);
                } else if (index == 1) {
                    this.f11923c = obtainStyledAttributes.getResourceId(index, this.f11923c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11923c);
                    context.getResources().getResourceName(this.f11923c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f11924d = bVar;
                        bVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f11923c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f11922b.size(); i10++) {
                if (this.f11922b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* renamed from: t.b$b  reason: collision with other inner class name */
    public static class C0141b {

        /* renamed from: a  reason: collision with root package name */
        public float f11925a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f11926b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f11927c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f11928d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public int f11929e = -1;

        /* renamed from: f  reason: collision with root package name */
        public androidx.constraintlayout.widget.b f11930f;

        public C0141b(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), c.u);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f11929e = obtainStyledAttributes.getResourceId(index, this.f11929e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11929e);
                    context.getResources().getResourceName(this.f11929e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f11930f = bVar;
                        bVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f11929e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f11928d = obtainStyledAttributes.getDimension(index, this.f11928d);
                } else if (index == 2) {
                    this.f11926b = obtainStyledAttributes.getDimension(index, this.f11926b);
                } else if (index == 3) {
                    this.f11927c = obtainStyledAttributes.getDimension(index, this.f11927c);
                } else if (index == 4) {
                    this.f11925a = obtainStyledAttributes.getDimension(index, this.f11925a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f11925a) && f10 < this.f11925a) {
                return false;
            }
            if (!Float.isNaN(this.f11926b) && f11 < this.f11926b) {
                return false;
            }
            if (Float.isNaN(this.f11927c) || f10 <= this.f11927c) {
                return Float.isNaN(this.f11928d) || f11 <= this.f11928d;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f11917b = r0
            r7.f11918c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f11919d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f11920e = r1
            r7.f11916a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = 0
        L_0x0025:
            r2 = 1
            if (r10 == r2) goto L_0x00a6
            if (r10 == 0) goto L_0x0095
            r3 = 2
            if (r10 == r3) goto L_0x002f
            goto L_0x0098
        L_0x002f:
            java.lang.String r10 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r4 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0064;
                case 80204913: goto L_0x005a;
                case 1382829617: goto L_0x0051;
                case 1657696882: goto L_0x0047;
                case 1901439077: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x003c:
            goto L_0x006e
        L_0x003d:
            java.lang.String r2 = "Variant"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r6
            goto L_0x006f
        L_0x0047:
            java.lang.String r2 = "layoutDescription"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 0
            goto L_0x006f
        L_0x0051:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            goto L_0x006f
        L_0x005a:
            java.lang.String r2 = "State"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r3
            goto L_0x006f
        L_0x0064:
            java.lang.String r2 = "ConstraintSet"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r5
            goto L_0x006f
        L_0x006e:
            r2 = r0
        L_0x006f:
            if (r2 == r3) goto L_0x0087
            if (r2 == r6) goto L_0x007a
            if (r2 == r5) goto L_0x0076
            goto L_0x0098
        L_0x0076:
            r7.a(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x007a:
            t.b$b r10 = new t.b$b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0098
            java.util.ArrayList<t.b$b> r2 = r1.f11922b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r2.add(r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x0087:
            t.b$a r10 = new t.b$a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            android.util.SparseArray<t.b$a> r1 = r7.f11919d     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r2 = r10.f11921a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1.put(r2, r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = r10
            goto L_0x0098
        L_0x0095:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x0098:
            int r10 = r9.next()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0025
        L_0x009d:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00a6
        L_0x00a2:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0226, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r5 == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
        if (r5 == true) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (r5 == true) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r5 == true) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        r0.f1116c.put(java.lang.Integer.valueOf(r7.f1117a), r7);
        r7 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            r11 = this;
            androidx.constraintlayout.widget.b r0 = new androidx.constraintlayout.widget.b
            r0.<init>()
            int r1 = r13.getAttributeCount()
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r1) goto L_0x023f
            java.lang.String r4 = r13.getAttributeName(r3)
            java.lang.String r5 = r13.getAttributeValue(r3)
            if (r4 == 0) goto L_0x023b
            if (r5 != 0) goto L_0x001b
            goto L_0x023b
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x023b
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = -1
            r4 = 1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r4
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r12.getResources()
            java.lang.String r8 = r12.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = r3
        L_0x0046:
            if (r1 != r3) goto L_0x005e
            int r6 = r5.length()
            if (r6 <= r4) goto L_0x0057
            java.lang.String r1 = r5.substring(r4)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L_0x005e
        L_0x0057:
            java.lang.String r5 = "ConstraintLayoutStates"
            java.lang.String r6 = "error in parsing id"
            android.util.Log.e(r5, r6)
        L_0x005e:
            int r5 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r6 = 0
            r7 = r6
        L_0x0064:
            if (r5 == r4) goto L_0x0235
            if (r5 == 0) goto L_0x0223
            r8 = 3
            r9 = 2
            if (r5 == r9) goto L_0x00c3
            if (r5 == r8) goto L_0x0070
            goto L_0x0226
        L_0x0070:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.String r5 = r5.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            switch(r10) {
                case -2075718416: goto L_0x00a0;
                case -190376483: goto L_0x0096;
                case 426575017: goto L_0x008c;
                case 2146106725: goto L_0x0082;
                default: goto L_0x0081;
            }     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x0081:
            goto L_0x00aa
        L_0x0082:
            java.lang.String r10 = "constraintset"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x00aa
            r5 = r2
            goto L_0x00ab
        L_0x008c:
            java.lang.String r10 = "constraintoverride"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x00aa
            r5 = r9
            goto L_0x00ab
        L_0x0096:
            java.lang.String r10 = "constraint"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x00aa
            r5 = r4
            goto L_0x00ab
        L_0x00a0:
            java.lang.String r10 = "guideline"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x00aa
            r5 = r8
            goto L_0x00ab
        L_0x00aa:
            r5 = r3
        L_0x00ab:
            if (r5 == 0) goto L_0x0235
            if (r5 == r4) goto L_0x00b5
            if (r5 == r9) goto L_0x00b5
            if (r5 == r8) goto L_0x00b5
            goto L_0x0226
        L_0x00b5:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r5 = r0.f1116c     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r8 = r7.f1117a     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r5.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r7 = r6
            goto L_0x0226
        L_0x00c3:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            switch(r10) {
                case -2025855158: goto L_0x012c;
                case -1984451626: goto L_0x0122;
                case -1962203927: goto L_0x0118;
                case -1269513683: goto L_0x010e;
                case -1238332596: goto L_0x0104;
                case -71750448: goto L_0x00fa;
                case 366511058: goto L_0x00ef;
                case 1331510167: goto L_0x00e6;
                case 1791837707: goto L_0x00db;
                case 1803088381: goto L_0x00d0;
                default: goto L_0x00ce;
            }     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x00ce:
            goto L_0x0136
        L_0x00d0:
            java.lang.String r8 = "Constraint"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = r2
            goto L_0x0137
        L_0x00db:
            java.lang.String r8 = "CustomAttribute"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = 8
            goto L_0x0137
        L_0x00e6:
            java.lang.String r9 = "Barrier"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            goto L_0x0137
        L_0x00ef:
            java.lang.String r8 = "CustomMethod"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = 9
            goto L_0x0137
        L_0x00fa:
            java.lang.String r8 = "Guideline"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = r9
            goto L_0x0137
        L_0x0104:
            java.lang.String r8 = "Transform"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = 5
            goto L_0x0137
        L_0x010e:
            java.lang.String r8 = "PropertySet"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = 4
            goto L_0x0137
        L_0x0118:
            java.lang.String r8 = "ConstraintOverride"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = r4
            goto L_0x0137
        L_0x0122:
            java.lang.String r8 = "Motion"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = 7
            goto L_0x0137
        L_0x012c:
            java.lang.String r8 = "Layout"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            if (r5 == 0) goto L_0x0136
            r8 = 6
            goto L_0x0137
        L_0x0136:
            r8 = r3
        L_0x0137:
            java.lang.String r5 = "XML parser error must be within a Constraint "
            switch(r8) {
                case 0: goto L_0x0219;
                case 1: goto L_0x0210;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01d1;
                case 5: goto L_0x01ac;
                case 6: goto L_0x0186;
                case 7: goto L_0x0160;
                case 8: goto L_0x013e;
                case 9: goto L_0x013e;
                default: goto L_0x013c;
            }
        L_0x013c:
            goto L_0x0226
        L_0x013e:
            if (r7 == 0) goto L_0x0147
            java.util.HashMap<java.lang.String, t.a> r5 = r7.f1122f     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            t.a.a(r12, r13, r5)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0226
        L_0x0147:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            throw r12     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x0160:
            if (r7 == 0) goto L_0x016d
            androidx.constraintlayout.widget.b$c r5 = r7.f1119c     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0226
        L_0x016d:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            throw r12     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x0186:
            if (r7 == 0) goto L_0x0193
            androidx.constraintlayout.widget.b$b r5 = r7.f1120d     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0226
        L_0x0193:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            throw r12     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x01ac:
            if (r7 == 0) goto L_0x01b8
            androidx.constraintlayout.widget.b$e r5 = r7.f1121e     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0226
        L_0x01b8:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            throw r12     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x01d1:
            if (r7 == 0) goto L_0x01dd
            androidx.constraintlayout.widget.b$d r5 = r7.f1118b     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0226
        L_0x01dd:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            throw r12     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x01f6:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            androidx.constraintlayout.widget.b$a r5 = androidx.constraintlayout.widget.b.d(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            androidx.constraintlayout.widget.b$b r7 = r5.f1120d     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r7.f1149h0 = r4     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0221
        L_0x0203:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            androidx.constraintlayout.widget.b$a r5 = androidx.constraintlayout.widget.b.d(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            androidx.constraintlayout.widget.b$b r7 = r5.f1120d     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            r7.f1134a = r4     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0221
        L_0x0210:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            androidx.constraintlayout.widget.b$a r5 = androidx.constraintlayout.widget.b.d(r12, r5, r4)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0221
        L_0x0219:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            androidx.constraintlayout.widget.b$a r5 = androidx.constraintlayout.widget.b.d(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x0221:
            r7 = r5
            goto L_0x0226
        L_0x0223:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
        L_0x0226:
            int r5 = r13.next()     // Catch:{ XmlPullParserException -> 0x0231, IOException -> 0x022c }
            goto L_0x0064
        L_0x022c:
            r12 = move-exception
            r12.printStackTrace()
            goto L_0x0235
        L_0x0231:
            r12 = move-exception
            r12.printStackTrace()
        L_0x0235:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r12 = r11.f11920e
            r12.put(r1, r0)
            goto L_0x023f
        L_0x023b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}

package z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import e0.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public final class d {

    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final C0172d[] f13085a;

        public c(C0172d[] dVarArr) {
            this.f13085a = dVarArr;
        }
    }

    /* renamed from: z.d$d  reason: collision with other inner class name */
    public static final class C0172d {

        /* renamed from: a  reason: collision with root package name */
        public final String f13086a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13087b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13088c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13089d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13090e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13091f;

        public C0172d(int i10, int i11, int i12, String str, String str2, boolean z9) {
            this.f13086a = str;
            this.f13087b = i10;
            this.f13088c = z9;
            this.f13089d = str2;
            this.f13090e = i11;
            this.f13091f = i12;
        }
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final f f13092a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13093b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13094c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13095d;

        public e(f fVar, int i10, int i11, String str) {
            this.f13092a = fVar;
            this.f13094c = i10;
            this.f13093b = i11;
            this.f13095d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i10;
        boolean z9;
        int i11;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c.a.f2361s0);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c.a.f2363t0);
                                int i12 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i12 = 1;
                                }
                                int i13 = obtainAttributes2.getInt(i12, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i10 = 6;
                                } else {
                                    i10 = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i10, 0)) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                int i14 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i14 = 3;
                                }
                                int i15 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i15 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i15);
                                int i16 = obtainAttributes2.getInt(i14, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i11 = 5;
                                } else {
                                    i11 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                                String string6 = obtainAttributes2.getString(i11);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    c(xmlResourceParser);
                                }
                                arrayList.add(new C0172d(i13, i16, resourceId2, string6, string5, z9));
                            } else {
                                c(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new c((C0172d[]) arrayList.toArray(new C0172d[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new e(new f(string, string2, string3, b(resourceId, resources2)), integer, integer2, string4);
                }
            } else {
                c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List b(int i10, Resources resources) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}

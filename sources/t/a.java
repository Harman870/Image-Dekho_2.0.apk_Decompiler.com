package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.g;
import z5.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11908a;

    /* renamed from: b  reason: collision with root package name */
    public String f11909b;

    /* renamed from: c  reason: collision with root package name */
    public int f11910c;

    /* renamed from: d  reason: collision with root package name */
    public int f11911d;

    /* renamed from: e  reason: collision with root package name */
    public float f11912e;

    /* renamed from: f  reason: collision with root package name */
    public String f11913f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11914g;

    /* renamed from: h  reason: collision with root package name */
    public int f11915h;

    public a(String str, int i10, Object obj, boolean z9) {
        this.f11909b = str;
        this.f11910c = i10;
        this.f11908a = z9;
        c(obj);
    }

    public a(a aVar, Object obj) {
        this.f11908a = false;
        this.f11909b = aVar.f11909b;
        this.f11910c = aVar.f11910c;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int i10;
        float f10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), c.f13189n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i11 = 0;
        boolean z9 = false;
        Object obj = null;
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = obtainStyledAttributes.getIndex(i12);
            int i13 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z9 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i11 = 6;
            } else {
                if (index == 3) {
                    i13 = 3;
                } else if (index == 2) {
                    i13 = 4;
                } else {
                    if (index == 7) {
                        f10 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        f10 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i11 = 2;
                    } else {
                        if (index == 6) {
                            i10 = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == 9) {
                            obj = obtainStyledAttributes.getString(index);
                            i11 = 5;
                        } else if (index == 8) {
                            i10 = obtainStyledAttributes.getResourceId(index, -1);
                            if (i10 == -1) {
                                i10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            i13 = 8;
                        }
                        obj = Integer.valueOf(i10);
                        i11 = i13;
                    }
                    obj = Float.valueOf(f10);
                    i11 = 7;
                }
                i10 = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i10);
                i11 = i13;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, i11, obj, z9));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        String str;
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            if (!aVar.f11908a) {
                str = com.ironsource.adapters.ironsource.a.g("set", next);
            } else {
                str = next;
            }
            try {
                switch (g.b(aVar.f11910c)) {
                    case 0:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f11911d)});
                        break;
                    case 1:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f11912e)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f11915h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f11915h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f11913f});
                        break;
                    case 5:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f11914g)});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f11912e)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f11911d)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", e10.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str);
                Log.e("TransitionLayout", sb2.toString());
            } catch (IllegalAccessException e11) {
                e = e11;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (InvocationTargetException e12) {
                e = e12;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(next);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public final void c(Object obj) {
        switch (g.b(this.f11910c)) {
            case 0:
            case 7:
                this.f11911d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f11912e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f11915h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f11913f = (String) obj;
                return;
            case 5:
                this.f11914g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}

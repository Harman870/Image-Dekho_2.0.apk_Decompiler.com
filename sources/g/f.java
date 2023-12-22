package g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.o0;
import h.c;
import h0.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f6413e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f6414f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f6415a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f6416b;

    /* renamed from: c  reason: collision with root package name */
    public Context f6417c;

    /* renamed from: d  reason: collision with root package name */
    public Object f6418d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f6419c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f6420a;

        /* renamed from: b  reason: collision with root package name */
        public Method f6421b;

        public a(Object obj, String str) {
            this.f6420a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f6421b = cls.getMethod(str, f6419c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f6421b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f6421b.invoke(this.f6420a, new Object[]{menuItem})).booleanValue();
                }
                this.f6421b.invoke(this.f6420a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f6422a;

        /* renamed from: b  reason: collision with root package name */
        public int f6423b;

        /* renamed from: c  reason: collision with root package name */
        public int f6424c;

        /* renamed from: d  reason: collision with root package name */
        public int f6425d;

        /* renamed from: e  reason: collision with root package name */
        public int f6426e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6427f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6428g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6429h;

        /* renamed from: i  reason: collision with root package name */
        public int f6430i;

        /* renamed from: j  reason: collision with root package name */
        public int f6431j;
        public CharSequence k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f6432l;

        /* renamed from: m  reason: collision with root package name */
        public int f6433m;

        /* renamed from: n  reason: collision with root package name */
        public char f6434n;

        /* renamed from: o  reason: collision with root package name */
        public int f6435o;

        /* renamed from: p  reason: collision with root package name */
        public char f6436p;

        /* renamed from: q  reason: collision with root package name */
        public int f6437q;

        /* renamed from: r  reason: collision with root package name */
        public int f6438r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f6439s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f6440t;
        public boolean u;

        /* renamed from: v  reason: collision with root package name */
        public int f6441v;
        public int w;

        /* renamed from: x  reason: collision with root package name */
        public String f6442x;

        /* renamed from: y  reason: collision with root package name */
        public String f6443y;

        /* renamed from: z  reason: collision with root package name */
        public h0.b f6444z;

        public b(Menu menu) {
            this.f6422a = menu;
            this.f6423b = 0;
            this.f6424c = 0;
            this.f6425d = 0;
            this.f6426e = 0;
            this.f6427f = true;
            this.f6428g = true;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f6417c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z9;
            MenuItem enabled = menuItem.setChecked(this.f6439s).setVisible(this.f6440t).setEnabled(this.u);
            boolean z10 = false;
            if (this.f6438r >= 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            enabled.setCheckable(z9).setTitleCondensed(this.f6432l).setIcon(this.f6433m);
            int i10 = this.f6441v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f6443y != null) {
                if (!f.this.f6417c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f6418d == null) {
                        fVar.f6418d = f.a(fVar.f6417c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f6418d, this.f6443y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f6438r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).f(true);
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        if (cVar.f6664e == null) {
                            cVar.f6664e = cVar.f6663d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f6664e.invoke(cVar.f6663d, new Object[]{Boolean.TRUE});
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str = this.f6442x;
            if (str != null) {
                menuItem.setActionView((View) a(str, f.f6413e, f.this.f6415a));
                z10 = true;
            }
            int i11 = this.w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            h0.b bVar = this.f6444z;
            if (bVar != null) {
                if (menuItem instanceof c0.b) {
                    ((c0.b) menuItem).b(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z11 = menuItem instanceof c0.b;
            if (z11) {
                ((c0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z11) {
                ((c0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.m(menuItem, charSequence2);
            }
            char c10 = this.f6434n;
            int i12 = this.f6435o;
            if (z11) {
                ((c0.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.g(menuItem, c10, i12);
            }
            char c11 = this.f6436p;
            int i13 = this.f6437q;
            if (z11) {
                ((c0.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z11) {
                    ((c0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    j.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList == null) {
                return;
            }
            if (z11) {
                ((c0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                j.i(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f6413e = r0
            f6414f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.f6417c = context;
        Object[] objArr = {context};
        this.f6415a = objArr;
        this.f6416b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        char c10;
        char c11;
        int i10;
        boolean z9;
        h0.b bVar;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar2 = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException(com.ironsource.adapters.ironsource.a.g("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z11 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            str = null;
                            z11 = false;
                            eventType = xmlResourceParser.next();
                        } else if (name2.equals("group")) {
                            bVar2.f6423b = 0;
                            bVar2.f6424c = 0;
                            bVar2.f6425d = 0;
                            bVar2.f6426e = 0;
                            bVar2.f6427f = true;
                            bVar2.f6428g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar2.f6429h) {
                                h0.b bVar3 = bVar2.f6444z;
                                if (bVar3 == null || !bVar3.a()) {
                                    bVar2.f6429h = true;
                                    bVar2.b(bVar2.f6422a.add(bVar2.f6423b, bVar2.f6430i, bVar2.f6431j, bVar2.k));
                                } else {
                                    bVar2.f6429h = true;
                                    bVar2.b(bVar2.f6422a.addSubMenu(bVar2.f6423b, bVar2.f6430i, bVar2.f6431j, bVar2.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlResourceParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.f6417c.obtainStyledAttributes(attributeSet2, y3.a.u);
                        bVar2.f6423b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f6424c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.f6425d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.f6426e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f6427f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f6428g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = f.this.f6417c;
                        i1 i1Var = new i1(context, context.obtainStyledAttributes(attributeSet2, y3.a.f13039v));
                        bVar2.f6430i = i1Var.i(2, 0);
                        bVar2.f6431j = (i1Var.h(5, bVar2.f6424c) & -65536) | (i1Var.h(6, bVar2.f6425d) & 65535);
                        bVar2.k = i1Var.k(7);
                        bVar2.f6432l = i1Var.k(8);
                        bVar2.f6433m = i1Var.i(0, 0);
                        String j10 = i1Var.j(9);
                        if (j10 == null) {
                            c10 = 0;
                        } else {
                            c10 = j10.charAt(0);
                        }
                        bVar2.f6434n = c10;
                        bVar2.f6435o = i1Var.h(16, 4096);
                        String j11 = i1Var.j(10);
                        if (j11 == null) {
                            c11 = 0;
                        } else {
                            c11 = j11.charAt(0);
                        }
                        bVar2.f6436p = c11;
                        bVar2.f6437q = i1Var.h(20, 4096);
                        if (i1Var.l(11)) {
                            i10 = i1Var.a(11, false);
                        } else {
                            i10 = bVar2.f6426e;
                        }
                        bVar2.f6438r = i10;
                        bVar2.f6439s = i1Var.a(3, false);
                        bVar2.f6440t = i1Var.a(4, bVar2.f6427f);
                        bVar2.u = i1Var.a(1, bVar2.f6428g);
                        bVar2.f6441v = i1Var.h(21, -1);
                        bVar2.f6443y = i1Var.j(12);
                        bVar2.w = i1Var.i(13, 0);
                        bVar2.f6442x = i1Var.j(15);
                        String j12 = i1Var.j(14);
                        if (j12 != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9 && bVar2.w == 0 && bVar2.f6442x == null) {
                            bVar = (h0.b) bVar2.a(j12, f6414f, f.this.f6416b);
                        } else {
                            if (z9) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar = null;
                        }
                        bVar2.f6444z = bVar;
                        bVar2.A = i1Var.k(17);
                        bVar2.B = i1Var.k(22);
                        if (i1Var.l(19)) {
                            bVar2.D = o0.b(i1Var.h(19, -1), bVar2.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar2.D = null;
                        }
                        if (i1Var.l(18)) {
                            colorStateList = i1Var.b(18);
                        }
                        bVar2.C = colorStateList;
                        i1Var.n();
                        bVar2.f6429h = false;
                    } else {
                        if (name3.equals("menu")) {
                            bVar2.f6429h = true;
                            SubMenu addSubMenu = bVar2.f6422a.addSubMenu(bVar2.f6423b, bVar2.f6430i, bVar2.f6431j, bVar2.k);
                            bVar2.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlResourceParser.next();
                    }
                }
                XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                eventType = xmlResourceParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof c0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f6417c.getResources().getLayout(i10);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}

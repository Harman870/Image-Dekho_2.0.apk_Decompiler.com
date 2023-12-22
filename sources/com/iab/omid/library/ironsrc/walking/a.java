package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f3606a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0035a> f3607b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f3608c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f3609d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f3610e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f3611f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f3612g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f3613h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f3614i;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a  reason: collision with other inner class name */
    public static class C0035a {

        /* renamed from: a  reason: collision with root package name */
        private final e f3615a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f3616b = new ArrayList<>();

        public C0035a(e eVar, String str) {
            this.f3615a = eVar;
            a(str);
        }

        public e a() {
            return this.f3615a;
        }

        public void a(String str) {
            this.f3616b.add(str);
        }

        public ArrayList<String> b() {
            return this.f3616b;
        }
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a10 = h.a(view);
            if (a10 != null) {
                return a10;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f3609d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        for (e a10 : aVar.d()) {
            a(a10, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = (View) eVar.c().get();
        if (view != null) {
            C0035a aVar2 = this.f3607b.get(view);
            if (aVar2 != null) {
                aVar2.a(aVar.getAdSessionId());
            } else {
                this.f3607b.put(view, new C0035a(eVar, aVar.getAdSessionId()));
            }
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f3613h.remove(view);
            return Boolean.FALSE;
        } else if (this.f3613h.containsKey(view)) {
            return this.f3613h.get(view);
        } else {
            Map<View, Boolean> map = this.f3613h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.f3608c.get(str);
    }

    public void a() {
        this.f3606a.clear();
        this.f3607b.clear();
        this.f3608c.clear();
        this.f3609d.clear();
        this.f3610e.clear();
        this.f3611f.clear();
        this.f3612g.clear();
        this.f3614i = false;
    }

    public String b(String str) {
        return this.f3612g.get(str);
    }

    public HashSet<String> b() {
        return this.f3611f;
    }

    public C0035a c(View view) {
        C0035a aVar = this.f3607b.get(view);
        if (aVar != null) {
            this.f3607b.remove(view);
        }
        return aVar;
    }

    public HashSet<String> c() {
        return this.f3610e;
    }

    public String d(View view) {
        if (this.f3606a.size() == 0) {
            return null;
        }
        String str = this.f3606a.get(view);
        if (str != null) {
            this.f3606a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f3614i = true;
    }

    public c e(View view) {
        return this.f3609d.contains(view) ? c.PARENT_VIEW : this.f3614i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        c c10 = c.c();
        if (c10 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a next : c10.a()) {
                View c11 = next.c();
                if (next.f()) {
                    String adSessionId = next.getAdSessionId();
                    if (c11 != null) {
                        String a10 = a(c11);
                        if (a10 == null) {
                            this.f3610e.add(adSessionId);
                            this.f3606a.put(c11, adSessionId);
                            a(next);
                        } else if (a10 != "noWindowFocus") {
                            this.f3611f.add(adSessionId);
                            this.f3608c.put(adSessionId, c11);
                            this.f3612g.put(adSessionId, a10);
                        }
                    } else {
                        this.f3611f.add(adSessionId);
                        this.f3612g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (!this.f3613h.containsKey(view)) {
            return true;
        }
        this.f3613h.put(view, Boolean.TRUE);
        return false;
    }
}

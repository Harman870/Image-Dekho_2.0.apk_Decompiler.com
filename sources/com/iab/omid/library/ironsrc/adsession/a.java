package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.h;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class a extends AdSession {

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f3510l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f3511a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f3512b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f3513c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f3514d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f3515e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3516f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3517g = false;

    /* renamed from: h  reason: collision with root package name */
    private final String f3518h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3519i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3520j;
    private PossibleObstructionListener k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f3512b = adSessionConfiguration;
        this.f3511a = adSessionContext;
        this.f3518h = UUID.randomUUID().toString();
        d((View) null);
        this.f3515e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f3515e.i();
        c.c().a(this);
        this.f3515e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f3519i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f3510l.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    private e b(View view) {
        for (e next : this.f3513c) {
            if (next.c().get() == view) {
                return next;
            }
        }
        return null;
    }

    private void b() {
        if (this.f3520j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> b10 = c.c().b();
        if (b10 != null && !b10.isEmpty()) {
            for (a next : b10) {
                if (next != this && next.c() == view) {
                    next.f3514d.clear();
                }
            }
        }
    }

    private void d(View view) {
        this.f3514d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.ironsrc.weakreference.a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.f3518h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f3520j = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f3517g) {
            a(view);
            a(str);
            if (b(view) == null) {
                this.f3513c.add(new e(view, friendlyObstructionPurpose, str));
            }
        }
    }

    public View c() {
        return (View) this.f3514d.get();
    }

    public List<e> d() {
        return this.f3513c;
    }

    public boolean e() {
        return this.k != null;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f3517g) {
            g.a((Object) errorType, "Error type is null");
            g.a(str, "Message is null");
            getAdSessionStatePublisher().a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public boolean f() {
        return this.f3516f && !this.f3517g;
    }

    public void finish() {
        if (!this.f3517g) {
            this.f3514d.clear();
            removeAllFriendlyObstructions();
            this.f3517g = true;
            getAdSessionStatePublisher().f();
            c.c().b(this);
            getAdSessionStatePublisher().b();
            this.f3515e = null;
            this.k = null;
        }
    }

    public boolean g() {
        return this.f3517g;
    }

    public String getAdSessionId() {
        return this.f3518h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f3515e;
    }

    public boolean h() {
        return this.f3512b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f3512b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f3516f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f3519i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f3520j = true;
    }

    public void registerAdView(View view) {
        if (!this.f3517g) {
            g.a((Object) view, "AdView is null");
            if (c() != view) {
                d(view);
                getAdSessionStatePublisher().a();
                c(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f3517g) {
            this.f3513c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f3517g) {
            a(view);
            e b10 = b(view);
            if (b10 != null) {
                this.f3513c.remove(b10);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    public void start() {
        if (!this.f3516f) {
            this.f3516f = true;
            c.c().c(this);
            this.f3515e.a(h.c().b());
            this.f3515e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
            this.f3515e.a(this, this.f3511a);
        }
    }
}

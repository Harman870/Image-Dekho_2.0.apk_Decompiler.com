package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.g;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import b.a;
import com.imgdkh.app.R;
import d1.b;
import h0.h;
import h0.k;
import j.b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import x.a;
import x.i;

public class ComponentActivity extends i implements f0, f, d1.d, o, g {

    /* renamed from: b  reason: collision with root package name */
    public final a.a f228b = new a.a();

    /* renamed from: c  reason: collision with root package name */
    public final h f229c = new h();

    /* renamed from: d  reason: collision with root package name */
    public final m f230d;

    /* renamed from: e  reason: collision with root package name */
    public final d1.c f231e;

    /* renamed from: f  reason: collision with root package name */
    public e0 f232f;

    /* renamed from: g  reason: collision with root package name */
    public final OnBackPressedDispatcher f233g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f234h;

    /* renamed from: i  reason: collision with root package name */
    public final b f235i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList<g0.a<Configuration>> f236j;
    public final CopyOnWriteArrayList<g0.a<Integer>> k;

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList<g0.a<Intent>> f237l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList<g0.a<z5.c>> f238m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<g0.a<z5.c>> f239n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f240o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f241p;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends androidx.activity.result.f {
        public b() {
        }

        public final void b(int i10, b.a aVar, Object obj) {
            String[] strArr;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0016a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new g(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                int i11 = x.a.f12762c;
                HashSet hashSet = new HashSet();
                int i12 = 0;
                while (i12 < stringArrayExtra.length) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i12])) {
                        if (!d0.a.a() && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                            hashSet.add(Integer.valueOf(i12));
                        }
                        i12++;
                    } else {
                        throw new IllegalArgumentException(e.c(f.g("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    }
                }
                int size = hashSet.size();
                if (size > 0) {
                    strArr = new String[(stringArrayExtra.length - size)];
                } else {
                    strArr = stringArrayExtra;
                }
                if (size > 0) {
                    if (size != stringArrayExtra.length) {
                        int i13 = 0;
                        for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                            if (!hashSet.contains(Integer.valueOf(i14))) {
                                strArr[i13] = stringArrayExtra[i14];
                                i13++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (componentActivity instanceof a.c) {
                    ((a.c) componentActivity).l();
                }
                a.b.b(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.h hVar = (androidx.activity.result.h) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = hVar.f309a;
                    Intent intent = hVar.f310b;
                    int i15 = hVar.f311c;
                    int i16 = hVar.f312d;
                    int i17 = x.a.f12762c;
                    a.C0165a.c(componentActivity, intentSender, i10, intent, i15, i16, 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new h(this, i10, e10));
                }
            } else {
                int i18 = x.a.f12762c;
                a.C0165a.b(componentActivity, a10, i10, bundle2);
            }
        }
    }

    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public e0 f247a;
    }

    public ComponentActivity() {
        boolean z9;
        b.C0076b bVar;
        m mVar = new m(this);
        this.f230d = mVar;
        d1.c cVar = new d1.c(this);
        this.f231e = cVar;
        this.f233g = new OnBackPressedDispatcher(new a());
        this.f234h = new AtomicInteger();
        this.f235i = new b();
        this.f236j = new CopyOnWriteArrayList<>();
        this.k = new CopyOnWriteArrayList<>();
        this.f237l = new CopyOnWriteArrayList<>();
        this.f238m = new CopyOnWriteArrayList<>();
        this.f239n = new CopyOnWriteArrayList<>();
        this.f240o = false;
        this.f241p = false;
        mVar.a(new j() {
            public final void b(l lVar, g.b bVar) {
                if (bVar == g.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        mVar.a(new j() {
            public final void b(l lVar, g.b bVar) {
                if (bVar == g.b.ON_DESTROY) {
                    ComponentActivity.this.f228b.f1b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.p().a();
                    }
                }
            }
        });
        mVar.a(new j() {
            public final void b(l lVar, g.b bVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f232f == null) {
                    d dVar = (d) componentActivity.getLastNonConfigurationInstance();
                    if (dVar != null) {
                        componentActivity.f232f = dVar.f247a;
                    }
                    if (componentActivity.f232f == null) {
                        componentActivity.f232f = new e0();
                    }
                }
                ComponentActivity.this.f230d.c(this);
            }
        });
        cVar.a();
        g.c cVar2 = mVar.f1744b;
        x8.f.e(cVar2, "lifecycle.currentState");
        if (cVar2 == g.c.INITIALIZED || cVar2 == g.c.CREATED) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            d1.b bVar2 = cVar.f6042b;
            bVar2.getClass();
            Iterator<Map.Entry<String, b.C0076b>> it = bVar2.f6037a.iterator();
            while (true) {
                b.e eVar = (b.e) it;
                if (!eVar.hasNext()) {
                    bVar = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) eVar.next();
                x8.f.e(entry, "components");
                bVar = (b.C0076b) entry.getValue();
                if (x8.f.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    break;
                }
            }
            if (bVar == null) {
                z zVar = new z(this.f231e.f6042b, this);
                this.f231e.f6042b.b("androidx.lifecycle.internal.SavedStateHandlesProvider", zVar);
                this.f230d.a(new SavedStateHandleAttacher(zVar));
            }
            this.f231e.f6042b.b("android:support:activity-result", new c(this, 0));
            u(new d(this, 0));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        v();
        super.addContentView(view, layoutParams);
    }

    public final OnBackPressedDispatcher b() {
        return this.f233g;
    }

    public final d1.b c() {
        return this.f231e.f6042b;
    }

    public final y0.a m() {
        y0.d dVar = new y0.d();
        if (getApplication() != null) {
            dVar.f13008a.put(c0.f1717a, getApplication());
        }
        dVar.f13008a.put(x.f1775a, this);
        dVar.f13008a.put(x.f1776b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.f13008a.put(x.f1777c, getIntent().getExtras());
        }
        return dVar;
    }

    public final androidx.activity.result.f o() {
        return this.f235i;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f235i.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        this.f233g.b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<g0.a<Configuration>> it = this.f236j.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f231e.b(bundle);
        a.a aVar = this.f228b;
        aVar.f1b = this;
        Iterator it = aVar.f0a.iterator();
        while (it.hasNext()) {
            ((a.b) it.next()).a();
        }
        super.onCreate(bundle);
        v.c(this);
        if (d0.a.a()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f233g;
            onBackPressedDispatcher.f253e = c.a(this);
            onBackPressedDispatcher.c();
        }
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        h hVar = this.f229c;
        getMenuInflater();
        Iterator<k> it = hVar.f6701a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<k> it = this.f229c.f6701a.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z9) {
        if (!this.f240o) {
            Iterator<g0.a<z5.c>> it = this.f238m.iterator();
            while (it.hasNext()) {
                it.next().accept(new z5.c());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z9, Configuration configuration) {
        this.f240o = true;
        try {
            super.onMultiWindowModeChanged(z9, configuration);
            this.f240o = false;
            Iterator<g0.a<z5.c>> it = this.f238m.iterator();
            while (it.hasNext()) {
                it.next().accept(new z5.c(0));
            }
        } catch (Throwable th) {
            this.f240o = false;
            throw th;
        }
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<g0.a<Intent>> it = this.f237l.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        Iterator<k> it = this.f229c.f6701a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        super.onPanelClosed(i10, menu);
    }

    public void onPictureInPictureModeChanged(boolean z9) {
        if (!this.f241p) {
            Iterator<g0.a<z5.c>> it = this.f239n.iterator();
            while (it.hasNext()) {
                it.next().accept(new z5.c());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        this.f241p = true;
        try {
            super.onPictureInPictureModeChanged(z9, configuration);
            this.f241p = false;
            Iterator<g0.a<z5.c>> it = this.f239n.iterator();
            while (it.hasNext()) {
                it.next().accept(new z5.c(0));
            }
        } catch (Throwable th) {
            this.f241p = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator<k> it = this.f229c.f6701a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f235i.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        e0 e0Var = this.f232f;
        if (e0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            e0Var = dVar.f247a;
        }
        if (e0Var == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f247a = e0Var;
        return dVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        m mVar = this.f230d;
        if (mVar instanceof m) {
            g.c cVar = g.c.CREATED;
            mVar.e("setCurrentState");
            mVar.g(cVar);
        }
        super.onSaveInstanceState(bundle);
        this.f231e.c(bundle);
    }

    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<g0.a<Integer>> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public final e0 p() {
        if (getApplication() != null) {
            if (this.f232f == null) {
                d dVar = (d) getLastNonConfigurationInstance();
                if (dVar != null) {
                    this.f232f = dVar.f247a;
                }
                if (this.f232f == null) {
                    this.f232f = new e0();
                }
            }
            return this.f232f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final m r() {
        return this.f230d;
    }

    public final void reportFullyDrawn() {
        try {
            if (f1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i10) {
        v();
        super.setContentView(i10);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        v();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        v();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public final void u(a.b bVar) {
        a.a aVar = this.f228b;
        if (aVar.f1b != null) {
            bVar.a();
        }
        aVar.f0a.add(bVar);
    }

    public final void v() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        x8.f.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView2 = getWindow().getDecorView();
        x8.f.f(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }
}

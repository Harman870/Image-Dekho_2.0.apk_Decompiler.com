package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.y;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f249a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<k> f250b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public l f251c;

    /* renamed from: d  reason: collision with root package name */
    public OnBackInvokedCallback f252d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f253e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f254f = false;

    public class LifecycleOnBackPressedCancellable implements j, a {

        /* renamed from: a  reason: collision with root package name */
        public final g f255a;

        /* renamed from: b  reason: collision with root package name */
        public final k f256b;

        /* renamed from: c  reason: collision with root package name */
        public b f257c;

        public LifecycleOnBackPressedCancellable(g gVar, y.a aVar) {
            this.f255a = gVar;
            this.f256b = aVar;
            gVar.a(this);
        }

        public final void b(l lVar, g.b bVar) {
            if (bVar == g.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                k kVar = this.f256b;
                onBackPressedDispatcher.f250b.add(kVar);
                b bVar2 = new b(kVar);
                kVar.f278b.add(bVar2);
                if (d0.a.a()) {
                    onBackPressedDispatcher.c();
                    kVar.f279c = onBackPressedDispatcher.f251c;
                }
                this.f257c = bVar2;
            } else if (bVar == g.b.ON_STOP) {
                b bVar3 = this.f257c;
                if (bVar3 != null) {
                    bVar3.cancel();
                }
            } else if (bVar == g.b.ON_DESTROY) {
                cancel();
            }
        }

        public final void cancel() {
            this.f255a.c(this);
            this.f256b.f278b.remove(this);
            b bVar = this.f257c;
            if (bVar != null) {
                bVar.cancel();
                this.f257c = null;
            }
        }
    }

    public static class a {
        public static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new n(runnable);
        }

        public static void b(Object obj, int i10, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final k f259a;

        public b(k kVar) {
            this.f259a = kVar;
        }

        public final void cancel() {
            OnBackPressedDispatcher.this.f250b.remove(this.f259a);
            this.f259a.f278b.remove(this);
            if (d0.a.a()) {
                this.f259a.f279c = null;
                OnBackPressedDispatcher.this.c();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f249a = runnable;
        if (d0.a.a()) {
            this.f251c = new l(this);
            this.f252d = a.a(new m(0, this));
        }
    }

    @SuppressLint({"LambdaLast"})
    public final void a(l lVar, y.a aVar) {
        m r4 = lVar.r();
        if (r4.f1744b != g.c.DESTROYED) {
            aVar.f278b.add(new LifecycleOnBackPressedCancellable(r4, aVar));
            if (d0.a.a()) {
                c();
                aVar.f279c = this.f251c;
            }
        }
    }

    public final void b() {
        Iterator<k> descendingIterator = this.f250b.descendingIterator();
        while (descendingIterator.hasNext()) {
            k next = descendingIterator.next();
            if (next.f277a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f249a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z9;
        Iterator<k> descendingIterator = this.f250b.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (descendingIterator.next().f277a) {
                    z9 = true;
                    break;
                }
            } else {
                z9 = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f253e;
        if (onBackInvokedDispatcher == null) {
            return;
        }
        if (z9 && !this.f254f) {
            a.b(onBackInvokedDispatcher, 0, this.f252d);
            this.f254f = true;
        } else if (!z9 && this.f254f) {
            a.c(onBackInvokedDispatcher, this.f252d);
            this.f254f = false;
        }
    }
}

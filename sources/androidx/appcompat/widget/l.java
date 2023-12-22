package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.f;
import c6.b;
import com.google.android.gms.common.api.Status;
import com.imgdkh.app.R;
import h6.b0;
import i4.ab;
import i4.fg;
import i4.j3;
import i4.lf;
import i4.m;
import i4.mf;
import i4.og;
import i4.q;
import i4.qe;
import i4.r1;
import i4.te;
import i4.wg;
import i4.xf;
import i4.ze;
import i6.h;
import j4.c0;
import j4.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.w;
import n4.i;
import n4.k3;
import n4.n3;
import n4.t3;
import n4.w7;
import r3.o;
import s0.a;
import s0.e;
import s0.g;
import u1.t;
import y0.c;
import y3.a;

public final class l implements fg, c0, k3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f843a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f844b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f845c;

    public l(Context context) {
        this.f843a = 1;
        o.h(context);
        Resources resources = context.getResources();
        this.f844b = resources;
        this.f845c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public static l i() {
        int i10 = mf.f7495a;
        qe qeVar = new qe(Pattern.compile("[.-]"));
        Matcher matcher = qeVar.f7623a.matcher("");
        matcher.getClass();
        if (!matcher.matches()) {
            return new l((r1) new c((Object) qeVar));
        }
        throw new IllegalArgumentException(j3.d("The pattern may not match the empty string: %s", qeVar));
    }

    public final o.c a(p pVar) {
        ((o.c) this.f844b).e((String) this.f845c, pVar);
        return (o.c) this.f844b;
    }

    /* JADX INFO: finally extract failed */
    public final void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        i iVar;
        w7 w7Var = (w7) this.f845c;
        w7Var.d().g();
        w7Var.g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (SQLiteException e10) {
                w7Var.a().f9828f.b("Database error while trying to delete uploaded bundles", e10);
                ((a) w7Var.c()).getClass();
                w7Var.f10295o = SystemClock.elapsedRealtime();
                w7Var.a().f9835n.b("Disable upload, time", Long.valueOf(w7Var.f10295o));
            } catch (Throwable th2) {
                w7Var.f10300t = false;
                w7Var.A();
                throw th2;
            }
        }
        ArrayList arrayList = w7Var.f10302x;
        o.h(arrayList);
        w7Var.f10302x = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            w7Var.a().f9835n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
            t3 t3Var = w7Var.f10290i.f9704h;
            ((a) w7Var.c()).getClass();
            t3Var.b(System.currentTimeMillis());
            if (i10 == 503 || i10 == 429) {
                t3 t3Var2 = w7Var.f10290i.f9702f;
                ((a) w7Var.c()).getClass();
                t3Var2.b(System.currentTimeMillis());
            }
            i iVar2 = w7Var.f10284c;
            w7.H(iVar2);
            iVar2.O(arrayList);
            w7Var.C();
            w7Var.f10300t = false;
            w7Var.A();
        }
        if (th == null) {
            t3 t3Var3 = w7Var.f10290i.f9703g;
            ((a) w7Var.c()).getClass();
            t3Var3.b(System.currentTimeMillis());
            w7Var.f10290i.f9704h.b(0);
            w7Var.C();
            w7Var.a().f9835n.c("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
            i iVar3 = w7Var.f10284c;
            w7.H(iVar3);
            iVar3.M();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l6 = (Long) it.next();
                    try {
                        iVar = w7Var.f10284c;
                        w7.H(iVar);
                        long longValue = l6.longValue();
                        iVar.g();
                        iVar.h();
                        if (iVar.z().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e11) {
                        iVar.f9600a.a().f9828f.b("Failed to delete a bundle in a queue table", e11);
                        throw e11;
                    } catch (SQLiteException e12) {
                        ArrayList arrayList2 = w7Var.f10303y;
                        if (arrayList2 == null || !arrayList2.contains(l6)) {
                            throw e12;
                        }
                    }
                }
                i iVar4 = w7Var.f10284c;
                w7.H(iVar4);
                iVar4.l();
                i iVar5 = w7Var.f10284c;
                w7.H(iVar5);
                iVar5.N();
                w7Var.f10303y = null;
                n3 n3Var = w7Var.f10283b;
                w7.H(n3Var);
                if (!n3Var.k() || !w7Var.E()) {
                    w7Var.f10304z = -1;
                    w7Var.C();
                } else {
                    w7Var.t();
                }
                w7Var.f10295o = 0;
                w7Var.f10300t = false;
                w7Var.A();
            } catch (Throwable th3) {
                i iVar6 = w7Var.f10284c;
                w7.H(iVar6);
                iVar6.N();
                throw th3;
            }
        }
        w7Var.a().f9835n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
        t3 t3Var4 = w7Var.f10290i.f9704h;
        ((a) w7Var.c()).getClass();
        t3Var4.b(System.currentTimeMillis());
        t3 t3Var22 = w7Var.f10290i.f9702f;
        ((a) w7Var.c()).getClass();
        t3Var22.b(System.currentTimeMillis());
        i iVar22 = w7Var.f10284c;
        w7.H(iVar22);
        iVar22.O(arrayList);
        w7Var.C();
        w7Var.f10300t = false;
        w7Var.A();
    }

    public final void c(xf xfVar) {
        switch (this.f843a) {
            case 3:
                og ogVar = (og) xfVar;
                if (!TextUtils.isEmpty(ogVar.f7575f)) {
                    ((w) this.f844b).e(new te(ogVar.f7575f, ogVar.f7574e, (b0) null));
                    return;
                }
                ((t) this.f845c).e(new wg(ogVar.f7571b, ogVar.f7570a, Long.valueOf(ogVar.f7573d), "Bearer"), (String) null, (String) null, Boolean.valueOf(ogVar.f7572c), (b0) null, (w) this.f844b, this);
                return;
            default:
                q qVar = (q) xfVar;
                if (!TextUtils.isEmpty(qVar.f7604e)) {
                    Status status = new Status(17025, (String) null);
                    w wVar = ((ze) this.f845c).f7847b;
                    h6.q qVar2 = new h6.q((String) null, (String) null, false, qVar.f7605f, true, qVar.f7604e, (String) null);
                    wVar.getClass();
                    try {
                        ((lf) wVar.f9573a).a(status, qVar2);
                        return;
                    } catch (RemoteException e10) {
                        ((u3.a) wVar.f9574b).b("RemoteException when sending failure result.", e10, new Object[0]);
                        return;
                    }
                } else {
                    ((ze) this.f845c).f7848c.e(new wg(qVar.f7601b, qVar.f7600a, Long.valueOf(qVar.f7602c), "Bearer"), (String) null, "phone", Boolean.valueOf(qVar.f7603d), (b0) null, ((ze) this.f845c).f7847b, (fg) this.f844b);
                    return;
                }
        }
    }

    public final KeyListener d(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((s0.a) this.f845c).f11800a.getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new e(keyListener);
    }

    public final String e(String str) {
        int identifier = ((Resources) this.f844b).getIdentifier(str, "string", (String) this.f845c);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f844b).getString(identifier);
    }

    /* JADX INFO: finally extract failed */
    public final void f(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f844b).getContext().obtainStyledAttributes(attributeSet, a.f13031m, i10, 0);
        try {
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z9 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            h(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection g(InputConnection inputConnection, EditorInfo editorInfo) {
        s0.a aVar = (s0.a) this.f845c;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0138a aVar2 = aVar.f11800a;
        aVar2.getClass();
        if (inputConnection instanceof s0.c) {
            return inputConnection;
        }
        return new s0.c(aVar2.f11801a, inputConnection, editorInfo);
    }

    public final void h(boolean z9) {
        g gVar = ((s0.a) this.f845c).f11800a.f11802b;
        if (gVar.f11822d != z9) {
            if (gVar.f11821c != null) {
                f a10 = f.a();
                g.a aVar = gVar.f11821c;
                a10.getClass();
                b.o(aVar, "initCallback cannot be null");
                a10.f1344a.writeLock().lock();
                try {
                    a10.f1345b.remove(aVar);
                } finally {
                    a10.f1344a.writeLock().unlock();
                }
            }
            gVar.f11822d = z9;
            if (z9) {
                g.a(gVar.f11819a, f.a().b());
            }
        }
    }

    public final List j(CharSequence charSequence) {
        charSequence.getClass();
        m b10 = ((r1) this.f845c).b(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (b10.hasNext()) {
            arrayList.add((String) b10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void zza(String str) {
        switch (this.f843a) {
            case 3:
                ((w) this.f844b).f(h.a(str));
                return;
            default:
                ((fg) this.f844b).zza(str);
                return;
        }
    }

    public l(EditText editText) {
        this.f843a = 0;
        this.f844b = editText;
        this.f845c = new s0.a(editText);
    }

    public l(r1 r1Var) {
        this.f843a = 2;
        ab abVar = ab.f7189o;
        this.f845c = r1Var;
        this.f844b = abVar;
    }

    public /* synthetic */ l(Object obj, int i10, Object obj2) {
        this.f843a = i10;
        this.f845c = obj;
        this.f844b = obj2;
    }

    public l(o.c cVar, String str) {
        this.f843a = 5;
        this.f844b = cVar;
        this.f845c = str;
    }
}

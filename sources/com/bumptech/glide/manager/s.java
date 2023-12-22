package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.bumptech.glide.b;
import java.util.HashSet;

public class s extends o {
    public final a T;
    public final a U = new a();
    public final HashSet V = new HashSet();
    public s W;
    public com.bumptech.glide.o X;
    public o Y;

    public class a implements o {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + s.this + "}";
        }
    }

    public s() {
        a aVar = new a();
        this.T = aVar;
    }

    public final void C(Context context) {
        super.C(context);
        o oVar = this;
        while (true) {
            o oVar2 = oVar.f1581v;
            if (oVar2 == null) {
                break;
            }
            oVar = oVar2;
        }
        y yVar = oVar.f1579s;
        if (yVar != null) {
            try {
                b0(l(), yVar);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void F() {
        this.D = true;
        this.T.a();
        s sVar = this.W;
        if (sVar != null) {
            sVar.V.remove(this);
            this.W = null;
        }
    }

    public final void H() {
        this.D = true;
        this.Y = null;
        s sVar = this.W;
        if (sVar != null) {
            sVar.V.remove(this);
            this.W = null;
        }
    }

    public final void L() {
        this.D = true;
        this.T.b();
    }

    public final void M() {
        this.D = true;
        this.T.c();
    }

    public final void b0(Context context, y yVar) {
        s sVar = this.W;
        if (sVar != null) {
            sVar.V.remove(this);
            this.W = null;
        }
        s i10 = b.b(context).f2550e.i(yVar, (o) null);
        this.W = i10;
        if (!equals(i10)) {
            this.W.V.add(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        o oVar = this.f1581v;
        if (oVar == null) {
            oVar = this.Y;
        }
        sb.append(oVar);
        sb.append("}");
        return sb.toString();
    }
}

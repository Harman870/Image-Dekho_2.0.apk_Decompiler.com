package com.bumptech.glide;

import com.bumptech.glide.p;
import h2.a;
import j2.l;

public abstract class p<CHILD extends p<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public a.C0094a f2674a = a.f6877a;

    /* renamed from: b */
    public final CHILD clone() {
        try {
            return (p) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return l.b(this.f2674a, ((p) obj).f2674a);
        }
        return false;
    }

    public int hashCode() {
        a.C0094a aVar = this.f2674a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }
}

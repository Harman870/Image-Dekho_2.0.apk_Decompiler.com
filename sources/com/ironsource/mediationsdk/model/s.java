package com.ironsource.mediationsdk.model;

import x8.f;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public String f4805a = null;

    public final String a() {
        return this.f4805a;
    }

    public final void a(String str) {
        this.f4805a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && f.a(this.f4805a, ((s) obj).f4805a);
    }

    public final int hashCode() {
        String str = this.f4805a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f4805a + ')';
    }
}

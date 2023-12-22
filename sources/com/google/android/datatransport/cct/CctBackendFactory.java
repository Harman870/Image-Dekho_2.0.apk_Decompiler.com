package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import x2.d;
import x2.h;
import x2.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new u2.d(hVar.a(), hVar.d(), hVar.c());
    }
}

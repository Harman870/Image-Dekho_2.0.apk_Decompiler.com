package com.google.android.material.carousel;

import android.view.animation.LinearInterpolator;
import com.google.android.material.carousel.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s4.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f3037a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f3038b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f3039c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f3040d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f3041e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3042f;

    /* renamed from: g  reason: collision with root package name */
    public final float f3043g;

    public b(a aVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f3037a = aVar;
        this.f3038b = Collections.unmodifiableList(arrayList);
        this.f3039c = Collections.unmodifiableList(arrayList2);
        float f10 = ((a) arrayList.get(arrayList.size() - 1)).b().f3033a - aVar.b().f3033a;
        this.f3042f = f10;
        float f11 = aVar.d().f3033a - ((a) arrayList2.get(arrayList2.size() - 1)).d().f3033a;
        this.f3043g = f11;
        this.f3040d = a(f10, arrayList, true);
        this.f3041e = a(f11, arrayList2, false);
    }

    public static float[] a(float f10, ArrayList arrayList, boolean z9) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            a aVar = (a) arrayList.get(i11);
            a aVar2 = (a) arrayList.get(i10);
            fArr[i10] = i10 == size + -1 ? 1.0f : fArr[i11] + ((z9 ? aVar2.b().f3033a - aVar.b().f3033a : aVar.d().f3033a - aVar2.d().f3033a) / f10);
            i10++;
        }
        return fArr;
    }

    public static a b(List<a> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                float a10 = a.a(0.0f, 1.0f, f11, f12, f10);
                a aVar = list.get(i10 - 1);
                a aVar2 = list.get(i10);
                if (aVar.f3022a == aVar2.f3022a) {
                    List<a.b> list2 = aVar.f3023b;
                    List<a.b> list3 = aVar2.f3023b;
                    if (list2.size() == list3.size()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < aVar.f3023b.size(); i11++) {
                            a.b bVar = list2.get(i11);
                            a.b bVar2 = list3.get(i11);
                            float f13 = bVar.f3033a;
                            float f14 = bVar2.f3033a;
                            LinearInterpolator linearInterpolator = s4.a.f11855a;
                            float e10 = com.ironsource.adapters.ironsource.a.e(f14, f13, a10, f13);
                            float f15 = bVar.f3034b;
                            float e11 = com.ironsource.adapters.ironsource.a.e(bVar2.f3034b, f15, a10, f15);
                            float f16 = bVar.f3035c;
                            float e12 = com.ironsource.adapters.ironsource.a.e(bVar2.f3035c, f16, a10, f16);
                            float f17 = bVar.f3036d;
                            arrayList.add(new a.b(e10, e11, e12, com.ironsource.adapters.ironsource.a.e(bVar2.f3036d, f17, a10, f17)));
                        }
                        int i12 = aVar.f3024c;
                        int round = Math.round(((float) (aVar2.f3024c - i12)) * a10) + i12;
                        int i13 = aVar.f3025d;
                        return new a(aVar.f3022a, arrayList, round, Math.round(a10 * ((float) (aVar2.f3025d - i13))) + i13);
                    }
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
            }
            i10++;
            f11 = f12;
        }
        return list.get(0);
    }

    public static a c(a aVar, int i10, int i11, float f10, int i12, int i13) {
        boolean z9;
        ArrayList arrayList = new ArrayList(aVar.f3023b);
        arrayList.add(i11, (a.b) arrayList.remove(i10));
        a.C0025a aVar2 = new a.C0025a(aVar.f3022a);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            a.b bVar = (a.b) arrayList.get(i14);
            float f11 = bVar.f3036d;
            float f12 = (f11 / 2.0f) + f10;
            if (i14 < i12 || i14 > i13) {
                z9 = false;
            } else {
                z9 = true;
            }
            aVar2.a(f12, bVar.f3035c, f11, z9);
            f10 += bVar.f3036d;
        }
        return aVar2.b();
    }
}

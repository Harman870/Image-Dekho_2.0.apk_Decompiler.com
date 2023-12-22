package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f3022a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f3023b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3024c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3025d;

    /* renamed from: com.google.android.material.carousel.a$a  reason: collision with other inner class name */
    public static final class C0025a {

        /* renamed from: a  reason: collision with root package name */
        public final float f3026a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f3027b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public b f3028c;

        /* renamed from: d  reason: collision with root package name */
        public b f3029d;

        /* renamed from: e  reason: collision with root package name */
        public int f3030e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3031f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f3032g = 0.0f;

        public C0025a(float f10) {
            this.f3026a = f10;
        }

        public final void a(float f10, float f11, float f12, boolean z9) {
            if (f12 > 0.0f) {
                b bVar = new b(Float.MIN_VALUE, f10, f11, f12);
                b bVar2 = this.f3028c;
                if (z9) {
                    if (bVar2 == null) {
                        this.f3028c = bVar;
                        this.f3030e = this.f3027b.size();
                    }
                    if (this.f3031f != -1 && this.f3027b.size() - this.f3031f > 1) {
                        throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                    } else if (f12 == this.f3028c.f3036d) {
                        this.f3029d = bVar;
                        this.f3031f = this.f3027b.size();
                    } else {
                        throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                    }
                } else if (bVar2 == null && f12 < this.f3032g) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                } else if (this.f3029d != null && f12 > this.f3032g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
                this.f3032g = f12;
                this.f3027b.add(bVar);
            }
        }

        public final a b() {
            if (this.f3028c != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f3027b.size(); i10++) {
                    b bVar = (b) this.f3027b.get(i10);
                    float f10 = this.f3028c.f3034b;
                    float f11 = this.f3026a;
                    arrayList.add(new b((((float) i10) * f11) + (f10 - (((float) this.f3030e) * f11)), bVar.f3034b, bVar.f3035c, bVar.f3036d));
                }
                return new a(this.f3026a, arrayList, this.f3030e, this.f3031f);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f3033a;

        /* renamed from: b  reason: collision with root package name */
        public final float f3034b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3035c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3036d;

        public b(float f10, float f11, float f12, float f13) {
            this.f3033a = f10;
            this.f3034b = f11;
            this.f3035c = f12;
            this.f3036d = f13;
        }
    }

    public a(float f10, ArrayList arrayList, int i10, int i11) {
        this.f3022a = f10;
        this.f3023b = Collections.unmodifiableList(arrayList);
        this.f3024c = i10;
        this.f3025d = i11;
    }

    public final b a() {
        return this.f3023b.get(this.f3024c);
    }

    public final b b() {
        return this.f3023b.get(0);
    }

    public final b c() {
        return this.f3023b.get(this.f3025d);
    }

    public final b d() {
        List<b> list = this.f3023b;
        return list.get(list.size() - 1);
    }
}

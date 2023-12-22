package com.google.android.material.carousel;

import android.view.View;
import androidx.activity.f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.a;
import com.imgdkh.app.R;

public final class c extends androidx.activity.result.c {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3044b = {1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3045c = {1, 0};

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3046a;

        /* renamed from: b  reason: collision with root package name */
        public float f3047b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3048c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3049d;

        /* renamed from: e  reason: collision with root package name */
        public float f3050e;

        /* renamed from: f  reason: collision with root package name */
        public float f3051f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3052g;

        /* renamed from: h  reason: collision with root package name */
        public final float f3053h;

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
            if (r10 > r5.f3047b) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
            if (r5.f3051f <= r5.f3047b) goto L_0x00b4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(int r6, float r7, float r8, float r9, int r10, float r11, int r12, float r13, int r14, float r15) {
            /*
                r5 = this;
                r5.<init>()
                r5.f3046a = r6
                int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x000b
                r7 = r8
                goto L_0x0010
            L_0x000b:
                int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0010
                r7 = r9
            L_0x0010:
                r5.f3047b = r7
                r5.f3048c = r10
                r5.f3050e = r11
                r5.f3049d = r12
                r5.f3051f = r13
                r5.f3052g = r14
                float r0 = (float) r14
                float r1 = r0 * r13
                float r2 = (float) r12
                float r11 = r11 * r2
                float r11 = r11 + r1
                float r1 = (float) r10
                float r3 = r1 * r7
                float r3 = r3 + r11
                float r11 = r15 - r3
                r3 = 0
                if (r10 <= 0) goto L_0x0036
                int r4 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r4 <= 0) goto L_0x0036
                float r11 = r11 / r1
                float r9 = r9 - r7
                float r8 = java.lang.Math.min(r11, r9)
                goto L_0x0042
            L_0x0036:
                if (r10 <= 0) goto L_0x0045
                int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r9 >= 0) goto L_0x0045
                float r11 = r11 / r1
                float r8 = r8 - r7
                float r8 = java.lang.Math.max(r11, r8)
            L_0x0042:
                float r8 = r8 + r7
                r5.f3047b = r8
            L_0x0045:
                float r7 = r5.f3047b
                if (r10 <= 0) goto L_0x004b
                r8 = r7
                goto L_0x004c
            L_0x004b:
                r8 = r3
            L_0x004c:
                r9 = 1073741824(0x40000000, float:2.0)
                float r11 = r2 / r9
                float r1 = r1 + r11
                float r1 = r1 * r8
                float r15 = r15 - r1
                float r11 = r11 + r0
                float r15 = r15 / r11
                r5.f3051f = r15
                float r7 = r7 + r15
                float r7 = r7 / r9
                r5.f3050e = r7
                if (r12 <= 0) goto L_0x0090
                int r8 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r8 == 0) goto L_0x0090
                float r8 = r13 - r15
                float r8 = r8 * r0
                r9 = 1036831949(0x3dcccccd, float:0.1)
                float r7 = r7 * r9
                float r7 = r7 * r2
                float r9 = java.lang.Math.abs(r8)
                float r7 = java.lang.Math.min(r9, r7)
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 <= 0) goto L_0x0083
                float r8 = r5.f3050e
                float r9 = r7 / r2
                float r8 = r8 - r9
                r5.f3050e = r8
                float r8 = r5.f3051f
                float r7 = r7 / r0
                float r7 = r7 + r8
                r5.f3051f = r7
                goto L_0x0090
            L_0x0083:
                float r8 = r5.f3050e
                float r9 = r7 / r2
                float r9 = r9 + r8
                r5.f3050e = r9
                float r8 = r5.f3051f
                float r7 = r7 / r0
                float r8 = r8 - r7
                r5.f3051f = r8
            L_0x0090:
                r7 = 0
                r8 = 1
                if (r14 <= 0) goto L_0x00a7
                if (r10 <= 0) goto L_0x00a7
                if (r12 <= 0) goto L_0x00a7
                float r9 = r5.f3051f
                float r10 = r5.f3050e
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00b4
                float r9 = r5.f3047b
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x00b4
                goto L_0x00b3
            L_0x00a7:
                if (r14 <= 0) goto L_0x00b5
                if (r10 <= 0) goto L_0x00b5
                float r9 = r5.f3051f
                float r10 = r5.f3047b
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00b4
            L_0x00b3:
                r7 = r8
            L_0x00b4:
                r8 = r7
            L_0x00b5:
                if (r8 != 0) goto L_0x00bb
                r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
                goto L_0x00c4
            L_0x00bb:
                float r7 = r5.f3051f
                float r13 = r13 - r7
                float r7 = java.lang.Math.abs(r13)
                float r6 = (float) r6
                float r6 = r6 * r7
            L_0x00c4:
                r5.f3053h = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.c.a.<init>(int, float, float, float, int, float, int, float, int, float):void");
        }

        public final String toString() {
            StringBuilder g10 = f.g("Arrangement [priority=");
            g10.append(this.f3046a);
            g10.append(", smallCount=");
            g10.append(this.f3048c);
            g10.append(", smallSize=");
            g10.append(this.f3047b);
            g10.append(", mediumCount=");
            g10.append(this.f3049d);
            g10.append(", mediumSize=");
            g10.append(this.f3050e);
            g10.append(", largeCount=");
            g10.append(this.f3052g);
            g10.append(", largeSize=");
            g10.append(this.f3051f);
            g10.append(", cost=");
            g10.append(this.f3053h);
            g10.append("]");
            return g10.toString();
        }
    }

    public c() {
        super(0);
    }

    public final a j(z4.a aVar, View view) {
        float f10;
        int i10;
        CarouselLayoutManager carouselLayoutManager;
        float f11;
        float f12;
        float f13;
        CarouselLayoutManager carouselLayoutManager2;
        CarouselLayoutManager carouselLayoutManager3 = (CarouselLayoutManager) aVar;
        float f14 = (float) carouselLayoutManager3.f1878n;
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        float f15 = (float) (mVar.leftMargin + mVar.rightMargin);
        float dimension = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f15;
        float dimension2 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f15;
        float measuredWidth = (float) view.getMeasuredWidth();
        float min = Math.min(measuredWidth + f15, f14);
        float f16 = (measuredWidth / 3.0f) + f15;
        float dimension3 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f15;
        float dimension4 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f15;
        if (f16 < dimension3) {
            f10 = dimension3;
        } else if (f16 > dimension4) {
            f10 = dimension4;
        } else {
            f10 = f16;
        }
        float f17 = (min + f10) / 2.0f;
        int[] iArr = f3044b;
        int[] iArr2 = f3045c;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MIN_VALUE;
        for (int i14 : iArr2) {
            if (i14 > i13) {
                i13 = i14;
            }
        }
        float f18 = f14 - (((float) i13) * f17);
        int i15 = 0;
        while (true) {
            i10 = 1;
            if (i15 >= 1) {
                break;
            }
            int i16 = iArr[i15];
            if (i16 > i11) {
                i11 = i16;
            }
            i15++;
        }
        int ceil = (int) Math.ceil((double) (f14 / min));
        int max = (ceil - ((int) Math.max(1.0d, Math.floor((double) ((f18 - (((float) i11) * dimension2)) / min))))) + 1;
        int[] iArr3 = new int[max];
        for (int i17 = 0; i17 < max; i17++) {
            iArr3[i17] = ceil - i17;
        }
        a aVar2 = null;
        int i18 = 1;
        int i19 = 0;
        loop3:
        while (true) {
            float f19 = 0.0f;
            if (i19 >= max) {
                carouselLayoutManager = carouselLayoutManager3;
                f11 = 0.0f;
                f12 = f15;
                break;
            }
            int i20 = iArr3[i19];
            int length = iArr2.length;
            int i21 = i12;
            while (i21 < length) {
                int i22 = iArr2[i21];
                int i23 = i18;
                a aVar3 = aVar2;
                int i24 = i12;
                while (i24 < i10) {
                    carouselLayoutManager = carouselLayoutManager3;
                    int i25 = i24;
                    f12 = f15;
                    a aVar4 = aVar3;
                    int i26 = i21;
                    int i27 = length;
                    float f20 = dimension;
                    float f21 = dimension;
                    f11 = f19;
                    int i28 = i19;
                    int[] iArr4 = iArr3;
                    int i29 = max;
                    int[] iArr5 = iArr2;
                    a aVar5 = new a(i23, f10, f20, dimension2, iArr[i24], f17, i22, min, i20, f14);
                    if (aVar4 != null && aVar5.f3053h >= aVar4.f3053h) {
                        aVar3 = aVar4;
                    } else if (aVar5.f3053h == f11) {
                        aVar2 = aVar5;
                        break loop3;
                    } else {
                        aVar3 = aVar5;
                    }
                    i23++;
                    i24 = i25 + 1;
                    carouselLayoutManager3 = carouselLayoutManager;
                    f19 = f11;
                    iArr3 = iArr4;
                    f15 = f12;
                    i21 = i26;
                    length = i27;
                    dimension = f21;
                    i19 = i28;
                    max = i29;
                    iArr2 = iArr5;
                    i10 = 1;
                }
                CarouselLayoutManager carouselLayoutManager4 = carouselLayoutManager3;
                int i30 = length;
                int i31 = i19;
                int[] iArr6 = iArr3;
                int i32 = max;
                int[] iArr7 = iArr2;
                float f22 = dimension;
                float f23 = f19;
                i21++;
                aVar2 = aVar3;
                i18 = i23;
                f15 = f15;
                dimension = f22;
                i10 = 1;
                i12 = 0;
            }
            CarouselLayoutManager carouselLayoutManager5 = carouselLayoutManager3;
            int[] iArr8 = iArr3;
            int i33 = max;
            int[] iArr9 = iArr2;
            float f24 = f15;
            float f25 = dimension;
            i19++;
            i10 = 1;
            i12 = 0;
        }
        float dimension5 = view.getContext().getResources().getDimension(R.dimen.m3_carousel_gone_size) + f12;
        float f26 = dimension5 / 2.0f;
        float f27 = f11 - f26;
        float f28 = (aVar2.f3051f / 2.0f) + f11;
        float f29 = aVar2.f3051f;
        float max2 = (((float) Math.max(0, aVar2.f3052g - 1)) * f29) + f28;
        float f30 = (f29 / 2.0f) + max2;
        int i34 = aVar2.f3049d;
        if (i34 > 0) {
            max2 = (aVar2.f3050e / 2.0f) + f30;
        }
        if (i34 > 0) {
            f30 = (aVar2.f3050e / 2.0f) + max2;
        }
        if (aVar2.f3048c > 0) {
            f13 = (aVar2.f3047b / 2.0f) + f30;
            carouselLayoutManager2 = carouselLayoutManager;
        } else {
            carouselLayoutManager2 = carouselLayoutManager;
            f13 = max2;
        }
        float f31 = f26 + ((float) carouselLayoutManager2.f1878n);
        float f32 = 1.0f - ((dimension5 - f12) / (f29 - f12));
        float f33 = 1.0f - ((aVar2.f3047b - f12) / (f29 - f12));
        float f34 = 1.0f - ((aVar2.f3050e - f12) / (f29 - f12));
        a.C0025a aVar6 = new a.C0025a(f29);
        aVar6.a(f27, f32, dimension5, false);
        float f35 = aVar2.f3051f;
        int i35 = aVar2.f3052g;
        if (i35 > 0 && f35 > f11) {
            for (int i36 = 0; i36 < i35; i36++) {
                aVar6.a((((float) i36) * f35) + f28, f11, f35, true);
            }
        }
        if (aVar2.f3049d > 0) {
            aVar6.a(max2, f34, aVar2.f3050e, false);
        }
        int i37 = aVar2.f3048c;
        if (i37 > 0) {
            float f36 = aVar2.f3047b;
            if (i37 > 0 && f36 > f11) {
                for (int i38 = 0; i38 < i37; i38++) {
                    aVar6.a((((float) i38) * f36) + f13, f33, f36, false);
                }
            }
        }
        aVar6.a(f31, f32, dimension5, false);
        return aVar6.b();
    }
}

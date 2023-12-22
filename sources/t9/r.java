package t9;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;

public final class r extends AbstractList<h> implements RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f12069c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final h[] f12070a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12071b;

    public r(h[] hVarArr, int[] iArr) {
        this.f12070a = hVarArr;
        this.f12071b = iArr;
    }

    public static void a(long j10, e eVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        e eVar2;
        e eVar3 = eVar;
        int i18 = i10;
        ArrayList arrayList3 = arrayList;
        int i19 = i11;
        int i20 = i12;
        ArrayList arrayList4 = arrayList2;
        if (i19 < i20) {
            int i21 = i19;
            while (i21 < i20) {
                if (((h) arrayList3.get(i21)).j() >= i18) {
                    i21++;
                } else {
                    throw new AssertionError();
                }
            }
            h hVar = (h) arrayList.get(i11);
            h hVar2 = (h) arrayList3.get(i20 - 1);
            if (i18 == hVar.j()) {
                int intValue = ((Integer) arrayList4.get(i19)).intValue();
                int i22 = i19 + 1;
                i13 = i22;
                i14 = intValue;
                hVar = (h) arrayList3.get(i22);
            } else {
                i14 = -1;
                i13 = i19;
            }
            long j11 = 4;
            if (hVar.e(i18) != hVar2.e(i18)) {
                int i23 = 1;
                for (int i24 = i13 + 1; i24 < i20; i24++) {
                    if (((h) arrayList3.get(i24 - 1)).e(i18) != ((h) arrayList3.get(i24)).e(i18)) {
                        i23++;
                    }
                }
                long j12 = j10 + ((long) ((int) (eVar3.f12045b / 4))) + 2 + ((long) (i23 * 2));
                eVar3.U(i23);
                eVar3.U(i14);
                for (int i25 = i13; i25 < i20; i25++) {
                    byte e10 = ((h) arrayList3.get(i25)).e(i18);
                    if (i25 == i13 || e10 != ((h) arrayList3.get(i25 - 1)).e(i18)) {
                        eVar3.U(e10 & 255);
                    }
                }
                e eVar4 = new e();
                int i26 = i13;
                while (i26 < i20) {
                    byte e11 = ((h) arrayList3.get(i26)).e(i18);
                    int i27 = i26 + 1;
                    int i28 = i27;
                    while (true) {
                        if (i28 >= i20) {
                            i16 = i20;
                            break;
                        } else if (e11 != ((h) arrayList3.get(i28)).e(i18)) {
                            i16 = i28;
                            break;
                        } else {
                            i28++;
                        }
                    }
                    if (i27 == i16 && i18 + 1 == ((h) arrayList3.get(i26)).j()) {
                        eVar3.U(((Integer) arrayList4.get(i26)).intValue());
                        i17 = i16;
                        eVar2 = eVar4;
                    } else {
                        eVar3.U((int) ((((long) ((int) (eVar4.f12045b / j11))) + j12) * -1));
                        i17 = i16;
                        eVar2 = eVar4;
                        a(j12, eVar4, i18 + 1, arrayList, i26, i16, arrayList2);
                    }
                    eVar4 = eVar2;
                    i26 = i17;
                    j11 = 4;
                }
                e eVar5 = eVar4;
                eVar3.g(eVar5, eVar5.f12045b);
                return;
            }
            int i29 = 0;
            int min = Math.min(hVar.j(), hVar2.j());
            int i30 = i18;
            while (i30 < min && hVar.e(i30) == hVar2.e(i30)) {
                i29++;
                i30++;
            }
            long j13 = 1 + j10 + ((long) ((int) (eVar3.f12045b / 4))) + 2 + ((long) i29);
            eVar3.U(-i29);
            eVar3.U(i14);
            int i31 = i18;
            while (true) {
                i15 = i18 + i29;
                if (i31 >= i15) {
                    break;
                }
                eVar3.U(hVar.e(i31) & 255);
                i31++;
            }
            if (i13 + 1 != i20) {
                e eVar6 = new e();
                eVar3.U((int) ((((long) ((int) (eVar6.f12045b / 4))) + j13) * -1));
                a(j13, eVar6, i15, arrayList, i13, i12, arrayList2);
                eVar3.g(eVar6, eVar6.f12045b);
            } else if (i15 == ((h) arrayList3.get(i13)).j()) {
                eVar3.U(((Integer) arrayList4.get(i13)).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public final Object get(int i10) {
        return this.f12070a[i10];
    }

    public final int size() {
        return this.f12070a.length;
    }
}

package androidx.recyclerview.widget;

import androidx.recyclerview.widget.p;
import g0.e;
import java.util.ArrayList;

public final class a implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public e f1999a = new e(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2000b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2001c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final C0014a f2002d;

    /* renamed from: e  reason: collision with root package name */
    public final p f2003e;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0014a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2004a;

        /* renamed from: b  reason: collision with root package name */
        public int f2005b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2006c;

        /* renamed from: d  reason: collision with root package name */
        public int f2007d;

        public b(Object obj, int i10, int i11, int i12) {
            this.f2004a = i10;
            this.f2005b = i11;
            this.f2007d = i12;
            this.f2006c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f2004a;
            if (i10 != bVar.f2004a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f2007d - this.f2005b) == 1 && this.f2007d == bVar.f2005b && this.f2005b == bVar.f2007d) {
                return true;
            }
            if (this.f2007d != bVar.f2007d || this.f2005b != bVar.f2005b) {
                return false;
            }
            Object obj2 = this.f2006c;
            Object obj3 = bVar.f2006c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f2004a * 31) + this.f2005b) * 31) + this.f2007d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i10 = this.f2004a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 == 4) {
                str = "up";
            } else if (i10 != 8) {
                str = "??";
            } else {
                str = "mv";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f2005b);
            sb.append("c:");
            sb.append(this.f2007d);
            sb.append(",p:");
            sb.append(this.f2006c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(w wVar) {
        this.f2002d = wVar;
        this.f2003e = new p(this);
    }

    public final boolean a(int i10) {
        int size = this.f2001c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2001c.get(i11);
            int i12 = bVar.f2004a;
            if (i12 == 8) {
                if (f(bVar.f2007d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f2005b;
                int i14 = bVar.f2007d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        int size = this.f2001c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((w) this.f2002d).a(this.f2001c.get(i10));
        }
        l(this.f2001c);
    }

    public final void c() {
        b();
        int size = this.f2000b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2000b.get(i10);
            int i11 = bVar.f2004a;
            if (i11 == 1) {
                ((w) this.f2002d).a(bVar);
                ((w) this.f2002d).d(bVar.f2005b, bVar.f2007d);
            } else if (i11 == 2) {
                ((w) this.f2002d).a(bVar);
                C0014a aVar = this.f2002d;
                int i12 = bVar.f2005b;
                int i13 = bVar.f2007d;
                w wVar = (w) aVar;
                wVar.f2147a.N(i12, i13, true);
                RecyclerView recyclerView = wVar.f2147a;
                recyclerView.f1843t0 = true;
                recyclerView.f1837q0.f1923c += i13;
            } else if (i11 == 4) {
                ((w) this.f2002d).a(bVar);
                ((w) this.f2002d).c(bVar.f2005b, bVar.f2007d, bVar.f2006c);
            } else if (i11 == 8) {
                ((w) this.f2002d).a(bVar);
                ((w) this.f2002d).e(bVar.f2005b, bVar.f2007d);
            }
        }
        l(this.f2000b);
    }

    public final void d(b bVar) {
        int i10;
        boolean z9;
        int i11 = bVar.f2004a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2 = m(bVar.f2005b, i11);
        int i12 = bVar.f2005b;
        int i13 = bVar.f2004a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f2007d; i15++) {
            int m8 = m((i10 * i15) + bVar.f2005b, bVar.f2004a);
            int i16 = bVar.f2004a;
            if (i16 == 2 ? m8 != m2 : !(i16 == 4 && m8 == m2 + 1)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                i14++;
            } else {
                b h10 = h(bVar.f2006c, i16, m2, i14);
                e(h10, i12);
                h10.f2006c = null;
                this.f1999a.a(h10);
                if (bVar.f2004a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                m2 = m8;
            }
        }
        Object obj = bVar.f2006c;
        bVar.f2006c = null;
        this.f1999a.a(bVar);
        if (i14 > 0) {
            b h11 = h(obj, bVar.f2004a, m2, i14);
            e(h11, i12);
            h11.f2006c = null;
            this.f1999a.a(h11);
        }
    }

    public final void e(b bVar, int i10) {
        ((w) this.f2002d).a(bVar);
        int i11 = bVar.f2004a;
        if (i11 == 2) {
            C0014a aVar = this.f2002d;
            int i12 = bVar.f2007d;
            w wVar = (w) aVar;
            wVar.f2147a.N(i10, i12, true);
            RecyclerView recyclerView = wVar.f2147a;
            recyclerView.f1843t0 = true;
            recyclerView.f1837q0.f1923c += i12;
        } else if (i11 == 4) {
            ((w) this.f2002d).c(i10, bVar.f2007d, bVar.f2006c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i10, int i11) {
        int size = this.f2001c.size();
        while (i11 < size) {
            b bVar = this.f2001c.get(i11);
            int i12 = bVar.f2004a;
            if (i12 == 8) {
                int i13 = bVar.f2005b;
                if (i13 == i10) {
                    i10 = bVar.f2007d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f2007d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f2005b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f2007d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f2007d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f2000b.size() > 0;
    }

    public final b h(Object obj, int i10, int i11, int i12) {
        b bVar = (b) this.f1999a.b();
        if (bVar == null) {
            return new b(obj, i10, i11, i12);
        }
        bVar.f2004a = i10;
        bVar.f2005b = i11;
        bVar.f2007d = i12;
        bVar.f2006c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f2001c.add(bVar);
        int i10 = bVar.f2004a;
        if (i10 == 1) {
            ((w) this.f2002d).d(bVar.f2005b, bVar.f2007d);
        } else if (i10 == 2) {
            C0014a aVar = this.f2002d;
            w wVar = (w) aVar;
            wVar.f2147a.N(bVar.f2005b, bVar.f2007d, false);
            wVar.f2147a.f1843t0 = true;
        } else if (i10 == 4) {
            ((w) this.f2002d).c(bVar.f2005b, bVar.f2007d, bVar.f2006c);
        } else if (i10 == 8) {
            ((w) this.f2002d).e(bVar.f2005b, bVar.f2007d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0164, code lost:
        if (r5 > r12.f2005b) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018e, code lost:
        if (r5 >= r12.f2005b) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.p r1 = r0.f2003e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f2000b
            r1.getClass()
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f2004a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01d6
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f2004a
            if (r13 == r4) goto L_0x01ac
            if (r13 == r9) goto L_0x00b1
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f2007d
            int r8 = r12.f2005b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f2005b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f2007d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f2007d = r9
            androidx.recyclerview.widget.p$a r5 = r1.f2139a
            int r8 = r11.f2005b
            java.lang.Object r9 = r12.f2006c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.a) r5
            androidx.recyclerview.widget.a$b r4 = r5.h(r9, r6, r8, r4)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f2005b
            int r8 = r12.f2005b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f2005b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f2007d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0088
            int r8 = r8 - r5
            androidx.recyclerview.widget.p$a r9 = r1.f2139a
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f2006c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.a) r9
            androidx.recyclerview.widget.a$b r5 = r9.h(r13, r6, r5, r8)
            int r6 = r12.f2007d
            int r6 = r6 - r8
            r12.f2007d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r2.set(r7, r11)
            int r6 = r12.f2007d
            if (r6 <= 0) goto L_0x0094
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x0094:
            r2.remove(r3)
            androidx.recyclerview.widget.p$a r6 = r1.f2139a
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.a) r6
            r6.getClass()
            r12.f2006c = r10
            g0.e r6 = r6.f1999a
            r6.a(r12)
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r2.add(r3, r4)
        L_0x00aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r3, r5)
            goto L_0x0009
        L_0x00b1:
            int r6 = r11.f2005b
            int r8 = r11.f2007d
            int r13 = r12.f2005b
            if (r6 >= r8) goto L_0x00c6
            if (r13 != r6) goto L_0x00c4
            int r14 = r12.f2007d
            int r6 = r8 - r6
            if (r14 != r6) goto L_0x00c4
            r5 = r4
            r6 = 0
            goto L_0x00d4
        L_0x00c4:
            r5 = 0
            goto L_0x00d0
        L_0x00c6:
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00d2
            int r14 = r12.f2007d
            int r6 = r6 - r8
            if (r14 != r6) goto L_0x00d2
            r5 = r4
        L_0x00d0:
            r6 = r5
            goto L_0x00d4
        L_0x00d2:
            r6 = r4
            r5 = 0
        L_0x00d4:
            if (r8 >= r13) goto L_0x00db
            int r13 = r13 + -1
            r12.f2005b = r13
            goto L_0x00ff
        L_0x00db:
            int r14 = r12.f2007d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x00ff
            int r14 = r14 + -1
            r12.f2007d = r14
            r11.f2004a = r9
            r11.f2007d = r4
            int r3 = r12.f2007d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.p$a r3 = r1.f2139a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            r3.getClass()
            r12.f2006c = r10
            g0.e r3 = r3.f1999a
            r3.a(r12)
            goto L_0x0009
        L_0x00ff:
            int r4 = r11.f2005b
            int r8 = r12.f2005b
            if (r4 > r8) goto L_0x010a
            int r8 = r8 + 1
            r12.f2005b = r8
            goto L_0x0122
        L_0x010a:
            int r13 = r12.f2007d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0122
            int r8 = r8 - r4
            androidx.recyclerview.widget.p$a r13 = r1.f2139a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r4 = r13.h(r10, r9, r4, r8)
            int r8 = r11.f2005b
            int r9 = r12.f2005b
            int r8 = r8 - r9
            r12.f2007d = r8
            goto L_0x0123
        L_0x0122:
            r4 = r10
        L_0x0123:
            if (r5 == 0) goto L_0x013b
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.p$a r3 = r1.f2139a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            r3.getClass()
            r11.f2006c = r10
            g0.e r3 = r3.f1999a
            r3.a(r11)
            goto L_0x0009
        L_0x013b:
            if (r6 == 0) goto L_0x0167
            if (r4 == 0) goto L_0x0155
            int r5 = r11.f2005b
            int r6 = r4.f2005b
            if (r5 <= r6) goto L_0x014a
            int r6 = r4.f2007d
            int r5 = r5 - r6
            r11.f2005b = r5
        L_0x014a:
            int r5 = r11.f2007d
            int r6 = r4.f2005b
            if (r5 <= r6) goto L_0x0155
            int r6 = r4.f2007d
            int r5 = r5 - r6
            r11.f2007d = r5
        L_0x0155:
            int r5 = r11.f2005b
            int r6 = r12.f2005b
            if (r5 <= r6) goto L_0x0160
            int r6 = r12.f2007d
            int r5 = r5 - r6
            r11.f2005b = r5
        L_0x0160:
            int r5 = r11.f2007d
            int r6 = r12.f2005b
            if (r5 <= r6) goto L_0x0195
            goto L_0x0190
        L_0x0167:
            if (r4 == 0) goto L_0x017f
            int r5 = r11.f2005b
            int r6 = r4.f2005b
            if (r5 < r6) goto L_0x0174
            int r6 = r4.f2007d
            int r5 = r5 - r6
            r11.f2005b = r5
        L_0x0174:
            int r5 = r11.f2007d
            int r6 = r4.f2005b
            if (r5 < r6) goto L_0x017f
            int r6 = r4.f2007d
            int r5 = r5 - r6
            r11.f2007d = r5
        L_0x017f:
            int r5 = r11.f2005b
            int r6 = r12.f2005b
            if (r5 < r6) goto L_0x018a
            int r6 = r12.f2007d
            int r5 = r5 - r6
            r11.f2005b = r5
        L_0x018a:
            int r5 = r11.f2007d
            int r6 = r12.f2005b
            if (r5 < r6) goto L_0x0195
        L_0x0190:
            int r6 = r12.f2007d
            int r5 = r5 - r6
            r11.f2007d = r5
        L_0x0195:
            r2.set(r3, r12)
            int r5 = r11.f2005b
            int r6 = r11.f2007d
            if (r5 == r6) goto L_0x01a2
            r2.set(r7, r11)
            goto L_0x01a5
        L_0x01a2:
            r2.remove(r7)
        L_0x01a5:
            if (r4 == 0) goto L_0x0009
            r2.add(r3, r4)
            goto L_0x0009
        L_0x01ac:
            int r4 = r11.f2007d
            int r6 = r12.f2005b
            if (r4 >= r6) goto L_0x01b4
            r5 = r8
            goto L_0x01b5
        L_0x01b4:
            r5 = 0
        L_0x01b5:
            int r8 = r11.f2005b
            if (r8 >= r6) goto L_0x01bb
            int r5 = r5 + 1
        L_0x01bb:
            if (r6 > r8) goto L_0x01c2
            int r6 = r12.f2007d
            int r8 = r8 + r6
            r11.f2005b = r8
        L_0x01c2:
            int r6 = r12.f2005b
            if (r6 > r4) goto L_0x01cb
            int r8 = r12.f2007d
            int r4 = r4 + r8
            r11.f2007d = r4
        L_0x01cb:
            int r6 = r6 + r5
            r12.f2005b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01d6:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2000b
            int r1 = r1.size()
            r2 = 0
        L_0x01dd:
            if (r2 >= r1) goto L_0x02b2
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2000b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r11 = r3.f2004a
            if (r11 == r4) goto L_0x02ab
            if (r11 == r9) goto L_0x0251
            if (r11 == r6) goto L_0x01f8
            if (r11 == r7) goto L_0x01f3
            goto L_0x02ae
        L_0x01f3:
            r0.i(r3)
            goto L_0x02ae
        L_0x01f8:
            int r11 = r3.f2005b
            int r12 = r3.f2007d
            int r12 = r12 + r11
            r15 = r8
            r13 = r11
            r14 = 0
        L_0x0200:
            if (r11 >= r12) goto L_0x0234
            androidx.recyclerview.widget.a$a r5 = r0.f2002d
            androidx.recyclerview.widget.w r5 = (androidx.recyclerview.widget.w) r5
            androidx.recyclerview.widget.RecyclerView$z r5 = r5.b(r11)
            if (r5 != 0) goto L_0x0222
            boolean r5 = r0.a(r11)
            if (r5 == 0) goto L_0x0213
            goto L_0x0222
        L_0x0213:
            if (r15 != r4) goto L_0x0220
            java.lang.Object r5 = r3.f2006c
            androidx.recyclerview.widget.a$b r5 = r0.h(r5, r6, r13, r14)
            r0.i(r5)
            r13 = r11
            r14 = 0
        L_0x0220:
            r15 = 0
            goto L_0x0230
        L_0x0222:
            if (r15 != 0) goto L_0x022f
            java.lang.Object r5 = r3.f2006c
            androidx.recyclerview.widget.a$b r5 = r0.h(r5, r6, r13, r14)
            r0.d(r5)
            r13 = r11
            r14 = 0
        L_0x022f:
            r15 = r4
        L_0x0230:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x0200
        L_0x0234:
            int r5 = r3.f2007d
            if (r14 == r5) goto L_0x0245
            java.lang.Object r5 = r3.f2006c
            r3.f2006c = r10
            g0.e r11 = r0.f1999a
            r11.a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r5, r6, r13, r14)
        L_0x0245:
            if (r15 != 0) goto L_0x024c
            r0.d(r3)
            goto L_0x02ae
        L_0x024c:
            r0.i(r3)
            goto L_0x02ae
        L_0x0251:
            int r5 = r3.f2005b
            int r11 = r3.f2007d
            int r11 = r11 + r5
            r12 = r5
            r14 = r8
            r13 = 0
        L_0x0259:
            if (r12 >= r11) goto L_0x0292
            androidx.recyclerview.widget.a$a r15 = r0.f2002d
            androidx.recyclerview.widget.w r15 = (androidx.recyclerview.widget.w) r15
            androidx.recyclerview.widget.RecyclerView$z r15 = r15.b(r12)
            if (r15 != 0) goto L_0x027a
            boolean r15 = r0.a(r12)
            if (r15 == 0) goto L_0x026c
            goto L_0x027a
        L_0x026c:
            if (r14 != r4) goto L_0x0277
            androidx.recyclerview.widget.a$b r14 = r0.h(r10, r9, r5, r13)
            r0.i(r14)
            r14 = r4
            goto L_0x0278
        L_0x0277:
            r14 = 0
        L_0x0278:
            r15 = 0
            goto L_0x0287
        L_0x027a:
            if (r14 != 0) goto L_0x0285
            androidx.recyclerview.widget.a$b r14 = r0.h(r10, r9, r5, r13)
            r0.d(r14)
            r14 = r4
            goto L_0x0286
        L_0x0285:
            r14 = 0
        L_0x0286:
            r15 = r4
        L_0x0287:
            if (r14 == 0) goto L_0x028d
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = r4
            goto L_0x028f
        L_0x028d:
            int r13 = r13 + 1
        L_0x028f:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0259
        L_0x0292:
            int r11 = r3.f2007d
            if (r13 == r11) goto L_0x02a1
            r3.f2006c = r10
            g0.e r11 = r0.f1999a
            r11.a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r10, r9, r5, r13)
        L_0x02a1:
            if (r14 != 0) goto L_0x02a7
            r0.d(r3)
            goto L_0x02ae
        L_0x02a7:
            r0.i(r3)
            goto L_0x02ae
        L_0x02ab:
            r0.i(r3)
        L_0x02ae:
            int r2 = r2 + 1
            goto L_0x01dd
        L_0x02b2:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2000b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f2006c = null;
        this.f1999a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f2001c.size() - 1; size >= 0; size--) {
            b bVar = this.f2001c.get(size);
            int i18 = bVar.f2004a;
            if (i18 == 8) {
                int i19 = bVar.f2005b;
                int i20 = bVar.f2007d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f2005b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f2005b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f2007d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f2007d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f2005b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f2005b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f2005b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f2007d;
                } else if (i18 == 2) {
                    i10 += bVar.f2007d;
                }
            }
        }
        for (int size2 = this.f2001c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2001c.get(size2);
            if (bVar2.f2004a == 8) {
                int i22 = bVar2.f2007d;
                if (i22 != bVar2.f2005b && i22 >= 0) {
                }
            } else if (bVar2.f2007d > 0) {
            }
            this.f2001c.remove(size2);
            k(bVar2);
        }
        return i10;
    }
}

package f6;

import androidx.activity.e;
import j4.a6;
import j4.t5;
import j4.u5;
import j4.x5;
import j4.y5;
import z5.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a6 f6385a;

    /* renamed from: b  reason: collision with root package name */
    public static final a6 f6386b;

    /* renamed from: c  reason: collision with root package name */
    public static final a6 f6387c;

    static {
        int i10 = y5.f8565c;
        Object[] objArr = new Object[15];
        int i11 = 0;
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        y5.k(15, objArr);
        u5 u5Var = x5.f8551b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        int i12 = 0;
        while (i12 < 7) {
            if (objArr2[i12] != null) {
                i12++;
            } else {
                throw new NullPointerException(e.a("at index ", i12));
            }
        }
        f6385a = x5.j(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        int i13 = 0;
        while (i13 < 3) {
            if (objArr3[i13] != null) {
                i13++;
            } else {
                throw new NullPointerException(e.a("at index ", i13));
            }
        }
        f6386b = x5.j(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        int i14 = 0;
        while (i14 < 2) {
            if (objArr4[i14] != null) {
                i14++;
            } else {
                throw new NullPointerException(e.a("at index ", i14));
            }
        }
        f6387c = x5.j(2, objArr4);
        t5 t5Var = new t5();
        t5Var.a(c.f13183g);
        t5Var.a(c.f13184h);
        t5Var.f8439a = true;
        x5.j(t5Var.f8440b, (Object[]) t5Var.f8441c);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        while (i11 < 2) {
            if (objArr5[i11] != null) {
                i11++;
            } else {
                throw new NullPointerException(e.a("at index ", i11));
            }
        }
        x5.j(2, objArr5);
    }
}

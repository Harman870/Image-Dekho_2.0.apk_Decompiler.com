package p9;

import java.io.IOException;
import k9.e;
import t9.h;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final h f10735a = h.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f10736b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f10737c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f10738d = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f10738d;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = e.j("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f10737c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 < 1; i12++) {
            int i13 = iArr[i12];
            String[] strArr3 = f10737c;
            strArr3[i13 | 8] = androidx.activity.e.c(new StringBuilder(), strArr3[i13], "|PADDED");
        }
        String[] strArr4 = f10737c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < 1; i16++) {
                int i17 = iArr[i16];
                String[] strArr5 = f10737c;
                int i18 = i17 | i15;
                strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i17]);
                sb.append('|');
                strArr5[i18 | 8] = androidx.activity.e.c(sb, strArr5[i15], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f10737c;
            if (i10 < strArr6.length) {
                if (strArr6[i10] == null) {
                    strArr6[i10] = f10738d[i10];
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z9, int i10, int i11, byte b10, byte b11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String[] strArr = f10736b;
        if (b10 < strArr.length) {
            str = strArr[b10];
        } else {
            str = e.j("0x%02x", Byte.valueOf(b10));
        }
        if (b11 == 0) {
            str2 = "";
        } else {
            if (!(b10 == 2 || b10 == 3)) {
                if (b10 == 4 || b10 == 6) {
                    if (b11 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = f10738d[b11];
                    }
                } else if (!(b10 == 7 || b10 == 8)) {
                    String[] strArr2 = f10737c;
                    if (b11 < strArr2.length) {
                        str4 = strArr2[b11];
                    } else {
                        str4 = f10738d[b11];
                    }
                    if (b10 == 5 && (b11 & 4) != 0) {
                        str5 = "HEADERS";
                        str6 = "PUSH_PROMISE";
                    } else if (b10 != 0 || (b11 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str5 = "PRIORITY";
                        str6 = "COMPRESSED";
                    }
                    str2 = str4.replace(str5, str6);
                }
            }
            str2 = f10738d[b11];
        }
        Object[] objArr = new Object[5];
        if (z9) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        objArr[0] = str3;
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = str;
        objArr[4] = str2;
        return e.j("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static void b(String str, Object... objArr) {
        throw new IOException(e.j(str, objArr));
    }
}

package i4;

import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

public final class j3 implements md {
    public static String a(e0 e0Var) {
        String str;
        StringBuilder sb = new StringBuilder(e0Var.g());
        for (int i10 = 0; i10 < e0Var.g(); i10++) {
            int a10 = e0Var.a(i10);
            if (a10 == 34) {
                str = "\\\"";
            } else if (a10 == 39) {
                str = "\\'";
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a10 >>> 6) & 3) + 48));
                            sb.append((char) (((a10 >>> 3) & 7) + 48));
                            a10 = (a10 & 7) + 48;
                        }
                        sb.append((char) a10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean c(int i10) {
        Boolean bool;
        if (i10 - 1 != 0) {
            if (w5.a()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
                } catch (Exception unused) {
                    w5.f7760a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (!w5.a()) {
            return true;
        } else {
            return false;
        }
    }

    public static String d(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), e10);
                    str2 = "<" + str3 + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i11] = str2;
            i11++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                sb.append(str, i12, str.length());
            } else {
                sb.append(str, i12, indexOf);
                sb.append(objArr[i10]);
                i12 = indexOf + 2;
                i10++;
            }
        }
        sb.append(str, i12, str.length());
        if (i10 < length2) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}

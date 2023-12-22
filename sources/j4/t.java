package j4;

import androidx.fragment.app.w0;
import java.util.Iterator;

public final class t implements Iterable, p {

    /* renamed from: a  reason: collision with root package name */
    public final String f8469a;

    public t(String str) {
        if (str != null) {
            this.f8469a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final p a() {
        return new t(this.f8469a);
    }

    public final Double b() {
        double d10;
        if (this.f8469a.isEmpty()) {
            d10 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f8469a);
            } catch (NumberFormatException unused) {
                d10 = Double.NaN;
            }
        }
        return Double.valueOf(d10);
    }

    public final Iterator d() {
        return new r(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f8469a.equals(((t) obj).f8469a);
    }

    public final int hashCode() {
        return this.f8469a.hashCode();
    }

    public final Iterator iterator() {
        return new s(this);
    }

    public final Boolean k() {
        return Boolean.valueOf(!this.f8469a.isEmpty());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0174, code lost:
        j4.j4.h("toUpperCase", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0189, code lost:
        j4.j4.h("toUpperCase", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a0, code lost:
        r0 = r19;
        j4.j4.h("toString", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01aa, code lost:
        j4.j4.h("toLowerCase", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c2, code lost:
        j4.j4.h("toLocaleLowerCase", 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d8, code lost:
        j4.j4.h(r5, 0, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ed, code lost:
        r1 = r22;
        j4.j4.j("substring", 2, r1);
        r3 = r19.f8469a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fc, code lost:
        if (r22.isEmpty() != false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fe, code lost:
        r4 = r21;
        r2 = (int) j4.j4.a(r4.b((j4.p) r1.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0218, code lost:
        r4 = r21;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0220, code lost:
        if (r22.size() <= 1) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0222, code lost:
        r1 = (int) j4.j4.a(r4.b((j4.p) r1.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023a, code lost:
        r1 = r3.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023e, code lost:
        r2 = java.lang.Math.min(java.lang.Math.max(r2, 0), r3.length());
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r3.length());
        r4 = new j4.t(r3.substring(java.lang.Math.min(r2, r1), java.lang.Math.max(r2, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x026a, code lost:
        r0 = r19;
        r4 = r21;
        r1 = r22;
        j4.j4.j("split", 2, r1);
        r2 = r0.f8469a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x027a, code lost:
        if (r2.length() != 0) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x028d, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0297, code lost:
        if (r22.isEmpty() == false) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0299, code lost:
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x029e, code lost:
        r3 = r4.b((j4.p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b1, code lost:
        if (r22.size() <= 1) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b3, code lost:
        r6 = j4.j4.d(r4.b((j4.p) r1.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ca, code lost:
        r6 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d1, code lost:
        if (r6 != 0) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02da, code lost:
        r1 = r2.split(java.util.regex.Pattern.quote(r3), ((int) r6) + 1);
        r2 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ea, code lost:
        if (r3.isEmpty() == false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ec, code lost:
        if (r2 <= 0) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ee, code lost:
        r3 = r1[0].isEmpty();
        r4 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02fd, code lost:
        if (r1[r4].isEmpty() != false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0300, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0301, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0305, code lost:
        if (((long) r2) <= r6) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0307, code lost:
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0309, code lost:
        if (r3 >= r4) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030b, code lost:
        r5.add(new j4.t(r1[r3]));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x031f, code lost:
        r4 = r21;
        r1 = r22;
        j4.j4.j("slice", 2, r1);
        r2 = r19.f8469a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x032f, code lost:
        if (r22.isEmpty() != false) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0331, code lost:
        r5 = r4.b((j4.p) r1.get(0)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0345, code lost:
        r5 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0347, code lost:
        r5 = j4.j4.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034f, code lost:
        if (r5 >= 0.0d) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0351, code lost:
        r5 = java.lang.Math.max(((double) r2.length()) + r5, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035c, code lost:
        r5 = java.lang.Math.min(r5, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036a, code lost:
        if (r22.size() <= 1) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036c, code lost:
        r3 = r4.b((j4.p) r1.get(1)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037f, code lost:
        r3 = (double) r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0384, code lost:
        r3 = j4.j4.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x038c, code lost:
        if (r3 >= 0.0d) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x038e, code lost:
        r3 = java.lang.Math.max(((double) r2.length()) + r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0399, code lost:
        r3 = java.lang.Math.min(r3, (double) r2.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a2, code lost:
        r1 = (int) r5;
        r4 = new j4.t(r2.substring(r1, java.lang.Math.max(0, ((int) r3) - r1) + r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b6, code lost:
        r0 = r19;
        r4 = r21;
        r1 = r22;
        j4.j4.j("search", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c5, code lost:
        if (r22.isEmpty() != false) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c7, code lost:
        r16 = r4.b((j4.p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d5, code lost:
        r1 = java.util.regex.Pattern.compile(r16).matcher(r0.f8469a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03e3, code lost:
        if (r1.find() == false) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0402, code lost:
        r0 = r19;
        r4 = r21;
        r1 = r22;
        j4.j4.j("replace", 2, r1);
        r2 = j4.p.f8373c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0412, code lost:
        if (r22.isEmpty() != false) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0414, code lost:
        r16 = r4.b((j4.p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0428, code lost:
        if (r22.size() <= 1) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x042a, code lost:
        r2 = r4.b((j4.p) r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0434, code lost:
        r1 = r16;
        r3 = r0.f8469a;
        r5 = r3.indexOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x043c, code lost:
        if (r5 < 0) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0440, code lost:
        if ((r2 instanceof j4.j) == false) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0442, code lost:
        r2 = ((j4.j) r2).c(r4, java.util.Arrays.asList(new j4.p[]{new j4.t(r1), new j4.i(java.lang.Double.valueOf((double) r5)), r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0467, code lost:
        r4 = new j4.t(androidx.fragment.app.w0.d(r3.substring(0, r5), r2.zzi(), r3.substring(r1.length() + r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0485, code lost:
        r4 = r21;
        r1 = r22;
        j4.j4.j("match", 1, r1);
        r2 = r19.f8469a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0495, code lost:
        if (r22.size() > 0) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0497, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x049a, code lost:
        r1 = r4.b((j4.p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04a9, code lost:
        r1 = java.util.regex.Pattern.compile(r1).matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04b5, code lost:
        if (r1.find() == false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04d5, code lost:
        r4 = r21;
        r1 = r22;
        j4.j4.j("lastIndexOf", 2, r1);
        r5 = r19.f8469a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04e6, code lost:
        if (r22.size() > 0) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04e9, code lost:
        r16 = r4.b((j4.p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04f7, code lost:
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04fd, code lost:
        if (r22.size() >= 2) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04ff, code lost:
        r1 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0502, code lost:
        r1 = r4.b((j4.p) r1.get(1)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0519, code lost:
        if (java.lang.Double.isNaN(r1) == false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x051b, code lost:
        r1 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x051e, code lost:
        r1 = j4.j4.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0533, code lost:
        r4 = r21;
        r1 = r22;
        r5 = 0.0d;
        j4.j4.j("indexOf", 2, r1);
        r3 = r19.f8469a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0545, code lost:
        if (r22.size() > 0) goto L_0x0548;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0548, code lost:
        r16 = r4.b((j4.p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0557, code lost:
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x055d, code lost:
        if (r22.size() >= 2) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0560, code lost:
        r5 = r4.b((j4.p) r1.get(1)).b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0588, code lost:
        r1 = r22;
        j4.j4.h(r7, 1, r1);
        r2 = r19.f8469a;
        r1 = r21.b((j4.p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05a9, code lost:
        if ("length".equals(r1.zzi()) == false) goto L_0x05ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05ac, code lost:
        r3 = r1.b().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05ba, code lost:
        if (r3 != java.lang.Math.floor(r3)) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05bc, code lost:
        r1 = (int) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05bd, code lost:
        if (r1 < 0) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05c3, code lost:
        if (r1 >= r2.length()) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05cd, code lost:
        r0 = r19;
        r4 = r21;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05d7, code lost:
        if (r22.isEmpty() != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05d9, code lost:
        r2 = new java.lang.StringBuilder(r0.f8469a);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05e5, code lost:
        if (r3 >= r22.size()) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05e7, code lost:
        r2.append(r4.b((j4.p) r1.get(r3)).zzi());
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0608, code lost:
        r0 = r19;
        r4 = r21;
        r1 = r22;
        j4.j4.j(r6, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0616, code lost:
        if (r22.isEmpty() != false) goto L_0x0631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0618, code lost:
        r1 = (int) j4.j4.a(r4.b((j4.p) r1.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0631, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0632, code lost:
        r2 = r0.f8469a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0634, code lost:
        if (r1 < 0) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x063a, code lost:
        if (r1 < r2.length()) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return j4.p.f8380j0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return new j4.t(r19.f8469a.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return new j4.t(r19.f8469a.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return new j4.t(r19.f8469a.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return new j4.t(r19.f8469a.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return new j4.t(r19.f8469a.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return new j4.f(java.util.Arrays.asList(new j4.p[]{r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return new j4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return new j4.f(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return new j4.i(java.lang.Double.valueOf((double) r1.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return new j4.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return new j4.f(java.util.Arrays.asList(new j4.p[]{new j4.t(r1.group())}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return j4.p.f8374d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return new j4.i(java.lang.Double.valueOf((double) r5.lastIndexOf(r3, (int) r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return new j4.i(java.lang.Double.valueOf((double) r3.indexOf(r7, (int) j4.j4.a(r5))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return j4.p.f8378h0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return j4.p.f8379i0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        return new j4.t(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        return new j4.t(java.lang.String.valueOf(r2.charAt(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0130, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0152, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0155, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0164, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0165, code lost:
        r16 = "undefined";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0167, code lost:
        switch(r1) {
            case 0: goto L_0x0608;
            case 1: goto L_0x05cd;
            case 2: goto L_0x0588;
            case 3: goto L_0x0533;
            case 4: goto L_0x04d5;
            case 5: goto L_0x0485;
            case 6: goto L_0x0402;
            case 7: goto L_0x03b6;
            case 8: goto L_0x031f;
            case 9: goto L_0x026a;
            case 10: goto L_0x01ed;
            case 11: goto L_0x01d8;
            case 12: goto L_0x01c2;
            case 13: goto L_0x01aa;
            case 14: goto L_0x01a0;
            case 15: goto L_0x0189;
            case 16: goto L_0x0174;
            default: goto L_0x016a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016a, code lost:
        r0 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0173, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.p l(java.lang.String r20, o.c r21, java.util.ArrayList r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "trim"
            java.lang.String r7 = "concat"
            java.lang.String r8 = "indexOf"
            java.lang.String r9 = "replace"
            java.lang.String r10 = "substring"
            java.lang.String r11 = "split"
            java.lang.String r12 = "slice"
            java.lang.String r13 = "match"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "toLocaleUpperCase"
            java.lang.String r2 = "search"
            java.lang.String r0 = "toLowerCase"
            java.lang.String r3 = "toLocaleLowerCase"
            r16 = r4
            java.lang.String r4 = "toString"
            r17 = r6
            java.lang.String r6 = "hasOwnProperty"
            r18 = r15
            java.lang.String r15 = "toUpperCase"
            if (r5 != 0) goto L_0x00af
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00af
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00b1
            r18 = r6
            r6 = r17
            boolean r17 = r6.equals(r1)
            if (r17 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            r5 = r18
        L_0x00b1:
            r18 = r6
            r6 = r17
        L_0x00b5:
            int r17 = r20.hashCode()
            switch(r17) {
                case -1789698943: goto L_0x0158;
                case -1776922004: goto L_0x0148;
                case -1464939364: goto L_0x013d;
                case -1361633751: goto L_0x0133;
                case -1354795244: goto L_0x0129;
                case -1137582698: goto L_0x0120;
                case -906336856: goto L_0x0118;
                case -726908483: goto L_0x010f;
                case -467511597: goto L_0x0107;
                case -399551817: goto L_0x00fe;
                case 3568674: goto L_0x00f5;
                case 103668165: goto L_0x00ed;
                case 109526418: goto L_0x00e4;
                case 109648666: goto L_0x00db;
                case 530542161: goto L_0x00d2;
                case 1094496948: goto L_0x00c9;
                case 1943291465: goto L_0x00c0;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            r6 = r16
            goto L_0x0155
        L_0x00c0:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00bc
            r1 = 3
            goto L_0x0130
        L_0x00c9:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00bc
            r1 = 6
            goto L_0x0130
        L_0x00d2:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00bc
            r1 = 10
            goto L_0x0130
        L_0x00db:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00bc
            r1 = 9
            goto L_0x0130
        L_0x00e4:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00bc
            r1 = 8
            goto L_0x0130
        L_0x00ed:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00bc
            r1 = 5
            goto L_0x0130
        L_0x00f5:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00bc
            r1 = 16
            goto L_0x0130
        L_0x00fe:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00bc
            r1 = 15
            goto L_0x0130
        L_0x0107:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00bc
            r1 = 4
            goto L_0x0130
        L_0x010f:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00bc
            r1 = 11
            goto L_0x0130
        L_0x0118:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00bc
            r1 = 7
            goto L_0x0130
        L_0x0120:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00bc
            r1 = 13
            goto L_0x0130
        L_0x0129:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00bc
            r1 = 1
        L_0x0130:
            r6 = r16
            goto L_0x0152
        L_0x0133:
            r6 = r16
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0155
            r1 = 0
            goto L_0x0152
        L_0x013d:
            r6 = r16
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0155
            r1 = 12
            goto L_0x0152
        L_0x0148:
            r6 = r16
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0155
            r1 = 14
        L_0x0152:
            r7 = r18
            goto L_0x0165
        L_0x0155:
            r7 = r18
            goto L_0x0164
        L_0x0158:
            r6 = r16
            r7 = r18
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0164
            r1 = 2
            goto L_0x0165
        L_0x0164:
            r1 = -1
        L_0x0165:
            java.lang.String r16 = "undefined"
            switch(r1) {
                case 0: goto L_0x0608;
                case 1: goto L_0x05cd;
                case 2: goto L_0x0588;
                case 3: goto L_0x0533;
                case 4: goto L_0x04d5;
                case 5: goto L_0x0485;
                case 6: goto L_0x0402;
                case 7: goto L_0x03b6;
                case 8: goto L_0x031f;
                case 9: goto L_0x026a;
                case 10: goto L_0x01ed;
                case 11: goto L_0x01d8;
                case 12: goto L_0x01c2;
                case 13: goto L_0x01aa;
                case 14: goto L_0x01a0;
                case 15: goto L_0x0189;
                case 16: goto L_0x0174;
                default: goto L_0x016a;
            }
        L_0x016a:
            r0 = r19
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L_0x0174:
            r0 = 0
            r1 = r22
            j4.j4.h(r15, r0, r1)
            r0 = r19
            java.lang.String r1 = r0.f8469a
            j4.t r2 = new j4.t
            java.lang.String r1 = r1.trim()
            r2.<init>(r1)
            goto L_0x064e
        L_0x0189:
            r0 = r19
            r1 = r22
            r2 = 0
            j4.j4.h(r15, r2, r1)
            java.lang.String r1 = r0.f8469a
            j4.t r2 = new j4.t
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r3)
            r2.<init>(r1)
            goto L_0x064e
        L_0x01a0:
            r0 = r19
            r1 = r22
            r2 = 0
            j4.j4.h(r4, r2, r1)
            goto L_0x0606
        L_0x01aa:
            r1 = r22
            r2 = r0
            r0 = r19
            r3 = 0
            j4.j4.h(r2, r3, r1)
            java.lang.String r1 = r0.f8469a
            j4.t r2 = new j4.t
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r3)
            r2.<init>(r1)
            goto L_0x064e
        L_0x01c2:
            r0 = r19
            r1 = r22
            r2 = r3
            r3 = 0
            j4.j4.h(r2, r3, r1)
            java.lang.String r1 = r0.f8469a
            j4.t r2 = new j4.t
            java.lang.String r1 = r1.toLowerCase()
            r2.<init>(r1)
            goto L_0x064e
        L_0x01d8:
            r0 = r19
            r1 = r22
            r2 = 0
            j4.j4.h(r5, r2, r1)
            java.lang.String r1 = r0.f8469a
            j4.t r2 = new j4.t
            java.lang.String r1 = r1.toUpperCase()
            r2.<init>(r1)
            goto L_0x064e
        L_0x01ed:
            r0 = r19
            r1 = r22
            r2 = 0
            r3 = 2
            j4.j4.j(r10, r3, r1)
            java.lang.String r3 = r0.f8469a
            boolean r4 = r22.isEmpty()
            if (r4 != 0) goto L_0x0218
            java.lang.Object r2 = r1.get(r2)
            j4.p r2 = (j4.p) r2
            r4 = r21
            j4.p r2 = r4.b(r2)
            java.lang.Double r2 = r2.b()
            double r5 = r2.doubleValue()
            double r5 = j4.j4.a(r5)
            int r2 = (int) r5
            goto L_0x021b
        L_0x0218:
            r4 = r21
            r2 = 0
        L_0x021b:
            int r5 = r22.size()
            r6 = 1
            if (r5 <= r6) goto L_0x023a
            java.lang.Object r1 = r1.get(r6)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.Double r1 = r1.b()
            double r4 = r1.doubleValue()
            double r4 = j4.j4.a(r4)
            int r1 = (int) r4
            goto L_0x023e
        L_0x023a:
            int r1 = r3.length()
        L_0x023e:
            r4 = 0
            int r2 = java.lang.Math.max(r2, r4)
            int r5 = r3.length()
            int r2 = java.lang.Math.min(r2, r5)
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = r3.length()
            int r1 = java.lang.Math.min(r1, r4)
            j4.t r4 = new j4.t
            int r5 = java.lang.Math.min(r2, r1)
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.String r1 = r3.substring(r5, r1)
            r4.<init>(r1)
            goto L_0x0482
        L_0x026a:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 2
            j4.j4.j(r11, r2, r1)
            java.lang.String r2 = r0.f8469a
            int r3 = r2.length()
            if (r3 != 0) goto L_0x028d
            j4.f r2 = new j4.f
            r1 = 1
            j4.p[] r1 = new j4.p[r1]
            r3 = 0
            r1[r3] = r0
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
            goto L_0x064e
        L_0x028d:
            r3 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r22.isEmpty()
            if (r6 == 0) goto L_0x029e
            r5.add(r0)
            goto L_0x0318
        L_0x029e:
            java.lang.Object r3 = r1.get(r3)
            j4.p r3 = (j4.p) r3
            j4.p r3 = r4.b(r3)
            java.lang.String r3 = r3.zzi()
            int r6 = r22.size()
            r7 = 1
            if (r6 <= r7) goto L_0x02ca
            java.lang.Object r1 = r1.get(r7)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.Double r1 = r1.b()
            double r6 = r1.doubleValue()
            long r6 = j4.j4.d(r6)
            goto L_0x02cd
        L_0x02ca:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02cd:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x02da
            j4.f r2 = new j4.f
            r2.<init>()
            goto L_0x064e
        L_0x02da:
            java.lang.String r1 = java.util.regex.Pattern.quote(r3)
            int r4 = (int) r6
            int r4 = r4 + 1
            java.lang.String[] r1 = r2.split(r1, r4)
            int r2 = r1.length
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0300
            if (r2 <= 0) goto L_0x0300
            r3 = 0
            r3 = r1[r3]
            boolean r3 = r3.isEmpty()
            int r4 = r2 + -1
            r8 = r1[r4]
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0302
            goto L_0x0301
        L_0x0300:
            r3 = 0
        L_0x0301:
            r4 = r2
        L_0x0302:
            long r8 = (long) r2
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0309
            int r4 = r4 + -1
        L_0x0309:
            if (r3 >= r4) goto L_0x0318
            j4.t r2 = new j4.t
            r6 = r1[r3]
            r2.<init>(r6)
            r5.add(r2)
            int r3 = r3 + 1
            goto L_0x0309
        L_0x0318:
            j4.f r2 = new j4.f
            r2.<init>(r5)
            goto L_0x064e
        L_0x031f:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 2
            j4.j4.j(r12, r2, r1)
            java.lang.String r2 = r0.f8469a
            boolean r3 = r22.isEmpty()
            if (r3 != 0) goto L_0x0345
            r3 = 0
            java.lang.Object r3 = r1.get(r3)
            j4.p r3 = (j4.p) r3
            j4.p r3 = r4.b(r3)
            java.lang.Double r3 = r3.b()
            double r5 = r3.doubleValue()
            goto L_0x0347
        L_0x0345:
            r5 = 0
        L_0x0347:
            double r5 = j4.j4.a(r5)
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x035c
            int r3 = r2.length()
            double r9 = (double) r3
            double r9 = r9 + r5
            double r5 = java.lang.Math.max(r9, r7)
            goto L_0x0365
        L_0x035c:
            int r3 = r2.length()
            double r7 = (double) r3
            double r5 = java.lang.Math.min(r5, r7)
        L_0x0365:
            int r3 = r22.size()
            r7 = 1
            if (r3 <= r7) goto L_0x037f
            java.lang.Object r1 = r1.get(r7)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.Double r1 = r1.b()
            double r3 = r1.doubleValue()
            goto L_0x0384
        L_0x037f:
            int r1 = r2.length()
            double r3 = (double) r1
        L_0x0384:
            double r3 = j4.j4.a(r3)
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0399
            int r1 = r2.length()
            double r9 = (double) r1
            double r9 = r9 + r3
            double r3 = java.lang.Math.max(r9, r7)
            goto L_0x03a2
        L_0x0399:
            int r1 = r2.length()
            double r7 = (double) r1
            double r3 = java.lang.Math.min(r3, r7)
        L_0x03a2:
            int r1 = (int) r5
            int r3 = (int) r3
            int r3 = r3 - r1
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = r3 + r1
            j4.t r4 = new j4.t
            java.lang.String r1 = r2.substring(r1, r3)
            r4.<init>(r1)
            goto L_0x0482
        L_0x03b6:
            r0 = r19
            r4 = r21
            r1 = r22
            r3 = 1
            r5 = 0
            j4.j4.j(r2, r3, r1)
            boolean r2 = r22.isEmpty()
            if (r2 != 0) goto L_0x03d5
            java.lang.Object r1 = r1.get(r5)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.String r16 = r1.zzi()
        L_0x03d5:
            java.lang.String r1 = r0.f8469a
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r16)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x03f5
            j4.i r2 = new j4.i
            int r1 = r1.start()
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x064e
        L_0x03f5:
            j4.i r2 = new j4.i
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x064e
        L_0x0402:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 2
            j4.j4.j(r9, r2, r1)
            j4.u r2 = j4.p.f8373c0
            boolean r3 = r22.isEmpty()
            if (r3 != 0) goto L_0x0434
            r3 = 0
            java.lang.Object r3 = r1.get(r3)
            j4.p r3 = (j4.p) r3
            j4.p r3 = r4.b(r3)
            java.lang.String r16 = r3.zzi()
            int r3 = r22.size()
            r5 = 1
            if (r3 <= r5) goto L_0x0434
            java.lang.Object r1 = r1.get(r5)
            j4.p r1 = (j4.p) r1
            j4.p r2 = r4.b(r1)
        L_0x0434:
            r1 = r16
            java.lang.String r3 = r0.f8469a
            int r5 = r3.indexOf(r1)
            if (r5 < 0) goto L_0x0606
            boolean r6 = r2 instanceof j4.j
            if (r6 == 0) goto L_0x0467
            j4.j r2 = (j4.j) r2
            r6 = 3
            j4.p[] r6 = new j4.p[r6]
            j4.t r7 = new j4.t
            r7.<init>(r1)
            r8 = 0
            r6[r8] = r7
            double r7 = (double) r5
            j4.i r9 = new j4.i
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r9.<init>(r7)
            r7 = 1
            r6[r7] = r9
            r7 = 2
            r6[r7] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            j4.p r2 = r2.c(r4, r6)
        L_0x0467:
            j4.t r4 = new j4.t
            r6 = 0
            java.lang.String r6 = r3.substring(r6, r5)
            java.lang.String r2 = r2.zzi()
            int r1 = r1.length()
            int r1 = r1 + r5
            java.lang.String r1 = r3.substring(r1)
            java.lang.String r1 = androidx.fragment.app.w0.d(r6, r2, r1)
            r4.<init>(r1)
        L_0x0482:
            r2 = r4
            goto L_0x064e
        L_0x0485:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 1
            j4.j4.j(r13, r2, r1)
            java.lang.String r2 = r0.f8469a
            int r3 = r22.size()
            if (r3 > 0) goto L_0x049a
            java.lang.String r1 = ""
            goto L_0x04a9
        L_0x049a:
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.String r1 = r1.zzi()
        L_0x04a9:
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x04d1
            j4.f r2 = new j4.f
            r3 = 1
            j4.p[] r3 = new j4.p[r3]
            j4.t r4 = new j4.t
            java.lang.String r1 = r1.group()
            r4.<init>(r1)
            r1 = 0
            r3[r1] = r4
            java.util.List r1 = java.util.Arrays.asList(r3)
            r2.<init>(r1)
            goto L_0x064e
        L_0x04d1:
            j4.n r2 = j4.p.f8374d0
            goto L_0x064e
        L_0x04d5:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 2
            r3 = 0
            j4.j4.j(r14, r2, r1)
            java.lang.String r5 = r0.f8469a
            int r6 = r22.size()
            if (r6 > 0) goto L_0x04e9
            goto L_0x04f7
        L_0x04e9:
            java.lang.Object r3 = r1.get(r3)
            j4.p r3 = (j4.p) r3
            j4.p r3 = r4.b(r3)
            java.lang.String r16 = r3.zzi()
        L_0x04f7:
            r3 = r16
            int r6 = r22.size()
            if (r6 >= r2) goto L_0x0502
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0515
        L_0x0502:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.Double r1 = r1.b()
            double r1 = r1.doubleValue()
        L_0x0515:
            boolean r4 = java.lang.Double.isNaN(r1)
            if (r4 == 0) goto L_0x051e
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x0522
        L_0x051e:
            double r1 = j4.j4.a(r1)
        L_0x0522:
            int r1 = (int) r1
            j4.i r2 = new j4.i
            int r1 = r5.lastIndexOf(r3, r1)
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x064e
        L_0x0533:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 2
            r5 = 0
            j4.j4.j(r8, r2, r1)
            java.lang.String r3 = r0.f8469a
            int r7 = r22.size()
            if (r7 > 0) goto L_0x0548
            goto L_0x0557
        L_0x0548:
            r7 = 0
            java.lang.Object r7 = r1.get(r7)
            j4.p r7 = (j4.p) r7
            j4.p r7 = r4.b(r7)
            java.lang.String r16 = r7.zzi()
        L_0x0557:
            r7 = r16
            int r8 = r22.size()
            if (r8 >= r2) goto L_0x0560
            goto L_0x0573
        L_0x0560:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.Double r1 = r1.b()
            double r5 = r1.doubleValue()
        L_0x0573:
            double r1 = j4.j4.a(r5)
            int r1 = (int) r1
            j4.i r2 = new j4.i
            int r1 = r3.indexOf(r7, r1)
            double r3 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            goto L_0x064e
        L_0x0588:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 1
            j4.j4.h(r7, r2, r1)
            java.lang.String r2 = r0.f8469a
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.String r3 = r1.zzi()
            java.lang.String r4 = "length"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x05ac
            goto L_0x05c5
        L_0x05ac:
            java.lang.Double r1 = r1.b()
            double r3 = r1.doubleValue()
            double r5 = java.lang.Math.floor(r3)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x05c9
            int r1 = (int) r3
            if (r1 < 0) goto L_0x05c9
            int r2 = r2.length()
            if (r1 >= r2) goto L_0x05c9
        L_0x05c5:
            j4.g r2 = j4.p.f8378h0
            goto L_0x064e
        L_0x05c9:
            j4.g r2 = j4.p.f8379i0
            goto L_0x064e
        L_0x05cd:
            r0 = r19
            r4 = r21
            r1 = r22
            boolean r2 = r22.isEmpty()
            if (r2 != 0) goto L_0x0606
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = r0.f8469a
            r2.<init>(r3)
            r3 = 0
        L_0x05e1:
            int r5 = r22.size()
            if (r3 >= r5) goto L_0x05fb
            java.lang.Object r5 = r1.get(r3)
            j4.p r5 = (j4.p) r5
            j4.p r5 = r4.b(r5)
            java.lang.String r5 = r5.zzi()
            r2.append(r5)
            int r3 = r3 + 1
            goto L_0x05e1
        L_0x05fb:
            j4.t r1 = new j4.t
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = r1
            goto L_0x064e
        L_0x0606:
            r2 = r0
            goto L_0x064e
        L_0x0608:
            r0 = r19
            r4 = r21
            r1 = r22
            r2 = 1
            j4.j4.j(r6, r2, r1)
            boolean r2 = r22.isEmpty()
            if (r2 != 0) goto L_0x0631
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r4.b(r1)
            java.lang.Double r1 = r1.b()
            double r1 = r1.doubleValue()
            double r1 = j4.j4.a(r1)
            int r1 = (int) r1
            goto L_0x0632
        L_0x0631:
            r1 = 0
        L_0x0632:
            java.lang.String r2 = r0.f8469a
            if (r1 < 0) goto L_0x064c
            int r3 = r2.length()
            if (r1 < r3) goto L_0x063d
            goto L_0x064c
        L_0x063d:
            j4.t r3 = new j4.t
            char r1 = r2.charAt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            r2 = r3
            goto L_0x064e
        L_0x064c:
            j4.t r2 = j4.p.f8380j0
        L_0x064e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.t.l(java.lang.String, o.c, java.util.ArrayList):j4.p");
    }

    public final String toString() {
        return w0.d("\"", this.f8469a, "\"");
    }

    public final String zzi() {
        return this.f8469a;
    }
}

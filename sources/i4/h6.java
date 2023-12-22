package i4;

import android.content.Context;
import b6.f;
import b6.h;
import b6.r;
import c6.b;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import n4.h4;
import org.json.JSONObject;
import r3.o;
import z5.b;
import z5.d;
import z5.l;
import z5.p;

public final class h6 implements s3, wf, SuccessContinuation, f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7357a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7358b;

    public h6(k4 k4Var) {
        this.f7357a = k4Var;
        if (k4Var.b()) {
            d9 a10 = q7.f7616b.a();
            b.B(k4Var);
            a10.zza();
        }
        this.f7358b = b.f2476h;
    }

    public h6(String str) {
        this.f7357a = "refresh_token";
        o.e(str);
        this.f7358b = str;
    }

    public /* synthetic */ h6(h4 h4Var, String str) {
        this.f7358b = h4Var;
        this.f7357a = str;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return new l((Context) ((h) this.f7357a).a(), (r) ((h) this.f7358b).a());
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [h6.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.Object r13, com.google.android.gms.common.api.Status r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f7358b
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            java.lang.String r1 = "completion source cannot be null"
            r3.o.i(r0, r1)
            if (r14 == 0) goto L_0x0123
            java.lang.Object r13 = r12.f7357a
            i4.cg r13 = (i4.cg) r13
            i4.te r0 = r13.f7243j
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r14 = r12.f7358b
            com.google.android.gms.tasks.TaskCompletionSource r14 = (com.google.android.gms.tasks.TaskCompletionSource) r14
            c6.f r13 = r13.f7236c
            com.google.firebase.auth.FirebaseAuth r13 = com.google.firebase.auth.FirebaseAuth.getInstance(r13)
            java.lang.Object r0 = r12.f7357a
            i4.cg r0 = (i4.cg) r0
            i4.te r1 = r0.f7243j
            java.lang.String r0 = r0.a()
            java.lang.String r2 = "reauthenticateWithCredential"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r12.f7357a
            i4.cg r0 = (i4.cg) r0
            java.lang.String r0 = r0.a()
            java.lang.String r2 = "reauthenticateWithCredentialWithData"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0048
        L_0x0042:
            java.lang.Object r0 = r12.f7357a
            i4.cg r0 = (i4.cg) r0
            h6.l r0 = r0.f7237d
        L_0x0048:
            android.util.SparseArray r2 = i4.of.f7569a
            r13.getClass()
            r1.getClass()
            android.util.SparseArray r2 = i4.of.f7569a
            r3 = 17078(0x42b6, float:2.3931E-41)
            java.lang.Object r2 = r2.get(r3)
            android.util.Pair r2 = (android.util.Pair) r2
            h6.e r3 = new h6.e
            java.lang.Object r4 = r2.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r5 = r1.f7691b
            java.util.ArrayList r5 = c6.b.G(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r5.next()
            h6.o r6 = (h6.o) r6
            boolean r8 = r6 instanceof h6.r
            if (r8 == 0) goto L_0x0073
            h6.r r6 = (h6.r) r6
            r7.add(r6)
            goto L_0x0073
        L_0x0089:
            java.util.List r5 = r1.f7691b
            java.util.ArrayList r5 = c6.b.G(r5)
            java.lang.String r6 = r1.f7690a
            r3.o.e(r6)
            i6.f r8 = new i6.f
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.f7895c = r9
            java.util.Iterator r5 = r5.iterator()
        L_0x00a4:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00bc
            java.lang.Object r9 = r5.next()
            h6.o r9 = (h6.o) r9
            boolean r10 = r9 instanceof h6.r
            if (r10 == 0) goto L_0x00a4
            java.util.List r10 = r8.f7895c
            h6.r r9 = (h6.r) r9
            r10.add(r9)
            goto L_0x00a4
        L_0x00bc:
            r8.f7894b = r6
            i6.d r6 = new i6.d
            c6.f r13 = r13.f3459a
            r13.a()
            java.lang.String r9 = r13.f2495b
            h6.b0 r10 = r1.f7692c
            r11 = r0
            i6.h0 r11 = (i6.h0) r11
            r6.<init>(r7, r8, r9, r10, r11)
            r3.<init>(r4, r2)
            r14.setException(r3)
            return
        L_0x00d6:
            h6.b r13 = r13.f7242i
            if (r13 == 0) goto L_0x0117
            java.lang.Object r13 = r12.f7358b
            com.google.android.gms.tasks.TaskCompletionSource r13 = (com.google.android.gms.tasks.TaskCompletionSource) r13
            android.util.SparseArray r0 = i4.of.f7569a
            int r0 = r14.f2811b
            r1 = 17012(0x4274, float:2.3839E-41)
            if (r0 == r1) goto L_0x00f4
            r1 = 17007(0x426f, float:2.3832E-41)
            if (r0 == r1) goto L_0x00f4
            r1 = 17025(0x4281, float:2.3857E-41)
            if (r0 != r1) goto L_0x00ef
            goto L_0x00f4
        L_0x00ef:
            c6.g r14 = i4.of.a(r14)
            goto L_0x0113
        L_0x00f4:
            android.util.SparseArray r1 = i4.of.f7569a
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 == 0) goto L_0x0103
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0105
        L_0x0103:
            java.lang.String r1 = "An internal error has occurred."
        L_0x0105:
            java.lang.String r14 = i4.of.c(r1, r14)
            h6.j r1 = new h6.j
            java.lang.String r0 = i4.of.b(r0)
            r1.<init>(r0, r14)
            r14 = r1
        L_0x0113:
            r13.setException(r14)
            return
        L_0x0117:
            java.lang.Object r13 = r12.f7358b
            com.google.android.gms.tasks.TaskCompletionSource r13 = (com.google.android.gms.tasks.TaskCompletionSource) r13
            c6.g r14 = i4.of.a(r14)
            r13.setException(r14)
            return
        L_0x0123:
            java.lang.Object r14 = r12.f7358b
            com.google.android.gms.tasks.TaskCompletionSource r14 = (com.google.android.gms.tasks.TaskCompletionSource) r14
            r14.setResult(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.h6.b(java.lang.Object, com.google.android.gms.common.api.Status):void");
    }

    public final Task then(Object obj) {
        return Tasks.forResult(new p(((d) this.f7357a).f13197b, ((b.a) this.f7358b).a(), ((Long) obj).longValue()));
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", (String) this.f7357a);
        jSONObject.put("refreshToken", (String) this.f7358b);
        return jSONObject.toString();
    }

    public /* synthetic */ h6(Object obj, Object obj2) {
        this.f7357a = obj;
        this.f7358b = obj2;
    }
}

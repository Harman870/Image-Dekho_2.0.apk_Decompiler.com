package androidx.lifecycle;

import android.os.Bundle;
import android.util.Log;
import c2.b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.imgdkh.app.R;
import e9.t;
import g7.m;
import i4.e7;
import i4.g8;
import i4.i1;
import i4.i9;
import i4.k8;
import i4.l8;
import i4.m8;
import i4.md;
import i4.n8;
import i4.p0;
import i4.u7;
import i4.xd;
import i4.y7;
import j4.ga;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n4.u2;
import n4.w2;
import o.d;
import q.c;
import q.e;
import s6.g;
import x8.f;

public class c0 implements md, m, e7, Continuation, u2, g {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f1717a = new c0();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1718b = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ c0 f1719c = new c0();

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1720d = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1721e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f1722f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ c0 f1723g = new c0();

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ c0 f1724h = new c0();

    /* renamed from: i  reason: collision with root package name */
    public static boolean[] f1725i = new boolean[3];

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f1726j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f1727l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: m  reason: collision with root package name */
    public static final Object[] f1728m = new Object[0];

    /* renamed from: n  reason: collision with root package name */
    public static final t f1729n = new t();

    public /* synthetic */ c0() {
    }

    public static int c(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int d(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j10 ? 1 : (jArr[i13] == j10 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static String e(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            char[] cArr = k;
            sb.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb.append(cArr[bArr[i10] & 15]);
        }
        return sb.toString();
    }

    public static void f(e eVar, d dVar, q.d dVar2) {
        dVar2.f10921p = -1;
        dVar2.f10922q = -1;
        if (eVar.V[0] != 2 && dVar2.V[0] == 4) {
            int i10 = dVar2.K.f10880g;
            int r4 = eVar.r() - dVar2.M.f10880g;
            c cVar = dVar2.K;
            cVar.f10882i = dVar.l(cVar);
            c cVar2 = dVar2.M;
            cVar2.f10882i = dVar.l(cVar2);
            dVar.d(dVar2.K.f10882i, i10);
            dVar.d(dVar2.M.f10882i, r4);
            dVar2.f10921p = 2;
            dVar2.f10895b0 = i10;
            int i11 = r4 - i10;
            dVar2.X = i11;
            int i12 = dVar2.f10901e0;
            if (i11 < i12) {
                dVar2.X = i12;
            }
        }
        if (eVar.V[1] != 2 && dVar2.V[1] == 4) {
            int i13 = dVar2.L.f10880g;
            int l6 = eVar.l() - dVar2.N.f10880g;
            c cVar3 = dVar2.L;
            cVar3.f10882i = dVar.l(cVar3);
            c cVar4 = dVar2.N;
            cVar4.f10882i = dVar.l(cVar4);
            dVar.d(dVar2.L.f10882i, i13);
            dVar.d(dVar2.N.f10882i, l6);
            if (dVar2.f10899d0 > 0 || dVar2.f10911j0 == 8) {
                c cVar5 = dVar2.O;
                cVar5.f10882i = dVar.l(cVar5);
                dVar.d(dVar2.O.f10882i, dVar2.f10899d0 + i13);
            }
            dVar2.f10922q = 2;
            dVar2.f10897c0 = i13;
            int i14 = l6 - i13;
            dVar2.Y = i14;
            int i15 = dVar2.f10903f0;
            if (i14 < i15) {
                dVar2.Y = i15;
            }
        }
    }

    public static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static String h(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public static final Object[] i(Collection collection) {
        f.f(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 < 2147483645) {
                                i12 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        f.e(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        f.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f1728m;
    }

    public static final Object[] k(Collection collection, Object[] objArr) {
        Object[] objArr2;
        f.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    f.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 < 2147483645) {
                                i12 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        f.e(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        f.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public androidx.activity.result.c a(y7 y7Var) {
        l8 l8Var;
        u7 u7Var = n8.f7528a;
        if (y7Var.f7815a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                i9 y9 = i9.y(y7Var.f7817c, p0.f7582b);
                if (y9.v() == 0) {
                    k8 k8Var = new k8();
                    k8Var.a(y9.A().g());
                    k8Var.b(y9.z().v());
                    int i10 = y7Var.f7819e;
                    int b10 = o.g.b(i10);
                    if (b10 == 1) {
                        l8Var = l8.f7477b;
                    } else if (b10 == 2) {
                        l8Var = l8.f7479d;
                    } else if (b10 == 3) {
                        l8Var = l8.f7480e;
                    } else if (b10 == 4) {
                        l8Var = l8.f7478c;
                    } else {
                        int a10 = androidx.activity.f.a(i10);
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a10);
                    }
                    k8Var.f7446c = l8Var;
                    m8 c10 = k8Var.c();
                    g8 g8Var = new g8();
                    g8Var.f7329a = c10;
                    g8Var.f7330b = new b((Object) xd.a(y9.A().r()));
                    g8Var.f7331c = y7Var.f7820f;
                    return g8Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (i1 | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }

    public /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    public Object j() {
        return new ArrayDeque();
    }

    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.getException());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    public Object zza() {
        List list = w2.f10205a;
        return Long.valueOf(ga.f8203b.zza().x());
    }

    public /* synthetic */ c0(Object obj) {
    }
}

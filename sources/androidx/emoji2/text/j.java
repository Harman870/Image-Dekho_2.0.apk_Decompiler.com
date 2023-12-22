package androidx.emoji2.text;

import a0.c;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final f.i f1370a;

    /* renamed from: b  reason: collision with root package name */
    public final n f1371b;

    /* renamed from: c  reason: collision with root package name */
    public f.d f1372c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1373a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final n.a f1374b;

        /* renamed from: c  reason: collision with root package name */
        public n.a f1375c;

        /* renamed from: d  reason: collision with root package name */
        public n.a f1376d;

        /* renamed from: e  reason: collision with root package name */
        public int f1377e;

        /* renamed from: f  reason: collision with root package name */
        public int f1378f;

        public a(n.a aVar) {
            this.f1374b = aVar;
            this.f1375c = aVar;
        }

        public final int a(int i10) {
            n.a aVar;
            boolean z9;
            SparseArray<n.a> sparseArray = this.f1375c.f1396a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i10);
            }
            int i11 = 3;
            if (this.f1373a != 2) {
                if (aVar != null) {
                    this.f1373a = 2;
                    this.f1375c = aVar;
                    this.f1378f = 1;
                }
                b();
                i11 = 1;
                this.f1377e = i10;
                return i11;
            } else if (aVar != null) {
                this.f1375c = aVar;
                this.f1378f++;
            } else {
                boolean z10 = false;
                if (i10 == 65038) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    if (i10 == 65039) {
                        z10 = true;
                    }
                    if (!z10) {
                        n.a aVar2 = this.f1375c;
                        if (aVar2.f1397b != null) {
                            if (this.f1378f == 1) {
                                if (c()) {
                                    aVar2 = this.f1375c;
                                }
                            }
                            this.f1376d = aVar2;
                            b();
                            this.f1377e = i10;
                            return i11;
                        }
                    }
                }
                b();
                i11 = 1;
                this.f1377e = i10;
                return i11;
            }
            i11 = 2;
            this.f1377e = i10;
            return i11;
        }

        public final void b() {
            this.f1373a = 1;
            this.f1375c = this.f1374b;
            this.f1378f = 0;
        }

        public final boolean c() {
            boolean z9;
            boolean z10;
            r0.a c10 = this.f1375c.f1397b.c();
            int a10 = c10.a(6);
            if (a10 == 0 || c10.f11456b.get(a10 + c10.f11455a) == 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                return true;
            }
            if (this.f1377e == 65039) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            return false;
        }
    }

    public j(n nVar, f.i iVar, d dVar) {
        this.f1370a = iVar;
        this.f1371b = nVar;
        this.f1372c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z9) {
        boolean z10;
        k[] kVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            int length = kVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                k kVar = kVarArr[i10];
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((!z9 || spanStart != selectionStart) && ((z9 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i10++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, i iVar) {
        int i12;
        if (iVar.f1369c == 0) {
            f.d dVar = this.f1372c;
            r0.a c10 = iVar.c();
            int a10 = c10.a(8);
            if (a10 != 0) {
                c10.f11456b.getShort(a10 + c10.f11455a);
            }
            d dVar2 = (d) dVar;
            dVar2.getClass();
            ThreadLocal<StringBuilder> threadLocal = d.f1339b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar2.f1340a;
            String sb2 = sb.toString();
            int i13 = c.f8a;
            if (c.a.a(textPaint, sb2)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            iVar.f1369c = i12;
        }
        if (iVar.f1369c == 2) {
            return true;
        }
        return false;
    }
}

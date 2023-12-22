package s0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.f;
import r0.b;

public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f11806a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11807b;

    public static class a {
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0080, code lost:
            if (r11 != false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0090;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x007c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean a(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            /*
                java.lang.Object r0 = androidx.emoji2.text.f.f1342i
                r0 = 0
                r1 = 1
                if (r8 == 0) goto L_0x00fb
                if (r7 != 0) goto L_0x000a
                goto L_0x00fb
            L_0x000a:
                if (r9 < 0) goto L_0x00fb
                if (r10 >= 0) goto L_0x0010
                goto L_0x00fb
            L_0x0010:
                int r2 = android.text.Selection.getSelectionStart(r8)
                int r3 = android.text.Selection.getSelectionEnd(r8)
                r4 = -1
                if (r2 == r4) goto L_0x0022
                if (r3 == r4) goto L_0x0022
                if (r2 == r3) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r5 = r0
                goto L_0x0023
            L_0x0022:
                r5 = r1
            L_0x0023:
                if (r5 == 0) goto L_0x0027
                goto L_0x00fb
            L_0x0027:
                if (r11 == 0) goto L_0x00b1
                int r9 = java.lang.Math.max(r9, r0)
                int r11 = r8.length()
                if (r2 < 0) goto L_0x0068
                if (r11 >= r2) goto L_0x0036
                goto L_0x0068
            L_0x0036:
                if (r9 >= 0) goto L_0x0039
                goto L_0x0068
            L_0x0039:
                r11 = r0
            L_0x003a:
                if (r9 != 0) goto L_0x003d
                goto L_0x0069
            L_0x003d:
                int r2 = r2 + -1
                if (r2 >= 0) goto L_0x0046
                if (r11 == 0) goto L_0x0044
                goto L_0x0068
            L_0x0044:
                r2 = r0
                goto L_0x0069
            L_0x0046:
                char r5 = r8.charAt(r2)
                if (r11 == 0) goto L_0x0056
                boolean r11 = java.lang.Character.isHighSurrogate(r5)
                if (r11 != 0) goto L_0x0053
                goto L_0x0068
            L_0x0053:
                int r9 = r9 + -1
                goto L_0x0039
            L_0x0056:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x005f
                int r9 = r9 + -1
                goto L_0x003a
            L_0x005f:
                boolean r11 = java.lang.Character.isHighSurrogate(r5)
                if (r11 == 0) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r11 = r1
                goto L_0x003a
            L_0x0068:
                r2 = r4
            L_0x0069:
                int r9 = java.lang.Math.max(r10, r0)
                int r10 = r8.length()
                if (r3 < 0) goto L_0x00ab
                if (r10 >= r3) goto L_0x0076
                goto L_0x00ab
            L_0x0076:
                if (r9 >= 0) goto L_0x0079
                goto L_0x00ab
            L_0x0079:
                r11 = r0
            L_0x007a:
                if (r9 != 0) goto L_0x007e
                r10 = r3
                goto L_0x00ac
            L_0x007e:
                if (r3 < r10) goto L_0x0083
                if (r11 == 0) goto L_0x00ac
                goto L_0x00ab
            L_0x0083:
                char r5 = r8.charAt(r3)
                if (r11 == 0) goto L_0x0095
                boolean r11 = java.lang.Character.isLowSurrogate(r5)
                if (r11 != 0) goto L_0x0090
                goto L_0x00ab
            L_0x0090:
                int r9 = r9 + -1
                int r3 = r3 + 1
                goto L_0x0079
            L_0x0095:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x00a0
                int r9 = r9 + -1
                int r3 = r3 + 1
                goto L_0x007a
            L_0x00a0:
                boolean r11 = java.lang.Character.isLowSurrogate(r5)
                if (r11 == 0) goto L_0x00a7
                goto L_0x00ab
            L_0x00a7:
                int r3 = r3 + 1
                r11 = r1
                goto L_0x007a
            L_0x00ab:
                r10 = r4
            L_0x00ac:
                if (r2 == r4) goto L_0x00fb
                if (r10 != r4) goto L_0x00bf
                goto L_0x00fb
            L_0x00b1:
                int r2 = r2 - r9
                int r2 = java.lang.Math.max(r2, r0)
                int r3 = r3 + r10
                int r9 = r8.length()
                int r10 = java.lang.Math.min(r3, r9)
            L_0x00bf:
                java.lang.Class<androidx.emoji2.text.k> r9 = androidx.emoji2.text.k.class
                java.lang.Object[] r9 = r8.getSpans(r2, r10, r9)
                androidx.emoji2.text.k[] r9 = (androidx.emoji2.text.k[]) r9
                if (r9 == 0) goto L_0x00fb
                int r11 = r9.length
                if (r11 <= 0) goto L_0x00fb
                int r11 = r9.length
                r3 = r0
            L_0x00ce:
                if (r3 >= r11) goto L_0x00e5
                r4 = r9[r3]
                int r5 = r8.getSpanStart(r4)
                int r4 = r8.getSpanEnd(r4)
                int r2 = java.lang.Math.min(r5, r2)
                int r10 = java.lang.Math.max(r4, r10)
                int r3 = r3 + 1
                goto L_0x00ce
            L_0x00e5:
                int r9 = java.lang.Math.max(r2, r0)
                int r11 = r8.length()
                int r10 = java.lang.Math.min(r10, r11)
                r7.beginBatchEdit()
                r8.delete(r9, r10)
                r7.endBatchEdit()
                r0 = r1
            L_0x00fb:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z9;
        int i10;
        a aVar = new a();
        this.f11806a = editText;
        this.f11807b = aVar;
        boolean z10 = true;
        if (f.f1343j != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f a10 = f.a();
            if ((a10.b() != 1 ? false : z10) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                f.a aVar2 = a10.f1348e;
                aVar2.getClass();
                Bundle bundle = editorInfo.extras;
                b bVar = aVar2.f1353c.f1392a;
                int a11 = bVar.a(4);
                if (a11 != 0) {
                    i10 = bVar.f11456b.getInt(a11 + bVar.f11455a);
                } else {
                    i10 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i10);
                Bundle bundle2 = editorInfo.extras;
                aVar2.f1354a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    public final boolean deleteSurroundingText(int i10, int i11) {
        a aVar = this.f11807b;
        Editable editableText = this.f11806a.getEditableText();
        aVar.getClass();
        if (a.a(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        a aVar = this.f11807b;
        Editable editableText = this.f11806a.getEditableText();
        aVar.getClass();
        if (a.a(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }
}

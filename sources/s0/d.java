package s0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f11808a;

    /* renamed from: b  reason: collision with root package name */
    public a f11809b;

    public static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f11810a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f11811b;

        public a(TextView textView, d dVar) {
            this.f11810a = new WeakReference(textView);
            this.f11811b = new WeakReference(dVar);
        }

        public final void a() {
            boolean z9;
            int i10;
            InputFilter[] filters;
            TextView textView = (TextView) this.f11810a.get();
            InputFilter inputFilter = (InputFilter) this.f11811b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= filters.length) {
                        break;
                    } else if (filters[i11] == inputFilter) {
                        z9 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            z9 = false;
            if (z9 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                f a10 = f.a();
                if (text == null) {
                    i10 = 0;
                } else {
                    a10.getClass();
                    i10 = text.length();
                }
                CharSequence f10 = a10.f(0, i10, text);
                if (text != f10) {
                    int selectionStart = Selection.getSelectionStart(f10);
                    int selectionEnd = Selection.getSelectionEnd(f10);
                    textView.setText(f10);
                    if (f10 instanceof Spannable) {
                        Spannable spannable = (Spannable) f10;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                        } else if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                        }
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f11808a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f11808a.isInEditMode()) {
            return charSequence;
        }
        int b10 = f.a().b();
        if (b10 != 0) {
            boolean z9 = true;
            if (b10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f11808a.getText()) {
                    z9 = false;
                }
                if (!z9 || charSequence == null) {
                    return charSequence;
                }
                if (!(i10 == 0 && i11 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return f.a().f(0, charSequence.length(), charSequence);
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        f a10 = f.a();
        if (this.f11809b == null) {
            this.f11809b = new a(this.f11808a, this);
        }
        a10.g(this.f11809b);
        return charSequence;
    }
}

package s0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f11814a;

    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f11815a;

        /* renamed from: b  reason: collision with root package name */
        public final d f11816b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11817c = true;

        public a(TextView textView) {
            this.f11815a = textView;
            this.f11816b = new d(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f11817c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            for (d dVar : inputFilterArr) {
                if (dVar == this.f11816b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, r0);
            inputFilterArr3[r0] = this.f11816b;
            return inputFilterArr3;
        }

        public final void b(boolean z9) {
            if (z9) {
                d();
            }
        }

        public final void c(boolean z9) {
            this.f11817c = z9;
            d();
            this.f11815a.setFilters(a(this.f11815a.getFilters()));
        }

        public final void d() {
            TransformationMethod transformationMethod = this.f11815a.getTransformationMethod();
            if (this.f11817c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f11824a;
            }
            this.f11815a.setTransformationMethod(transformationMethod);
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z9) {
            throw null;
        }

        public void c(boolean z9) {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f11818a;

        public c(TextView textView) {
            this.f11818a = new a(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z9;
            if (androidx.emoji2.text.f.f1343j != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                return inputFilterArr;
            }
            return this.f11818a.a(inputFilterArr);
        }

        public final void b(boolean z9) {
            boolean z10;
            if (androidx.emoji2.text.f.f1343j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                this.f11818a.b(z9);
            }
        }

        public final void c(boolean z9) {
            boolean z10;
            if (androidx.emoji2.text.f.f1343j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f11818a.f11817c = z9;
            } else {
                this.f11818a.c(z9);
            }
        }
    }

    public f(TextView textView) {
        if (textView != null) {
            this.f11814a = new c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}

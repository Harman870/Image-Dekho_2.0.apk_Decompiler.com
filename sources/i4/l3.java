package i4;

import androidx.activity.f;

public final class l3 extends IllegalArgumentException {
    public l3(int i10, int i11) {
        super(f.f("Unpaired surrogate at index ", i10, " of ", i11));
    }
}

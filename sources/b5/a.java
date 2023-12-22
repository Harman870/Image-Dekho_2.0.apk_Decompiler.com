package b5;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f2266a;

    public /* synthetic */ a(Chip chip) {
        this.f2266a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        Chip chip = this.f2266a;
        chip.getClass();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f3060i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z9);
        }
    }
}

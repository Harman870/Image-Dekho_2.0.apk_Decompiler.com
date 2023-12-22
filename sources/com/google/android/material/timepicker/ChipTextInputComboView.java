package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import j5.r;
import j5.u;
import java.util.WeakHashMap;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f3399a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f3400b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f3401c = ((TextView) findViewById(R.id.material_label));

    public class a extends r {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f3399a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            String a10 = ChipTextInputComboView.a(ChipTextInputComboView.this, editable);
            Chip chip = ChipTextInputComboView.this.f3399a;
            if (TextUtils.isEmpty(a10)) {
                a10 = ChipTextInputComboView.a(ChipTextInputComboView.this, "00");
            }
            chip.setText(a10);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f3399a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3400b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        editText.setId(y.e.a());
        y.e.h(this.f3401c, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final boolean isChecked() {
        return this.f3399a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3400b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z9) {
        this.f3399a.setChecked(z9);
        int i10 = 0;
        this.f3400b.setVisibility(z9 ? 0 : 4);
        Chip chip = this.f3399a;
        if (z9) {
            i10 = 8;
        }
        chip.setVisibility(i10);
        if (isChecked()) {
            EditText editText = this.f3400b;
            editText.requestFocus();
            editText.post(new u(editText));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3399a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i10, Object obj) {
        this.f3399a.setTag(i10, obj);
    }

    public final void toggle() {
        this.f3399a.toggle();
    }
}

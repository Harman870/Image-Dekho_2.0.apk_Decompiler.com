package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.n;
import com.imgdkh.app.R;
import h0.y;

public class CheckableImageButton extends n implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f3256g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f3257d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3258e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3259f = true;

    public static class a extends n0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0029a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3260c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public class C0029a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3260c = parcel.readInt() != 1 ? false : true;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeInt(this.f3260c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        y.n(this, new j5.a(this));
    }

    public final boolean isChecked() {
        return this.f3257d;
    }

    public final int[] onCreateDrawableState(int i10) {
        if (!this.f3257d) {
            return super.onCreateDrawableState(i10);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f3256g);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f9479a);
        setChecked(aVar.f3260c);
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3260c = this.f3257d;
        return aVar;
    }

    public void setCheckable(boolean z9) {
        if (this.f3258e != z9) {
            this.f3258e = z9;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z9) {
        if (this.f3258e && this.f3257d != z9) {
            this.f3257d = z9;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z9) {
        this.f3259f = z9;
    }

    public void setPressed(boolean z9) {
        if (this.f3259f) {
            super.setPressed(z9);
        }
    }

    public final void toggle() {
        setChecked(!this.f3257d);
    }
}

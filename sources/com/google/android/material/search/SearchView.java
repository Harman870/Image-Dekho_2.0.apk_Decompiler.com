package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.imgdkh.app.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;

public final class SearchView extends FrameLayout implements CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public SearchBar f3284a;

    /* renamed from: b  reason: collision with root package name */
    public int f3285b;

    /* renamed from: c  reason: collision with root package name */
    public c f3286c;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z9;
            SearchView searchView = (SearchView) view;
            if (searchView.f3284a != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 && (view2 instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view2);
            }
            return false;
        }
    }

    public static class a extends n0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0031a();

        /* renamed from: c  reason: collision with root package name */
        public String f3287c;

        /* renamed from: d  reason: collision with root package name */
        public int f3288d;

        public a() {
            throw null;
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3287c = parcel.readString();
            this.f3288d = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeString(this.f3287c);
            parcel.writeInt(this.f3288d);
        }

        /* renamed from: com.google.android.material.search.SearchView$a$a  reason: collision with other inner class name */
        public class C0031a implements Parcelable.ClassLoaderCreator<a> {
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
    }

    public interface b {
        void a();
    }

    public enum c {
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f3284a;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z9) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) null, false);
            throw null;
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        throw null;
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f3286c;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f3285b;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z5.c.q(this);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f3285b = activityWindow.getAttributes().softInputMode;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean z9;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f9479a);
        setText((CharSequence) aVar.f3287c);
        if (aVar.f3288d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        setVisible(z9);
    }

    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            Editable text = getText();
            if (text != null) {
                text.toString();
            }
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void setAnimatedNavigationIcon(boolean z9) {
    }

    public void setAutoShowKeyboard(boolean z9) {
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(int i10) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z9) {
    }

    public void setModalForAccessibility(boolean z9) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z9) {
            new HashMap(viewGroup.getChildCount());
        }
        int i10 = 0;
        while (i10 < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i10) == this) {
                i10++;
            } else {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z9) {
        setStatusBarSpacerEnabledInternal(z9);
    }

    public void setText(int i10) {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z9) {
        throw null;
    }

    public void setTransitionState(c cVar) {
        if (!this.f3286c.equals(cVar)) {
            this.f3286c = cVar;
            for (b a10 : new LinkedHashSet((Collection) null)) {
                a10.a();
            }
        }
    }

    public void setUseWindowInsetsController(boolean z9) {
    }

    public void setVisible(boolean z9) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f3284a = searchBar;
        throw null;
    }
}

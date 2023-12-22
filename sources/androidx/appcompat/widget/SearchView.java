package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.imgdkh.app.R;
import h0.y;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends s0 implements g.b {

    /* renamed from: x0  reason: collision with root package name */
    public static final o f599x0 = (Build.VERSION.SDK_INT < 29 ? new o() : null);
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public m0.a O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public String V;
    public CharSequence W;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f600o0;

    /* renamed from: p  reason: collision with root package name */
    public final SearchAutoComplete f601p;
    public int p0;

    /* renamed from: q  reason: collision with root package name */
    public final View f602q;

    /* renamed from: q0  reason: collision with root package name */
    public SearchableInfo f603q0;

    /* renamed from: r  reason: collision with root package name */
    public final View f604r;

    /* renamed from: r0  reason: collision with root package name */
    public Bundle f605r0;

    /* renamed from: s  reason: collision with root package name */
    public final View f606s;

    /* renamed from: s0  reason: collision with root package name */
    public final b f607s0;

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f608t;

    /* renamed from: t0  reason: collision with root package name */
    public c f609t0;
    public final ImageView u;
    public final WeakHashMap<String, Drawable.ConstantState> u0;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f610v;

    /* renamed from: v0  reason: collision with root package name */
    public g f611v0;
    public final ImageView w;

    /* renamed from: w0  reason: collision with root package name */
    public a f612w0;

    /* renamed from: x  reason: collision with root package name */
    public final View f613x;

    /* renamed from: y  reason: collision with root package name */
    public q f614y;

    /* renamed from: z  reason: collision with root package name */
    public Rect f615z;

    public static class SearchAutoComplete extends d {

        /* renamed from: e  reason: collision with root package name */
        public int f616e = getThreshold();

        /* renamed from: f  reason: collision with root package name */
        public SearchView f617f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f618g;

        /* renamed from: h  reason: collision with root package name */
        public final a f619h = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f618g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f618g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f599x0;
            oVar.getClass();
            o.a();
            Method method = oVar.f633c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            return this.f616e <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f618g) {
                removeCallbacks(this.f619h);
                post(this.f619h);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z9, int i10, Rect rect) {
            super.onFocusChanged(z9, i10, rect);
            SearchView searchView = this.f617f;
            searchView.w(searchView.N);
            searchView.post(searchView.f607s0);
            if (searchView.f601p.hasFocus()) {
                searchView.l();
            }
        }

        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f617f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f617f.hasFocus() && getVisibility() == 0) {
                boolean z10 = true;
                this.f618g = true;
                Context context = getContext();
                o oVar = SearchView.f599x0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z10 = false;
                }
                if (z10) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z9) {
                this.f618g = false;
                removeCallbacks(this.f619h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f618g = false;
                removeCallbacks(this.f619h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f618g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f617f = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f616e = i10;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f601p.getText();
            searchView.W = text;
            boolean z9 = !TextUtils.isEmpty(text);
            searchView.v(z9);
            boolean z10 = !z9;
            int i13 = 8;
            if (searchView.U && !searchView.N && z10) {
                searchView.u.setVisibility(8);
                i13 = 0;
            }
            searchView.w.setVisibility(i13);
            searchView.r();
            searchView.u();
            searchView.getClass();
            searchView.V = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            SearchView.this.s();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            m0.a aVar = SearchView.this.O;
            if (aVar instanceof c1) {
                aVar.c((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public final void onFocusChange(View view, boolean z9) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z9);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView searchView = SearchView.this;
            if (searchView.f613x.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f604r.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = r1.a(searchView);
                int dimensionPixelSize = searchView.M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f601p.getDropDownBackground().getPadding(rect);
                searchView.f601p.setDropDownHorizontalOffset(a10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f601p.setDropDownWidth((((searchView.f613x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            if (view == searchView.f608t) {
                searchView.w(false);
                searchView.f601p.requestFocus();
                searchView.f601p.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.L;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.f610v) {
                searchView.m();
            } else if (view == searchView.u) {
                searchView.q();
            } else if (view == searchView.w) {
                SearchableInfo searchableInfo = searchView.f603q0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.H);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.I, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.f601p) {
                searchView.l();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z9;
            int i11;
            SearchView searchView = SearchView.this;
            if (searchView.f603q0 == null) {
                return false;
            }
            if (!searchView.f601p.isPopupShowing() || SearchView.this.f601p.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(SearchView.this.f601p.getText()) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.getContext().startActivity(searchView2.j("android.intent.action.SEARCH", (Uri) null, (String) null, searchView2.f601p.getText().toString()));
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f603q0 == null || searchView3.O == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return searchView3.n(searchView3.f601p.getListSelection());
            }
            if (i10 == 21 || i10 == 22) {
                if (i10 == 21) {
                    i11 = 0;
                } else {
                    i11 = searchView3.f601p.length();
                }
                searchView3.f601p.setSelection(i11);
                searchView3.f601p.setListSelection(0);
                searchView3.f601p.clearListSelection();
                searchView3.f601p.a();
                return true;
            } else if (i10 != 19) {
                return false;
            } else {
                searchView3.f601p.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.n(i10);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.o(i10);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a();

        boolean b();
    }

    public interface n {
        boolean a();

        boolean b();
    }

    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public Method f631a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f632b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f633c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f631a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f632b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f633c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class p extends n0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f634c;

        public class a implements Parcelable.ClassLoaderCreator<p> {
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new p[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f634c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("SearchView.SavedState{");
            g10.append(Integer.toHexString(System.identityHashCode(this)));
            g10.append(" isIconified=");
            g10.append(this.f634c);
            g10.append("}");
            return g10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f9479a, i10);
            parcel.writeValue(Boolean.valueOf(this.f634c));
        }
    }

    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f635a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f636b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f637c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f638d;

        /* renamed from: e  reason: collision with root package name */
        public final int f639e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f640f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f639e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f636b = rect3;
            Rect rect4 = new Rect();
            this.f638d = rect4;
            Rect rect5 = new Rect();
            this.f637c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f635a = searchAutoComplete;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f640f
                r8.f640f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f640f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f638d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f636b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f640f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.f637c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f635a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f635a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.f637c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f635a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f615z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f607s0 = new b();
        this.f609t0 = new c();
        this.u0 = new WeakHashMap<>();
        f fVar = new f();
        this.f611v0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.f612w0 = new a();
        int[] iArr = y3.a.f13042z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        i1 i1Var = new i1(context, obtainStyledAttributes);
        y.m(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(i1Var.i(17, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f601p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f602q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f604r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f606s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f608t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f610v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        y.d.q(findViewById, i1Var.e(18));
        y.d.q(findViewById2, i1Var.e(23));
        imageView.setImageDrawable(i1Var.e(21));
        imageView2.setImageDrawable(i1Var.e(13));
        imageView3.setImageDrawable(i1Var.e(10));
        imageView4.setImageDrawable(i1Var.e(26));
        imageView5.setImageDrawable(i1Var.e(21));
        this.E = i1Var.e(20);
        m1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = i1Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = i1Var.i(11, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f612w0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f611v0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(i1Var.a(16, true));
        int d10 = i1Var.d(2, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.J = i1Var.k(12);
        this.Q = i1Var.k(19);
        int h10 = i1Var.h(6, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = i1Var.h(5, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(i1Var.a(1, true));
        i1Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f613x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.M);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f601p.setText(charSequence);
        this.f601p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void clearFocus() {
        this.S = true;
        super.clearFocus();
        this.f601p.clearFocus();
        this.f601p.setImeVisibility(false);
        this.S = false;
    }

    public int getImeOptions() {
        return this.f601p.getImeOptions();
    }

    public int getInputType() {
        return this.f601p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f601p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f603q0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f603q0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public m0.a getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f605r0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f603q0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f605r0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f601p);
            return;
        }
        o oVar = f599x0;
        SearchAutoComplete searchAutoComplete = this.f601p;
        oVar.getClass();
        o.a();
        Method method = oVar.f631a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o oVar2 = f599x0;
        SearchAutoComplete searchAutoComplete2 = this.f601p;
        oVar2.getClass();
        o.a();
        Method method2 = oVar2.f632b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        if (!TextUtils.isEmpty(this.f601p.getText())) {
            this.f601p.setText("");
            this.f601p.requestFocus();
            this.f601p.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            w(true);
        }
    }

    public final boolean n(int i10) {
        int i11;
        Uri uri;
        String i12;
        Cursor cursor = this.O.f9309c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i13 = c1.f741x;
                String i14 = c1.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (i14 == null) {
                    i14 = this.f603q0.getSuggestIntentAction();
                }
                if (i14 == null) {
                    i14 = "android.intent.action.SEARCH";
                }
                String i15 = c1.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (i15 == null) {
                    i15 = this.f603q0.getSuggestIntentData();
                }
                if (!(i15 == null || (i12 = c1.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    i15 = i15 + "/" + Uri.encode(i12);
                }
                if (i15 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(i15);
                }
                intent = j(i14, uri, c1.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), c1.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        this.f601p.setImeVisibility(false);
        this.f601p.dismissDropDown();
        return true;
    }

    public final void o(int i10) {
        String d10;
        Editable text = this.f601p.getText();
        Cursor cursor = this.O.f9309c;
        if (cursor != null) {
            if (!cursor.moveToPosition(i10) || (d10 = this.O.d(cursor)) == null) {
                setQuery(text);
            } else {
                setQuery(d10);
            }
        }
    }

    public final void onActionViewCollapsed() {
        this.f601p.setText("");
        SearchAutoComplete searchAutoComplete = this.f601p;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.W = "";
        clearFocus();
        w(true);
        this.f601p.setImeOptions(this.p0);
        this.f600o0 = false;
    }

    public final void onActionViewExpanded() {
        if (!this.f600o0) {
            this.f600o0 = true;
            int imeOptions = this.f601p.getImeOptions();
            this.p0 = imeOptions;
            this.f601p.setImeOptions(imeOptions | 33554432);
            this.f601p.setText("");
            setIconified(false);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f607s0);
        post(this.f609t0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            SearchAutoComplete searchAutoComplete = this.f601p;
            Rect rect = this.f615z;
            searchAutoComplete.getLocationInWindow(this.B);
            getLocationInWindow(this.C);
            int[] iArr = this.B;
            int i14 = iArr[1];
            int[] iArr2 = this.C;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.A;
            Rect rect3 = this.f615z;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            q qVar = this.f614y;
            if (qVar == null) {
                q qVar2 = new q(this.A, this.f615z, this.f601p);
                this.f614y = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            Rect rect4 = this.A;
            Rect rect5 = this.f615z;
            qVar.f636b.set(rect4);
            qVar.f638d.set(rect4);
            Rect rect6 = qVar.f638d;
            int i17 = -qVar.f639e;
            rect6.inset(i17, i17);
            qVar.f637c.set(rect5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.N
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.T
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.T
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.T
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f9479a);
        w(pVar.f634c);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f634c = this.N;
        return pVar;
    }

    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        post(this.f607s0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        Editable text = this.f601p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f603q0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            this.f601p.setImeVisibility(false);
            this.f601p.dismissDropDown();
        }
    }

    public final void r() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f601p.getText());
        int i10 = 0;
        if (!z10 && (!this.M || this.f600o0)) {
            z9 = false;
        }
        ImageView imageView = this.f610v;
        if (!z9) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f610v.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final boolean requestFocus(int i10, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (this.N) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f601p.requestFocus(i10, rect);
        if (requestFocus) {
            w(false);
        }
        return requestFocus;
    }

    public final void s() {
        int[] iArr = this.f601p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f604r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f606s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f605r0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            m();
            return;
        }
        w(false);
        this.f601p.requestFocus();
        this.f601p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.M != z9) {
            this.M = z9;
            w(z9);
            t();
        }
    }

    public void setImeOptions(int i10) {
        this.f601p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f601p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.T = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        this.R = z9;
        m0.a aVar = this.O;
        if (aVar instanceof c1) {
            ((c1) aVar).f746p = z9 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f603q0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f601p
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f601p
            android.app.SearchableInfo r3 = r6.f603q0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f603q0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f603q0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f601p
            r3.setInputType(r7)
            m0.a r7 = r6.O
            if (r7 == 0) goto L_0x0042
            r7.c(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f603q0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.c1 r7 = new androidx.appcompat.widget.c1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f603q0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.u0
            r7.<init>(r3, r6, r4, r5)
            r6.O = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f601p
            r3.setAdapter(r7)
            m0.a r7 = r6.O
            androidx.appcompat.widget.c1 r7 = (androidx.appcompat.widget.c1) r7
            boolean r3 = r6.R
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r0
        L_0x0069:
            r7.f746p = r3
        L_0x006b:
            r6.t()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f603q0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f603q0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.H
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f603q0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.I
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            r6.U = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f601p
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.N
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.P = z9;
        w(this.N);
    }

    public void setSuggestionsAdapter(m0.a aVar) {
        this.O = aVar;
        this.f601p.setAdapter(aVar);
    }

    public final void t() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f601p;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.M && this.E != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.E.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z9;
        int i10 = 0;
        if ((this.P || this.U) && !this.N) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || !(this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) {
            i10 = 8;
        }
        this.f606s.setVisibility(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.U == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.P
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.U
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.N
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.U
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.u
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.v(boolean):void");
    }

    public final void w(boolean z9) {
        int i10;
        int i11;
        int i12;
        this.N = z9;
        int i13 = 8;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z10 = !TextUtils.isEmpty(this.f601p.getText());
        this.f608t.setVisibility(i10);
        v(z10);
        View view = this.f602q;
        if (z9) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        if (this.D.getDrawable() == null || this.M) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.D.setVisibility(i12);
        r();
        boolean z11 = !z10;
        if (this.U && !this.N && z11) {
            this.u.setVisibility(8);
            i13 = 0;
        }
        this.w.setVisibility(i13);
        u();
    }
}

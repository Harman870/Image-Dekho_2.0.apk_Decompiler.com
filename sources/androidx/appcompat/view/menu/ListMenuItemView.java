package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.i1;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import y3.a;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public h f367a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f368b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f369c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f370d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f371e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f372f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f373g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f374h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f375i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f376j;
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public Context f377l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f378m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f379n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f380o;

    /* renamed from: p  reason: collision with root package name */
    public LayoutInflater f381p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f382q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i1 m2 = i1.m(getContext(), attributeSet, a.w, R.attr.listMenuViewStyle);
        this.f376j = m2.e(5);
        this.k = m2.i(1, -1);
        this.f378m = m2.a(7, false);
        this.f377l = context;
        this.f379n = m2.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f380o = obtainStyledAttributes.hasValue(0);
        m2.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f381p == null) {
            this.f381p = LayoutInflater.from(getContext());
        }
        return this.f381p;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        ImageView imageView = this.f373g;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f374h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f374h.getLayoutParams();
            rect.top = this.f374h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.appcompat.view.menu.h r11) {
        /*
            r10 = this;
            r10.f367a = r11
            boolean r0 = r11.isVisible()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x000d
            r0 = r1
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f467e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            androidx.appcompat.view.menu.f r0 = r11.f475n
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.view.menu.f r0 = r11.f475n
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0031
            char r0 = r11.f472j
            goto L_0x0033
        L_0x0031:
            char r0 = r11.f470h
        L_0x0033:
            if (r0 == 0) goto L_0x0037
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            androidx.appcompat.view.menu.f r4 = r11.f475n
            r4.n()
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.view.menu.h r0 = r10.f367a
            androidx.appcompat.view.menu.f r4 = r0.f475n
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x005a
            androidx.appcompat.view.menu.f r4 = r0.f475n
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0054
            char r0 = r0.f472j
            goto L_0x0056
        L_0x0054:
            char r0 = r0.f470h
        L_0x0056:
            if (r0 == 0) goto L_0x005a
            r0 = r3
            goto L_0x005b
        L_0x005a:
            r0 = r1
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            if (r1 != 0) goto L_0x0113
            android.widget.TextView r0 = r10.f372f
            androidx.appcompat.view.menu.h r4 = r10.f367a
            androidx.appcompat.view.menu.f r5 = r4.f475n
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x0070
            char r5 = r4.f472j
            goto L_0x0072
        L_0x0070:
            char r5 = r4.f470h
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            java.lang.String r2 = ""
            goto L_0x0110
        L_0x0078:
            androidx.appcompat.view.menu.f r6 = r4.f475n
            android.content.Context r6 = r6.f439a
            android.content.res.Resources r6 = r6.getResources()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            androidx.appcompat.view.menu.f r8 = r4.f475n
            android.content.Context r8 = r8.f439a
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            boolean r8 = r8.hasPermanentMenuKey()
            if (r8 == 0) goto L_0x009d
            r8 = 2131951634(0x7f130012, float:1.9539688E38)
            java.lang.String r8 = r6.getString(r8)
            r7.append(r8)
        L_0x009d:
            androidx.appcompat.view.menu.f r8 = r4.f475n
            boolean r8 = r8.n()
            if (r8 == 0) goto L_0x00a8
            int r4 = r4.k
            goto L_0x00aa
        L_0x00a8:
            int r4 = r4.f471i
        L_0x00aa:
            r8 = 65536(0x10000, float:9.18355E-41)
            r9 = 2131951630(0x7f13000e, float:1.953968E38)
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.h.c(r4, r8, r9, r7)
            r8 = 4096(0x1000, float:5.74E-42)
            r9 = 2131951626(0x7f13000a, float:1.9539672E38)
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.h.c(r4, r8, r9, r7)
            r8 = 2
            r9 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r9 = r6.getString(r9)
            androidx.appcompat.view.menu.h.c(r4, r8, r9, r7)
            r8 = 2131951631(0x7f13000f, float:1.9539682E38)
            java.lang.String r8 = r6.getString(r8)
            androidx.appcompat.view.menu.h.c(r4, r3, r8, r7)
            r3 = 4
            r8 = 2131951633(0x7f130011, float:1.9539686E38)
            java.lang.String r8 = r6.getString(r8)
            androidx.appcompat.view.menu.h.c(r4, r3, r8, r7)
            r3 = 2131951629(0x7f13000d, float:1.9539678E38)
            java.lang.String r3 = r6.getString(r3)
            androidx.appcompat.view.menu.h.c(r4, r2, r3, r7)
            if (r5 == r2) goto L_0x0102
            r2 = 10
            if (r5 == r2) goto L_0x00fe
            r2 = 32
            if (r5 == r2) goto L_0x00fa
            r7.append(r5)
            goto L_0x010c
        L_0x00fa:
            r2 = 2131951632(0x7f130010, float:1.9539684E38)
            goto L_0x0105
        L_0x00fe:
            r2 = 2131951628(0x7f13000c, float:1.9539676E38)
            goto L_0x0105
        L_0x0102:
            r2 = 2131951627(0x7f13000b, float:1.9539674E38)
        L_0x0105:
            java.lang.String r2 = r6.getString(r2)
            r7.append(r2)
        L_0x010c:
            java.lang.String r2 = r7.toString()
        L_0x0110:
            r0.setText(r2)
        L_0x0113:
            android.widget.TextView r0 = r10.f372f
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L_0x0120
            android.widget.TextView r0 = r10.f372f
            r0.setVisibility(r1)
        L_0x0120:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f478q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(androidx.appcompat.view.menu.h):void");
    }

    public h getItemData() {
        return this.f367a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f376j;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f370d = textView;
        int i10 = this.k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f377l, i10);
        }
        this.f372f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f373g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f379n);
        }
        this.f374h = (ImageView) findViewById(R.id.group_divider);
        this.f375i = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i10, int i11) {
        if (this.f368b != null && this.f378m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f368b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z9) {
        boolean z10;
        View view;
        CompoundButton compoundButton;
        if (z9 || this.f369c != null || this.f371e != null) {
            if ((this.f367a.f483x & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f369c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f369c = radioButton;
                    LinearLayout linearLayout = this.f375i;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f369c;
                view = this.f371e;
            } else {
                if (this.f371e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.f371e = checkBox;
                    LinearLayout linearLayout2 = this.f375i;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f371e;
                view = this.f369c;
            }
            if (z9) {
                compoundButton.setChecked(this.f367a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f371e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f369c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z9) {
        boolean z10;
        CompoundButton compoundButton;
        if ((this.f367a.f483x & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f369c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.f369c = radioButton;
                LinearLayout linearLayout = this.f375i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f369c;
        } else {
            if (this.f371e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.f371e = checkBox;
                LinearLayout linearLayout2 = this.f375i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f371e;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.f382q = z9;
        this.f378m = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        ImageView imageView = this.f374h;
        if (imageView != null) {
            imageView.setVisibility((this.f380o || !z9) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f367a.f475n.getClass();
        boolean z9 = this.f382q;
        if (z9 || this.f378m) {
            ImageView imageView = this.f368b;
            if (imageView != null || drawable != null || this.f378m) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f368b = imageView2;
                    LinearLayout linearLayout = this.f375i;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f378m) {
                    ImageView imageView3 = this.f368b;
                    if (!z9) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f368b.getVisibility() != 0) {
                        this.f368b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f368b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i10;
        if (charSequence != null) {
            this.f370d.setText(charSequence);
            if (this.f370d.getVisibility() != 0) {
                textView = this.f370d;
                i10 = 0;
            } else {
                return;
            }
        } else {
            i10 = 8;
            if (this.f370d.getVisibility() != 8) {
                textView = this.f370d;
            } else {
                return;
            }
        }
        textView.setVisibility(i10);
    }
}

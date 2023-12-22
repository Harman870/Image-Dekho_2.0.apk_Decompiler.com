package h0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f6708a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f6709b;

    /* renamed from: c  reason: collision with root package name */
    public final View f6710c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6711d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f6712e;

    public m(View view) {
        this.f6710c = view;
    }

    public final boolean a(float f10, float f11, boolean z9) {
        ViewParent f12;
        if (!this.f6711d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return i0.a(f12, this.f6710c, f10, f11, z9);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f6711d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return i0.b(f12, this.f6710c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent f10;
        int i13;
        int i14;
        int[] iArr3;
        int i15 = i10;
        int i16 = i11;
        int[] iArr4 = iArr2;
        int i17 = i12;
        if (!this.f6711d || (f10 = f(i17)) == null) {
            return false;
        }
        if (i15 != 0 || i16 != 0) {
            if (iArr4 != null) {
                this.f6710c.getLocationInWindow(iArr4);
                i14 = iArr4[0];
                i13 = iArr4[1];
            } else {
                i14 = 0;
                i13 = 0;
            }
            if (iArr == null) {
                if (this.f6712e == null) {
                    this.f6712e = new int[2];
                }
                iArr3 = this.f6712e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f6710c;
            if (f10 instanceof n) {
                ((n) f10).j(view, i10, i11, iArr3, i12);
            } else if (i17 == 0) {
                try {
                    i0.c(f10, view, i10, i16, iArr3);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
                }
            }
            if (iArr4 != null) {
                this.f6710c.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i14;
                iArr4[1] = iArr4[1] - i13;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i10, int i11, int i12, int[] iArr) {
        e(0, i10, 0, i11, (int[]) null, i12, iArr);
    }

    public final boolean e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent f10;
        int i15;
        int i16;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i17 = i14;
        if (!this.f6711d || (f10 = f(i17)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f6710c.getLocationInWindow(iArr4);
            i16 = iArr4[0];
            i15 = iArr4[1];
        } else {
            i16 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f6712e == null) {
                this.f6712e = new int[2];
            }
            int[] iArr5 = this.f6712e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f6710c;
        if (f10 instanceof o) {
            ((o) f10).m(view, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (f10 instanceof n) {
                ((n) f10).n(view, i10, i11, i12, i13, i14);
            } else if (i17 == 0) {
                try {
                    i0.d(f10, view, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr4 != null) {
            this.f6710c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i16;
            iArr4[1] = iArr4[1] - i15;
        }
        return true;
    }

    public final ViewParent f(int i10) {
        if (i10 == 0) {
            return this.f6708a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f6709b;
    }

    public final boolean g(int i10, int i11) {
        boolean z9;
        boolean z10;
        if (f(i11) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        if (this.f6711d) {
            View view = this.f6710c;
            for (ViewParent parent = this.f6710c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f6710c;
                boolean z11 = parent instanceof n;
                if (z11) {
                    z10 = ((n) parent).o(view, view2, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            z10 = i0.f(parent, view, view2, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    z10 = false;
                }
                if (z10) {
                    if (i11 == 0) {
                        this.f6708a = parent;
                    } else if (i11 == 1) {
                        this.f6709b = parent;
                    }
                    View view3 = this.f6710c;
                    if (z11) {
                        ((n) parent).b(view, view3, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            i0.e(parent, view, view3, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i10) {
        ViewParent f10 = f(i10);
        if (f10 != null) {
            View view = this.f6710c;
            if (f10 instanceof n) {
                ((n) f10).i(view, i10);
            } else if (i10 == 0) {
                try {
                    i0.g(f10, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f6708a = null;
            } else if (i10 == 1) {
                this.f6709b = null;
            }
        }
    }
}

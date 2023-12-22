package o2;

import android.util.Property;

public abstract class a extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10522a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, int i10) {
        super(Float.class, str);
        this.f10522a = i10;
        if (i10 != 1) {
        } else {
            super(Integer.class, str);
        }
    }

    public abstract void a(int i10, Object obj);

    public abstract void b(Object obj, float f10);

    public final void set(Object obj, Object obj2) {
        switch (this.f10522a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                return;
            default:
                a(((Integer) obj2).intValue(), obj);
                return;
        }
    }
}

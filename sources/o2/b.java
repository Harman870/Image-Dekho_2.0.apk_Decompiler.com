package o2;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import q2.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public f f10523a;

    /* renamed from: b  reason: collision with root package name */
    public Interpolator f10524b;

    /* renamed from: c  reason: collision with root package name */
    public long f10525c = 2000;

    /* renamed from: d  reason: collision with root package name */
    public int f10526d = 0;

    /* renamed from: e  reason: collision with root package name */
    public HashMap f10527e = new HashMap();

    public class a extends C0122b<Float> {
        public a(float[] fArr, a aVar, Float[] fArr2) {
            super(fArr, aVar, fArr2);
        }
    }

    /* renamed from: o2.b$b  reason: collision with other inner class name */
    public class C0122b<T> {

        /* renamed from: a  reason: collision with root package name */
        public float[] f10528a;

        /* renamed from: b  reason: collision with root package name */
        public Property f10529b;

        /* renamed from: c  reason: collision with root package name */
        public T[] f10530c;

        public C0122b(float[] fArr, a aVar, Object[] objArr) {
            this.f10528a = fArr;
            this.f10529b = aVar;
            this.f10530c = objArr;
        }
    }

    public class c extends C0122b<Integer> {
        public c(float[] fArr, a aVar, Integer[] numArr) {
            super(fArr, aVar, numArr);
        }
    }

    public b(f fVar) {
        this.f10523a = fVar;
    }

    public static void c(int i10, int i11) {
        if (i10 != i11) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
        }
    }

    public final ObjectAnimator a() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f10527e.size()];
        int i10 = 0;
        for (Map.Entry value : this.f10527e.entrySet()) {
            C0122b bVar = (C0122b) value.getValue();
            float[] fArr = bVar.f10528a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i11 = this.f10526d;
            float f10 = fArr[i11];
            while (true) {
                int i12 = this.f10526d;
                T[] tArr = bVar.f10530c;
                if (i11 >= tArr.length + i12) {
                    break;
                }
                int i13 = i11 - i12;
                int length = i11 % tArr.length;
                float f11 = fArr[length] - f10;
                if (f11 < 0.0f) {
                    f11 += fArr[fArr.length - 1];
                }
                if (bVar instanceof c) {
                    keyframeArr[i13] = Keyframe.ofInt(f11, ((Integer) tArr[length]).intValue());
                } else if (bVar instanceof a) {
                    keyframeArr[i13] = Keyframe.ofFloat(f11, ((Float) tArr[length]).floatValue());
                } else {
                    keyframeArr[i13] = Keyframe.ofObject(f11, tArr[length]);
                }
                i11++;
            }
            propertyValuesHolderArr[i10] = PropertyValuesHolder.ofKeyframe(bVar.f10529b, keyframeArr);
            i10++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f10523a, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f10525c);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setInterpolator(this.f10524b);
        return ofPropertyValuesHolder;
    }

    public final void b(float... fArr) {
        p2.a aVar = new p2.a(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), new float[0]);
        aVar.f10656b = fArr;
        this.f10524b = aVar;
    }

    public final void d(float[] fArr, a aVar, Float[] fArr2) {
        c(fArr.length, fArr2.length);
        this.f10527e.put(aVar.getName(), new a(fArr, aVar, fArr2));
    }

    public final void e(float[] fArr, a aVar, Integer[] numArr) {
        c(fArr.length, numArr.length);
        this.f10527e.put(aVar.getName(), new c(fArr, aVar, numArr));
    }
}

package j5;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.c;
import java.lang.ref.WeakReference;
import n5.d;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f8699a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f8700b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f8701c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8702d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f8703e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f8704f;

    public class a extends c {
        public a() {
            super(0);
        }

        public final void k(int i10) {
            q qVar = q.this;
            qVar.f8702d = true;
            b bVar = qVar.f8703e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public final void l(Typeface typeface, boolean z9) {
            if (!z9) {
                q qVar = q.this;
                qVar.f8702d = true;
                b bVar = qVar.f8703e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public q(b bVar) {
        this.f8703e = new WeakReference<>(bVar);
    }
}

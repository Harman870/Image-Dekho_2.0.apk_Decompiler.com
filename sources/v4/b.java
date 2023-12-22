package v4;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12509a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f12510b;

    public class a extends FloatingActionButton.a {
        public a() {
        }

        public final void b() {
            BottomAppBar bottomAppBar = b.this.f12510b;
            int i10 = BottomAppBar.f2916x0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f12510b = bottomAppBar;
        this.f12509a = i10;
    }

    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f12510b.y(this.f12509a));
        floatingActionButton.m(new a(), true);
    }
}

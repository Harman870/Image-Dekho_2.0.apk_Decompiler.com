package g;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class h implements Window.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f6453a;

    public static class a {
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i10) {
            return callback.onWindowStartingActionMode(callback2, i10);
        }
    }

    public static class b {
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            callback.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    public static class c {
        public static void a(Window.Callback callback, boolean z9) {
            callback.onPointerCaptureChanged(z9);
        }
    }

    public h(Window.Callback callback) {
        if (callback != null) {
            this.f6453a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6453a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6453a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f6453a.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6453a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6453a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6453a.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6453a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6453a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f6453a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f6453a.onCreatePanelMenu(i10, menu);
    }

    public View onCreatePanelView(int i10) {
        return this.f6453a.onCreatePanelView(i10);
    }

    public final void onDetachedFromWindow() {
        this.f6453a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f6453a.onMenuItemSelected(i10, menuItem);
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f6453a.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f6453a.onPanelClosed(i10, menu);
    }

    public final void onPointerCaptureChanged(boolean z9) {
        c.a(this.f6453a, z9);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f6453a.onPreparePanel(i10, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        b.a(this.f6453a, list, menu, i10);
    }

    public final boolean onSearchRequested() {
        return this.f6453a.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f6453a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6453a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z9) {
        this.f6453a.onWindowFocusChanged(z9);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return a.b(this.f6453a, callback, i10);
    }
}

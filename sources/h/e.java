package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import c0.a;
import c0.b;
import c0.c;
import m.h;

public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f6674d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f6674d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i10) {
        return c(this.f6674d.add(i10));
    }

    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(this.f6674d.add(i10, i11, i12, i13));
    }

    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(this.f6674d.add(i10, i11, i12, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return c(this.f6674d.add(charSequence));
    }

    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f6674d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr2[i14] = c(menuItemArr3[i14]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i10) {
        return d(this.f6674d.addSubMenu(i10));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return d(this.f6674d.addSubMenu(i10, i11, i12, i13));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return d(this.f6674d.addSubMenu(i10, i11, i12, charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f6674d.addSubMenu(charSequence));
    }

    public final void clear() {
        h<b, MenuItem> hVar = this.f6661b;
        if (hVar != null) {
            hVar.clear();
        }
        h<c, SubMenu> hVar2 = this.f6662c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f6674d.clear();
    }

    public final void close() {
        this.f6674d.close();
    }

    public final MenuItem findItem(int i10) {
        return c(this.f6674d.findItem(i10));
    }

    public final MenuItem getItem(int i10) {
        return c(this.f6674d.getItem(i10));
    }

    public final boolean hasVisibleItems() {
        return this.f6674d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f6674d.isShortcutKey(i10, keyEvent);
    }

    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f6674d.performIdentifierAction(i10, i11);
    }

    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f6674d.performShortcut(i10, keyEvent, i11);
    }

    public final void removeGroup(int i10) {
        if (this.f6661b != null) {
            int i11 = 0;
            while (true) {
                h<b, MenuItem> hVar = this.f6661b;
                if (i11 >= hVar.f9301c) {
                    break;
                }
                if (hVar.h(i11).getGroupId() == i10) {
                    this.f6661b.j(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f6674d.removeGroup(i10);
    }

    public final void removeItem(int i10) {
        if (this.f6661b != null) {
            int i11 = 0;
            while (true) {
                h<b, MenuItem> hVar = this.f6661b;
                if (i11 >= hVar.f9301c) {
                    break;
                } else if (hVar.h(i11).getItemId() == i10) {
                    this.f6661b.j(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f6674d.removeItem(i10);
    }

    public final void setGroupCheckable(int i10, boolean z9, boolean z10) {
        this.f6674d.setGroupCheckable(i10, z9, z10);
    }

    public final void setGroupEnabled(int i10, boolean z9) {
        this.f6674d.setGroupEnabled(i10, z9);
    }

    public final void setGroupVisible(int i10, boolean z9) {
        this.f6674d.setGroupVisible(i10, z9);
    }

    public final void setQwertyMode(boolean z9) {
        this.f6674d.setQwertyMode(z9);
    }

    public final int size() {
        return this.f6674d.size();
    }
}

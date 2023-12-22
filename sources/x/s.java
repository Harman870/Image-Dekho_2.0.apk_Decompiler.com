package x;

import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f12823a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f12824b;

    /* renamed from: c  reason: collision with root package name */
    public String f12825c;

    /* renamed from: d  reason: collision with root package name */
    public String f12826d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12827e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12828f;

    public static class a {
        public static s a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f12829a = person.getName();
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.k;
                icon.getClass();
                int c10 = IconCompat.a.c(icon);
                if (c10 == 2) {
                    iconCompat = IconCompat.b(IconCompat.a.b(icon), IconCompat.a.a(icon));
                } else if (c10 == 4) {
                    Uri d10 = IconCompat.a.d(icon);
                    d10.getClass();
                    String uri = d10.toString();
                    uri.getClass();
                    iconCompat = new IconCompat(4);
                    iconCompat.f1260b = uri;
                } else if (c10 != 6) {
                    iconCompat = new IconCompat(-1);
                    iconCompat.f1260b = icon;
                } else {
                    Uri d11 = IconCompat.a.d(icon);
                    d11.getClass();
                    String uri2 = d11.toString();
                    uri2.getClass();
                    iconCompat = new IconCompat(6);
                    iconCompat.f1260b = uri2;
                }
            } else {
                iconCompat = null;
            }
            bVar.f12830b = iconCompat;
            bVar.f12831c = person.getUri();
            bVar.f12832d = person.getKey();
            bVar.f12833e = person.isBot();
            bVar.f12834f = person.isImportant();
            return new s(bVar);
        }

        public static Person b(s sVar) {
            Person.Builder name = new Person.Builder().setName(sVar.f12823a);
            IconCompat iconCompat = sVar.f12824b;
            Icon icon = null;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.f(iconCompat, (Context) null);
            }
            return name.setIcon(icon).setUri(sVar.f12825c).setKey(sVar.f12826d).setBot(sVar.f12827e).setImportant(sVar.f12828f).build();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f12829a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f12830b;

        /* renamed from: c  reason: collision with root package name */
        public String f12831c;

        /* renamed from: d  reason: collision with root package name */
        public String f12832d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f12833e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12834f;
    }

    public s(b bVar) {
        this.f12823a = bVar.f12829a;
        this.f12824b = bVar.f12830b;
        this.f12825c = bVar.f12831c;
        this.f12826d = bVar.f12832d;
        this.f12827e = bVar.f12833e;
        this.f12828f = bVar.f12834f;
    }
}

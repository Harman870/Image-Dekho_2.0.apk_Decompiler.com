package x;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public final class l extends o {

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f12793b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f12794c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12795d;

    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z9) {
            bigPictureStyle.showBigPictureWhenCollapsed(z9);
        }
    }

    public final void b(p pVar) {
        Bitmap bitmap;
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(pVar.f12818b).setBigContentTitle((CharSequence) null);
        IconCompat iconCompat = this.f12793b;
        if (iconCompat != null) {
            if (i10 >= 31) {
                c.a(bigContentTitle, IconCompat.a.f(iconCompat, pVar.f12817a));
            } else {
                int i11 = iconCompat.f1259a;
                if (i11 == -1) {
                    i11 = IconCompat.a.c(iconCompat.f1260b);
                }
                if (i11 == 1) {
                    IconCompat iconCompat2 = this.f12793b;
                    int i12 = iconCompat2.f1259a;
                    if (i12 == -1) {
                        obj = iconCompat2.f1260b;
                        if (!(obj instanceof Bitmap)) {
                            bitmap = null;
                            bigContentTitle = bigContentTitle.bigPicture(bitmap);
                        }
                    } else if (i12 == 1) {
                        obj = iconCompat2.f1260b;
                    } else if (i12 == 5) {
                        bitmap = IconCompat.a((Bitmap) iconCompat2.f1260b, true);
                        bigContentTitle = bigContentTitle.bigPicture(bitmap);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmap = (Bitmap) obj;
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f12795d) {
            IconCompat iconCompat3 = this.f12794c;
            if (iconCompat3 == null) {
                a.a(bigContentTitle, (Bitmap) null);
            } else {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat3, pVar.f12817a));
            }
        }
        if (i10 >= 31) {
            c.c(bigContentTitle, false);
            c.b(bigContentTitle, (CharSequence) null);
        }
    }

    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}

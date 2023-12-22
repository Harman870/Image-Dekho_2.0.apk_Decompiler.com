package h0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f6682a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f6683a;

        public a(ClipData clipData, int i10) {
            this.f6683a = new ContentInfo.Builder(clipData, i10);
        }

        public final void a(Uri uri) {
            this.f6683a.setLinkUri(uri);
        }

        public final void b(int i10) {
            this.f6683a.setFlags(i10);
        }

        public final c build() {
            return new c(new d(this.f6683a.build()));
        }

        public final void setExtras(Bundle bundle) {
            this.f6683a.setExtras(bundle);
        }
    }

    public interface b {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: h0.c$c  reason: collision with other inner class name */
    public static final class C0090c implements b {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f6684a;

        /* renamed from: b  reason: collision with root package name */
        public int f6685b;

        /* renamed from: c  reason: collision with root package name */
        public int f6686c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f6687d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f6688e;

        public C0090c(ClipData clipData, int i10) {
            this.f6684a = clipData;
            this.f6685b = i10;
        }

        public final void a(Uri uri) {
            this.f6687d = uri;
        }

        public final void b(int i10) {
            this.f6686c = i10;
        }

        public final c build() {
            return new c(new f(this));
        }

        public final void setExtras(Bundle bundle) {
            this.f6688e = bundle;
        }
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f6689a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f6689a = contentInfo;
        }

        public final ClipData a() {
            return this.f6689a.getClip();
        }

        public final int b() {
            return this.f6689a.getFlags();
        }

        public final ContentInfo c() {
            return this.f6689a;
        }

        public final int d() {
            return this.f6689a.getSource();
        }

        public final String toString() {
            StringBuilder g10 = androidx.activity.f.g("ContentInfoCompat{");
            g10.append(this.f6689a);
            g10.append("}");
            return g10.toString();
        }
    }

    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f6690a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6691b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6692c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f6693d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f6694e;

        public f(C0090c cVar) {
            ClipData clipData = cVar.f6684a;
            clipData.getClass();
            this.f6690a = clipData;
            int i10 = cVar.f6685b;
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
            } else if (i10 <= 5) {
                this.f6691b = i10;
                int i11 = cVar.f6686c;
                if ((i11 & 1) == i11) {
                    this.f6692c = i11;
                    this.f6693d = cVar.f6687d;
                    this.f6694e = cVar.f6688e;
                    return;
                }
                StringBuilder g10 = androidx.activity.f.g("Requested flags 0x");
                g10.append(Integer.toHexString(i11));
                g10.append(", but only 0x");
                g10.append(Integer.toHexString(1));
                g10.append(" are allowed");
                throw new IllegalArgumentException(g10.toString());
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
            }
        }

        public final ClipData a() {
            return this.f6690a;
        }

        public final int b() {
            return this.f6692c;
        }

        public final ContentInfo c() {
            return null;
        }

        public final int d() {
            return this.f6691b;
        }

        public final String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder g10 = androidx.activity.f.g("ContentInfoCompat{clip=");
            g10.append(this.f6690a.getDescription());
            g10.append(", source=");
            int i10 = this.f6691b;
            if (i10 == 0) {
                str = "SOURCE_APP";
            } else if (i10 == 1) {
                str = "SOURCE_CLIPBOARD";
            } else if (i10 == 2) {
                str = "SOURCE_INPUT_METHOD";
            } else if (i10 == 3) {
                str = "SOURCE_DRAG_AND_DROP";
            } else if (i10 == 4) {
                str = "SOURCE_AUTOFILL";
            } else if (i10 != 5) {
                str = String.valueOf(i10);
            } else {
                str = "SOURCE_PROCESS_TEXT";
            }
            g10.append(str);
            g10.append(", flags=");
            int i11 = this.f6692c;
            if ((i11 & 1) != 0) {
                str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                str2 = String.valueOf(i11);
            }
            g10.append(str2);
            String str4 = "";
            if (this.f6693d == null) {
                str3 = str4;
            } else {
                StringBuilder g11 = androidx.activity.f.g(", hasLinkUri(");
                g11.append(this.f6693d.toString().length());
                g11.append(")");
                str3 = g11.toString();
            }
            g10.append(str3);
            if (this.f6694e != null) {
                str4 = ", hasExtras";
            }
            return androidx.activity.e.c(g10, str4, "}");
        }
    }

    public c(e eVar) {
        this.f6682a = eVar;
    }

    public final String toString() {
        return this.f6682a.toString();
    }
}

package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface NativeAdDataInterface {

    public static final class Image {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f4103a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f4104b;

        public Image(Drawable drawable, Uri uri) {
            this.f4103a = drawable;
            this.f4104b = uri;
        }

        public final Drawable getDrawable() {
            return this.f4103a;
        }

        public final Uri getUri() {
            return this.f4104b;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}

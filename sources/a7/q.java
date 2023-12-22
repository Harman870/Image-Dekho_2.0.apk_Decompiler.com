package a7;

import a7.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.activity.f;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

public final class q implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f197a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Future<?> f198b;

    /* renamed from: c  reason: collision with root package name */
    public Task<Bitmap> f199c;

    public q(URL url) {
        this.f197a = url;
    }

    public final Bitmap a() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder g10 = f.g("Starting download of: ");
            g10.append(this.f197a);
            Log.i("FirebaseMessaging", g10.toString());
        }
        URLConnection openConnection = this.f197a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] b10 = d.b(new d.a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    StringBuilder g11 = f.g("Downloaded ");
                    g11.append(b10.length);
                    g11.append(" bytes from ");
                    g11.append(this.f197a);
                    Log.v("FirebaseMessaging", g11.toString());
                }
                if (b10.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b10, 0, b10.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            StringBuilder g12 = f.g("Successfully downloaded image: ");
                            g12.append(this.f197a);
                            Log.d("FirebaseMessaging", g12.toString());
                        }
                        return decodeByteArray;
                    }
                    StringBuilder g13 = f.g("Failed to decode image: ");
                    g13.append(this.f197a);
                    throw new IOException(g13.toString());
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final void close() {
        this.f198b.cancel(true);
    }
}

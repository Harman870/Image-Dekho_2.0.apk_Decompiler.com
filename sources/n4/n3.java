package n4;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class n3 extends q7 {
    public n3(w7 w7Var) {
        super(w7Var);
    }

    public final void j() {
    }

    public final boolean k() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9600a.f9986a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}

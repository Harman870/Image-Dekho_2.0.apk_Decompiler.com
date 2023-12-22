package l3;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f9239a = new b();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).f2804b.compareTo(((Scope) obj2).f2804b);
    }
}

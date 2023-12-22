package n4;

import android.accounts.AccountManager;
import androidx.fragment.app.w0;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class l extends b5 {

    /* renamed from: c  reason: collision with root package name */
    public long f9900c;

    /* renamed from: d  reason: collision with root package name */
    public String f9901d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f9902e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f9903f;

    /* renamed from: g  reason: collision with root package name */
    public long f9904g;

    public l(n4 n4Var) {
        super(n4Var);
    }

    public final boolean h() {
        Calendar instance = Calendar.getInstance();
        this.f9900c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f9901d = w0.d(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long k() {
        g();
        return this.f9904g;
    }

    public final long l() {
        i();
        return this.f9900c;
    }

    public final String m() {
        i();
        return this.f9901d;
    }
}

package n9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import k9.e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10388a = new a();

    public class a extends ThreadLocal<DateFormat> {
        public final Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(e.f9159h);
            return simpleDateFormat;
        }
    }
}

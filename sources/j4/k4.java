package j4;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f8284a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f8285b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f8286c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f8287d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public static HashMap f8288e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f8289f = new HashMap(16, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap f8290g = new HashMap(16, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap f8291h = new HashMap(16, 1.0f);

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap f8292i = new HashMap(16, 1.0f);

    /* renamed from: j  reason: collision with root package name */
    public static Object f8293j;
    public static final String[] k = new String[0];

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
    }
}

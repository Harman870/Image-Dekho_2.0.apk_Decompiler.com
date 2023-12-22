package androidx.activity;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import h9.i;
import j6.d;
import j6.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import o.g;

public final /* synthetic */ class f implements d {
    public static int[] _values() {
        return g.c(15);
    }

    public static int[] _values$1() {
        return g.c(11);
    }

    public static final int a(int i10) {
        if (i10 != 6) {
            return d(i10);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int c(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 7;
        }
        if (i10 == 6) {
            return 8;
        }
        if (i10 == 7) {
            return 9;
        }
        if (i10 == 8) {
            return 10;
        }
        if (i10 == 9) {
            return 11;
        }
        if (i10 == 10) {
            return 12;
        }
        if (i10 == 11) {
            return 13;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return -1;
        }
        throw null;
    }

    public static String e(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.y());
        return sb.toString();
    }

    public static String f(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static StringBuilder g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ Iterator i() {
        try {
            return Arrays.asList(new i[]{new AndroidDispatcherFactory()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Map j(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void k(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String l(int i10) {
        if (i10 == 1) {
            return "STATE_NOT_INITIALIZED";
        }
        if (i10 == 2) {
            return "STATE_READY_TO_LOAD";
        }
        if (i10 == 3) {
            return "STATE_AUCTION";
        }
        if (i10 == 4) {
            return "STATE_LOADING_SMASHES";
        }
        if (i10 == 5) {
            return "STATE_READY_TO_SHOW";
        }
        if (i10 == 6) {
            return "STATE_SHOWING";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i10) {
        return i10 == 1 ? "NO_ERROR" : i10 == 2 ? "PROTOCOL_ERROR" : i10 == 3 ? "INTERNAL_ERROR" : i10 == 4 ? "FLOW_CONTROL_ERROR" : i10 == 5 ? "REFUSED_STREAM" : i10 == 6 ? "CANCEL" : i10 == 7 ? "COMPRESSION_ERROR" : i10 == 8 ? "CONNECT_ERROR" : i10 == 9 ? "ENHANCE_YOUR_CALM" : i10 == 10 ? "INADEQUATE_SECURITY" : i10 == 11 ? "HTTP_1_1_REQUIRED" : "null";
    }

    public static /* synthetic */ String n(int i10) {
        return i10 == 1 ? "STATE_NOT_INITIALIZED" : i10 == 2 ? "STATE_READY_TO_LOAD" : i10 == 3 ? "STATE_AUCTION" : i10 == 4 ? "STATE_LOADING_SMASHES" : i10 == 5 ? "STATE_READY_TO_SHOW" : i10 == 6 ? "STATE_SHOWING" : "null";
    }

    public Object h(w wVar) {
        return ExecutorsRegistrar.f3481b.get();
    }
}

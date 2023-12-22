package w3;

import b6.g;
import h4.c;
import h4.f;
import h4.h;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class e {
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    public static Map a(URI uri) {
        String str;
        Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        HashMap hashMap = emptyMap;
        if (rawQuery != null) {
            hashMap = emptyMap;
            if (rawQuery.length() > 0) {
                HashMap hashMap2 = new HashMap();
                g gVar = new g(new c('='));
                h4.e eVar = h4.e.f6881b;
                h hVar = new h(gVar, false, eVar);
                h hVar2 = new h(new g(new c('&')), true, eVar);
                f fVar = new f(hVar2.f6891c, hVar2, rawQuery);
                while (fVar.hasNext()) {
                    String str2 = (String) fVar.next();
                    str2.getClass();
                    f fVar2 = new f(hVar.f6891c, hVar, str2);
                    ArrayList arrayList = new ArrayList();
                    while (fVar2.hasNext()) {
                        arrayList.add((String) fVar2.next());
                    }
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    if (unmodifiableList.isEmpty() || unmodifiableList.size() > 2) {
                        throw new IllegalArgumentException("bad parameter");
                    }
                    try {
                        String decode = URLDecoder.decode((String) unmodifiableList.get(0), "UTF-8");
                        if (unmodifiableList.size() == 2) {
                            try {
                                str = URLDecoder.decode((String) unmodifiableList.get(1), "UTF-8");
                            } catch (UnsupportedEncodingException e10) {
                                throw new IllegalArgumentException(e10);
                            }
                        } else {
                            str = null;
                        }
                        hashMap2.put(decode, str);
                    } catch (UnsupportedEncodingException e11) {
                        throw new IllegalArgumentException(e11);
                    }
                }
                hashMap = hashMap2;
            }
        }
        return hashMap;
    }
}

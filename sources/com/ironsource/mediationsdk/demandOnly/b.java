package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import x8.f;

public interface b {

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final List<com.ironsource.mediationsdk.adunit.a.a> f4398a;

        public a() {
            this(new ArrayList());
        }

        public a(List<com.ironsource.mediationsdk.adunit.a.a> list) {
            f.f(list, "waterfall");
            this.f4398a = list;
        }

        public final com.ironsource.mediationsdk.adunit.a.a a(int i10) {
            return this.f4398a.get(0);
        }

        public final com.ironsource.mediationsdk.adunit.a.a a(String str) {
            T t10;
            f.f(str, ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME);
            Iterator<T> it = this.f4398a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (f.a(((com.ironsource.mediationsdk.adunit.a.a) t10).a(), str)) {
                    break;
                }
            }
            return (com.ironsource.mediationsdk.adunit.a.a) t10;
        }

        public final String a() {
            if (this.f4398a.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder(IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
            List<com.ironsource.mediationsdk.adunit.a.a> list = this.f4398a;
            f.f(list, "<this>");
            if (!list.isEmpty()) {
                sb.append(list.get(0).a());
                return sb.toString();
            }
            throw new NoSuchElementException("List is empty.");
        }

        public final boolean b() {
            return this.f4398a.isEmpty();
        }
    }

    com.ironsource.mediationsdk.adunit.a.a a(int i10);

    com.ironsource.mediationsdk.adunit.a.a a(String str);

    String a();

    boolean b();
}

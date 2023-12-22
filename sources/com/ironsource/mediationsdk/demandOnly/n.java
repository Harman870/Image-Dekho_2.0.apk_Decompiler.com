package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.HashMap;
import x8.f;

public interface n<T> {

    public static final class a implements n<ISDemandOnlyInterstitialListener> {

        /* renamed from: a  reason: collision with root package name */
        public m f4464a = new m();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f4465b = new HashMap();

        public final /* synthetic */ Object a(String str) {
            f.f(str, ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID);
            m mVar = (m) this.f4465b.get(str);
            return mVar != null ? mVar : this.f4464a;
        }

        public final /* synthetic */ void a(Object obj) {
            T t10 = (ISDemandOnlyInterstitialListener) obj;
            f.f(t10, "listener");
            this.f4464a = new m(t10);
            for (m mVar : this.f4465b.values()) {
                mVar.f4449a = t10;
            }
        }
    }

    T a(String str);

    void a(T t10);
}

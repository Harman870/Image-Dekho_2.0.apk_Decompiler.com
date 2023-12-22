package r3;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import m.d;

public final class c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Account f11527a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f11528b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f11529c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<p3.a<?>, u> f11530d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11531e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11532f;

    /* renamed from: g  reason: collision with root package name */
    public final o4.a f11533g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f11534h;

    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public Account f11535a;

        /* renamed from: b  reason: collision with root package name */
        public d<Scope> f11536b;

        /* renamed from: c  reason: collision with root package name */
        public String f11537c;

        /* renamed from: d  reason: collision with root package name */
        public String f11538d;
    }

    public c(@Nullable Account account, d dVar, String str, String str2) {
        o4.a aVar = o4.a.f10593a;
        this.f11527a = account;
        Set<Scope> emptySet = dVar == null ? Collections.emptySet() : Collections.unmodifiableSet(dVar);
        this.f11528b = emptySet;
        Map<p3.a<?>, u> emptyMap = Collections.emptyMap();
        this.f11530d = emptyMap;
        this.f11531e = str;
        this.f11532f = str2;
        this.f11533g = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (u uVar : emptyMap.values()) {
            uVar.getClass();
            hashSet.addAll((Collection) null);
        }
        this.f11529c = Collections.unmodifiableSet(hashSet);
    }
}

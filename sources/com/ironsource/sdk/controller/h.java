package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.C0181d;
import com.ironsource.mediationsdk.C0182e;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
import x8.f;

public interface h extends C0181d {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f5468a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5469b;

        /* renamed from: com.ironsource.sdk.controller.h$a$a  reason: collision with other inner class name */
        public static final class C0063a {
            private C0063a() {
            }

            public /* synthetic */ C0063a(byte b10) {
                this();
            }
        }

        static {
            new C0063a((byte) 0);
        }

        public a(String str, JSONObject jSONObject) {
            f.f(str, "msgId");
            this.f5469b = str;
            this.f5468a = jSONObject;
        }

        public static final a a(String str) {
            f.f(str, "jsonStr");
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("msgId");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            f.e(string, "id");
            return new a(string, optJSONObject);
        }

        public final String a() {
            return this.f5469b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.a(this.f5469b, aVar.f5469b) && f.a(this.f5468a, aVar.f5468a);
        }

        public final int hashCode() {
            int hashCode = this.f5469b.hashCode() * 31;
            JSONObject jSONObject = this.f5468a;
            return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public final String toString() {
            return "CallbackToNative(msgId=" + this.f5469b + ", params=" + this.f5468a + ')';
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f5470a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5471b;

        /* renamed from: c  reason: collision with root package name */
        public final JSONObject f5472c;

        /* renamed from: d  reason: collision with root package name */
        public String f5473d;

        public b(String str, String str2, JSONObject jSONObject) {
            f.f(str, "adId");
            f.f(str2, "command");
            f.f(jSONObject, "params");
            this.f5470a = str;
            this.f5471b = str2;
            this.f5472c = jSONObject;
            String uuid = UUID.randomUUID().toString();
            f.e(uuid, "randomUUID().toString()");
            this.f5473d = uuid;
        }

        public final String a() {
            return this.f5471b;
        }

        public final String b() {
            return this.f5473d;
        }

        public final String c() {
            String jSONObject = new JSONObject().put("msgId", this.f5473d).put("adId", this.f5470a).put("params", this.f5472c).toString();
            f.e(jSONObject, "JSONObject()\n\t\t\t\t.put(Co…, params)\n\t\t\t\t.toString()");
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar == null) {
                return false;
            }
            if (this == bVar) {
                return true;
            }
            return f.a(this.f5473d, bVar.f5473d) && f.a(this.f5470a, bVar.f5470a) && f.a(this.f5471b, bVar.f5471b) && f.a(this.f5472c.toString(), bVar.f5472c.toString());
        }

        public final int hashCode() {
            return super.hashCode();
        }

        public final String toString() {
            return "MessageToController(adId=" + this.f5470a + ", command=" + this.f5471b + ", params=" + this.f5472c + ')';
        }
    }

    /* synthetic */ void a(int i10, String str, int i11, String str2, long j10);

    void a(C0182e.a aVar, long j10, int i10, String str);

    /* synthetic */ void a(List<com.ironsource.mediationsdk.adunit.a.a> list, String str, com.ironsource.mediationsdk.adunit.a.a aVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2);
}

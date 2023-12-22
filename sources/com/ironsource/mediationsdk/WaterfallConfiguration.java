package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;
import x8.d;
import x8.f;

public final class WaterfallConfiguration {
    public static final Companion Companion = new Companion((d) null);

    /* renamed from: a  reason: collision with root package name */
    public final Double f4060a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f4061b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final WaterfallConfigurationBuilder builder() {
            return new WaterfallConfigurationBuilder();
        }

        public final WaterfallConfiguration empty() {
            return builder().build();
        }
    }

    public static final class WaterfallConfigurationBuilder {

        /* renamed from: a  reason: collision with root package name */
        public Double f4062a;

        /* renamed from: b  reason: collision with root package name */
        public Double f4063b;

        public final WaterfallConfiguration build() {
            return new WaterfallConfiguration(this, (d) null);
        }

        public final Double getCeiling$mediationsdk_release() {
            return this.f4063b;
        }

        public final Double getFloor$mediationsdk_release() {
            return this.f4062a;
        }

        public final WaterfallConfigurationBuilder setCeiling(double d10) {
            this.f4063b = Double.valueOf(d10);
            return this;
        }

        public final void setCeiling$mediationsdk_release(Double d10) {
            this.f4063b = d10;
        }

        public final WaterfallConfigurationBuilder setFloor(double d10) {
            this.f4062a = Double.valueOf(d10);
            return this;
        }

        public final void setFloor$mediationsdk_release(Double d10) {
            this.f4062a = d10;
        }
    }

    public WaterfallConfiguration(WaterfallConfigurationBuilder waterfallConfigurationBuilder, d dVar) {
        this.f4060a = waterfallConfigurationBuilder.getFloor$mediationsdk_release();
        this.f4061b = waterfallConfigurationBuilder.getCeiling$mediationsdk_release();
    }

    public static final WaterfallConfigurationBuilder builder() {
        return Companion.builder();
    }

    public static final WaterfallConfiguration empty() {
        return Companion.empty();
    }

    public final Double getCeiling() {
        return this.f4061b;
    }

    public final Double getFloor() {
        return this.f4060a;
    }

    public final String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f4061b);
            jSONObject.put("floor", this.f4060a);
        } catch (JSONException e10) {
            IronLog.INTERNAL.error(e10.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        f.e(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public final String toString() {
        return "WaterfallConfiguration" + toJsonString();
    }
}

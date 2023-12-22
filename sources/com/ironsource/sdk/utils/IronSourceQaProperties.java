package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

public class IronSourceQaProperties {

    /* renamed from: a  reason: collision with root package name */
    public static IronSourceQaProperties f5749a;

    /* renamed from: b  reason: collision with root package name */
    public static HashMap f5750b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f5749a == null) {
            f5749a = new IronSourceQaProperties();
        }
        return f5749a;
    }

    public static boolean isInitialized() {
        return f5749a != null;
    }

    public Map<String, String> getParameters() {
        return f5750b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f5750b.put(str, str2);
        }
    }
}

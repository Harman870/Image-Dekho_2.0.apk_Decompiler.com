package com.ironsource.mediationsdk.config;

public class ConfigFile {

    /* renamed from: e  reason: collision with root package name */
    public static ConfigFile f4369e;

    /* renamed from: a  reason: collision with root package name */
    public String f4370a;

    /* renamed from: b  reason: collision with root package name */
    public String f4371b;

    /* renamed from: c  reason: collision with root package name */
    public String f4372c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f4373d = {"AdobeAir", "Cocos2dx", "Cordova", "Corona", "Defold", "Flutter", "ReactNative", "Unity", "Unreal", "Xamarin", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        ConfigFile configFile;
        synchronized (ConfigFile.class) {
            if (f4369e == null) {
                f4369e = new ConfigFile();
            }
            configFile = f4369e;
        }
        return configFile;
    }

    public String getPluginFrameworkVersion() {
        return this.f4372c;
    }

    public String getPluginType() {
        return this.f4370a;
    }

    public String getPluginVersion() {
        return this.f4371b;
    }

    public void setPluginData(String str, String str2, String str3) {
        this.f4370a = null;
        if (str != null) {
            String[] strArr = this.f4373d;
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String str4 = strArr[i10];
                if (str.equalsIgnoreCase(str4)) {
                    this.f4370a = str4;
                    break;
                }
                i10++;
            }
        }
        if (str2 != null) {
            this.f4371b = str2;
        }
        if (str3 != null) {
            this.f4372c = str3;
        }
    }
}

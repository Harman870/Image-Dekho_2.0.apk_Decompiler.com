package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import androidx.activity.e;
import androidx.fragment.app.w0;
import com.ironsource.adapters.ironsource.a;
import com.ironsource.mediationsdk.logger.IronSourceError;

public class ErrorBuilder {
    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, a.g(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, a.g(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str);
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = a.g(str2, " init failed due to an unknown error");
        } else {
            str3 = w0.d(str2, " - ", str);
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, str3);
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, a.g(str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder("Init Fail - ");
        sb.append(str);
        sb.append(" value ");
        sb.append(str2);
        sb.append(" is not valid");
        if (!TextUtils.isEmpty(str3)) {
            str4 = a.j(" - ", str3);
        } else {
            str4 = "";
        }
        sb.append(str4);
        return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sb.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return buildGenericError("Mediation - wrong configuration");
        }
        StringBuilder sb = new StringBuilder("Mediation - ");
        sb.append(str);
        sb.append(" value is not valid for ");
        sb.append(str2);
        if (!TextUtils.isEmpty(str3)) {
            str4 = a.j(" - ", str3);
        } else {
            str4 = "";
        }
        sb.append(str4);
        return new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, sb.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return buildGenericError("Mediation - wrong configuration");
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_KEY_NOT_SET, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : a.j("Load failed - ", str));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, a.g(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, a.g(str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, a.g(str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, a.g(str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, a.g(str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, a.g(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, w0.d(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION, "Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:" + str + " and userId:" + str2);
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, a.g(str, " unsupported banner size"));
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String c10 = e.c(a.h(str, " Load Fail"), !TextUtils.isEmpty(str2) ? a.j(" ", str2) : "", " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, a.g(c10, str3));
    }
}

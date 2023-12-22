package com.ironsource.mediationsdk.adunit.b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.events.e;
import com.ironsource.mediationsdk.events.i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public c f4157a;

    /* renamed from: b  reason: collision with root package name */
    public g f4158b;

    /* renamed from: c  reason: collision with root package name */
    public h f4159c;

    /* renamed from: d  reason: collision with root package name */
    public i f4160d;

    /* renamed from: e  reason: collision with root package name */
    public e f4161e;

    /* renamed from: f  reason: collision with root package name */
    public a f4162f;

    /* renamed from: g  reason: collision with root package name */
    public j f4163g;

    /* renamed from: h  reason: collision with root package name */
    public final IronSource.AD_UNIT f4164h;

    /* renamed from: i  reason: collision with root package name */
    public final b f4165i;

    /* renamed from: j  reason: collision with root package name */
    public com.ironsource.mediationsdk.events.b f4166j;
    public HashMap k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap f4167l;

    /* renamed from: m  reason: collision with root package name */
    public HashMap f4168m;

    /* renamed from: n  reason: collision with root package name */
    public HashMap f4169n;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4170a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4171b;

        public a(int i10, int i11) {
            this.f4170a = i10;
            this.f4171b = i11;
        }

        public final int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f4170a : this.f4171b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public d(IronSource.AD_UNIT ad_unit, b bVar, c cVar) {
        com.ironsource.mediationsdk.events.b bVar2;
        IronSource.AD_UNIT ad_unit2 = ad_unit;
        this.f4164h = ad_unit2;
        this.f4165i = bVar;
        this.f4157a = cVar;
        if (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit2.equals(IronSource.AD_UNIT.OFFERWALL)) {
            bVar2 = i.d();
        } else {
            bVar2 = e.d();
        }
        this.f4166j = bVar2;
        HashMap hashMap = new HashMap();
        this.k = hashMap;
        b bVar3 = b.INIT_STARTED;
        androidx.activity.e.e(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1, hashMap, bVar3);
        HashMap hashMap2 = this.k;
        b bVar4 = b.INIT_ENDED;
        androidx.activity.e.e(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1, hashMap2, bVar4);
        HashMap hashMap3 = this.k;
        b bVar5 = b.SESSION_CAPPED;
        androidx.activity.e.e(-1, IronSourceConstants.IS_CAP_SESSION, hashMap3, bVar5);
        HashMap hashMap4 = this.k;
        b bVar6 = b.PLACEMENT_CAPPED;
        androidx.activity.e.e(IronSourceConstants.IS_CAP_PLACEMENT, -1, hashMap4, bVar6);
        HashMap hashMap5 = this.k;
        b bVar7 = b.AUCTION_REQUEST;
        androidx.activity.e.e(2000, -1, hashMap5, bVar7);
        HashMap hashMap6 = this.k;
        b bVar8 = b.AUCTION_SUCCESS;
        androidx.activity.e.e(IronSourceConstants.IS_AUCTION_SUCCESS, -1, hashMap6, bVar8);
        HashMap hashMap7 = this.k;
        b bVar9 = b.AUCTION_FAILED;
        androidx.activity.e.e(IronSourceConstants.IS_AUCTION_FAILED, -1, hashMap7, bVar9);
        HashMap hashMap8 = this.k;
        b bVar10 = b.AUCTION_REQUEST_WATERFALL;
        androidx.activity.e.e(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1, hashMap8, bVar10);
        HashMap hashMap9 = this.k;
        b bVar11 = b.AUCTION_RESULT_WATERFALL;
        androidx.activity.e.e(IronSourceConstants.IS_RESULT_WATERFALL, -1, hashMap9, bVar11);
        HashMap hashMap10 = this.k;
        b bVar12 = b.INIT_SUCCESS;
        androidx.activity.e.e(-1, -1, hashMap10, bVar12);
        HashMap hashMap11 = this.k;
        b bVar13 = b.INIT_FAILED;
        androidx.activity.e.e(-1, -1, hashMap11, bVar13);
        androidx.activity.e.e(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, this.k, b.SHOW_AD_SUCCESS);
        HashMap hashMap12 = this.k;
        b bVar14 = b.AD_OPENED;
        androidx.activity.e.e(-1, IronSourceConstants.IS_INSTANCE_OPENED, hashMap12, bVar14);
        HashMap hashMap13 = this.k;
        b bVar15 = b.AD_CLOSED;
        b bVar16 = bVar14;
        androidx.activity.e.e(-1, IronSourceConstants.IS_INSTANCE_CLOSED, hashMap13, bVar15);
        HashMap hashMap14 = this.k;
        b bVar17 = b.AD_CLICKED;
        b bVar18 = bVar15;
        androidx.activity.e.e(-1, 2006, hashMap14, bVar17);
        HashMap hashMap15 = this.k;
        b bVar19 = b.LOAD_AD;
        b bVar20 = bVar17;
        androidx.activity.e.e(2001, 2002, hashMap15, bVar19);
        HashMap hashMap16 = this.k;
        b bVar21 = b.LOAD_AD_SUCCESS;
        b bVar22 = bVar19;
        androidx.activity.e.e(2004, 2003, hashMap16, bVar21);
        HashMap hashMap17 = this.k;
        b bVar23 = b.LOAD_AD_FAILED_WITH_REASON;
        b bVar24 = bVar21;
        androidx.activity.e.e(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED, hashMap17, bVar23);
        HashMap hashMap18 = this.k;
        b bVar25 = b.LOAD_AD_NO_FILL;
        b bVar26 = bVar23;
        androidx.activity.e.e(-1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, hashMap18, bVar25);
        HashMap hashMap19 = this.k;
        b bVar27 = b.SHOW_AD;
        b bVar28 = bVar25;
        androidx.activity.e.e(2100, IronSourceConstants.IS_INSTANCE_SHOW, hashMap19, bVar27);
        HashMap hashMap20 = this.k;
        b bVar29 = b.SHOW_AD_FAILED;
        b bVar30 = bVar27;
        androidx.activity.e.e(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED, hashMap20, bVar29);
        HashMap hashMap21 = this.k;
        b bVar31 = b.AD_UNIT_CAPPED;
        b bVar32 = bVar29;
        androidx.activity.e.e(IronSourceConstants.IS_AD_UNIT_CAPPED, -1, hashMap21, bVar31);
        HashMap hashMap22 = this.k;
        b bVar33 = b.COLLECT_TOKEN;
        b bVar34 = bVar31;
        androidx.activity.e.e(IronSourceConstants.IS_COLLECT_TOKENS, -1, hashMap22, bVar33);
        HashMap hashMap23 = this.k;
        b bVar35 = b.COLLECT_TOKENS_COMPLETED;
        b bVar36 = bVar33;
        androidx.activity.e.e(IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, -1, hashMap23, bVar35);
        HashMap hashMap24 = this.k;
        b bVar37 = b.COLLECT_TOKENS_FAILED;
        b bVar38 = bVar35;
        androidx.activity.e.e(IronSourceConstants.IS_COLLECT_TOKENS_FAILED, -1, hashMap24, bVar37);
        HashMap hashMap25 = this.k;
        b bVar39 = b.INSTANCE_COLLECT_TOKEN;
        b bVar40 = bVar37;
        androidx.activity.e.e(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN, -1, hashMap25, bVar39);
        HashMap hashMap26 = this.k;
        b bVar41 = b.INSTANCE_COLLECT_TOKEN_SUCCESS;
        b bVar42 = bVar39;
        androidx.activity.e.e(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, -1, hashMap26, bVar41);
        HashMap hashMap27 = this.k;
        b bVar43 = b.INSTANCE_COLLECT_TOKEN_FAILED;
        b bVar44 = bVar41;
        androidx.activity.e.e(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, -1, hashMap27, bVar43);
        HashMap hashMap28 = this.k;
        b bVar45 = b.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        b bVar46 = bVar43;
        androidx.activity.e.e(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, -1, hashMap28, bVar45);
        HashMap hashMap29 = this.k;
        b bVar47 = b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, hashMap29, bVar47);
        HashMap hashMap30 = this.k;
        b bVar48 = b.TROUBLESHOOT_BIDDING_DATA_MISSING;
        b bVar49 = bVar47;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, hashMap30, bVar48);
        HashMap hashMap31 = this.k;
        b bVar50 = b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        b bVar51 = bVar48;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, hashMap31, bVar50);
        HashMap hashMap32 = this.k;
        b bVar52 = b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        b bVar53 = bVar50;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, hashMap32, bVar52);
        HashMap hashMap33 = this.k;
        b bVar54 = b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        b bVar55 = bVar52;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, hashMap33, bVar54);
        HashMap hashMap34 = this.k;
        b bVar56 = b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        b bVar57 = bVar54;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, hashMap34, bVar56);
        HashMap hashMap35 = this.k;
        b bVar58 = b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        b bVar59 = bVar56;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, hashMap35, bVar58);
        HashMap hashMap36 = this.k;
        b bVar60 = b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        b bVar61 = bVar58;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, hashMap36, bVar60);
        HashMap hashMap37 = this.k;
        b bVar62 = b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        b bVar63 = bVar60;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, hashMap37, bVar62);
        HashMap hashMap38 = this.k;
        b bVar64 = b.TROUBLESHOOT_UNEXPECTED_CLOSED;
        b bVar65 = bVar62;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, hashMap38, bVar64);
        HashMap hashMap39 = this.k;
        b bVar66 = b.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        b bVar67 = bVar64;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, hashMap39, bVar66);
        HashMap hashMap40 = this.k;
        b bVar68 = b.TROUBLESHOOT_INTERNAL_ERROR;
        b bVar69 = bVar66;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, hashMap40, bVar68);
        HashMap hashMap41 = this.k;
        b bVar70 = b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        b bVar71 = bVar68;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, hashMap41, bVar70);
        HashMap hashMap42 = this.k;
        b bVar72 = b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        b bVar73 = bVar70;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap42, bVar72);
        HashMap hashMap43 = this.k;
        b bVar74 = b.TROUBLESHOOT_NOTIFICATION_ERROR;
        b bVar75 = bVar72;
        b bVar76 = bVar45;
        hashMap43.put(bVar74, new a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap44 = new HashMap();
        this.f4167l = hashMap44;
        androidx.activity.e.e(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1, hashMap44, bVar3);
        androidx.activity.e.e(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1, this.f4167l, bVar4);
        androidx.activity.e.e(-1, IronSourceConstants.RV_CAP_SESSION, this.f4167l, bVar5);
        androidx.activity.e.e(IronSourceConstants.RV_CAP_PLACEMENT, -1, this.f4167l, bVar6);
        androidx.activity.e.e(IronSourceConstants.RV_AUCTION_REQUEST, -1, this.f4167l, bVar7);
        androidx.activity.e.e(IronSourceConstants.RV_AUCTION_SUCCESS, -1, this.f4167l, bVar8);
        androidx.activity.e.e(IronSourceConstants.RV_AUCTION_FAILED, -1, this.f4167l, bVar9);
        androidx.activity.e.e(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1, this.f4167l, bVar10);
        androidx.activity.e.e(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1, this.f4167l, bVar11);
        androidx.activity.e.e(-1, -1, this.f4167l, bVar12);
        b bVar77 = bVar13;
        androidx.activity.e.e(-1, -1, this.f4167l, bVar77);
        androidx.activity.e.e(-1, IronSourceConstants.RV_INSTANCE_VISIBLE, this.f4167l, b.AD_VISIBLE);
        androidx.activity.e.e(-1, 1005, this.f4167l, bVar16);
        androidx.activity.e.e(-1, IronSourceConstants.RV_INSTANCE_CLOSED, this.f4167l, bVar18);
        androidx.activity.e.e(-1, IronSourceConstants.RV_INSTANCE_STARTED, this.f4167l, b.AD_STARTED);
        androidx.activity.e.e(-1, IronSourceConstants.RV_INSTANCE_ENDED, this.f4167l, b.AD_ENDED);
        androidx.activity.e.e(-1, 1006, this.f4167l, bVar20);
        androidx.activity.e.e(-1, 1010, this.f4167l, b.AD_REWARDED);
        androidx.activity.e.e(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, this.f4167l, b.AD_AVAILABILITY_CHANGED_TRUE);
        androidx.activity.e.e(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, this.f4167l, b.AD_AVAILABILITY_CHANGED_FALSE);
        androidx.activity.e.e(1000, 1001, this.f4167l, bVar22);
        androidx.activity.e.e(1003, 1002, this.f4167l, bVar24);
        androidx.activity.e.e(-1, IronSourceConstants.RV_INSTANCE_LOAD_FAILED, this.f4167l, b.LOAD_AD_FAILED);
        androidx.activity.e.e(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, this.f4167l, bVar26);
        androidx.activity.e.e(-1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, this.f4167l, bVar28);
        androidx.activity.e.e(IronSourceConstants.RV_API_SHOW_CALLED, IronSourceConstants.RV_INSTANCE_SHOW, this.f4167l, bVar30);
        androidx.activity.e.e(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, this.f4167l, b.SHOW_AD_CHANCE);
        androidx.activity.e.e(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, IronSourceConstants.RV_INSTANCE_SHOW_FAILED, this.f4167l, bVar32);
        androidx.activity.e.e(IronSourceConstants.RV_AD_UNIT_CAPPED, -1, this.f4167l, bVar34);
        androidx.activity.e.e(IronSourceConstants.RV_COLLECT_TOKENS, -1, this.f4167l, bVar36);
        androidx.activity.e.e(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, -1, this.f4167l, bVar38);
        androidx.activity.e.e(IronSourceConstants.RV_COLLECT_TOKENS_FAILED, -1, this.f4167l, bVar40);
        b bVar78 = bVar42;
        androidx.activity.e.e(1020, -1, this.f4167l, bVar78);
        androidx.activity.e.e(1021, 1021, this.f4167l, bVar44);
        androidx.activity.e.e(1022, 1022, this.f4167l, bVar46);
        androidx.activity.e.e(1023, 1023, this.f4167l, bVar76);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, this.f4167l, bVar49);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, this.f4167l, bVar51);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, this.f4167l, bVar53);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, this.f4167l, bVar55);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, this.f4167l, bVar57);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, this.f4167l, bVar59);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, this.f4167l, bVar61);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, this.f4167l, bVar63);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, this.f4167l, bVar65);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, this.f4167l, bVar69);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, this.f4167l, bVar67);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, this.f4167l, b.TROUBLESHOOT_LOAD_FAILED);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, this.f4167l, bVar71);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, this.f4167l, bVar73);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, this.f4167l, b.TROUBLESHOOTING_WATERFALL_OVERHEAD);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1, this.f4167l, bVar74);
        b bVar79 = bVar74;
        this.f4167l.put(b.TROUBLESHOOT_AD_EXPIRED, new a(IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED, IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED));
        HashMap hashMap45 = new HashMap();
        this.f4168m = hashMap45;
        androidx.activity.e.e(IronSourceConstants.BN_MANAGER_INIT_STARTED, -1, hashMap45, bVar3);
        androidx.activity.e.e(IronSourceConstants.BN_MANAGER_INIT_ENDED, -1, this.f4168m, bVar4);
        androidx.activity.e.e(IronSourceConstants.BN_PLACEMENT_CAPPED, -1, this.f4168m, bVar6);
        androidx.activity.e.e(IronSourceConstants.BN_AUCTION_REQUEST, -1, this.f4168m, bVar7);
        androidx.activity.e.e(IronSourceConstants.BN_AUCTION_SUCCESS, -1, this.f4168m, bVar8);
        androidx.activity.e.e(IronSourceConstants.BN_AUCTION_FAILED, -1, this.f4168m, bVar9);
        androidx.activity.e.e(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, -1, this.f4168m, bVar10);
        androidx.activity.e.e(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, -1, this.f4168m, bVar11);
        androidx.activity.e.e(-1, -1, this.f4168m, bVar12);
        androidx.activity.e.e(-1, -1, this.f4168m, bVar77);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_SHOW, IronSourceConstants.BN_INSTANCE_SHOW, this.f4168m, bVar16);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_CLICK, IronSourceConstants.BN_INSTANCE_CLICK, this.f4168m, bVar20);
        androidx.activity.e.e(3001, IronSourceConstants.BN_INSTANCE_LOAD, this.f4168m, bVar22);
        androidx.activity.e.e(IronSourceConstants.BN_RELOAD, IronSourceConstants.BN_INSTANCE_RELOAD, this.f4168m, b.RELOAD_AD);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, this.f4168m, bVar24);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, this.f4168m, b.RELOAD_AD_SUCCESS);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, IronSourceConstants.BN_INSTANCE_LOAD_ERROR, this.f4168m, bVar26);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, this.f4168m, b.RELOAD_AD_FAILED_WITH_REASON);
        androidx.activity.e.e(-1, IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, this.f4168m, bVar28);
        androidx.activity.e.e(-1, IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, this.f4168m, b.RELOAD_AD_NO_FILL);
        androidx.activity.e.e(IronSourceConstants.BN_AD_UNIT_CAPPED, -1, this.f4168m, bVar34);
        androidx.activity.e.e(IronSourceConstants.BN_COLLECT_TOKENS, -1, this.f4168m, bVar36);
        androidx.activity.e.e(IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, -1, this.f4168m, bVar38);
        b bVar80 = bVar40;
        androidx.activity.e.e(IronSourceConstants.BN_COLLECT_TOKENS_FAILED, -1, this.f4168m, bVar80);
        androidx.activity.e.e(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN, -1, this.f4168m, bVar78);
        androidx.activity.e.e(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, this.f4168m, bVar44);
        androidx.activity.e.e(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, this.f4168m, bVar46);
        androidx.activity.e.e(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, this.f4168m, bVar76);
        HashMap hashMap46 = this.f4168m;
        b bVar81 = b.DESTROY_AD;
        androidx.activity.e.e(IronSourceConstants.BN_DESTROY, IronSourceConstants.BN_INSTANCE_DESTROY, hashMap46, bVar81);
        b bVar82 = bVar81;
        androidx.activity.e.e(IronSourceConstants.BN_SKIP_RELOAD, -1, this.f4168m, b.SKIP_RELOAD_AD);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_LEAVE_APP, IronSourceConstants.BN_INSTANCE_LEAVE_APP, this.f4168m, b.AD_LEFT_APPLICATION);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, this.f4168m, b.AD_PRESENT_SCREEN);
        androidx.activity.e.e(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, this.f4168m, b.AD_DISMISS_SCREEN);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING, this.f4168m, bVar49);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, this.f4168m, bVar51);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS, this.f4168m, bVar53);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED, this.f4168m, bVar55);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS, this.f4168m, bVar57);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED, this.f4168m, bVar59);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS, this.f4168m, bVar61);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED, this.f4168m, bVar63);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS, this.f4168m, b.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED, this.f4168m, b.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT, this.f4168m, bVar69);
        HashMap hashMap47 = this.f4168m;
        b bVar83 = b.TROUBLESHOOT_UNEXPECTED_OPENED;
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED, hashMap47, bVar83);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, this.f4168m, bVar71);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, this.f4168m, bVar73);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, this.f4168m, bVar75);
        b bVar84 = bVar79;
        this.f4168m.put(bVar84, new a(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap48 = new HashMap();
        this.f4169n = hashMap48;
        androidx.activity.e.e(IronSourceConstants.NT_MANAGER_INIT_STARTED, -1, hashMap48, bVar3);
        androidx.activity.e.e(IronSourceConstants.NT_MANAGER_INIT_ENDED, -1, this.f4169n, bVar4);
        androidx.activity.e.e(IronSourceConstants.NT_PLACEMENT_CAPPED, -1, this.f4169n, bVar6);
        androidx.activity.e.e(IronSourceConstants.NT_AUCTION_REQUEST, -1, this.f4169n, bVar7);
        androidx.activity.e.e(IronSourceConstants.NT_AUCTION_SUCCESS, -1, this.f4169n, bVar8);
        androidx.activity.e.e(IronSourceConstants.NT_AUCTION_FAILED, -1, this.f4169n, bVar9);
        androidx.activity.e.e(IronSourceConstants.NT_AUCTION_REQUEST_WATERFALL, -1, this.f4169n, bVar10);
        androidx.activity.e.e(IronSourceConstants.NT_AUCTION_RESPONSE_WATERFALL, -1, this.f4169n, bVar11);
        androidx.activity.e.e(-1, -1, this.f4169n, bVar12);
        androidx.activity.e.e(-1, -1, this.f4169n, bVar77);
        androidx.activity.e.e(IronSourceConstants.NT_CALLBACK_SHOW, IronSourceConstants.NT_INSTANCE_SHOW, this.f4169n, bVar16);
        androidx.activity.e.e(IronSourceConstants.NT_CALLBACK_CLICK, IronSourceConstants.NT_INSTANCE_CLICK, this.f4169n, bVar20);
        androidx.activity.e.e(IronSourceConstants.NT_LOAD, IronSourceConstants.NT_INSTANCE_LOAD, this.f4169n, bVar22);
        androidx.activity.e.e(IronSourceConstants.NT_CALLBACK_LOAD_SUCCESS, IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS, this.f4169n, bVar24);
        androidx.activity.e.e(IronSourceConstants.NT_CALLBACK_LOAD_ERROR, IronSourceConstants.NT_INSTANCE_LOAD_ERROR, this.f4169n, bVar26);
        androidx.activity.e.e(-1, IronSourceConstants.NT_INSTANCE_LOAD_NO_FILL, this.f4169n, bVar28);
        androidx.activity.e.e(IronSourceConstants.NT_AD_UNIT_CAPPED, -1, this.f4169n, bVar34);
        androidx.activity.e.e(IronSourceConstants.NT_COLLECT_TOKENS, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, this.f4169n, bVar36);
        androidx.activity.e.e(IronSourceConstants.NT_COLLECT_TOKENS_COMPLETED, -1, this.f4169n, bVar38);
        androidx.activity.e.e(IronSourceConstants.NT_COLLECT_TOKENS_FAILED, -1, this.f4169n, bVar80);
        androidx.activity.e.e(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, -1, this.f4169n, bVar42);
        androidx.activity.e.e(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, this.f4169n, bVar44);
        androidx.activity.e.e(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, this.f4169n, bVar46);
        androidx.activity.e.e(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, this.f4169n, bVar76);
        androidx.activity.e.e(IronSourceConstants.NT_DESTROY, IronSourceConstants.NT_INSTANCE_DESTROY, this.f4169n, bVar82);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING, this.f4169n, bVar49);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_NT_BIDDING_DATA_MISSING, this.f4169n, bVar51);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS, this.f4169n, bVar53);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED, this.f4169n, bVar55);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS, this.f4169n, bVar57);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED, this.f4169n, bVar59);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS, this.f4169n, bVar61);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED, this.f4169n, bVar63);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT, this.f4169n, bVar69);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED, this.f4169n, bVar83);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR, this.f4169n, bVar71);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, this.f4169n, bVar73);
        androidx.activity.e.e(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, this.f4169n, bVar75);
        this.f4169n.put(bVar84, new a(IronSourceConstants.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, -1));
        this.f4158b = new g(this);
        this.f4159c = new h(this);
        this.f4160d = new i(this);
        this.f4161e = new e(this);
        this.f4162f = new a(this);
        this.f4163g = new j(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.mediationsdk.adunit.b.b r4, java.util.HashMap r5, long r6) {
        /*
            r3 = this;
            r0 = -1
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r3.f4164h     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x001e
            java.util.HashMap r1 = r3.k     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x001e
            java.util.HashMap r1 = r3.k     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.adunit.b.d$a r1 = (com.ironsource.mediationsdk.adunit.b.d.a) r1     // Catch:{ Exception -> 0x0074 }
        L_0x001b:
            com.ironsource.mediationsdk.adunit.b.d$b r2 = r3.f4165i     // Catch:{ Exception -> 0x0074 }
            goto L_0x006f
        L_0x001e:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r3.f4164h     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0039
            java.util.HashMap r1 = r3.f4167l     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0039
            java.util.HashMap r1 = r3.f4167l     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.adunit.b.d$a r1 = (com.ironsource.mediationsdk.adunit.b.d.a) r1     // Catch:{ Exception -> 0x0074 }
            goto L_0x001b
        L_0x0039:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r3.f4164h     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0054
            java.util.HashMap r1 = r3.f4168m     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0054
            java.util.HashMap r1 = r3.f4168m     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.adunit.b.d$a r1 = (com.ironsource.mediationsdk.adunit.b.d.a) r1     // Catch:{ Exception -> 0x0074 }
            goto L_0x001b
        L_0x0054:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r3.f4164h     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0078
            java.util.HashMap r1 = r3.f4169n     // Catch:{ Exception -> 0x0074 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0078
            java.util.HashMap r1 = r3.f4169n     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0074 }
            com.ironsource.mediationsdk.adunit.b.d$a r1 = (com.ironsource.mediationsdk.adunit.b.d.a) r1     // Catch:{ Exception -> 0x0074 }
            goto L_0x001b
        L_0x006f:
            int r1 = r1.a(r2)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0079
        L_0x0074:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0078:
            r1 = r0
        L_0x0079:
            if (r0 != r1) goto L_0x007c
            return
        L_0x007c:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.ironsource.mediationsdk.adunit.b.c r2 = r3.f4157a
            if (r2 == 0) goto L_0x008c
            java.util.Map r4 = r2.a(r4)
            r0.putAll(r4)
        L_0x008c:
            if (r5 == 0) goto L_0x0097
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0097
            r0.putAll(r5)
        L_0x0097:
            com.ironsource.environment.c.a r4 = new com.ironsource.environment.c.a
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>(r0)
            r4.<init>(r1, r6, r5)
            com.ironsource.mediationsdk.events.b r5 = r3.f4166j
            r5.a((com.ironsource.environment.c.a) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.b.d.a(com.ironsource.mediationsdk.adunit.b.b, java.util.HashMap, long):void");
    }
}

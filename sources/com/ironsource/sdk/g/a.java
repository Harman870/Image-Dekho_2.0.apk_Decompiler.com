package com.ironsource.sdk.g;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public String f5602a;

    /* renamed from: b  reason: collision with root package name */
    public String f5603b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5604c;

    public a(String str) {
        super(str);
        boolean z9;
        if (a("type")) {
            d("type");
        }
        if (a("numOfAdUnits")) {
            this.f5603b = d("numOfAdUnits");
            z9 = true;
        } else {
            z9 = false;
        }
        this.f5604c = z9;
        if (a("firstCampaignCredits")) {
            d("firstCampaignCredits");
        }
        if (a("totalNumberCredits")) {
            d("totalNumberCredits");
        }
        if (a("productType")) {
            this.f5602a = d("productType");
        }
    }
}

package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetaData {

    /* renamed from: a  reason: collision with root package name */
    public String f4678a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f4679b;

    /* renamed from: c  reason: collision with root package name */
    public List<MetaDataValueTypes> f4680c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f4678a = str;
        this.f4679b = list;
        this.f4680c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f4680c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f4678a = str;
        this.f4679b = list;
        this.f4680c = list2;
    }

    public String getMetaDataKey() {
        return this.f4678a;
    }

    public List<String> getMetaDataValue() {
        return this.f4679b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f4680c;
    }
}

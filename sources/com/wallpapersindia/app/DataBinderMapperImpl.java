package com.wallpapersindia.app;

import android.util.SparseIntArray;
import androidx.databinding.a;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends a {
    static {
        new SparseIntArray(0);
    }

    public final List<a> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }
}

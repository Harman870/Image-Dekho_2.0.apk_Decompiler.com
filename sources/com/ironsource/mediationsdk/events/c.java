package com.ironsource.mediationsdk.events;

import java.util.ArrayList;
import java.util.List;
import x8.f;

public interface c<T> {

    public static final class a<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<T> f4546a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<T> f4547b;

        public a(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
            f.f(arrayList, "a");
            f.f(arrayList2, "b");
            this.f4546a = arrayList;
            this.f4547b = arrayList2;
        }

        public final List<T> a() {
            ArrayList<T> arrayList = this.f4546a;
            ArrayList<T> arrayList2 = this.f4547b;
            f.f(arrayList, "<this>");
            f.f(arrayList2, "elements");
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size());
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            return arrayList3;
        }
    }

    public static final class b<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f4548a;

        /* renamed from: b  reason: collision with root package name */
        public final List<T> f4549b;

        public b(c<T> cVar, int i10) {
            f.f(cVar, "collection");
            this.f4548a = i10;
            this.f4549b = cVar.a();
        }

        public final List<T> a() {
            return this.f4549b;
        }

        public final List<T> b() {
            List<T> list = this.f4549b;
            int size = list.size();
            int i10 = this.f4548a;
            if (size > i10) {
                size = i10;
            }
            return list.subList(0, size);
        }

        public final List<T> c() {
            int size = this.f4549b.size();
            int i10 = this.f4548a;
            if (size <= i10) {
                return p8.f.f10705a;
            }
            List<T> list = this.f4549b;
            return list.subList(i10, list.size());
        }
    }

    List<T> a();
}

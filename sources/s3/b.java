package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;
import androidx.activity.f;
import java.util.ArrayList;

public final class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(int i10, Parcel parcel) {
        int m2 = m(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (m2 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m2);
        return readBundle;
    }

    public static <T extends Parcelable> T b(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m2 = m(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (m2 == 0) {
            return null;
        }
        T t10 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m2);
        return t10;
    }

    public static String c(int i10, Parcel parcel) {
        int m2 = m(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (m2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m2);
        return readString;
    }

    public static ArrayList d(int i10, Parcel parcel) {
        int m2 = m(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (m2 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m2);
        return createStringArrayList;
    }

    public static <T> T[] e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m2 = m(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (m2 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m2);
        return createTypedArray;
    }

    public static <T> ArrayList<T> f(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m2 = m(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (m2 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m2);
        return createTypedArrayList;
    }

    public static void g(int i10, Parcel parcel) {
        if (parcel.dataPosition() != i10) {
            throw new a(e.a("Overread allowed size end=", i10), parcel);
        }
    }

    public static boolean h(int i10, Parcel parcel) {
        q(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder i(int i10, Parcel parcel) {
        int m2 = m(i10, parcel);
        int dataPosition = parcel.dataPosition();
        if (m2 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m2);
        return readStrongBinder;
    }

    public static int j(int i10, Parcel parcel) {
        q(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long k(int i10, Parcel parcel) {
        q(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long l(int i10, Parcel parcel) {
        int m2 = m(i10, parcel);
        if (m2 == 0) {
            return null;
        }
        p(parcel, m2, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int m(int i10, Parcel parcel) {
        return (i10 & -65536) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void n(int i10, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + m(i10, parcel));
    }

    public static int o(Parcel parcel) {
        int readInt = parcel.readInt();
        int m2 = m(readInt, parcel);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i10 = m2 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a(f.f("Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void p(Parcel parcel, int i10, int i11) {
        if (i10 != i11) {
            String hexString = Integer.toHexString(i10);
            StringBuilder sb = new StringBuilder();
            sb.append("Expected size ");
            sb.append(i11);
            sb.append(" got ");
            sb.append(i10);
            sb.append(" (0x");
            throw new a(e.c(sb, hexString, ")"), parcel);
        }
    }

    public static void q(Parcel parcel, int i10, int i11) {
        int m2 = m(i10, parcel);
        if (m2 != i11) {
            String hexString = Integer.toHexString(m2);
            StringBuilder sb = new StringBuilder();
            sb.append("Expected size ");
            sb.append(i11);
            sb.append(" got ");
            sb.append(m2);
            sb.append(" (0x");
            throw new a(e.c(sb, hexString, ")"), parcel);
        }
    }
}

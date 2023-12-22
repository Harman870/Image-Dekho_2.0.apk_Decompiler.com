package t0;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.Serializable;

public final class b {

    public static class a {
        public static void a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        public static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        public static long c(FileDescriptor fileDescriptor, long j10, int i10) {
            return Os.lseek(fileDescriptor, j10, i10);
        }
    }

    /* renamed from: t0.b$b  reason: collision with other inner class name */
    public static class C0143b {
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i10])}));
        }
        return sb.toString();
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = (long) iArr[i10];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }
}

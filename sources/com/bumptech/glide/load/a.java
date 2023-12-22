package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import r1.b;
import x1.w;

public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                int b10 = ((ImageHeaderParser) list.get(i10)).b(inputStream, bVar);
                if (b10 != -1) {
                    return b10;
                }
                i10++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                ImageHeaderParser.ImageType a10 = list.get(i10).a(byteBuffer);
                j2.a.c(byteBuffer);
                if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return a10;
                }
                i10++;
            } catch (Throwable th) {
                j2.a.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType c(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                ImageHeaderParser.ImageType d10 = ((ImageHeaderParser) list.get(i10)).d(inputStream);
                inputStream.reset();
                if (d10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return d10;
                }
                i10++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

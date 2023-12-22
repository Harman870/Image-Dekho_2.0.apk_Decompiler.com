package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;
import r1.b;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f2590a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f2591b;

    /* renamed from: c  reason: collision with root package name */
    public b f2592c;

    /* renamed from: d  reason: collision with root package name */
    public int f2593d;

    public c(FileOutputStream fileOutputStream, b bVar) {
        this.f2590a = fileOutputStream;
        this.f2592c = bVar;
        this.f2591b = (byte[]) bVar.c(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            flush();
            this.f2590a.close();
            byte[] bArr = this.f2591b;
            if (bArr != null) {
                this.f2592c.put(bArr);
                this.f2591b = null;
            }
        } catch (Throwable th) {
            this.f2590a.close();
            throw th;
        }
    }

    public final void flush() {
        int i10 = this.f2593d;
        if (i10 > 0) {
            this.f2590a.write(this.f2591b, 0, i10);
            this.f2593d = 0;
        }
        this.f2590a.flush();
    }

    public final void write(int i10) {
        byte[] bArr = this.f2591b;
        int i11 = this.f2593d;
        int i12 = i11 + 1;
        this.f2593d = i12;
        bArr[i11] = (byte) i10;
        if (i12 == bArr.length && i12 > 0) {
            this.f2590a.write(bArr, 0, i12);
            this.f2593d = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f2593d;
            if (i15 != 0 || i13 < this.f2591b.length) {
                int min = Math.min(i13, this.f2591b.length - i15);
                System.arraycopy(bArr, i14, this.f2591b, this.f2593d, min);
                int i16 = this.f2593d + min;
                this.f2593d = i16;
                i12 += min;
                byte[] bArr2 = this.f2591b;
                if (i16 == bArr2.length && i16 > 0) {
                    this.f2590a.write(bArr2, 0, i16);
                    this.f2593d = 0;
                    continue;
                }
            } else {
                this.f2590a.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}

package com.anupkumarpanwar.scratchview;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.nio.ByteBuffer;

public final class a extends AsyncTask<Integer, Void, Float> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScratchView f2543a;

    public a(ScratchView scratchView) {
        this.f2543a = scratchView;
    }

    public final Object doInBackground(Object[] objArr) {
        float f10;
        Integer[] numArr = (Integer[]) objArr;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.f2543a.f2534e, numArr[0].intValue(), numArr[1].intValue(), numArr[2].intValue(), numArr[3].intValue());
            if (createBitmap == null) {
                f10 = 0.0f;
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(createBitmap.getRowBytes() * createBitmap.getHeight());
                createBitmap.copyPixelsToBuffer(allocate);
                byte[] array = allocate.array();
                int length = array.length;
                int i10 = 0;
                for (byte b10 : array) {
                    if (b10 == 0) {
                        i10++;
                    }
                }
                f10 = ((float) i10) / ((float) length);
            }
            return Float.valueOf(f10);
        } finally {
            this.f2543a.f2542n--;
        }
    }

    public final void onPostExecute(Object obj) {
        boolean z9;
        Float f10 = (Float) obj;
        ScratchView scratchView = this.f2543a;
        float f11 = scratchView.f2541m;
        boolean z10 = true;
        if (((double) f11) >= 0.33d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            scratchView.f2541m = f10.floatValue();
            if (f11 == f10.floatValue()) {
                ScratchView scratchView2 = this.f2543a;
                if (((double) scratchView2.f2541m) < 0.33d) {
                    z10 = false;
                }
                if (z10) {
                    scratchView2.getClass();
                    throw null;
                }
                return;
            }
            this.f2543a.getClass();
            f10.floatValue();
            throw null;
        }
    }
}

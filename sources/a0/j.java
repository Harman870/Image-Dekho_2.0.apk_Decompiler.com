package a0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e0.m;
import java.io.IOException;
import java.io.InputStream;
import z.d;

public final class j extends l {
    public static Font g(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int h10 = h(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int h11 = h(fontStyle, font2.getStyle());
            if (h11 < h10) {
                font = font2;
                h10 = h11;
            }
        }
        return font;
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        int i11;
        try {
            FontFamily.Builder builder = null;
            for (d.C0172d dVar : cVar.f13085a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, dVar.f13091f).setWeight(dVar.f13087b);
                    if (dVar.f13088c) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    Font build = weight.setSlant(i11).setTtcIndex(dVar.f13090e).setFontVariationSettings(dVar.f13089d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface$CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface b(Context context, m[] mVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        int i11;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (m mVar : mVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(mVar.f6151a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(mVar.f6153c);
                        if (mVar.f6154d) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        Font build = weight.setSlant(i11).setTtcIndex(mVar.f6152b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface$CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final m f(int i10, m[] mVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

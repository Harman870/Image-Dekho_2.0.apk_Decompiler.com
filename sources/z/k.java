package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class k {
    public static c a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        c cVar;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new c((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c((Shader) null, (ColorStateList) null, 0);
    }

    public static float b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !d(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !d(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}

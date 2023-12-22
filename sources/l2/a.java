package l2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.activity.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.view.animation.RotateAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.view.animation.AnimationSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: android.view.animation.RotateAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.view.animation.RotateAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.view.animation.RotateAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: android.view.animation.RotateAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: android.view.animation.RotateAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.view.animation.RotateAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: android.view.animation.AlphaAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: android.view.animation.ScaleAnimation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.view.animation.TranslateAnimation} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.animation.Animation a(android.content.Context r7, android.content.res.XmlResourceParser r8, android.view.animation.AnimationSet r9, android.util.AttributeSet r10) {
        /*
            int r0 = r8.getDepth()
            r1 = 0
        L_0x0005:
            int r2 = r8.next()
            r3 = 3
            if (r2 != r3) goto L_0x0012
            int r3 = r8.getDepth()
            if (r3 <= r0) goto L_0x00d0
        L_0x0012:
            r3 = 1
            if (r2 == r3) goto L_0x00d0
            r4 = 2
            if (r2 == r4) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            java.lang.String r1 = r8.getName()
            r1.getClass()
            r1.hashCode()
            r2 = 0
            r5 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case -925180581: goto L_0x0059;
                case 113762: goto L_0x004e;
                case 92909918: goto L_0x0043;
                case 109250890: goto L_0x0038;
                case 1052832078: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0063
        L_0x002d:
            java.lang.String r6 = "translate"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x0036
            goto L_0x0063
        L_0x0036:
            r5 = 4
            goto L_0x0063
        L_0x0038:
            java.lang.String r6 = "scale"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x0041
            goto L_0x0063
        L_0x0041:
            r5 = 3
            goto L_0x0063
        L_0x0043:
            java.lang.String r6 = "alpha"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x004c
            goto L_0x0063
        L_0x004c:
            r5 = 2
            goto L_0x0063
        L_0x004e:
            java.lang.String r6 = "set"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x0057
            goto L_0x0063
        L_0x0057:
            r5 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r6 = "rotate"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r5 = 0
        L_0x0063:
            switch(r5) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00bb;
                case 2: goto L_0x00b5;
                case 3: goto L_0x00af;
                case 4: goto L_0x00a9;
                default: goto L_0x0066;
            }
        L_0x0066:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<android.util.AttributeSet> r6 = android.util.AttributeSet.class
            r5[r3] = r6     // Catch:{ Exception -> 0x0085 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0085 }
            r4[r2] = r7     // Catch:{ Exception -> 0x0085 }
            r4[r3] = r10     // Catch:{ Exception -> 0x0085 }
            java.lang.Object r1 = r1.newInstance(r4)     // Catch:{ Exception -> 0x0085 }
            android.view.animation.Animation r1 = (android.view.animation.Animation) r1     // Catch:{ Exception -> 0x0085 }
            goto L_0x00c9
        L_0x0085:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Unknown animation name: "
            java.lang.StringBuilder r10 = androidx.activity.f.g(r10)
            java.lang.String r8 = r8.getName()
            r10.append(r8)
            java.lang.String r8 = " error:"
            r10.append(r8)
            java.lang.String r7 = r7.getMessage()
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.<init>(r7)
            throw r9
        L_0x00a9:
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r7, r10)
            goto L_0x00c9
        L_0x00af:
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r1.<init>(r7, r10)
            goto L_0x00c9
        L_0x00b5:
            android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
            r1.<init>(r7, r10)
            goto L_0x00c9
        L_0x00bb:
            android.view.animation.AnimationSet r1 = new android.view.animation.AnimationSet
            r1.<init>(r7, r10)
            a(r7, r8, r1, r10)
            goto L_0x00c9
        L_0x00c4:
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r1.<init>(r7, r10)
        L_0x00c9:
            if (r9 == 0) goto L_0x0005
            r9.addAnimation(r1)
            goto L_0x0005
        L_0x00d0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.a.a(android.content.Context, android.content.res.XmlResourceParser, android.view.animation.AnimationSet, android.util.AttributeSet):android.view.animation.Animation");
    }

    public static Animation b(Context context, int i10) {
        XmlResourceParser animation;
        try {
            animation = context.getResources().getAnimation(i10);
            Animation a10 = a(context, animation, (AnimationSet) null, Xml.asAttributeSet(animation));
            animation.close();
            return a10;
        } catch (IOException | XmlPullParserException e10) {
            StringBuilder g10 = f.g("Can't load animation resource ID #0x");
            g10.append(Integer.toHexString(i10));
            throw new Resources.NotFoundException(g10.toString(), e10);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}

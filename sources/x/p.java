package x;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.activity.f;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import m.d;
import x.s;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12817a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f12818b;

    /* renamed from: c  reason: collision with root package name */
    public final n f12819c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f12820d = new Bundle();

    public p(n nVar) {
        Notification.Builder builder;
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList<String> arrayList;
        int i10;
        Bundle bundle;
        int i11;
        Icon icon;
        Bundle bundle2;
        int i12;
        new ArrayList();
        this.f12819c = nVar;
        this.f12817a = nVar.f12797a;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(nVar.f12797a, nVar.f12812q);
        } else {
            builder = new Notification.Builder(nVar.f12797a);
        }
        this.f12818b = builder;
        Notification notification = nVar.f12814s;
        Bundle[] bundleArr = null;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z12 = true;
        if ((notification.flags & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z9);
        if ((notification.flags & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z10);
        if ((notification.flags & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        onlyAlertOnce.setAutoCancel(z11).setDefaults(notification.defaults).setContentTitle(nVar.f12801e).setContentText(nVar.f12802f).setContentInfo((CharSequence) null).setContentIntent(nVar.f12803g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : z12).setLargeIcon(nVar.f12804h).setNumber(nVar.f12805i).setProgress(0, 0, false);
        builder.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(nVar.f12806j);
        Iterator<k> it = nVar.f12798b.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.f12784b == null && (i12 = next.f12790h) != 0) {
                next.f12784b = IconCompat.b("", i12);
            }
            IconCompat iconCompat = next.f12784b;
            if (iconCompat != null) {
                icon = IconCompat.a.f(iconCompat, (Context) null);
            } else {
                icon = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, next.f12791i, next.f12792j);
            t[] tVarArr = next.f12785c;
            if (tVarArr != null) {
                int length = tVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (tVarArr.length <= 0) {
                    for (int i13 = 0; i13 < length; i13++) {
                        builder2.addRemoteInput(remoteInputArr[i13]);
                    }
                } else {
                    t tVar = tVarArr[0];
                    throw null;
                }
            }
            if (next.f12783a != null) {
                bundle2 = new Bundle(next.f12783a);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", next.f12786d);
            int i14 = Build.VERSION.SDK_INT;
            builder2.setAllowGeneratedReplies(next.f12786d);
            bundle2.putInt("android.support.action.semanticAction", next.f12788f);
            if (i14 >= 28) {
                builder2.setSemanticAction(next.f12788f);
            }
            if (i14 >= 29) {
                builder2.setContextual(next.f12789g);
            }
            if (i14 >= 31) {
                builder2.setAuthenticationRequired(next.k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f12787e);
            builder2.addExtras(bundle2);
            this.f12818b.addAction(builder2.build());
        }
        Bundle bundle3 = nVar.f12809n;
        if (bundle3 != null) {
            this.f12820d.putAll(bundle3);
        }
        int i15 = Build.VERSION.SDK_INT;
        this.f12818b.setShowWhen(nVar.k);
        this.f12818b.setLocalOnly(nVar.f12808m).setGroup((String) null).setGroupSummary(false).setSortKey((String) null);
        this.f12818b.setCategory((String) null).setColor(nVar.f12810o).setVisibility(nVar.f12811p).setPublicVersion((Notification) null).setSound(notification.sound, notification.audioAttributes);
        if (i15 < 28) {
            ArrayList<s> arrayList2 = nVar.f12799c;
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList2.size());
                Iterator<s> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    s next2 = it2.next();
                    String str = next2.f12825c;
                    if (str == null) {
                        if (next2.f12823a != null) {
                            StringBuilder g10 = f.g("name:");
                            g10.append(next2.f12823a);
                            str = g10.toString();
                        } else {
                            str = "";
                        }
                    }
                    arrayList.add(str);
                }
            }
            ArrayList<String> arrayList3 = nVar.f12815t;
            if (arrayList == null) {
                arrayList = arrayList3;
            } else if (arrayList3 != null) {
                d dVar = new d(arrayList3.size() + arrayList.size());
                dVar.addAll(arrayList);
                dVar.addAll(arrayList3);
                arrayList = new ArrayList<>(dVar);
            }
        } else {
            arrayList = nVar.f12815t;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String addPerson : arrayList) {
                this.f12818b.addPerson(addPerson);
            }
        }
        if (nVar.f12800d.size() > 0) {
            if (nVar.f12809n == null) {
                nVar.f12809n = new Bundle();
            }
            Bundle bundle4 = nVar.f12809n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i16 = 0;
            while (i16 < nVar.f12800d.size()) {
                String num = Integer.toString(i16);
                k kVar = nVar.f12800d.get(i16);
                Object obj = q.f12821a;
                Bundle bundle7 = new Bundle();
                if (kVar.f12784b == null && (i11 = kVar.f12790h) != 0) {
                    kVar.f12784b = IconCompat.b("", i11);
                }
                IconCompat iconCompat2 = kVar.f12784b;
                if (iconCompat2 != null) {
                    i10 = iconCompat2.c();
                } else {
                    i10 = 0;
                }
                bundle7.putInt("icon", i10);
                bundle7.putCharSequence("title", kVar.f12791i);
                bundle7.putParcelable("actionIntent", kVar.f12792j);
                if (kVar.f12783a != null) {
                    bundle = new Bundle(kVar.f12783a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", kVar.f12786d);
                bundle7.putBundle("extras", bundle);
                t[] tVarArr2 = kVar.f12785c;
                if (tVarArr2 != null) {
                    bundleArr = new Bundle[tVarArr2.length];
                    if (tVarArr2.length > 0) {
                        t tVar2 = tVarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", kVar.f12787e);
                bundle7.putInt("semanticAction", kVar.f12788f);
                bundle6.putBundle(num, bundle7);
                i16++;
                bundleArr = null;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (nVar.f12809n == null) {
                nVar.f12809n = new Bundle();
            }
            nVar.f12809n.putBundle("android.car.EXTENSIONS", bundle4);
            this.f12820d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i17 = Build.VERSION.SDK_INT;
        this.f12818b.setExtras(nVar.f12809n).setRemoteInputHistory((CharSequence[]) null);
        if (i17 >= 26) {
            this.f12818b.setBadgeIconType(0).setSettingsText((CharSequence) null).setShortcutId((String) null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(nVar.f12812q)) {
                this.f12818b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i17 >= 28) {
            Iterator<s> it3 = nVar.f12799c.iterator();
            while (it3.hasNext()) {
                s next3 = it3.next();
                Notification.Builder builder3 = this.f12818b;
                next3.getClass();
                builder3.addPerson(s.a.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12818b.setAllowSystemGeneratedContextualActions(nVar.f12813r);
            this.f12818b.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
    }
}

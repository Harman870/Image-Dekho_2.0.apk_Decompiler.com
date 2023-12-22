package n3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import g4.b;
import java.util.regex.Matcher;
import m.h;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9535a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(c cVar, Looper looper) {
        super(looper);
        this.f9535a = cVar;
    }

    public final void handleMessage(Message message) {
        String str;
        String str2;
        Bundle bundle;
        String str3;
        String str4;
        String str5;
        String str6;
        c cVar = this.f9535a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof h) {
                        cVar.f9534g = (h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f9533f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            str = "Rpc";
                            str2 = sb.toString();
                            Log.w(str, str2);
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            if (stringExtra2.length() != 0) {
                                str6 = "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                str6 = new String("Received InstanceID error ");
                            }
                            Log.d("Rpc", str6);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                if (stringExtra2.length() != 0) {
                                    str5 = "Unexpected structured response ".concat(stringExtra2);
                                } else {
                                    str5 = new String("Unexpected structured response ");
                                }
                                Log.w("Rpc", str5);
                                return;
                            }
                            str3 = split[2];
                            String str7 = split[3];
                            if (str7.startsWith(":")) {
                                str7 = str7.substring(1);
                            }
                            bundle = intent2.putExtra("error", str7).getExtras();
                        } else {
                            synchronized (cVar.f9528a) {
                                int i10 = 0;
                                while (true) {
                                    h<String, TaskCompletionSource<Bundle>> hVar = cVar.f9528a;
                                    if (i10 < hVar.f9301c) {
                                        cVar.b(hVar.h(i10), intent2.getExtras());
                                        i10++;
                                    }
                                }
                            }
                            return;
                        }
                    } else {
                        Matcher matcher = c.f9527j.matcher(stringExtra);
                        if (matcher.matches()) {
                            str3 = matcher.group(1);
                            String group = matcher.group(2);
                            if (str3 != null) {
                                bundle = intent2.getExtras();
                                bundle.putString("registration_id", group);
                            } else {
                                return;
                            }
                        } else if (!Log.isLoggable("Rpc", 3)) {
                            return;
                        } else {
                            if (stringExtra.length() != 0) {
                                str4 = "Unexpected response string: ".concat(stringExtra);
                            } else {
                                str4 = new String("Unexpected response string: ");
                            }
                        }
                    }
                    cVar.b(str3, bundle);
                    return;
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        str4 = "Unexpected response action: ".concat(valueOf2);
                    } else {
                        str4 = new String("Unexpected response action: ");
                    }
                } else {
                    return;
                }
                Log.d("Rpc", str4);
                return;
            }
        }
        str = "Rpc";
        str2 = "Dropping invalid message";
        Log.w(str, str2);
    }
}

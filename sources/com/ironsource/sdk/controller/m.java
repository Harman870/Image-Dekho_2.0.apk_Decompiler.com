package com.ironsource.sdk.controller;

import android.os.Message;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.g.e;
import com.ironsource.sdk.h.b;
import com.ironsource.sdk.h.c;
import com.ironsource.sdk.l.f;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f5483a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5484b;

    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ p f5485a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ o f5486b;

        public a(m mVar, p pVar, o oVar) {
            this.f5485a = pVar;
            this.f5486b = oVar;
        }

        public final void a(c cVar) {
            try {
                p pVar = this.f5485a;
                o oVar = this.f5486b;
                pVar.a(oVar, m.a(oVar, cVar.a()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void a(c cVar, e eVar) {
            JSONObject jSONObject;
            try {
                p pVar = this.f5485a;
                o oVar = this.f5486b;
                try {
                    jSONObject = oVar.a().put("errMsg", eVar.f5654a);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    jSONObject = new JSONObject();
                }
                pVar.b(oVar, jSONObject);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public m(String str, b bVar) {
        this.f5483a = str;
        this.f5484b = bVar;
    }

    public static JSONObject a(o oVar, JSONObject jSONObject) {
        try {
            return oVar.a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public final void b(JSONObject jSONObject, A.d.a aVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject a10;
        o oVar = new o(jSONObject);
        p pVar = new p(aVar);
        try {
            String str = oVar.f5487a;
            JSONObject jSONObject4 = oVar.f5488b;
            String str2 = this.f5483a;
            if (jSONObject4.has("filePath")) {
                if (jSONObject4.has("fileName")) {
                    c cVar = new c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str2, jSONObject4.getString("filePath")), jSONObject4.getString("fileName"));
                    IronSourceStorageUtils.ensurePathSafety(cVar, this.f5483a);
                    char c10 = 65535;
                    boolean z9 = false;
                    switch (str.hashCode()) {
                        case -2073025383:
                            if (str.equals("saveFile")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1137024519:
                            if (str.equals("deleteFolder")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -318115535:
                            if (str.equals("getTotalSizeOfFiles")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 537556755:
                            if (str.equals("updateAttributesOfFile")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 1764172231:
                            if (str.equals("deleteFile")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1953259713:
                            if (str.equals("getFiles")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    if (c10 != 0) {
                        if (c10 == 1) {
                            b bVar = this.f5484b;
                            if (cVar.exists()) {
                                if (cVar.delete()) {
                                    bVar.f5664d.a(cVar.getName());
                                } else {
                                    throw new Exception("Failed to delete file");
                                }
                            }
                            a10 = cVar.a();
                        } else if (c10 == 2) {
                            b bVar2 = this.f5484b;
                            if (cVar.exists()) {
                                ArrayList<c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(cVar);
                                if (IronSourceStorageUtils.deleteFolderContentRecursive(cVar) && cVar.delete()) {
                                    z9 = true;
                                }
                                if (z9) {
                                    bVar2.f5664d.a(filesInFolderRecursive);
                                } else {
                                    throw new Exception("Failed to delete folder");
                                }
                            }
                            a10 = cVar.a();
                        } else if (c10 == 3) {
                            b bVar3 = this.f5484b;
                            if (cVar.exists()) {
                                a10 = IronSourceStorageUtils.buildFilesMapOfDirectory(cVar, bVar3.f5664d.a());
                            } else {
                                throw new Exception("Folder does not exist");
                            }
                        } else if (c10 != 4) {
                            if (c10 == 5) {
                                JSONObject optJSONObject = jSONObject4.optJSONObject("attributesToUpdate");
                                b bVar4 = this.f5484b;
                                if (optJSONObject == null) {
                                    throw new Exception("Missing attributes to update");
                                } else if (!cVar.exists()) {
                                    throw new Exception("File does not exist");
                                } else if (bVar4.f5664d.b(cVar.getName(), optJSONObject)) {
                                    pVar.a(oVar, a(oVar, cVar.a()));
                                    return;
                                } else {
                                    throw new Exception("Failed to update attribute");
                                }
                            } else {
                                return;
                            }
                        } else if (cVar.exists()) {
                            try {
                                jSONObject3 = oVar.a().put(IronSourceConstants.EVENTS_RESULT, IronSourceStorageUtils.getTotalSizeOfDir(cVar));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                jSONObject3 = new JSONObject();
                            }
                            pVar.a(oVar, jSONObject3);
                            return;
                        } else {
                            throw new Exception("Folder does not exist");
                        }
                        jSONObject3 = a(oVar, a10);
                        pVar.a(oVar, jSONObject3);
                        return;
                    }
                    String optString = jSONObject4.optString("fileUrl");
                    int optInt = jSONObject4.optInt("connectionTimeout");
                    int optInt2 = jSONObject4.optInt("readTimeout");
                    a aVar2 = new a(this, pVar, oVar);
                    b bVar5 = this.f5484b;
                    if (TextUtils.isEmpty(optString)) {
                        throw new Exception("Missing params for file");
                    } else if (h.a(bVar5.f5662b.f5732b) <= 0) {
                        throw new Exception("no_disk_space");
                    } else if (!SDKUtils.isExternalStorageAvailable()) {
                        throw new Exception("storage_unavailable");
                    } else if (a.AnonymousClass1.b(bVar5.f5661a)) {
                        com.ironsource.sdk.h.a aVar3 = bVar5.f5663c;
                        String path = cVar.getPath();
                        b.AnonymousClass1 r4 = new f(aVar2) {

                            /* renamed from: a  reason: collision with root package name */
                            public /* synthetic */ f f5665a;

                            /* renamed from: com.ironsource.sdk.h.b$1$a */
                            public class a extends JSONObject {
                                public a() {
                                    put("lastReferencedTime", System.currentTimeMillis());
                                }
                            }

                            {
                                this.f5665a = r2;
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
                                r4 = move-exception;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
                                r4.printStackTrace();
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
                                return;
                             */
                            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void a(com.ironsource.sdk.h.c r4) {
                                /*
                                    r3 = this;
                                    com.ironsource.sdk.l.f r0 = r3.f5665a
                                    r0.a(r4)
                                    com.ironsource.sdk.h.b$1$a r0 = new com.ironsource.sdk.h.b$1$a     // Catch:{ Exception -> 0x0022 }
                                    r0.<init>()     // Catch:{ Exception -> 0x0022 }
                                    com.ironsource.sdk.h.b r1 = com.ironsource.sdk.h.b.this     // Catch:{ Exception -> 0x0022 }
                                    com.ironsource.sdk.h.d r1 = r1.f5664d     // Catch:{ Exception -> 0x0022 }
                                    java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0022 }
                                    monitor-enter(r1)     // Catch:{ Exception -> 0x0022 }
                                    org.json.JSONObject r2 = r1.a()     // Catch:{ all -> 0x001f }
                                    r2.put(r4, r0)     // Catch:{ all -> 0x001f }
                                    r1.b(r2)     // Catch:{ all -> 0x001f }
                                    monitor-exit(r1)     // Catch:{ Exception -> 0x0022 }
                                    return
                                L_0x001f:
                                    r4 = move-exception
                                    monitor-exit(r1)     // Catch:{ Exception -> 0x0022 }
                                    throw r4     // Catch:{ Exception -> 0x0022 }
                                L_0x0022:
                                    r4 = move-exception
                                    r4.printStackTrace()
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.h.b.AnonymousClass1.a(com.ironsource.sdk.h.c):void");
                            }

                            public final void a(c cVar, e eVar) {
                                this.f5665a.a(cVar, eVar);
                            }
                        };
                        if (path != null) {
                            aVar3.f5660a.put(path, r4);
                        }
                        if (cVar.exists()) {
                            Message message = new Message();
                            message.obj = cVar;
                            message.what = IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE;
                            bVar5.f5663c.sendMessage(message);
                            return;
                        }
                        bVar5.f5662b.a(cVar, optString, optInt, optInt2, bVar5.f5663c).start();
                        return;
                    } else {
                        throw new Exception("no_network_connection");
                    }
                }
            }
            throw new Exception("Missing params for file");
        } catch (Exception e11) {
            try {
                jSONObject2 = oVar.a().put("errMsg", e11.getMessage());
            } catch (Exception e12) {
                e12.printStackTrace();
                jSONObject2 = new JSONObject();
            }
            pVar.b(oVar, jSONObject2);
        }
    }
}

package c3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import c3.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g3.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import w2.s;

public final class d implements u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2387a;

    /* renamed from: b  reason: collision with root package name */
    public final d3.d f2388b;

    /* renamed from: c  reason: collision with root package name */
    public final e f2389c;

    public d(Context context, d3.d dVar, e eVar) {
        this.f2387a = context;
        this.f2388b = dVar;
        this.f2389c = eVar;
    }

    public final void a(s sVar, int i10, boolean z9) {
        boolean z10;
        s sVar2 = sVar;
        int i11 = i10;
        ComponentName componentName = new ComponentName(this.f2387a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f2387a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f2387a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z9) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i12 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i12 >= i11) {
                        z10 = true;
                    }
                }
            }
            z10 = false;
            if (z10) {
                a3.a.a(sVar2, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long q10 = this.f2388b.q(sVar2);
        e eVar = this.f2389c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        t2.d d10 = sVar.d();
        String str = "JobInfoScheduler";
        builder.setMinimumLatency(eVar.b(d10, q10, i11));
        Set<e.b> b10 = eVar.c().get(d10).b();
        if (b10.contains(e.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b10.contains(e.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b10.contains(e.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i11);
        persistableBundle.putString("backendName", sVar.b());
        persistableBundle.putInt("priority", a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(sVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sVar2, Integer.valueOf(value), Long.valueOf(this.f2389c.b(sVar.d(), q10, i11)), Long.valueOf(q10), Integer.valueOf(i10)};
        String c10 = a3.a.c(str);
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }

    public final void b(s sVar, int i10) {
        a(sVar, i10, false);
    }
}

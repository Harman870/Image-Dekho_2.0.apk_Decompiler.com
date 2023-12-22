package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f3622a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f3623b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f3624c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f3625d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f3622a = linkedBlockingQueue;
        this.f3623b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f3624c.poll();
        this.f3625d = poll;
        if (poll != null) {
            poll.a(this.f3623b);
        }
    }

    public void a(b bVar) {
        this.f3625d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a((b.a) this);
        this.f3624c.add(bVar);
        if (this.f3625d == null) {
            a();
        }
    }
}

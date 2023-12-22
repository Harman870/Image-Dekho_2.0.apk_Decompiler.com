package z2;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f13156a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13157b;

    public enum a implements q6.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f13166a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f13166a = i10;
        }

        public final int a() {
            return this.f13166a;
        }
    }

    public c(long j10, a aVar) {
        this.f13156a = j10;
        this.f13157b = aVar;
    }
}

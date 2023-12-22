package f0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f6308a = new d((a) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f6309b = new d((a) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f6310c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f6311d;

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6312a = new a();

        public final int a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                d dVar = e.f6308a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    }
                    i12 = 0;
                }
                i12 = 1;
            }
            return i12;
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i10);
    }

    public static abstract class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final b f6313a;

        public c(a aVar) {
            this.f6313a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f6313a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i10);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }
    }

    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6314b;

        public d(a aVar, boolean z9) {
            super(aVar);
            this.f6314b = z9;
        }

        public final boolean a() {
            return this.f6314b;
        }
    }

    static {
        a aVar = a.f6312a;
        f6310c = new d(aVar, false);
        f6311d = new d(aVar, true);
    }
}

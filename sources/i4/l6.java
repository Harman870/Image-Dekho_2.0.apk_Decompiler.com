package i4;

import java.security.GeneralSecurityException;

public final class l6 implements gd {

    /* renamed from: a  reason: collision with root package name */
    public final String f7468a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7469b;

    /* renamed from: c  reason: collision with root package name */
    public fa f7470c;

    /* renamed from: d  reason: collision with root package name */
    public o9 f7471d;

    /* renamed from: e  reason: collision with root package name */
    public int f7472e;

    /* renamed from: f  reason: collision with root package name */
    public oa f7473f;

    public l6(bc bcVar) {
        String A = bcVar.A();
        this.f7468a = A;
        if (A.equals(q4.f7609b)) {
            try {
                ha y9 = ha.y(bcVar.z(), p0.f7582b);
                this.f7470c = (fa) o4.b(bcVar);
                this.f7469b = y9.v();
            } catch (i1 e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (A.equals(q4.f7608a)) {
            try {
                q9 x9 = q9.x(bcVar.z(), p0.f7582b);
                this.f7471d = (o9) o4.b(bcVar);
                this.f7472e = x9.y().v();
                this.f7469b = this.f7472e + x9.z().v();
            } catch (i1 e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (A.equals(z5.f7839a)) {
            try {
                qa y10 = qa.y(bcVar.z(), p0.f7582b);
                this.f7473f = (oa) o4.b(bcVar);
                this.f7469b = y10.v();
            } catch (i1 e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(A)));
        }
    }
}

package m9;

import j9.b0;
import j9.r;
import j9.u;
import j9.x;
import java.io.IOException;
import n9.f;

public final class a implements r {
    public final b0 a(f fVar) {
        x xVar = fVar.f10393e;
        i iVar = fVar.f10390b;
        boolean z9 = !xVar.f9017b.equals("GET");
        synchronized (iVar.f9440b) {
            if (iVar.f9452o) {
                throw new IllegalStateException("released");
            } else if (iVar.f9448j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        d dVar = iVar.f9446h;
        u uVar = iVar.f9439a;
        dVar.getClass();
        int i10 = fVar.f10395g;
        int i11 = fVar.f10396h;
        int i12 = fVar.f10397i;
        uVar.getClass();
        try {
            c cVar = new c(iVar, iVar.f9441c, iVar.f9442d, iVar.f9446h, dVar.b(i10, i11, i12, uVar.f8998t, z9).g(uVar, fVar));
            synchronized (iVar.f9440b) {
                iVar.f9448j = cVar;
                iVar.k = false;
                iVar.f9449l = false;
            }
            return fVar.b(xVar, iVar, cVar);
        } catch (g e10) {
            synchronized (dVar.f9399c) {
                dVar.f9404h = true;
                throw e10;
            }
        } catch (IOException e11) {
            synchronized (dVar.f9399c) {
                dVar.f9404h = true;
                throw new g(e11);
            }
        }
    }
}

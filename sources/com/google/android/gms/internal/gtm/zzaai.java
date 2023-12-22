package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzaai {
    private static final Class zzd = Memory.class;
    private static final zzaah zzf;
    private static final boolean zzh;

    static {
        Field zzB;
        zzaah zzaah;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        Class<Object> cls7 = Object.class;
        Unsafe zzg = zzg();
        int i10 = zzto.f2835a;
        Class cls8 = Long.TYPE;
        boolean zzv = zzv(cls8);
        boolean zzv2 = zzv(Integer.TYPE);
        zzaah zzaah2 = null;
        if (zzg != null) {
            if (zzv) {
                zzaah2 = new zzaag(zzg);
            } else if (zzv2) {
                zzaah2 = new zzaaf(zzg);
            }
        }
        zzf = zzaah2;
        boolean z9 = true;
        if (zzaah2 != null) {
            try {
                Class<?> cls9 = zzaah2.zza.getClass();
                cls9.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls9.getMethod("getLong", new Class[]{cls7, cls8});
                Field zzB2 = zzB();
            } catch (Throwable th) {
                Logger.getLogger(zzaai.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        zzaah zzaah3 = zzf;
        if (zzaah3 != null) {
            try {
                Class<?> cls10 = zzaah3.zza.getClass();
                cls10.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls10.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls10.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls11 = Long.TYPE;
                cls10.getMethod("getInt", new Class[]{cls7, cls11});
                cls10.getMethod("putInt", new Class[]{cls7, cls11, Integer.TYPE});
                cls10.getMethod("getLong", new Class[]{cls7, cls11});
                cls10.getMethod("putLong", new Class[]{cls7, cls11, cls11});
                cls10.getMethod("getObject", new Class[]{cls7, cls11});
                cls10.getMethod("putObject", new Class[]{cls7, cls11, cls7});
            } catch (Throwable th2) {
                Logger.getLogger(zzaai.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
            zzh = z9;
            zzz(byte[].class);
            zzz(cls6);
            zzA(cls6);
            zzz(cls5);
            zzA(cls5);
            zzz(cls4);
            zzA(cls4);
            zzz(cls3);
            zzA(cls3);
            zzz(cls2);
            zzA(cls2);
            zzz(cls);
            zzA(cls);
            zzB = zzB();
            if (!(zzB == null || (zzaah = zzf) == null)) {
                zzaah.zza.objectFieldOffset(zzB);
            }
            ByteOrder.nativeOrder();
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        }
        z9 = false;
        zzh = z9;
        zzz(byte[].class);
        zzz(cls6);
        zzA(cls6);
        zzz(cls5);
        zzA(cls5);
        zzz(cls4);
        zzA(cls4);
        zzz(cls3);
        zzA(cls3);
        zzz(cls2);
        zzA(cls2);
        zzz(cls);
        zzA(cls);
        zzB = zzB();
        zzaah.zza.objectFieldOffset(zzB);
        ByteOrder.nativeOrder();
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
    }

    private zzaai() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i10 = zzto.f2835a;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzaae());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzv(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i10 = zzto.f2835a;
        try {
            Class cls3 = zzd;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzx() {
        return zzh;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}

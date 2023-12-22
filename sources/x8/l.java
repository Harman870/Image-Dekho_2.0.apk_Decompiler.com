package x8;

public final class l {
    public static String a(e eVar) {
        String obj = eVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}

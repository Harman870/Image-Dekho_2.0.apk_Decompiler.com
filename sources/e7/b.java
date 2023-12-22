package e7;

import java.lang.reflect.Field;
import java.util.Locale;

public enum b implements c {
    ;

    /* 'enum' modifier removed */
    public static class a extends b {
        public a() {
            super("IDENTITY", 0);
        }

        public final String a(Field field) {
            return field.getName();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: e7.b$b  reason: collision with other inner class name */
    public static class C0079b extends b {
        public C0079b() {
            super("UPPER_CAMEL_CASE", 1);
        }

        public final String a(Field field) {
            return b.c(field.getName());
        }
    }

    /* 'enum' modifier removed */
    public static class c extends b {
        public c() {
            super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        }

        public final String a(Field field) {
            return b.c(b.b(field.getName(), " "));
        }
    }

    /* 'enum' modifier removed */
    public static class d extends b {
        public d() {
            super("LOWER_CASE_WITH_UNDERSCORES", 3);
        }

        public final String a(Field field) {
            return b.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    public static class e extends b {
        public e() {
            super("LOWER_CASE_WITH_DASHES", 4);
        }

        public final String a(Field field) {
            return b.b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    }

    /* access modifiers changed from: public */
    b() {
        throw null;
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i10++;
            charAt = str.charAt(i10);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i11 = i10 + 1;
        if (i11 < str.length()) {
            str2 = upperCase + str.substring(i11);
        } else {
            str2 = String.valueOf(upperCase);
        }
        sb.append(str2);
        return sb.toString();
    }
}

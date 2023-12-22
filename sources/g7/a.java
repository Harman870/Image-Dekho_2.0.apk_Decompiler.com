package g7;

import androidx.activity.f;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f6580a = new Type[0];

    /* renamed from: g7.a$a  reason: collision with other inner class name */
    public static final class C0087a implements GenericArrayType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f6581a;

        public C0087a(Type type) {
            this.f6581a = a.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.c(this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f6581a;
        }

        public final int hashCode() {
            return this.f6581a.hashCode();
        }

        public final String toString() {
            return a.g(this.f6581a) + "[]";
        }
    }

    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f6582a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f6583b;

        /* renamed from: c  reason: collision with root package name */
        public final Type[] f6584c;

        public b(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z9;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (type == null && !z9) {
                    z10 = false;
                }
                c6.b.m(z10);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = a.a(type);
            }
            this.f6582a = type3;
            this.f6583b = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f6584c = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f6584c[i10].getClass();
                a.b(this.f6584c[i10]);
                Type[] typeArr3 = this.f6584c;
                typeArr3[i10] = a.a(typeArr3[i10]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.c(this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f6584c.clone();
        }

        public final Type getOwnerType() {
            return this.f6582a;
        }

        public final Type getRawType() {
            return this.f6583b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f6584c) ^ this.f6583b.hashCode();
            Type type = this.f6582a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            int length = this.f6584c.length;
            if (length == 0) {
                return a.g(this.f6583b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.g(this.f6583b));
            sb.append("<");
            sb.append(a.g(this.f6584c[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb.append(", ");
                sb.append(a.g(this.f6584c[i10]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class c implements WildcardType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f6585a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f6586b;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z9;
            boolean z10;
            Class<Object> cls = Object.class;
            boolean z11 = true;
            if (typeArr2.length <= 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            c6.b.m(z9);
            if (typeArr.length == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            c6.b.m(z10);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                a.b(typeArr2[0]);
                c6.b.m(typeArr[0] != cls ? false : z11);
                this.f6586b = a.a(typeArr2[0]);
                this.f6585a = cls;
                return;
            }
            typeArr[0].getClass();
            a.b(typeArr[0]);
            this.f6586b = null;
            this.f6585a = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.c(this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f6586b;
            if (type == null) {
                return a.f6580a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f6585a};
        }

        public final int hashCode() {
            Type type = this.f6586b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f6585a.hashCode() + 31);
        }

        public final String toString() {
            Type type;
            StringBuilder sb;
            if (this.f6586b != null) {
                sb = f.g("? super ");
                type = this.f6586b;
            } else if (this.f6585a == Object.class) {
                return "?";
            } else {
                sb = f.g("? extends ");
                type = this.f6585a;
            }
            sb.append(a.g(type));
            return sb.toString();
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0087a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0087a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void b(Type type) {
        c6.b.m(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static boolean c(Type type, Type type2) {
        boolean z9;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            c6.b.m(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type f(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.HashSet r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004e
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 != 0) goto L_0x0021
            goto L_0x004a
        L_0x0021:
            java.lang.reflect.Type r2 = d(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002e:
            if (r1 >= r3) goto L_0x0044
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0044:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x004a:
            r10 = r0
        L_0x004b:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004e:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = f(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            g7.a$a r0 = new g7.a$a
            r0.<init>(r8)
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0083
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = f(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            g7.a$a r10 = new g7.a$a
            r10.<init>(r8)
        L_0x0082:
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c3
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = f(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0096
            r0 = r2
            goto L_0x0097
        L_0x0096:
            r0 = r1
        L_0x0097:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x009c:
            if (r1 >= r5) goto L_0x00b7
            r6 = r4[r1]
            java.lang.reflect.Type r6 = f(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b4
            if (r0 != 0) goto L_0x00b2
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r2
        L_0x00b2:
            r4[r1] = r6
        L_0x00b4:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b7:
            if (r0 == 0) goto L_0x00c2
            java.lang.reflect.Type r8 = r10.getRawType()
            g7.a$b r10 = new g7.a$b
            r10.<init>(r3, r8, r4)
        L_0x00c2:
            return r10
        L_0x00c3:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x011f
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fa
            r3 = r0[r1]
            java.lang.reflect.Type r8 = f(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x011f
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e9
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ee
        L_0x00e9:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ee:
            g7.a$c r9 = new g7.a$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fa:
            int r0 = r3.length
            if (r0 != r2) goto L_0x011f
            r0 = r3[r1]
            java.lang.reflect.Type r8 = f(r8, r9, r0, r11)
            r9 = r3[r1]
            if (r8 == r9) goto L_0x011f
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0112
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0117
        L_0x0112:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0117:
            g7.a$c r9 = new g7.a$c
            java.lang.reflect.Type[] r10 = f6580a
            r9.<init>(r8, r10)
            return r9
        L_0x011f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.a.f(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashSet):java.lang.reflect.Type");
    }

    public static String g(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}

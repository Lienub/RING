package P21_Projet.semaine6;

import java.lang.reflect.*;
import java.util.ArrayList;

public class
TypeUML {
    private Type t;
    private String autre;

    public TypeUML() {
    }

    public String toStringParam(Parameter p) {
        String type = "";
        if (p.getType().getSimpleName() == "int") {
            type += " : Integer";
        } else if (p.getType().getSimpleName().contains("float") || p.getType().getSimpleName().contains("double")) {
            type = " : Real";
        } else if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            int i = 0;
            for (Type t : pt.getActualTypeArguments()) {
                if (i++ == pt.getActualTypeArguments().length - 1) {

                    type += ((Class) t).getSimpleName() + "[*]";

                }
            }
            if (pt.getTypeName().contains("List")) {
                type += " {isOrdered}";
            } else if (pt.getTypeName().contains("List")) {
                type += " {isUnique}";
            }

        } else if (p.getType().getSimpleName() == "void") {
            type += "";
        } else if (p.getType().getSimpleName().contains("boolean")) {
            type += " : Boolean";
        } else {
            type += " : " + p.getType().getSimpleName();
        }
        return type;
    }

    public String toStringField(Field f) {

        String type = "";

        if (f.getType().getSimpleName() == "int") {
            type = " : Integer";
        } else if (f.getType().getSimpleName().contains("float") || f.getType().getSimpleName().contains("double")) {
            type = " : Real";
        } else if (f.getGenericType() instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) f.getGenericType();
            int i = 0;
            for (Type t : pt.getActualTypeArguments()) {
                if (i++ == pt.getActualTypeArguments().length - 1) {
                    if (t instanceof ParameterizedType) {
                        ParameterizedType pt2 = (ParameterizedType) f.getGenericType();
                        int j = 0;
                        for (Type t2 : pt2.getActualTypeArguments()) {
                            if (i++ == pt.getActualTypeArguments().length - 1) {
                                type += ((Class) t).getSimpleName() + "[*]";
                            }
                        }
                    }
                    else{type += ((Class) t).getSimpleName() + "[*]";}
                }
            }
            if (pt.getTypeName().contains("List")) {
                type += " {isOrdered}";
            } else if (pt.getTypeName().contains("Set")) {
                type += " {isUnique}";
            }
        } else if (f.getType().getSimpleName() == "void") {
            type = "";
        } else if (f.getType().getSimpleName().contains("boolean")) {
            type = " : Boolean";
        } else {
            type = " : " + f.getType().getSimpleName();
        }
        return type;
    }

    public String toStringReturn(Executable p) {
        Method e = (Method) p;
        String type = "";
        if (e.getReturnType().getSimpleName().contains("int")) {
            type = " : Integer";
        } else if (e.getReturnType().getSimpleName().contains("float") || e.getReturnType().getSimpleName().contains("double")) {
            type = " : Real";
        } else if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            int i = 0;
            for (Type t : pt.getActualTypeArguments()) {
                if (i++ == pt.getActualTypeArguments().length - 1) {

                    type += ((Class) t).getSimpleName() + "[*]";

                }
            }
            if (pt.getTypeName().contains("List")) {
                type += " {isOrdered}";
            } else if (pt.getTypeName().contains("List")) {
                type += " {isUnique}";
            }

        } else if (e.getReturnType().getSimpleName().contains("void")) {
            type = "";
        } else if (e.getReturnType().getSimpleName().contains("boolean")) {
            type = " : Boolean";
        } else {
            type = " : " + e.getReturnType().getSimpleName();
        }
        return type;
    }

    public String getAutres(Field f) {
        if (!f.getType().isPrimitive()) {
            if (t instanceof ParameterizedType) {
                ParameterizedType pt = (ParameterizedType) t;
                int i = 0;
                for (Type t : pt.getActualTypeArguments()) {
                    if (i++ == pt.getActualTypeArguments().length - 1) {
                        this.autre += ((Class) t).getSimpleName();
                    }
                }
            }
            else{
                this.autre = f.getType().getSimpleName();
            }
        }
        return this.autre;
    }
}


package P21_Projet.semaine5;

import java.lang.reflect.*;

public class
TypeUML {
    private Type t;

    public TypeUML(){}

    public String toStringParam(Parameter p){
        String type="";
        if (p.getType().getSimpleName() == "int"){
            type+="Integer";
        }
        else if (p.getType().getSimpleName().contains("float") || p.getType().getSimpleName().contains("double")){
            type=" : Real";
        }
        else if (p.getParameterizedType() instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) p.getParameterizedType();
            int i = 0;
            for (Type t : pt.getActualTypeArguments()) {
                if (i++ == pt.getActualTypeArguments().length - 1) {

                    type += ((Class) t).getSimpleName() + "[*]";

                }
            }
            if(pt.getTypeName().contains("List"))
            {
                type+=" {isOrdered}";
            }
            else if(pt.getTypeName().contains("Set"))
            {
                type+=" {isUnique}";
            }

        }
        else if(p.getType().getSimpleName() == "void"){
            type+="";
        }
        else if (p.getType().getSimpleName().contains("boolean")){
            type+="Boolean";
        }
        else{type+=p.getType().getSimpleName();}
        return type;
    }

    public String toStringField(Field f){

        String type="";
        if (f.getType().getSimpleName() == "int"){
            type="Integer";
        }
        else if (f.getType().getSimpleName().contains("float") || f.getType().getSimpleName().contains("double")){
            type=" : Real";
        }

        else if (f.getGenericType() instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) f.getGenericType();
            int i = 0;
            for (Type t : pt.getActualTypeArguments()) {
                if (i++ == pt.getActualTypeArguments().length - 1) {

                    type += ((Class) t).getSimpleName() + "[*]";

                }
            }
           if(pt.getTypeName().contains("List"))
            {
                type+=" {isOrdered}";
            }
            else if(pt.getTypeName().contains("Set"))
            {
                type+=" {isUnique}";
            }
        }
        else if(f.getType().getSimpleName() == "void"){
            type="";
        }
        else if (f.getType().getSimpleName().contains("boolean")){
            type="Boolean";
        }
        else{type=f.getType().getSimpleName();}
        return type;
    }

    public String toStringReturn(Executable p){
        Method e=(Method)p;
        String type="";
        if (e.getReturnType().getSimpleName().contains("int")){
            type=" : Integer";
        }
        else if (e.getReturnType().getSimpleName().contains("float") || e.getReturnType().getSimpleName().contains("double")){
            type=" : Real";
        }
        else if (p.getAnnotatedReturnType() instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) p.getAnnotatedReturnType();
            int i = 0;
            for (Type t : pt.getActualTypeArguments()) {
                if (i++ == pt.getActualTypeArguments().length - 1) {

                    type += ((Class) t).getSimpleName() + "[*]";

                }
            }
            if(pt.getTypeName().contains("List"))
            {
                type+=" {isOrdered}";
            }
            else if(pt.getTypeName().contains("Set"))
            {
                type+=" {isUnique}";
            }

        }
        else if(e.getReturnType().getSimpleName().contains("void")){
            type="";
        }
        else if (e.getReturnType().getSimpleName().contains("boolean")){
            type=" : Boolean";
        }
        else{type=e.getReturnType().getSimpleName();}
        return type;
    }
}

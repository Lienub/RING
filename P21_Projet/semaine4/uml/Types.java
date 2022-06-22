package P21_Projet.semaine4.uml;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class Types {
    private Type t;

    public Types(){}

    public String toStringParam(Parameter p){
        return p.getType().getSimpleName();
    }

    public String toStringField(Field f){
        return f.getType().getSimpleName();
    }

    public String toStringReturn(Executable e){return e.getAnnotatedReturnType().toString();}
}

package P21_Projet.semaine3.uml;

import java.lang.reflect.*;
import java.util.List;

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

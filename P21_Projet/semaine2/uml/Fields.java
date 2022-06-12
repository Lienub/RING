package P21_Projet.semaine2.uml;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Fields {
    private Field f;

    public Fields(Field field){
        this.f = field;
    }

    public Fields(Modifier modifier) {
    }

    @Override
    public String toString() {
        return "\t"+" "+f.getName()+"\n";
    }
}
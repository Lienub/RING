package P21_Projet.semaine3.uml;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Fields {
    private Field f;
    private Modifiers modif = new Modifiers();
    private Types type = new Types();

    public Fields(Field field){
        this.f = field;
    }

    @Override
    public String toString() {

        String txt="";
        txt+=modif.toStringField(f);
        txt+= "\t "+type.toStringField(f)+" "+f.getName()+"\n";


        return txt;
    }
}
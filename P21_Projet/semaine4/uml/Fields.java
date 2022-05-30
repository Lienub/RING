package P21_Projet.semaine4.uml;

import java.lang.reflect.Field;

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
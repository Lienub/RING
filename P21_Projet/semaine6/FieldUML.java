package P21_Projet.semaine6;

import java.lang.reflect.Field;

public class FieldUML {
    private Field f;
    private ModifierUML modif = new ModifierUML();
    private TypeUML type = new TypeUML();

    public FieldUML(Field field){
        this.f = field;
    }

    @Override
    public String toString() {

        String[] txt={"",""};
        String res="";
        txt=modif.toStringField(f);
        res+=txt[0];
        res+= "\t "+f.getName()+" "+type.toStringField(f);
        res+=txt[1]+"\n";

        return res;
    }

    public String getOthers(){
        return type.getAutres(f);
    }
}
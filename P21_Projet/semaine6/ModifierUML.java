package P21_Projet.semaine6;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModifierUML {
    private Modifier mo;

    public ModifierUML() {
    }


    public String toStringExec(Executable methods) {
        String mod = " ";
        if (mo.isPublic(methods.getModifiers())) mod += " +";
        else if (mo.isPrivate(methods.getModifiers())) mod += " -";
        else if (mo.isProtected(methods.getModifiers())) mod += " #";
        if (mo.isStatic(methods.getModifiers())) mod += " {static}";
        else if (mo.isAbstract(methods.getModifiers())) mod += " {abstract}";
        else if (mo.isFinal(methods.getModifiers())) mod += " {readOnly}";

        return mod;
    }

    public String[] toStringField(Field fields) {
        String[] lst_mod={"",""};
        String mod = "";
        String mod2="";
        if (mo.isPublic(fields.getModifiers())) mod += " +";
        else if (mo.isPrivate(fields.getModifiers())) mod += " -";
        else if (mo.isProtected(fields.getModifiers())) mod += " #";
        if (mo.isStatic(fields.getModifiers())) mod += " {static}";
        else if (mo.isAbstract(fields.getModifiers())) mod += " {abstract}";
        else if (mo.isFinal(fields.getModifiers())) mod2 += " {readOnly}";
        lst_mod[0]=mod; lst_mod[1]=mod2;
        return lst_mod;
    }

    public String toStringClass(Class c) {
        String mod = "";
        if (mo.isPublic(c.getModifiers())){
            if (mo.isAbstract(c.getModifiers())) mod += "abstract ";
            else mod += " +";
        }
        else if (mo.isPrivate(c.getModifiers())) mod += " -";
        else if (mo.isProtected(c.getModifiers())) mod += " #";

        return mod;
    }

}
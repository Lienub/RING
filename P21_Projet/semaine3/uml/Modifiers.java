package P21_Projet.semaine3.uml;

import java.lang.reflect.*;

public class Modifiers {
    private Modifier mo;
    private Types t = new Types();
    private Parameters p = new Parameters();

    public Modifiers() {
    }


    public String toStringExec(Executable exec) {
        String mod = "";
        if (mo.isPublic(exec.getModifiers())) mod += " +";
        else if (mo.isPrivate(exec.getModifiers())) mod += " -";
        else if (mo.isProtected(exec.getModifiers())) mod += " #";
        if (mo.isStatic(exec.getModifiers())) mod += " {static}";
        else if (mo.isAbstract(exec.getModifiers())) mod += " {abstract}";
        else if (mo.isFinal(exec.getModifiers())) mod += " {readOnly}";

        return mod;
    }

    public String toStringField(Field fields) {
        String mod = "";
        if (mo.isPublic(fields.getModifiers())) mod += " +";
        else if (mo.isPrivate(fields.getModifiers())) mod += " -";
        else if (mo.isProtected(fields.getModifiers())) mod += " #";
        if (mo.isStatic(fields.getModifiers())) mod += " {static}";
        else if (mo.isAbstract(fields.getModifiers())) mod += " {abstract}";
        else if (mo.isFinal(fields.getModifiers())) mod += " {readOnly}";

        return mod;
    }

}
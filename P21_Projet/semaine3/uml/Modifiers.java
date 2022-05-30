package P21_Projet.semaine3.uml;

import java.lang.reflect.*;

public class Modifiers {
    private Modifier mo;

    public Modifiers() {
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

    public String toStringField(Field fields) {
        String mod = " ";
        if (mo.isPublic(fields.getModifiers())) mod += " +";
        else if (mo.isPrivate(fields.getModifiers())) mod += " -";
        else if (mo.isProtected(fields.getModifiers())) mod += " #";
        if (mo.isStatic(fields.getModifiers())) mod += " {static}";
        else if (mo.isAbstract(fields.getModifiers())) mod += " {abstract}";
        else if (mo.isFinal(fields.getModifiers())) mod += " {readOnly}";

        return mod;
    }

}
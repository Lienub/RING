package P21_Projet.semaine5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ClasseUML {
    private Class c;
    private String code;
    private ArrayList<Constructor> constructors = new ArrayList<>();
    private ArrayList<Method> methods = new ArrayList<>();
    private ArrayList<Field> fields = new ArrayList<>();
    private ModifierUML modif = new ModifierUML();

    public ClasseUML(String name){
        try{
            this.c = Class.forName(name);
        }
        catch (ClassNotFoundException ex){
            System.out.println("Class not found:\t"+ex.getException());
        }
        this.code = toStringClasifiers(c) + this.c.getName() + " {\n";
        for (Field f:
                c.getDeclaredFields()) {
            fields.add(f);
        }
        for (Method m: c.getDeclaredMethods()) {
            methods.add(m);
        }
        for (Constructor cons:
                c.getDeclaredConstructors()) {
            constructors.add(cons);
        }
    }
    private String toStringClasifiers(Class c){
        String classif = "";
        if (c.isInterface()) classif+= "interface ";
        else if (c.isEnum()) classif+= "enum ";
        else {classif+=modif.toStringClass(c); classif+= "class ";}

        return classif;
    }

    private void ecriture(){
        for (Field f: fields) {
            code +=new FieldUML(f).toString();
        }

        for (Constructor cons: constructors) {
            code += new ConstructorUML(cons);
        }

        for (Method m: methods) {
            code+= new MethodUML(m).toString() ;
            }
        this.code += "\n}";
        }

    public String getName(){
        return this.c.getName();
    }

    public String getPackage(){
        return this.c.getPackage().getName();
    }

    @Override
    public String toString() {
        ecriture();
        return this.code;
    }
}
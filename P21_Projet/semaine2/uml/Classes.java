package P21_Projet.semaine2.uml;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Classes {
    private Class c;
    private String code;
    private ArrayList<Constructor> constructors = new ArrayList<>();
    private ArrayList<Method> methods = new ArrayList<>();
    private ArrayList<Field> fields = new ArrayList<>();

    public Classes(String name){
        try{
            this.c = Class.forName(name);
        }
        catch (ClassNotFoundException ex){
            System.out.println("Class not found:\t"+ex.getException());
        }
        this.code = "class " + this.c.getName() + " {\n";
        ajoutFields();
        ajoutConstructors();
        ajoutMethods();
    }

    private void ajoutFields(){
        for (Field f:
                c.getDeclaredFields()) {
            fields.add(f);
        }
    }

    private void ajoutMethods(){
        for (Method m:
                c.getDeclaredMethods()) {
            methods.add(m);
        }
    }

    private void ajoutConstructors(){
        for (Constructor cons:
                c.getDeclaredConstructors()) {
            constructors.add(cons);
        }
    }

    private void ecritureFields(){
        for (Field f:
                fields) {
            code+=new Fields(f).toString();
        }
    }

    private void ecritureMethods(){
        for (Method m:
                methods) {
            code+=new Methods(m).toString();
        }
    }

    private void ecritureConstructors(){
        for (Constructor cons:
                constructors) {
            code+=new Constructors(cons).toString();
        }
    }



    private void finClass(){
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
        ecritureFields();
        ecritureConstructors();
        ecritureMethods();
        finClass();
        return this.code;
    }
}
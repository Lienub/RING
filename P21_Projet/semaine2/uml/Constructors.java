package P21_Projet.semaine2.uml;

import java.lang.reflect.Constructor;

public class Constructors extends Executables {

    private Constructor f;

    public Constructors(Constructor constructor){
        super(constructor);
        this.f = constructor;
    }
}

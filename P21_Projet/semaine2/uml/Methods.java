package P21_Projet.semaine2.uml;

import java.lang.reflect.Method;

public class Methods extends Executables {
    private Method m;

    public Methods(Method method){
        super (method);
        this.m = method;
    }
}

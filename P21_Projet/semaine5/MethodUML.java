package P21_Projet.semaine5;

import java.lang.reflect.Method;

public class MethodUML extends ExecutableUML {
    private Method m;

    public MethodUML(Method method){
        super (method);
        this.m = method;
    }
}

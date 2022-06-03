package P21_Projet.semaine5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class ConstructorUML extends ExecutableUML {

    private ParameterUML param = new ParameterUML();
    private ModifierUML modif = new ModifierUML();
    private TypeUML t = new TypeUML();
    private Constructor exec;

    public ConstructorUML(Constructor constructor){
        super(constructor);
        this.exec = constructor;
    }

    public String toString(){
        String txt = "";
        txt+=modif.toStringExec(exec);
        txt+= "\t " +"<<Create>> "+ exec.getDeclaringClass().getSimpleName() + "(";
        int i = 0;
        for (Parameter parameter : param.getParams(exec)) {
            txt+=param.toString(exec,parameter);
            if(i++ != param.getParams(exec).size() - 1) {txt+=", ";}
        }
        txt+=")\n";
        return txt;
    }
}

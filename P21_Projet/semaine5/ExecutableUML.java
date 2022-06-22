package P21_Projet.semaine5;

import java.lang.reflect.Executable;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class ExecutableUML {

    private Executable exec;
    private ParameterUML param = new ParameterUML();
    private ModifierUML modif = new ModifierUML();
    private TypeUML t = new TypeUML();
    public ExecutableUML(Executable exec) { this.exec = exec; }

    @Override
    public String toString() {
        String txt = "";
        txt+=modif.toStringExec(exec);
        txt+= "\t " + exec.getName() + "(";
        int i = 0;
        for (Parameter parameter : param.getParams(exec)) {
            txt+=param.toString(exec,parameter);
            if(i++ != param.getParams(exec).size() - 1) {txt+=", ";}
        }
        txt+=")";
        txt+=t.toStringReturn(exec)+"\n";
        return txt;
    }

}
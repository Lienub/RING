package P21_Projet.semaine3.uml;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class Parameters {
    private Parameter p;
    private Types t = new Types();

    public Parameters(){}

    public List<String> toString(Executable method) {
        Parameter[] parameters = method.getParameters();
        List<String> parameterNames = new ArrayList<>();

        for (Parameter parameter : parameters) {
            String parameterName = parameter.getName()+" : "+t.toStringParam(parameter);
            parameterNames.add(parameterName);
        }

        return parameterNames;
    }

}

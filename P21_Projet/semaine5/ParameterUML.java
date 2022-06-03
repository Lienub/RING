package P21_Projet.semaine5;

import P21_Projet.semaine3.uml.Parameters;

import java.lang.reflect.Executable;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterUML {
    private Parameter p;
    private TypeUML t = new TypeUML();

    public ParameterUML(){}

    public List<Parameter> getParams(Executable e){
        Parameter[] param = e.getParameters();
        List<Parameter> parameters = Arrays.asList(param);
        return parameters;
    }
    public String toString(Executable method, Parameter parameter) {
        String parameterName = parameter.getName()+" : "+t.toStringParam(parameter);

        return parameterName;
    }

}

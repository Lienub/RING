package P21_Projet.semaine3.uml;

import java.lang.reflect.Executable;

public class Executables {

    private Executable exec;
    private Parameters param = new Parameters();
    private Modifiers modif = new Modifiers();
    private Types t = new Types();
    public Executables(Executable exec) { this.exec = exec; }

    @Override
    public String toString() {
        String txt = "";
        txt+=modif.toStringExec(exec);
        txt+= "\t " + exec.getName() + "(";
        int i = 0;
        for (String s : param.toString(exec)){
            txt+=s;
            if(i++ != param.toString(exec).size() - 1) {txt+=", ";}
        }
        txt+=")";
        txt+= " : "+t.toStringReturn(exec)+"\n";
        return txt;
    }

}
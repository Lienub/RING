package P21_Projet.semaine2.uml;

import java.lang.reflect.Executable;

public class Executables {

    private Executable exec;

    public Executables(Executable exec) { this.exec = exec; }

    @Override
    public String toString() {
        return "\t " + exec.getName() + "()\n";
    }

}
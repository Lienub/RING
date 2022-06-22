package P21_Projet.semaine5;

public class Main {
    public static void main(String[] args) {

        try{
            ClasseUML cs = new ClasseUML(args[0]);
            Java2Puml file = new Java2Puml(cs);
            file.ecriturePackage();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Utilisation : retro 'path_to_class'");
        }
    }
}
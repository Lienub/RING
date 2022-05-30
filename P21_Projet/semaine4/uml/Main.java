package P21_Projet.semaine4.uml;

public class Main {
    public static void main(String[] args) {

        try{
            Classes cs = new Classes(args[0]);
            Java2Puml file = new Java2Puml(cs);
            file.ecriturePackage();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Utilisation : retro 'path_to_class'");
        }
    }
}
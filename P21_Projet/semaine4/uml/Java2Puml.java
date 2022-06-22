package P21_Projet.semaine4.uml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java2Puml {
    private File diagram;
    private FileWriter writer;
    private Classes cs;

    public Java2Puml(Classes cs){
        this.cs = cs;
        String chemin = "./"+cs.getName()+"DC.puml";
        diagram = new File(chemin);
        try{
            if(diagram.exists()){
                diagram.delete();
            }
            diagram.createNewFile();
            writer = new FileWriter(chemin);
            initialisation();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initialisation(){
        try{
            writer.write("@startuml\n" +
                    "'https://plantuml.com/class-diagram\n" +
                    "!theme vibrant\n" +
                    "skinparam classBorderColor #4F4F4F\n" +
                    "skinparam classBackgroundColor #FFFFFD\n");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public void ecriturePackage(){

        try{
            writer.write("package "+cs.getPackage()+" #C283C5-4B4A6D {\n");
            writer.write(cs.toString());
            writer.write("\n}"+"\n@enduml");
            writer.close();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
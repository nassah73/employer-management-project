 import java.util.Scanner;
 
 import java.util.ArrayList;
 class GesionEntreprise {
    ArrayList <emploiyerPleinTemps>PleinTemps=new ArrayList<>();
   
     
   public  ArrayList <emploiyerPleinTemps> add_employer_plien_de_temp(emploiyerPleinTemps e){
     PleinTemps.add(e);
     return PleinTemps;
   }
   public ArrayList <emploiyerPleinTemps> remove_employer_plien_temp(emploiyerPleinTemps e){
        PleinTemps.remove(e);
        return PleinTemps;
   }
 public void affich(){
   for (emploiyerPleinTemps emploi :PleinTemps ) {
     System.out.println("Nom:"+ emploi.getName()+" age :"+emploi.getAge());
   }
 }
   
}

 import java.util.Scanner;
 
 import java.util.ArrayList;
 class GesionEntreprise {
    ArrayList <emploiyerPleinTemps>PleinTemps=new ArrayList<>();
    ArrayList <EmployeTempsPartiel>PartielTemps=new ArrayList<>();
     
   public  ArrayList <emploiyerPleinTemps> add_employer_plien_de_temp(emploiyerPleinTemps e){
     PleinTemps.add(e);
     return PleinTemps;
   }
   public ArrayList <emploiyerPleinTemps> remove_employer_plien_temp(emploiyerPleinTemps e){
        PleinTemps.remove(e);
        return PleinTemps;
   }
 
  public  ArrayList <EmployeTempsPartiel> add_employer_partiel_de_temp(EmployeTempsPartiel e){
     PartielTemps.add(e);
     return PartielTemps;
   }
  public ArrayList <EmployeTempsPartiel> remove_employer_partiel_temp(EmployeTempsPartiel e){
        PartielTemps.remove(e);
        return PartielTemps;
   }
 
 
 
     public void affich_PartialTemps(){
   for (EmployeTempsPartiel emploi :PartielTemps ) {
     System.out.println("Nom:"+ emploi.getName()+" age :"+emploi.getAge());
   }
 }
 
   public void affich_PleinTemps(){
   for (emploiyerPleinTemps emploi :PleinTemps ) {
     System.out.println("Nom:"+ emploi.getName()+" age :"+emploi.getAge());
   }
 }
   
}

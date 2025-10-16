
public class Main  {
    public static void main(String[]args){
       // remove_employer_plien_temp
       GesionEntreprise ob=new GesionEntreprise();
    
      ob.add_employer_plien_de_temp(new emploiyerPleinTemps(0, "hassan", 20, 30000, 10));
      ob.add_employer_plien_de_temp(new emploiyerPleinTemps(1, "hamza", 20, 20000, 8));
      
   
      ob.affich();
      
        
       
    }
 
}

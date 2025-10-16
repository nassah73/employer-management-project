 class emploiyerPleinTemps extends Emploiyer implements Prime  {
     private int heuresSupp;
    
    public  emploiyerPleinTemps(int id ,String name,int age,double salairebase,int heuresSupp){
       super(id, name, age, salairebase);
       this.heuresSupp=heuresSupp;
    }

    public double CalculerPrime(){
    return this.getsalairebase() * 0.1;
   
}
   public void calculerPrix(){
      System.out.println("prix est :" +this.getsalairebase()+(this.heuresSupp*100)+CalculerPrime());
   }


      public void affichInfo(){
        System.out.println("id: "+ this.getid());
        System.out.println("Name: "+ this.getName());
        System.out.println("age: "+ this.getAge());
        System.out.println("salire_base: "+ this.getsalairebase());
        System.out.println("prim est :"+ CalculerPrime());
        calculerPrix();
      }
        
      
}

 class EmployeTempsPartiel extends Emploiyer implements Prime {
     private int heuresTravaillees;


    public EmployeTempsPartiel(int id,String name,int age,double salairebase,int heuresTravaillees){
     super(id, name, age, salairebase);
     this.heuresTravaillees=heuresTravaillees;
    }
    public double CalculerPrime(){
         return this.getsalairebase()*0.05;
    }
    public  void calculerPrix(){
       double salair=heuresTravaillees*50 + CalculerPrime();
       System.out.println("salaire : "+salair);
    }
   public void affichInfo(){
        System.out.println("id: "+this.getid());
        System.out.println("name: "+this.getName());
        System.out.println("age: "+this.getAge());
        System.out.println("prim: "+this.CalculerPrime());
        calculerPrix();
    }
}

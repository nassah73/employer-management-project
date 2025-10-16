 abstract class Emploiyer {
   private int id  ;
   private String name;
   private int age;
    private double salairebase;

    public Emploiyer(int id,String name,int age,double salairebase){
       this.id=id;
       this.name=name;
       this.age=age;
       this.salairebase=salairebase;
    }
    public int getid(){
      return this.id;
   }

   public int getAge(){
      return this.age;
   }

   public String getName(){
      return this.name;
   }
    public double getsalairebase(){
      return salairebase;
    }
    abstract void calculerPrix();
    abstract void affichInfo();
}
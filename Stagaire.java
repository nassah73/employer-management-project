 class Stagaire extends Emploiyer implements Prime {
    private int dureeStage;
    static  int salair =1500;

    public Stagaire(int id,String name,int age,double salairebase,int dureeStage ){
      super(id, name, dureeStage, salairebase);
      this.dureeStage=dureeStage;
    }
    public double CalculerPrime(){
      return 0;
    }
     void affichInfo(){
        System.out.println("nom:"+this.getName());
        System.out.println("id:"+this.getid());
        
        System.out.println("Prim:"+this.CalculerPrime());
    }
}

public class employe {
    String nom;
    double salaire;
    departement dep;
    public employe(String nom,double salaire){
        this.nom=nom;
        this.salaire=salaire;
    }
    public employe (String nom,double salaire , departement dep){
        this.nom=nom;
        this.salaire=salaire;
        this.dep=dep;
    }
    @Override
    public String toString(){
        return this.nom +" "+this.salaire;
    }
}

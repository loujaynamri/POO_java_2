public class departement {
    String nom;
    int nbEmployes=0;
    employe emp[];
    int capacite;
    public departement(String nom,int capacite){
        this.nom=nom;
        this.capacite=capacite;
        this.emp=new employe[capacite];
    }
   void ajouterEmploye(employe e){
        if(nbEmployes<capacite){
            emp[nbEmployes]=e;
            e.dep=this;
            nbEmployes++;
        }
    }
    void retirerEmploye(employe e){
       int i=0;
       while (i<=this.nbEmployes && !this.nom.equals(e.nom)){
           i++;
       }
       if(this.nom.equals(e.nom)){
           this.emp[i]=null;
           for(int j=i+1;j<=this.nbEmployes;j++){
               this.emp[i]=this.emp[j];
           }
       }
       nbEmployes--;
    }
    double masseSalariale(){
        double s=0.0d;
        for(int i=0;i<this.nbEmployes;i++){
            s=s+emp[i].salaire;
        }
        return s;
    }
    public void afficher (){
        for(int i=0;i<this.nbEmployes;i++){
            System.out.println(this.emp[i].toString());
        }
    }
    double salaireMoyen(){
        double sm=0.0d;
        sm=this.masseSalariale();
        return sm/this.nbEmployes;
    }
    employe rechercherParNom(String nom){
        for (int i=0;i<this.nbEmployes;i++){
            if(nom.equals(this.emp[i].nom)){
                return this.emp[i];
            }
        }
        return  null;
    }

}

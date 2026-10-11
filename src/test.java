import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        departement d1=new departement("Informatique",3);
        departement d2=new departement("RH",10);
        employe e1=new employe("sana",2400,d1);
        employe e2=new employe("karim",2800,d1);
        employe e3=new employe("mouna",3200,d1);
        employe e4=new employe("omar",2000);
        d1.ajouterEmploye(e1);
        d1.ajouterEmploye(e2);
        d1.ajouterEmploye(e3);
        d2.ajouterEmploye(e1);
        d1.afficher();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        d2.afficher();
       System.out.println(d1.masseSalariale());
        System.out.println("le salaire moyen de departement informatique est "+ d1.salaireMoyen());
        Scanner s=new Scanner(System.in);
        System.out.println("donner le nom de salarie rechercher");
        String nom;
        nom=s.next();
        if(d1.rechercherParNom(nom) != null) {
            System.out.println(d1.rechercherParNom(nom).toString());
        }else System.out.println("employer n'exicte pas");
    }
}

import java.io.FileNotFoundException;
import java.util.*;
public class Testeur {
    public static void main(String[] args) throws FileNotFoundException {
        Fabrique Attacker = new Fabrique();
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entrer votre login: ");
            String login = sc.nextLine();
            System.out.println("Entrer votre mot de passe: ");
            String pass= sc.nextLine();
            System.out.println("Entrer votre mode d'attaque : \n1-BruteForce Attack\n2-Dictionnaire Attack");
            int numAttac= sc.nextInt();
    
            User utilisateur = new User(login,pass);
    
            Recherche recherche1 = Attacker.getchercher(numAttac);
            long start = System.currentTimeMillis();
            recherche1.chercher(utilisateur.Password);
            long end = System.currentTimeMillis();
            long time =end -start;
    
            if (time<1000)
                System.out.println("Le temps mis pour trouver le mot de passe est : "+time+" millisecondes");
            else
                System.out.println("Le temps mis pour trouver le mot de passe est : "+(time/1000)+" secondes");
                System.out.println("Le mot de passe de "+utilisateur.Username+" a ete trouve");
        }
    
        
     }
    
}
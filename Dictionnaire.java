import java.io.*;
import java.util.*;

public class Dictionnaire implements Recherche {

    public void chercher(String password) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("dico.txt"));

        search:{while(scan.hasNextLine()){
            String line = scan.nextLine();
            if(password.equals(line)){
                System.out.println("Mot de passe trouvee : "+line);
                break search;
            }
        }
    }
    }
}
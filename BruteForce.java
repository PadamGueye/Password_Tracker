public class BruteForce implements Recherche {
    public static char[] element = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
public void chercher(String password){

    int a=0,b=0,c=0;
    int d=0,e=0;
    String chaine;
        procedure:{for (a=0; a<61;a++ ){   
            chaine =  ""+element[a];

            if(chaine.equals(password)){
                System.out.println("Le mot de passe entre est trouve"+chaine);
                break procedure;
            }
                for (b=0; b<61 ;b++ ){
                    chaine = ""+element[a]+element[b];
                    

                    if(chaine.equals(password)){
                        System.out.println("Le mot de passe entre est trouve"+chaine);
                        break procedure;
                    }

                        for (c=0; c<61; c++){
                            chaine = ""+element[a]+element[b]+element[c];

                            if(chaine.equals(password)){
                                System.out.println("Le mot de passe entre est trouve"+chaine);
                                break procedure;
                            }
                                for (d=0; d<61 ; d++)
                                {
                                    chaine = ""+element[a]+element[b]+element[c]+element[d];

                                    if(chaine.equals(password)){
                                        System.out.println("Le mot de passe entre est trouve "+chaine);
                                        break procedure;
                                    }

                                    
                                    for (e=0; e<61 ; e++)
                                    {
                                        chaine = ""+element[a]+element[b]+element[c]+element[d]+element[e];
                                        if(chaine.equals(password)){
                                            System.out.println("Le mot de passe entre est trouve "+chaine);
                                            break procedure;
                                        }
                                    }
                                    
                                }
                        
                        }
                    
                }
            }
        System.out.println("Le mot de passe "+password+" n'est pas trouve");}
        
    }
}

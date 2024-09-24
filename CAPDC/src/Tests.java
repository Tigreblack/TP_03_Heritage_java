import sio.capdc.metier.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        // instanciation objet Parcelle
        Parcelle maParcelle = new Parcelle("P1", "HAROLD", "Blé", LocalDate.of(2024, 3, 1),LocalDate.of(2024, 8, 22) , 5);

        //Création de 2 produits phytosanitaire différents

        ProduitPhytosanitaire ProduitA1 = new ProduitPhytosanitaire("Hectol","Produit ne respectant pas les normes");
        ProduitPhytosanitaire ProduitA2 = new ProduitPhytosanitaire("Rectol","Produit a base de d'insecticies respectant les normes");

        //Création de 2 traitement en semence

        TraitementSemence TraitementA1 = new TraitementSemence(24,"001",ProduitA1,maParcelle);
        TraitementSemence TraitementA2 = new TraitementSemence(40,"002",ProduitA2,maParcelle);

        //Ajout de pulvérisaiton différentes

        Pulverisation P1 = new Pulverisation("001",5,LocalDate.of(2024,7,29));
        Pulverisation P2 = new Pulverisation("002",6,LocalDate.of(2024,8,15));
        Pulverisation P3 = new Pulverisation("003",8,LocalDate.of(2024,8,30));
        Pulverisation P4 = new Pulverisation("004",5,LocalDate.of(2024,9,24));

        //Création d'une array liste de pulvérisations

        ArrayList<Pulverisation> lespulverisations1 = new ArrayList<Pulverisation>();

        //Ajout des pulvérisations dans l'array list
        
        lespulverisations1.add(P1);
        lespulverisations1.add(P2);
        lespulverisations1.add(P3);
        lespulverisations1.add(P4);

        //Création d'un traitement en champ avec la liste des pulvérisations.

        TraitementEnChamp TraitementA1_champ = new TraitementEnChamp(lespulverisations1,"001",ProduitA1,maParcelle);

        List<TraitementPhytosanitaire> Liste1 = maParcelle.GetLesTraitementsPhytosanitaires();

        for (TraitementPhytosanitaire x : Liste1){
            // à continuer
        }


    }
}

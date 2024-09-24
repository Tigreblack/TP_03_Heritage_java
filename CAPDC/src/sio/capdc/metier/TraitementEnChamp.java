package sio.capdc.metier;

import java.util.ArrayList;

public class TraitementEnChamp extends TraitementPhytosanitaire {
    private ArrayList<Pulverisation> lesPulverisations;

    public TraitementEnChamp(ArrayList<Pulverisation> lesPulverisations, String unId, ProduitPhytosanitaire unProduitPhyto, Parcelle uneParcelle) {
        super(unId, unProduitPhyto, uneParcelle);
        this.lesPulverisations = lesPulverisations;
    }

    public void AjoutUnePulverisation(Pulverisation unePulverisation){
        lesPulverisations.add(unePulverisation);
    }

    @Override
    public double QuantiteAppliquee() {
        double Quantite = 0;
        for (Pulverisation x : lesPulverisations){
            Quantite = Quantite + 1;
        }
        return Quantite;
    }

    //A implémenter
}

package sio.capdc.metier;

public abstract class TraitementPhytosanitaire {
    // A IMPLEMENTER

    private String id;
    private ProduitPhytosanitaire leProduitPhyto;
    private Parcelle laParcelleCultivee;
    public TraitementPhytosanitaire(String unId, ProduitPhytosanitaire unProduitPhyto, Parcelle uneParcelle){
        this.id = unId;
        this.leProduitPhyto = unProduitPhyto;
        this.laParcelleCultivee = uneParcelle;
    }

    // Méthodes

    public Parcelle GetLaParcelle(){
        return this.laParcelleCultivee;
    }
    public abstract double QuantiteAppliquee();

}

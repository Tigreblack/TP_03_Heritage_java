package sio.capdc.metier;

public class TraitementSemence extends TraitementPhytosanitaire
{
    private double dosageTraitementSemence;

    public TraitementSemence(double undosageTraitementSememce,String unId, ProduitPhytosanitaire unProduitPhyto, Parcelle uneParcelle)
    {
        super(unId, unProduitPhyto, uneParcelle);
        this.dosageTraitementSemence = undosageTraitementSememce;
    }

    @Override
    public double QuantiteAppliquee() {
        double surfaceparcelle = this.GetLaParcelle().GetSurface();
        return surfaceparcelle * this.dosageTraitementSemence;
    }
}

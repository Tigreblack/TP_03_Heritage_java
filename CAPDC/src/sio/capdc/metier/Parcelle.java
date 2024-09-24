package sio.capdc.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public class Parcelle {
    // attributs privés
    private String id;
    private String nomExploitant;
    private String especeCultivee;
    private LocalDate dateSemis;
    private LocalDate dateRecoltePrevue;
    private double surface;
    private ArrayList<TraitementPhytosanitaire> lesTraitementsPhyto;

    // constructeur
    public Parcelle(String unId, String unExploitant, String uneEspece, LocalDate uneDateSemis, LocalDate uneDateRecolte, double uneSurface){
        this.id = unId;
        this.nomExploitant = unExploitant;
        this.especeCultivee = uneEspece;
        this.dateSemis = uneDateSemis;
        this.dateRecoltePrevue = uneDateRecolte;
        this.surface = uneSurface;
        this.lesTraitementsPhyto = new ArrayList<TraitementPhytosanitaire>();
    }
    // méthodes
    public double GetSurface() {
        return this.surface;
    }
    public ArrayList<TraitementPhytosanitaire> GetLesTraitementsPhytosanitaires(){
        return this.lesTraitementsPhyto;
    }
    public void AjouteUnTraitement(TraitementPhytosanitaire unTraitement){
        this.lesTraitementsPhyto.add(unTraitement);
    }

    // A COMPLETER

    public double GetTauxTraitementSemence(){
        double traitementsemence = 0;
        double traitementtotal = 0;
        ArrayList<TraitementPhytosanitaire> list1 = GetLesTraitementsPhytosanitaires();
        for (TraitementPhytosanitaire x : list1){
            traitementtotal = traitementtotal +1;
            if( x instanceof TraitementSemence){
                traitementsemence = traitementsemence + 1;
            }
        }
        return traitementsemence/traitementtotal * 100;
    }
}

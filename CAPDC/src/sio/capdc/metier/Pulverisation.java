package sio.capdc.metier;

import java.time.LocalDate;
import java.util.Date;

public class Pulverisation {
    private String id;
    private double dosagePulverisation;
    private LocalDate datePulverisation;

    //Constructeur
    public Pulverisation(String unId,double undosagePulverisation,LocalDate unedatePulverisation){
        this.id = unId;
        this.dosagePulverisation = undosagePulverisation;
        this.datePulverisation = unedatePulverisation;
    }

    //Méthodes

    public double GetDosage(){
        return this.dosagePulverisation;
    }

}

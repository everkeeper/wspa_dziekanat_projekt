package dziekanatwspa;

/**
 * @author Piotr Nazar
 */
public class Przedmiot {
    
    //Pola klasy
    private String przedmiotNazwa="Przedmiot";
    private String przedmiotSkrot="PRZ";
    private String przedmiotProwadzacy="Prowadzący";
    private int przedmiotIloscGodzin=0;
    private int przedmiotRokStudiow=0;
    private int przedmiotIloscMiejsc=0;
    private int przedmiotIloscWolnych=0;
    
    //Konstruktor domyślny
    public Przedmiot(){
        //Pusty konstruktor
    }

    //Konstruktor
    public Przedmiot(
            String nazwa,
            String skrot,
            String prowadzacy,
            int iloscGodzin,
            int rokStudiow,
            int iloscMiejsc) {
        
        przedmiotNazwa=nazwa; przedmiotSkrot=skrot; przedmiotProwadzacy=prowadzacy; 
        przedmiotIloscGodzin=iloscGodzin; przedmiotRokStudiow=rokStudiow;
        przedmiotIloscMiejsc=iloscMiejsc; przedmiotIloscWolnych=iloscMiejsc;
        //Domyślnie wolne=miejsca
    }
            
    //Akcesory - odczyt
    public String getNazwa(){return przedmiotNazwa;}
    
    public String getSkrot(){return przedmiotNazwa;}
    
    public String getProwadzacy(){return przedmiotNazwa;}
    
    public int getGodziny(){return przedmiotIloscGodzin;}
    
    public int getRok(){return przedmiotRokStudiow;}
    
    public int getMiejsca(){return przedmiotIloscMiejsc;}
    
    public int getWolne(){return przedmiotIloscWolnych;}
    
    //Akcesory - zapis
    
    public void setNazwa(){
        
    }
    
    public void setSkrot(){
        
    }
    
    public void setProwadzacy(){
        
    }
    
    public void setGodziny(){
        
    }
    
    public void setRok(){
        
    }
    
    public void setMiejsca(){
        
    }
    
    public void setWolne(){
        
    }
    
    public void zajmijMiejsce(){
        
    }
}

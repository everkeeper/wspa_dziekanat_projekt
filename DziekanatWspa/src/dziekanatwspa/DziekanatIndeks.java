package dziekanatwspa;

/**
 *
 * @author Piotr Nazar
 */
public class DziekanatIndeks {
    //Pola klasy
    private String imieStudenta;
    private String drImieStudenta;
    private String nazwiskoStudenta;
    private int nrAlbumu;
    
    //Konstruktor domyślny
    public DziekanatIndeks(){
        
    }
    
    //Konstruktor
    public DziekanatIndeks(
            String imie,
            String dImie,
            String nazwisko,
            int numerAl){
        
    }
    
    //Akcesory - odczyt
    public String getImieStudenta(){
        return imieStudenta;
    }
    
    public String getDrImieStudenta(){
        return drImieStudenta;
    }
    
    public String getNazwiskoStudenta(){
        return nazwiskoStudenta;
    }
    
    public int getNumerAlbumu(){
        return nrAlbumu;
    }
    
    //Akcesory - zapis
    public void setImieStudenta(String imie){
        
    }
    
    public void setNazwiskoStudenta(String nazwisko){
        
    }
    
    public void setDrImieStudenta(String drImie){
        
    }
    
    //Inne
    public void wpiszOcenę(String wykladowca,int ocena, String slownieOcena){
        
    }
}

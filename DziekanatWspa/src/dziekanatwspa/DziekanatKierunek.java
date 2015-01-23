package dziekanatwspa;

/**
 *
 * @author Piotr Nazar
 */
public class DziekanatKierunek {
    //Pola klasy
    private String nazwaKierunku;
    private String skrotNazwyKierunku;
    private int iloscLat;
    private String typKierunku; //Licencjat,magister,doktoranckie...
    private int iloscMiejsc;
    private int iloscWolnychMiejsc;
    
    //Konstruktor domyślny
    public DziekanatKierunek(){
        
    }
    
    //Konstruktor
    public DziekanatKierunek(
            String nazwa,
            String skrot,
            int lata,
            String typ,
            int miejsca){
        
    }
    
    //Akcesory - odczyt
    public String getNazwaKierunku(){
        return nazwaKierunku;
    }
    
    public String getSkrotKierunku(){
        return skrotNazwyKierunku;
    }
    
    public String getTypKierunku(){
        return typKierunku;
    }
    
    public int getLataStudiow(){
        return iloscLat;
    }
    
    public int getIloscMiejsc(){
        return iloscMiejsc;
    }
    
    public int getIloscWolnychMiejsc(){
        return iloscWolnychMiejsc;
    }
    
    //Akcesory - zapis
    public void setNazwaKierunku(String nazwa){
        
    }
    
    public void setSkrotKierunku(String skrot){
        
    }
    
    public void setTypKierunku(String opiekun){
        
    }
    
    public void setLataStudiow(int iloscLat){
        
    }
    
    public void setIloscMiejsc(int miejsca){
        
    }
    
    public void setIloscWolnychMiejsc(int wolne){
        
    }
    
    //Inne
    public void zajmijMiejsce(){
        
    }
}

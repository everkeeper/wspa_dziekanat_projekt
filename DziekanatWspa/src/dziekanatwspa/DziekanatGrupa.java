package dziekanatwspa;

/**
 *
 * @author Piotr Nazar
 */
public class DziekanatGrupa {
    //Pola klasy
    private int rokStudiow;
    private String nazwaGrupy;
    private String skrotNazwyGrupy;
    private int iloscMiejsc;
    private int iloscWolnychMiejsc;
    private String opiekunGrupy; 
    
    //Konstruktor domyślny
    public DziekanatGrupa(){
        
    }
    
    //Konstruktor
    public DziekanatGrupa(
            int rokSt,
            String nazwa,
            String skrot,
            int miejsca,
            String opiekun){
        
    }
    
    //Akcesory - odczyt
    public String getNazwaGrupy(){
        return nazwaGrupy;
    }
    
    public String getSkrotGrupy(){
        return skrotNazwyGrupy;
    }
    
    public String getOpiekunGrupy(){
        return opiekunGrupy;
    }
    
    public int getRokStudiow(){
        return rokStudiow;
    }
    
    public int getIloscMiejsc(){
        return iloscMiejsc;
    }
    
    public int getIloscWolnych(){
        return iloscWolnychMiejsc;
    }
    
    //Akcesory - zapis
    public void setNazwaGrupy(String nazwa){
        
    }
    
    public void setSkrotGrupy(String skrot){
        
    }
    
    public void setOpiekunGrupy(String opiekun){
        
    }
    
    public void setRokStudiow(int rok){
        
    }
    
    public void setIloscMiejsc(int miejsca){
        
    }
    
    public void setIloscWolnychMiejsc(int wolne){
        
    }
    
    //Inne
    public void zajmijMiejsce(){
        
    }
}

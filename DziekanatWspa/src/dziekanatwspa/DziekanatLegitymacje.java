package dziekanatwspa;

/**
 *
 * @author Michał Radziejewicz
 */
public class DziekanatLegitymacje
{
    //Pola klasy DziekanatLegitymacje
    private int id_legitymacji;
    private int id_studenta;
    private String data_wydania;
    private String data_waznosci;
    private boolean czy_aktywna;
    
    
    
    //Konstruktory
    public DziekanatLegitymacje(
                                int id_legitymacji,
                                int id_studenta,
                                String data_wydania,
                                String data_waznosci,
                                boolean czy_aktywna)
    {}
    
    public DziekanatLegitymacje()
    {}
    
    //Akcesory
    
    //gettery    
    public int getIdLegitymacji()
    {
        return id_legitymacji;
    }
    
    public int getIdStudenta()
    {
        return id_studenta;
    }
     
    public String getDataWydania()
    {
        return data_wydania;
    }
    
    public String getDataWaznosci()
    {
        return data_waznosci;
    }
     
    public boolean getCzyAktywna()
    {
        return czy_aktywna;
    }
    
    //settery
    public void setIdLegitymacji(int id_legitymacji)
    {
    }
    
    public void setIdStudenta(int id_studenta)
    {       
    }
     
    public void DataWydania(String data_wydania)
    {
    }
    
    public void setDataWaznosci(String data_waznosci)
    {
    }
     
    public void setCzyAktywna(boolean czy_aktywna)
    {
    }
    
    public boolean dodajLegitymacje()
    {
        return true;
    }
    
    public boolean zablokujLegitymacje()
    {
        return true;
    }
    
    public int szukajLegitymacji()
    {
        return 1;
    }
    
    public boolean podbijLegitymacje()
    {
        return true;
    }
    
    public boolean przypiszLegitymacjeDoStudenta()
    {
        return true;
    }
    
}



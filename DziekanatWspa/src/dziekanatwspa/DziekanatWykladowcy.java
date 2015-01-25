package dziekanatwspa;

/**
 *
 * @author Michał Radziejewicz
 */
public class DziekanatWykladowcy
{
    private int id_wykladowcy;    
    private String imie_wykladowcy;
    private String nazwisko_wykladowcy;
    private String ulica_wykladowcy;
    private String numer_posesji_wykladowcy;
    private String numer_mieszkania_wykladowcy;    
  
   
  
    
    
    //konstruktory
    public DziekanatWykladowcy(int id_wykladowcy,
                            String imie_wykladowcy,
                            String nazwisko_wykladowcy,
                            String ulica_wykladowcy,
                            String numer_posesji_wykladowcy,
                            String numer_mieszkania_wykladowcy 
                            )
    {}
    
    public DziekanatWykladowcy()
    {}
    
    //gettery
    public int getIdWykladowcy()
    {
        return id_wykladowcy;
    }
        
    public String getImieWykladowcy()
    {
        return imie_wykladowcy;
    }
    
    public String getNazwiskoWykladowcy()
    {
        return nazwisko_wykladowcy;
    }
    
    public String getUlicaWykladowcy()
    {
        return ulica_wykladowcy;
    }
    
    public String getNumerPosesjiWykladowcy()
    {
        return numer_posesji_wykladowcy;
    }
    
    public String getNumerMieszkaniaWykladowcy()
    {
        return numer_mieszkania_wykladowcy;
    }
       
    
    //settery
    public void setIdWykladowcy(int id_wykladowcy)
    {
    }
        
    public void setImieWykladowcy(String imie_wykladowcy)
    {
    }
    
    public void setNazwiskoWykladowcy(String nazwisko_wykladowcy)
    {
    }
    
    public void setUlicaWykladowcy(String ulica_wykladowcy)
    {       
    }
    
    public void setNumerPosesjiWykladowcy(String numer_pozesji_wykladowcy)
    {
    }
    
    public void setNumerMieszkaniaWykladowcy(String numer_mieszkania_wykladowcy)
    {
    }
     
    public boolean dodajWykladowce()
    {
        return true;
    }
    
   
}

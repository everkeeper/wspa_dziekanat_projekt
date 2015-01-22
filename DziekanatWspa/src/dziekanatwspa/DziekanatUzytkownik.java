/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziekanatwspa;

/**
 *
 * @author Michał Radziejewicz
 */
public class DziekanatUzytkownik
{
    private int dziekanat_id_uzytkownik;
    private String dziekanat_login;
    private String dziekanat_imie;
    private String dziekanat_nazwisko;
    private String dziekanat_ulica;
    private String dziekanat_numer_posesji;
    private String dziekanat_numer_mieszkania;
    private int dziekanat_id_uprawnien;
    
    
    public DziekanatUzytkownik
            (    
            int id_uzytkownik,
            String login,
            String imie,
            String nazwisko,
            String ulica,
            String numer_posesji,
            String numer_mieszkania,
            int id_uprawnien
        )
    {
        dziekanat_id_uzytkownik =  id_uzytkownik;
        dziekanat_login = login;
        dziekanat_imie = imie;
        dziekanat_nazwisko =  nazwisko;
        dziekanat_ulica = ulica;
        dziekanat_numer_posesji = numer_posesji;
        dziekanat_numer_mieszkania = numer_mieszkania;
        dziekanat_id_uprawnien = id_uprawnien;
    }
    
    /*
            AKCESORY
            */        
            
    //gettery
    public int getIdUzytkownik()
    {
        return dziekanat_id_uzytkownik;
    }
    
    public String getLogin()
    {
        return dziekanat_login;
    }
    
    public String getImie()
    {
        return dziekanat_imie;
    }
    
     public String getNazwisko()
    {
        return dziekanat_nazwisko;
    }
    
    public String getUlica()
    {
        return dziekanat_ulica;
    }
    
    public String getNumerPosesji()
    {
        return dziekanat_numer_posesji;
    }
    
    public String getNumerMieszkania()
    {
        return dziekanat_numer_mieszkania;
    }
    
    public int getIdUprawnien()
    {
        return dziekanat_id_uprawnien;
    }
    
    
    //settery
    public void setIdUzytkownik()
    {       
    }
    
    public void setLogin()
    {     
    }
    
    public void setImie()
    {       
    }
    
    public void setNazwisko()
    {     
    }
    
    public void setUlica()
    {        
    }
    
    public void setNumerPosesji()
    {        
    }
    
    public void setNumerMieszkania()
    {       
    }
    
    public void setIdUprawnien()
    {
    }
   
    
  
}

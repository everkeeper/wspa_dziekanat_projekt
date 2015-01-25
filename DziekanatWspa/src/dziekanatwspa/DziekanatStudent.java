package dziekanatwspa;

/**
 *
 * @author Michał Radziejewicz
 */
public class DziekanatStudent
{
    private int id_student;    
    private String imie_student;
    private String nazwisko_student;
    private String ulica_student;
    private String numer_posesji_student;
    private String numer_mieszkania_student;    
    private int id_kierunku_student;
    private boolean czy_status_student;
  
    
    
    //konstruktory
    public DziekanatStudent(int id_student,
                            String imie_student,
                            String nazwisko_student,
                            String ulica_student,
                            String numer_posesji_student,
                            String numer_mieszkania_student,                            
                            int id_kierunku_student,
                            boolean czy_status_studenta
                            )
    {}
    
    public DziekanatStudent()
    {}
    
    //gettery
    public int getIdStudent()
    {
        return id_student;
    }
        
    public String getImieStudent()
    {
        return imie_student;
    }
    
    public String getNazwiskoStudent()
    {
        return nazwisko_student;
    }
    
    public String getUlicaStudent()
    {
        return ulica_student;
    }
    
    public String getNumerPosesjiStudent()
    {
        return numer_posesji_student;
    }
    
    public String getNumerMieszkaniaStudent()
    {
        return numer_mieszkania_student;
    }
    
    public int getIdKierunkuStudent()
    {
        return id_kierunku_student;
    }
    
    public boolean getCzyStatusStudent()
    {
        return czy_status_student;
    }
    
    //settery
    public void setIdStudent(int id_student)
    {
    }
        
    public void setImieStudent(String imie_student)
    {
    }
    
    public void setNazwiskoStudent(String nazwisko_student)
    {
    }
    
    public void setUlicaStudent(String ulica_student)
    {       
    }
    
    public void setNumerPosesjiStudent(String numer_pozesji_student)
    {
    }
    
    public void setNumerMieszkaniaStudent(String numer_mieszkania_student)
    {
    }
    
    public void setIdKierunkuStudent(int id_kierunku_student)
    {
    }
    
    public void setCzyStatusStudent(boolean czy_status_student)
    {
    }
    
    public boolean dodajStudenta()
    {
        return true;
    }
    
    public boolean skreslZListy()
    {
        return true;
    }
    
    public int szukajStudenta()
    {
        return id_student;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektalgorytmy;


/**
 *
 * @author Jacek Cierpka
 */
public class Interf {
  
    private String Lokalizacja_Slownika;
    private String Lokalizacja_Postu;
    private String Lokalizacja_Ulubionych;
    
     public Interf(String SlownikLokalizacja,String PostLokalizacja,String UlubioneLokalizacja)
    {
        
        this.Lokalizacja_Slownika=SlownikLokalizacja;
        this.Lokalizacja_Postu=PostLokalizacja;
        this.Lokalizacja_Ulubionych=UlubioneLokalizacja;
       
    }
    
    public String getLokalizacja_Slownika()
    {
        return  Lokalizacja_Slownika;
    }
     public String getLokalizacja_Postu()
    {
        return  Lokalizacja_Postu;
    }
     public String getLokalizacja_Ulubionych()
    {
        return  Lokalizacja_Ulubionych;
    }
}
    


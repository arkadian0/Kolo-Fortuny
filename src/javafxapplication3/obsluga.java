/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3 ;

/**
 *
 * @author Adrian Bukalski
 */
public class obsluga extends FXMLDocumentController
{
    
     public String nazwa;
     
    public void setNazwa(String nazwa)
     {
        this.nazwa = nazwa;
    }
    public int sprawdzDlugosc(String nazwa)
    {
        return nazwa.length();
    }
    public int sprawdzIleWyrazow(String nazwa)
    {
        String wynik1[];
        wynik1 = nazwa.split(" "); 
        return wynik1.length;
    }
   
    {
        
    }
}

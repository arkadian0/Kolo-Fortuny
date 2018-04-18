/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Adrian Bukalski
 */
public class FXMLDocumentController implements Initializable  {
   
    boolean zasieg1 = false;  
    boolean zasieg2 = false;  
    boolean zasieg3 = false;  
    boolean zasieg4 = false;  
            
    @FXML public Label A; @FXML public Label A1; @FXML public Label B;@FXML public Label C; @FXML public Label C1;@FXML public Label D;
    @FXML public Label E;@FXML public Label E1;@FXML public Label F;@FXML public Label G;@FXML public Label H;@FXML public Label I;@FXML public Label J;
    @FXML public Label K; @FXML public Label L;@FXML public Label L1;@FXML public Label M;@FXML public Label N;@FXML public Label N1;@FXML public Label O;@FXML public Label O1;
    @FXML public Label P;@FXML public Label Q;@FXML public Label R;@FXML public Label S;@FXML public Label S1;@FXML public Label T;@FXML public Label U;@FXML public Label V;
    @FXML public Label W;@FXML public Label X;@FXML public Label Y;@FXML public Label Z;@FXML public Label Z1;@FXML public Label Z2;
    
    @FXML public Label l1;@FXML public Label l2;@FXML public Label l3;@FXML public Label l4;@FXML public Label l5;@FXML public Label l6;@FXML public Label l7;@FXML public Label l8;
    @FXML public Label l9;@FXML public Label l10;@FXML public Label l11;@FXML public Label l12;@FXML public Label l13;@FXML public Label l14;@FXML public Label l15;@FXML public Label l16;
    @FXML public Label l17;@FXML public Label l18;@FXML public Label l19;@FXML public Label l20;@FXML public Label l21;@FXML public Label l22;@FXML public Label l23;@FXML public Label l24;
    @FXML public Label l25;@FXML public Label l26;@FXML public Label l27;@FXML public Label l28;@FXML public Label l29;@FXML public Label l30;@FXML public Label l31;@FXML public Label l32;
    @FXML public Label l33;@FXML public Label l34;@FXML public Label l35;@FXML public Label l36;@FXML public Label l37;@FXML public Label l38;@FXML public Label l39;@FXML public Label l40;
    @FXML public Label l41;@FXML public Label l42;@FXML public Label l43;@FXML public Label l44;@FXML public Label l45;@FXML public Label l46;@FXML public Label l47;@FXML public Label l48;
    @FXML public Label l49;@FXML public Label l50;@FXML public Label l51;@FXML public Label l52;
    
    private String licznik = new String();
    private int variable;
   @FXML private List<Label> labelList ;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       obsluga ob = new obsluga();
       int przerwa = 0;
       String wynik[];
       String nazwa = new String("volenti not fit injuria");
       wynik = nazwa.split(" ");
       ob.setNazwa(nazwa);
       int roznica = 0;
           int j = 0;
           int i = 0;
           int k;
           System.out.println(ob.sprawdzDlugosc(ob.nazwa));
       if(ob.sprawdzDlugosc(ob.nazwa)<=28)
       {
           j = 14;
       }
       if(ob.sprawdzDlugosc(ob.nazwa)>28)
       {
           j = 1;
       }
           while(i < ob.sprawdzIleWyrazow(nazwa) )
           {
               
               if((j + ob.sprawdzDlugosc(wynik[i]))>38){
                    if(zasieg4 == false)
                  {
                      j = 40;
                      zasieg4 = true;
                  }
              
                      for(k = j ;k< (j+ ob.sprawdzDlugosc(wynik[i]));k++)
               {
               labelList.get(k).setStyle("-fx-background-color: yellow; -fx-border-color: #996633;");
               roznica = k;
               }
               }  
          
               if((j + ob.sprawdzDlugosc(wynik[i]))>25 &&(j + ob.sprawdzDlugosc(wynik[i]))<=38) {
                   
                if(zasieg3 == false)
                  {
                      j = 27;
                      zasieg3 = true;
                  }
                      for(k = j ;k< (j+ ob.sprawdzDlugosc(wynik[i]));k++)
               {
               labelList.get(k).setStyle("-fx-background-color: yellow; -fx-border-color: #996633;");
               roznica = k;
               }
               }     
                    
               if((j + ob.sprawdzDlugosc(wynik[i]))>11 && (j + ob.sprawdzDlugosc(wynik[i]))<=25){
                  if(zasieg2 == false)
                  {
                      j = 14;
                      zasieg2 = true;
                  }
                       for(k = j ;k < (j+ ob.sprawdzDlugosc(wynik[i]));k++)
               {
                 
               labelList.get(k).setStyle("-fx-background-color: yellow; -fx-border-color: #996633;");
               roznica = k;
              
               }
               }
              if((j + ob.sprawdzDlugosc(wynik[i]))<=11){
                       for(k = j ;k < (j+ ob.sprawdzDlugosc(wynik[i]));k++)
               {
               labelList.get(k).setStyle("-fx-background-color: yellow; -fx-border-color: #996633;");
               roznica = k;
              
               }
    
           }
              System.out.println("ROZNICA " + roznica);
               j  = (j + (roznica-j))+2;
               System.out.println("J" + j);
           i++;
           /*
           int j;
           j = ob.sprawdzDlugosc(ob.nazwa);
           licznik = l15.getId();
           variable = Integer.parseInt(licznik);
           //.
 */          
}
      //
       
    
    }

@FXML
public void onMouseA(Event event) {
   
}
    @FXML
private void OnMouseMovedA(Event evvent) {
    A.setStyle("-fx-text-fill: grey;");
    A.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedA(Event evvent) {
    A.setStyle("-fx-text-fill: yellow;");
  }

    @FXML
private void OnMouseMovedA1(Event evvent) {
    A1.setStyle("-fx-text-fill: grey;");
    A1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedA1(Event evvent) {
    A1.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedB(Event evvent) {
    B.setStyle("-fx-text-fill: grey;");
    B.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedB(Event evvent) {
    B.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedC(Event evvent) {
    C.setStyle("-fx-text-fill: grey;");
    C.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedC(Event evvent) {
    C.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedC1(Event evvent) {
    C1.setStyle("-fx-text-fill: grey;");
    C1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedC1(Event evvent) {
    C1.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedD(Event evvent) {
    D.setStyle("-fx-text-fill: grey;");
    D.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedD(Event evvent) {
    D.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedE(Event evvent) {
    E.setStyle("-fx-text-fill: grey;");
    E.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedE(Event evvent) {
    E.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedE1(Event evvent) {
    E1.setStyle("-fx-text-fill: grey;");
    E1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedE1(Event evvent) {
    E1.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedF(Event evvent) {
    F.setStyle("-fx-text-fill: grey;");
    F.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedF(Event evvent) {
    F.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedG(Event evvent) {
    G.setStyle("-fx-text-fill: grey;");
    G.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedG(Event evvent) {
    G.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedH(Event evvent) {
    H.setStyle("-fx-text-fill: grey;");
    H.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedH(Event evvent) {
    H.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedI(Event evvent) {
    I.setStyle("-fx-text-fill: grey;");
    I.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedI(Event evvent) {
    I.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedJ(Event evvent) {
    J.setStyle("-fx-text-fill: grey;");
    J.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedJ(Event evvent) {
    J.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedK(Event evvent) {
    K.setStyle("-fx-text-fill: grey;");
    K.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedK(Event evvent) {
    K.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedL(Event evvent) {
    L.setStyle("-fx-text-fill: grey;");
    L.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedL(Event evvent) {
    L.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedL1(Event evvent) {
    L1.setStyle("-fx-text-fill: grey;");
    L1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedL1(Event evvent) {
    L1.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedM(Event evvent) {
    M.setStyle("-fx-text-fill: grey;");
    M.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedM(Event evvent) {
    M.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedN(Event evvent) {
    N.setStyle("-fx-text-fill: grey;");
    N.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedN(Event evvent) {
    N.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedN1(Event evvent) {
    N1.setStyle("-fx-text-fill: grey;");
    N1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedN1(Event evvent) {
    N1.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedO(Event evvent) {
    O.setStyle("-fx-text-fill: grey;");
    O.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedO(Event evvent) {
    O.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedO1(Event evvent) {
    O1.setStyle("-fx-text-fill: grey;");
    O1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedO1(Event evvent) {
    O1.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedP(Event evvent) {
    P.setStyle("-fx-text-fill: grey;");
    P.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedP(Event evvent) {
    P.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedQ(Event evvent) {
    Q.setStyle("-fx-text-fill: grey;");
    Q.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedQ(Event evvent) {
    Q.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedR(Event evvent) {
    R.setStyle("-fx-text-fill: grey;");
    R.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedR(Event evvent) {
    R.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedS(Event evvent) {
    S.setStyle("-fx-text-fill: grey;");
    S.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedS(Event evvent) {
    S.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedS1(Event evvent) {
    S1.setStyle("-fx-text-fill: grey;");
    S1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedS1(Event evvent) {
    S1.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedT(Event evvent) {
    T.setStyle("-fx-text-fill: grey;");
    T.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedT(Event evvent) {
    T.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedU(Event evvent) {
    U.setStyle("-fx-text-fill: grey;");
    U.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedU(Event evvent) {
    U.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedV(Event evvent) {
    V.setStyle("-fx-text-fill: grey;");
    V.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedV(Event evvent) {
    V.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedW(Event evvent) {
    W.setStyle("-fx-text-fill: grey;");
    W.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedW(Event evvent) {
    W.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedX(Event evvent) {
    X.setStyle("-fx-text-fill: grey;");
    X.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedX(Event evvent) {
    X.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedY(Event evvent) {
    Y.setStyle("-fx-text-fill: grey;");
    Y.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedY(Event evvent) {
    Y.setStyle("-fx-text-fill: yellow;");
  }
    @FXML
private void OnMouseMovedZ(Event evvent) {
    Z.setStyle("-fx-text-fill: grey;");
    Z.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedZ(Event evvent) {
    Z.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedZ1(Event evvent) {
    Z1.setStyle("-fx-text-fill: grey;");
    Z1.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedZ1(Event evvent) {
    Z1.setStyle("-fx-text-fill: white;");
  }
    @FXML
private void OnMouseMovedZ2(Event evvent) {
    Z2.setStyle("-fx-text-fill: grey;");
    Z2.setCursor(Cursor.HAND);
  }
@FXML
private void OnMouseExitedZ2(Event evvent) {
    Z2.setStyle("-fx-text-fill: white;");
  }

}

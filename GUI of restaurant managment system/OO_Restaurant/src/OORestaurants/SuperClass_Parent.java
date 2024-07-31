/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADITYA
 */
public class SuperClass_Parent {
    
    public double Filet_O_Fish;  
    public double ChickenBurger;
    public double ChickenLengend;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    
    public double MilkShake;
    public double VanliiaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocoMilkShake;
    
    
    
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals = Filet_O_Fish + ChickenBurger + ChickenLengend + ChickenBurgerM + BaconCheeseBurger;
        Drinks = MilkShake + VanliiaCone +  ClasVanilla + VanMilkShake + ChocoMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = Meals + Drinks;
        return AllTotalofMD ;
    }
    
    
    private JFrame frame;
    
    public void iExitSystem(){
            frame = new JFrame("Exit");
            
            if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit ","Restaurant Management System",
                    JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
        }
    //===========================================Price===============================================================
    
    public double pFilet_O_Fish = 3.56;  
    public double pChickenBurger = 2.95;
    public double pChickenLengend = 3.98;
    public double pChickenBurgerM = 2.65;
    public double pBaconCheeseBurger = 3.64;
    
    public double pMilkShake = 2.10;
    public double pVanliiaCone = 2.20;
    public double pClasVanilla = 2.50;
    public double pVanMilkShake = 1.95;
    public double pChocoMilkShake = 2.37;
   
    //===============================================================================================================
    
    public double mcTax = 0.98;
    public Double cFindTax(double cAmount)
    {
        double FindTax =cAmount - (cAmount * mcTax);
        return FindTax;
    } 
     //===============================================================================================================
}

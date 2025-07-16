/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vien
 */
public class SuperClass_Parent {
    
    public double tRice;
    public double tSisig;
    public double tSinigang;
    public double tFriedChicken;
    public double tSpag;
    public double tCarbonara;
    
    public double tWater;
    public double tJuice;
    public double tCoke;
    public double tCoffee;
    public double tHotChoco;
    public double tVanillaShake;
    
    public double tMeals;
    public double tDrinks;
    public double tMD;
    
    public double GetAmount() {
        tMeals = tRice + tSisig + tSinigang + tFriedChicken + tSpag + tCarbonara;
        tDrinks = tWater + tJuice + tCoke + tCoffee + tHotChoco + tVanillaShake;
        tMD = tMeals + tDrinks;
        return tMD;
    }
    
   private JFrame frame;
   
   public void iExitSystem(){
       frame = new Jframe("exit");
       
       if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant Management System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
          System.exit(0);
   }
    
}
    
   //---------------------------------PRICE-----------------------------------
   public double Rice = 35;
    public double Sisig = 120;
    public double Sinigang = 200;
    public double FriedChicken = 75;
    public double Spag = 80;
    public double Carbonara = 90;
    
    public double Water = 20;
    public double Juice = 50;
    public double Coke = 60;
    public double Coffee = 115;
    public double HotChoco = 120;
    public double VanillaShake = 150;
    
   //-------------------------------TAX---------------------------------------
    
    public double jfTax = 0.12;
    
    public Double cFindTax(double cAmount) {
        double FindTax = (cAmount * jfTax);
        return FindTax;
    }
}

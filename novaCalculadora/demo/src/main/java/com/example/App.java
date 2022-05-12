package com.example;

import java.util.Scanner;
import Services.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static Scanner scan = new Scanner(System.in);

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        String option;
        double firstNumber;
        double secoundNumber;
        boolean on = true;
        
        System.out.println("Hello Calculator!");
        System.out.println("============");
        System.out.println("For SUM, press 1;");
        System.out.println("For DIV, press 2;");
        System.out.println("For SUB, press 3;");
        System.out.println("For MULT, press 4;");
        System.out.println("To exit the application, press enter without any value.\n");
        
        
        try {
            while(on){
                
                option = chargeOption();
                
                if(option.isEmpty()){
                    on = false;
                    continue;        
                }
                
                System.out.println("Enter your first number: ");
                firstNumber = getDouble();
                System.out.println("Enter your second number: ");
                secoundNumber = getDouble();
    
                switch (option) {
                    case "1":{
                        SUM calc = new SUM();
                        calc.firstNumber = firstNumber;
                        calc.secoundNumber = secoundNumber;
                        System.out.println("Result: "+calc.Calculate());
                    }
                        break;
    
                    case "2":{
                        DIV calc = new DIV();
                        calc.firstNumber = firstNumber;
                        calc.secoundNumber = secoundNumber;
                        System.out.println("Result: "+calc.Calculate());
                    }
                        break;                    
                
                    case "3":{
                        SUB calc = new SUB();
                        calc.firstNumber = firstNumber;
                        calc.secoundNumber = secoundNumber;
                        System.out.println("Result: "+calc.Calculate());
                    }
                        break;                    
    
                    case "4":{
                        MULT calc = new MULT();
                        calc.firstNumber = firstNumber;
                        calc.secoundNumber = secoundNumber;
                        System.out.println("Result: "+calc.Calculate());
                    }
                        break;

                    default:
                        System.out.println("Invalid Option");
                    break;
                }
            }
            
        } 
        catch (Exception e) 
        {
            System.out.println("\nError occurred, restart application and retry.\nErrorMessage:"+ e.getMessage());
        }

        System.out.println("Exiting...");
    }
    
    public static String chargeOption(){
        System.out.println("Select your option: ");
        return scan.nextLine();
    }

    public static double getDouble(){
        return Double.parseDouble(scan.nextLine());
    }
}

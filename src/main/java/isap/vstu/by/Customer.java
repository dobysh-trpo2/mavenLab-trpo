package lab5;

import java.lang.String;
import java.util.Scanner;

public class Customer  {
     String ID = null;
     String surname;
     String name;
     String patronymic;
     String adress;
     int creditCardNumber;
     int bankID;
     
    Customer() {}
    Customer(String ID, String surname, String name, String patronymic,
            String adress, int creditCardNumber, int bankID) {
        
        this.ID = ID;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.creditCardNumber = creditCardNumber;
        this.bankID = bankID;
    }
    Customer(Scanner inScanner) {
        inScanner.useDelimiter("\n");
        inScanner.findInLine("id: ");
        ID = inScanner.next();
        inScanner.nextLine();
        inScanner.findInLine("name: ");
        name = inScanner.next();
        inScanner.nextLine();
        inScanner.findInLine("surname: ");
        surname = inScanner.next();
        inScanner.nextLine();
        inScanner.findInLine("patronymic: ");
        patronymic = inScanner.next();
        inScanner.nextLine();
        inScanner.findInLine("adress: ");
        adress = inScanner.next();
        inScanner.nextLine();
        
        inScanner.findInLine("creditCard: ");
        creditCardNumber = Integer.parseInt(inScanner.nextLine());
        inScanner.findInLine("bankID: ");
        bankID = Integer.parseInt(inScanner.nextLine());
        
        
    }
     @Override
    public String toString() {
        String outString = "";
        outString += "\nID: ";
        outString += ID;
        
        outString += "\nname: ";
        outString += name;
        
        outString += "\nsurname: ";
        outString += surname;
        
        outString += "\npatronymic: ";
        outString += patronymic;
        
        outString += "\nadress: ";
        outString += adress;
        
        outString += "\ncreditCard: ";
        outString += creditCardNumber;
        
        outString += "\nbankID: ";
        outString += bankID;  
        return outString;
    }
    
    
    
    
}

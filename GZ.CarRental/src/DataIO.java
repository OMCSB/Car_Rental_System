
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garet
 */
public class DataIO {
    
    public static void createFile() throws IOException{
        File customerAccount = new File("customerAccount.txt");
        if (customerAccount.createNewFile()){
            System.out.println("File Created Succesfully");
        }
        File carData = new File("carData.txt");
        if (carData.createNewFile()){
            System.out.println("File Created Succesfully");
        }
        File customerBooking = new File("customerBooking.txt");
        if (customerBooking.createNewFile()){
            System.out.println("File Created Succesfully");
        }
    }
    
    public static boolean readCustomerAccountFile(String userName, String userPassword) throws IOException{
        
//      Try Creating A File. In this case Customer Account
        BufferedReader customerAccountFileReader = new BufferedReader(new FileReader("customerAccount.txt"));
        String tCustomerAccountDataStrg = customerAccountFileReader.readLine();
        while (tCustomerAccountDataStrg != null){
            String[] customerAccountDetail = tCustomerAccountDataStrg.split(":");
            if (userName.equals(customerAccountDetail[0]) && userPassword.equals(customerAccountDetail[1])){
                return true;
            }
                tCustomerAccountDataStrg = customerAccountFileReader.readLine();
            }
        customerAccountFileReader.close();
        return false;
    }

    public static void writeCustomerAccountFile(String userName, String userPassword) throws IOException{
        BufferedWriter customerAccountFileWriter = null;
        try{
            customerAccountFileWriter = new BufferedWriter(new FileWriter("customerAccount.txt", true));
        } catch (Exception e){
            System.out.println("An error has occured");
        }
        customerAccountFileWriter.write(UserAccount.constructingCustomer(userName, userPassword));
        customerAccountFileWriter.newLine();
        customerAccountFileWriter.close();
    }
    
}

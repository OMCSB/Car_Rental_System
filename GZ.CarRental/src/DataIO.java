
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
    
    public static void createFile(){
        File customerAccount = new File("customerAccount.txt");
        File carData = new File("carData.txt");
        File customerBooking = new File("customerBooking.txt");
    }
    
    public static boolean readCustomerAccountFile(String userName, String userPassword) throws IOException{
        
//      Declaring File Reader Variables
        BufferedReader customerAccountFileReader = null;
        
//      Try Creating A File. In this case Customer Account
        try{
            customerAccountFileReader = new BufferedReader(new FileReader("customerAccount.txt"));
           
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        
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
            customerAccountFileWriter = new BufferedWriter(new FileWriter("customerAccount.txt"));
        } catch (Exception e){
            System.out.println("An error has occured");
        }
        customerAccountFileWriter.write(userName + ":" + userPassword);
    }
    
    public static void writeCarDataFile(String carCode, String carBrand, String carType, float rentPerDay, String carAvailability) throws IOException{
        BufferedWriter carDataFileWriter = null;
        try{
            carDataFileWriter = new BufferedWriter(new FileWriter("carData.txt"));
        } catch(Exception e){
            System.out.println("An error has occured");
        }
        carDataFileWriter.write(carCode + ":" + carBrand + ":" + carType + ":"+ rentPerDay + ":" + carAvailability);
    }
    
}

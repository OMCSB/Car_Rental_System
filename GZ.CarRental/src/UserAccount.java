
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garet
 */
public class UserAccount extends carDetails{
    
    public static String constructingCustomer(String userName, String userPassword){
        String prepareData = userName + ":" + userPassword;
        return prepareData;
    }
    public static void writeCustomerBookingFile(String userName, String carCode, String bookStatus, int rentDays, float totalPayment, String paymentStatus, String rentingStatus) throws IOException{
        BufferedWriter customerBookingFileWriter = new BufferedWriter(new FileWriter("customerBooking.txt", true));
        customerBookingFileWriter.write(userName + ":" + carCode + ":" + rentDays + ":" + totalPayment + ":" + paymentStatus + ":" + rentingStatus + ":" + bookStatus);
        customerBookingFileWriter.newLine();
        customerBookingFileWriter.close();
    }
    public UserAccount(String carCode, String carBrand, String carType, float rentPerDay, String carAvailability) {
        super(carCode, carBrand, carType, rentPerDay, carAvailability);
    }
    
    public static Vector<String[]> addCustomerCarDataFile() throws FileNotFoundException, IOException{
        BufferedReader tCustomerCarDataFileReader = new BufferedReader(new FileReader("customerBooking.txt"));
        String tCustomerCarDataStrg = tCustomerCarDataFileReader.readLine();
        Vector<String[]> fCustomerCarDataDetail = new Vector<String[]>();
        while (tCustomerCarDataStrg != null){
            String[] tCustomerCarDataDetail = tCustomerCarDataStrg.split(":");
            String[] customerCarDataDetail = {tCustomerCarDataDetail[0], tCustomerCarDataDetail[1], tCustomerCarDataDetail[4]};
            fCustomerCarDataDetail.add(customerCarDataDetail);
            tCustomerCarDataStrg = tCustomerCarDataFileReader.readLine();
        }
        return fCustomerCarDataDetail;
    }
    
}

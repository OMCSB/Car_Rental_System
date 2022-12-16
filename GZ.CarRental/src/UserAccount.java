
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
    public static void editCustomerCarDetail(String userName, String carCode, String bookStatus) throws IOException{
        Path nPath = Paths.get("customerAccount.txt");
        BufferedReader customerDataFileReader = new BufferedReader(new FileReader("customerAccount.txt"));
        String customerDataStrg = customerDataFileReader.readLine();
        List<String> dataLines = Files.readAllLines(nPath);
        int n = 0;
        while (customerDataStrg != null){
            String[] tCustomerDetail = customerDataStrg.split(":");
        }
    }

    public UserAccount(String carCode, String carBrand, String carType, float rentPerDay, String carAvailability) {
        super(carCode, carBrand, carType, rentPerDay, carAvailability);
    }
    
}

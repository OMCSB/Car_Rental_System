
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
public class userBookingPaymentHistory {
    
    public static Vector<String[]> addCustomerBookingStatusToTable(String userName) throws IOException{
        BufferedReader customerBookingStatusFileReader = new BufferedReader(new FileReader("customerBooking.txt"));
        String tFileRead = customerBookingStatusFileReader.readLine();
        Vector<String[]> fFileRead = new Vector<String[]>();
        while (tFileRead != null){
            String[] tFileData = tFileRead.split(":");
            if (tFileData[0].equals(userName)){
                String[] customerBookingData = {tFileData[1], tFileData[4], tFileData[6], tFileData[3]};
                fFileRead.add(customerBookingData);
            }
            tFileRead = customerBookingStatusFileReader.readLine();
        }
        return fFileRead;
    }
    
    public static void readForPayment(String carCode) throws FileNotFoundException, IOException{
        Path nPath = Paths.get("customerBooking.txt");
        BufferedReader customerBookingStatusFileReader = new BufferedReader(new FileReader("customerBooking.txt"));
        String tFileRead = customerBookingStatusFileReader.readLine();
        List<String> dataLine = Files.readAllLines(nPath);
        int n = 0;
        String[] strgDataLine = null;
        while (tFileRead != null){
            String[] tDataStr = tFileRead.split(":");
            if(tDataStr[1].equals(carCode) && !tDataStr[4].equals("Paid")){
                strgDataLine = tDataStr;
                dataLine.remove(n);
            }
            tFileRead = customerBookingStatusFileReader.readLine();
            n++;
        }
        strgDataLine[4] = "Paid";
        Files.write(nPath, dataLine);
        customerBookingStatusFileReader.close();
        
        BufferedWriter x = new BufferedWriter(new FileWriter("customerBooking.txt", true));
        for (int i = 0; i < strgDataLine.length; i++){
            x.write(strgDataLine[i] + ":");
        }
        x.newLine();
        x.close();
    }
    
    
}

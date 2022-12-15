
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garet
 */
public class carDetails extends DataIO{
    
    private String carCode, carBrand, carType, carAvailability;
    private float rentPerDay;
    
    public carDetails(String carCode, String carBrand, String carType, float rentPerDay, String carAvailability){
        this.carCode = carCode;
        this.carBrand = carBrand;
        this.carType = carType;
        this.rentPerDay = rentPerDay;
        this.carAvailability = carAvailability;
    }
    
    public String getCarCode(){
        return carCode;
    }
    public void setCarCode(){
        this.carCode = carCode;
    }
    
    public String getCarBrand(){
        return carBrand;
    }
    public void setCarBrand(){
        this.carBrand = carBrand;
    }
    
    public String getCarType(){
        return carType;
    }
    public void setCarType(){
        this.carType = carType;
    }
    
    public float getRentPerDay(){
        return rentPerDay;
    }
    public void setRentPerDay(){
        this.rentPerDay = rentPerDay;
    }
    
    public String getCarAvailability(){
        return carAvailability;
    }
    public void setCarAvailability(){
        this.carAvailability = carAvailability;
    }
    
    
    public static Vector<String[]> addCarDataFile() throws FileNotFoundException, IOException{
        BufferedReader tCarDataFileReader = new BufferedReader(new FileReader("carData.txt"));
        String tCarDataStrg = tCarDataFileReader.readLine();
        Vector<String[]> fCarDataDetail = new Vector<String[]>();
        while (tCarDataStrg != null){
            String[] carDataDetail = tCarDataStrg.split(":");
            fCarDataDetail.add(carDataDetail);
            tCarDataStrg = tCarDataFileReader.readLine();
        }
        return fCarDataDetail;
    }
    
    public static boolean validateCarDataFile(String carCode) throws FileNotFoundException, IOException{
        BufferedReader tCarDataFileReader = new BufferedReader(new FileReader("carData.txt"));
        String tCarDataStrg = tCarDataFileReader.readLine();
        while (tCarDataStrg != null){
            String[] carDataDetail = tCarDataStrg.split(":");
            if (carDataDetail[0].equals(carCode)){
                JOptionPane.showMessageDialog(null, "Car Code Already Registered");
                return true;
            }
            tCarDataStrg = tCarDataFileReader.readLine();
        }
        return false;
    }
    
    
    
     public static void writeCarDataFile(String carCode, String carBrand, String carType, float rentPerDay, String carAvailability) throws IOException{
        BufferedWriter carDataFileWriter = null;
        try{
            carDataFileWriter = new BufferedWriter(new FileWriter("carData.txt", true));
        } catch(Exception e){
            System.out.println("An error has occured");
        }
        carDataFileWriter.write(carCode + ":" + carBrand + ":" + carType + ":"+ rentPerDay + ":" + carAvailability);
        carDataFileWriter.newLine();
        carDataFileWriter.close();
    }
     
     public static void overWriteCarDataFile(String carCode) throws IOException{
         Path nPath = Paths.get("carData.txt");
         BufferedReader oriCarDataFileReader = new BufferedReader(new FileReader("carData.txt"));
         String carDataStrg = oriCarDataFileReader.readLine();
         List<String> dataLines = Files.readAllLines(nPath);
         int n = 0;
         while (carDataStrg != null){
             String[] tCarDetail = carDataStrg.split(":");
             if (tCarDetail[0].equals(carCode)){
                 dataLines.remove(n);
                 break;
             }
             carDataStrg = oriCarDataFileReader.readLine();
             n++;
         }
         Files.write(nPath, dataLines);
         oriCarDataFileReader.close();
         
     }
}



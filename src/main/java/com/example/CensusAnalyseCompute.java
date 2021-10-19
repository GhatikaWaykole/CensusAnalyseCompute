package com.example;
/* census analyse compute
 * censusCSVData take the number of records and compute the data
 */
import java.io.*;

public class CensusAnalyseCompute {
    public static void main(String args[]) {
        CensusAnalyseCompute census = new CensusAnalyseCompute();
        System.out.println("Welcome to the cenus analyse program");
        census.censusDetailCSVLoad();
        census.display();
    }
    /* censusDetailCSVLoad method to write the ata in the csv and use the comma in the field data
     StringBuilder to write the data
     */
    public void censusDetailCSVLoad() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state").append(",").append("population").append(",").append("areaSrmtr").append(",").append("densitySqmtr").append("\n");
        stringBuilder.append("maharashtra").append(",").append("1200000000").append(",").append("200000000").append(",").append("3000000000").append("\n");
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\IdeaProjects\\CensusAnalyseCompute\\src\\main\\resources\\CensusCSVData.csv")) {
            fileWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /* display method to read the number of record present in the csv compute
     BuggerReader to read the data throught and return number of record data compute
     */
    public int display() {
        String line = "";
        int number = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\PC\\IdeaProjects\\CensusAnalyseCompute\\src\\main\\resources\\CensusCSVData.csv"));
            while ((line = reader.readLine()) != null) {
                number++;
                System.out.println(line);
            }
            System.out.println(number);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }
}

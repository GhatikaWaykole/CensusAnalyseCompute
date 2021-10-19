package com.example;
/* census analyse compute
 * censusCSVData take the number of records and compute the data
 */
import java.io.*;

public class CensusAnalyseCompute {
    /* censusDetailCSVLoad method to write the data in the csv and use the comma in the field data
     * StringBuilder to write the data
     * patha does not ave csv then throw the custom exception data
     */
    public boolean censusDetailCSVLoad(String path) throws CensusDataCustomeException, IOException {
            String path1 = "C:\\Users\\PC\\IdeaProjects\\CensusAnalyseCompute\\src\\main\\resources\\CensusCSVData.csv";
              if(path.contains("txt")){
                  throw new CensusDataCustomeException("give the proper type data");
              }
              else {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("state").append(",").append("population").append(",").append("areaSrmtr").append(",").append("densitySqmtr").append("\n");
                  stringBuilder.append("maharashtra").append(",").append("1200000000").append(",").append("200000000").append(",").append("3000000000").append("\n");
                  FileWriter fileWriter = new FileWriter(path1);
                  fileWriter.write(stringBuilder.toString());
                  return true;
              }
            }
    /* display method to read the number of record present in the csv compute
     BuggerReader to read the data throught and return number of record data compute
     */
    public int display(String path) {
        String line = "";
        int number = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
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

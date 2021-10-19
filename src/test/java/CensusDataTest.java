import com.example.CensusAnalyseCompute;
import com.example.CensusDataCustomeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CensusDataTest {
    CensusAnalyseCompute censusAnalyseCompute;
    String path = "C:\\Users\\PC\\IdeaProjects\\CensusAnalyseCompute\\src\\main\\resources\\CensusCSVData.txt";
    @Before
     public void detail() {
        censusAnalyseCompute = new CensusAnalyseCompute();
    }
    /* test method to check the number of data present in the csv compute
     * happy test result
     */
    @Test
    public void GivenDataValue_WhenProperNumberOfData_ShouldReturnTrue(){
       int result =  censusAnalyseCompute.display(path);
        Assert.assertEquals(2,result);
    }
    /* method to check the csv and type data
     * csv not correct then return the custom exception
     */
    @Test
    public void GivenCensusTypeCSV_WhenNotProper_ShouldReturnException() throws CensusDataCustomeException {
        try {
           boolean result = censusAnalyseCompute.censusDetailCSVLoad(path);
            Assert.assertTrue(result);
        }catch (CensusDataCustomeException | IOException e){
            e.printStackTrace();
        }
    }
}
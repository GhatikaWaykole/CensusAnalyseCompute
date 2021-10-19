import com.example.CensusAnalyseCompute;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CensusDataTest {
    CensusAnalyseCompute censusAnalyseCompute;
    @Before
     public void detail() {
        censusAnalyseCompute = new CensusAnalyseCompute();
    }
    /* test method to check the number of data present in the csv compute
     * happy test result
     */
    @Test
    public void GivenDataValue_WhenProperNumberOfData_ShouldReturnTrue(){
       int result =  censusAnalyseCompute.display();
        Assert.assertEquals(2,result);
    }
}
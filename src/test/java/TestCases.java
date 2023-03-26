import org.junit.Assert;
import org.junit.Test;
import userregisterprogram.FirstName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
public class TestCases {
    FirstName  user =new FirstName();
    @Test
    public void addTest(){
        Assert.assertEquals(true,user.FirstName2("Aswini"));
    }

}

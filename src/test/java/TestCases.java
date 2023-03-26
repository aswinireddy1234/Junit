import org.junit.Assert;
import org.junit.Test;
import userregisterprogram.FirstName;
import userregisterprogram.LastName;
import userregisterprogram.Email;
import userregisterprogram.PhoneNumber;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
public class TestCases {
    FirstName  user =new FirstName();
    @Test
    public void addTest(){
        Assert.assertEquals(true,user.FirstName2("Aswini"));
    }
    LastName  user2 =new LastName();

    @Test
    public void addTest2(){
        Assert.assertEquals(true,user2.LastName2("Reddy"));
    }

    Email  user3 =new Email();

    @Test
    public void addTest3() { Assert.assertEquals(true,user3.Email2("ashu123@gmail.com"));
    }
    PhoneNumber  user4 =new PhoneNumber();

    @Test
    public void addTest4() { Assert.assertEquals(true,user4.PhoneNumber2("91 6303632499"));
    }
}


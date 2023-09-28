import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class testRunner extends Setup{


    @Test(priority = 1)
    public void doMul(){
        CalcRes cal = new CalcRes(driver);
        String res = cal.Mul();
        Assert.assertEquals(res, "15");
    }
    @Test(priority = 2)
    public void doDiv(){
        CalcRes cal = new CalcRes(driver);
        String res = cal.Divi();
        Assert.assertEquals(res, "2.66666666");
    }
    @AfterMethod
    public void clear(){
        CalcRes cal = new CalcRes(driver);
        cal.setClrSC();
    }
}


import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcRes {
    @FindBy(id = "com.google.android.calculator:id/digit_3")
    AndroidElement btn3;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    AndroidElement mul;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    AndroidElement btn5;
    @FindBy(id = "com.google.android.calculator:id/eq")
    AndroidElement eql;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    AndroidElement finlRes;
    @FindBy(id = "com.google.android.calculator:id/clr")
    AndroidElement clrSC;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    AndroidElement div;
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    AndroidElement btn8;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    AndroidElement Div;

    public CalcRes(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String Mul(){
        btn3.click();
        mul.click();
        btn5.click();
        eql.click();
        return finlRes.getText();
    }

    public  String Divi(){
        btn8.click();
        Div.click();
        btn3.click();
        eql.click();
        return finlRes.getText();
    }
    public void setClrSC(){
        clrSC.click();
    }
}

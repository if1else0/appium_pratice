package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class PageQQLogin {
    private Helper helper;

    public PageQQLogin(Helper helper){
        this.helper = helper;
    }

    public WebElement getNameEditText(){
        return helper.findById("u");
    }

    public WebElement getPwdEditText(){
        return helper.findById("p");
    }

    public void enterName(String name){
        helper.enter(getNameEditText(),name);
    }

    public void enterPwd(String pwd){
        helper.enter(getPwdEditText(),pwd);
    }

}

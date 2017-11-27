package pages;

import com.gargoylesoftware.htmlunit.javascript.host.canvas.WebGL2RenderingContext;
import common.Helper;
import org.openqa.selenium.WebElement;

public class PageLogin {
    private Helper helper;

    public PageLogin(Helper helper){
        this.helper = helper;
    }

    public WebElement getName(){
       return helper.findById("net.oschina.app:id/et_username");
    }

    public WebElement getPwd(){
        return helper.findById("net.oschina.app:id/et_password");
    }

    public WebElement getLoginBtn(){
        return helper.findById("net.oschina.app:id/btn_login");
    }

    public void clearName(){
        helper.clear(getName());
    }

    public void clearPwd(){
        helper.clear(getPwd());
    }

    public void enterName(String name){
        helper.enter(getName(),name);
    }

    public void enterPwd(String password){
        helper.enter(getPwd(),password);
    }

    public void clickLoginBtn(){
        helper.click(getLoginBtn());
    }

    public void login(String name,String password){
        clearName();
        enterName(name);
        clearPwd();
        enterPwd(password);
        clickLoginBtn();
    }

    public boolean isLoginScreenOpened(){
        boolean result = false;
        if(getLoginBtn() != null){
            return getLoginBtn().isDisplayed();
        }
        return result;
    }

}

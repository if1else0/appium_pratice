package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageSettings {
    private Helper helper;

    public PageSettings(Helper helper){
        this.helper = helper;
    }

    public WebElement getLogoutItem(){
        return helper.findById("net.oschina.app:id/rl_cancle");
    }

    public WebElement getAboutItem(){
        return helper.findById("net.oschina.app:id/rl_about");
    }

    public void clickLogout(){
        helper.click(getLogoutItem());
    }

    public void clickAbout(){
        helper.click(getAboutItem());
    }

}

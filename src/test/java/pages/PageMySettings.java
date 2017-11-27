package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageMySettings {
    private Helper helper;

    public PageMySettings(Helper helper){
        this.helper = helper;
    }

    public WebElement getSetingsBtn(){
        return  helper.findById("net.oschina.app:id/iv_logo_setting");
    }

    public WebElement getLoginIcon(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }

    public WebElement getMyMsgItem(){
        return  helper.findById("net.oschina.app:id/rl_message");
    }

    public WebElement getMyBlogItem(){
        return  helper.findById("net.oschina.app:id/rl_blog");
    }

    public WebElement getMyActivityItem(){
        return  helper.findById("net.oschina.app:id/rl_info_avtivities");
    }

    public WebElement getMyTeamItem(){
        return  helper.findById("net.oschina.app:id/rl_team");
    }

    public WebElement getNickNameTextView(){
        return helper.findById("net.oschina.app:id/tv_nick");
    }

    public WebElement getFavoritesLayout(){
        return helper.findById("net.oschina.app:id/ly_favorite");
    }

    public  void clickMyMsgItem(){
        helper.click(getMyMsgItem());
    }

    public void clickMyBlogItem(){
        helper.click(getMyBlogItem());
    }

    public void clickMyActivityItem(){
        helper.click(getMyActivityItem());
    }

    public void clickMyTeamItem(){
        helper.click(getMyTeamItem());
    }

    public void clickLoginIcon(){
        helper.click(getLoginIcon());
    }

    public String getNickName(){
       return helper.getText(getNickNameTextView());
    }

    public void clickSettingsBtn(){
        helper.click(getSetingsBtn());
    }

    public void clickFavoritesLayout(){
        helper.click(getFavoritesLayout());
    }
}

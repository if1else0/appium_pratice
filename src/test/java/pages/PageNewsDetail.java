package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageNewsDetail {

    private Helper helper;

    public PageNewsDetail(Helper helper){
        this.helper = helper;
    }

    public WebElement getAddToFavoritesBtn(){
        return helper.findById("net.oschina.app:id/iv_fav");
    }

    public WebElement getShareBtn(){
        return helper.findById("net.oschina.app:id/iv_share");
    }

    public WebElement getShareToQQ(){
        return  helper.findById("net.oschina.app:id/ly_share_qq");
    }

    public void clickAddToFavorites(){
        helper.click(getAddToFavoritesBtn());
    }

    public void clickShareBtn(){
        helper.click(getShareBtn());
    }

    public void clickShareToQQ(){
        helper.click(getShareToQQ());
    }
}

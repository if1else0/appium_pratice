package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageFavoritesList {

    private Helper helper;

    public PageFavoritesList(Helper helper){
        this.helper = helper;
    }

    public WebElement getFavoritesTitleTextView(int index){
        return helper.findById("net.oschina.app:id/tv_favorite_title",index - 1);
    }

    public String getFavoritesTitle(int index){
        return helper.getText(getFavoritesTitleTextView(index));
    }

}

package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageNews {
    private Helper helper;

    public PageNews(Helper helper){
        this.helper = helper;
    }

    public WebElement getNewsTitleTextView(int index){
       return helper.findById("net.oschina.app:id/tv_title",index );
    }

    public void clickNewsItem(int index){
        helper.click(getNewsTitleTextView(index));
    }

    public String getNewsTitle(int index){
        return helper.getText(getNewsTitleTextView(index));
    }
}

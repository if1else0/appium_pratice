package testcases.webview;

import common.BasicTestCase;
import org.testng.annotations.Test;

public class WebViewTest extends BasicTestCase {


    @Test
    public void testName() throws Exception {
        pageHelper.getPageNews().clickNewsItem(2);
        Thread.sleep(7000);
        pageHelper.getPageCommon().switchToWebView();
        System.out.println(pageHelper.getPageNewsDetail().getFirstLineText());
    }
}

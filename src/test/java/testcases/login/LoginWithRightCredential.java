package testcases.login;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginWithRightCredential extends BasicTestCase{

    @Test
    public void testLoginWithRightCredential() throws Exception {
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickLoginIcon();
        pageHelper.getPageLogin().login("735723619@qq.com","12345678");
        assertEquals("aotu12345aotu",pageHelper.getPageMySettings().getNickName());
    }
}

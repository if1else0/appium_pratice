package testcases.versioncheck;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class VersionCheck extends BasicTestCase {


    @Test
    public void testVersionCheck() throws Exception {
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickSettingsBtn();
        pageHelper.getPageSettings().clickAbout();
        assertEquals("v2.9.8(1609281026)",pageHelper.getPageAbout().getVersion());
    }
}

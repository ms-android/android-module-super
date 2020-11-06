package com.ms.module.supers;

import android.content.Context;


import com.ms.module.supers.client.Modules;

import org.junit.Test;


import static org.junit.Assert.assertNotNull;

public class ModulesTest {


    @Test
    public void useAppContext() {

        assertNotNull(Modules.getAliyuLogModule());
        assertNotNull(Modules.getAliyunSTSModule());
        assertNotNull(Modules.getApiModule());
        assertNotNull(Modules.getCommonModule());
        assertNotNull(Modules.getControlSwitch());
        assertNotNull(Modules.getDataModule());
        assertNotNull(Modules.getDataPersistenceModule());
        assertNotNull(Modules.getExceptionModule());
        assertNotNull(Modules.getLogin3Module());
        assertNotNull(Modules.getLogModule());
        assertNotNull(Modules.getMmkvModule());
        assertNotNull(Modules.getPay3Module());
        assertNotNull(Modules.getPermissionModule());
        assertNotNull(Modules.getRequestModule());
        assertNotNull(Modules.getRequestSettingModule());
        assertNotNull(Modules.getTencentBuglyModule());
        assertNotNull(Modules.getUtilsModule());
        assertNotNull(Modules.getWeChatClearConfig());
        assertNotNull(Modules.getWeChatClearModule());
    }
}




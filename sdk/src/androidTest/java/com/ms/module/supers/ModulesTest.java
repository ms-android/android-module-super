package com.ms.module.supers;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.ms.module.supers.client.Modules;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;


@RunWith(AndroidJUnit4.class)
public class ModulesTest {


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

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




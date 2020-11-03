package com.ms.module.supers.internal.client;

import com.ms.module.supers.internal.AliyuLogModule;
import com.ms.module.supers.internal.AliyunSTSModule;
import com.ms.module.supers.internal.ApiModule;
import com.ms.module.supers.internal.CommonModule;
import com.ms.module.supers.internal.ControllSwitchModule;
import com.ms.module.supers.internal.DataModule;
import com.ms.module.supers.internal.DataPersistenceModule;
import com.ms.module.supers.internal.ExceptionModule;
import com.ms.module.supers.internal.LogModule;
import com.ms.module.supers.internal.Login3Module;
import com.ms.module.supers.internal.MMKVModule;
import com.ms.module.supers.internal.NetStatusModule;
import com.ms.module.supers.internal.Pay3Module;
import com.ms.module.supers.internal.PermissionModule;
import com.ms.module.supers.internal.RequestModule;
import com.ms.module.supers.internal.RequestSettingModule;
import com.ms.module.supers.internal.TencentBuglyModule;
import com.ms.module.supers.internal.UtilsModule;
import com.ms.module.supers.internal.WeChatClearModule;

/**
 * 内部客户端
 */
public class ModuleClient {

    private static LogModule logModule;

    /**
     * 日志模块
     *
     * @return
     */
    public static LogModule getLogModule() {
        if (logModule == null) {
            logModule = new LogModule();
        }
        return logModule;
    }


    private static ApiModule apiModule;

    /**
     * API模块
     *
     * @return
     */
    public static ApiModule getApiModule() {

        if (apiModule == null) {
            apiModule = new ApiModule();
        }
        return apiModule;
    }


    public static UtilsModule utilsModule;


    /**
     * 工具类模块
     *
     * @return
     */
    public static UtilsModule getUtilsModule() {
        if (utilsModule == null) {
            utilsModule = new UtilsModule();
        }
        return utilsModule;
    }


    private static DataModule dataModule;

    /**
     * 数据模块
     *
     * @return
     */
    public static DataModule getDataModule() {
        if (dataModule == null) {
            dataModule = new DataModule();
        }
        return dataModule;
    }


    private static PermissionModule permissionModule;

    /**
     * 权限模块
     *
     * @return
     */
    public static PermissionModule getPermissionModule() {
        if (permissionModule == null) {
            permissionModule = new PermissionModule();
        }
        return permissionModule;
    }

    private static RequestModule requestModule;

    /**
     *
     * @return
     */
    public static RequestModule getRequestModule() {
        if (requestModule == null) {
            requestModule = new RequestModule();
        }
        return requestModule;
    }

    private static ExceptionModule exceptionModule;

    public static ExceptionModule getExceptionModule() {
        if (exceptionModule == null) {
            exceptionModule = new ExceptionModule();
        }
        return exceptionModule;
    }

    private static MMKVModule mmkvModule;

    public static MMKVModule getMmkvModule() {

        if (mmkvModule == null) {
            mmkvModule = new MMKVModule();
        }

        return mmkvModule;
    }

    private static DataPersistenceModule dataPersistenceModule;


    public static DataPersistenceModule getDataPersistenceModule() {
        if (dataPersistenceModule == null) {
            dataPersistenceModule = new DataPersistenceModule();
        }


        return dataPersistenceModule;
    }


    private static ControllSwitchModule controllSwitchModule;

    public static ControllSwitchModule getControllSwitchModule() {

        if (controllSwitchModule == null) {
            controllSwitchModule = new ControllSwitchModule();
        }


        return controllSwitchModule;
    }


    private static NetStatusModule netStatusModule;

    public static NetStatusModule getNetStatusModule() {

        if (netStatusModule == null) {
            netStatusModule = new NetStatusModule();
        }
        return netStatusModule;
    }


    private static CommonModule commonModule;


    public static CommonModule getCommonModule() {
        if (commonModule == null) {
            commonModule = new CommonModule();
        }
        return commonModule;
    }

    private static RequestSettingModule requestSettingModule;

    public static RequestSettingModule getRequestSettingModule() {

        if (requestSettingModule == null) {
            requestSettingModule = new RequestSettingModule();
        }
        return requestSettingModule;
    }

    private static AliyuLogModule aliyuLogModule;

    public static AliyuLogModule getAliyuLogModule() {

        if (aliyuLogModule == null) {
            aliyuLogModule = new AliyuLogModule();
        }
        return aliyuLogModule;
    }


    private static AliyunSTSModule aliyunSTSModule;

    public static AliyunSTSModule getAliyunSTSModule() {

        if (aliyunSTSModule == null) {
            aliyunSTSModule = new AliyunSTSModule();
        }
        return aliyunSTSModule;
    }


    private static TencentBuglyModule tencentBuglyModule;

    /**
     * 腾讯BUGLY模块
     *
     * @return
     */
    public static TencentBuglyModule getTencentBuglyModule() {

        if (tencentBuglyModule == null) {
            tencentBuglyModule = new TencentBuglyModule();
        }

        return tencentBuglyModule;
    }


    private static Login3Module login3Module;

    /**
     * 三方登录模块
     *
     * @return
     */
    public static Login3Module getLogin3Module() {
        if (login3Module == null) {
            login3Module = new Login3Module();
        }
        return login3Module;
    }

    private static Pay3Module pay3Module;

    /**
     * 三方支付模块
     *
     * @return
     */
    public static Pay3Module getPay3Module() {
        if (pay3Module == null) {
            pay3Module = new Pay3Module();
        }
        return pay3Module;
    }

    private static WeChatClearModule weChatClearModule;

    /**
     * 微信清理模块
     *
     * @return
     */
    public static WeChatClearModule getWeChatClearModule() {
        if (weChatClearModule == null) {
            weChatClearModule = new WeChatClearModule();
        }
        return weChatClearModule;
    }


}
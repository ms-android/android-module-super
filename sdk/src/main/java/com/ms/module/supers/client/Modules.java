package com.ms.module.supers.client;


import com.ms.module.supers.inter.aliyun.log.IAliyuLog;
import com.ms.module.supers.inter.aliyun.sts.ISTS;
import com.ms.module.supers.inter.api.IAPI;
import com.ms.module.supers.inter.bugly.ITencentBugly;
import com.ms.module.supers.inter.common.ICommon;
import com.ms.module.supers.inter.controll.IControlSwitch;
import com.ms.module.supers.inter.data.IData;
import com.ms.module.supers.inter.datapersistence.IDataPersistence;
import com.ms.module.supers.inter.exception.IException;
import com.ms.module.supers.inter.log.ILog;
import com.ms.module.supers.inter.login3.ILogin3;
import com.ms.module.supers.inter.mmkv.IMMKV;
import com.ms.module.supers.inter.net.INetStatusChange;
import com.ms.module.supers.inter.net.IRequest;
import com.ms.module.supers.inter.net.IRequestSetting;
import com.ms.module.supers.inter.pay.IPay3;
import com.ms.module.supers.inter.permission.IPermission;
import com.ms.module.supers.inter.utils.IUtils;
import com.ms.module.supers.inter.wechat.IWeChatClear;
import com.ms.module.supers.inter.wechat.IWeChatClearConfig;
import com.ms.module.supers.internal.client.ModuleClient;

/**
 * 模块操作API
 */
public class Modules {
    private Modules() {
    }

    /**
     * 模块开关配置
     *
     * @return
     */
    public static IControlSwitch getControlSwitch() {
        return ModuleClient.getControllSwitchModule().get();
    }

    /**
     * 日志模块
     *
     * @return
     */
    public static ILog getLogModule() {
        return ModuleClient.getLogModule().get();
    }

    /**
     * API模块
     *
     * @return
     */
    public static IAPI getApiModule() {
        return ModuleClient.getApiModule().get();
    }

    /**
     * 工具类模块
     *
     * @return
     */
    public static IUtils getUtilsModule() {
        return ModuleClient.getUtilsModule().get();
    }

    /**
     * 临时数据模块
     *
     * @return
     */
    public static IData getDataModule() {
        return ModuleClient.getDataModule().get();
    }

    /**
     * 动态权限模块
     *
     * @return
     */
    public static IPermission getPermissionModule() {
        return ModuleClient.getPermissionModule().get();
    }

    /**
     * 网络请求模块
     *
     * @return
     */
    public static IRequest getRequestModule() {
        return ModuleClient.getRequestModule().get();
    }

    /**
     * 异常处理模式
     *
     * @return
     */
    public static IException getExceptionModule() {
        return ModuleClient.getExceptionModule().get();
    }

    /**
     * 缓冲模块
     *
     * @return
     */
    public static IMMKV getMmkvModule() {
        return ModuleClient.getMmkvModule().get();
    }

    /**
     * 数据存储模块
     *
     * @return
     */
    public static IDataPersistence getDataPersistenceModule() {
        return ModuleClient.getDataPersistenceModule().get();
    }

    /**
     * common 模块
     *
     * @return
     */
    public static ICommon getCommonModule() {
        return ModuleClient.getCommonModule().get();
    }

    /**
     * 网络请求设置模块
     *
     * @return
     */
    public static IRequestSetting getRequestSettingModule() {
        return ModuleClient.getRequestSettingModule().get();
    }

    /**
     * 阿里云日志模块
     *
     * @return
     */
    public static IAliyuLog getAliyuLogModule() {
        return ModuleClient.getAliyuLogModule().get();
    }

    /**
     * 阿里云STS模块
     *
     * @return
     */
    public static ISTS getAliyunSTSModule() {
        return ModuleClient.getAliyunSTSModule().get();
    }

    /**
     * 腾讯BUGLY模块
     *
     * @return
     */
    public static ITencentBugly getTencentBuglyModule() {
        return ModuleClient.getTencentBuglyModule().get();
    }

    /**
     * 网络变化
     *
     * @return
     */
    public static INetStatusChange getNetStatusModule() {
        return ModuleClient.getNetStatusModule().get();
    }

    /**
     * 三方登录
     *
     * @return
     */
    public static ILogin3 getLogin3Module() {
        return ModuleClient.getLogin3Module().get();
    }

    /**
     * 支付
     *
     * @return
     */
    public static IPay3 getPay3Module() {
        return ModuleClient.getPay3Module().get();
    }


    /**
     * 获取微信清理模块
     *
     * @return
     */
    public static IWeChatClear getWeChatClearModule() {
        return ModuleClient.getWeChatClearModule().get();
    }

    /**
     * 获取文件配置
     *
     * @return
     */
    public static IWeChatClearConfig getWeChatClearConfig() {
        return ModuleClient.getWeChatClearConfigModule().get();
    }
}
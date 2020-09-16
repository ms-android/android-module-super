package com.ms.module.supers.inter.login3;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * 三方登录
 */
public interface ILogin3 extends ISupers {

    // QQ 登录
    IQQLogin qq();

    // 微信登录
    IWeChatLogin wechat();

    // 支付宝登录

    IAliPayLogin alipay();

}

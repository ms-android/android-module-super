package com.ms.module.supers.inter.pay;

import com.ms.module.supers.inter.supers.ISupers;

public interface IPay3 extends ISupers {

    IWeChatPay wechat();

    IAliPay ali();

}

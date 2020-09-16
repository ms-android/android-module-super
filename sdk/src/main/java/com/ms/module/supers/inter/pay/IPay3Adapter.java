package com.ms.module.supers.inter.pay;

public class IPay3Adapter implements IPay3 {
    @Override
    public IWeChatPay wechat() {
        return null;
    }

    @Override
    public IAliPay ali() {
        return null;
    }
}

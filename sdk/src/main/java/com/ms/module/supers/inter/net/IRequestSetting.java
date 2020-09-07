package com.ms.module.supers.inter.net;

import com.ms.module.supers.inter.supers.ISupers;

public interface IRequestSetting  extends ISupers {


    void setConnectTimeout(int value);
    int getConnectTimeout();

    void setReadTimeout(int value);
    int getReadTimeout();

    void setWriteTimeout(int value);
    int getWriteTimeout();

    void setRequestLogOut(boolean flag);
    boolean getRequestLogOut();


}

package com.ms.module.supers.inter.net;

import com.ms.module.supers.inter.supers.ISupers;

public interface IRequestSetting extends ISupers {


    void setConnectTimeout(int value);

    default int getConnectTimeout() {
        return 10;
    }

    void setReadTimeout(int value);

    default int getReadTimeout() {
        return 10;
    }

    void setWriteTimeout(int value);

    default int getWriteTimeout() {
        return 10;
    }

    void setRequestLogOut(boolean flag);

    boolean getRequestLogOut();


}

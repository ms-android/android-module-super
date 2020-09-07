package com.ms.module.supers.inter.net;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.supers.ISupers;

public interface INetStatusChange  extends ISupers {

    void listener(ICallBack callBack);

}

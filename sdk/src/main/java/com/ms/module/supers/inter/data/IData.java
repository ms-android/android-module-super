package com.ms.module.supers.inter.data;

import com.ms.module.supers.inter.supers.ISupers;

public interface IData extends ISupers {

    IAppData getAppData();

    IUserData getUserData();

    IMatrixData getMatrixData();

    IAliyunSTSData getAliyunSTSData();


}


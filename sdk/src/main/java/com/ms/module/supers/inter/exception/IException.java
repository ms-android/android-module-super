package com.ms.module.supers.inter.exception;

import com.ms.module.supers.inter.supers.ISupers;

public interface IException extends ISupers {


    void handlerInit();

    void printStackTrace(Throwable e);

}

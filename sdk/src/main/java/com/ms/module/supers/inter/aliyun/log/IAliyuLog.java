package com.ms.module.supers.inter.aliyun.log;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * 阿里云日志服务
 */
public interface IAliyuLog extends ISupers {

    void setEndpoint(String endpoint);

    String getEndpoint();

    void setProject(String projectName);

    String getProject();

    void setLogStore(String store);

    String getLogStore();

    void send(boolean send);

    void log(String TAG, String logText);


    void log(String methodName,
             String className,
             String fileName,
             int lineNumber,
             String tag,
             String log
    );
}

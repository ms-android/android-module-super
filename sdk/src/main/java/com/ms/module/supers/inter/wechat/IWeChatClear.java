package com.ms.module.supers.inter.wechat;

import java.util.List;

/**
 * 卫星清理核心模块
 */
public interface IWeChatClear {


    List<String> log();

    List<String> image();

    List<String> video();

    List<String> voice();

    List<String> emoji();

    List<String> cache();

    List<String> temp();

    List<String> rubbish();


}
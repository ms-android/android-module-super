package com.ms.module.supers.inter.wechat;

import com.ms.module.supers.inter.supers.ISupers;

import java.util.List;

/**
 * 卫星清理核心模块
 */
public interface IWeChatClear extends ISupers {


    /**
     * 日志
     *
     * @return
     */
    List<String> log();

    /**
     * 图片
     *
     * @return
     */
    List<String> image();

    /**
     * 视频
     *
     * @return
     */
    List<String> video();

    /**
     * 语音
     *
     * @return
     */
    List<String> voice();

    /**
     * 表情
     *
     * @return
     */
    List<String> emoji();

    /**
     * 缓冲
     *
     * @return
     */
    List<String> cache();

    /**
     * 临时文件
     *
     * @return
     */
    List<String> temp();

    /**
     * 垃圾文件
     *
     * @return
     */
    List<String> rubbish();

    /**
     * 账号ID
     *
     * @return
     */
    List<String> accountIds();

}

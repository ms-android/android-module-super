package com.ms.module.supers.inter.wechat;


import com.ms.module.supers.inter.supers.ISupers;

import java.util.List;

public interface IWeChatClearConfig extends ISupers {

    void setImage(String... paths);

    void setVoice(String... paths);

    void setVideo(String... paths);

    void setCache(String... paths);

    void setLog(String... paths);

    void setEmoji(String... paths);

    void setFile(String... paths);

    List<String> getImage();

    List<String> getVoice();

    List<String> getVideo();

    List<String> getCache();

    List<String> getLog();

    List<String> getEmoji();

    List<String> getFile();

}

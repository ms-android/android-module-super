package com.ms.module.supers.inter.request;

public class IRequestConfigAdapter implements IRequestConfig {

    @Override
    public void setConnectTimeout(int value) {

    }

    @Override
    public int getConnectTimeout() {
        return 10;
    }

    @Override
    public void setReadTimeout(int value) {

    }

    @Override
    public int getReadTimeout() {
        return 10;
    }

    @Override
    public void setWriteTimeout(int value) {

    }

    @Override
    public int getWriteTimeout() {
        return 10;
    }

    @Override
    public void setRequestLogOut(boolean flag) {

    }

    @Override
    public boolean getRequestLogOut() {
        return false;
    }
}

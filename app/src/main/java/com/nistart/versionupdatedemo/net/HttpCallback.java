package com.nistart.versionupdatedemo.net;

/**
 * @author Samuel
 * @time 2018/8/10 11:05
 * @describe
 */
public interface HttpCallback {
    /**
     * 请求完成
     * @param response 请求
     */
    void onFinish(String response);

    /**
     * 请求失败
     * @param e
     */
    void onError(Exception e);
}

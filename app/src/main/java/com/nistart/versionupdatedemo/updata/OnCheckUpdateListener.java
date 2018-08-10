package com.nistart.versionupdatedemo.updata;

/**
 * @author Samuel
 * @time 2018/8/10 11:07
 * @describe
 */
public interface OnCheckUpdateListener {
    /**
     * 发现新版本
     *
     * @param versionName       新版Apk版本名称
     * @param newVersionContent 新版Apk更新内容
     *                          url
     */
    void onFindNewVersion(String versionName, String newVersionContent,String url);

    /**
     * 当前版本已是最新版本
     */
    void onNewest();
}

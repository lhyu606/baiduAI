/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * 人脸查找——注册
 */
public class AddFace {

    /**
     * 代码中所需工具类
     * FileUtil,Base64Util,HttpUtil请从
     * https://ai.baidu.com/file/BA73D199EED14D8AA5FC5A4BF4BDDA34
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/88C6E86FB5D141889391693FC84504B1
     * 下载
     */
    
    public static void main(String[] args) {
        // 人脸查找——注册 url
        String addUrl = "https://aip.baidubce.com/rest/2.0/faceverify/v1/faceset/user/add";
        // 请求参数
        // 用户ID（用户自定义）
        String uid = "ag";
        // 用户信息（用户自定义）
        String userInfo = "agInfos";
        // 用户所属组（用户自定义）
        String groupId = "ag";
        // 本地文件路径
        String filePath1 = "E:\\xampps\\htdocs\\lhy\\ME\\test\\zhu1.jpg";
        //String filePath2 = "E:\\xampps\\htdocs\\lhy\\ME\\lyx2.jpg";
        try {
            byte[] imgData1 = FileUtil.readFileByBytes(filePath1);
           // byte[] imgData2 = FileUtil.readFileByBytes(filePath2);
            String imgStr1 = Base64Util.encode(imgData1);
           // String imgStr2 = Base64Util.encode(imgData2);

            String params = "uid=" + uid + "&user_info=" + userInfo + "&group_id=" + groupId + "&"
                    + URLEncoder.encode("images", "UTF-8") + "=" + URLEncoder.encode(imgStr1 +/* "," + imgStr2,*/ "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.521d4a686403fd5363c6ebe639a269e1.2592000.1504685858.282335-9424624";
            String result = HttpUtil.post(addUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
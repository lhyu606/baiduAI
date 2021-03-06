/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * 人脸查找——识别
 */
public class Identify {

    /**
     * 代码中所需工具类
     * FileUtil,Base64Util,HttpUtil请从
     * https://ai.baidu.com/file/BA73D199EED14D8AA5FC5A4BF4BDDA34
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/88C6E86FB5D141889391693FC84504B1
     * 下载
     */
    
    public static void main(String[] args) {
        // 人脸查找——识别url （已用户照片，以图搜人）
        String identifyUrl = "https://aip.baidubce.com/rest/2.0/faceverify/v1/identify";
        // 请求参数
        // 用户组
        String groupId = "ag";
        // 返回用户top数，默认为1
        String userTopNum = "2";
        // 单用户人脸匹配得分top数，默认为1
        String faceTopNum = "2";
        try {
            String filePath1 = "E:\\xampps\\htdocs\\lhy\\MyTest\\images\\tu-boy.png";
            String filePath2 = "E:\\xampps\\htdocs\\lhy\\MyTest\\images\\tu-boy.png";
            byte[] imgData1 = FileUtil.readFileByBytes(filePath1);
            byte[] imgData2 = FileUtil.readFileByBytes(filePath2);
            String imgStr1 = Base64Util.encode(imgData1);
            String imgStr2 = Base64Util.encode(imgData2);

            String params = "group_id=" + groupId + "&user_top_num=" + userTopNum + "&face_top_num" + faceTopNum
                    + "&images=" + URLEncoder.encode(imgStr1 + "," + imgStr2, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "24.acb9c7f8f3b29e303cfa4f246b04790d.2592000.1530958071.282335-9424624";
            String result = HttpUtil.post(identifyUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
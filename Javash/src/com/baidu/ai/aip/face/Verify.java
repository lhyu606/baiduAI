/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * �������ҡ�����֤
 */
public class Verify {

    /**
     * ���������蹤����
     * FileUtil,Base64Util,HttpUtil���
     * https://ai.baidu.com/file/BA73D199EED14D8AA5FC5A4BF4BDDA34
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/88C6E86FB5D141889391693FC84504B1
     * ����
     */
    
    public static void main(String[] args) {
        // �������ҡ�����֤url ����֪�û�ID����������ͼƬ����֤��
        String verifyUrl = "https://aip.baidubce.com/rest/2.0/faceverify/v1/verify";
        // �������
        // �û�ID
        String uid = "ag";
        // ����ƥ��÷�top����Ĭ��Ϊ1
        String topNum = "1";
        // �����ļ�·��
        String filePath1 = "E:\\xampps\\htdocs\\lhy\\ME\\lhy.png";
        String filePath2 = "E:\\xampps\\htdocs\\lhy\\ME\\lyx1.jpg";
        try {
            byte[] imgData1 = FileUtil.readFileByBytes(filePath1);
            byte[] imgData2 = FileUtil.readFileByBytes(filePath2);
            String imgStr1 = Base64Util.encode(imgData1);
            String imgStr2 = Base64Util.encode(imgData2);

            String params = "uid=" + uid + "&top_num=" + topNum + "&" + URLEncoder.encode("images", "UTF-8") + "="
                    + URLEncoder.encode(imgStr1 + "," + imgStr2, "UTF-8");
            /**
             * ���ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
             */
            String accessToken = "24.4ddecfdcd1b3920dd69f86df6c661c1e.2592000.1495863833.282335-9424624";
            String result = HttpUtil.post(verifyUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
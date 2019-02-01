/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * �������ҡ���ע��
 */
public class AddFace {

    /**
     * ���������蹤����
     * FileUtil,Base64Util,HttpUtil���
     * https://ai.baidu.com/file/BA73D199EED14D8AA5FC5A4BF4BDDA34
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/88C6E86FB5D141889391693FC84504B1
     * ����
     */
    
    public static void main(String[] args) {
        // �������ҡ���ע�� url
        String addUrl = "https://aip.baidubce.com/rest/2.0/faceverify/v1/faceset/user/add";
        // �������
        // �û�ID���û��Զ��壩
        String uid = "ag";
        // �û���Ϣ���û��Զ��壩
        String userInfo = "agInfos";
        // �û������飨�û��Զ��壩
        String groupId = "ag";
        // �����ļ�·��
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
             * ���ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
             */
            String accessToken = "24.521d4a686403fd5363c6ebe639a269e1.2592000.1504685858.282335-9424624";
            String result = HttpUtil.post(addUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.HttpUtil;

/**
 * �������ҡ���ɾ��
 */
public class Delete {

    /**
     * ���������蹤����
     * FileUtil,Base64Util,HttpUtil���
     * https://ai.baidu.com/file/BA73D199EED14D8AA5FC5A4BF4BDDA34
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/88C6E86FB5D141889391693FC84504B1
     * ����
     */
    
    public static void main(String[] args) {
        // �������ҡ���ɾ�� url
        String deleteUrl = "https://aip.baidubce.com/rest/2.0/faceverify/v1/faceset/user/delete";
        try {
            // �������
            // �û�ID
            String uid = "ag";
            String params = "uid=" + uid;
            /**
             * ���ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
             */
            String accessToken = "24.521d4a686403fd5363c6ebe639a269e1.2592000.1504685858.282335-9424624";
            String result = HttpUtil.post(deleteUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package com.baidu.ai.aip.auth;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;


public class AccessToken {

	 /**
     * ��ȡȨ��token
	 * @return 
	 * @return ����ʾ����
     * {
     * "access_token": "24.460da4889caad24cccdb1fea17221975.2592000.1491995545.282335-9261443",
     * "session_key": "9mzdDxLPLXYfhlmFRBSGI8jOy19HNzFT6cle3RWf2m9HL8LdLxyVhEETkPS8gQtLbhw1TP/ly3+l59n4wknbmwPk6NC1",
     * "scope": "public vis-faceverify_faceverify vis-ocr_ocr vis-faceattribute_faceattribute vis-ocr_bankcard nlp_wordseg nlp_simnet nlp_wordemb nlp_comtag nlp_wordpos nlp_dnnlm_cn vis-antiporn_antiporn_v2 brain_ocr_scope wise_adapt lebo_resource_base lightservice_public hetu_basic lightcms_map_poi kaidian_kaidian wangrantest_test wangrantest_test1 bnstest_test1 bnstest_test2 ApsMisTest_TestȨ�� vis-classify_flower",
     * "refresh_token": "25.bf1ec1814779878486cb9ba68f7defe5.315360000.1804763545.282335-9261443",
     * "session_secret": "b292e183bb394fb8d8065e7f8b137757",
     * "expires_in": 2592000
     * }
     */
	public static void main(String[] args) {
		System.out.println("baidu");
		// ��ȡtoken��ַ
        String authHost = "https://aip.baidubce.com/oauth/2.0/token?";
        // ������ȡ�� API Key ����Ϊ��ע���
        String clientId = "nElok3H1CINAdEsTuzwyxO9U";
        // ������ȡ�� Secret Key ����Ϊ��ע���
        String clientSecret = "kg1vwhls4LO5h91YZkfG58qpRWgFHFCl";
        String getAccessTokenUrl = authHost
                // 1. grant_typeΪ�̶�����
                + "grant_type=client_credentials"
                // 2. ������ȡ�� API Key
                + "&client_id=" + clientId
                // 3. ������ȡ�� Secret Key
                + "&client_secret=" + clientSecret;
        try {
            URL realUrl = new URL(getAccessTokenUrl);
            // �򿪺�URL֮�������
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            // ��ȡ������Ӧͷ�ֶ�
            Map<String, List<String>> map = connection.getHeaderFields();
            // �������е���Ӧͷ�ֶ�
            for (String key : map.keySet()) {
                System.out.println(key + " -->" + map.get(key));
            }
            // ���� BufferedReader����������ȡURL����Ӧ
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String result = "";
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            /**
             * ���ؽ��ʾ��
             */
            System.out.println("result:" + result);
        } catch (Exception e) {
            System.out.printf("��ȡtokenʧ�ܣ�");
            e.printStackTrace();
        }
        return ;
	}

}

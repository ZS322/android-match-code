package com.zhishi.utils;

import com.google.gson.Gson;

import com.zhishi.model.dto.LightDTO;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;


import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * 构造一个工具类封装oKhttp3请求方法
 */
public class OkHttpUtil implements Runnable {

    /**
     * @param client     创建一个OkHttpClient对象
     * @param url        请求的接口
     * @param JSON       请求的格式
     * @param jsonObject 请求的参数
     * @return
     * @throws IOException
     */

    private String lightSwitch(OkHttpClient client, String url, MediaType JSON, String jsonObject) throws IOException {

        RequestBody body = RequestBody.create(JSON, jsonObject);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {

            return response.body().string();
        }
    }


    @Override
    public void run() {

        String returnData = null;
        try {

            /** 构造请求参数  */
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", 1);
            jsonObject.put("lightSwitch", "0");
            jsonObject.put("acOnOff", "1");


            /** 192.168.1.105:8080内网ipv4    */

            returnData = lightSwitch(new OkHttpClient(), "http://192.168.1.105:8080/getJsonData", MediaType.parse("application/json; charset=utf-8"), jsonObject.toString());

        } catch (JSONException j) {
        } catch (IOException e) {
        }
        getData(returnData);
    }

    /**
     * @param returnData 得到响应后的json字符串对象
     */
    private void getData(String returnData) {

//        System.out.println(returnData);
        Gson gson = new Gson();   /** 构造Gson对象    */

        /**json字符串对象转Java对象*/
        LightDTO lightDTO = gson.fromJson(returnData, LightDTO.class);

        System.out.println(lightDTO);
    }

}



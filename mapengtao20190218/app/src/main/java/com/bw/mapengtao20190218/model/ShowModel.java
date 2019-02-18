package com.bw.mapengtao20190218.model;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.bw.mapengtao20190218.bean.Data;
import com.bw.mapengtao20190218.bean.JsonBean;
import com.bw.mapengtao20190218.utils.OkHttpUtils;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ShowModel {

    String url = "http://365jia.cn/news/api3/365jia/news/headline?page=1";

//    创建接口
    public interface OnShowLisenter{
//        void onResult(JSONArray data);
        void onResult(JSONArray data);
    }

//    定义接口

    public OnShowLisenter onShowLisenter;

//    设置监听模式
    public void setOnShowLisenter(OnShowLisenter showLisenter) {
        this.onShowLisenter = showLisenter;
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                        String json = (String) msg.obj;

//                    Gson gson = new Gson();
//                    JsonBean jsonBean = gson.fromJson(json, JsonBean.class);
//
//                    Data data1 = jsonBean.getData();
                    try {
                        JSONObject jsonObject = new JSONObject(json);
                        JSONArray data = jsonObject.getJSONArray("data");

//                        接口回调
                        if (onShowLisenter != null){
                            onShowLisenter.onResult(data);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
            }
        }
    };

    public void getGoodsData() {

//        获取网络请求--单例模式
        OkHttpUtils.getInstance().dogetGet(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String json = response.body().string();

//                Log.i("xxx",json);

                Toast.makeText(, ""+json.toString(), Toast.LENGTH_SHORT).show();

                Message message = new Message();
                message.what = 0;
                message.obj = json;
                handler.sendMessage(message);
            }
        });
    }
}

package com.bw.mapengtao20190218.utils;

import android.util.Log;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;

public class OkHttpUtils {

    private static OkHttpUtils okHttpUtils = null;

    private OkHttpUtils(){

    }

    public static OkHttpUtils getInstance(){

//        同步锁
        if (okHttpUtils == null){
           synchronized (OkHttpUtils.class){
               if (okHttpUtils == null){
                   okHttpUtils = new OkHttpUtils();
               }
           }
        }

        return okHttpUtils;
    }

//    执行get请求
    public static void dogetGet(String url , Callback callback){
//        创建日志拦截器、
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
//                Log.i("xxx",message);
            }
        });

//        指定模式
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

//        创建OkHttp
        OkHttpClient okHttpClient = new  OkHttpClient
                .Builder()
                .build();

//        创建request
        Request request = new Request.Builder()
                .url(url)
                .build();

        Call call = okHttpClient.newCall(request);

        call.enqueue(callback);
    }
}

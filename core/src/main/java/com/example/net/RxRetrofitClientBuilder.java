package com.example.net;

import android.content.Context;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class RxRetrofitClientBuilder {

    private  String mUrl;
    private  Map<String,Object> mParams;
    private  RequestBody mRequestBody;
    private  Map<String,File> fileMap;

    public final RxRetrofitClientBuilder url(String mUrl){
        this.mUrl = mUrl;
        return this;
    }

    public final RxRetrofitClientBuilder file(String key,String file){
        return file(key,new File(file));
    }

    public final RxRetrofitClientBuilder file(String key,File file){
        if(fileMap == null){
            fileMap = new HashMap<>();
        }
        fileMap.put(key,file);
        return this;
    }

    public final RxRetrofitClientBuilder params(Map<String,Object> mParams){
        this.mParams = mParams;
        return this;
    }

    public final RxRetrofitClientBuilder params(String key, Object val){
        if(mParams == null){
            mParams = new HashMap<>();
        }
        this.mParams.put(key,val);
        return this;
    }

    public final RxRetrofitClientBuilder raw(String raw){
        this.mRequestBody = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"),raw);
        return this;
    }

    private void check(){
        if(mParams == null){
            mParams = new HashMap<>();
        }
    }

    public final RxRetrofitClient build(){
        check();
        return new RxRetrofitClient(mUrl,
                mParams,
                mRequestBody,
                fileMap);
    }
}

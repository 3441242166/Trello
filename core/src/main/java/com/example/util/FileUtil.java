package com.example.util;

import com.example.projectcore.Config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {


    public static String getExtension(String name) {
        String suffix = "";
        final int idx = name.lastIndexOf(".");
        if(idx > 0){
            suffix = name.substring(idx + 1);
        }
        return suffix;
    }

    public static String getRawFile(int rawId) {
        InputStream in = Config.getApplication().getResources().openRawResource(rawId);
        byte[] bytes = new byte[0];
        try {
            bytes = new byte[in.available()];
            in.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = new String(bytes);
        return str;
    }
}

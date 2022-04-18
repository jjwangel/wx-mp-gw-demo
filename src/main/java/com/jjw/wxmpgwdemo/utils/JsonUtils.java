package com.jjw.wxmpgwdemo.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author jjw
 */
public class JsonUtils {
    public static String toJson(Object obj) {
        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .disableHtmlEscaping()
            .create();
        return gson.toJson(obj);
    }
}

package com.example.demo.Logger;

import com.example.demo.domain.listener.RequestObject;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class LogFile {
    private static final Gson gson = new Gson();

    public static void logRequestObject(RequestObject requestObject) {
        log.info("Request successful: "
                + requestObject.getRequest().getMethod()
                + " '"
                + requestObject.getRequest().getRequestURI()
                + "' '"
                + stringifyObject(requestObject.getPayload())
                + "'");
    }

    public static String stringifyObject(Object toJsonify) {
        return gson.toJson(toJsonify);
    }
}
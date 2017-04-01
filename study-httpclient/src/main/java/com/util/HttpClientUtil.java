package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;

public class HttpClientUtil {
	 public static StringBuffer getEntityString(HttpEntity entity) throws Exception {
        InputStream is = entity.getContent(); 
        BufferedReader in = new BufferedReader(new InputStreamReader(is)); 
        StringBuffer buffer = new StringBuffer(); 
        String line = ""; 
        while ((line = in.readLine()) != null) {
        buffer.append(line+"\n"); 
        }
        return buffer;
	}
	public static void printEntityContext(HttpEntity entity) throws Exception{
		System.out.println(getEntityString(entity));
	}
}

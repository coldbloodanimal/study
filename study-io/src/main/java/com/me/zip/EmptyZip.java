package com.me.zip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmptyZip {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("D:\\zip\\empty.zip"));  
        out.close(); 
	}

}

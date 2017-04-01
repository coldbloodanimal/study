package com.zip;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;  
import java.io.OutputStream;  
import java.util.Enumeration;  
import java.util.zip.ZipEntry;  
import java.util.zip.ZipFile;  
import java.util.zip.ZipOutputStream;

import com.sun.mail.util.BASE64DecoderStream;  
  
public class TestZIP {  
  
	//private BASE64DecoderStream is=new BASE64DecoderStream(is);
    /** 
     * 功能:压缩多个文件成一个zip文件 
     * @param srcfile：源文件列表 
     * @param zipfile：压缩后的文件 
     */  
	/*
    BufferedInputStream bis = new BufferedInputStream(is);  
    BufferedOutputStream bos = new BufferedOutputStream(  
            new FileOutputStream(new File(destDir + fileName)));  
    int len = -1;  
    while ((len = bis.read()) != -1) {
        bos.write(len);  
        bos.flush();  
    }  
    bos.close();  
    bis.close();
	*/
	
    public static void zipFiles(File[] srcfile, File zipfile) {  
        byte[] buf = new byte[1024];  
        try {  
            //ZipOutputStream类：完成文件或文件夹的压缩  
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfile));  
            for (int i = 0; i < srcfile.length; i++) {  
                InputStream in = new FileInputStream(srcfile[i]); 
                //FilterInputStream inf=new BASE64DecoderStream(in);
                out.putNextEntry(new ZipEntry(srcfile[i].getName()));  
                int len;  
                while ((len = in.read(buf)) > 0) {  
                    out.write(buf, 0, len);  
                }  
                out.closeEntry();  
                in.close();  
            }  
            out.close();  
            System.out.println("压缩完成.");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    /** 
     * 功能:解压缩 
     * @param zipfile：需要解压缩的文件 
     * @param descDir：解压后的目标目录 
     */  
    public static void unZipFiles(File zipfile, String descDir) {  
        try {  
            ZipFile zf = new ZipFile(zipfile);  
            for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {  
                ZipEntry entry = (ZipEntry) entries.nextElement();  
                String zipEntryName = entry.getName();  
                InputStream in = zf.getInputStream(entry);  
                OutputStream out = new FileOutputStream(descDir + zipEntryName);  
                byte[] buf1 = new byte[1024];  
                int len;  
                while ((len = in.read(buf1)) > 0) {  
                    out.write(buf1, 0, len);  
                }  
                in.close();  
                out.close();  
                System.out.println("解压缩完成.");  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    /**功能: 
     * @param args 
     */  
    public static void main(String[] args) {  
        //2个源文件  
        File f1 = new File("D:\\zip\\a.txt");  
        File f2 = new File("D:\\zip\\b.jpg");  
        File[] srcfile = { f1, f2 };  
          
        //压缩后的文件  
        File zipfile = new File("D:\\zip\\thezip.zip");  
        TestZIP.zipFiles(srcfile, zipfile);  
//  
//        //需要解压缩的文件  
//        File file = new File("D:\\test\\3.zip");  
//        //解压后的目标目录  
//        String dir = "D:\\test\\1\\";  
//        TestZIP.unZipFiles(file, dir);  
    }  
}  
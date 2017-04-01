package com.entity;

import java.sql.Timestamp;

public class MailInfo {
    //title
    private String from;
	private String to;
	private String cc;
	private String bcc;
	private String subject;
	private String text;
	private boolean isHtml = true;
	private String attachmentFilename;
	
	private Boolean isSendFlag;
	private Timestamp sendTime;
	private Integer failureNumber;

	private String filePath;
    
    private String importUserId;
    
    //导入时间
    private Date importTime;

    //导入频道
    private String importchannel;
}
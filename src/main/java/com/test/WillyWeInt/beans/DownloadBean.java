package com.test.WillyWeInt.beans;

import java.io.IOException;
import java.io.InputStream;

import com.test.WillyWeInt.util.CommonUtil;

public class DownloadBean {
	
/*	private String downloadUrl;

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}*/

	public InputStream getZipFile(){
		
		InputStream in = null;
		try {
			in = CommonUtil.getFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return in;
	}
	
}

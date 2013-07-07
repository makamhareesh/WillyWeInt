package com.test.WillyWeInt.beans;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class UnzipBean {
	
	private DownloadBean downBean;
	  private static final String OUTPUT_FILE = "output.op";

	public DownloadBean getDownBean() {
		return downBean;
	}

	public void setDownBean(DownloadBean downloadBean) {
		this.downBean = downloadBean;
	}
	
	
	public boolean unzipFile(){
		
		InputStream in = downBean.getZipFile();
         byte[] buffer = new byte[1024];
         boolean fileCreated = false;
		
		 try {
			GZIPInputStream gzis = 
			    		new GZIPInputStream(in);

	    	 FileOutputStream out = 
	            new FileOutputStream(OUTPUT_FILE);
	 
	    	 
	    	 
	    	  int len;
	          while ((len = gzis.read(buffer)) > 0) {
	          	out.write(buffer, 0, len);
	          }
	   
	          gzis.close();
	          out.close();
	    	 fileCreated = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fileCreated=false;
		}

		/*	File file = new File(OUTPUT_FILE);
			FileInputStream fis = null;
		 
		 try {
				fis = new FileInputStream(file);
	 
				System.out.println("Total file size to read (in bytes) : "
						+ fis.available());
	 
				int content;
				while ((content = fis.read()) != -1) {
					// convert to char and display it
					System.out.print((char) content);
				}
	 
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null)
						fis.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}*/
		 
		 
		 
		return fileCreated;
	}

}

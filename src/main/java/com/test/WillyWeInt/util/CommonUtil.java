package com.test.WillyWeInt.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CommonUtil {
	
	public static InputStream getFile() throws IOException{
		
		URL url = null;
		InputStream in = null;
		try {
			/*
			if(loc.equals("${dwnfile}"))
				loc="ftp://ftp.ncdc.noaa.gov/pub/data/gsod/2012/007034-99999-2012.op.gz";
			*/
			String loc="ftp://ftp.ncdc.noaa.gov/pub/data/gsod/2012/007034-99999-2012.op.gz";
			url = new URL(loc);
		

			URLConnection connection = url.openConnection();
			
			in = connection.getInputStream();

			return in;
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return in;
		
		
		
}
	
}


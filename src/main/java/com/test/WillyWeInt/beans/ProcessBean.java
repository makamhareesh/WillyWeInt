package com.test.WillyWeInt.beans;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.test.WillyWeInt.processors.DewpProcessor;
import com.test.WillyWeInt.processors.TempProcessor;
import com.test.WillyWeInt.beans.ColumnBean;

public class ProcessBean {
	private static final String OUTPUT_FILE_PR = "output.op";
	
	private String dispcolumn;

	public String getDispcolumn() {
		return dispcolumn;
	}

	public void setDispcolumn(String dispcolumn) {
		this.dispcolumn = dispcolumn;
	}
	
	private List<ColumnBean> processFile(){
		
		File file = new File(OUTPUT_FILE_PR);
		List<ColumnBean> beanList = new ArrayList<ColumnBean>();

		Scanner scanner = null;
	 try {
		 scanner = new Scanner(file);
 			int i = 0;
			while (scanner.hasNextLine()) {
				  String line = scanner.nextLine();
				  if(i != 0){
					  String[] values = line.split("\\s+");
					  ColumnBean cb = new ColumnBean();
					  cb.setStn(values[0]);
					  cb.setWban(values[1]);
					  cb.setYearmoda(values[2]);
					  cb.setTemp(new Double(values[3]).doubleValue());
					  cb.setTempCount(values[4]);
					  cb.setDewp(new Double(values[5]).doubleValue());
					  cb.setDewpCount(values[6]);
					  cb.setSlp(values[7]);
					  cb.setSlpCount(values[8]);
					  cb.setStp(values[9]);
					  cb.setStpCount(values[10]);
					  cb.setVisib(values[11]);
					  cb.setVisibCount(values[12]);
					  cb.setWdsp(values[13]);
					  cb.setWdspCount(values[14]);
					  cb.setMxspd(values[15]);
					  cb.setGust(values[16]);
					  cb.setMax(values[17]);
					  cb.setMin(values[18]);
					  cb.setPrcp(values[19]);
					  cb.setSndp(values[20]);
					  cb.setFrshtt(values[21]);
					  
					  beanList.add(cb);
				  }
				i++;	  
				}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			}

	 return beanList;
		
	}
	

	 public void printColumn(){
		 
		 List<ColumnBean> beanList = processFile();
		 if(beanList.size() > 0){
			 if(dispcolumn.equalsIgnoreCase("TEMP")){
				 
				 TempProcessor tp = new TempProcessor();
				 tp.process(beanList);
				 
			 }else if(dispcolumn.equalsIgnoreCase("DEWP")){
				 

				 DewpProcessor dp = new DewpProcessor();
				 dp.process(beanList);
				 
			 }
			 
			 
		 }
		 
		 
		 
	 }
}

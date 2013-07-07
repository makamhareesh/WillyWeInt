package com.test.WillyWeInt.processors;

import java.util.List;

import com.test.WillyWeInt.beans.ColumnBean;

public class TempProcessor extends DefaultProcessor {

	@Override
	public void process(List<ColumnBean> beanList) {

		String tempValues = "";
		for(ColumnBean bean:beanList){
			
			tempValues += this.roundInt(bean.getTemp())+",";
			
		}
		
		System.out.println("Temp Values - "+tempValues.substring(0, tempValues.length()-1));
		
	}


}

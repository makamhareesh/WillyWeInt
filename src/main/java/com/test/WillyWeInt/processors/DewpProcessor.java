package com.test.WillyWeInt.processors;

import java.util.List;

import com.test.WillyWeInt.beans.ColumnBean;

public class DewpProcessor extends DefaultProcessor {

	@Override
	public void process(List<ColumnBean> beanList) {
		
		String dewpValues = "";
		for(ColumnBean bean:beanList){
			
			dewpValues += this.roundInt(bean.getDewp())+",";
			
		}
		
		System.out.println("Dew Values - "+dewpValues.substring(0, dewpValues.length()-1));

	}

	

}

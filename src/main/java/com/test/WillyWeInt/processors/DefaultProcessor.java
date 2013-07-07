package com.test.WillyWeInt.processors;

import java.util.List;

import com.test.WillyWeInt.beans.ColumnBean;

public abstract class DefaultProcessor {
	
	public abstract void process(List<ColumnBean> beanList);
	
    public long roundInt(Double inp){
    	
    	return Math.round(inp);
    	
    }

	public void process() {
		// TODO Auto-generated method stub
		
	}
}

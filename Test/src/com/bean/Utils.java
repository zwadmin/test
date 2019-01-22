package com.bean;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Utils {

	public static void main(String[] args) {
		
		String [] str = new String[4];
		str[0]="Dell";
		str[1]="RedHat";
		str[2]="Epc";
		str[3]="Epc";
		String a =StringUtils.join(str);
		System.out.println(a);
		String params ="Dell,RedHat,Epc,Dell";
		int Dcount =StringUtils.countMatches(a, "Dell");
		int dcount = StringUtils.countMatches(a, "dell");
		
		System.out.println(dcount+"->"+Dcount);
		if(Dcount>1 || dcount >1) {
			
		}
	}
}

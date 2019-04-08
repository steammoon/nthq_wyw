package com.common.cn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IDUtil {
	
	public String createID() {
		String ID = "";
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str1 = formatter.format(date);
		Random random = new Random();
		ID += String.valueOf(random.nextInt(10));
		ID += str1.substring(0,4);
		ID += str1.substring(5,7);
		ID += str1.substring(8,10);
		ID += str1.substring(11,13);
		ID += str1.substring(14,16);
		ID += str1.substring(17,19);
		ID += String.valueOf(random.nextInt(1000));
		return ID; 
	}

}

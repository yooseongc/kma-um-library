package io.yooseongc.kma;

import org.gdal.gdal.Dataset;
import org.gdal.gdal.gdal;

public class GdalRegisterTest {

	private static final String path = "C:/Users/user/data/";
	
	public static void main(String[] args) {
		gdal.AllRegister();
		System.out.println(gdal.VersionInfo());
		//Dataset data = gdal.Open(path + "g512_v070_ergl_pres_h000.2018060500.gb2");
		Dataset data2 = gdal.Open(path + "g512_v070_ergl_unis_h000.2018060500.gb2");
		
		
		String info = gdal.GDALInfo(data2, null);
		System.out.println(info);
	}

}

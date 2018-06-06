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


/*
 *  RUN ENV  ...
 * 
 * VM args : -Djava.library.path="C:\release-1911-x64-gdal-2-3-0-mapserver-7-0-7\bin\gdal\java;${env_var:PATH}"
 * 
 * ENV : 
 *   1) PATH : C:\Program Files\GDAL
 *   2) GDAL_DATA : C:\Program Files\GDAL\gdal-data
 *   3) GDAL_DRIVER : C:\Program Files\GDAL\gdal\gdalplugins
 * 
 */




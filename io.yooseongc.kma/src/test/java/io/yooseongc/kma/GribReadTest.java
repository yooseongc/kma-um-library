
package io.yooseongc.kma;

import java.io.IOException;

import ucar.nc2.grib.grib2.Grib2Record;
import ucar.nc2.grib.grib2.Grib2RecordScanner;
import ucar.unidata.io.RandomAccessFile;


public class GribReadTest {
	
	
	private static final String path = "C:/Users/user/data/";
	
	public static void main(String[] args) throws IOException  {
		
		RandomAccessFile raf = new RandomAccessFile(path + "g512_v070_ergl_pres_h000.2018060500.gb2", "r");
		boolean res = Grib2RecordScanner.isValidFile(raf);
		System.out.println(res);
		Grib2RecordScanner scan = new Grib2RecordScanner(raf);
		int count = 0;
		while (scan.hasNext()) {
			Grib2Record rec = scan.next();
			System.out.println(rec.toString());
			System.out.println(++count);
		}
	}


}

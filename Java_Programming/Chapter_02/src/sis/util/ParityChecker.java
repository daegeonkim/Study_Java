package sis.util;

public class ParityChecker {

	public byte checksum(byte[] bytes) {
		byte checksum = bytes[0];
		for(int i =1; i< bytes.length; i++){
			checksum ^= bytes[i];
		}
		return checksum;
	}


}

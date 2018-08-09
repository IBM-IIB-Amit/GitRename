package com.esb.landmarkgroup;

public class DemoClass {

	/**
	 * Sample method that can be called from a Mapping Custom Java transform.
	 * The content of this method provides the implementation for the Custom Java transform.
	 */
	public static String sampleTransform(String input2) {
		
		String output2="";
		output2=input2.concat("done in java");
		
		return output2;
	}

}

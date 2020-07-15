package com.designpatt.divein.factory;

public class MobileMain {

	public static void main(String[] args) {
		MobileFactory mf = new MobileFactory();
		System.out.println(mf.getMobile("ANDROID").getDescription());
	}

}

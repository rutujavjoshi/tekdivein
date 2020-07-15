package com.designpatt.divein.factory;

public class MobileFactory {
	
	public IMobile getMobile(String istrMob)
	{
		IMobile mob;
		if (istrMob.equalsIgnoreCase("ANDROID"))
		{
			return new Android();
		}else
		{
			return new Apple();
		}
	}

}

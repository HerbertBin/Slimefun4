package me.mrCookieSlime.Slimefun.utils;

public enum MachineType {

    CAPACITOR("电容"),
    GENERATOR("发电机"),
    MACHINE("机器");

	private String suffix;
	
	private MachineType(String suffix) {
		this.suffix = suffix;
	}
	
	@Override
	public String toString() {
		return suffix;
	}

}

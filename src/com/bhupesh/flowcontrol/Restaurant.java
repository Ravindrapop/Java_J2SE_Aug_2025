package com.bhupesh.flowcontrol;

public class Restaurant {
	
	private String idli;
	private String dosa;
	private String momos;
	
	public Restaurant(String idli,String dosa,String momos) {
		this.idli = idli;
		this.dosa = dosa;
		this.momos = momos;
	}
	public void setIdli(String idli) {
		this.idli = idli;
	}
    public void setDosa(String dosa) {
    	this.dosa = dosa;
    }
	public void setMomos(String momos) {
		this.momos = momos;
	}
    public String getIdli() {
    	return idli;
    }
    public String getDosa() {
    	return dosa;
    }
    public String getMomos() {
    	return momos;
    }
	@Override
	public String toString() {
		return "Restaurant Menu [Idli=" + idli + ", Dosa=" + dosa + ", Momos=" + momos +"]";
	}
    
}

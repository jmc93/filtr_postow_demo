/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektalgorytmy;

/**
 *
 * @author Jacek Cierpka
 */
public class Slownik {    
        private String slowo;	
	private int liczbaTrafien;	
	private int liczbaPudel;	
	private float stosunekTrafien;	
	private float stosunekPudel;	
	private float prawdopTrafienia;	
	
	public Slownik(String slowo){
		this.slowo = slowo;
		liczbaTrafien = 0;
		liczbaPudel = 0;
		stosunekTrafien = 0.0f;
		stosunekPudel = 0.0f;
		prawdopTrafienia = 0.0f;	
	}
	
	public void zliczTrafienia(){
		liczbaTrafien++;
	}
	
	public void zliczPudla(){
		liczbaPudel++;
	}	
	
	public void calculateProbability(int doTrafien, int doPudel){
		stosunekTrafien = liczbaTrafien / (float) doTrafien;
		stosunekPudel = liczbaPudel / (float) doPudel;
		
		if(stosunekTrafien + stosunekPudel > 0){
			prawdopTrafienia = stosunekTrafien / (stosunekTrafien + stosunekPudel);
		}
		if(prawdopTrafienia < 0.2f){
			prawdopTrafienia = 0.2f;
		}
		else if(prawdopTrafienia > 0.8f){
			prawdopTrafienia = 0.8f;
		}
	}

	public String getSlowo() {
		return slowo;
	}

	public float getStosunekTrafien() {
		return stosunekTrafien;
	}

	public float getStosunekPudel() {
		return stosunekPudel;
	}

	public void setStosunekPudel(float stosunekPudel) {
		this.stosunekPudel = stosunekPudel;
	}

	public float getPrawdopTrafienia() {
		return prawdopTrafienia;
	}

	public void setPrawdopTrafienia(float prawdopTrafienia) {
		this.prawdopTrafienia = prawdopTrafienia;
	}
}

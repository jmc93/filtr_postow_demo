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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ProjektAlgorytmy {
    /**
     * @param args the command line arguments
     */
        HashMap<String, Slownik> slowa = new HashMap<String,Slownik>();
        HashMap<String, Ulubione> ulubione = new HashMap<String,Ulubione>();
	BufferedWriter out;
        public float pInteresujacego;      
        public float bonusik;  
	
     
	public void slowniczek(String input) throws IOException{
            int wszystkieTrafienia = 0;
            int wszystkiePudla = 0;
            BufferedReader in = new BufferedReader(new FileReader(input));
            String line = in.readLine();
            while (line != null){
		if (!line.equals("")){
                	String typ = line.split("\t")[0];
			String post = line.split("\t")[1];                                
			for (String slowo : post.split(" ")){
				slowo = slowo.replaceAll("\\W", "");
				slowo = slowo.toLowerCase();
				Slownik slowko = null;
				if(slowa.containsKey(slowo)){
					slowko = (Slownik) slowa.get(slowo);
				}
				else {
					slowko = new Slownik(slowo);
					slowa.put(slowo,slowko);
				}
				if(typ.equals("nudne")){
					slowko.zliczPudla();
					wszystkiePudla++;
				}
				else if(typ.equals("fajne")){
					slowko.zliczTrafienia();
					wszystkieTrafienia++;
				}		
			}
		}
		line = in.readLine();	
	}
	in.close();		
	for (String key : slowa.keySet()) {
	    slowa.get(key).calculateProbability(wszystkieTrafienia, wszystkiePudla);
	}
	}
	public void ulubione(String input) throws IOException{
		BufferedReader in2 = new BufferedReader(new FileReader(input));
		String line = in2.readLine();
		while (line != null){
			if (!line.equals("")){
                                String polubienia = line.split("\t")[0]; 						                              
				for (String ulub : polubienia.split(" ")){
					ulub = ulub.replaceAll("\\W", "");
					ulub = ulub.toLowerCase();
					Ulubione nazwa = null;					
                                        nazwa = (Ulubione) ulubione.get(ulub);			
					}
			}
			line = in2.readLine();	
		}
		in2.close();		
		
	}
	
	public void posty(String inputFile) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(inputFile));
		this.out = new BufferedWriter(new FileWriter("wyniki.txt"));
                String line = in.readLine();                
		while (line != null){
                    
			if (!line.equals("")){
                            String autor = line.split("\t")[0];
                            String polubienia=autor.substring(autor.length()-4,autor.length()-2);
                            //System.out.print(autor);
                            System.out.print(polubienia+" ");
                            float polubieniaFloat=Float.parseFloat(polubienia);                              
                            
                               	ArrayList<Slownik> post=listaSlow(line);                            
                                                                
				float interesujace=policzBayesa(post);
                                float dodatek=policzBonusik(polubieniaFloat);
                                System.out.println(interesujace+"||"+dodatek);
                                float interesujace2=interesujace+dodatek;
				if(interesujace2>=0.0f && interesujace2<=0.3f) this.out.write("nudne"+" "+line);
				else if (interesujace2>=0.3f && interesujace2<=0.75f) this.out.write("moze"+" "+line);
                                else if (interesujace2>=0.75f) this.out.write("interesujace"+" "+line);
			}
			this.out.newLine();
			line = in.readLine();
		}
		this.out.close();
		in.close();
	}

	
	public ArrayList<Slownik> listaSlow(String post){
		ArrayList<Slownik> wordList = new ArrayList<Slownik>();
		for (String slowo : post.split(" ")){
			slowo = slowo.replaceAll("\\W", "");
			slowo = slowo.toLowerCase();
			Slownik sl = null;
			if(slowa.containsKey(slowo)){
				sl = (Slownik) slowa.get(slowo);
			}
			else {
				sl = new Slownik(slowo);
				sl.setPrawdopTrafienia(0.50f);
			}
			wordList.add(sl);
		}
		return wordList;
	}
        
        public ArrayList<Ulubione> listaUlubionych(String post){
		ArrayList<Ulubione> favouriteList = new ArrayList<Ulubione>();
		for (String ulub:post.split(" ")){
			ulub=ulub.replaceAll("\\W", "");
			ulub=ulub.toLowerCase();
			Ulubione ul=null;			
			ul=(Ulubione) ulubione.get(ulub);			
			favouriteList.add(ul);
                        //System.out.println(favouriteList.toString());
		}
		return favouriteList;
	}
		
         public float policzBayesa(ArrayList<Slownik> post){
		float prawdopPozytywu = 1.0f;
		float prawdopNegatywu = 1.0f;
		for (int i=0;i<post.size();i++) {
			Slownik slowo = (Slownik) post.get(i);
			prawdopPozytywu *= slowo.getPrawdopTrafienia();
			prawdopNegatywu *= (1.0f - slowo.getPrawdopTrafienia());
		}
		float prawdopTrafienia = prawdopPozytywu / (prawdopPozytywu + prawdopNegatywu);
                pInteresujacego=prawdopTrafienia;
		return pInteresujacego;
         }  
         
         public float policzBonusik(Float polubieniaFloat){
             
              if(polubieniaFloat>=10 && polubieniaFloat<=30)  {bonusik=0.1f;}
              else if(polubieniaFloat>=30 && polubieniaFloat<=60)  {bonusik=0.2f;}
              else if(polubieniaFloat>=60)  {bonusik=0.4f;}             
              else bonusik=0;
             return bonusik;
         }
           
}


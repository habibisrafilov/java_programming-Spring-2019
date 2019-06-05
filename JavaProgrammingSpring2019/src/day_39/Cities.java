package day_39;
import java.util.*;
public class Cities {
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		
		    cities.add("Tokyo");
	        cities.add("New York");
	        cities.add(0,"Paris");
	        cities.add("Pittsburgh");
	        cities.add(1,"Berlin");
	        cities.add("Madrid");
	        cities.add("Moscow");
	        cities.add("Istanbul");
	        cities.add("Washington D.C.");
	        cities.add("Amsterdam");
	        cities.add("Zurich");
	        cities.add("Singapore");
	        cities.add("Milan");
	        cities.add("Toronto");
	        cities.add("London");
	        cities.add("Lima");
		
	        
	          for(String city:cities) {
	        	  System.out.print(city+" | ");
	          }
		
	            System.out.println("\n");
	            for(int i=0; i<cities.size(); i++) {
	            System.out.print(cities.get(i)+" | ");
	            }
		
	               System.out.println();
	           
	            System.out.println(cities.toString().toUpperCase());
	          
	          System.out.println(cities);
	          
	          
	          
	          for(int j = 0 ; j<cities.size(); j++) {
	        	  String city = cities.get(j).toUpperCase();
	        	  cities.set(j, city);
	        	  
	          }
	          
	            System.out.println(cities.toString());
	          
	          
	          // find the longest city 
	            
	            //String longestCity,shortestCity;
	            
	            
	            
	            String longestCity="", shortestCity="";
	            
	            for(String city:cities) {
	            	if(city.length()>longestCity.length()) {
	            		longestCity = city;
	            	}
	            }
	            
	            
	            shortestCity = cities.get(0);
	            for(String city:cities) {
	            	if(city.length()<shortestCity.length()) {
	            		shortestCity=city;
	            	}
	            }
	            
	            
	            System.out.println("longestCity: "+longestCity);
	            System.out.println("shortestCity: "+shortestCity);
	            
	            
	            
	            ArrayList<String> citiesMoreThan6 = new ArrayList<>();
	            
	            
	            for(String ct : cities) {
	            	if(ct.length()>6) {
	            		citiesMoreThan6.add(ct);
	            	}
	            }
	            
	            System.out.println(citiesMoreThan6);
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	          
	
	}

}

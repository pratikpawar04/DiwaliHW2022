import java.util.*;  
class A23 {  
        public static void main(String[] args)   
        {     
        ArrayList<String> l= new ArrayList<String>(); 
            l.add("Hello"); //adding elements  
            l.add("Pratik");  
            l.add("Pawar");  
            String array[] = new String[l.size()];
            for(int j =0;j<l.size();j++){  
              array[j] = l.get(j);  
            }  
            for(String k: array)  
            {  
                System.out.println(k); 
            }  
        }  
    }
/*
Hello
Pratik
Pawar
*/
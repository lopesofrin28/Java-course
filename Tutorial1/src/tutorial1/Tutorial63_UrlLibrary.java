
package tutorial1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tutorial63_UrlLibrary implements Iterable<String>{
    private LinkedList<String> urls=new LinkedList<>();
   
    private class UrlIterator implements Iterator<String>{
        
        private int index=0;
        
        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {
            StringBuilder sb=new StringBuilder();

            try {
                URL url=new URL(urls.get(index));
                
                BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
                
                String line=null;
                
                while ((line=br.readLine())!=null) {                    
                    sb.append(line);
                    sb.append("\n");
                    
                }
                    br.close();

            } catch (Exception ex) {
               ex.printStackTrace();
            }
            index++;
            
            return sb.toString();
        }

        @Override
        public void remove() {
           urls.remove(index);
        }
        
    }
    
    public Tutorial63_UrlLibrary() {
        urls.add("http://www.caveofprogramming.com");
        urls.add("http://www.facebook.com/caveofprogramming");
        urls.add("http://news.bbc.co.uk");
    }
/*
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
  */  

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }
    
    
}


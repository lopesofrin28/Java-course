
package tutorial1;

class Plant{
   public static final int ID=7;
   private String name;
    
   public String getData(){
       String data="Some stuff" +calculateGrowthForecast();
       return data;
   }
   public int calculateGrowthForecast(){
       return 9;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class Tutorial31_Encapsulation {
    public static void main(String[] args) {
        
    }
}

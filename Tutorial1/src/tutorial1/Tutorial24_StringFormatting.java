/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;


public class Tutorial24_StringFormatting {
    public static void main(String[] args) {
      //Inefficient 
        String info="";
        info+="My name is Bob";
        info+=" ";
        info+="I am a builder";
        
        System.out.println(info);
        
        //More Efficient
        StringBuilder sb=new StringBuilder("");
        sb.append("My name is Sue");
        sb.append(" ");
        sb.append("I am a lion tamer");
        
        System.out.println(sb.toString());
        
        StringBuilder s=new StringBuilder();
        s.append("My name is Roger ")
         .append(" ")
         .append("I am a skydiver");
        
        System.out.println(s.toString());
        
        //////////Formatting ////////////////////////////
        System.out.println("Here is some text.\t That was a tab.\n That was a new line");
        System.out.println("More Text");
        
        //Formatting Integers
        System.out.printf("Total cost %-10d;quantity is %d\n",5,120);
        
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-2d: some text here\n",i);
        }
        
        //Formatting Floating point values
        System.out.printf("Total value: %.2f\n",5.6874);
        System.out.printf("Total value: %5.1f\n",343.23423);
    }
}

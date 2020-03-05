
package tutorial1;

public class Tutorial63_Iterable {
    public static void main(String[] args) {
        Tutorial63_UrlLibrary urlLibrary=new Tutorial63_UrlLibrary();
        
        for (String html : urlLibrary) {
//            System.out.println(url);
            System.out.println(html.length());
            System.out.println(html);
        }
    }
}

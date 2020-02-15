package ir.org.acm.session12.cloning;

public class TestSheep {
    
    public static void main(String[] args) throws Exception {
        
        Sheep shaun = new Sheep();
        shaun.d = 'C';
        shaun.n = 'T';
        shaun.a = 'G';
        
        Sheep dolly = shaun.clone();
        
        if (shaun != dolly) System.out.println("Another Sheep");
        else System.out.println("The same sheep");
        
        if (shaun.d == dolly.d &&
            shaun.n == dolly.n &&
            shaun.a == dolly.a ) System.out.println("The Same DNA Sequence!");
        else System.out.println("Different DNA!");

        // Call By Value GoodClass

        change( shaun.clone() );
        System.out.println(shaun.d);

        change( shaun );
        System.out.println(shaun.d);
        
    }
    
    static void change(Sheep s) {
        s.d = 'T';
    }

}


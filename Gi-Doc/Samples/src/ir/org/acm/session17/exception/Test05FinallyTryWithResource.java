package ir.org.acm.session17.exception;

// After Java 7
// Try with Resource
public class Test05FinallyTryWithResource {

    public static void main(String[] args) {

//        FileInputStream f1 = null;
//        try {
//
//            f1 = new FileInputStream("my.txt");
//            //m1
//            //m2
//            // do some work
//
//        } catch(FileNotFoundException e) {
//            e.printStackTrace();
//        } catch(IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                f1.close();
//            } catch(Exception e) {
//                e.printStackTrace();
//            }
//        }

        try( My my = new My(); ) { // AutoClosable
            my.m();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
//        } finally {
//            System.out.println("second!");
//        }


    }


}

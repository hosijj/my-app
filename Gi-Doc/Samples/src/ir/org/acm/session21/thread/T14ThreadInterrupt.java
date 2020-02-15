package ir.org.acm.session21.thread;

public class T14ThreadInterrupt {

        public static void main(String[] args) {

            Thread person = new Thread() {
                @Override
                public void run() {

                    int age = 1;
                    while( !Thread.interrupted() ) {
                        System.out.println("I am " + age++ + " years old!");
                    }

                }
            };

            person.start();

            try { Thread.sleep(2); } catch(InterruptedException e) { }

            person.interrupt();

        }


}



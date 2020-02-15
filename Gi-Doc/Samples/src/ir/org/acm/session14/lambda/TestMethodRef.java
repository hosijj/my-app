package ir.org.acm.session14.lambda;

    public class TestMethodRef {

        public static void main(String[] args) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    action();
                }
            } ).start();

            new Thread( () -> action() ).start();

            new Thread( TestMethodRef::action ).start();

        }

        static void action() {
            System.out.println( Thread.currentThread().getName() );
        }

    }


package LocalandAnonymousClass;

public class AnonymousOrnek {
    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Koşuyorum.");
        }
    };
}

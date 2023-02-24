public class tts {
    int height;
    int weight;
    int abs;
    public void run(){
        System.out.println("user can run ");
    }
    public void walk(){
        System.out.println("user can walk");
    }
    public void go(){
        System.out.println("usr can go ");
        System.out.println("****************************");
    }

    public static void main(String[] args) {
tts boy1=new tts();
boy1.height=6;
boy1.weight=5;
boy1.abs=10;
boy1.run();
boy1.walk();
boy1.go();
        System.out.println("height:"+boy1.height);
        System.out.println("height:"+boy1.weight);
        System.out.println("height:"+boy1.abs);
//        System.out.println("height:"+boy1.r);
    }
}

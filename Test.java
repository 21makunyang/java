public class Test {
    public Test(){
        System.out.println("1");
    }
    public Test(String name){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test test =new Test();
    }
}

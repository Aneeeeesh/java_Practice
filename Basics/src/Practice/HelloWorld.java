package Practice;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ByeWorld bye = new ByeWorld();
        System.out.println(bye.print());
    }
}
class ByeWorld {
    String print() {
        String s = "Bye, World!!" ;
        return s;
    }
}
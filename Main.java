class Simple{
    String name;
    Simple(String name){
        this.name="hello "+name;
    }
}
    class Main{
        public static void main(String[] args) {
            Simple greeting=new Simple("java");
            System.out.println(greeting.name.replace("a","*"));
        }
    }

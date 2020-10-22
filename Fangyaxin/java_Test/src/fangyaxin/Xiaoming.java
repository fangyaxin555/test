package fangyaxin;

public class Xiaoming extends Student implements Yingyu{
    private int age;
    public Xiaoming(){

    }

    @Override
    public void show() {
        System.out.println(this.age);
    }

    @Override
    public void du() {
        System.out.println("nihao");
    }
    public static void main(String[] args){
        Yingyu yu = new Yingyu(){
            @Override
            public void du() {
                System.out.println("asd");
            }
        };

        yu.du();
    }
}

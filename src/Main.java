public class Main {

    public static void main(String[] args) {

        Area are = new Area();
        System.out.println("三角形の面積："
                + are.calcTriangleAre(3.4,4.8));
        System.out.println("円の面積:"
                + are.calcCircleAre(6.8) );

        introduceOneself();
    }

    public static void introduceOneself() {
        String name = "宿 長平";
        int age = 32;
        float height = 164.5F;
        String zodic = "巳";

        System.out.println("名前：" + name);
        System.out.println("年齢:" + age);
        System.out.println("身長:" + height);
        System.out.println("十二支：" + zodic);
    }
}

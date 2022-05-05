//HotPot类为工厂方法模式中的Product
import java.util.ArrayList;
public abstract class HotPot {
    String name;
    String meat;
    String greens;
    ArrayList<String> materials = new ArrayList<String>();
    void prepare() {
        System.out.println("准备" + name);
        System.out.println("添加肉类食材:"+meat+"...");
        System.out.println("添加蔬菜食材:"+greens+"...");
        System.out.println("添加火锅配料:");
        for (String material : materials) {
            System.out.println("   " + material);
        }
    }
    void cook() {
        System.out.println("煮火锅30分钟");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(meat + "\n");
        display.append(greens + "\n");
        for (String material : materials) {
            display.append(material + "\n");
        }
        return display.toString();
    }
}

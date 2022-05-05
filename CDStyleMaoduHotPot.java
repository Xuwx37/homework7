//CDStyleMaoduHotPot类为工厂方法模式中的ConcreteProduct
public class CDStyleMaoduHotPot extends HotPot{
    public CDStyleMaoduHotPot() {
        name = "成都风味毛肚火锅";
        meat = "毛肚";
        greens = "芹菜";
        materials.add("花生油");
        materials.add("酱油");
    }
}

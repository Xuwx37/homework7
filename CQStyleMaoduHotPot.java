//CQStyleMaoduHotPot类为工厂方法模式中的ConcreteProduct
public class CQStyleMaoduHotPot extends HotPot {
    public CQStyleMaoduHotPot() {
        name = "重庆风味毛肚火锅";
        meat = "毛肚";
        greens = "芹菜";
        materials.add("胡椒");
        materials.add("辣椒");
    }
}

//CQStyleYangrouHotPot类为工厂方法模式中的ConcreteProduct
public class CQStyleYangrouHotPot extends HotPot {
    public CQStyleYangrouHotPot() {
        name = "重庆风味羊肉火锅";
        meat = "羊肉";
        greens = "菠菜";
        materials.add("酱油");
        materials.add("辣椒");
    }
}

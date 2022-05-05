//CQStyleYuanyangHotPot类为工厂方法模式中的ConcreteProduct
public class CQStyleYuanyangHotPot extends HotPot{
    public CQStyleYuanyangHotPot() {
        name = "重庆风味鸳鸯火锅";
        meat = "猪肉";
        greens = "白菜";

        materials.add("花椒");
        materials.add("辣椒");
    }
}

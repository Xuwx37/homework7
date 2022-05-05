//CDStyleYuanyangHotPot类为工厂方法模式中的ConcreteProduct
public class CDStyleYuanyangHotPot extends HotPot{
    public CDStyleYuanyangHotPot() {
        name = "成都风味鸳鸯火锅";
        meat = "猪肉";
        greens = "菠菜";
        materials.add("胡椒");
        materials.add("芝麻油");
    }
}

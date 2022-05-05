//CDStyleYangrouHotPot类为工厂方法模式中的ConcreteProduct
public class CDStyleYangrouHotPot extends HotPot{
    public CDStyleYangrouHotPot() {
        name = "成都风味羊肉火锅";
        meat = "羊肉";
        greens = "土豆";
        materials.add("蒜");
        materials.add("葱");
    }
}

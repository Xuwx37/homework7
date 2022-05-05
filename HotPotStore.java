//HotPotStore类为工厂方法模式中的Creator
public abstract class HotPotStore {
    abstract HotPot createHotPot(String item);
    public HotPot orderHotPot(String type) {
        HotPot hotPot = createHotPot(type);
        System.out.println("制作" + hotPot.getName());
        hotPot.prepare();
        hotPot.cook();
        return hotPot;
    }
}

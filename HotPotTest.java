public class HotPotTest {
    public static void main(String[] args) {
        HotPotStore CDStore = new ChengduHotPotStore();
        HotPotStore CQStore = new ChongqingHotPotStore();

        HotPot hotPot = CDStore.orderHotPot("Yuanyang");
        System.out.println("小王订了一个" + hotPot.getName() + "\n");

        hotPot = CQStore.orderHotPot("Yuanyang");
        System.out.println("小明订了一个" + hotPot.getName() + "\n");

        hotPot = CDStore.orderHotPot("Maodu");
        System.out.println("小张订了一个" + hotPot.getName() + "\n");

        hotPot = CQStore.orderHotPot("Maodu");
        System.out.println("小李订了一个" + hotPot.getName() + "\n");
    }
}

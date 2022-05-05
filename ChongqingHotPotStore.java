//ChongqingHotPotStore类为工厂方法模式中的ConcreteCreator
public class ChongqingHotPotStore extends HotPotStore{
    HotPot createHotPot(String item) {
        if (item.equals("Yuanyang")) {
            return new CQStyleYuanyangHotPot();
        } else if (item.equals("Maodu")) {
            return new CQStyleMaoduHotPot();
        } else if (item.equals("Yangrou")) {
            return new CQStyleYangrouHotPot();
        }  else return null;
    }
}

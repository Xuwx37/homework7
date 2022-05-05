//ChengduHotPotStore类为工厂方法模式中的ConcreteCreator
public class ChengduHotPotStore extends HotPotStore{
    HotPot createHotPot(String item) {
        if (item.equals("Yuanyang")) {
            return new CDStyleYuanyangHotPot();
        } else if (item.equals("Maodu")) {
            return new CDStyleMaoduHotPot();
        } else if (item.equals("Yangrou")) {
            return new CDStyleYangrouHotPot();
        }  else return null;
    }
}

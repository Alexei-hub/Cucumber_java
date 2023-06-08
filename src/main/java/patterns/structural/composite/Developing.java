package patterns.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Developing implements Develop {
    List<Develop> developList = new ArrayList<>();

    @Override
    public void writeCode(String project) {
        for (Develop d : developList) {
            d.writeCode(project);
        }
    }

    public void addDevelop(Develop develop) {
        developList.add(develop);
    }

    public Develop getDevelop(int index) {
       return developList.get(index);
    }

    public void clearDevelop() {
        developList.clear();
    }

}

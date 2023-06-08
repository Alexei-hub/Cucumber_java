package patterns.structural.flyweight;

//Вместо создания большого количества похожих объектов, объекты используются повторно. Экономит память.
public class Launch {

    public static void main(String[] args) {
        FlyWeightDbConn flyWeightDbConn = new FlyWeightDbConn();
        DBConn dbConn = flyWeightDbConn.getDBConn("test");
        DBConn dbConn2 = flyWeightDbConn.getDBConn("test");

        System.out.println(dbConn.equals(dbConn2));
    }

}

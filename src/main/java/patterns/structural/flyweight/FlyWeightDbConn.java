package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightDbConn {
    public Map<String, DBConn> dbConnMap = new HashMap<>();

    DBConn getDBConn(String env) {
        DBConn dbConn = dbConnMap.get(env);
        if (dbConn == null) {
            dbConn = new DBConn();
            dbConn.dbConnEnv = env;
            dbConnMap.put(env, dbConn);
        }
        return dbConn;
    }

}

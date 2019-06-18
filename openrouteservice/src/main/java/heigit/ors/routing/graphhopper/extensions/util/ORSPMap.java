package heigit.ors.routing.graphhopper.extensions.util;

import com.graphhopper.util.Helper;
import com.graphhopper.util.PMap;

import java.util.HashMap;
import java.util.Map;

public class ORSPMap extends PMap {
    private final Map<String, Object> objMap = new HashMap();
    ;

    public PMap putObj(String key, Object obj) {
        objMap.put(Helper.camelCaseToUnderScore(key), obj);
        return this;
    }

    public boolean hasObj(String key) {
        return objMap.containsKey(Helper.camelCaseToUnderScore(key));
    }

    public Object getObj(String key) {
        if (Helper.isEmpty(key)) {
            return "";
        }
        return objMap.get(Helper.camelCaseToUnderScore(key));
    }

}

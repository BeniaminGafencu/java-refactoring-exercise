package com.mcserby.training.refactoring;

import java.util.HashMap;
import java.util.Map;

public class InternationalValues {
    private Map<String, Details> ivMap;
    InternationalValues()
    {
        ivMap = new HashMap<>();
        ivMap.put("Uk", null);
        ivMap.put("Nl", null);
        ivMap.put("De", null);
        ivMap.put("Fr", null);
        ivMap.put("Es", null);
        ivMap.put("It", null);
        ivMap.put("At", null);
        ivMap.put("ChFr", null);
        ivMap.put("ChDe", null);
        ivMap.put("Ru", null);
        ivMap.put("Hr", null);
        ivMap.put("Gr", null);
        ivMap.put("Sl", null);
        ivMap.put("ChIt", null);
        ivMap.put("BeFr", null);
        ivMap.put("LuDe", null);
        ivMap.put("Li", null);
        ivMap.put("Pl", null);
        ivMap.put("Bl", null);
        ivMap.put("Ua", null);
        ivMap.put("Cz", null);
        ivMap.put("Sv", null);
        ivMap.put("CaEs", null);
        ivMap.put("Zh", null);
        ivMap.put("LuFr", null);
        ivMap.put("BeNl", null);
    }
    public Details getDetails(String name) {
        return ivMap.get(name);
    }
    public void addInternationalValue(String iv, String name, String description){
        ivMap.put(iv, new Details(name, description));
    }
}

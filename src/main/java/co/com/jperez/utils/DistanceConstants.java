package co.com.jperez.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistanceConstants {

    public static final String KM_M_KEY = "KM TO M";
    public static final double KM_M_VALUE = 1_000;
    public static final String M_KM_KEY = "M TO KM";
    public static final double M_KM_VALUE = 0.001;
    public static final String M_CM_KEY = "M TO CM";
    public static final double M_CM_VALUE = 100;
    public static final String CM_M_KEY = "CM TO M";
    public static final double CM_M_VALUE = 0.01;
    public static final String KM_CM_KEY = "KM TO CM";
    public static final double KM_CM_VALUE = 100_000;
    public static final String CM_KM_KEY = "CM TO KM";
    public static final double CM_KM_VALUE = 0.00001;

    public static final String CM = "CM";
    public static final String M = "M";
    public static final String KM = "KM";

    public static final Map<String, Double> DISTANCE_MAP;
    public static final List<String> DISTANCE_LIST;

    private DistanceConstants() {}

    static {
        DISTANCE_MAP = new HashMap<>();
        DISTANCE_MAP.put(CM_M_KEY, CM_M_VALUE);
        DISTANCE_MAP.put(M_CM_KEY, M_CM_VALUE);
        DISTANCE_MAP.put(M_KM_KEY, M_KM_VALUE);
        DISTANCE_MAP.put(KM_M_KEY, KM_M_VALUE);
        DISTANCE_MAP.put(CM_KM_KEY, CM_KM_VALUE);
        DISTANCE_MAP.put(KM_CM_KEY, KM_CM_VALUE);

        DISTANCE_LIST = new ArrayList<>();
        DISTANCE_LIST.add(CM);
        DISTANCE_LIST.add(M);
        DISTANCE_LIST.add(KM);
    }

}

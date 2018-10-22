package lv.iljapavlovs.testng.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public static String getUniqueString(){
        return new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
    }
}

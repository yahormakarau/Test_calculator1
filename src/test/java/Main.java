import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main { public static void main(String[] args) {
        String a = RandomStringUtils.randomAlphabetic(10);
        String b = RandomStringUtils.randomAlphabetic(10);
        String c = RandomStringUtils.randomAlphabetic(10);
        String d = RandomStringUtils.randomAlphabetic(10);
        String e = RandomStringUtils.randomAlphabetic(10);
        String[] arrayRandom = new String[]{a, b, c, d, e};

        for (String s : arrayRandom) {
            System.out.println(s);
            String r = s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
            System.out.println("печать укороченного  :" + r);

        }
    }
}
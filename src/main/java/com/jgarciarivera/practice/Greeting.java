package com.jgarciarivera.practice;

import org.apache.commons.lang3.StringUtils;

public class Greeting {
    public String sayHello(String[] names) {

        if (names == null) {
            return "Hello, my friend.";
        } else if (names.length == 1) {
            if (nameIsUppercase(names[0])) {
                return "HELLO " + names[0] + "!";
            }
            return "Hello, " + names[0] + ".";
        } else if (names.length == 2) {
            return "Hello, " + names[0] + " and " + names[1] + ".";
        } else {
            String multipleNames = "Hello, ";

            for (int i = 0; i < names.length; i++) {
                if (i == names.length - 1) {
                    return multipleNames + "and " + names[i] + ".";
                }
                multipleNames = multipleNames + names[i] + ", ";
            }

            return multipleNames;
        }
    }

    private boolean nameIsUppercase(String name) {
        return StringUtils.isAllUpperCase(name);
    }
}

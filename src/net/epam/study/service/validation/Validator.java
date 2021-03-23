package net.epam.study.service.validation;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean billValidator(List<String> text, Pattern pattern){
        boolean result = false;
        if (text != null) {
            for (String value : text) {
                Matcher matcher = pattern.matcher(value);
                if (matcher.find()) {
                    result = true;
                }
            }
        }
        return !result;
    }
}

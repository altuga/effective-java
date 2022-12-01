package org.jugistanbul.question44;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.owasp.esapi.ESAPI;


public class XssRemover {

    final static List<Pattern> rxs = new ArrayList<>();

    static {
        rxs.add(Pattern.compile("<script>(.*?)</script>", Pattern.CASE_INSENSITIVE));
        rxs.add(Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL));
        rxs.add(Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL));
        rxs.add(Pattern.compile("</script>", Pattern.CASE_INSENSITIVE));
        rxs.add(Pattern.compile("<script(.*?)>", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL));
        rxs.add(Pattern.compile("eval\\((.*?)\\)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL));
        rxs.add(Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE));
        rxs.add(Pattern.compile("vbscript:", Pattern.CASE_INSENSITIVE));
        rxs.add(Pattern.compile("onload(.*?)=", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL));
    }


    public static boolean unwantedStringExists(String headerKey, String value, boolean isExceptionEnable) {
        String originalValue = value;

        if (value == null) {
            return true;
        }

        String inputValue;

        value = value; //ESAPI.encoder().canonicalize(value);
        for (Pattern rx : rxs) {
            if (rx.matcher(value).matches()) {
                return true;
            }
            return false;
        }

        return false;
    }


    public static void main(String[] args) {
        unwantedStringExists("aaa", "sssss", false);
    }
}

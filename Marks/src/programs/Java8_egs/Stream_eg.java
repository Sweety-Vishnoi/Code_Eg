package programs.Java8_egs;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class Stream_eg {
    public static void main(String[] args) {

     String input="Java articles are Awesome";
     Character result= input.toLowerCase()
                    .chars()
                    .mapToObj(c -> (char) c)
                    .filter(c-> c !=' ')
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry-> entry.getValue() ==1 )
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);

            System.out.println(result);
        }
    }




    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.*;

    public class ex_2056 {
        public static void main(String[] args) throws FileNotFoundException {

            File file = new File ("test1.txt");

            Scanner scanner = new Scanner(file);
           // Scanner scanner = new Scanner(System.in);

            List<String> words = new ArrayList<>();

            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase());
            }

            Map<String, Integer> map = new HashMap<>();

            List<String> maxPopularWord = new ArrayList<>();

            for (String word : words) {
                Integer count = map.get(word);
                count = count != null ? count : 0;
                map.put(word, ++count);
            }

            Integer max = Collections.max(map.values());

            for (Map.Entry<String, Integer> item : map.entrySet()) {
                if (max.equals(item.getValue())){
                    maxPopularWord.add(item.getKey());
                }
            }

            Collections.sort(maxPopularWord);

            for (String word : maxPopularWord) {
                System.out.println(word);
            }
        }
    }

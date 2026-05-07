package challenges.interviews;/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

Challenge Goal
Your task is to analyze a given set of sentences and determine which pre-defined category has the highest total word
occurrence within those sentences.

Input
You will receive the following data:

categories = {
	"sports": ["football", "players", "basketball", "sport", "league"],
	"politics": ["government", "policies", "president", "elections", "voters"],
	"technology": ["ai", "machine", "learning", "algorithms"]
}

sentences = [
	"The Football team scored a goal. The players celebrated the victory.",
	"Basketball is a great sport. Many famous players are in the league.",
	"The government announced new policies. The president addressed the nation.",
	"Elections are coming soon. Voters will choose their representatives.",
	"AI is advancing rapidly. Machine learning algorithms are complex."
]

Output
The name of the category that has the highest total count of its words appearing in the sentences.

Expected Output
Category with most occurrences: sports
Found words for 'sports' category: football, players, basketball, sport, league, players

Total words:
* "football" (1)
* "players" (2)
* "basketball" (1)
* "sport" (1)
* "league" (1)
* Total for Sports: 1 + 2 + 1 + 1 + 1 = 6
 */

class CategoriesMap {



    public static void main(String[] args) {
        //input data
        Map<String, List<String>> categories = Map.of(
                "sports", List.of("football", "players", "basketball", "sport", "league"),
                "politics", List.of("government", "policies", "president", "elections", "voters"),
                "technology", List.of("ai", "machine", "learning", "algorithms")
        );


        List<String> sentences = List.of(
                "The Football team scored a goal. The players celebrated the victory.",
                "Basketball is a great sport. Many famous players are in the league.",
                "The government announced new policies. The president addressed the nation.",
                "Elections are coming soon. Voters will choose their representatives.",
                "AI is advancing rapidly. Machine learning algorithms are complex."
        );

        String winner = new CategoriesMap().calculate(categories, sentences);
        System.out.println("Category with most occurrences: " + winner);
    }

    public String calculate(Map<String, List<String>> map, List<String> strings) {

        // STEP 1: counter map — every category word starts at 0.
        Stream<List<String>> wordListsStream = map.values().stream();

        Stream<String> allCategoryWords = wordListsStream
                .flatMap(list -> list.stream());

        Map<String, Integer> count = allCategoryWords
                .collect(Collectors.toMap(word -> word, word -> 0));

        // STEP 2: bump each tracked word once per occurrence in the sentences.
        Stream<String> allSentenceWords = strings.stream()
                .flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\W+")));

        allSentenceWords.forEach(word -> count.computeIfPresent(word, (k, v) -> v + 1));

        // STEP 3: total per category = sum of its words' counts.
        Map<String, Integer> totalsByCategory = new HashMap<>();

        // For each (String category, List<String> words) pair in the categories map...
        map.forEach((category, words) -> {

            //sum the total count for every corresponding word in the list from the count map and add as a total to the corresponding category
            int total = words.stream()
                    .mapToInt(word -> count.get(word))
                    .sum();

            // Store the category's total in the result map.
            totalsByCategory.put(category, total);
        });

        // STEP 4: return the category with the highest total.
        String winner = null;        // category name with the highest total seen so far
        int maxTotal = -1;           // highest total seen so far

        // For each (category, total) pair, remember the highest one.
        for (var entry : totalsByCategory.entrySet()) {
            if (entry.getValue() > maxTotal) {
                maxTotal = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }

}

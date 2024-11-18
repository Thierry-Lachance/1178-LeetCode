class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < puzzles.length; i++) {
             int count = 0;
            
            for (int j = 0; j < words.length; j++) {
               
                List<Character> chars = new ArrayList<>();
                Boolean condition1 = false;
                Boolean condition2 = false;

                for (int l = 0; l < words[j].length(); l++) {
                    if (words[j].charAt(l) == puzzles[i].charAt(0)) {
                        condition1 = true;
                    }
                    if (!chars.contains(words[j].charAt(l))) {
                        chars.add(words[j].charAt(l));
                    }
                    // todo
                    System.out.println(chars);
                    String puzzle = puzzles[i];
                    for (int q = 0; q < puzzle.length(); q++) {
                        if (chars.contains(puzzle.charAt(q))) {
                            chars.remove(chars.indexOf(puzzle.charAt(q)));
                        }
                    }
                    if (chars.size() == 0) {
                        condition2 = true;
                    }

                }
                if (condition1 && condition2)
                    count++;
            }
            ans.add(count);
        }
        return ans;
    }
}
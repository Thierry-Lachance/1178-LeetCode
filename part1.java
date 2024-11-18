
        
        for (int p = 0; p < puzzles.length;p++) {
            List<Character> chars = new ArrayList<>();

            for (int w = 0; w < words.length;w++) {
                for (int i = 0; i < words[w].length();i++) {
                    if (!chars.contains(words[w].charAt(i))){
                        chars.add(words[w].charAt(i));
                    }
                }
                System.out.println(chars);
                String puzzle = puzzles[p];
                for (int q = 0; q < puzzle.length(); q++) {
                    if (chars.contains(puzzle.charAt(q))){
                        chars.remove(chars.indexOf(puzzle.charAt(q)));
                    }
                }
                if (chars.size() == 0) {
                    condition2 = true;
                }
            }
           
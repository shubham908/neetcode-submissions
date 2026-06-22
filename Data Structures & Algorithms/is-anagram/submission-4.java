class Solution {

    public boolean isAnagram(String s, String t) {
        // traverse through the string s and create a HashMap<Character, Integer>
        // traverse through the string t and create a HashMap<Character, Integer>
        // check if the length of strings are same
        // traverse through the first map and see if it matches as is with second
        
        var map1 = countChar(s);
        var map2 = countChar(t);

        if (s.length() != t.length()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry: map1.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();

            if (!map2.containsKey(key)) {
                return false;
            }
            if (!map2.get(key).equals(value)) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> countChar(String str) {
        var charCounter = new HashMap<Character, Integer>();
        for (char c: str.toCharArray()) {
            if (charCounter.containsKey(Character.valueOf(c))) {
                var currentCount = charCounter.get(Character.valueOf(c));
                charCounter.put(Character.valueOf(c), currentCount+1);
            } else {
                charCounter.put(Character.valueOf(c), 1);
            }
        }
        return charCounter;
    }
}

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        HashMap<String, Integer> bannedWords = new HashMap<>();
        
        Map<String, Integer> wordsInSentence = new HashMap<>();
        TreeMap<Integer,String> mostFrequentWord;
        
        String[] words = paragraph.split("[ !._,'@?;\\s]+");
        //System.out.println(Arrays.toString(words));
        
        for(String bannedWord : banned){
            bannedWords.put(bannedWord.toLowerCase(), 0);
        }
        
        for(String word : words){
            word=word.toLowerCase();
            if(bannedWords.containsKey(word)){}
        
            else if(wordsInSentence.containsKey(word)){
                wordsInSentence.put(word, wordsInSentence.get(word)+1);
                //System.out.println("printing");
            }
            else{
                wordsInSentence.put(word, 0);
                //System.out.println("printing");
            }
        }

        mostFrequentWord = new TreeMap<Integer,String>();
        
        wordsInSentence.forEach((k,v)->{
            mostFrequentWord.put(v,k);
            
            //System.out.println(k + " " + v);
        });
        
        return mostFrequentWord.get(mostFrequentWord.lastKey());
        
    }
}

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()>sentence2.length()){
            return areSentencesSimilar(sentence2,sentence1);
        }

        String[] smallerwords=sentence1.split(" ");
        String[] largerwords=sentence2.split(" ");

        int start=0;
        int end1=smallerwords.length-1;
        int end2=largerwords.length-1;

        while(start<= end1 && smallerwords[start].equals(largerwords[start])){
            start++;
        }
        while(start<= end1 && smallerwords[end1].equals(largerwords[end2])){
            end1--;
            end2--;
        }
        return(start>end1);

    }
}
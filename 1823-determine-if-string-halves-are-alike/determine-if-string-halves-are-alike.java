class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0;
        int count2=0;
        char[] arr=s.toCharArray();
        int n=arr.length/2;
        for(int i=0;i<n;i++){
            if(checkVowel(arr[i])){
                count1++;
            }
            if(checkVowel(arr[i+n])){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
    public boolean checkVowel(char c){
        if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A' || c=='E'|| c=='I'|| c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}
class Solution{
    
    HashTable mytable = new HashTable();

    public Solution(HashTable input){
        
        mytable = input;
        //this is the constructor
        
    }
    
 public int find(String word){
     int pos = hash(word);
     int jump = 7 - (convert(word) % 7);
     if (!mytable.check(pos, word)) {
            pos += jump;
            pos = pos%mytable.size;
        }
     return (pos);
 }

    public int convert(String word){
        int wordnum = 0;
        for (int i = 0; i < word.length(); i++) {
            wordnum += (int) word.charAt(i);
      }
        return wordnum;
    }
    public int hash(String word) {
        int r = 0;
        for (int i =0; i < word.length(); i++) {
            r += (29*r + (int)word.charAt(i))%99991;
        }
        return r%99991;
    }
    public void fill(String[] array){
    for (int i = 0; i < array.length; i++) {
        int pos = hash(array[i]);
        int jump = 7 - (convert(array[i]) % 7);
        if (!mytable.check(pos, array[i])) {
            pos += jump;
            pos = pos%mytable.size;
        }
        mytable.set(pos, array[i]);
    }
    }
}

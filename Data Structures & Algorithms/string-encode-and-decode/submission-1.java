class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String str : strs) {
            encoded += str.length();
            encoded += '_';
            encoded += str;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int start = 0;
        while (start < str.length()) {
            int wordLgth = 0;
            int i = start;
            while (str.charAt(i) != '_'){
                i++;
            }
            wordLgth = Integer.parseInt(str.substring(start, i));
            start = i + 1;
            decoded.add(str.substring(start, start + wordLgth));
            start += wordLgth;
        }
        return decoded;
    }
}

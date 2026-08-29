class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String str : strs) {
            encoded += str.length();
            encoded += str;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int start = 0;
        int wordLgth= -1;
        while (start < str.length()) {
            wordLgth = str.charAt(start) - '0';
            start++;
            decoded.add(str.substring(start, start + wordLgth));
            start += wordLgth;
        }
        return decoded;
    }
}

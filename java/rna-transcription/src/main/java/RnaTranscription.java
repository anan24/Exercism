class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        // String ans = "";
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < dnaStrand.length();i++){
            char c = dnaStrand.charAt(i);
                if(c == 'G') ans.append('C');
                else if(c == 'C') ans.append('G');
                else if(c == 'T') ans.append('A');
                else ans.append('U');   
            
        }
        return ans.toString();
    }

}

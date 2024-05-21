package com.util.algo.array;

public class StringAcronym {
    public boolean isAcronym(String fullForm, String acronym) {

        //Split the String based on white space.
        String[] strArray = fullForm.split("\\s+");

        StringBuilder acronymBuilder = new StringBuilder();

        for (int i = 0; i < strArray.length; i++) {
            if (acronym.charAt(i) == strArray[i].charAt(0)) {
                acronymBuilder.append(strArray[i].charAt(0));
            } else {
                return false;
            }
        }

        if(acronym.equals(acronymBuilder.toString())){
            return true;
        }
        return false;
    }
}

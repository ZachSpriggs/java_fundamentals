public class StringManipulator {

    public String trimAndConcat(String someStr, String otherStr){
        String newSomeStr = someStr.trim();
        String newOtherStr = otherStr.trim();
        String newStr = newSomeStr.concat(newOtherStr);
        return newStr;
    }

    public Integer getIndexOrNull(String str, char a){
        int value = str.indexOf(a);
        if(value < 0){
            return null;
        }
        return value;
    }
    
    public Integer getIndexOrNull(String someStr, String otherStr){
        int value = someStr.indexOf(otherStr);
        if(value < 0){
            return null;
        }
        return value;
    }

    public String concatSubstring(String thisStr, int a, int b, String newStr){
        String someNewStr = thisStr.substring(a,b);
        String answer = someNewStr.concat(newStr);
        return answer;
    }
}
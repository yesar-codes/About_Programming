public class CheckIfAlphabetPresent {
    public boolean CheckIfThere(String checkedString,char checkedWord) {
        boolean flag = checkedString.indexOf(checkedWord) > 0;
        return flag;
    }
}

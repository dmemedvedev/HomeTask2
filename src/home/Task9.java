package home;

public class Task9 {
    public static void findIndexes(){
        String searchableString = "don’t be sad today";
        String keyword = "be";

        int index = searchableString.indexOf(keyword);
        while (index >=0){
            System.out.println("Index : "+index);
            index = searchableString.indexOf(keyword, index+keyword.length())   ;
        }

    }

    public static void main(String[] args) {
        findIndexes();
    }
}

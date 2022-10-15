import java.util.*;

class lexicographic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items you wish to order");
        float numberOfItemsToEnter = scanner.nextInt();
        List<Integer> itemsToOrder = new ArrayList<>();
        for (int i = 0; i < numberOfItemsToEnter; i++){
            System.out.println("Enter a number to be ordered");
            int inputtedValue = scanner.nextInt();
            int indexToAdd = findIndexToPlaceInt(itemsToOrder, inputtedValue);
            itemsToOrder.add(indexToAdd, inputtedValue);
        }
        System.out.println(itemsToOrder);
        scanner.close();
    };

    public static int findIndexToPlaceInt(List<Integer> orderedList, int itemToAdd){
        int count = 0;
        for (int var : orderedList){
            int i = 0;
            boolean changeCountFlag = false;
            while (!changeCountFlag){
                String itemToAddString = Integer.toString(itemToAdd);
                String varString = Integer.toString(var);
                if (i == itemToAddString.length() && i == varString.length()){
                    return count;
                }  else if (i == itemToAddString.length()) {
                    count = count + 1;
                    changeCountFlag = true;
                } else if (i == varString.length()) {
                    return count;
                } else {
                    if (itemToAddString.charAt(i) < varString.charAt(i)){
                        return count;
                    } else if (itemToAddString.charAt(i) == varString.charAt(i)){
                        i = i + 1;
                    } else {
                        count = count + 1;
                        changeCountFlag = true;
                    }
                }
            }
        }
        return count;
    }
};


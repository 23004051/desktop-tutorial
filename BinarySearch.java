import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner vhukhudo = new Scanner(System.in);

        int[] productIDs = {104, 105, 106, 107, 101, 102, 103};

        System.out.print("Enter the product ID to search for: ");
        int targetID = vhukhudo.nextInt();

        int index = findProduct(productIDs, targetID);

        if (index != -1) {
            System.out.println("The Product found at index: " + index);
        } else {
            System.out.println("The Product not found.");
        }

        vhukhudo.close();
    }

    public static int findProduct(int[] productIDs, int targetID) {
        int left = 0;
        int right = productIDs.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (productIDs[mid] == targetID) {
                return mid;
            }

            if (productIDs[left] <= productIDs[mid]) {
                if (targetID >= productIDs[left] && targetID < productIDs[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (targetID > productIDs[mid] && targetID <= productIDs[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
       
        
        
        
    
    
    
  
        // TODO code application logic here
    
    


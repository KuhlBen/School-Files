//Ben Kuhlman MWF 1pm
import java.util.Scanner;
public class benKuhlman_a4sets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrayA[] = new int[21];
        int arrayB[] = new int[21];

        System.out.print("Enter elements of set A: ");
        int num =-1;
        do{

            num = input.nextInt();
            arrayA[num] = num;

        }while(num !=0);

        num = -1;
        System.out.print("Enter elements of set B: ");
        do{

            num = input.nextInt();
            arrayB[num] = num;

        }while(num!=0);

        //----------------------------------------------------------------------------------------------

        int arrayU[] = new int[21];         //array to hold the variables of union
        for(int i = 1; i < 21; i++){
            if(arrayA[i] > 0)
                arrayU[i] = arrayA[i];
            else if (arrayB[i] > 0)
                arrayU[i] = arrayB[i];

        }

        System.out.print("The union of A and B is: ");
        for (int i = 1; i<21; i++){
            if (arrayU[i] > 0)
                System.out.print(arrayU[i]+ " ");
        }

        System.out.println();
        //--------------------------------------------------------------------------------------------

        int arrayI[] = new int[21];         //array to hold the variables of intersection
        for(int i = 1; i < 21; i++){
            if((arrayA[i] == arrayB[i]) && arrayA[i] > 0)
                arrayI[i] = arrayA[i];

        }

        System.out.print("The intersection of A and B is: ");
        for (int i = 1; i<21; i++){
            if (arrayI[i] > 0)
                System.out.print(arrayI[i]+ " ");
        }
        System.out.println();
        //-------------------------------------------------------------------------------------------------

        int arrayD[] = new int[21];         //array to hold the variables of the difference
        for(int i = 1; i < 21; i++){
            if((arrayA[i] > 0) && (arrayA[i] != arrayB[i]))
                arrayD[i] = arrayA[i];

        }

        System.out.print("The difference of A and B is: ");
        for (int i = 1; i<21; i++){
            if (arrayD[i] > 0)
                System.out.print(arrayD[i]+ " ");
        }

    }
}

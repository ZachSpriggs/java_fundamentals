public class BasicJava {
    public static void main(String[] args) {
        printNums();
        printOdds();
        printSum();
        printArray();
        int[] maxArray = {1,2,3,51,4,52,6};
        findMax(maxArray);
        int[] avgArray = {3,6,1,74,21,62,4};
        findAvg(avgArray);
        oddArray();
        int[] sqArr = {1, 5, 10, -2};
        squareValues(sqArr);
        int[] negArr = {1,5,10,-2};
        elimNegatives(negArr);
        int[] shiftArr = {1,5,10,7,-2};
        shiftValues(shiftArr);
    }

    public static void printNums(){
        for(int i = 0; i < 256; i++){
            System.out.println(i);
        }
    }

    public static void printOdds(){
        for(int i = 0; i < 256; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void printSum(){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
        }
    }

    public static void printArray(){
        int[] newArr = {1,3,5,7,9,13};
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]);
        }
    }

    public static void findMax(int someArray[]){
        int max = 0;
        for(int i = 0; i < someArray.length; i++){
            if(max < someArray[i]){
                max = someArray[i];
            }
        }
        System.out.println(max);
    }

    public static void findAvg(int array[]){
        int avg = 0;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println(avg);
    }

    public static void oddArray(){
        int[] oddArr = new int[256];
        for(int i = 0; i < 256; i++){
            if(i % 2 != 0){
                oddArr[i] += i;
                System.out.println(oddArr[i]);
            }
        }
    }

    public static void squareValues(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] *= array[i];
            System.out.println(array[i]);
        }
    }   

    public static void elimNegatives(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                array[i] = 0;
                
            }
            System.out.println(array[i]);
        }
    }

    public static void minMaxAvg(int array[]){
        int min = array[0];
        int max = array[0];
        int avg = 0;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }

    public static void shiftValues(int[] array){
        if(array.length == 0){
            return;
        }
        for(int i = 0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
        
    }

}


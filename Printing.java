public class Printing {
    public static void main(String[] args){

    }
    public static void printStars(int size){
         for(int i = 0; i < size; i++){
            System.out.print("*");
        }
        System.out.println("");

    }
    public static void printWhitespaces(int size){
        for(int i = 0; i < size; i++){
            System.out.print(" ");
        }
        System.out.println("");
    }
    public static void printSquare(int sideSize){
        int i = 0;
        while(i < sideSize) {
            printStars(4);
            i++;
        }
    }
    public static void printRectangle(int width, int height){
        int i = 0;
        int j = 0;
        while (i < width && j < height){
            printStars(width);
            i++;
            j++;
        }
    }
    public static void printTriangle(int size){
        int i = 0;
        int j = 1;
        while(i < size){
            printStars(j);
            i++;
            j ++;
        }
    }
    public static void printStars2(double size){
        for (int i = 0; i < size; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printWhitespaces2(int size){
        for(int i = 0; i < size; i++){
            System.out.print(" ");
        }
    }
    public static void printTriangle2(int size){
        int i = 0;
        int j = 1;
        String s = "";
        while(i < size){
            printWhitespaces2(size);
            size--;
            printStars(j);
            j++;
        }
    }
    public static void xmasTree(int height){
        int i = 0;
        double j = 0.5;
        while (i < height){
            printWhitespaces2(height);
            printStars2(j*2);
            height--;
            j++;
        }
        while(i < 2){
            printWhitespaces2(9);
            printStars(3);
            i++;
        }
    }
}


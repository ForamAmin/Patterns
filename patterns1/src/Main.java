import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows");
        Scanner n= new Scanner(System.in);
        int a= n.nextInt();
        pattern1(a);
        pattern2(a);
        pattern3(a);
        pattern4(a);
        pattern5(a);
        System.out.println("Triangle");
        pattern6(a);
        System.out.println("Inverted traingle ");
        pattern7(a);
        pattern8(a);
        pattern9(a);
        pattern10(a);
        pattern11(a);
        pattern12(a);
        pattern13(a);
        pattern14(a);
        pattern15(a);
        pattern16(a);





    }
        public static void pattern1(int a){
            System.out.println("Solid Rectangle");
            for(int i=1;i<=a;i++){
                for(int j=1;j<=a;j++){
                    System.out.print('*');

                }
                System.out.println(" ");
            }
        }
        public static void pattern2(int a){
            System.out.println("Right angle triangle ");
        for(int rows=1;rows<=a;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print("*");
            }
            System.out.println(" ");
        }    }
        public static void pattern3(int a){
            System.out.println("Inverted Right angle triangle");
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        }
        public static void pattern4(int a){
            System.out.println("Numbers - 1");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        }
        public static void pattern5(int n){
            System.out.println("Numbers -2");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println(" ");
            }
        }
        public static void pattern6(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*i+1;k++){
                    System.out.print("*");
                }
                for(int l=0;l<n-i-1;l++){
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }
        public static void pattern7(int n){

            for(int i=0; i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<2*n-(2*i+1);k++){
                    System.out.print("*");
                }
                for(int l=0;l<i;l++){
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }
        public static void pattern8(int a){
            System.out.println("Diamond ");
            pattern6(a);
            pattern7(a);
        }
        public static void pattern9(int n){
            System.out.println("Right");
            for(int i=1;i<2*n-1;i++){
                int s=i<=n ? i : 2*n-i;
                for(int j=1;j<=s;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        public static void pattern10(int n){
            System.out.println("Left");
            for(int i=1;i<=2*n-1;i++){
                int s=i<=n ? n-i :i-n;
                for(int j=0;j<s;j++){
                    System.out.print(" ");
                }
                int s2=i<=n ? i :2*n-i;
                for(int k=0;k<s2;k++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        public static void pattern11(int n){
            System.out.println("Number : 3");
            for(int i=0;i<n;i++){
                int start=(i%2==0) ? 1 : 0;
                for(int j=0;j<=i;j++){
                    System.out.print(start);
                    start=1-start;
                }
                System.out.println(" ");

            }
        }
        public static void pattern12(int n){
            System.out.println("Symmetric Double-Sided Pyramid with Spaces");
            for(int i=1;i<=n;i++){
                for(int stars=1; stars<=i;stars++){
                    System.out.print("*");
                }
                for(int space=1;space<=2*(n-i);space++){
                    System.out.print(" ");
                }
                for(int stars2=1; stars2<=i;stars2++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    public static void pattern13(int n){
        System.out.println("Numbers : 4");
        for(int i=1;i<=n;i++){
            for(int stars=1; stars<=i;stars++){
                System.out.print(stars);
            }
            for(int space=1;space<=2*(n-i);space++){
                System.out.print(" ");
            }
            for(int stars2=i; stars2>=1;stars2--){
                System.out.print(stars2);
            }
            System.out.println(" ");
        }
    }
    public static void pattern14(int n){
        System.out.println("Numbers : 5");
        int start=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=start+1;
            }
            System.out.println(" ");
        }
    }
    public static void pattern15(int a){
        System.out.println("Right angle triangle Alphabets ");
        int asciiValue = 65;
        for(int rows=1;rows<=a;rows++){
            for(int cols=1;cols<=rows;cols++){
                char character = (char) asciiValue;
                System.out.print(character);
                asciiValue +=1;
            }

            System.out.println(" ");
        }    }
    public static void pattern16(int a){
        System.out.println("Right angle triangle Alphabets : 2");
        for(int rows=1;rows<=a;rows++){
            int asciiValue = 65;
            for(int cols=1;cols<=rows;cols++){
                char character = (char) asciiValue;
                System.out.print( character );
                asciiValue +=1;
            }

            System.out.println(" ");
        }    }















}

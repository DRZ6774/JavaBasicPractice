package practice_basic_day01;

public class Q03_PrimitiveDataTypes_DersAnlatma {
     /*
         * Primitive data type
                byte: only takes whole numbers
	 	        short: only takes whole numbers
	 	        int(used more often): only takes whole numbers
	 	        long: only takes whole numbers

	 	        float: can take decimals (MUST have F or f at the end)
	 	        double( used more often): can take decimals

	 	        boolean: true or false boolean expressions
	 	        char: character within single quote ''
	 	        	 	also takes number
         * Range: double > float >long > int >short > byte
         */

    public static void main(String[] args) {

        boolean iyyimi=true;
        System.out.println(iyyimi);

        byte sayi=1;
        System.out.println(sayi);

        int sayi1=2;
        System.out.println(sayi1);

        double sayi2=2.5;
        System.out.println(sayi2);

        char harf='A';
        System.out.println(harf);

        sayi=2;
        System.out.println(sayi);

        byte enbuyuk=Byte.MAX_VALUE;
        System.out.println(enbuyuk);

        byte enkücük=Byte.MIN_VALUE;
        System.out.println(enkücük);

        short enbuyuk1=Short.MAX_VALUE;
        System.out.println(enbuyuk1);

        short enkücük1=Short.MIN_VALUE;
        System.out.println(enkücük1);

    }
}

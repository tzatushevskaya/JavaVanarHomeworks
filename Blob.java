
public class Blob {

    public static void main(String[] args){

    	 Integer[] data = { 100, 200, 300, 400, null };

    	 //data = methodA(data);
    	 show(data);
    	 data = pushLeft2(data);
    	 show(data);
//    	 data = methodB(data);
//    	 data = methodC(data);
//    	 data = methodD(data);
    
    }
    //this method moves array elements to the right replacing them with nulls
    public static Integer[] pushRight(Integer[] array){
        int i = array.length - 1;
        while( i > 0 ){
            array[i--] = array[i];
        }
        array[i] = null;
        return array;
    }
    //this method moves array elements to the left replacing them with nulls    
    public static Integer[] pushLeft(Integer[] array){
        int i = 0;
        while( i < array.length-1 ){
            array[i++] = array[i];
        }
        array[i] = null;
        return array;
    }
    //this method moves array elements to the right replacing them with nulls    
    public static Integer[] pushRight2(Integer[] array){
        for (int i = array.length-1; i > 0; i-- ){
            array[i--] = array[i++];
        }
        array[0] = null;
        return array;
    }
    //this method moves array elements to the left replacing them with nulls
    public static Integer[] pushLeft2(Integer[] array){
        for (int i = 0; i < array.length-1; i++ ){
        	array[i++] = array[i--];
        }
    	array[array.length-1] = null;
        return array;
    }
    
    public static void show (Integer[] array){
        for (int i = 0; i < array.length; i++ ){
        	System.out.print(array[i] + " ");
        }
    }

}




public class HwLsRsArray {

	public static void main (String[] args) {
		
		Integer[] data = { 100, 200, 300, 400, null };
		
		data = pull(data);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
	
//	public static Integer[] methodA(Integer[] array){
//        int i = array.length-1;
//        while( i > 0 ){
//            array[i--] = array[i];// last element of the array takes the value of an element before him 
//        }
//        array[i] = null; // first element becomes null
//        return array;
//    }
//	
	public static Integer[] push(Integer[] array){
        for(int i = array.length-1; i>0; i--) {
        array[i] = array[i-1];// last element of the array takes the value of an element before him 
        }
        array[0] = null; // first element becomes null
        return array;
    }
	
	public static Integer[] pull(Integer[] array){
        for(int i = 0; i < array.length-1; i++) {
        array[i-1] = array[i+1];// first element of the array takes the value of an element after him 
        }
        array[array.length-1] = null; // last element becomes null
        return array;

    }
	
}

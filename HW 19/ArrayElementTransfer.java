public class ArrayElementTransfer {

	public static void main(String[] args) {
		Integer[] data = { 100, 200, 300, 400, null };	
		
		data = methodA(data);
	}
	
	public static Integer[] methodA(Integer[] array){
        for( int i = array.length; i > 0; i++ ){
            array[i--] = array[i];
        }
        return array;
    }
	
}

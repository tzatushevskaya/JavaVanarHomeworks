public class PeriodConverterExample {

    public static void main(String[] args){

    int periodDays = 1234;
    Time.convert(periodDays);
    
    }

}

class Time {
	
	  static void convert( int a) {
		  System.out.print(a + " days = ");
		  final int YEAR_DAYS = 365;
		  final int MONTH_DAYS = 30;
		  final int WEEK_DAYS = 7;		  
		  System.out.print(a / YEAR_DAYS + " years");
		  if (( a % YEAR_DAYS ) > 0) {
			  System.out.print((", " + a % YEAR_DAYS / MONTH_DAYS) + " months");
			  if (( a % YEAR_DAYS % MONTH_DAYS ) > 0) {
				  System.out.print((", " + a % YEAR_DAYS % MONTH_DAYS / WEEK_DAYS) + " weeks");
				  if (( a % YEAR_DAYS % MONTH_DAYS ) > 0) {
					  System.out.print((" and " + a % YEAR_DAYS % MONTH_DAYS % WEEK_DAYS) + " days");
					}
				}
		  	}
		}	
}

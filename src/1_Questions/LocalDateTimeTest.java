
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeTest{

	public static void main(String[] args){
		
		dateFromat();
		localDate();
	
	}


	//1,LocalDate API
	public static void dateFromat(){
		//这里报错，应该是DateTimeFormatter.ISO_DATE(年月日)，ISO_DATE_TIME是有时分秒的日期格式，OCJP原题
		String date = LocalDate.parse("2023-02-05").format(DateTimeFormatter.ISO_DATE_TIME); 
		//String date = LocalDate.parse("2023-02-05").format(DateTimeFormatter.ISO_DATE);  //正确写法
		System.out.println(date);
	}

	
	//注意下面三种方式输出的日期格式是一致的，跟Date类的输出格式不一样
	public static void localDate(){
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);

		System.out.println("date1==>" + date1);
		System.out.println("date2==>" + date2);
		System.out.println("date3==>" + date3);
	
	}

}

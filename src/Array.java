
public class Array {

	public static void main(String[] args) {
		String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
		int[] salary = { 560, 560, 500, 500, 190, 190, 560, 700};
		int maxSalary = salary[0];
		int minSalary = salary[0];
		int average = 0;
		int sum =0;
		int k;
		int i;
		for (i = 0; i < salary.length; i++) {
			if (maxSalary < salary[i]) {
				maxSalary = salary[i];
			}
			if (minSalary > salary[i]) {
				minSalary = salary[i];
			}
			sum = sum + salary[i];
			if(salary[i] == salary[i]) {
				
			}
		}
		
		////------------Answer1-------------///
		
		for (k = 0; k < salary.length; k++) {
			if (maxSalary == salary[k]) {
				System.out.println();
				System.out.println("1.Employee who has highest salary:");
				System.out.println(employee[k] + " has the highest salary of "  + "$" + maxSalary);
			}
		}
		System.out.println("..................................");
		
		///---------Answer2---------///
		
		System.out.println("2.Employee who has lowest salary:");
		for (k = 0; k < salary.length; k++) {
			if (minSalary == salary[k]) {
				
				System.out.println(employee[k] + " has the lowest salary of "  + "$" + minSalary);
			}
		}
		System.out.println("..................................");
		
		///-----------Answer3------------///
		
		System.out.println("3.Employee who has lower salary than average: "+sum/salary.length + ".0");
		for (k = 0; k < salary.length; k++) {
			if(salary[k] <= sum/salary.length) {
				System.out.println(employee[k] + ": " + salary[k]+"$");
			}
		}
		System.out.println("..................................");
		
		////--------Answer4-------------///
		
		System.out.println("4.Employee who has higher salary than average: " + sum/salary.length + ".0");
		 for(int j = 0 ;j<employee.length;j++) {
	    	   if(salary[j] > minSalary) {
	    		   sum += salary[j];
	    		   average = sum /salary[j];
	    		   System.out.println(employee[j]+":" + " " +"$"+ salary[j]);
	    	   }
	       }
	       System.out.println("...................................");
	       
		
		///---------Answer5-------//
		
		System.out.println("5.Employee who has same salary: " + sum/salary.length);
		for (k = 0; k < salary.length-1; k++) {
			if(salary[k] == salary[k]) {
				System.out.println(employee[k]+" : " + salary[k] + "$");
			}
		}
		System.out.println("..................................");
		
	}

}
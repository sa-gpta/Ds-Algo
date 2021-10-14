

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterAge {

	private List<Integer> votersList(Map<Integer, LocalDate> ageMap) {
		List<Integer> resList = new ArrayList<>();
		for (int key : ageMap.keySet()) {
			Period period = Period.between(ageMap.get(key), LocalDate.now());
			if(period.getYears()>=18) {
				resList.add(key);
			}
		}
		return resList;
	}
	
	public static void main(String[] args) {
		Map<Integer,LocalDate> ageMap = new HashMap<>();
		ageMap.put(1001, LocalDate.parse("1998-12-15"));
		ageMap.put(1002, LocalDate.parse("1984-08-25"));
		ageMap.put(1003, LocalDate.parse("1999-05-27"));
		ageMap.put(1004, LocalDate.parse("1991-10-28"));
		ageMap.put(1005, LocalDate.parse("1974-11-02"));
		ageMap.put(1006, LocalDate.parse("2004-12-01"));
		ageMap.put(1007, LocalDate.parse("2000-09-10"));
		
		System.out.println(new FilterAge().votersList(ageMap));
	}

	

}

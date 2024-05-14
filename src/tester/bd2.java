package tester;

	public class bd2 {
	
	    @SuppressWarnings("unused")
		public static void main(String[] args) {
	        // 	Анхны оюутанд зориулсан сургуулийн мэдээлэл
	        int startYear1 = 1978;
	        int endYear1 = 1988;
	        int schoolYears1 = 10;
	        int schoolDaysPerWeek1 = 6;
	        int schoolHoursPerDayLower1 = 8;
	        int schoolHoursPerDayUpper1 = 6;
	        int lowerClassDuration1 = 4 * schoolHoursPerDayLower1;
	        int upperClassDuration1 = 34;
	        int lowerClassDurationAll1 = lowerClassDuration1 * 5 + upperClassDuration1 * 2;
	        int upperClassDurationAll1 = upperClassDuration1 * 3;
	        
	        // Хоёр дахь оюутанд зориулсан сургуулийн мэдээлэл
	        int startYear2 = 2006;
	        int endYear2 = 2018;
	        int schoolYears2 = 12;
	        int schoolDaysPerWeek2 = 5;
	        int schoolHoursPerDayLower2 = 4;
	        int schoolHoursPerDayUpper2 = 6;
	        int lowerClassDuration2 = 4 * schoolHoursPerDayLower2;
	        int upperClassDuration2 = 6 * schoolHoursPerDayUpper2;
	        int lowerClassDurationAll2 = lowerClassDuration2 * 5 + upperClassDuration2 * 7;
	        int upperClassDurationAll2 = upperClassDuration2 * 5;
	        
	        // 1. Ахлах, дунд сургуульд суралцах хугацаа аль нь урт вэ?
	        int totalStudyHoursMiddle1 = schoolYears1 * (schoolDaysPerWeek1 * lowerClassDurationAll1);
	        int totalStudyHoursMiddle2 = schoolYears2 * (schoolDaysPerWeek2 * lowerClassDurationAll2);
	        int totalStudyHoursHigh1 = schoolYears1 * (schoolDaysPerWeek1 * upperClassDurationAll1);
	        int totalStudyHoursHigh2 = schoolYears2 * (schoolDaysPerWeek2 * upperClassDurationAll2);
	        
	        int totalStudyHours1 = totalStudyHoursMiddle1 + totalStudyHoursHigh1;
	        int totalStudyHours2 = totalStudyHoursMiddle2 + totalStudyHoursHigh2;
	        
	        String longerPeriod = (totalStudyHours1 > totalStudyHours2) ? "Анхны оюутны суралцах хугацаа" : "Хоёр дахь оюутны суралцах хугацаа";
	        System.out.println("1. Сурах хугацаа илүү урт байна: " + longerPeriod);
	        
	        // 2. Сонирхсон сэдвүүдэд зарцуулсан цагийг харьцуул
	        int interestHoursPerWeek = 4;
	        int interestHours1 = schoolYears1 * (schoolDaysPerWeek1 * interestHoursPerWeek);
	        int interestHours2 = schoolYears2 * (schoolDaysPerWeek2 * interestHoursPerWeek);
	        System.out.println("2. Сонирхсон сэдвүүдэд зарцуулсан цаг:");
	        System.out.println("   - Анхны оюутан: " + interestHours1 + " hours");
	        System.out.println("   - Хоёр дахь оюутан: " + interestHours2 + " hours");
	        
	        // 3. Дадлага хийх хугацааг суралцах хугацааны хувиар тооц
	        int internshipWeeks = 8;
	        double internshipPercentage1 = ((double) internshipWeeks / (schoolYears1 * 52)) * 100;
	        double internshipPercentage2 = ((double) internshipWeeks / (schoolYears2 * 52)) * 100;
	        System.out.println("3. Дадлага хийх хугацаа нь суралцах хугацааны хувиар:");
	        System.out.println("   - Анхны оюутан: " + internshipPercentage1 + "%");
	        System.out.println("   - Хоёр дахь оюутан: " + internshipPercentage2 + "%");
	    }
	}

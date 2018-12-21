package converttime;

/**
 *
 * @author Jeancy Tshibemba
 */
public class ConvertTime {
    //Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    static String timeConversion(String s) {
        String result ="";
        String temp;
        if(s.contains("PM") && s.substring(0, 2).equals("12")){
            result = "12".concat(s.substring(2, 8));   
        }
        else if(s.contains("AM") && !s.substring(0, 2).equals("12")){
            result = s.substring(0, 8);
        }else if(s.contains("PM") && !s.substring(0, 2).equals("12")){
            int tep = Integer.valueOf(s.substring(0, 2)) + 12;
            temp = Integer.toString(tep);
            String tes = s.substring(2,8);
            result = temp.concat(tes);
        }   
         else if(s.contains("PM") && s.substring(0, 2).equals("12")){
                result = "12".concat(s.substring(2, 8));   
         }else if( s.contains("AM") && s.substring(0, 2).equals("12")){
             result = "00".concat(s.substring(2, 8));
            
        }
        
        System.out.println(result);
        return result;

    }
    public static void main(String[] args) {
         ConvertTime.timeConversion("07:05:45AM");
         ConvertTime.timeConversion("12:05:45PM");
         ConvertTime.timeConversion("05:05:45AM");
         ConvertTime.timeConversion("12:05:15PM");
         ConvertTime.timeConversion("11:05:11AM");
         ConvertTime.timeConversion("12:40:22AM");
         ConvertTime.timeConversion("12:00:00PM");
    }
    
}


package leetcode;
/*
 * 1). We need to understand the roman number's logic.
 * 2). Define a array to store key value of roman, then convert number to 4 units.
 * */
public class Integer_to_Roman {
	public String intToRoman(int num) {
        String value[][] = {{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
        							{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
        							{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
        							{"", "M", "MM", "MMM"}};
        String roman="";
        roman+=(value[3][num /1000 % 10]);
        roman+=(value[2][num /100 % 10]);
        roman+=(value[1][num /10 % 10]);
        roman+=(value[0][num % 10]);
        
        return roman;
    }
}

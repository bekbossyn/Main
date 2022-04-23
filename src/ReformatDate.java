public class ReformatDate {

    public String reformatDate(String date) {
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int i = 0;
        while (date.charAt(i) >= '0' && date.charAt(i) <= '9') i++;
        int day = Integer.parseInt(date.substring(0, i));
        int j = i;
        while (!(date.charAt(j) >= 'A' && date.charAt(j) <= 'Z')) j++;
        while (!(date.charAt(i) >= '0' && date.charAt(i) <= '9')) i++;
        int year = Integer.parseInt(date.substring(i));
        date = date.substring(j, j + 3);
        j = 0;
        while (months[j].compareTo(date) != 0) j++;
        j++;
        date = String.valueOf(j);
        if (j < 10) date = "0" + date;
        String res = String.valueOf(year) + "-" + date + "-";
        if (day < 10) res += "0" + String.valueOf(day);
        else
            res += String.valueOf(day);
        return res;
    }

}

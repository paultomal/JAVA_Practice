public enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY , Wednesday,Thursday,Friday,Saturday;
    public static int workDayCount(DayOfWeek week[]){
        int count = 0;
        for (DayOfWeek day : week) {
            if (day != Saturday && day != SUNDAY) {
                count++;
            }
        }
        return count;
    }
   /* public static void main(String[] args) {
        DayOfWeek[] dayOfWeek = *//*{DayOfWeek.MONDAY,DayOfWeek.Friday,DayOfWeek.SUNDAY};*//*DayOfWeek.values();
        System.out.println(workDayCount(dayOfWeek));
    }*/
    }




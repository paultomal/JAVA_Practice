public class Main {
    public static void main(String[] args) {
        DayOfWeek[] dayOfWeek = /*{DayOfWeek.MONDAY,DayOfWeek.Friday,DayOfWeek.SUNDAY};*/DayOfWeek.values();
        System.out.println(DayOfWeek.workDayCount(dayOfWeek));
    }
}
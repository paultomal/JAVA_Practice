import java.util.Arrays;

public class University {

    public static class Department{
        private String name;
        private String[] courses ;

        public Department(String name, String[] courses){
            setName(name);
            setCourses(courses);
        }

        public String getName() {
            return name;
        }

        public String[] getCourses() {
            return courses ;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCourses(String[] courses) {
            this.courses = courses;
        }
        public void showDetails(){
            System.out.println(getName());
            System.out.println( Arrays.toString(getCourses()));
        }
    }
}

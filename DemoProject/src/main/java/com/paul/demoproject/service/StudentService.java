package com.paul.demoproject.service;

import com.paul.demoproject.dto.RegisterStudent;
import com.paul.demoproject.dto.StudentDashboard;
import com.paul.demoproject.entity.Student;
import com.paul.demoproject.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static com.paul.demoproject.util.Studentutil.convertStudentToStudentDashboard;

@Service
public class StudentService {



    private final StudentRepository repository;
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveRegistration(Student registration){
        return repository.save(registration);
    }
    public List<Student> saveAllRegistrations(List<Student> registrations){
        return repository.saveAll(registrations);
    }

    public Student getRegistrationByFirstName(String firstName){
        return repository.findByFirstName(firstName);
    }
    public Student getRegistrationByLastName(String lastName){
        return repository.findByLastName(lastName);
    }
    public List<StudentDashboard> getStudents() {
        List<Student> students = repository.findAll();
        List<StudentDashboard> studentsDashboard = new ArrayList<>();
        for(Student student: students) {
                StudentDashboard studentDashboard = convertStudentToStudentDashboard(student);
                studentsDashboard.add(studentDashboard);
        }
        return studentsDashboard;
    }


    public Student saveStudent(Student newStudent, @Valid RegisterStudent student) {
        newStudent.setFirstName(student.getFirstName());
        newStudent.setLastName(student.getLastName());
        newStudent.setDob(student.getDob());
        newStudent.setEmail(student.getEmail());
        newStudent.setPassword(student.getPassword());
        newStudent.setAddress(student.getAddress());
        newStudent.setBoard(student.getBoard());
        newStudent.setContact(student.getContact());

        return repository.save(newStudent);
    }

    public String deleteRegistration(int id){
        repository.deleteById(id);
        return "registration removed!! " +id;
    }
    public Student updateStudent(Student existingStudent, RegisterStudent student) {
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDob(student.getDob());
        existingStudent.setBoard(student.getBoard());
        existingStudent.setPassword(student.getPassword());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setContact(student.getContact());

        return repository.save(existingStudent);
    }

}

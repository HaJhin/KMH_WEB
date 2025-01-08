package day57task.model.dao;

import day57task.model.dto.StudentDto;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;

@Component
public class StudentDao {
    private Connection conn;
    ArrayList<StudentDto> studentDB = new ArrayList<>();

    public StudentDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb0107", "root", "6703");
            System.out.println("[ Connection OK ]");
        } catch (Exception e) {
            System.out.println("[ Connection Fail ]");
        } // try catch ed
    } // init ed

    public boolean studentWrite(StudentDto studentDto) {
        try {
            String sql = "insert into student(sname,skor,seng,smath)values(?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,studentDto.getSname());
            ps.setInt(2,studentDto.getSkor());
            ps.setInt(3,studentDto.getSeng());
            ps.setInt(4,studentDto.getSmath());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        } // try catch ed
        return false;
    } // f ed

    public ArrayList<StudentDto> studentPrint() {
        try {
            String sql = "select * from student;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sname = rs.getString("sname");
                int skor = rs.getInt("skor");
                int seng = rs.getInt("seng");
                int smath = rs.getInt("smath");

                StudentDto studentDto = StudentDto.builder()
                        .sname(sname).skor(skor).seng(seng).smath(smath).build();
                studentDB.add(studentDto);
            } // w ed
        } catch (Exception e) {
            System.out.println(e);
        } // try catch ed
        return studentDB;
    } // f ed

    public boolean studentUpdate(StudentDto studentDto) {
        try {
            String sql = "update student set sname = ? , set skor = ? , set seng = ? , set smath = ? where sno = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,studentDto.getSname());
            ps.setInt(2,studentDto.getSkor());
            ps.setInt(3,studentDto.getSeng());
            ps.setInt(4,studentDto.getSmath());
            ps.setInt(5,studentDto.getSno());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        } // try catch ed
        return false;
    } // f ed

    public boolean studentDelete(int sno) {
        try {
            String sql = "delete from student where sno = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,sno);
            ps.executeUpdate();
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            } // if ed
        } catch (Exception e) {
            System.out.println(e);
        } // try catch ed
        return false;
    } // f ed

} // class ed

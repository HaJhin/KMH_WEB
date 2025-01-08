package day57task.service;

import day57task.model.dao.StudentDao;
import day57task.model.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service // 객체(빈) 생성해서 메모리(SPRING 컨테이너) 등록한다.
// 이 클래스의 객체(빈)은 네(SPRING)가 관리해줘 : IOC
// 싱글톤 삭★제
public class StudentService {
    // 너(SPRING)가 만든 빈(객체/인스턴스)를 주세요. @Autowired
    @Autowired
    private StudentDao studentDao;

    public boolean studentWrite(StudentDto studentDto) {
        boolean result = studentDao.studentWrite(studentDto);
        return result;
    } // f ed

    public ArrayList<StudentDto> studentPrint() {
        ArrayList<StudentDto> result = studentDao.studentPrint();
        return result;
    } // f ed

    public boolean studentUpdate(StudentDto studentDto) {
        boolean result = studentDao.studentUpdate(studentDto);
        return result;
    } // f ed

    public boolean studentDelete(int sno) {
        boolean result = studentDao.studentDelete(sno);
        return result;
    } // f ed
}

package day57task.controller;

import day57task.model.dto.StudentDto;
import day57task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController // 객체(빈) 생성해서 메모리(SPRING 컨테이너) 등록
// 이 클래스의 객체(빈) 은 네(SPRING)가 관리해줘 : IOC
// 이러면 싱글톤이 필요 없어진다.
@RequestMapping("/day57task/Student")
public class StudentController {

    // 너가 만든 클래스의 객체/인스턴스를 주세요.
    @Autowired
    private StudentService studentService;

    @PostMapping("/write")
    public boolean studentWrite(@RequestBody StudentDto studentDto) {
        boolean result = studentService.studentWrite(studentDto);
        return result;
    } // f ed

    @GetMapping("/print")
    public ArrayList<StudentDto> studentPrint() {
        ArrayList<StudentDto> result = studentService.studentPrint();
        return result;
    } // f ed

    @PutMapping("/update")
    public boolean studentUpdate(@RequestBody StudentDto studentDto) {
        boolean result = studentService.studentUpdate(studentDto);
        return result;
    } // f ed

    @DeleteMapping("/delete")
    public boolean studentDelete(@RequestParam int sno) {
        boolean result = studentService.studentDelete(sno);
        return result;
    } // f ed

}

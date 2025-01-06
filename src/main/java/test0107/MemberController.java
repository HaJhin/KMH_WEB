package test0107;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/test0107/test1")
public class MemberController {

    @GetMapping("")
    public ArrayList<MemberDto> print() {
        System.out.println("MemberController.print");
        MemberDto memberDto = new MemberDto(1 , "qwer" , "1234" , "김철수" , "010-3700-6065");
        ArrayList<MemberDto> sampleList = new ArrayList<>();
        sampleList.add(memberDto);
        return sampleList;
    }
    @PostMapping("/register")
    public boolean register(@RequestBody MemberDto memberDto) {
        System.out.println("MemberController.register");
        System.out.println("memberDto = " + memberDto);
        return true;
    } // f ed
    @PostMapping("/logIn")
    public boolean logIn(@RequestBody MemberDto memberDto) {
        System.out.println("MemberController.logIn");
        System.out.println("memberDto = " + memberDto);
        return true;
    }
    @PutMapping("")
    public boolean update(@RequestBody MemberDto memberDto) {
        System.out.println("MemberController.update");
        System.out.println("memberDto = " + memberDto);
        return true;
    }
    @DeleteMapping("")
    public boolean delete(@RequestParam int mno) {
        System.out.println("MemberController.delete");
        System.out.println("mno = " + mno);
        return true;
    }

}

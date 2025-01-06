package todolistMVC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import todolistMVC.model.dao.TodoDao;
import todolistMVC.model.dto.TodoDto;

@RestController // 현재 클래스에 rest api 가 가능한 클래스임을 주입한다.
public class TodoController {

    /*
    @PostMapping // 할 일 작성
    public boolean write (@RequestBody TodoDto todoDto) {
        System.out.println("TodoController.write");
        System.out.println("todoDto = " + todoDto);
        boolean result = TodoDao.getInstance().write(todoDto);
        return result;
    }
    */

} // TodoController ed

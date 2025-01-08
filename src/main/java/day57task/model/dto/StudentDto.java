package day57task.model.dto;

import lombok.*;

@NoArgsConstructor // 디폴트 생성자 주입
@AllArgsConstructor // 모든 매개변수 생성자 주입
@Getter @Setter @ToString // getter,setter,toString 메서드 주입
@Builder // 생성자 대신 객체 만드는 빌더패턴 주입
public class StudentDto {
    private int sno;
    private String sname;
    private int skor;
    private int seng;
    private int smath;
}

package todolistMVC.model.dto;

public class TodoDto {
    // 필드
    private int lno;
    private String lcontent;
    private boolean lstatus;

    // 생성자
    public TodoDto(){}
    public TodoDto(int lno, String lcontent, boolean lstatus) {
        this.lno = lno;
        this.lcontent = lcontent;
        this.lstatus = lstatus;
    }

    /// getter and setter
    public int getLno() {
        return lno;
    }

    public void setLno(int lno) {
        this.lno = lno;
    }

    public String getLcontent() {
        return lcontent;
    }

    public void setLcontent(String lcontent) {
        this.lcontent = lcontent;
    }

    public boolean isLstatus() {
        return lstatus;
    }

    public void setLstatus(boolean lstatus) {
        this.lstatus = lstatus;
    }

    /// toString
    @Override
    public String toString() {
        return "TodoDto{" +
                "lno=" + lno +
                ", lcontent='" + lcontent + '\'' +
                ", lstatus=" + lstatus +
                '}';
    }
} // TodoDto ed

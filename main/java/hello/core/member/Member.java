package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    Member() {
        new Member((long) 0000, "Hong Gil-Dong", Grade.BASIC);
    }
    Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
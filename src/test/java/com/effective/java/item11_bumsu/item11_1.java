package com.effective.java.item11_bumsu;
import org.junit.jupiter.api.Test;
public class item11_1 {
    private int id;
    private String name;

    // 생성자, getter, setter 등 기타 메서드
    @Override
    public boolean equals(Object obj) {
        // 자기 자신과의 비교
        if (this == obj) {
            return true;
        }

        // null 체크 및 클래스 타입 비교
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 형변환 후 필드 비교
        item11_1 other = (item11_1) obj;
        if (id != other.id) {
            return false;
        }

        // String과 같은 참조 타입 필드의 비교
        return (name == null ? other.name == null : name.equals(other.name));
    }



    @Override
    public int hashCode() {
        // hashCode 재정의
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

    //HashCode 작성 요령

package com.itheima.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class student {
    private Integer s_id;

    private String s_name;
    private String s_birth;

    private String s_sex;

    @Override
    public String toString() {
        return "student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_birth='" + s_birth + '\'' +
                ", s_sex='" + s_sex + '\'' +
                '}';
    }
}

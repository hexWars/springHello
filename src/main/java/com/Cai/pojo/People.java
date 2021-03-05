package com.Cai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author Cai
 * @Date 2021-03-05 10:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private Cat cat;
    private Dog dog;
    private String name;
}

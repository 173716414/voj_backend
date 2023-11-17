package com.yupi.voj.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 * @Author：Victor_htq
 * @Package：com.yupi.voj.model.dto.question
 * @Project：voj_backend
 * @name：JudgeCase
 * @Date：2023/11/17 10:36
 * @Filename：JudgeCase
 */
@Data
public class JudgeCase {
    // 输入输出用例
    private String input;

    private String output;
}

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
public class JudgeConfig {
    // 时间限制（ms）
    private Long timeLimit;
    // 内存限制（kb）
    private Long memoryLimit;
    // 堆栈限制（kb）
    private Long stackLimit;
}

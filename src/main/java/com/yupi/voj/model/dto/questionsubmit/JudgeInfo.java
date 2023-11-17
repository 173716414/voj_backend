package com.yupi.voj.model.dto.questionsubmit;

import lombok.Data;

/**
 * 判题信息
 * @Author：Victor_htq
 * @Package：com.yupi.voj.model.dto.question
 * @Project：voj_backend
 * @name：JudgeCase
 * @Date：2023/11/17 10:36
 * @Filename：JudgeCase
 */
@Data
public class JudgeInfo {
    // 程序执行信息
    private String message;
    // 时间消耗（ms）
    private Long time;
    // 内存消耗（kb）
    private Long memory;
}

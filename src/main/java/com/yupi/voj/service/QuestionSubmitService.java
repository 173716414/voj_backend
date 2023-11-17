package com.yupi.voj.service;

import com.yupi.voj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.voj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.voj.model.entity.User;

/**
* @author Victo
* @description 针对表【question_submit(题目提交表)】的数据库操作Service
* @createDate 2023-11-17 10:08:25
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);
}

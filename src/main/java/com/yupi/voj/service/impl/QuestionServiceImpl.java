package com.yupi.voj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.voj.model.entity.Question;
import com.yupi.voj.service.QuestionService;
import com.yupi.voj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Victo
* @description 针对表【question(题目表)】的数据库操作Service实现
* @createDate 2023-11-17 10:07:30
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}





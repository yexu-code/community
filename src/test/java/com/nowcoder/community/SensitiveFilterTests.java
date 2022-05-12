package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveFilterTests {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "这里可以开票、可以吸毒、可以嫖娼、可以赌博，哈哈哈!";
        text = sensitiveFilter.filter(text);
        System.out.println(text);

        text = "这里可以☆开☆票☆、可以吸☆☆毒☆、可以☆嫖☆娼、可以☆赌☆博☆，哈哈哈!";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
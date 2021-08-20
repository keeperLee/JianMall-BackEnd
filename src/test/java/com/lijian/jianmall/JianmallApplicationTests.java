package com.lijian.jianmall;

//import org.junit.jupiter.api.Test;
import com.lijian.jianmall.dao.CategoryMapper;
import com.lijian.jianmall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JianmallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void contextLoads() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryByIdTest() {
        Category category = categoryMapper.queryById(100001);
        System.out.println(category.toString());
    }
}

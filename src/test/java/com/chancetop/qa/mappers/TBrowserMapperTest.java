//package com.chancetop.qa.mappers;
//
//import com.chancetop.qa.examples.TBrowserExample;
//import com.chancetop.qa.model.TBrowser;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
///**
// * @author: zw.wen
// */
//@SpringBootTest
//@Slf4j
//public class TBrowserMapperTest {
//    @Autowired
//    TBrowserMapper tBrowserMapper;
//
//    @Test
//    public void testSelect(){
//        TBrowserExample tb = new TBrowserExample().createCriteria().andBrowserNameEqualTo("chrome").example();
//        TBrowser tBrowser = tBrowserMapper.selectByExample(tb).get(0);
//        log.info(tBrowser.getBrowserName());
//
//    }
//}

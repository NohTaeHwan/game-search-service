package com.toy.search.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Generator {

    public static void main(String [] args) throws Exception{

        System.out.println("Generator starts");

        //MBG 실행 중 경고 메시지
        List<String> warnings = new ArrayList<String>();
        //생성된 코드가 중복될 경우 원코드를 덮어쓰기
        boolean overwrite = true;

        //MBG 설정 파일 읽기
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);

        //MBG(DB용 model, mapper) 생성
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
        //코드생성 실행
        myBatisGenerator.generate(null);

/*

        //공통코드용 상수 생성(sys_common_code 테이블 내용으로 com.lom.mall.common.Constant 생성)
        JavaConstantGenerator javaConstantGenerator = new JavaConstantGenerator(config, callback, warnings);
        //코드생성 실행
        javaConstantGenerator.generate();

        //공통코드용 상수 생성(sys_common_code 테이블 내용으로 mall-front-web/src/utils/common_code.json 생성)
        JsConstantGenerator jsConstantGenerator = new JsConstantGenerator(config, callback, warnings);
        //코드생성 실행
        jsConstantGenerator.generate();


        //메세지용 상수 생성(sys_common_message 테이블 내용으로 com.lom.mall.common.Message 생성)
        JavaMessageGenerator javaMessageGenerator = new JavaMessageGenerator(config, callback, warnings);
        //코드생성 실행
        javaMessageGenerator.generate();

        //메세지용 상수 생성(sys_common_message 테이블 내용으로 mall-front-web/src/utils/common_message.json 생성)
        JsMessageGenerator jsMessageGenerator = new JsMessageGenerator(config, callback, warnings);
        //코드생성 실행
        jsMessageGenerator.generate();
*/

        //경고메시지 출력
        for (String warning : warnings) {
            System.out.println(warning);
        }


    }
}

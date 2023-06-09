package com.imooc.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class MPDBConfig {

    public static void main(String[] args) {

        generate();

//        // 代码生成器
//        AutoGenerator autoGenerator = new AutoGenerator();
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setAuthor("pzg");      // 设置作者
//        gc.setFileOverride(true);      // 多次生成是否覆盖之前的
//        gc.setActiveRecord(true);      // 设置是否开启AR模式
////        gc.setIdType(IdType.ASSIGN_ID);      // 设置主键策略
//        gc.setServiceName("%sService");      // 设置service名称，默认为IxxxService，去掉I
//        gc.setBaseResultMap(true);          // 生成的mapper.xml中包含基本的ResultMap结果集
//        gc.setBaseColumnList(true);         // 生成基本的sql查询片段
//        gc.setOpen(false);
//        // gc.setSwagger2(true); 实体属性 Swagger2 注解
//        autoGenerator.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setUrl("jdbc:mysql://10.40.0.246:13306/macaque?useUnicode=true&useSSL=false&characterEncoding=utf8");
//        // dsc.setSchemaName("public");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword(".05P@ssw0rd");
//
//        autoGenerator.setDataSource(dsc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setCapitalMode(true);      // 开启全局大小写(true: 大写)
//        strategy.setNaming(NamingStrategy.underline_to_camel);          // 下划线转驼峰命名
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);    // 下划线转驼峰命名
//        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
//        strategy.setInclude("stu");
//        strategy.setInclude("users");
//        strategy.setInclude("admin");
//        strategy.setInclude("company");
//        strategy.setInclude("industry");
//        strategy.setInclude("data_dictionary");
//        strategy.setInclude("company_photo");
//        strategy.setInclude("resume");
//        strategy.setInclude("resume_education");
//        strategy.setInclude("resume_project_exp");
//        strategy.setInclude("resume_work_exp");
//        strategy.setInclude("sys_params");
//        strategy.setInclude("job_type");
//        strategy.setInclude("resume_expect");
//        strategy.setInclude("job");
//        strategy.setInclude("hr_collect_resume");
//        strategy.setInclude("article");
//        strategy.setInclude("chat_message");
//        strategy.setInclude("interview");
//        strategy.setInclude("orders");
//        strategy.setInclude("lock_basic_info");
//
//
//        autoGenerator.setStrategy(strategy);
//
//        // 包名策略配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.fri");
//        pc.setEntity("pojo");
//        pc.setMapper("mapper");
//        pc.setXml("mapper.xml");
//        pc.setService("service");
//        pc.setServiceImpl("service.impl");
////        pc.setController(null);
//        autoGenerator.setPackageInfo(pc);
//
//        // 执行逆向生成
//        autoGenerator.execute();
    }

    private static void generate() {
        FastAutoGenerator.create("jdbc:mysql://10.40.0.246:13306/jypt?useUnicode=true&useSSL=false&characterEncoding=utf8", "root", ".05P@ssw0rd")
                .globalConfig(builder -> {
                    builder.author("pzg") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://"); // 指定输出目录
                })
                .strategyConfig(
                        builder -> {
                            builder.mapperBuilder()
                                    .enableBaseResultMap()
                                    .enableBaseColumnList()
                                    .build();
                        })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("") // 设置父包名
                            .moduleName("mqtt") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("mqtt_location"); // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}

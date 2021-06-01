# bootBase
Spring Boot基础项目

## 要点：
### 1.使用Maven
	POM配置参考项目pom.xml及网上文档
#### 常用命令
	运行项目 mvn spring-boot:run
	打包项目  mvn package
	运行已打包的jar  java -jar [jar文件路径]

### 2.使用mybatisPlus：https://www.cnblogs.com/liuyj-top/p/12976396.html
	数据库等配置文件 resources\application.yml
	
	自动创建对应的mapper文件 \conf\GeneratorCodeConfig.java运行后输入表名，可自动创建对应的mapper等文件
	
	分页类工具 \conf\MybatisPlusConfig.java
	
	返回结果封装类 \conf\ResultInfo.java
	状态枚举类 \conf\Status.java

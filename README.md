# lombokdemo
## springmvc+Slf4j+lombok

### Lombok 简介：lombok 以简单的注解的形式来精简 java 代码，提升开发人员生产效率的辅助工具

### lombok 安装：

(1) 方法一：双击下载下来的 JAR包安装 lombok
    安装目录为eclipse安装路径，安装完成后，查看eclipse.ini 是否出现配置：
    
	-Xbootclasspath/a:lombok.jar	
	-javaagent:lombok.jar
		
(2) 方法二：eclipse 手动安装 lombok
    a. 将 lombok.jar 复制到eclipse.ini 所在的文件夹目录下
    b. 打开 eclipse.ini，在最后面插入以下两行并保存：
    
        -Xbootclasspath/a:lombok.jar
         -javaagent:lombok.jar
    c.重启 eclipse
    
### Maven添加依赖

	<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.16.10</version>
    </dependency>
	</dependencies>		
### lombok 注解
#### Lombok 注解在线帮助文档：http://projectlombok.org/features/index
***@Data：注解在类上；自动为所有字段添加@ToString, @EqualsAndHashCode, @Getter方法，为非final字段添加@Setter,和@RequiredArgsConstructor	***
***@Setter/@Gette：注解在属性上；为属性提供 setting/getting 方法(自动生成Getter/Setter方法)***
***@Log4j：注解在类上；为类提供一个 属性名为log 的 log4j 日志对象***
***@Slf4j：注解在类上；为类提供一个 属性名为log 的 log4j 日志对象***
***@NoArgsConstructor：注解在类上；为类提供一个无参的构造方法***
***@AllArgsConstructor：注解在类上；为类提供一个全参的构造方法***
***@NonNull : 注解在属性上，用来校验参数（可以帮助我们避免空指针）***
     
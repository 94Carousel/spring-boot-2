#####spring boot 配置详解

- 使用@ConfigurationProperties注解方式
- 自定义配置文件：使用@ConfigurationProperties+@PropertySource注解
- 使用@Value注解
- 使用Environment方式
- 使用PropertiesLoaderUtils方式
- dev test prod不同环境配置文件切换

##### 注意配置文件编码 最好用IDEA 设置File Encoding = UTF-8 否则中文会乱码
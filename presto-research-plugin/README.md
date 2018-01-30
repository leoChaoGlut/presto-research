## Plugin 及 UDF
### 开发步骤
- pom.xml 中填加
    - dependencies 
        - com.facebook.presto:presto-spi
    - build plugin
        - com.facebook.presto:presto-maven-plugin
- 任意 com.facebook.presto.spi.Plugin 的实现类

### 部署步骤
- mvn package
- 将 jar 包放至 presto-server 配置的 plugin.config-dir 的路径下
### 其它
- [presto plugin developer guide](https://prestodb.io/docs/current/develop.html)

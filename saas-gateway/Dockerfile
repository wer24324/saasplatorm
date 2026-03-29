# 基础镜像
FROM openjdk:17-oracle
# author
MAINTAINER audit

# 挂载目录
VOLUME /home/audit
# 创建目录
RUN mkdir -p /home/audit
# 指定路径
WORKDIR /home/audit
# 复制jar文件到路径
COPY ./target/saas-gateway.jar /home/audit/saas-gateway.jar

# 启动网关服务
ENTRYPOINT ["java","-jar","saas-gateway.jar"]

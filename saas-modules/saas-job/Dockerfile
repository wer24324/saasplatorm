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
COPY ./target/saas-modules-job.jar /home/audit/saas-modules-job.jar

# 启动定时任务服务
ENTRYPOINT ["java","-jar","saas-modules-job.jar"]

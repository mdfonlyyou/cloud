# 基于java镜像
FROM java:8
# 挂载本地/tmp文件夹到容器
VOLUME /tmp
# 拷贝文件到容器
ADD service-charger.jar app.jar
RUN bash -c 'touch /app.jar'
# 开放端口
EXPOSE 9100
# 执行命令
ENTRYPOINT ["java", "-jar", "/app.jar"]
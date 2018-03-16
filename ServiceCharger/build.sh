# 更新
git pull
# 编译jar包
mvn clean package
# 编译镜像
# mvn clean package docker:build
cp ./src/main/docker/Dockerfile ./target/
docker-compose up -d
docker-compose ps
docker-compose logs > ./service-charger.log
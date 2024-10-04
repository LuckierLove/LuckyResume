group = "love.luckier"
version = "1.0-SNAPSHOT"

allprojects{
    repositories {
        maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
        maven("https://mirrors.tencent.com/nexus/repository/gradle-plugins/")
        mavenCentral()
    }
}
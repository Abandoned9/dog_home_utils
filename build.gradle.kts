plugins {
    val kotlinVersion = "1.5.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.8.0-M1"
}

group = "com.dimitri"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/repository/central")
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.0")
    implementation("com.fasterxml.jackson.core:jackson-core:2.13.0")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.0")
    implementation("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
    implementation("javax.activation:activation:1.1.1")
    // https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")
    // HikariCP 数据库连接池
    implementation("com.zaxxer:HikariCP:5.0.0")
    implementation("org.mybatis:mybatis:3.5.7")
    implementation("org.mariadb.jdbc:mariadb-java-client:2.7.4")
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.22")
}

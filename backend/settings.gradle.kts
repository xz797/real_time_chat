pluginManagement {
    repositories {
        // --- 1. 优先使用阿里云镜像（加速 Gradle 插件下载） ---
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }

        // --- 2. 官方源兜底（阿里云找不到的再去官方找） ---
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // --- 3. 优先使用阿里云镜像（加速项目依赖库下载） ---
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }

        // --- 4. 官方源兜底 ---
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("ktorLibs").from("io.ktor:ktor-version-catalog:3.6.1")
    }
}

// 你的项目名称
rootProject.name = "real_time_chat"
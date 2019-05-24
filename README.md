# huge

[![License](https://img.shields.io/badge/License%20-Apache%202-337ab7.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![JCenter](https://img.shields.io/badge/%20JCenter%20-1.0.0-5bc0de.svg)](https://bintray.com/haowen/maven/huge-plugin/1.0.0)
[![MinSdk](https://img.shields.io/badge/%20MinSdk%20-%2014+%20-f0ad4e.svg)](https://android-arsenal.com/api?level=14)

在[hugo](https://github.com/JakeWharton/hugo)基础上修改了一下日志的级别(Verbose => Debug)

## 依赖
project下的build.gradle添加：
```
classpath 'com.haowen.huge:huge-plugin:1.0.0'
```
module下的build.gradle添加：
```
android {
    ...
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
```

## 使用

需要调试的方法上加上DebugLog注解：
```
@DebugLog
private String append(String... args) {
    ...
}
```
Logcat日志输出结果：
```
D/MainActivity: ⇢ append(args=["窗前明月光", "，", "疑似地上霜", "。"])
D/MainActivity: ⇠ append [16ms] = "窗前明月光，疑似地上霜。"
```

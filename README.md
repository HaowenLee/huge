# huge

在[hugo](https://github.com/JakeWharton/hugo)基础上修改了一下日志的级别(Verbose => Debug)

## 依赖
project下的build.gradle添加：
```
classpath 'com.haowen.huge:huge-plugin:1.0.0'
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
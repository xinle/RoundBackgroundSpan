# RoundBackgroundSpan

[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Download](https://api.bintray.com/packages/xinle/maven/RoundBackgroundSpan/images/download.svg) ](https://bintray.com/xinle/maven/RoundBackgroundSpan/_latestVersion)

1.0 帮助你快速实现在一个文本控件中插入带背景或者边框的文本,可以方便的定义背景的颜色文字颜色,圆角度,距离文本控件的相对位置和文本和背景之间的padding

## Screenshot

![](https://github.com/xinle/RoundBackgroundSpan/blob/master/Screenshot/Screenshot_1514302739.png)

## 使用

```java
compile 'com.lelive:SpiralProgressView:#lastVersion#'
```


## 范例

- 定义纯色背景

```java
RoundedBackgroundSpan backSpan = new RoundedBackgroundSpan(Color.parseColor("#E95C37"), Color.WHITE, dp2px(this, 20));
backSpan.leftMargin = dp2px(this, 16);
backSpan.rightMargin = dp2px(this, 2);
backSpan.topMargin = -dp2px(this, 4);
backSpan.leftPadding = dp2px(this ,10);
backSpan.rightPadding = dp2px(this ,10);
backSpan.topPadding = dp2px(this ,2);
backSpan.bottomPadding = dp2px(this,2);
```

- 定义边框背景

```java
RoundedBackgroundSpan backSpan = new RoundedBackgroundSpan(Color.parseColor("#E95C37"), Color.WHITE, dp2px(this, 5));
backSpan.leftMargin = dp2px(this, 16);
backSpan.rightMargin = dp2px(this, 2);
backSpan.topMargin = -dp2px(this, 8);
backSpan.leftPadding = dp2px(this ,4);
backSpan.rightPadding = dp2px(this ,4);
backSpan.topPadding = dp2px(this ,4);
backSpan.bottomPadding = dp2px(this,4);
```
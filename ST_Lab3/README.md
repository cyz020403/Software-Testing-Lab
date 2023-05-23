# 山东大学软件学院软件测试课程实验报告

## 一、前言

### 1.1 个人信息

- 学号：
- 姓名：
- 班级：

### 1.2 实验基本信息

本次实验报告是山东大学软件学院软件测试课程第三次实验——“ JUnit 单元测试”的实验报告。

本次实验代码已开源至 GitHub，链接为：https://github.com/cyz020403/Software-Testing-Lab。

#### 1.2.1 实验题目

根据实验要求，选择题目一进行实验，题目描述为：

使用 JUnit 对 lowerCase() 方法进行单元测试，代码如下：

```java
public static String lowerCase(String str) {
    return str == null ? null : str.toLowerCase();
}
```

#### 1.2.2 实验学时

4学时。

#### 1.2.3 实验日期

2023/4/23。

#### 1.2.4 实验内容

对给出的一段代码，使用JUnit输入展开单元测试。 

1. 确定单元测试方案与实施步骤；
2. 生成单元测试代码；
3. 执行单元测试，并形成单元测试结果；

编写单元测试报告。

#### 1.2.5 实验目的

通过完成实验题目，学习单元测试相关知识，并通过实现题目要求的功能，加深对单元测试的理解。

### 1.3 实验环境

#### 1.3.1 硬件环境

- PC: Dell Precision 3640 Tower
- CPU: lntel(R) Core(TM) i9-10900K CPU @ 3.70 GHz
- 内存: 64 G
- 磁盘: Micron 2300 NVMe 1024 GB（SSD）
- GPU: NVIDIA GeForce RTX 3090

#### 1.3.2 软件环境

- Windows 11 22H2
- IntelliJ IDEA
- OpenJDK 20.0.1

## 二、实验步骤与内容

### 2.1 问题重述

本次实验使用 JUnit 完成对示例方法 `lowerCase` 的单元测试，测试的代码为：

```java
public static String lowerCase(String str) {
    return str == null ? null : str.toLowerCase();
}
```

实验要求为：

1. 确定单元测试方案与实施步骤；
2. 生成单元测试代码；
3. 执行单元测试，并形成单元测试结果。

### 2.2 代码解释

`lowerCase` 是一个静态方法，接受一个字符串参数 `str`。它的作用是将传入的字符串转换为小写字母形式。

方法中有一个三元运算符 `?:` 表示条件表达式，它的含义是：如果 `str` 为 `null`，则返回 `null`，否则调用 `toLowerCase()` 方法将 `str` 转换为小写字母形式并返回。

综上，这个方法简单地检查输入是否为空，然后将非空输入转换为小写字母形式，并返回结果。

### 2.3 单元测试

根据实验要求，测试过程分为三个部分。

#### 2.3.1 确定单元测试方案与实施步骤

单元测试是一种测试软件中最小可测试单元的方法。在 Java 中，JUnit 是一个流行的单元测试框架。下面是单元测试的步骤：

1. 确定需要测试的方法和函数，如本题中的 `lowerCase` 方法。
2. 在 IDEA 中使用 “Generate” 生成一个测试类，并在该类中创建测试方法。测试方法应该以 `@org.junit.jupiter.api.Test` 注解开头，并测试方法的名称应该描述要测试的行为。
3. 在测试方法中，创建一个输入值，并调用要测试的方法。然后使用断言语句来检查方法返回值是否与期望值相同。
4. 使用 JUnit 运行测试类。
5. 分析测试结果。如果测试失败，修复代码并重新运行测试。

#### 2.3.2 生成单元测试代码

使用 “Generate” 中的 “Test” 生成测试方法之后，得到以下代码框架：

```java
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @org.junit.jupiter.api.Test
    void lowerCase() {
      
    }
}
```

在生成得到的测试方法中，使用 JUnit 提供的断言方法 `assertEquals` 来验证被测试方法的行为是否符合预期。具体来说，测试了以下几种情况：

1. 当输入参数为 null 时，被测试方法应该返回 null。
2. 当输入参数为空字符串时，被测试方法应该返回空字符串。
3. 当输入参数为全大写字符串时，被测试方法应该返回全小写字符串。
4. 当输入参数为全小写字符串时，被测试方法应该返回全小写字符串。
5. 当输入参数为带有数字和特殊字符的字符串时，被测试方法应该返回去除大小写后的字符串。

在测试方法中，使用 `assertEquals` 方法来比较被测试方法的返回值和预期值是否相同。如果相同，则测试通过；如果不同，则测试失败。JUnit 在测试运行时会自动记录测试结果，并将其显示在测试运行视图中。

下面是示例方法 `lowerCase` 的单元测试代码示例：

```java
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @org.junit.jupiter.api.Test
    void lowerCase() {
        // 测试 null 值
        assertEquals(null, MyClass.lowerCase(null));

        // 测试空字符串
        assertEquals("", MyClass.lowerCase(""));

        // 测试所有大写字符串
        assertEquals("hello", MyClass.lowerCase("HELLO"));

        // 测试所有小写字符串
        assertEquals("hello", MyClass.lowerCase("hello"));

        // 测试带有数字和特殊字符的字符串
        assertEquals("hello world", MyClass.lowerCase("Hello World"));

        System.out.println("Done!");
    }
}
```

#### 2.3.3 执行单元测试，并形成单元测试结果

在 IDEA 中，运行测试类，如下图所示，完成了测试并没有报错，可见测试成功，没有发现错误。

<img src="./assets/%E6%88%AA%E5%B1%8F2023-04-27%2023.42.03.png" alt="截屏2023-04-27 23.42.03" style="zoom:50%;" />

## 三、结论分析与体会

1. 这次实验相对之前的实验内容较少，但是单元测试往往对于项目开发十分有帮助。
1. 经过此次实验，我进一步加深了对单元测试的认识，学习了具体的 JUnit 使用方法。

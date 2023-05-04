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
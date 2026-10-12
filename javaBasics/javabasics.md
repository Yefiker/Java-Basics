# Java — Syntax & Basics

Covered the core building blocks of Java, transitioning from JavaScript and Python into a strongly-typed environment.

## 1. Variables & Types

Java is strictly typed; every variable requires an explicit data type.

```java
int age = 21;
double pi = 3.14;
boolean isActive = true;
String name = "Sosi";

```

## 2. Console Output

```java
System.out.println("Hello, World!");

```

## 3. Control Flow

Standard conditional and loop syntax matches JS/C++:

```java
if (score > 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}

for (int i = 0; i < 3; i++) {
    // loop body
}

```

## 4. Arrays vs. ArrayList

- **Fixed Array:** `int[] nums = {1, 2, 3};` (size cannot change)
- **Dynamic ArrayList:** `ArrayList<String> list = new ArrayList<>();` (requires `import java.util.ArrayList;`)

## 5. Methods

Methods require explicit return types and must live inside a class.

```java
public static int findMax(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > max) max = nums[i];
    }
    return max;
}

```

    
    Назовите основные принципы ООП. Расскажите подробно о каждом

Основные принципы объектно-ориентированного программирования (ООП) в Java включают следующие ключевые концепции:

### 1. Абстракция

Абстракция позволяет сосредоточиться на наиболее значимых аспектах объекта, игнорируя несущественные детали. Она используется для представления общих характеристик и поведения объектов в виде классов. Например, когда мы создаем класс Animal, нам важно определить общие черты всех животных, такие как способность двигаться и издавать звуки, а конкретные особенности каждого вида животных будут определены в подклассах.

Пример:
public abstract class Animal {
public abstract void makeSound();
}
Здесь класс Animal определяет общий метод makeSound(), который будет реализован в конкретных подклассах, таких как Dog или Cat.

---

### 2. Инкапсуляция

Инкапсуляция предполагает сокрытие внутренней структуры объекта и предоставление контролируемого доступа к его состоянию. В Java это достигается путем объявления переменных-членов класса приватными и предоставления публичных методов для работы с ними.

Пример:
public class Account {
private double balance;

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
Здесь данные balance защищены приватной областью видимости, и доступ к ним возможен только через публичные методы getBalance(), deposit() и withdraw().

---

### 3. Наследование

Наследование позволяет создавать новые классы на основе существующих, используя их функциональность и добавляя новую. Подкласс наследует все члены суперкласса, включая методы и поля, что позволяет повторно использовать существующий код.

Пример:
public class Person {
protected String name;

    public Person(String name) {
        this.name = name;
    }
    
    public void displayName() {
        System.out.println("Name: " + name);
    }
}

public class Student extends Person {
private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
    
    public void displayInfo() {
        displayName(); // Используем метод из родительского класса
        System.out.println("Student ID: " + studentId);
    }
}
Здесь класс Student наследуется от класса Person и добавляет новое поле studentId и метод displayInfo(), одновременно используя методы родительского класса.

---

### 4. Полиморфизм

Полиморфизм позволяет объектам иметь разные формы и поведение в зависимости от контекста. В Java полиморфизм реализуется через переопределение методов и использование ссылок на суперкласс для обращения к объектам подклассов.

Пример:
public class Shape {
public void draw() {
System.out.println("Drawing a shape");
}
}

public class Circle extends Shape {
@Override
public void draw() {
System.out.println("Drawing a circle");
}
}

public class Square extends Shape {
@Override
public void draw() {
System.out.println("Drawing a square");
}
}

public class Main {
public static void main(String[] args) {
Shape shape1 = new Circle();
Shape shape2 = new Square();

        shape1.draw(); // Output: Drawing a circle
        shape2.draw(); // Output: Drawing a square
    }
}
Здесь объекты различных форм (круг и квадрат) используют один и тот же интерфейс метода draw(), обеспечивая разный результат в зависимости от конкретного типа объекта.

---

Заключение

Эти четыре принципа составляют основу объектно-ориентированного подхода в Java, позволяют создавать структурированные, легко поддерживае